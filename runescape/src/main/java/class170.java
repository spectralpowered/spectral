import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class class170 extends class428 {
	static int field1603;
	static int field1608;
	boolean field1602;
	boolean field1612;
	int[] field1604;
	long field1605;
	public byte field1607;
	public byte field1610;
	public String field1606;
	public List field1614;

	static {
		new BitSet(65536);
	}

	public class170(class467 var1) {
		this.field1602 = true;
		this.field1606 = null;
		this.method2891(var1);
	}

	public int[] method2886() {
		if (this.field1604 == null) {
			String[] var2 = new String[this.field1614.size()];
			this.field1604 = new int[this.field1614.size()];

			for (int var3 = 0; var3 < this.field1614.size(); this.field1604[var3] = var3++) {
				var2[var3] = ((class135)this.field1614.get(var3)).field1327.method8772();
			}

			class81.method1623(var2, this.field1604);
		}

		return this.field1604;
	}

	void method2896(class135 var1) {
		this.field1614.add(var1);
		this.field1604 = null;
	}

	void method2888(int var1) {
		this.field1614.remove(var1);
		this.field1604 = null;
	}

	public int method2889() {
		return this.field1614.size();
	}

	public int method2890(String var1) {
		if (!this.field1602) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var3 = 0; var3 < this.field1614.size(); ++var3) {
				if (((class135)this.field1614.get(var3)).field1327.method8771().equalsIgnoreCase(var1)) {
					return var3;
				}
			}

			return -1;
		}
	}

	void method2891(class467 var1) {
		int var3 = var1.method8326();
		if (0 != (var3 & 1)) {
			this.field1612 = true;
		}

		if (0 != (var3 & 2)) {
			this.field1602 = true;
		}

		int var4 = 2;
		if (0 != (var3 & 4)) {
			var4 = var1.method8326();
		}

		super.field4773 = var1.method8492();
		this.field1605 = var1.method8492();
		this.field1606 = var1.method8335();
		var1.method8333();
		this.field1610 = var1.method8327();
		this.field1607 = var1.method8327();
		int var5 = var1.method8328();
		if (var5 > 0) {
			this.field1614 = new ArrayList(var5);

			for (int var6 = 0; var6 < var5; ++var6) {
				class135 var7 = new class135();
				if (this.field1612) {
					var1.method8492();
				}

				if (this.field1602) {
					var7.field1327 = new class483(var1.method8335());
				}

				var7.field1330 = var1.method8327();
				var7.field1329 = var1.method8328();
				if (var4 >= 3) {
					var1.method8333();
				}

				this.field1614.add(var6, var7);
			}
		}

	}
}
