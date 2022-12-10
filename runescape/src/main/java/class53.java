import java.awt.Image;
import java.math.BigInteger;
import java.security.SecureRandom;

public class class53 {
	static Image field396;
	static final BigInteger field391;
	static final BigInteger field393;

	static {
		field393 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field391 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	class53() throws Throwable {
		throw new Error();
	}

	static SecureRandom method1041() {
		SecureRandom var1 = new SecureRandom();
		var1.nextInt();
		return var1;
	}

	public static void method1040(class290 var0) {
		if (null != var0 && client.field1990 == var0.field3549) {
			client.field1913[var0.field3548] = true;
		}

	}

	static final void method1039(int var0) {
		if (class87.method1889(var0)) {
			class290[] var2 = class72.field625[var0];

			for (int var3 = 0; var3 < var2.length; ++var3) {
				class290 var4 = var2[var3];
				if (null != var4) {
					var4.field3539 = 0;
					var4.field3540 = 0;
				}
			}

		}
	}
}
