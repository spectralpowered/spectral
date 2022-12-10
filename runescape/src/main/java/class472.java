public class class472 {
	boolean field4933;
	int field4932;
	int field4934;
	int field4935;
	int field4936;
	int field4937;
	int field4938;
	int field4939;
	int field4941;
	int field4942;
	int field4943;
	int field4944;
	int field4945;

	public class472() {
		this.field4941 = 0;
		this.field4938 = 0;
	}

	public void method8630(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11) {
		this.field4934 = var1;
		this.field4942 = var2;
		this.field4935 = var3;
		this.field4936 = var4;
		this.field4932 = var5;
		this.field4939 = var6;
		this.field4941 = var9;
		this.field4938 = var10;
		this.field4933 = var11;
	}

	public void method8622(int var1, int var2, int var3, int var4) {
		this.field4937 = var1;
		this.field4943 = var2;
		this.field4944 = var3;
		this.field4945 = var4;
	}

	public void method8621(class385 var1, class386 var2) {
		if (null != var2) {
			int var4 = var2.field4392;
			int var5 = Math.min(this.field4936, (int)(0.9F * (float)var4));
			int var6 = this.field4934 - this.field4932;
			int var7 = this.field4942 - this.field4939 + var4;
			class478.method8672(this.field4934, this.field4942, this.field4935 + this.field4934, this.field4942 + this.field4936);
			int var8 = this.field4938;
			int var9 = this.field4941;
			if (var8 > var9) {
				int var10 = var8;
				var8 = var9;
				var9 = var10;
			}

			class365 var20 = var1.method7172(0, var8);
			class365 var11 = var1.method7172(var8, var9);
			class365 var12 = var1.method7172(var9, var1.method7121());
			class365 var13 = var1.method7172(0, this.field4941);
			int var15;
			int var17;
			if (!var11.method6785()) {
				int var14 = var2.field4402 + var2.field4391;

				for (var15 = 0; var15 < var11.method6803(); ++var15) {
					class380 var16 = var11.method6790(var15);
					var17 = var16.field4467 + var6;
					int var18 = var2.method6848(var16.field4464);
					int var19 = var16.field4466 + var7 - var4;
					class478.method8680(var17, var19, var18, var14, this.field4945);
				}
			}

			if (!var20.method6785()) {
				var2.method6859(var20, var6, var7, this.field4937, this.field4943, -1);
			}

			if (!var11.method6785()) {
				var2.method6859(var11, var6, var7, this.field4944, this.field4943, -1);
			}

			if (!var12.method6785()) {
				var2.method6859(var12, var6, var7, this.field4937, this.field4943, -1);
			}

			if (this.field4933) {
				class423 var21 = var13.method6789();
				var15 = var6 + (Integer)var21.field4726;
				int var22 = var7 + (Integer)var21.field4724;
				var17 = var22 - var5;
				class478.method8715(var15, var22, var15, var17, this.field4937);
				if (-1 != this.field4943) {
					class478.method8715(var15 + 1, var22 + 1, var15 + 1, var17 + 1, this.field4943);
				}
			}

		}
	}
}
