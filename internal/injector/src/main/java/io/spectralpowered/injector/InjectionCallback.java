package io.spectralpowered.injector;

public class InjectionCallback {

    private final boolean cancellable;

    private boolean cancelled;
    private Object returnValue;
    private boolean returnValueSet;

    public InjectionCallback(boolean cancellable) {
        this.cancellable = cancellable;
    }

    public InjectionCallback(boolean cancellable, Object returnValue) {
        this.cancellable = cancellable;
        this.returnValue = returnValue;
        returnValueSet = true;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        if (cancelled && !cancellable) throw new IllegalArgumentException("Cannot cancel a non-cancellable callback");
        this.cancelled = cancelled;
    }

    public boolean isCancellable() {
        return cancellable;
    }

    public Object getReturnValue() {
        if (!returnValueSet) throw new IllegalStateException("Return value not set");
        return returnValue;
    }

    public <T> T castReturnValue() {
        return (T) getReturnValue();
    }

    public void setReturnValue(Object returnValue) {
        this.returnValue = returnValue;
        setCancelled(true);
        returnValueSet = true;
    }

}
