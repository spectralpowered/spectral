public class class311 {
	static class469[] field3711;
	public int field3708;
	public int field3709;
	public int field3710;

	public class311(int var1, int var2, int var3) {
		this.field3708 = var1;
		this.field3709 = var2;
		this.field3710 = var3;
	}

	public class311(class311 var1) {
		this.field3708 = var1.field3708;
		this.field3709 = var1.field3709;
		this.field3710 = var1.field3710;
	}

	public class311(int var1) {
		if (var1 == -1) {
			this.field3708 = -1;
		} else {
			this.field3708 = var1 >> 28 & 3;
			this.field3709 = var1 >> 14 & 16383;
			this.field3710 = var1 & 16383;
		}

	}

	public int method6132() {
		return method2453(this.field3708, this.field3709, this.field3710);
	}

	static int method2453(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2;
	}

	public boolean equals(Object var1) {
		if (var1 == this) {
			return true;
		} else {
			return !(var1 instanceof class311) ? false : this.method6131((class311)var1);
		}
	}

	boolean method6131(class311 var1) {
		if (this.field3708 != var1.field3708) {
			return false;
		} else if (this.field3709 != var1.field3709) {
			return false;
		} else {
			return this.field3710 == var1.field3710;
		}
	}

	public int hashCode() {
		return this.method6132();
	}

	public String toString() {
		return this.method6143(",");
	}

	String method6143(String var1) {
		return this.field3708 + var1 + (this.field3709 >> 6) + var1 + (this.field3710 >> 6) + var1 + (this.field3709 & 63) + var1 + (this.field3710 & 63);
	}
}
