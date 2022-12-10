import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class class259 {
	public static class270 field3006;
	class212 field3007;
	int field3002;
	int field3004;
	int field3009;
	int field3012;
	HashMap field3005;
	LinkedList field3008;
	List field3011;
	final HashMap field3013;

	static {
		field3006 = new class270(37748736, 256);
	}

	static class491 method4074(int var0, int var1, int var2) {
		class270 var4 = field3006;
		long var5 = (long)(var2 << 16 | var0 << 8 | var1);
		return (class491)var4.method5280(var5);
	}

	static void method3771(class491 var0, int var1, int var2, int var3) {
		class270 var5 = field3006;
		long var7 = (long)(var3 << 16 | var1 << 8 | var2);
		var5.method5284(var0, var7, var0.field5067.length * 4);
	}

	class259(int var1, int var2, int var3, HashMap var4) {
		this.field3004 = var1;
		this.field3012 = var2;
		this.field3008 = new LinkedList();
		this.field3011 = new LinkedList();
		this.field3005 = new HashMap();
		this.field3009 = var3 | -16777216;
		this.field3013 = var4;
	}

	void method5120(int var1, int var2, int var3) {
		class491 var5 = method4074(this.field3004, this.field3012, this.field3002);
		if (null != var5) {
			if (var3 == this.field3002 * 64) {
				var5.method8849(var1, var2);
			} else {
				var5.method8870(var1, var2, var3, var3);
			}

		}
	}

	void method5121(class212 var1, List var2) {
		this.field3005.clear();
		this.field3007 = var1;
		this.method5126(var2);
	}

	void method5212(HashSet var1, List var2) {
		this.field3005.clear();
		Iterator var4 = var1.iterator();

		while (var4.hasNext()) {
			class244 var5 = (class244)var4.next();
			if (var5.method4906() == this.field3004 && var5.method4914() == this.field3012) {
				this.field3008.add(var5);
			}
		}

		this.method5126(var2);
	}

	void method5123(int var1, int var2, int var3, int var4, class248 var5) {
		for (int var7 = var1; var7 < var3 + var1; ++var7) {
			label51:
			for (int var8 = var2; var8 < var2 + var4; ++var8) {
				for (int var9 = 0; var9 < var5.field2924; ++var9) {
					class260[] var10 = var5.field2925[var9][var7][var8];
					if (var10 != null && var10.length != 0) {
						class260[] var11 = var10;

						for (int var12 = 0; var12 < var11.length; ++var12) {
							class260 var13 = var11[var12];
							class196 var14 = class165.method2780(var13.field3016);
							if (class100.method2074(var14)) {
								this.method5124(var14, var9, var7, var8, var5);
								continue label51;
							}
						}
					}
				}
			}
		}

	}

	void method5124(class196 var1, int var2, int var3, int var4, class248 var5) {
		class311 var7 = new class311(var2, var3 + this.field3004 * 64, var4 + this.field3012 * 64);
		class311 var8 = null;
		if (null != this.field3007) {
			var8 = new class311(var2 + this.field3007.field2931, this.field3007.field2923 * 64 + var3, var4 + this.field3007.field2920 * 64);
		} else {
			class244 var9 = (class244)var5;
			var8 = new class311(var9.field2931 + var2, var9.field2923 * 64 + var3 + var9.method4852() * 8, var4 + var9.field2920 * 64 + var9.method4853() * 8);
		}

		class169 var10;
		Object var11;
		if (var1.field2204 != null) {
			var11 = new class250(var8, var7, var1.field2170, this);
		} else {
			var10 = class163.method2762(var1.field2191);
			var11 = new class249(var8, var7, var10.field1578, this.method5237(var10));
		}

		var10 = class163.method2762(((class258)var11).method5105());
		if (var10.field1585) {
			this.field3005.put(new class311(0, var3, var4), var11);
		}

	}

	void method5133() {
		Iterator var2 = this.field3005.values().iterator();

		while (var2.hasNext()) {
			class258 var3 = (class258)var2.next();
			if (var3 instanceof class250) {
				((class250)var3).method4940();
			}
		}

	}

	void method5126(List var1) {
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			class249 var4 = (class249)var3.next();
			if (class163.method2762(var4.field2940).field1585 && var4.field3000.field3709 >> 6 == this.field3004 && this.field3012 == var4.field3000.field3710 >> 6) {
				class249 var5 = new class249(var4.field3000, var4.field3000, var4.field2940, this.method5148(var4.field2940));
				this.field3011.add(var5);
			}
		}

	}

	void method5221() {
		if (this.field3007 != null) {
			this.field3007.method4907();
		} else {
			Iterator var2 = this.field3008.iterator();

			while (var2.hasNext()) {
				class244 var3 = (class244)var2.next();
				var3.method4907();
			}
		}

	}

	boolean method5128(class337 var1) {
		this.field3005.clear();
		if (null != this.field3007) {
			this.field3007.method4898(var1);
			if (this.field3007.method4896()) {
				this.method5123(0, 0, 64, 64, this.field3007);
				return true;
			} else {
				return false;
			}
		} else {
			boolean var3 = true;

			Iterator var4;
			class244 var5;
			for (var4 = this.field3008.iterator(); var4.hasNext(); var3 &= var5.method4896()) {
				var5 = (class244)var4.next();
				var5.method4898(var1);
			}

			if (var3) {
				var4 = this.field3008.iterator();

				while (var4.hasNext()) {
					var5 = (class244)var4.next();
					this.method5123(var5.method4854() * 8, var5.method4851() * 8, 8, 8, var5);
				}
			}

			return var3;
		}
	}

	void method5129(int var1, class242 var2, class469[] var3, class337 var4, class337 var5) {
		this.field3002 = var1;
		if (this.field3007 != null || !this.field3008.isEmpty()) {
			if (method4074(this.field3004, this.field3012, var1) == null) {
				boolean var7 = true;
				var7 &= this.method5128(var4);
				int var9;
				if (null != this.field3007) {
					var9 = this.field3007.field2919;
				} else {
					var9 = ((class248)this.field3008.getFirst()).field2919;
				}

				var7 &= var5.method6305(var9);
				if (var7) {
					byte[] var8 = var5.method6308(var9);
					class252 var10;
					if (var8 == null) {
						var10 = new class252();
					} else {
						var10 = new class252(class47.method6425(var8).field5067);
					}

					class491 var12 = new class491(this.field3002 * 64, this.field3002 * 64);
					var12.method8856();
					if (null != this.field3007) {
						this.method5132(var2, var3, var10);
					} else {
						this.method5155(var2, var3, var10);
					}

					method3771(var12, this.field3004, this.field3012, this.field3002);
					this.method5221();
				}
			}
		}
	}

	void method5130(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) {
			var4 = new HashSet();
		}

		this.method5139(var1, var2, var4, var3);
		this.method5145(var1, var2, var4, var3);
	}

	void method5147(HashSet var1, int var2, int var3) {
		Iterator var5 = this.field3005.values().iterator();

		while (var5.hasNext()) {
			class258 var6 = (class258)var5.next();
			if (var6.method5103()) {
				int var7 = var6.method5105();
				if (var1.contains(var7)) {
					class169 var8 = class163.method2762(var7);
					this.method5141(var8, var6.field2999, var6.field2998, var2, var3);
				}
			}
		}

		this.method5156(var1, var2, var3);
	}

	void method5132(class242 var1, class469[] var2, class252 var3) {
		int var5;
		int var6;
		for (var5 = 0; var5 < 64; ++var5) {
			for (var6 = 0; var6 < 64; ++var6) {
				this.method5135(var5, var6, this.field3007, var1, var3);
				this.method5136(var5, var6, this.field3007, var1);
			}
		}

		for (var5 = 0; var5 < 64; ++var5) {
			for (var6 = 0; var6 < 64; ++var6) {
				this.method5134(var5, var6, this.field3007, var1, var2);
			}
		}

	}

	void method5155(class242 var1, class469[] var2, class252 var3) {
		Iterator var5 = this.field3008.iterator();

		class244 var6;
		int var7;
		int var8;
		while (var5.hasNext()) {
			var6 = (class244)var5.next();

			for (var7 = var6.method4854() * 8; var7 < var6.method4854() * 8 + 8; ++var7) {
				for (var8 = var6.method4851() * 8; var8 < var6.method4851() * 8 + 8; ++var8) {
					this.method5135(var7, var8, var6, var1, var3);
					this.method5136(var7, var8, var6, var1);
				}
			}
		}

		var5 = this.field3008.iterator();

		while (var5.hasNext()) {
			var6 = (class244)var5.next();

			for (var7 = var6.method4854() * 8; var7 < var6.method4854() * 8 + 8; ++var7) {
				for (var8 = var6.method4851() * 8; var8 < var6.method4851() * 8 + 8; ++var8) {
					this.method5134(var7, var8, var6, var1, var2);
				}
			}
		}

	}

	void method5134(int var1, int var2, class248 var3, class242 var4, class469[] var5) {
		this.method5138(var1, var2, var3);
		this.method5150(var1, var2, var3, var5);
	}

	void method5135(int var1, int var2, class248 var3, class242 var4, class252 var5) {
		int var7 = var3.field2928[0][var1][var2] - 1;
		int var8 = var3.field2922[0][var1][var2] - 1;
		if (var7 == -1 && var8 == -1) {
			class478.method8680(var1 * this.field3002, this.field3002 * (63 - var2), this.field3002, this.field3002, this.field3009);
		}

		int var9 = 16711935;
		if (var8 != -1) {
			var9 = class69.method1364(var8, this.field3009);
		}

		if (var8 > -1 && 0 == var3.field2929[0][var1][var2]) {
			class478.method8680(this.field3002 * var1, (63 - var2) * this.field3002, this.field3002, this.field3002, var9);
		} else {
			int var10 = this.method5137(var1, var2, var3, var5);
			if (var8 == -1) {
				class478.method8680(var1 * this.field3002, this.field3002 * (63 - var2), this.field3002, this.field3002, var10);
			} else {
				var4.method4811(this.field3002 * var1, (63 - var2) * this.field3002, var10, var9, this.field3002, this.field3002, var3.field2929[0][var1][var2], var3.field2930[0][var1][var2]);
			}
		}
	}

	void method5136(int var1, int var2, class248 var3, class242 var4) {
		for (int var6 = 1; var6 < var3.field2924; ++var6) {
			int var7 = var3.field2922[var6][var1][var2] - 1;
			if (var7 > -1) {
				int var8 = class69.method1364(var7, this.field3009);
				if (var3.field2929[var6][var1][var2] == 0) {
					class478.method8680(this.field3002 * var1, (63 - var2) * this.field3002, this.field3002, this.field3002, var8);
				} else {
					var4.method4811(this.field3002 * var1, (63 - var2) * this.field3002, 0, var8, this.field3002, this.field3002, var3.field2929[var6][var1][var2], var3.field2930[var6][var1][var2]);
				}
			}
		}

	}

	int method5137(int var1, int var2, class248 var3, class252 var4) {
		return 0 == var3.field2928[0][var1][var2] ? this.field3009 : var4.method4971(var1, var2);
	}

	void method5150(int var1, int var2, class248 var3, class469[] var4) {
		for (int var6 = 0; var6 < var3.field2924; ++var6) {
			class260[] var7 = var3.field2925[var6][var1][var2];
			if (var7 != null && var7.length != 0) {
				class260[] var8 = var7;

				for (int var9 = 0; var9 < var8.length; ++var9) {
					class260 var10 = var8[var9];
					int var12 = var10.field3015;
					boolean var11 = var12 >= class324.field4105.field4108 && var12 <= class324.field4106.field4108;
					if (var11 || class156.method2717(var10.field3015)) {
						class196 var13 = class165.method2780(var10.field3016);
						if (-1 != var13.field2183) {
							if (46 != var13.field2183 && var13.field2183 != 52) {
								var4[var13.field2183].method8608(var1 * this.field3002, this.field3002 * (63 - var2), this.field3002 * 2, this.field3002 * 2);
							} else {
								var4[var13.field2183].method8608(this.field3002 * var1, (63 - var2) * this.field3002, this.field3002 * 2 + 1, this.field3002 * 2 + 1);
							}
						}
					}
				}
			}
		}

	}

	void method5138(int var1, int var2, class248 var3) {
		for (int var5 = 0; var5 < var3.field2924; ++var5) {
			class260[] var6 = var3.field2925[var5][var1][var2];
			if (var6 != null && var6.length != 0) {
				class260[] var7 = var6;

				for (int var8 = 0; var8 < var7.length; ++var8) {
					class260 var9 = var7[var8];
					int var11 = var9.field3015;
					boolean var10 = var11 >= class324.field4085.field4108 && var11 <= class324.field4094.field4108 || var11 == class324.field4100.field4108;
					if (var10) {
						class196 var12 = class165.method2780(var9.field3016);
						int var13 = var12.field2182 != 0 ? -3407872 : -3355444;
						if (class324.field4085.field4108 == var9.field3015) {
							this.method5152(var1, var2, var9.field3014, var13);
						}

						if (var9.field3015 == class324.field4087.field4108) {
							this.method5152(var1, var2, var9.field3014, -3355444);
							this.method5152(var1, var2, 1 + var9.field3014, var13);
						}

						if (class324.field4094.field4108 == var9.field3015) {
							if (0 == var9.field3014) {
								class478.method8686(this.field3002 * var1, (63 - var2) * this.field3002, 1, var13);
							}

							if (var9.field3014 == 1) {
								class478.method8686(var1 * this.field3002 + this.field3002 - 1, this.field3002 * (63 - var2), 1, var13);
							}

							if (2 == var9.field3014) {
								class478.method8686(this.field3002 + var1 * this.field3002 - 1, this.field3002 + (63 - var2) * this.field3002 - 1, 1, var13);
							}

							if (var9.field3014 == 3) {
								class478.method8686(var1 * this.field3002, this.field3002 * (63 - var2) + this.field3002 - 1, 1, var13);
							}
						}

						if (var9.field3015 == class324.field4100.field4108) {
							int var14 = var9.field3014 % 2;
							int var15;
							if (var14 == 0) {
								for (var15 = 0; var15 < this.field3002; ++var15) {
									class478.method8686(var15 + this.field3002 * var1, (64 - var2) * this.field3002 - 1 - var15, 1, var13);
								}
							} else {
								for (var15 = 0; var15 < this.field3002; ++var15) {
									class478.method8686(var15 + var1 * this.field3002, var15 + (63 - var2) * this.field3002, 1, var13);
								}
							}
						}
					}
				}
			}
		}

	}

	void method5139(int var1, int var2, HashSet var3, int var4) {
		float var6 = (float)var4 / 64.0F;
		float var7 = var6 / 2.0F;
		Iterator var8 = this.field3005.entrySet().iterator();

		while (var8.hasNext()) {
			Entry var9 = (Entry)var8.next();
			class311 var10 = (class311)var9.getKey();
			int var11 = (int)((float)var10.field3709 * var6 + (float)var1 - var7);
			int var12 = (int)((float)(var2 + var4) - var6 * (float)var10.field3710 - var7);
			class258 var13 = (class258)var9.getValue();
			if (var13 != null && var13.method5103()) {
				var13.field2999 = var11;
				var13.field2998 = var12;
				class169 var14 = class163.method2762(var13.method5105());
				if (!var3.contains(var14.method2871())) {
					this.method5180(var13, var11, var12, var6);
				}
			}
		}

	}

	void method5156(HashSet var1, int var2, int var3) {
		Iterator var5 = this.field3011.iterator();

		while (var5.hasNext()) {
			class258 var6 = (class258)var5.next();
			if (var6.method5103()) {
				class169 var7 = class163.method2762(var6.method5105());
				if (var7 != null && var1.contains(var7.method2871())) {
					this.method5141(var7, var6.field2999, var6.field2998, var2, var3);
				}
			}
		}

	}

	void method5141(class169 var1, int var2, int var3, int var4, int var5) {
		class491 var7 = var1.method2869(false);
		if (null != var7) {
			var7.method8866(var2 - var7.field5057 / 2, var3 - var7.field5056 / 2);
			if (var4 % var5 < var5 / 2) {
				class478.method8670(var2, var3, 15, 16776960, 128);
				class478.method8670(var2, var3, 7, 16777215, 256);
			}

		}
	}

	void method5180(class258 var1, int var2, int var3, float var4) {
		class169 var6 = class163.method2762(var1.method5105());
		this.method5216(var6, var2, var3);
		this.method5143(var1, var6, var2, var3, var4);
	}

	void method5216(class169 var1, int var2, int var3) {
		class491 var5 = var1.method2869(false);
		if (null != var5) {
			int var6 = this.method5215(var5, var1.field1580);
			int var7 = this.method5140(var5, var1.field1595);
			var5.method8866(var6 + var2, var7 + var3);
		}

	}

	void method5143(class258 var1, class169 var2, int var3, int var4, float var5) {
		class243 var7 = var1.method5113();
		if (null != var7) {
			if (var7.field2899.method4968(var5)) {
				class386 var8 = (class386)this.field3013.get(var7.field2899);
				var8.method6858(var7.field2898, var3 - var7.field2897 / 2, var4, var7.field2897, var7.field2896, -16777216 | var2.field1596, 0, 1, 0, var8.field4392 / 2);
			}
		}
	}

	void method5145(int var1, int var2, HashSet var3, int var4) {
		float var6 = (float)var4 / 64.0F;
		Iterator var7 = this.field3011.iterator();

		while (var7.hasNext()) {
			class258 var8 = (class258)var7.next();
			if (var8.method5103()) {
				int var9 = var8.field3000.field3709 % 64;
				int var10 = var8.field3000.field3710 % 64;
				var8.field2999 = (int)((float)var1 + var6 * (float)var9);
				var8.field2998 = (int)((float)(63 - var10) * var6 + (float)var2);
				if (!var3.contains(var8.method5105())) {
					this.method5180(var8, var8.field2999, var8.field2998, var6);
				}
			}
		}

	}

	int method5215(class491 var1, class192 var2) {
		switch(var2.field2115) {
		case 1:
			return -var1.field5057 / 2;
		case 2:
			return 0;
		default:
			return -var1.field5057;
		}
	}

	int method5140(class491 var1, class194 var2) {
		switch(var2.field2133) {
		case 0:
			return 0;
		case 2:
			return -var1.field5056 / 2;
		default:
			return -var1.field5056;
		}
	}

	class243 method5148(int var1) {
		class169 var3 = class163.method2762(var1);
		return this.method5237(var3);
	}

	class243 method5237(class169 var1) {
		if (var1.field1581 != null && this.field3013 != null && this.field3013.get(class251.field2950) != null) {
			int var4 = var1.field1584;
			class251[] var5 = class251.method4960();
			int var6 = 0;

			class251 var3;
			while (true) {
				if (var6 >= var5.length) {
					var3 = null;
					break;
				}

				class251 var7 = var5[var6];
				if (var4 == var7.field2952) {
					var3 = var7;
					break;
				}

				++var6;
			}

			if (null == var3) {
				return null;
			} else {
				class386 var15 = (class386)this.field3013.get(var3);
				if (var15 == null) {
					return null;
				} else {
					int var16 = var15.method6852(var1.field1581, 1000000);
					String[] var8 = new String[var16];
					var15.method6850(var1.field1581, (int[])null, var8);
					int var9 = var8.length * var15.field4392 / 2;
					int var10 = 0;
					String[] var11 = var8;

					for (int var12 = 0; var12 < var11.length; ++var12) {
						String var13 = var11[var12];
						int var14 = var15.method6901(var13);
						if (var14 > var10) {
							var10 = var14;
						}
					}

					return new class243(var1.field1581, var10, var9, var3);
				}
			}
		} else {
			return null;
		}
	}

	List method5179(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var7 = new LinkedList();
		if (var4 >= var1 && var5 >= var2) {
			if (var4 < var1 + var3 && var5 < var2 + var3) {
				Iterator var8 = this.field3005.values().iterator();

				class258 var9;
				while (var8.hasNext()) {
					var9 = (class258)var8.next();
					if (var9.method5103() && var9.method5091(var4, var5)) {
						var7.add(var9);
					}
				}

				var8 = this.field3011.iterator();

				while (var8.hasNext()) {
					var9 = (class258)var8.next();
					if (var9.method5103() && var9.method5091(var4, var5)) {
						var7.add(var9);
					}
				}

				return var7;
			} else {
				return var7;
			}
		} else {
			return var7;
		}
	}

	List method5151() {
		LinkedList var2 = new LinkedList();
		var2.addAll(this.field3011);
		var2.addAll(this.field3005.values());
		return var2;
	}

	void method5152(int var1, int var2, int var3, int var4) {
		var3 %= 4;
		if (var3 == 0) {
			class478.method8688(var1 * this.field3002, this.field3002 * (63 - var2), this.field3002, var4);
		}

		if (var3 == 1) {
			class478.method8686(this.field3002 * var1, this.field3002 * (63 - var2), this.field3002, var4);
		}

		if (var3 == 2) {
			class478.method8688(this.field3002 + var1 * this.field3002 - 1, (63 - var2) * this.field3002, this.field3002, var4);
		}

		if (var3 == 3) {
			class478.method8686(this.field3002 * var1, (63 - var2) * this.field3002 + this.field3002 - 1, this.field3002, var4);
		}

	}
}
