import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class class45 implements KeyListener, FocusListener {
	boolean[] field333;
	class48[] field330;
	Collection field331;
	Collection field332;
	volatile int field335;

	class45() {
		this.field330 = new class48[3];
		this.field333 = new boolean[112];
		this.field335 = 0;
		this.field331 = new ArrayList(100);
		this.field332 = new ArrayList(100);
	}

	void method871(class48 var1, int var2) {
		this.field330[var2] = var1;
	}

	int method872() {
		return this.field335;
	}

	void method873(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	synchronized void method870(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized(this) {
			this.field331.add(new class51(4, 0));
		}
	}

	void method879() {
		++this.field335;
		this.method876();
		Iterator var2 = this.field332.iterator();

		while (var2.hasNext()) {
			class51 var3 = (class51)var2.next();

			for (int var4 = 0; var4 < this.field330.length && !var3.method1012(this.field330[var4]); ++var4) {
			}
		}

		this.field332.clear();
	}

	static void method897() {
		Iterator var1 = class105.field1084.iterator();

		while (var1.hasNext()) {
			class74 var2 = (class74)var1.next();
			var2.method1485();
		}

	}

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2;
		label23: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = class39.field250.length;
				if (var2 < var4) {
					var2 = class39.method2454(var2);
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
			this.field333[var2] = true;
			this.field331.add(new class51(1, var2));
			this.field335 = 0;
		}

		var1.consume();
	}

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2;
		label16: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = class39.field250.length;
				if (var2 < var4) {
					var2 = class39.method2454(var2) & -129;
					break label16;
				}
			}

			var2 = -1;
		}

		if (var2 >= 0) {
			this.field333[var2] = false;
			this.field331.add(new class51(2, var2));
		}

		var1.consume();
	}

	static final void method882(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class205[] var10) {
		int var13;
		for (int var12 = 0; var12 < 8; ++var12) {
			for (var13 = 0; var13 < 8; ++var13) {
				if (var2 + var12 > 0 && var2 + var12 < 103 && var3 + var13 > 0 && var3 + var13 < 103) {
					int[] var10000 = var10[var1].field2352[var2 + var12];
					var10000[var3 + var13] &= -16777217;
				}
			}
		}

		class467 var25 = new class467(var0);

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
						int var22 = var3 + class12.method166(var14 & 7, var15 & 7, var7);
						int var23 = (var14 & 7) + var8 + var2;
						int var24 = (var15 & 7) + var9 + var3;
						class105.method2114(var25, var1, var21, var22, var23, var24, var7);
					} else {
						class105.method2114(var25, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar();
		if (var2 != 0 && var2 != '\uffff') {
			boolean var3;
			if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) {
				label47: {
					if (var2 != 0) {
						char[] var4 = class363.field4351;

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
				this.field331.add(new class51(3, var2));
			}
		}

		var1.consume();
	}

	synchronized void method876() {
		Collection var2 = this.field332;
		this.field332 = this.field331;
		this.field331 = var2;
	}

	public final synchronized void focusGained(FocusEvent var1) {
		this.field331.add(new class51(4, 1));
	}

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) {
			if (this.field333[var2]) {
				this.field333[var2] = false;
				this.field331.add(new class51(2, var2));
			}
		}

		this.field331.add(new class51(4, 0));
	}

	static int method896(int var0, class65 var1, boolean var2) {
		if (var0 == CS2Opcodes.NC_NAME) {
			int var4 = class69.field579[--class94.field920];
			class208 var5 = class119.method2293(var4);
			class69.field580[++class69.field581 - 1] = null != var5 ? var5.field2378 : "";
			return 1;
		} else if (var0 == 6764) {
			class94.field920 -= 2;
			class208 var6 = class119.method2293(class94.field920);
			int var7 = class69.field579[1 + class94.field920];
			class69.field579[++class94.field920 - 1] = var6.method4078(var7);
			class69.field579[++class94.field920 - 1] = var6.method4088(var7);
			return 1;
		} else {
			return 2;
		}
	}

	static final boolean method898(class290 var0) {
		if (null == var0.field3530) {
			return false;
		} else {
			for (int var2 = 0; var2 < var0.field3530.length; ++var2) {
				int var3 = class66.method1228(var0, var2);
				int var4 = var0.field3531[var2];
				if (2 == var0.field3530[var2]) {
					if (var3 >= var4) {
						return false;
					}
				} else if (var0.field3530[var2] == 3) {
					if (var3 <= var4) {
						return false;
					}
				} else if (4 == var0.field3530[var2]) {
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
