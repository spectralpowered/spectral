import java.util.HashMap;

public class class442 {
	class337 field4813;
	class337 field4816;
	HashMap field4812;

	public class442(class337 var1, class337 var2) {
		this.field4816 = var1;
		this.field4813 = var2;
		this.field4812 = new HashMap();
	}

	public HashMap method8006(class436[] var1) {
		HashMap var3 = new HashMap();
		class436[] var4 = var1;

		for (int var5 = 0; var5 < var4.length; ++var5) {
			class436 var6 = var4[var5];
			if (this.field4812.containsKey(var6)) {
				var3.put(var6, this.field4812.get(var6));
			} else {
				class337 var8 = this.field4816;
				class337 var9 = this.field4813;
				String var10 = var6.field4792;
				int var13 = var8.method6319(var10);
				int var12 = var8.method6326(var13, "");
				class386 var7 = class372.method6995(var8, var9, var13, var12);
				if (var7 != null) {
					this.field4812.put(var6, var7);
					var3.put(var6, var7);
				}
			}
		}

		return var3;
	}
}
