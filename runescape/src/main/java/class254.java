import java.util.Iterator;
import java.util.LinkedList;

public class class254 {
	static class118 field2979;
	static class326 field2968;
	static class399 field2980;
	boolean field2975;
	class311 field2970;
	int field2967;
	int field2969;
	int field2971;
	int field2972;
	int field2973;
	int field2974;
	int field2978;
	String field2966;
	String field2977;
	LinkedList field2976;

	public class254() {
		this.field2978 = -1;
		this.field2973 = -1;
		this.field2969 = -1;
		this.field2970 = null;
		this.field2971 = Integer.MAX_VALUE;
		this.field2972 = 0;
		this.field2967 = Integer.MAX_VALUE;
		this.field2974 = 0;
		this.field2975 = false;
	}

	public void method4976(class467 var1, int var2) {
		this.field2978 = var2;
		this.field2966 = var1.method8335();
		this.field2977 = var1.method8335();
		this.field2970 = new class311(var1.method8480());
		this.field2973 = var1.method8480();
		var1.method8326();
		this.field2975 = var1.method8326() == 1;
		this.field2969 = var1.method8326();
		int var4 = var1.method8326();
		this.field2976 = new LinkedList();

		for (int var5 = 0; var5 < var4; ++var5) {
			this.field2976.add(this.method4977(var1));
		}

		this.method4982();
	}

	class257 method4977(class467 var1) {
		int var3 = var1.method8326();
		class247[] var4 = new class247[]{class247.field2918, class247.field2912, class247.field2914, class247.field2913};
		class247 var5 = (class247)class78.method1584(var4, var3);
		Object var6 = null;
		switch(var5.field2916) {
		case 0:
			var6 = new class235();
			break;
		case 1:
			var6 = new class238();
			break;
		case 2:
			var6 = new class255();
			break;
		case 3:
			var6 = new class241();
			break;
		default:
			throw new IllegalStateException("");
		}

		((class257)var6).method5075(var1);
		return (class257)var6;
	}

	public boolean method5022(int var1, int var2, int var3) {
		Iterator var5 = this.field2976.iterator();

		class257 var6;
		do {
			if (!var5.hasNext()) {
				return false;
			}

			var6 = (class257)var5.next();
		} while(!var6.method5071(var1, var2, var3));

		return true;
	}

	public boolean method4984(int var1, int var2) {
		int var4 = var1 / 64;
		int var5 = var2 / 64;
		if (var4 >= this.field2971 && var4 <= this.field2972) {
			if (var5 >= this.field2967 && var5 <= this.field2974) {
				Iterator var6 = this.field2976.iterator();

				class257 var7;
				do {
					if (!var6.hasNext()) {
						return false;
					}

					var7 = (class257)var6.next();
				} while(!var7.method5070(var1, var2));

				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public int[] method5013(int var1, int var2, int var3) {
		Iterator var5 = this.field2976.iterator();

		class257 var6;
		do {
			if (!var5.hasNext()) {
				return null;
			}

			var6 = (class257)var5.next();
		} while(!var6.method5071(var1, var2, var3));

		return var6.method5073(var1, var2, var3);
	}

	public class311 method4981(int var1, int var2) {
		Iterator var4 = this.field2976.iterator();

		class257 var5;
		do {
			if (!var4.hasNext()) {
				return null;
			}

			var5 = (class257)var4.next();
		} while(!var5.method5070(var1, var2));

		return var5.method5076(var1, var2);
	}

	void method4982() {
		Iterator var2 = this.field2976.iterator();

		while (var2.hasNext()) {
			class257 var3 = (class257)var2.next();
			var3.method5078(this);
		}

	}

	public int method4983() {
		return this.field2978;
	}

	public boolean method5014() {
		return this.field2975;
	}

	public String method4985() {
		return this.field2966;
	}

	public String method5015() {
		return this.field2977;
	}

	int method4994() {
		return this.field2973;
	}

	public int method4988() {
		return this.field2969;
	}

	public int method5001() {
		return this.field2971;
	}

	public int method4990() {
		return this.field2972;
	}

	public int method4991() {
		return this.field2967;
	}

	public int method4992() {
		return this.field2974;
	}

	public int method4993() {
		return this.field2970.field3709;
	}

	public int method5035() {
		return this.field2970.field3708;
	}

	public int method4995() {
		return this.field2970.field3710;
	}

	public class311 method4986() {
		return new class311(this.field2970);
	}

	static int method5033(int var0, class65 var1, boolean var2) {
		class290 var4 = var2 ? class187.field2044 : class341.field4273;
		if (var0 == CS2Opcodes.CC_GETTARGETMASK) {
			class69.field579[++class94.field920 - 1] = class292.method2150(class182.method3010(var4));
			return 1;
		} else if (var0 != CS2Opcodes.CC_GETOP) {
			if (var0 == CS2Opcodes.CC_GETOPBASE) {
				if (var4.field3399 == null) {
					class69.field580[++class69.field581 - 1] = "";
				} else {
					class69.field580[++class69.field581 - 1] = var4.field3399;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var5 = class69.field579[--class94.field920];
			--var5;
			if (null != var4.field3485 && var5 < var4.field3485.length && var4.field3485[var5] != null) {
				class69.field580[++class69.field581 - 1] = var4.field3485[var5];
			} else {
				class69.field580[++class69.field581 - 1] = "";
			}

			return 1;
		}
	}
}
