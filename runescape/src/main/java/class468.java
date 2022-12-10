public class class468 {
	public static int field4918;
	int[] field4921;
	short[] field4919;

	public class468(class208 var1) {
		this.field4921 = new int[8];
		this.field4919 = new short[8];
		int var2 = 0;
		if (var1.method4087()) {
			var2 = var1.method4093().length;
			System.arraycopy(var1.method4093(), 0, this.field4921, 0, var2);
			System.arraycopy(var1.method4130(), 0, this.field4919, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.field4921[var3] = -1;
			this.field4919[var3] = -1;
		}

	}

	public static class284 method8579(int var0, String var1, class340 var2, int var3) {
		class284 var5 = class152.method2679(class276.field3210, client.field1748.field1105);
		var5.field3321.method8323(0);
		int var6 = var5.field3321.field4915;
		var5.field3321.method8323(var0);
		String var7 = var1.toLowerCase();
		byte var8 = 0;
		if (var7.startsWith(class321.field4048)) {
			var8 = 0;
			var1 = var1.substring(class321.field4048.length());
		} else if (var7.startsWith(class321.field3945)) {
			var8 = 1;
			var1 = var1.substring(class321.field3945.length());
		} else if (var7.startsWith(class321.field4054)) {
			var8 = 2;
			var1 = var1.substring(class321.field4054.length());
		} else if (var7.startsWith(class321.field3949)) {
			var8 = 3;
			var1 = var1.substring(class321.field3949.length());
		} else if (var7.startsWith(class321.field3966)) {
			var8 = 4;
			var1 = var1.substring(class321.field3966.length());
		} else if (var7.startsWith(class321.field3953)) {
			var8 = 5;
			var1 = var1.substring(class321.field3953.length());
		} else if (var7.startsWith(class321.field3955)) {
			var8 = 6;
			var1 = var1.substring(class321.field3955.length());
		} else if (var7.startsWith(class321.field3957)) {
			var8 = 7;
			var1 = var1.substring(class321.field3957.length());
		} else if (var7.startsWith(class321.field3959)) {
			var8 = 8;
			var1 = var1.substring(class321.field3959.length());
		} else if (var7.startsWith(class321.field3961)) {
			var8 = 9;
			var1 = var1.substring(class321.field3961.length());
		} else if (var7.startsWith(class321.field3963)) {
			var8 = 10;
			var1 = var1.substring(class321.field3963.length());
		} else if (var7.startsWith(class321.field3878)) {
			var8 = 11;
			var1 = var1.substring(class321.field3878.length());
		} else if (var2 != class340.field4257) {
			if (var7.startsWith(class321.field3944)) {
				var8 = 0;
				var1 = var1.substring(class321.field3944.length());
			} else if (var7.startsWith(class321.field3877)) {
				var8 = 1;
				var1 = var1.substring(class321.field3877.length());
			} else if (var7.startsWith(class321.field3798)) {
				var8 = 2;
				var1 = var1.substring(class321.field3798.length());
			} else if (var7.startsWith(class321.field3950)) {
				var8 = 3;
				var1 = var1.substring(class321.field3950.length());
			} else if (var7.startsWith(class321.field3952)) {
				var8 = 4;
				var1 = var1.substring(class321.field3952.length());
			} else if (var7.startsWith(class321.field3954)) {
				var8 = 5;
				var1 = var1.substring(class321.field3954.length());
			} else if (var7.startsWith(class321.field3867)) {
				var8 = 6;
				var1 = var1.substring(class321.field3867.length());
			} else if (var7.startsWith(class321.field3790)) {
				var8 = 7;
				var1 = var1.substring(class321.field3790.length());
			} else if (var7.startsWith(class321.field3997)) {
				var8 = 8;
				var1 = var1.substring(class321.field3997.length());
			} else if (var7.startsWith(class321.field3962)) {
				var8 = 9;
				var1 = var1.substring(class321.field3962.length());
			} else if (var7.startsWith(class321.field3800)) {
				var8 = 10;
				var1 = var1.substring(class321.field3800.length());
			} else if (var7.startsWith(class321.field3979)) {
				var8 = 11;
				var1 = var1.substring(class321.field3979.length());
			}
		}

		var7 = var1.toLowerCase();
		byte var9 = 0;
		if (var7.startsWith(class321.field3967)) {
			var9 = 1;
			var1 = var1.substring(class321.field3967.length());
		} else if (var7.startsWith(class321.field3894)) {
			var9 = 2;
			var1 = var1.substring(class321.field3894.length());
		} else if (var7.startsWith(class321.field3971)) {
			var9 = 3;
			var1 = var1.substring(class321.field3971.length());
		} else if (var7.startsWith(class321.field3890)) {
			var9 = 4;
			var1 = var1.substring(class321.field3890.length());
		} else if (var7.startsWith(class321.field3975)) {
			var9 = 5;
			var1 = var1.substring(class321.field3975.length());
		} else if (var2 != class340.field4257) {
			if (var7.startsWith(class321.field3968)) {
				var9 = 1;
				var1 = var1.substring(class321.field3968.length());
			} else if (var7.startsWith(class321.field3906)) {
				var9 = 2;
				var1 = var1.substring(class321.field3906.length());
			} else if (var7.startsWith(class321.field3947)) {
				var9 = 3;
				var1 = var1.substring(class321.field3947.length());
			} else if (var7.startsWith(class321.field3859)) {
				var9 = 4;
				var1 = var1.substring(class321.field3859.length());
			} else if (var7.startsWith(class321.field3976)) {
				var9 = 5;
				var1 = var1.substring(class321.field3976.length());
			}
		}

		var5.field3321.method8323(var8);
		var5.field3321.method8323(var9);
		class402.method7515(var5.field3321, var1);
		if (var0 == class315.field3727.method6487()) {
			var5.field3321.method8323(var3);
		}

		var5.field3321.method8398(var5.field3321.field4915 - var6);
		return var5;
	}

	public int[] method8573() {
		return this.field4921;
	}

	public short[] method8575() {
		return this.field4919;
	}

	public void method8576(int var1, int var2, short var3) {
		this.field4921[var1] = var2;
		this.field4919[var1] = var3;
	}

	public void method8577(int[] var1, short[] var2) {
		this.field4921 = var1;
		this.field4919 = var2;
	}
}
