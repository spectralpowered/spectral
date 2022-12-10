public final class class270 {
	class277 field3166;
	class351 field3162;
	class454 field3164;
	int field3163;
	int field3165;

	public class270(int var1) {
		this(var1, var1);
	}

	public class270(int var1, int var2) {
		this.field3162 = new class351();
		this.field3163 = var1;
		this.field3165 = var1;

		int var3;
		for (var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
		}

		this.field3164 = new class454(var3);
	}

	public Object method5280(long var1) {
		class264 var3 = (class264)this.field3164.method8135(var1);
		if (var3 == null) {
			return null;
		} else {
			Object var4 = var3.method5262();
			if (var4 == null) {
				var3.method7951();
				var3.method7996();
				this.field3165 += var3.field3021;
				return null;
			} else {
				if (var3.method5266()) {
					class269 var5 = new class269(var4, var3.field3021);
					this.field3164.method8133(var5, var3.field4773);
					this.field3162.method6518(var5);
					var5.field4797 = 0L;
					var3.method7951();
					var3.method7996();
				} else {
					this.field3162.method6518(var3);
					var3.field4797 = 0L;
				}

				return var4;
			}
		}
	}

	void method5301(long var1) {
		class264 var3 = (class264)this.field3164.method8135(var1);
		this.method5282(var3);
	}

	void method5282(class264 var1) {
		if (var1 != null) {
			var1.method7951();
			var1.method7996();
			this.field3165 += var1.field3021;
		}

	}

	public void method5283(Object var1, long var2) {
		this.method5284(var1, var2, 1);
	}

	public void method5284(Object var1, long var2, int var4) {
		if (var4 > this.field3163) {
			throw new IllegalStateException();
		} else {
			this.method5301(var2);
			this.field3165 -= var4;

			while (this.field3165 < 0) {
				class264 var5 = (class264)this.field3162.method6520();
				if (var5 == null) {
					throw new RuntimeException("");
				}

				if (!var5.method5266()) {
				}

				this.method5282(var5);
				if (this.field3166 != null) {
					this.field3166.method5317(var5.method5262());
				}
			}

			class269 var6 = new class269(var1, var4);
			this.field3164.method8133(var6, var2);
			this.field3162.method6518(var6);
			var6.field4797 = 0L;
		}
	}

	public void method5295(int var1) {
		for (class264 var2 = (class264)this.field3162.method6521(); var2 != null; var2 = (class264)this.field3162.method6530()) {
			if (var2.method5266()) {
				if (var2.method5262() == null) {
					var2.method7951();
					var2.method7996();
					this.field3165 += var2.field3021;
				}
			} else if (++var2.field4797 > (long)var1) {
				class280 var3 = new class280(var2.method5262(), var2.field3021);
				this.field3164.method8133(var3, var2.field4773);
				class351.method6529(var3, var2);
				var2.method7951();
				var2.method7996();
			}
		}

	}

	public void method5279() {
		this.field3162.method6517();
		this.field3164.method8122();
		this.field3165 = this.field3163;
	}
}
