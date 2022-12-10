import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class class219 {
	public static int[] field2656;
	static class469 field2653;

	class219() {
	}

	public static void method4527(class466 var0) {
		class33 var2 = (class33)class38.field234.method6705();
		if (var2 != null) {
			int var3 = var0.field4915;
			var0.method8312(var2.field185);

			for (int var4 = 0; var4 < var2.field189; ++var4) {
				if (0 != var2.field186[var4]) {
					var0.method8323(var2.field186[var4]);
				} else {
					try {
						int var5 = var2.field188[var4];
						Field var6;
						int var7;
						if (var5 == 0) {
							var6 = var2.field187[var4];
							var7 = var6.getInt((Object)null);
							var0.method8323(0);
							var0.method8312(var7);
						} else if (var5 == 1) {
							var6 = var2.field187[var4];
							var6.setInt((Object)null, var2.field184[var4]);
							var0.method8323(0);
						} else if (var5 == 2) {
							var6 = var2.field187[var4];
							var7 = var6.getModifiers();
							var0.method8323(0);
							var0.method8312(var7);
						}

						Method var26;
						if (var5 != 3) {
							if (var5 == 4) {
								var26 = var2.field190[var4];
								var7 = var26.getModifiers();
								var0.method8323(0);
								var0.method8312(var7);
							}
						} else {
							var26 = var2.field190[var4];
							byte[][] var11 = var2.field183[var4];
							Object[] var8 = new Object[var11.length];

							for (int var9 = 0; var9 < var11.length; ++var9) {
								ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var11[var9]));
								var8[var9] = var10.readObject();
							}

							Object var12 = var26.invoke((Object)null, var8);
							if (var12 == null) {
								var0.method8323(0);
							} else if (var12 instanceof Number) {
								var0.method8323(1);
								var0.method8314(((Number)var12).longValue());
							} else if (var12 instanceof String) {
								var0.method8323(2);
								var0.method8316((String)var12);
							} else {
								var0.method8323(4);
							}
						}
					} catch (ClassNotFoundException var14) {
						var0.method8323(-10);
					} catch (InvalidClassException var15) {
						var0.method8323(-11);
					} catch (StreamCorruptedException var16) {
						var0.method8323(-12);
					} catch (OptionalDataException var17) {
						var0.method8323(-13);
					} catch (IllegalAccessException var18) {
						var0.method8323(-14);
					} catch (IllegalArgumentException var19) {
						var0.method8323(-15);
					} catch (InvocationTargetException var20) {
						var0.method8323(-16);
					} catch (SecurityException var21) {
						var0.method8323(-17);
					} catch (IOException var22) {
						var0.method8323(-18);
					} catch (NullPointerException var23) {
						var0.method8323(-19);
					} catch (Exception var24) {
						var0.method8323(-20);
					} catch (Throwable var25) {
						var0.method8323(-21);
					}
				}
			}

			var0.method8352(var3);
			var2.method7951();
		}
	}

	static void method4528(int var0, int var1, int var2, int var3, String var4) {
		class290 var6 = class104.method2089(var1, var2);
		if (null != var6) {
			if (null != var6.field3437) {
				class80 var7 = new class80();
				var7.field733 = var6;
				var7.field736 = var0;
				var7.field740 = var4;
				var7.field735 = var6.field3437;
				class69.method2874(var7);
			}

			boolean var9 = true;
			if (var6.field3500 > 0) {
				var9 = class85.method1768(var6);
			}

			if (var9) {
				if (class253.method4974(class182.method3010(var6), var0 - 1)) {
					class284 var8;
					if (var0 == 1) {
						var8 = class152.method2679(class276.field3205, client.field1748.field1105);
						var8.field3321.method8312(var1);
						var8.field3321.method8310(var2);
						var8.field3321.method8310(var3);
						client.field1748.method2173(var8);
					}

					if (var0 == 2) {
						var8 = class152.method2679(class276.field3289, client.field1748.field1105);
						var8.field3321.method8312(var1);
						var8.field3321.method8310(var2);
						var8.field3321.method8310(var3);
						client.field1748.method2173(var8);
					}

					if (var0 == 3) {
						var8 = class152.method2679(class276.field3215, client.field1748.field1105);
						var8.field3321.method8312(var1);
						var8.field3321.method8310(var2);
						var8.field3321.method8310(var3);
						client.field1748.method2173(var8);
					}

					if (var0 == 4) {
						var8 = class152.method2679(class276.field3273, client.field1748.field1105);
						var8.field3321.method8312(var1);
						var8.field3321.method8310(var2);
						var8.field3321.method8310(var3);
						client.field1748.method2173(var8);
					}

					if (var0 == 5) {
						var8 = class152.method2679(class276.field3217, client.field1748.field1105);
						var8.field3321.method8312(var1);
						var8.field3321.method8310(var2);
						var8.field3321.method8310(var3);
						client.field1748.method2173(var8);
					}

					if (var0 == 6) {
						var8 = class152.method2679(class276.field3243, client.field1748.field1105);
						var8.field3321.method8312(var1);
						var8.field3321.method8310(var2);
						var8.field3321.method8310(var3);
						client.field1748.method2173(var8);
					}

					if (var0 == 7) {
						var8 = class152.method2679(class276.field3224, client.field1748.field1105);
						var8.field3321.method8312(var1);
						var8.field3321.method8310(var2);
						var8.field3321.method8310(var3);
						client.field1748.method2173(var8);
					}

					if (var0 == 8) {
						var8 = class152.method2679(class276.field3219, client.field1748.field1105);
						var8.field3321.method8312(var1);
						var8.field3321.method8310(var2);
						var8.field3321.method8310(var3);
						client.field1748.method2173(var8);
					}

					if (var0 == 9) {
						var8 = class152.method2679(class276.field3221, client.field1748.field1105);
						var8.field3321.method8312(var1);
						var8.field3321.method8310(var2);
						var8.field3321.method8310(var3);
						client.field1748.method2173(var8);
					}

					if (var0 == 10) {
						var8 = class152.method2679(class276.field3226, client.field1748.field1105);
						var8.field3321.method8312(var1);
						var8.field3321.method8310(var2);
						var8.field3321.method8310(var3);
						client.field1748.method2173(var8);
					}

				}
			}
		}
	}
}
