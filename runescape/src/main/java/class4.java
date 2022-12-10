import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class class4 implements class162, MouseWheelListener {
	int field29;

	class4() {
		this.field29 = 0;
	}

	void method29(Component var1) {
		var1.addMouseWheelListener(this);
	}

	void method33(Component var1) {
		var1.removeMouseWheelListener(this);
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		this.field29 += var1.getWheelRotation();
	}

	public synchronized int method2743() {
		int var2 = this.field29;
		this.field29 = 0;
		return var2;
	}
}
