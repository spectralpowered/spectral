public class class32 extends class55 {
	int field178;
	public boolean field182;
	public byte[] field179;
	public int field180;
	public int field181;

	class32(int var1, byte[] var2, int var3, int var4) {
		this.field181 = var1;
		this.field179 = var2;
		this.field180 = var3;
		this.field178 = var4;
	}

	class32(int var1, byte[] var2, int var3, int var4, boolean var5) {
		this.field181 = var1;
		this.field179 = var2;
		this.field180 = var3;
		this.field178 = var4;
		this.field182 = var5;
	}

	public class32 method424(class77 var1) {
		this.field179 = var1.method1531(this.field179);
		this.field181 = var1.method1530(this.field181);
		if (this.field180 == this.field178) {
			this.field180 = this.field178 = var1.method1525(this.field180);
		} else {
			this.field180 = var1.method1525(this.field180);
			this.field178 = var1.method1525(this.field178);
			if (this.field180 == this.field178) {
				--this.field180;
			}
		}

		return this;
	}
}
