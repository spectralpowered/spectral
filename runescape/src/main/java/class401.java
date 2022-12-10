public class class401 {
	public int field4567;
	public int field4568;
	public int field4569;
	public int field4570;

	public class401(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	public class401(int var1, int var2, int var3, int var4) {
		this.method7473(var1, var2);
		this.method7472(var3, var4);
	}

	public void method7473(int var1, int var2) {
		this.field4569 = var1;
		this.field4568 = var2;
	}

	public void method7472(int var1, int var2) {
		this.field4570 = var1;
		this.field4567 = var2;
	}

	public boolean method7474(int var1, int var2) {
		return var1 >= this.field4569 && var1 < this.field4570 + this.field4569 && var2 >= this.field4568 && var2 < this.field4568 + this.field4567;
	}

	public String toString() {
		return null;
	}

	public void method7486(class401 var1, class401 var2) {
		this.method7476(var1, var2);
		this.method7477(var1, var2);
	}

	void method7476(class401 var1, class401 var2) {
		var2.field4569 = this.field4569;
		var2.field4570 = this.field4570;
		if (this.field4569 < var1.field4569) {
			var2.field4570 = (var2.field4570 * 866368565 - (var1.field4569 * 866368565 - this.field4569 * 866368565)) * -1664174563;
			var2.field4569 = var1.field4569;
		}

		if (var2.method7478() > var1.method7478()) {
			var2.field4570 -= var2.method7478() - var1.method7478();
		}

		if (var2.field4570 < 0) {
			var2.field4570 = 0;
		}

	}

	void method7477(class401 var1, class401 var2) {
		var2.field4568 = this.field4568;
		var2.field4567 = this.field4567;
		if (this.field4568 < var1.field4568) {
			var2.field4567 = (var2.field4567 * 1582333657 - (var1.field4568 * 1582333657 - this.field4568 * 1582333657)) * -1804459671;
			var2.field4568 = var1.field4568;
		}

		if (var2.method7479() > var1.method7479()) {
			var2.field4567 -= var2.method7479() - var1.method7479();
		}

		if (var2.field4567 < 0) {
			var2.field4567 = 0;
		}

	}

	int method7478() {
		return this.field4569 + this.field4570;
	}

	int method7479() {
		return this.field4567 + this.field4568;
	}
}
