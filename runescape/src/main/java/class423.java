public class class423 {
	public final Object field4724;
	public final Object field4726;

	public class423(Object var1, Object var2) {
		this.field4726 = var1;
		this.field4724 = var2;
	}

	public String toString() {
		return this.field4726 + ", " + this.field4724;
	}

	public boolean equals(Object var1) {
		if (null != var1 && var1 instanceof class423) {
			class423 var2 = (class423)var1;
			if (null == this.field4726) {
				if (null != var2.field4726) {
					return false;
				}
			} else if (!this.field4726.equals(var2.field4726)) {
				return false;
			}

			if (null == this.field4724) {
				if (null != var2.field4724) {
					return false;
				}
			} else if (!this.field4724.equals(var2.field4724)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		int var1 = 0;
		if (this.field4726 != null) {
			var1 += this.field4726.hashCode();
		}

		if (this.field4724 != null) {
			var1 += 31 * this.field4724.hashCode();
		}

		return var1;
	}
}
