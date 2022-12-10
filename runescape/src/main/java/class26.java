import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class class26 extends Canvas {
	static byte[][][] field141;
	Component field139;

	class26(Component var1) {
		this.field139 = var1;
	}

	public final void update(Graphics var1) {
		this.field139.update(var1);
	}

	public final void paint(Graphics var1) {
		this.field139.paint(var1);
	}
}
