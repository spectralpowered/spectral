import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class class28 implements MouseListener, MouseMotionListener, FocusListener {
	public static class28 field152;
	public static int field153;
	public static int field157;
	public static int field158;
	public static int field162;
	public static int field165;
	public static int field166;
	public static long field148;
	public static long field160;
	public static volatile int field151;
	public static volatile int field154;
	public static volatile int field155;
	public static volatile int field159;
	public static volatile int field161;
	public static volatile int field168;
	public static volatile int field170;
	public static volatile long field156;
	public static volatile long field164;
	static class290[] field173;
	static class491[] field172;
	static int field169;

	static {
		field152 = new class28();
		field168 = 0;
		field151 = 0;
		field154 = -1;
		field155 = -1;
		field156 = -1L;
		field157 = 0;
		field158 = 0;
		field153 = 0;
		field160 = 0L;
		field161 = 0;
		field159 = 0;
		field170 = 0;
		field164 = 0L;
		field165 = 0;
		field166 = 0;
		field162 = 0;
		field148 = 0L;
	}

	class28() {
	}

	static void method2085(Component var0) {
		var0.removeMouseListener(field152);
		var0.removeMouseMotionListener(field152);
		var0.removeFocusListener(field152);
		field151 = 0;
	}

	public static void method1949(int var0) {
		field168 = var0;
	}

	final int method401(MouseEvent var1) {
		int var3 = var1.getButton();
		if (!var1.isAltDown() && var3 != 2) {
			return !var1.isMetaDown() && var3 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	public final synchronized void mousePressed(MouseEvent var1) {
		if (null != field152) {
			field168 = 0;
			field159 = var1.getX();
			field170 = var1.getY();
			field164 = class74.method1493();
			field161 = this.method401(var1);
			if (field161 != 0) {
				field151 = field161;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (field152 != null) {
			field168 = 0;
			field151 = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void mouseExited(MouseEvent var1) {
		if (null != field152) {
			field168 = 0;
			field154 = -1;
			field155 = -1;
			field156 = var1.getWhen();
		}

	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (null != field152) {
			field168 = 0;
			field154 = var1.getX();
			field155 = var1.getY();
			field156 = var1.getWhen();
		}

	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (field152 != null) {
			field151 = 0;
		}

	}
}
