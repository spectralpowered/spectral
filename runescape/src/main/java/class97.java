public class class97 implements Runnable {
	static class442 field945;
	boolean field941;
	int field946;
	int[] field942;
	int[] field943;
	Object field940;
	long[] field944;

	class97() {
		this.field941 = true;
		this.field940 = new Object();
		this.field946 = 0;
		this.field942 = new int[500];
		this.field943 = new int[500];
		this.field944 = new long[500];
	}

	public void run() {
		for (; this.field941; class261.method115(50L)) {
			synchronized(this.field940) {
				if (this.field946 < 500) {
					this.field942[this.field946] = class28.field158;
					this.field943[this.field946] = class28.field153;
					this.field944[this.field946] = class28.field160;
					++this.field946;
				}
			}
		}

	}

	static int method2036(int var0, class65 var1, boolean var2) {
		class290 var4;
		if (var0 == CS2Opcodes.IF_GETINVOBJECT) {
			var4 = class180.method2988(class69.field579[--class94.field920]);
			class69.field579[++class94.field920 - 1] = var4.field3404;
			return 1;
		} else if (var0 == CS2Opcodes.IF_GETINVCOUNT) {
			var4 = class180.method2988(class69.field579[--class94.field920]);
			if (var4.field3404 != -1) {
				class69.field579[++class94.field920 - 1] = var4.field3538;
			} else {
				class69.field579[++class94.field920 - 1] = 0;
			}

			return 1;
		} else if (var0 == CS2Opcodes.IF_HASSUB) {
			int var6 = class69.field579[--class94.field920];
			class102 var5 = (class102)client.field1863.method8177((long)var6);
			if (null != var5) {
				class69.field579[++class94.field920 - 1] = 1;
			} else {
				class69.field579[++class94.field920 - 1] = 0;
			}

			return 1;
		} else if (var0 == CS2Opcodes.IF_GETTOP) {
			class69.field579[++class94.field920 - 1] = client.field1862;
			return 1;
		} else if (var0 == CS2Opcodes.IF_GETCRM_HASRESPONSE) {
			var4 = class180.method2988(class69.field579[--class94.field920]);
			class69.field579[++class94.field920 - 1] = var4.method5515() ? 1 : 0;
			return 1;
		} else if (var0 == CS2Opcodes.IF_GETCRM_INT) {
			var4 = class180.method2988(class69.field579[--class94.field920]);
			return class307.method6106(var4);
		} else if (var0 == CS2Opcodes.IF_GETCRM_STRING) {
			var4 = class180.method2988(class69.field579[--class94.field920]);
			return class93.method1981(var4);
		} else {
			return 2;
		}
	}

	static final void method2040(int var0) {
		class152.method2678();
		class83.method1648();
		int var2 = class127.method2404(var0).field1531;
		if (var2 != 0) {
			int var3 = class305.field3661[var0];
			if (var2 == 1) {
				if (var3 == 1) {
					client.method2956(0.9D);
				}

				if (var3 == 2) {
					client.method2956(0.8D);
				}

				if (var3 == 3) {
					client.method2956(0.7D);
				}

				if (var3 == 4) {
					client.method2956(0.6D);
				}
			}

			if (var2 == 3) {
				if (var3 == 0) {
					class302.method6074(255);
				}

				if (var3 == 1) {
					class302.method6074(192);
				}

				if (var3 == 2) {
					class302.method6074(128);
				}

				if (var3 == 3) {
					class302.method6074(64);
				}

				if (var3 == 4) {
					class302.method6074(0);
				}
			}

			if (var2 == 4) {
				if (var3 == 0) {
					client.method213(127);
				}

				if (var3 == 1) {
					client.method213(96);
				}

				if (var3 == 2) {
					client.method213(64);
				}

				if (var3 == 3) {
					client.method213(32);
				}

				if (var3 == 4) {
					client.method213(0);
				}
			}

			if (var2 == 5) {
				client.field1780 = var3 == 1;
			}

			if (var2 == 6) {
				client.field1866 = var3;
			}

			if (var2 == 9) {
				client.field1867 = var3;
			}

			if (var2 == 10) {
				if (var3 == 0) {
					client.method170(127);
				}

				if (var3 == 1) {
					client.method170(96);
				}

				if (var3 == 2) {
					client.method170(64);
				}

				if (var3 == 3) {
					client.method170(32);
				}

				if (var3 == 4) {
					client.method170(0);
				}
			}

			if (var2 == 17) {
				client.field1882 = var3 & 65535;
			}

			class104[] var4;
			if (var2 == 18) {
				var4 = new class104[]{class104.field1079, class104.field1073, class104.field1075, class104.field1077, class104.field1076};
				client.field1715 = (class104)class78.method1584(var4, var3);
				if (null == client.field1715) {
					client.field1715 = class104.field1079;
				}
			}

			if (var2 == 19) {
				if (var3 == -1) {
					client.field1828 = -1;
				} else {
					client.field1828 = var3 & 2047;
				}
			}

			if (var2 == 22) {
				var4 = new class104[]{class104.field1079, class104.field1073, class104.field1075, class104.field1077, class104.field1076};
				client.field1936 = (class104)class78.method1584(var4, var3);
				if (client.field1936 == null) {
					client.field1936 = class104.field1079;
				}
			}

		}
	}
}
