import io.spectralpowered.ObfInfo;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@ObfInfo(
	name = "as"
)
public class class433 implements KeyListener, FocusListener {
	@ObfInfo(
		owner = "as",
		name = "m",
		desc = "[Z"
	)
	boolean[] field3595;
	@ObfInfo(
		owner = "as",
		name = "x",
		desc = "[Lav;"
	)
	class310[] field3592;
	@ObfInfo(
		owner = "as",
		name = "e",
		desc = "Ljava/util/Collection;"
	)
	Collection field3593;
	@ObfInfo(
		owner = "as",
		name = "v",
		desc = "Ljava/util/Collection;"
	)
	Collection field3594;
	@ObfInfo(
		owner = "as",
		name = "q",
		desc = "I"
	)
	volatile int field3596;

	@ObfInfo(
		owner = "as",
		name = "<init>",
		desc = "()V"
	)
	class433() {
		this.field3592 = new class310[3];
		this.field3595 = new boolean[112];
		this.field3596 = 0;
		this.field3593 = new ArrayList(100);
		this.field3594 = new ArrayList(100);
	}

	@ObfInfo(
		owner = "as",
		name = "h",
		desc = "(Lav;II)V"
	)
	void method2139(class310 var1, int var2) {
		this.field3592[var2] = var1;
	}

	@ObfInfo(
		owner = "as",
		name = "e",
		desc = "(I)I"
	)
	int method2140() {
		return this.field3596;
	}

	@ObfInfo(
		owner = "as",
		name = "v",
		desc = "(Ljava/awt/Component;I)V"
	)
	void method2141(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	@ObfInfo(
		owner = "as",
		name = "x",
		desc = "(Ljava/awt/Component;I)V"
	)
	synchronized void method2138(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized(this) {
			this.field3593.add(new class189(4, 0));
		}
	}

	@ObfInfo(
		owner = "as",
		name = "m",
		desc = "(B)V"
	)
	void method2143() {
		++this.field3596;
		this.method2142();
		Iterator var2 = this.field3594.iterator();

		while (var2.hasNext()) {
			class189 var3 = (class189)var2.next();

			for (int var4 = 0; var4 < this.field3592.length && !var3.method853(this.field3592[var4]); ++var4) {
			}
		}

		this.field3594.clear();
	}

	@ObfInfo(
		owner = "as",
		name = "keyPressed",
		desc = "(Ljava/awt/event/KeyEvent;)V"
	)
	public final synchronized void keyPressed(KeyEvent var1) {
		int var2;
		label23: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = class74.field660.length;
				if (var2 < var4) {
					var2 = class261.method1115(var2);
					boolean var5 = (var2 & 128) != 0;
					if (var5) {
						var2 = -1;
					}
					break label23;
				}
			}

			var2 = -1;
		}

		if (var2 >= 0) {
			this.field3595[var2] = true;
			this.field3593.add(new class189(1, var2));
			this.field3596 = 0;
		}

		var1.consume();
	}

	@ObfInfo(
		owner = "as",
		name = "keyReleased",
		desc = "(Ljava/awt/event/KeyEvent;)V"
	)
	public final synchronized void keyReleased(KeyEvent var1) {
		int var2;
		label16: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = class74.field660.length;
				if (var2 < var4) {
					var2 = class261.method1115(var2) & -129;
					break label16;
				}
			}

			var2 = -1;
		}

		if (var2 >= 0) {
			this.field3595[var2] = false;
			this.field3593.add(new class189(2, var2));
		}

		var1.consume();
	}

	@ObfInfo(
		owner = "as",
		name = "keyTyped",
		desc = "(Ljava/awt/event/KeyEvent;)V"
	)
	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar();
		if (var2 != 0 && var2 != '\uffff') {
			boolean var3;
			if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) {
				label47: {
					if (var2 != 0) {
						char[] var4 = class471.field3959;

						for (int var5 = 0; var5 < var4.length; ++var5) {
							char var6 = var4[var5];
							if (var6 == var2) {
								var3 = true;
								break label47;
							}
						}
					}

					var3 = false;
				}
			} else {
				var3 = true;
			}

			if (var3) {
				this.field3593.add(new class189(3, var2));
			}
		}

		var1.consume();
	}

	@ObfInfo(
		owner = "as",
		name = "q",
		desc = "(I)V"
	)
	synchronized void method2142() {
		Collection var2 = this.field3594;
		this.field3594 = this.field3593;
		this.field3593 = var2;
	}

	@ObfInfo(
		owner = "as",
		name = "focusGained",
		desc = "(Ljava/awt/event/FocusEvent;)V"
	)
	public final synchronized void focusGained(FocusEvent var1) {
		this.field3593.add(new class189(4, 1));
	}

	@ObfInfo(
		owner = "as",
		name = "focusLost",
		desc = "(Ljava/awt/event/FocusEvent;)V"
	)
	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) {
			if (this.field3595[var2]) {
				this.field3595[var2] = false;
				this.field3593.add(new class189(2, var2));
			}
		}

		this.field3593.add(new class189(4, 0));
	}

	@ObfInfo(
		owner = "as",
		name = "f",
		desc = "(B)V"
	)
	static void method2146() {
		Iterator var1 = class100.field795.iterator();

		while (var1.hasNext()) {
			class152 var2 = (class152)var1.next();
			var2.method710();
		}

	}

	@ObfInfo(
		owner = "as",
		name = "m",
		desc = "([BIIIIIIIII[Lgw;B)V"
	)
	static final void method2144(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class427[] var10) {
		int var13;
		for (int var12 = 0; var12 < 8; ++var12) {
			for (var13 = 0; var13 < 8; ++var13) {
				if (var2 + var12 > 0 && var2 + var12 < 103 && var3 + var13 > 0 && var3 + var13 < 103) {
					int[] var10000 = var10[var1].field3534[var2 + var12];
					var10000[var3 + var13] &= -16777217;
				}
			}
		}

		class127 var25 = new class127(var0);

		for (var13 = 0; var13 < 4; ++var13) {
			for (int var14 = 0; var14 < 64; ++var14) {
				for (int var15 = 0; var15 < 64; ++var15) {
					if (var13 == var4 && var14 >= var5 && var14 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
						int var18 = var14 & 7;
						int var19 = var15 & 7;
						int var20 = var7 & 3;
						int var17;
						if (var20 == 0) {
							var17 = var18;
						} else if (var20 == 1) {
							var17 = var19;
						} else if (var20 == 2) {
							var17 = 7 - var18;
						} else {
							var17 = 7 - var19;
						}

						int var21 = var2 + var17;
						int var22 = var3 + class362.method1803(var14 & 7, var15 & 7, var7);
						int var23 = (var14 & 7) + var8 + var2;
						int var24 = (var15 & 7) + var9 + var3;
						class100.method397(var25, var1, var21, var22, var23, var24, var7);
					} else {
						class100.method397(var25, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}

	@ObfInfo(
		owner = "as",
		name = "ah",
		desc = "(ILbm;ZB)I"
	)
	static int method2145(int var0, class461 var1, boolean var2) {
		if (var0 == ScriptOpcodes.NC_NAME) {
			int var4 = class386.field3248[--class161.field1227];
			class423 var5 = class421.method2049(var4, (byte)115);
			class386.field3249[++class386.field3250 - 1] = null != var5 ? var5.field3460 : "";
			return 1;
		} else if (var0 == 6764) {
			class161.field1227 -= 2;
			class423 var6 = class421.method2049(class161.field1227, (byte)29);
			int var7 = class386.field3248[1 + class161.field1227];
			class386.field3248[++class161.field1227 - 1] = var6.method2052(var7);
			class386.field3248[++class161.field1227 - 1] = var6.method2059(var7);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfInfo(
		owner = "as",
		name = "kq",
		desc = "(Lkd;I)Z"
	)
	static final boolean method2147(class120 var0) {
		if (null == var0.field1021) {
			return false;
		} else {
			for (int var2 = 0; var2 < var0.field1021.length; ++var2) {
				int var3 = class339.method1702(var0, var2);
				int var4 = var0.field1022[var2];
				if (2 == var0.field1021[var2]) {
					if (var3 >= var4) {
						return false;
					}
				} else if (var0.field1021[var2] == 3) {
					if (var3 <= var4) {
						return false;
					}
				} else if (4 == var0.field1021[var2]) {
					if (var4 == var3) {
						return false;
					}
				} else if (var3 != var4) {
					return false;
				}
			}

			return true;
		}
	}
}
