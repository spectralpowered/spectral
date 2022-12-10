import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

public class class150 implements class343 {
	public static final class150 field1439;
	public static final class150 field1440;
	public static final class150 field1441;
	public static final class150 field1443;
	public static final class150 field1444;
	final int field1438;
	public final int field1442;

	static {
		field1439 = new class150(2, 0);
		field1444 = new class150(4, 1);
		field1440 = new class150(0, 2);
		field1441 = new class150(3, 3);
		field1443 = new class150(1, 4);
	}

	class150(int var1, int var2) {
		this.field1442 = var1;
		this.field1438 = var2;
	}

	public int method6487() {
		return this.field1438;
	}

	public static void method2660(String var0, Throwable var1) {
		try {
			String var3 = "";
			if (var1 != null) {
				Throwable var5 = var1;
				String var6;
				if (var1 instanceof class490) {
					class490 var7 = (class490)var1;
					var6 = var7.field5054 + " | ";
					var5 = var7.field5055;
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
			if (null == class422.field4723) {
				return;
			}

			URL var4 = new URL(class422.field4723.getCodeBase(), "clienterror.ws?cv=" + class490.field5051 + "&cs=" + class490.field5050 + "&u=" + class490.field5053 + "&v1=" + class172.field1623 + "&v2=" + class172.field1620 + "&ct=" + class490.field5052 + "&e=" + var3);
			DataInputStream var18 = new DataInputStream(var4.openStream());
			var18.read();
			var18.close();
		} catch (Exception var17) {
		}

	}
}
