package io.spectralpowered.mixin.annotation.injection.callback;

public class CallbackInfo {

    CallbackInfo() {
    }

    public final boolean isCancellable() {
        return true;
    }

    public final boolean isCancelled() {
        return false;
    }

    public void cancel() {
    }

}
