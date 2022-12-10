import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class class47 {
	static int field342;
	static int field344;
	static long field343;

	static {
		ImageIO.setUseCache(false);
	}

	class47() throws Throwable {
		throw new Error();
	}

	public static final class491 method6425(byte[] var0) {
		BufferedImage var2 = null;

		try {
			Class var3 = ImageIO.class;
			synchronized(ImageIO.class) {
				var2 = ImageIO.read(new ByteArrayInputStream(var0));
			}

			int var7 = var2.getWidth();
			int var8 = var2.getHeight();
			int[] var5 = new int[var7 * var8];
			PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var7, var8, var5, 0, var7);
			var6.grabPixels();
			return new class491(var5, var7, var8);
		} catch (IOException var10) {
		} catch (InterruptedException var11) {
		}

		return new class491(0, 0);
	}

	static final void method918() {
		class275.method5314(class89.field857, class209.field2430, class285.field3338);
		class157.method2718(class208.field2421, class82.field757);
		if (class89.field857 == class141.field1363 && class392.field4523 == class209.field2430 && class285.field3338 == class170.field1608 && class79.field730 == class208.field2421 && class82.field757 == class113.field1145) {
			client.field1954 = false;
			client.field1953 = false;
			class127.field1266 = 0;
			class140.field1357 = 0;
			class112.field1140 = 0;
			class408.field4615 = 0;
			class93.field907 = 0;
			class213.field2536 = 0;
			field344 = 0;
			class142.field1368 = 0;
			class51.field384 = 0;
			class65.field534 = 0;
		}

	}

	static final void method919() {
		for (class62 var1 = (class62)client.field1831.method6577(); var1 != null; var1 = (class62)client.field1831.method6579()) {
			if (class384.field4486 == var1.field503 && client.field1700 <= var1.field487) {
				if (client.field1700 >= var1.field491) {
					if (var1.field490 > 0) {
						class85 var2 = client.field1934[var1.field490 - 1];
						if (var2 != null && var2.field1012 >= 0 && var2.field1012 < 13312 && var2.field948 >= 0 && var2.field948 < 13312) {
							var1.method1185(var2.field1012, var2.field948, class199.method3912(var2.field1012, var2.field948, var1.field503) - var1.field481, client.field1700);
						}
					}

					if (var1.field490 < 0) {
						int var3 = -var1.field490 - 1;
						class88 var4;
						if (client.field1817 == var3) {
							var4 = class142.field1370;
						} else {
							var4 = client.field1816[var3];
						}

						if (var4 != null && var4.field1012 >= 0 && var4.field1012 < 13312 && var4.field948 >= 0 && var4.field948 < 13312) {
							var1.method1185(var4.field1012, var4.field948, class199.method3912(var4.field1012, var4.field948, var1.field503) - var1.field481, client.field1700);
						}
					}

					var1.method1186(client.field1745);
					class33.field194.method4261(class384.field4486, (int)var1.field492, (int)var1.field493, (int)var1.field488, 60, var1, var1.field500, -1L, false);
				}
			} else {
				var1.method7951();
			}
		}

	}

	static void method920(int var0) {
		if (var0 != -1) {
			if (class87.method1889(var0)) {
				class290[] var2 = class72.field625[var0];

				for (int var3 = 0; var3 < var2.length; ++var3) {
					class290 var4 = var2[var3];
					if (var4.field3537 != null) {
						class80 var5 = new class80();
						var5.field733 = var4;
						var5.field735 = var4.field3537;
						class125.method2388(var5, 5000000, 0);
					}
				}

			}
		}
	}
}
