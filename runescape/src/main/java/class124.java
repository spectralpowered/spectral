public class class124 {
	boolean field1232;
	boolean field1233;
	class400 field1229;
	class400 field1230;
	class400 field1235;
	class400[] field1223;
	class400[] field1228;
	float[][] field1225;
	float[][] field1231;
	float[][] field1234;
	float[][] field1236;
	final class400[] field1226;
	public class124 field1224;
	public final int field1227;

	public class124(int var1, class467 var2, boolean var3) {
		this.field1229 = new class400();
		this.field1233 = true;
		this.field1235 = new class400();
		this.field1232 = true;
		this.field1230 = new class400();
		this.field1227 = var2.method8329();
		this.field1226 = new class400[var1];
		this.field1223 = new class400[this.field1226.length];
		this.field1228 = new class400[this.field1226.length];
		this.field1225 = new float[this.field1226.length][3];

		for (int var4 = 0; var4 < this.field1226.length; ++var4) {
			this.field1226[var4] = new class400(var2, var3);
			this.field1225[var4][0] = var2.method8332();
			this.field1225[var4][1] = var2.method8332();
			this.field1225[var4][2] = var2.method8332();
		}

		this.method2325();
	}

	void method2325() {
		this.field1231 = new float[this.field1226.length][3];
		this.field1234 = new float[this.field1226.length][3];
		this.field1236 = new float[this.field1226.length][3];
		class400 var2 = class317.method6176();

		for (int var3 = 0; var3 < this.field1226.length; ++var3) {
			class400 var4 = this.method2356(var3);
			var2.method7420(var4);
			var2.method7428();
			this.field1231[var3] = var2.method7417();
			this.field1234[var3][0] = var4.field4563[12];
			this.field1234[var3][1] = var4.field4563[13];
			this.field1234[var3][2] = var4.field4563[14];
			this.field1236[var3] = var4.method7430();
		}

		var2.method7431();
	}

	class400 method2356(int var1) {
		return this.field1226[var1];
	}

	class400 method2328(int var1) {
		if (null == this.field1223[var1]) {
			this.field1223[var1] = new class400(this.method2356(var1));
			if (null != this.field1224) {
				this.field1223[var1].method7424(this.field1224.method2328(var1));
			} else {
				this.field1223[var1].method7424(class400.field4564);
			}
		}

		return this.field1223[var1];
	}

	class400 method2355(int var1) {
		if (null == this.field1228[var1]) {
			this.field1228[var1] = new class400(this.method2328(var1));
			this.field1228[var1].method7428();
		}

		return this.field1228[var1];
	}

	void method2332(class400 var1) {
		this.field1229.method7420(var1);
		this.field1233 = true;
		this.field1232 = true;
	}

	class400 method2331() {
		return this.field1229;
	}

	class400 method2338() {
		if (this.field1233) {
			this.field1235.method7420(this.method2331());
			if (null != this.field1224) {
				this.field1235.method7424(this.field1224.method2338());
			}

			this.field1233 = false;
		}

		return this.field1235;
	}

	public class400 method2329(int var1) {
		if (this.field1232) {
			this.field1230.method7420(this.method2355(var1));
			this.field1230.method7424(this.method2338());
			this.field1232 = false;
		}

		return this.field1230;
	}

	float[] method2334(int var1) {
		return this.field1231[var1];
	}

	float[] method2335(int var1) {
		return this.field1234[var1];
	}

	float[] method2336(int var1) {
		return this.field1236[var1];
	}
}
