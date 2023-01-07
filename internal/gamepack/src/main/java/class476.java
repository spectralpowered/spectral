import io.spectralpowered.ObfInfo;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Locale;
import javax.imageio.ImageIO;

@ObfInfo(
	name = "mb"
)
@class451
public class class476 implements class78 {
	@ObfInfo(
		owner = "mb",
		name = "d",
		desc = "I"
	)
	public static int field4003;
	@ObfInfo(
		owner = "mb",
		name = "h",
		desc = "Lmb;"
	)
	public static final class476 field3997;
	@ObfInfo(
		owner = "mb",
		name = "v",
		desc = "Lmb;"
	)
	public static final class476 field3999;
	@ObfInfo(
		owner = "mb",
		name = "q",
		desc = "Lmb;"
	)
	public static final class476 field4002;
	@ObfInfo(
		owner = "mb",
		name = "j",
		desc = "[Lmb;"
	)
	public static final class476[] field4008;
	@ObfInfo(
		owner = "mb",
		name = "ad",
		desc = "[Z"
	)
	static boolean[] field4009;
	@ObfInfo(
		owner = "mb",
		name = "f",
		desc = "Lmb;"
	)
	static final class476 field3998;
	@ObfInfo(
		owner = "mb",
		name = "x",
		desc = "Lmb;"
	)
	static final class476 field4000;
	@ObfInfo(
		owner = "mb",
		name = "m",
		desc = "Lmb;"
	)
	static final class476 field4001;
	@ObfInfo(
		owner = "mb",
		name = "e",
		desc = "Lmb;"
	)
	static final class476 field4006;
	@ObfInfo(
		owner = "mb",
		name = "b",
		desc = "I"
	)
	final int field4007;
	@ObfInfo(
		owner = "mb",
		name = "r",
		desc = "Ljava/lang/String;"
	)
	final String field4004;
	@ObfInfo(
		owner = "mb",
		name = "u",
		desc = "Ljava/lang/String;"
	)
	final String field4005;

	static {
		field3997 = new class476("EN", "en", "English", class10.field58, 0, "GB");
		field4006 = new class476("DE", "de", "German", class10.field58, 1, "DE");
		field3999 = new class476("FR", "fr", "French", class10.field58, 2, "FR");
		field4000 = new class476("PT", "pt", "Portuguese", class10.field58, 3, "BR");
		field4001 = new class476("NL", "nl", "Dutch", class10.field42, 4, "NL");
		field4002 = new class476("ES", "es", "Spanish", class10.field42, 5, "ES");
		field3998 = new class476("ES_MX", "es-mx", "Spanish (Latin American)", class10.field58, 6, "MX");
		class476[] var0 = new class476[]{field4006, field4002, field3999, field4001, field3998, field4000, field3997};
		field4008 = new class476[var0.length];
		class476[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class476 var4 = var2[var3];
			if (field4008[var4.field4007] != null) {
				throw new IllegalStateException();
			}

			field4008[var4.field4007] = var4;
		}

	}

	@ObfInfo(
		owner = "mb",
		name = "<init>",
		desc = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmr;ILjava/lang/String;)V"
	)
	class476(String var1, String var2, String var3, class10 var4, int var5, String var6) {
		this.field4004 = var1;
		this.field4005 = var2;
		this.field4007 = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfInfo(
		owner = "mb",
		name = "h",
		desc = "(B)Ljava/lang/String;"
	)
	String method2356() {
		return this.field4005;
	}

	@ObfInfo(
		owner = "mb",
		name = "e",
		desc = "(B)I"
	)
	public int method330() {
		return this.field4007;
	}

	@ObfInfo(
		owner = "mb",
		name = "toString",
		desc = "()Ljava/lang/String;"
	)
	public String toString() {
		return this.method2356().toLowerCase(Locale.ENGLISH);
	}

	@ObfInfo(
		owner = "mb",
		name = "h",
		desc = "([BB)Lrx;"
	)
	public static final class266 method2357(byte[] var0) {
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
			return new class266(var5, var7, var8);
		} catch (IOException var10) {
		} catch (InterruptedException var11) {
		}

		return new class266(0, 0);
	}

	@ObfInfo(
		owner = "mb",
		name = "u",
		desc = "(I)V"
	)
	static void method2358() {
		class268.field2221 = 0;

		for (int var1 = 0; var1 < 2048; ++var1) {
			class268.field2218[var1] = null;
			class268.field2225[var1] = class294.field2386;
		}

	}
}
