import io.spectralpowered.ObfInfo;
import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfInfo(
	name = "d"
)
public final class class390 implements class217, MouseWheelListener {
	@ObfInfo(
		owner = "d",
		name = "h",
		desc = "I"
	)
	int field3278;

	@ObfInfo(
		owner = "d",
		name = "<init>",
		desc = "()V"
	)
	class390() {
		this.field3278 = 0;
	}

	@ObfInfo(
		owner = "d",
		name = "h",
		desc = "(Ljava/awt/Component;B)V"
	)
	void method1913(Component var1) {
		var1.addMouseWheelListener(this);
	}

	@ObfInfo(
		owner = "d",
		name = "e",
		desc = "(Ljava/awt/Component;I)V"
	)
	void method1914(Component var1) {
		var1.removeMouseWheelListener(this);
	}

	@ObfInfo(
		owner = "d",
		name = "mouseWheelMoved",
		desc = "(Ljava/awt/event/MouseWheelEvent;)V"
	)
	public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		this.field3278 += var1.getWheelRotation();
	}

	@ObfInfo(
		owner = "d",
		name = "v",
		desc = "(I)I"
	)
	public synchronized int method962() {
		int var2 = this.field3278;
		this.field3278 = 0;
		return var2;
	}
}
