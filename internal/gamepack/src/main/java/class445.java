import io.spectralpowered.ObfInfo;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

@ObfInfo(
	name = "et"
)
public class class445 implements class78 {
	@ObfInfo(
		owner = "et",
		name = "h",
		desc = "Let;"
	)
	public static final class445 field3671;
	@ObfInfo(
		owner = "et",
		name = "v",
		desc = "Let;"
	)
	public static final class445 field3672;
	@ObfInfo(
		owner = "et",
		name = "x",
		desc = "Let;"
	)
	public static final class445 field3673;
	@ObfInfo(
		owner = "et",
		name = "m",
		desc = "Let;"
	)
	public static final class445 field3675;
	@ObfInfo(
		owner = "et",
		name = "e",
		desc = "Let;"
	)
	public static final class445 field3676;
	@ObfInfo(
		owner = "et",
		name = "f",
		desc = "I"
	)
	final int field3670;
	@ObfInfo(
		owner = "et",
		name = "q",
		desc = "I"
	)
	public final int field3674;

	static {
		field3671 = new class445(2, 0);
		field3676 = new class445(4, 1);
		field3672 = new class445(0, 2);
		field3673 = new class445(3, 3);
		field3675 = new class445(1, 4);
	}

	@ObfInfo(
		owner = "et",
		name = "<init>",
		desc = "(II)V"
	)
	class445(int var1, int var2) {
		this.field3674 = var1;
		this.field3670 = var2;
	}

	@ObfInfo(
		owner = "et",
		name = "e",
		desc = "(B)I"
	)
	public int method330() {
		return this.field3670;
	}

	@ObfInfo(
		owner = "et",
		name = "h",
		desc = "(Ljava/lang/String;Ljava/lang/Throwable;I)V"
	)
	public static void method2199(String var0, Throwable var1) {
		try {
			String var3 = "";
			if (var1 != null) {
				Throwable var5 = var1;
				String var6;
				if (var1 instanceof class478) {
					class478 var7 = (class478)var1;
					var6 = var7.field4016 + " | ";
					var5 = var7.field4017;
				} else {
					var6 = "";
				}

				StringWriter var19 = new StringWriter();
				PrintWriter var8 = new PrintWriter(var19);
				var5.printStackTrace(var8);
				var8.close();
				String var9 = var19.toString();
				BufferedReader var10 = new BufferedReader(new StringReader(var9));
				String var11 = var10.readLine();

				while (true) {
					String var12 = var10.readLine();
					if (var12 == null) {
						var6 = var6 + "| " + var11;
						var3 = var6;
						break;
					}

					int var13 = var12.indexOf(40);
					int var14 = var12.indexOf(41, var13 + 1);
					if (var13 >= 0 && var14 >= 0) {
						String var15 = var12.substring(var13 + 1, var14);
						int var16 = var15.indexOf(".java:");
						if (var16 >= 0) {
							var15 = var15.substring(0, var16) + var15.substring(var16 + 5);
							var6 = var6 + var15 + ' ';
							continue;
						}

						var12 = var12.substring(0, var13);
					}

					var12 = var12.trim();
					var12 = var12.substring(var12.lastIndexOf(32) + 1);
					var12 = var12.substring(var12.lastIndexOf(9) + 1);
					var6 = var6 + var12 + ' ';
				}
			}

			if (null != var0) {
				if (null != var1) {
					var3 = var3 + " | ";
				}

				var3 = var3 + var0;
			}

			System.out.println("Error: " + var3);
			var3 = var3.replace(':', '.');
			var3 = var3.replace('@', '_');
			var3 = var3.replace('&', '_');
			var3 = var3.replace('#', '_');
			if (null == class126.field1068) {
				return;
			}

			URL var4 = new URL(class126.field1068.getCodeBase(), "clienterror.ws?cv=" + class478.field4013 + "&cs=" + class478.field4012 + "&u=" + class478.field4015 + "&v1=" + class300.field2408 + "&v2=" + class300.field2406 + "&ct=" + class478.field4014 + "&e=" + var3);
			DataInputStream var18 = new DataInputStream(var4.openStream());
			var18.read();
			var18.close();
		} catch (Exception var17) {
		}

	}
}
