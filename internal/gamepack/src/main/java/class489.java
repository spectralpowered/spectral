import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "qz"
)
public class class489 {
	@ObfInfo(
		owner = "qz",
		name = "u",
		desc = "I"
	)
	public static int field4078;
	@ObfInfo(
		owner = "qz",
		name = "h",
		desc = "[I"
	)
	int[] field4080;
	@ObfInfo(
		owner = "qz",
		name = "e",
		desc = "[S"
	)
	short[] field4079;

	@ObfInfo(
		owner = "qz",
		name = "<init>",
		desc = "(Lgz;)V"
	)
	public class489(class423 var1) {
		this.field4080 = new int[8];
		this.field4079 = new short[8];
		int var2 = 0;
		if (var1.method2058()) {
			var2 = var1.method2061().length;
			System.arraycopy(var1.method2061(), 0, this.field4080, 0, var2);
			System.arraycopy(var1.method2064(), 0, this.field4079, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.field4080[var3] = -1;
			this.field4079[var3] = -1;
		}

	}

	@ObfInfo(
		owner = "qz",
		name = "h",
		desc = "(I)[I"
	)
	public int[] method2397() {
		return this.field4080;
	}

	@ObfInfo(
		owner = "qz",
		name = "e",
		desc = "(I)[S"
	)
	public short[] method2398() {
		return this.field4079;
	}

	@ObfInfo(
		owner = "qz",
		name = "v",
		desc = "(IISI)V"
	)
	public void method2399(int var1, int var2, short var3) {
		this.field4080[var1] = var2;
		this.field4079[var1] = var3;
	}

	@ObfInfo(
		owner = "qz",
		name = "x",
		desc = "([I[SI)V"
	)
	public void method2400(int[] var1, short[] var2) {
		this.field4080 = var1;
		this.field4079 = var2;
	}

	@ObfInfo(
		owner = "qz",
		name = "h",
		desc = "(ILjava/lang/String;Lmb;II)Ljx;"
	)
	public static class299 method2401(int var0, String var1, class476 var2, int var3) {
		class299 var5 = class480.method2370(class356.field2948, client.field279.field4042);
		var5.field2403.method544(0);
		int var6 = var5.field2403.field1070;
		var5.field2403.method544(var0);
		String var7 = var1.toLowerCase();
		byte var8 = 0;
		if (var7.startsWith(class177.field1617)) {
			var8 = 0;
			var1 = var1.substring(class177.field1617.length());
		} else if (var7.startsWith(class177.field1514)) {
			var8 = 1;
			var1 = var1.substring(class177.field1514.length());
		} else if (var7.startsWith(class177.field1623)) {
			var8 = 2;
			var1 = var1.substring(class177.field1623.length());
		} else if (var7.startsWith(class177.field1518)) {
			var8 = 3;
			var1 = var1.substring(class177.field1518.length());
		} else if (var7.startsWith(class177.field1535)) {
			var8 = 4;
			var1 = var1.substring(class177.field1535.length());
		} else if (var7.startsWith(class177.field1522)) {
			var8 = 5;
			var1 = var1.substring(class177.field1522.length());
		} else if (var7.startsWith(class177.field1524)) {
			var8 = 6;
			var1 = var1.substring(class177.field1524.length());
		} else if (var7.startsWith(class177.field1526)) {
			var8 = 7;
			var1 = var1.substring(class177.field1526.length());
		} else if (var7.startsWith(class177.field1528)) {
			var8 = 8;
			var1 = var1.substring(class177.field1528.length());
		} else if (var7.startsWith(class177.field1530)) {
			var8 = 9;
			var1 = var1.substring(class177.field1530.length());
		} else if (var7.startsWith(class177.field1532)) {
			var8 = 10;
			var1 = var1.substring(class177.field1532.length());
		} else if (var7.startsWith(class177.field1447)) {
			var8 = 11;
			var1 = var1.substring(class177.field1447.length());
		} else if (var2 != class476.field3997) {
			if (var7.startsWith(class177.field1513)) {
				var8 = 0;
				var1 = var1.substring(class177.field1513.length());
			} else if (var7.startsWith(class177.field1446)) {
				var8 = 1;
				var1 = var1.substring(class177.field1446.length());
			} else if (var7.startsWith(class177.field1367)) {
				var8 = 2;
				var1 = var1.substring(class177.field1367.length());
			} else if (var7.startsWith(class177.field1519)) {
				var8 = 3;
				var1 = var1.substring(class177.field1519.length());
			} else if (var7.startsWith(class177.field1521)) {
				var8 = 4;
				var1 = var1.substring(class177.field1521.length());
			} else if (var7.startsWith(class177.field1523)) {
				var8 = 5;
				var1 = var1.substring(class177.field1523.length());
			} else if (var7.startsWith(class177.field1436)) {
				var8 = 6;
				var1 = var1.substring(class177.field1436.length());
			} else if (var7.startsWith(class177.field1359)) {
				var8 = 7;
				var1 = var1.substring(class177.field1359.length());
			} else if (var7.startsWith(class177.field1566)) {
				var8 = 8;
				var1 = var1.substring(class177.field1566.length());
			} else if (var7.startsWith(class177.field1531)) {
				var8 = 9;
				var1 = var1.substring(class177.field1531.length());
			} else if (var7.startsWith(class177.field1369)) {
				var8 = 10;
				var1 = var1.substring(class177.field1369.length());
			} else if (var7.startsWith(class177.field1548)) {
				var8 = 11;
				var1 = var1.substring(class177.field1548.length());
			}
		}

		var7 = var1.toLowerCase();
		byte var9 = 0;
		if (var7.startsWith(class177.field1536)) {
			var9 = 1;
			var1 = var1.substring(class177.field1536.length());
		} else if (var7.startsWith(class177.field1463)) {
			var9 = 2;
			var1 = var1.substring(class177.field1463.length());
		} else if (var7.startsWith(class177.field1540)) {
			var9 = 3;
			var1 = var1.substring(class177.field1540.length());
		} else if (var7.startsWith(class177.field1459)) {
			var9 = 4;
			var1 = var1.substring(class177.field1459.length());
		} else if (var7.startsWith(class177.field1544)) {
			var9 = 5;
			var1 = var1.substring(class177.field1544.length());
		} else if (var2 != class476.field3997) {
			if (var7.startsWith(class177.field1537)) {
				var9 = 1;
				var1 = var1.substring(class177.field1537.length());
			} else if (var7.startsWith(class177.field1475)) {
				var9 = 2;
				var1 = var1.substring(class177.field1475.length());
			} else if (var7.startsWith(class177.field1516)) {
				var9 = 3;
				var1 = var1.substring(class177.field1516.length());
			} else if (var7.startsWith(class177.field1428)) {
				var9 = 4;
				var1 = var1.substring(class177.field1428.length());
			} else if (var7.startsWith(class177.field1545)) {
				var9 = 5;
				var1 = var1.substring(class177.field1545.length());
			}
		}

		var5.field2403.method544(var8);
		var5.field2403.method544(var9);
		class157.method727(var5.field2403, var1);
		if (var0 == class55.field584.method330()) {
			var5.field2403.method544(var3);
		}

		var5.field2403.method586(var5.field2403.field1070 - var6);
		return var5;
	}
}
