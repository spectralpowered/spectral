import io.spectralpowered.ObfInfo;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@ObfInfo(
	name = "ab"
)
public class class466 implements MouseListener, MouseMotionListener, FocusListener {
	@ObfInfo(
		owner = "ab",
		name = "m",
		desc = "Lab;"
	)
	public static class466 field3857;
	@ObfInfo(
		owner = "ab",
		name = "x",
		desc = "I"
	)
	public static int field3858;
	@ObfInfo(
		owner = "ab",
		name = "j",
		desc = "I"
	)
	public static int field3862;
	@ObfInfo(
		owner = "ab",
		name = "g",
		desc = "I"
	)
	public static int field3863;
	@ObfInfo(
		owner = "ab",
		name = "t",
		desc = "I"
	)
	public static int field3867;
	@ObfInfo(
		owner = "ab",
		name = "s",
		desc = "I"
	)
	public static int field3869;
	@ObfInfo(
		owner = "ab",
		name = "l",
		desc = "I"
	)
	public static int field3870;
	@ObfInfo(
		owner = "ab",
		name = "c",
		desc = "J"
	)
	public static long field3855;
	@ObfInfo(
		owner = "ab",
		name = "i",
		desc = "J"
	)
	public static long field3865;
	@ObfInfo(
		owner = "ab",
		name = "f",
		desc = "I"
	)
	public static volatile int field3856;
	@ObfInfo(
		owner = "ab",
		name = "r",
		desc = "I"
	)
	public static volatile int field3859;
	@ObfInfo(
		owner = "ab",
		name = "u",
		desc = "I"
	)
	public static volatile int field3860;
	@ObfInfo(
		owner = "ab",
		name = "n",
		desc = "I"
	)
	public static volatile int field3864;
	@ObfInfo(
		owner = "ab",
		name = "o",
		desc = "I"
	)
	public static volatile int field3866;
	@ObfInfo(
		owner = "ab",
		name = "q",
		desc = "I"
	)
	public static volatile int field3871;
	@ObfInfo(
		owner = "ab",
		name = "k",
		desc = "I"
	)
	public static volatile int field3873;
	@ObfInfo(
		owner = "ab",
		name = "b",
		desc = "J"
	)
	public static volatile long field3861;
	@ObfInfo(
		owner = "ab",
		name = "a",
		desc = "J"
	)
	public static volatile long field3868;
	@ObfInfo(
		owner = "ab",
		name = "pr",
		desc = "[Lkd;"
	)
	static class120[] field3875;
	@ObfInfo(
		owner = "ab",
		name = "ih",
		desc = "[Lrx;"
	)
	static class266[] field3874;
	@ObfInfo(
		owner = "ab",
		name = "nb",
		desc = "I"
	)
	static int field3872;

	static {
		field3857 = new class466();
		field3871 = 0;
		field3856 = 0;
		field3859 = -1;
		field3860 = -1;
		field3861 = -1L;
		field3862 = 0;
		field3863 = 0;
		field3858 = 0;
		field3865 = 0L;
		field3866 = 0;
		field3864 = 0;
		field3873 = 0;
		field3868 = 0L;
		field3869 = 0;
		field3870 = 0;
		field3867 = 0;
		field3855 = 0L;
	}

	@ObfInfo(
		owner = "ab",
		name = "<init>",
		desc = "()V"
	)
	class466() {
	}

	@ObfInfo(
		owner = "ab",
		name = "v",
		desc = "(Ljava/awt/event/MouseEvent;B)I"
	)
	final int method2280(MouseEvent var1) {
		int var3 = var1.getButton();
		if (!var1.isAltDown() && var3 != 2) {
			return !var1.isMetaDown() && var3 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	@ObfInfo(
		owner = "ab",
		name = "mousePressed",
		desc = "(Ljava/awt/event/MouseEvent;)V"
	)
	public final synchronized void mousePressed(MouseEvent var1) {
		if (null != field3857) {
			field3871 = 0;
			field3864 = var1.getX();
			field3873 = var1.getY();
			field3868 = class152.method711();
			field3866 = this.method2280(var1);
			if (field3866 != 0) {
				field3856 = field3866;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	@ObfInfo(
		owner = "ab",
		name = "mouseReleased",
		desc = "(Ljava/awt/event/MouseEvent;)V"
	)
	public final synchronized void mouseReleased(MouseEvent var1) {
		if (field3857 != null) {
			field3871 = 0;
			field3856 = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	@ObfInfo(
		owner = "ab",
		name = "mouseClicked",
		desc = "(Ljava/awt/event/MouseEvent;)V"
	)
	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	@ObfInfo(
		owner = "ab",
		name = "mouseEntered",
		desc = "(Ljava/awt/event/MouseEvent;)V"
	)
	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	@ObfInfo(
		owner = "ab",
		name = "mouseExited",
		desc = "(Ljava/awt/event/MouseEvent;)V"
	)
	public final synchronized void mouseExited(MouseEvent var1) {
		if (null != field3857) {
			field3871 = 0;
			field3859 = -1;
			field3860 = -1;
			field3861 = var1.getWhen();
		}

	}

	@ObfInfo(
		owner = "ab",
		name = "mouseDragged",
		desc = "(Ljava/awt/event/MouseEvent;)V"
	)
	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	@ObfInfo(
		owner = "ab",
		name = "mouseMoved",
		desc = "(Ljava/awt/event/MouseEvent;)V"
	)
	public final synchronized void mouseMoved(MouseEvent var1) {
		if (null != field3857) {
			field3871 = 0;
			field3859 = var1.getX();
			field3860 = var1.getY();
			field3861 = var1.getWhen();
		}

	}

	@ObfInfo(
		owner = "ab",
		name = "focusGained",
		desc = "(Ljava/awt/event/FocusEvent;)V"
	)
	public final void focusGained(FocusEvent var1) {
	}

	@ObfInfo(
		owner = "ab",
		name = "focusLost",
		desc = "(Ljava/awt/event/FocusEvent;)V"
	)
	public final synchronized void focusLost(FocusEvent var1) {
		if (field3857 != null) {
			field3856 = 0;
		}

	}

	@ObfInfo(
		owner = "ab",
		name = "n",
		desc = "(IIIIB)I"
	)
	static final int method2281(int var0, int var1, int var2, int var3) {
		int var5 = 65536 - class341.field2744[var2 * 1024 / var3] >> 1;
		return (var0 * (65536 - var5) >> 16) + (var5 * var1 >> 16);
	}
}
