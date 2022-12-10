public class class308 extends class439 {
	public final int field3679;
	public final int field3680;
	public final int[] field3678;
	public final int[] field3681;

	class308(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.field3679 = var1;
		this.field3680 = var2;
		this.field3678 = var3;
		this.field3681 = var4;
	}

	public boolean method6108(int var1, int var2) {
		if (var2 >= 0 && var2 < this.field3681.length) {
			int var4 = this.field3681[var2];
			if (var1 >= var4 && var1 <= this.field3678[var2] + var4) {
				return true;
			}
		}

		return false;
	}
}
