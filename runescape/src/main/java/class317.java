public class class317 implements class343 {
	public static final class317 field3737;
	public static final class317 field3738;
	public static final class317 field3740;
	public static final class317 field3741;
	final int field3739;

	static {
		field3740 = new class317(-1);
		field3737 = new class317(0);
		field3741 = new class317(1);
		field3738 = new class317(2);
	}

	class317(int var1) {
		this.field3739 = var1;
	}

	public int method6487() {
		return this.field3739;
	}

	public static class400 method6176() {
		synchronized(class400.field4560) {
			if (class400.field4559 == 0) {
				return new class400();
			} else {
				class400.field4560[--class400.field4559].method7418();
				return class400.field4560[class400.field4559];
			}
		}
	}
}
