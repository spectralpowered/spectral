public class class493 {
	public Object field5070;
	public final int field5069;

	public class493(int var1) {
		this.field5069 = var1;
	}

	public class493(int var1, Object var2) {
		this.field5069 = var1;
		this.field5070 = var2;
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class493)) {
			return false;
		} else {
			class493 var2 = (class493)var1;
			if (var2.field5070 == null && null != this.field5070) {
				return false;
			} else if (null == this.field5070 && null != var2.field5070) {
				return false;
			} else {
				return var2.field5069 == this.field5069 && var2.field5070.equals(this.field5070);
			}
		}
	}
}
