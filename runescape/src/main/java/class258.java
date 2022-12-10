public abstract class class258 {
	int field2998;
	int field2999;
	public final class311 field2997;
	public final class311 field3000;

	class258(class311 var1, class311 var2) {
		this.field2997 = var1;
		this.field3000 = var2;
	}

	boolean method5091(int var1, int var2) {
		if (this.method5100(var1, var2)) {
			return true;
		} else {
			return this.method5098(var1, var2);
		}
	}

	boolean method5103() {
		return this.method5105() >= 0;
	}

	boolean method5100(int var1, int var2) {
		if (!this.method5103()) {
			return false;
		} else {
			class169 var4 = class163.method2762(this.method5105());
			int var5 = this.method5093();
			int var6 = this.method5118();
			switch(var4.field1580.field2115) {
			case 0:
				if (var1 < this.field2999 || var1 >= this.field2999 + var5) {
					return false;
				}
				break;
			case 1:
				if (var1 >= this.field2999 - var5 / 2 && var1 <= this.field2999 + var5 / 2) {
					break;
				}

				return false;
			case 2:
				if (var1 <= this.field2999 - var5 || var1 > this.field2999) {
					return false;
				}
			}

			switch(var4.field1595.field2133) {
			case 0:
				if (var2 <= this.field2998 - var6 || var2 > this.field2998) {
					return false;
				}
				break;
			case 1:
				if (var2 >= this.field2998 && var2 < var6 + this.field2998) {
					break;
				}

				return false;
			case 2:
				if (var2 < this.field2998 - var6 / 2 || var2 > var6 / 2 + this.field2998) {
					return false;
				}
			}

			return true;
		}
	}

	boolean method5098(int var1, int var2) {
		class243 var4 = this.method5113();
		if (null == var4) {
			return false;
		} else if (var1 >= this.field2999 - var4.field2897 / 2 && var1 <= this.field2999 + var4.field2897 / 2) {
			return var2 >= this.field2998 && var2 <= this.field2998 + var4.field2896;
		} else {
			return false;
		}
	}

	abstract int method5093();

	public abstract int method5105();

	abstract class243 method5113();

	abstract int method5118();
}
