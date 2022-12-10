public class class195 extends class439 {
	public static class337 field2140;
	public static class337 field2146;
	static class282 field2142;
	static class282 field2154;
	static class282 field2159;
	static class326 field2162;
	int field2147;
	int field2149;
	int field2151;
	int field2152;
	int field2156;
	int field2160;
	int field2161;
	String field2139;
	public int field2141;
	public int field2143;
	public int field2148;
	public int field2153;
	public int field2155;
	public int field2157;
	public int field2158;
	public int[] field2150;

	static {
		field2154 = new class282(64);
		field2142 = new class282(64);
		field2159 = new class282(20);
	}

	class195() {
		this.field2147 = -1;
		this.field2141 = 16777215;
		this.field2143 = 70;
		this.field2149 = -1;
		this.field2156 = -1;
		this.field2151 = -1;
		this.field2152 = -1;
		this.field2153 = 0;
		this.field2148 = 0;
		this.field2155 = -1;
		this.field2139 = "";
		this.field2157 = -1;
		this.field2158 = 0;
		this.field2160 = -1;
		this.field2161 = -1;
	}

	void method3811(class467 var1) {
		while (true) {
			int var3 = var1.method8326();
			if (var3 == 0) {
				return;
			}

			this.method3798(var1, var3);
		}
	}

	void method3798(class467 var1, int var2) {
		if (var2 == 1) {
			this.field2147 = var1.method8344();
		} else if (var2 == 2) {
			this.field2141 = var1.method8330();
		} else if (var2 == 3) {
			this.field2149 = var1.method8344();
		} else if (var2 == 4) {
			this.field2151 = var1.method8344();
		} else if (var2 == 5) {
			this.field2156 = var1.method8344();
		} else if (var2 == 6) {
			this.field2152 = var1.method8344();
		} else if (var2 == 7) {
			this.field2153 = var1.method8329();
		} else if (var2 == 8) {
			this.field2139 = var1.method8336();
		} else if (var2 == 9) {
			this.field2143 = var1.method8328();
		} else if (var2 == 10) {
			this.field2148 = var1.method8329();
		} else if (var2 == 11) {
			this.field2155 = 0;
		} else if (var2 == 12) {
			this.field2157 = var1.method8326();
		} else if (var2 == 13) {
			this.field2158 = var1.method8329();
		} else if (var2 == 14) {
			this.field2155 = var1.method8328();
		} else if (var2 == 17 || var2 == 18) {
			this.field2160 = var1.method8328();
			if (this.field2160 == 65535) {
				this.field2160 = -1;
			}

			this.field2161 = var1.method8328();
			if (this.field2161 == 65535) {
				this.field2161 = -1;
			}

			int var4 = -1;
			if (var2 == 18) {
				var4 = var1.method8328();
				if (var4 == 65535) {
					var4 = -1;
				}
			}

			int var5 = var1.method8326();
			this.field2150 = new int[var5 + 2];

			for (int var6 = 0; var6 <= var5; ++var6) {
				this.field2150[var6] = var1.method8328();
				if (this.field2150[var6] == 65535) {
					this.field2150[var6] = -1;
				}
			}

			this.field2150[var5 + 1] = var4;
		}

	}

	public final class195 method3779() {
		int var2 = -1;
		if (this.field2160 != -1) {
			var2 = class180.method2989(this.field2160);
		} else if (this.field2161 != -1) {
			var2 = class305.field3661[this.field2161];
		}

		int var3;
		if (var2 >= 0 && var2 < this.field2150.length - 1) {
			var3 = this.field2150[var2];
		} else {
			var3 = this.field2150[this.field2150.length - 1];
		}

		return var3 != -1 ? class366.method6810(var3) : null;
	}

	public String method3780(int var1) {
		String var3 = this.field2139;

		while (true) {
			int var4 = var3.indexOf("%1");
			if (var4 < 0) {
				return var3;
			}

			var3 = var3.substring(0, var4) + class303.method6084(var1, false) + var3.substring(var4 + 2);
		}
	}

	public class491 method3781() {
		if (this.field2149 < 0) {
			return null;
		} else {
			class491 var2 = (class491)field2142.method5356((long)this.field2149);
			if (null != var2) {
				return var2;
			} else {
				var2 = class125.method2359(field2146, this.field2149, 0);
				if (null != var2) {
					field2142.method5364(var2, (long)this.field2149);
				}

				return var2;
			}
		}
	}

	public class491 method3782() {
		if (this.field2156 < 0) {
			return null;
		} else {
			class491 var2 = (class491)field2142.method5356((long)this.field2156);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class125.method2359(field2146, this.field2156, 0);
				if (null != var2) {
					field2142.method5364(var2, (long)this.field2156);
				}

				return var2;
			}
		}
	}

	public class491 method3816() {
		if (this.field2151 < 0) {
			return null;
		} else {
			class491 var2 = (class491)field2142.method5356((long)this.field2151);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class125.method2359(field2146, this.field2151, 0);
				if (null != var2) {
					field2142.method5364(var2, (long)this.field2151);
				}

				return var2;
			}
		}
	}

	public class491 method3784() {
		if (this.field2152 < 0) {
			return null;
		} else {
			class491 var2 = (class491)field2142.method5356((long)this.field2152);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class125.method2359(field2146, this.field2152, 0);
				if (var2 != null) {
					field2142.method5364(var2, (long)this.field2152);
				}

				return var2;
			}
		}
	}

	public class386 method3806() {
		if (-1 == this.field2147) {
			return null;
		} else {
			class386 var2 = (class386)field2159.method5356((long)this.field2147);
			if (null != var2) {
				return var2;
			} else {
				var2 = class372.method6995(field2146, field2140, this.field2147, 0);
				if (null != var2) {
					field2159.method5364(var2, (long)this.field2147);
				}

				return var2;
			}
		}
	}

	public static void method3748() {
		field2154.method5357();
		field2142.method5357();
		field2159.method5357();
	}

	public static void method3804(int var0) {
		if (var0 != -1) {
			if (class340.field4272[var0]) {
				class422.field4721.method6316(var0);
				if (null != class72.field625[var0]) {
					boolean var2 = true;

					for (int var3 = 0; var3 < class72.field625[var0].length; ++var3) {
						if (class72.field625[var0][var3] != null) {
							if (2 != class72.field625[var0][var3].field3536) {
								class72.field625[var0][var3] = null;
							} else {
								var2 = false;
							}
						}
					}

					if (var2) {
						class72.field625[var0] = null;
					}

					class340.field4272[var0] = false;
				}
			}
		}
	}

	static boolean method3778() {
		if (client.field1984 != null && client.field1912 < client.field1984.size()) {
			while (client.field1912 < client.field1984.size()) {
				class95 var1 = (class95)client.field1984.get(client.field1912);
				if (!var1.method2024()) {
					return false;
				}

				++client.field1912;
			}

			return true;
		} else {
			return true;
		}
	}

	static final void method3814() {
		int var1 = class87.field818;
		int[] var2 = class87.field817;

		for (int var3 = 0; var3 < var1; ++var3) {
			class88 var4 = client.field1816[var2[var3]];
			if (null != var4) {
				class227.method4632(var4, 1);
			}
		}

	}
}
