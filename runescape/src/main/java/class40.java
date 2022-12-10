import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;

public abstract class class40 extends Applet implements Runnable, FocusListener, WindowListener {
	protected static int field260;
	public static class357 field285;
	static boolean field256;
	static class40 field255;
	static class45 field272;
	static int field254;
	static int field258;
	static int field259;
	static int field274;
	static long field264;
	static long field282;
	static long field284;
	static long[] field266;
	static long[] field268;
	static volatile boolean field281;
	boolean field275;
	boolean field283;
	class4 field278;
	int field253;
	int field265;
	int field267;
	int field269;
	int field270;
	int field286;
	Canvas field279;
	Frame field271;
	Clipboard field261;
	final EventQueue field280;
	protected int field262;
	protected int field263;
	volatile boolean field273;
	volatile boolean field276;
	volatile long field277;

	static {
		field255 = null;
		field254 = 0;
		field264 = 0L;
		field256 = false;
		field258 = 20;
		field259 = 1;
		field260 = 0;
		field268 = new long[32];
		field266 = new long[32];
		field274 = 500;
		field281 = true;
		field272 = new class45();
		field282 = -1L;
		field284 = -1L;
	}

	public static long method601(int var0, int var1, int var2, boolean var3, int var4) {
		long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
		if (var3) {
			var6 |= 65536L;
		}

		return var6;
	}

	protected class40() {
		this.field283 = false;
		this.field265 = 0;
		this.field286 = 0;
		this.field273 = true;
		this.field275 = false;
		this.field276 = false;
		this.field277 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.field280 = var1;
		class25 var2 = new class25();
		class3.field24 = var2;
	}

	protected final void method511(int var1, int var2) {
		if (this.field269 != var1 || var2 != this.field270) {
			this.method532();
		}

		this.field269 = var1;
		this.field270 = var2;
	}

	final void method512(Object var1) {
		if (null != this.field280) {
			for (int var3 = 0; var3 < 50 && this.field280.peekEvent() != null; ++var3) {
				class261.method115(1L);
			}

			if (null != var1) {
				this.field280.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	protected class162 method513() {
		if (this.field278 == null) {
			this.field278 = new class4();
			this.field278.method29(this.field279);
		}

		return this.field278;
	}

	protected void method514() {
		this.field261 = this.getToolkit().getSystemClipboard();
	}

	protected void method515(String var1) {
		this.field261.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	public Clipboard method516() {
		return this.field261;
	}

	protected final void method517() {
		if (class172.field1623.toLowerCase().indexOf("microsoft") != -1) {
			class39.field250[186] = 57;
			class39.field250[187] = 27;
			class39.field250[188] = 71;
			class39.field250[189] = 26;
			class39.field250[190] = 72;
			class39.field250[191] = 73;
			class39.field250[192] = 58;
			class39.field250[219] = 42;
			class39.field250[220] = 74;
			class39.field250[221] = 43;
			class39.field250[222] = 59;
			class39.field250[223] = 28;
		} else {
			class39.field250[44] = 71;
			class39.field250[45] = 26;
			class39.field250[46] = 72;
			class39.field250[47] = 73;
			class39.field250[59] = 57;
			class39.field250[61] = 27;
			class39.field250[91] = 42;
			class39.field250[92] = 74;
			class39.field250[93] = 43;
			class39.field250[192] = 28;
			class39.field250[222] = 58;
			class39.field250[520] = 59;
		}

		field272.method873(this.field279);
	}

	protected static final int method2946() {
		return field272.method872();
	}

	protected final void method518() {
		field272.method879();
	}

	protected void method519(class48 var1, int var2) {
		field272.method871(var1, var2);
	}

	protected final void method557() {
		Canvas var2 = this.field279;
		var2.addMouseListener(class28.field152);
		var2.addMouseMotionListener(class28.field152);
		var2.addFocusListener(class28.field152);
	}

	final void method623() {
		Container var2 = this.method635();
		if (var2 != null) {
			class401 var3 = this.method666();
			this.field263 = Math.max(var3.field4570, this.field267);
			this.field262 = Math.max(var3.field4567, this.field253);
			if (this.field263 <= 0) {
				this.field263 = 1;
			}

			if (this.field262 <= 0) {
				this.field262 = 1;
			}

			class205.field2337 = Math.min(this.field263, this.field269);
			class340.field4263 = Math.min(this.field262, this.field270);
			this.field265 = (this.field263 - class205.field2337) / 2;
			this.field286 = 0;
			this.field279.setSize(class205.field2337, class340.field4263);
			class189.field2059 = new class46(class205.field2337, class340.field4263, this.field279);
			if (this.field271 == var2) {
				Insets var4 = this.field271.getInsets();
				this.field279.setLocation(var4.left + this.field265, this.field286 + var4.top);
			} else {
				this.field279.setLocation(this.field265, this.field286);
			}

			this.field273 = true;
			this.method607();
		}
	}

	void method523() {
		int var2 = this.field265;
		int var3 = this.field286;
		int var4 = this.field263 - class205.field2337 - var2;
		int var5 = this.field262 - class340.field4263 - var3;
		if (var2 > 0 || var4 > 0 || var3 > 0 || var5 > 0) {
			try {
				Container var6 = this.method635();
				int var7 = 0;
				int var8 = 0;
				if (var6 == this.field271) {
					Insets var9 = this.field271.getInsets();
					var7 = var9.left;
					var8 = var9.top;
				}

				Graphics var11 = var6.getGraphics();
				var11.setColor(Color.black);
				if (var2 > 0) {
					var11.fillRect(var7, var8, var2, this.field262);
				}

				if (var3 > 0) {
					var11.fillRect(var7, var8, this.field263, var3);
				}

				if (var4 > 0) {
					var11.fillRect(this.field263 + var7 - var4, var8, var4, this.field262);
				}

				if (var5 > 0) {
					var11.fillRect(var7, this.field262 + var8 - var5, this.field263, var5);
				}
			} catch (Exception var10) {
			}
		}

	}

	final void method524() {
		field272.method870(this.field279);
		class28.method2085(this.field279);
		if (null != this.field278) {
			this.field278.method33(this.field279);
		}

		this.method526();
		field272.method873(this.field279);
		Canvas var2 = this.field279;
		var2.addMouseListener(class28.field152);
		var2.addMouseMotionListener(class28.field152);
		var2.addFocusListener(class28.field152);
		if (null != this.field278) {
			this.field278.method29(this.field279);
		}

		this.method532();
	}

	protected final void method525(int var1, int var2, int var3, int var4) {
		try {
			if (field255 != null) {
				++field254;
				if (field254 >= 3) {
					this.method686("alreadyloaded");
					return;
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}

			field255 = this;
			class205.field2337 = var1;
			class340.field4263 = var2;
			class490.field5051 = var3;
			class490.field5050 = var4;
			class422.field4723 = this;
			if (class245.field2906 == null) {
				class245.field2906 = new class172();
			}

			class245.field2906.method2913(this, 1);
		} catch (Exception var7) {
			class150.method2660((String)null, var7);
			this.method686("crash");
		}

	}

	final synchronized void method526() {
		Container var2 = this.method635();
		if (this.field279 != null) {
			this.field279.removeFocusListener(this);
			var2.remove(this.field279);
		}

		class205.field2337 = Math.max(var2.getWidth(), this.field267);
		class340.field4263 = Math.max(var2.getHeight(), this.field253);
		Insets var3;
		if (null != this.field271) {
			var3 = this.field271.getInsets();
			class205.field2337 -= var3.right + var3.left;
			class340.field4263 -= var3.bottom + var3.top;
		}

		this.field279 = new class26(this);
		var2.setBackground(Color.BLACK);
		var2.setLayout((LayoutManager)null);
		var2.add(this.field279);
		this.field279.setSize(class205.field2337, class340.field4263);
		this.field279.setVisible(true);
		this.field279.setBackground(Color.BLACK);
		if (this.field271 == var2) {
			var3 = this.field271.getInsets();
			this.field279.setLocation(this.field265 + var3.left, var3.top + this.field286);
		} else {
			this.field279.setLocation(this.field265, this.field286);
		}

		this.field279.addFocusListener(this);
		this.field279.requestFocus();
		this.field273 = true;
		if (null != class189.field2059 && class189.field2059.field5019 == class205.field2337 && class340.field4263 == class189.field2059.field5020) {
			((class46)class189.field2059).method901(this.field279);
			class189.field2059.method8762(0, 0);
		} else {
			class189.field2059 = new class46(class205.field2337, class340.field4263, this.field279);
		}

		this.field276 = false;
		this.field277 = class74.method1493();
	}

	protected final boolean method527() {
		String var2 = this.getDocumentBase().getHost().toLowerCase();
		if (!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
			if (!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
				if (var2.endsWith("127.0.0.1")) {
					return true;
				} else {
					while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
						var2 = var2.substring(0, var2.length() - 1);
					}

					if (var2.endsWith("192.168.1.")) {
						return true;
					} else {
						this.method686("invalidhost");
						return false;
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	public void run() {
		try {
			if (class172.field1623 != null) {
				String var1 = class172.field1623.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = class172.field1620;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.method686("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && class251.method4969(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (class341.method6511(var4) && class341.method7671(var4) < 10) {
							this.method686("wrongjava");
							return;
						}
					}

					field259 = 5;
				}
			}

			this.setFocusCycleRoot(true);
			this.method526();
			this.method622();

			Object var8;
			try {
				var8 = new class160();
			} catch (Throwable var6) {
				var8 = new class181();
			}

			class117.field1177 = (class182)var8;

			while (0L == field264 || class74.method1493() < field264) {
				class178.field1649 = class117.field1177.method3003(field258, field259);

				for (int var5 = 0; var5 < class178.field1649; ++var5) {
					this.method652();
				}

				this.method530();
				this.method512(this.field279);
			}
		} catch (Exception var7) {
			class150.method2660((String)null, var7);
			this.method686("crash");
		}

		this.method533();
	}

	void method652() {
		long var2 = class74.method1493();
		long var4 = field266[class5.field32];
		field266[class5.field32] = var2;
		class5.field32 = 1 + class5.field32 & 31;
		if (0L != var4 && var2 > var4) {
		}

		synchronized(this) {
			class466.field4911 = field281;
		}

		this.method542();
	}

	void method530() {
		Container var2 = this.method635();
		long var3 = class74.method1493();
		long var5 = field268[class481.field5021];
		field268[class481.field5021] = var3;
		class481.field5021 = class481.field5021 + 1 & 31;
		if (0L != var5 && var3 > var5) {
			int var7 = (int)(var3 - var5);
			field260 = ((var7 >> 1) + 32000) / var7;
		}

		if (++field274 - 1 > 50) {
			field274 -= 50;
			this.field273 = true;
			this.field279.setSize(class205.field2337, class340.field4263);
			this.field279.setVisible(true);
			if (var2 == this.field271) {
				Insets var8 = this.field271.getInsets();
				this.field279.setLocation(var8.left + this.field265, this.field286 + var8.top);
			} else {
				this.field279.setLocation(this.field265, this.field286);
			}
		}

		if (this.field276) {
			this.method524();
		}

		this.method531();
		this.method543(this.field273);
		if (this.field273) {
			this.method523();
		}

		this.field273 = false;
	}

	final void method531() {
		class401 var2 = this.method666();
		if (this.field263 != var2.field4570 || this.field262 != var2.field4567 || this.field275) {
			this.method623();
			this.field275 = false;
		}

	}

	final void method532() {
		this.field275 = true;
	}

	final synchronized void method533() {
		if (!field256) {
			field256 = true;

			try {
				this.field279.removeFocusListener(this);
			} catch (Exception var6) {
			}

			try {
				this.method654();
			} catch (Exception var5) {
			}

			if (this.field271 != null) {
				try {
					System.exit(0);
				} catch (Throwable var4) {
				}
			}

			if (class245.field2906 != null) {
				try {
					class245.field2906.method2909();
				} catch (Exception var3) {
				}
			}

			this.method549();
		}
	}

	public final void start() {
		if (this == field255 && !field256) {
			field264 = 0L;
		}
	}

	public final void stop() {
		if (this == field255 && !field256) {
			field264 = class74.method1493() + 4000L;
		}
	}

	public final void destroy() {
		if (this == field255 && !field256) {
			field264 = class74.method1493();
			class261.method115(5000L);
			this.method533();
		}
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final synchronized void paint(Graphics var1) {
		if (field255 == this && !field256) {
			this.field273 = true;
			if (class74.method1493() - this.field277 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (null == var2 || var2.width >= class205.field2337 && var2.height >= class340.field4263) {
					this.field276 = true;
				}
			}

		}
	}

	public final void focusGained(FocusEvent var1) {
		field281 = true;
		this.field273 = true;
	}

	public final void focusLost(FocusEvent var1) {
		field281 = false;
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	protected final void method544(int var1, String var2, boolean var3) {
		try {
			Graphics var5 = this.field279.getGraphics();
			if (class3.field23 == null) {
				class3.field23 = new Font("Helvetica", 1, 13);
				class105.field1086 = this.field279.getFontMetrics(class3.field23);
			}

			if (var3) {
				var5.setColor(Color.black);
				var5.fillRect(0, 0, class205.field2337, class340.field4263);
			}

			Color var6 = new Color(140, 17, 17);

			try {
				if (class53.field396 == null) {
					class53.field396 = this.field279.createImage(304, 34);
				}

				Graphics var7 = class53.field396.getGraphics();
				var7.setColor(var6);
				var7.drawRect(0, 0, 303, 33);
				var7.fillRect(2, 2, var1 * 3, 30);
				var7.setColor(Color.black);
				var7.drawRect(1, 1, 301, 31);
				var7.fillRect(2 + var1 * 3, 2, 300 - var1 * 3, 30);
				var7.setFont(class3.field23);
				var7.setColor(Color.white);
				var7.drawString(var2, (304 - class105.field1086.stringWidth(var2)) / 2, 22);
				var5.drawImage(class53.field396, class205.field2337 / 2 - 152, class340.field4263 / 2 - 18, (ImageObserver)null);
			} catch (Exception var10) {
				int var8 = class205.field2337 / 2 - 152;
				int var9 = class340.field4263 / 2 - 18;
				var5.setColor(var6);
				var5.drawRect(var8, var9, 303, 33);
				var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
				var5.setColor(Color.black);
				var5.drawRect(var8 + 1, var9 + 1, 301, 31);
				var5.fillRect(var8 + 2 + var1 * 3, var9 + 2, 300 - var1 * 3, 30);
				var5.setFont(class3.field23);
				var5.setColor(Color.white);
				var5.drawString(var2, var8 + (304 - class105.field1086.stringWidth(var2)) / 2, var9 + 22);
			}
		} catch (Exception var11) {
			this.field279.repaint();
		}

	}

	protected final void method545() {
		class53.field396 = null;
		class3.field23 = null;
		class105.field1086 = null;
	}

	protected void method686(String var1) {
		if (!this.field283) {
			this.field283 = true;
			System.out.println("error_game_" + var1);

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
			} catch (Exception var4) {
			}

		}
	}

	Container method635() {
		return (Container)(null != this.field271 ? this.field271 : this);
	}

	class401 method666() {
		Container var2 = this.method635();
		int var3 = Math.max(var2.getWidth(), this.field267);
		int var4 = Math.max(var2.getHeight(), this.field253);
		if (null != this.field271) {
			Insets var5 = this.field271.getInsets();
			var3 -= var5.right + var5.left;
			var4 -= var5.bottom + var5.top;
		}

		return new class401(var3, var4);
	}

	protected final boolean method548() {
		return null != this.field271;
	}

	static final void method685() {
		class436.method7977(false);
		client.field1783 = 0;
		boolean var1 = true;

		int var2;
		for (var2 = 0; var2 < class149.field1436.length; ++var2) {
			if (-1 != client.field1964[var2] && null == class149.field1436[var2]) {
				class149.field1436[var2] = class13.field73.method6374(client.field1964[var2], 0);
				if (class149.field1436[var2] == null) {
					var1 = false;
					++client.field1783;
				}
			}

			if (-1 != class368.field4380[var2] && null == class238.field2862[var2]) {
				class238.field2862[var2] = class13.field73.method6302(class368.field4380[var2], 0, class112.field1141[var2]);
				if (null == class238.field2862[var2]) {
					var1 = false;
					++client.field1783;
				}
			}
		}

		if (!var1) {
			client.field1840 = 1;
		} else {
			client.field1968 = 0;
			var1 = true;

			int var4;
			int var5;
			for (var2 = 0; var2 < class149.field1436.length; ++var2) {
				byte[] var3 = class238.field2862[var2];
				if (var3 != null) {
					var4 = (class206.field2363[var2] >> 8) * 64 - class151.field1447;
					var5 = 64 * (class206.field2363[var2] & 255) - class388.field4509;
					if (client.field1759) {
						var4 = 10;
						var5 = 10;
					}

					var1 &= class84.method1712(var3, var4, var5);
				}
			}

			if (!var1) {
				client.field1840 = 2;
			} else {
				if (0 != client.field1840) {
					class49.method940(class321.field3886 + class79.field725 + class79.field722 + 100 + "%" + class79.field726, true);
				}

				client.method3406();
				class33.field194.method4152();

				for (var2 = 0; var2 < 4; ++var2) {
					client.field1758[var2].method4027();
				}

				int var16;
				for (var2 = 0; var2 < 4; ++var2) {
					for (var16 = 0; var16 < 104; ++var16) {
						for (var4 = 0; var4 < 104; ++var4) {
							class84.field773[var2][var16][var4] = 0;
						}
					}
				}

				client.method3406();
				class84.method6489();
				var2 = class149.field1436.length;
				class70.method2233();
				class436.method7977(true);
				int var18;
				if (!client.field1759) {
					byte[] var6;
					for (var16 = 0; var16 < var2; ++var16) {
						var4 = 64 * (class206.field2363[var16] >> 8) - class151.field1447;
						var5 = (class206.field2363[var16] & 255) * 64 - class388.field4509;
						var6 = class149.field1436[var16];
						if (var6 != null) {
							client.method3406();
							class14.method179(var6, var4, var5, class19.field113 * 8 - 48, class285.field3337 * 8 - 48, client.field1758);
						}
					}

					for (var16 = 0; var16 < var2; ++var16) {
						var4 = 64 * (class206.field2363[var16] >> 8) - class151.field1447;
						var5 = 64 * (class206.field2363[var16] & 255) - class388.field4509;
						var6 = class149.field1436[var16];
						if (null == var6 && class285.field3337 < 800) {
							client.method3406();
							class72.method1406(var4, var5, 64, 64);
						}
					}

					class436.method7977(true);

					for (var16 = 0; var16 < var2; ++var16) {
						byte[] var17 = class238.field2862[var16];
						if (var17 != null) {
							var5 = 64 * (class206.field2363[var16] >> 8) - class151.field1447;
							var18 = (class206.field2363[var16] & 255) * 64 - class388.field4509;
							client.method3406();
							class143.method2552(var17, var5, var18, class33.field194, client.field1758);
						}
					}
				}

				int var7;
				int var8;
				int var9;
				if (client.field1759) {
					int var10;
					int var11;
					int var12;
					for (var16 = 0; var16 < 4; ++var16) {
						client.method3406();

						for (var4 = 0; var4 < 13; ++var4) {
							for (var5 = 0; var5 < 13; ++var5) {
								boolean var20 = false;
								var7 = client.field1760[var16][var4][var5];
								if (var7 != -1) {
									var8 = var7 >> 24 & 3;
									var9 = var7 >> 1 & 3;
									var10 = var7 >> 14 & 1023;
									var11 = var7 >> 3 & 2047;
									var12 = (var10 / 8 << 8) + var11 / 8;

									for (int var13 = 0; var13 < class206.field2363.length; ++var13) {
										if (var12 == class206.field2363[var13] && class149.field1436[var13] != null) {
											int var14 = 8 * (var10 - var4);
											int var15 = 8 * (var11 - var5);
											class45.method882(class149.field1436[var13], var16, var4 * 8, var5 * 8, var8, 8 * (var10 & 7), (var11 & 7) * 8, var9, var14, var15, client.field1758);
											var20 = true;
											break;
										}
									}
								}

								if (!var20) {
									class64.method1204(var16, var4 * 8, var5 * 8);
								}
							}
						}
					}

					for (var16 = 0; var16 < 13; ++var16) {
						for (var4 = 0; var4 < 13; ++var4) {
							var5 = client.field1760[0][var16][var4];
							if (var5 == -1) {
								class72.method1406(var16 * 8, var4 * 8, 8, 8);
							}
						}
					}

					class436.method7977(true);

					for (var16 = 0; var16 < 4; ++var16) {
						client.method3406();

						for (var4 = 0; var4 < 13; ++var4) {
							for (var5 = 0; var5 < 13; ++var5) {
								var18 = client.field1760[var16][var4][var5];
								if (var18 != -1) {
									var7 = var18 >> 24 & 3;
									var8 = var18 >> 1 & 3;
									var9 = var18 >> 14 & 1023;
									var10 = var18 >> 3 & 2047;
									var11 = (var9 / 8 << 8) + var10 / 8;

									for (var12 = 0; var12 < class206.field2363.length; ++var12) {
										if (var11 == class206.field2363[var12] && null != class238.field2862[var12]) {
											class84.method1652(class238.field2862[var12], var16, var4 * 8, var5 * 8, var7, 8 * (var9 & 7), (var10 & 7) * 8, var8, class33.field194, client.field1758);
											break;
										}
									}
								}
							}
						}
					}
				}

				class436.method7977(true);
				client.method3406();
				class250.method4956(class33.field194, client.field1758);
				class436.method7977(true);
				var16 = class84.field766;
				if (var16 > class384.field4486) {
					var16 = class384.field4486;
				}

				if (var16 < class384.field4486 - 1) {
					var16 = class384.field4486 - 1;
				}

				if (client.field1743) {
					class33.field194.method4258(class84.field766);
				} else {
					class33.field194.method4258(0);
				}

				for (var4 = 0; var4 < 104; ++var4) {
					for (var5 = 0; var5 < 104; ++var5) {
						class363.method6765(var4, var5);
					}
				}

				client.method3406();
				class201.method3986();
				class196.field2194.method5357();
				class284 var19;
				if (class122.field1212.method548()) {
					var19 = class152.method2679(class276.field3275, client.field1748.field1105);
					var19.field3321.method8312(1057001181);
					client.field1748.method2173(var19);
				}

				if (!client.field1759) {
					var4 = (class19.field113 - 6) / 8;
					var5 = (6 + class19.field113) / 8;
					var18 = (class285.field3337 - 6) / 8;
					var7 = (6 + class285.field3337) / 8;

					for (var8 = var4 - 1; var8 <= var5 + 1; ++var8) {
						for (var9 = var18 - 1; var9 <= var7 + 1; ++var9) {
							if (var8 < var4 || var8 > var5 || var9 < var18 || var9 > var7) {
								class13.field73.method6390("m" + var8 + "_" + var9);
								class13.field73.method6390("l" + var8 + "_" + var9);
							}
						}
					}
				}

				class131.method2451(30);
				client.method3406();
				class84.method6997();
				var19 = class152.method2679(class276.field3252, client.field1748.field1105);
				client.field1748.method2173(var19);
				class39.method506();
			}
		}
	}

	static final void method537(int var0, int var1, int var2, int var3, class491 var4, class308 var5) {
		int var7 = var2 * var2 + var3 * var3;
		if (var7 > 4225 && var7 < 90000) {
			int var8 = client.field1770 & 2047;
			int var9 = class221.field2667[var8];
			int var10 = class221.field2690[var8];
			int var11 = var9 * var3 + var10 * var2 >> 16;
			int var12 = var10 * var3 - var9 * var2 >> 16;
			double var13 = Math.atan2((double)var11, (double)var12);
			int var15 = var5.field3679 / 2 - 25;
			int var16 = (int)(Math.sin(var13) * (double)var15);
			int var17 = (int)(Math.cos(var13) * (double)var15);
			byte var18 = 20;
			class143.field1379.method8887(var5.field3679 / 2 + var0 - var18 / 2 + var16, var5.field3680 / 2 + var1 - var18 / 2 - var17 - 10, var18, var18, 15, 15, var13, 256);
		} else {
			class263.method5260(var0, var1, var2, var3, var4, var5);
		}

	}

	public abstract void init();

	protected abstract void method542();

	protected abstract void method543(boolean var1);

	protected abstract void method549();

	protected abstract void method607();

	protected abstract void method622();

	protected abstract void method654();
}
