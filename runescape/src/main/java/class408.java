public abstract class class408 extends class281 implements class488 {
	static int field4615;
	static String[] field4616;

	protected class408(class335 var1, class340 var2, int var3) {
		super(var1, var2, var3);
	}

	public int method7561() {
		return super.field3306;
	}

	public Object method8824(int var1) {
		class438 var3 = this.method7563(var1);
		return var3 != null && var3.method7985() ? var3.method7986() : null;
	}

	public class493 method7568(class467 var1) {
		int var3 = var1.method8328();
		class438 var4 = this.method7563(var3);
		class493 var5 = new class493(var3);
		Class var6 = var4.field4795.field4892;
		if (var6 == Integer.class) {
			var5.field5070 = var1.method8480();
		} else if (var6 == Long.class) {
			var5.field5070 = var1.method8492();
		} else if (var6 == String.class) {
			var5.field5070 = var1.method8336();
		} else {
			if (!class479.class.isAssignableFrom(var6)) {
				throw new IllegalStateException();
			}

			try {
				class479 var7 = (class479)var6.newInstance();
				var7.method8748(var1);
				var5.field5070 = var7;
			} catch (InstantiationException var8) {
			} catch (IllegalAccessException var9) {
			}
		}

		return var5;
	}

	protected abstract class438 method7563(int var1);
}
