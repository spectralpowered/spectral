import io.spectralpowered.ObfInfo;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfInfo(
	name = "ni"
)
public final class class255 {
	@ObfInfo(
		owner = "ni",
		name = "q",
		desc = "Lns;"
	)
	final class237 field2096;
	@ObfInfo(
		owner = "ni",
		name = "x",
		desc = "Lnm;"
	)
	final class335 field2097;
	@ObfInfo(
		owner = "ni",
		name = "v",
		desc = "Lnm;"
	)
	final class335 field2099;
	@ObfInfo(
		owner = "ni",
		name = "f",
		desc = "I"
	)
	final int field2100;
	@ObfInfo(
		owner = "ni",
		name = "h",
		desc = "Ljava/util/Comparator;"
	)
	final Comparator field2101;
	@ObfInfo(
		owner = "ni",
		name = "e",
		desc = "Ljava/util/Map;"
	)
	final Map field2095;
	@ObfInfo(
		owner = "ni",
		name = "m",
		desc = "J"
	)
	final long field2098;

	@ObfInfo(
		owner = "ni",
		name = "<init>",
		desc = "(ILns;)V"
	)
	public class255(int var1, class237 var2) {
		this(-1L, var1, var2);
	}

	@ObfInfo(
		owner = "ni",
		name = "<init>",
		desc = "(JILns;)V"
	)
	class255(long var1, int var3, class237 var4) {
		this.field2101 = new class347(this);
		this.field2098 = var1;
		this.field2100 = var3;
		this.field2096 = var4;
		if (this.field2100 == -1) {
			this.field2095 = new HashMap(64);
			this.field2099 = new class335(64, this.field2101);
			this.field2097 = null;
		} else {
			if (null == this.field2096) {
				throw new IllegalArgumentException("");
			}

			this.field2095 = new HashMap(this.field2100);
			this.field2099 = new class335(this.field2100, this.field2101);
			this.field2097 = new class335(this.field2100);
		}

	}

	@ObfInfo(
		owner = "ni",
		name = "h",
		desc = "(I)Z"
	)
	boolean method1095() {
		return -1 != this.field2100;
	}

	@ObfInfo(
		owner = "ni",
		name = "e",
		desc = "(Ljava/lang/Object;I)Ljava/lang/Object;"
	)
	public Object method1098(Object var1) {
		synchronized(this) {
			if (this.field2098 != -1L) {
				this.method1100();
			}

			class382 var4 = (class382)this.field2095.get(var1);
			if (null == var4) {
				return null;
			} else {
				this.method1097(var4, false);
				return var4.field3226;
			}
		}
	}

	@ObfInfo(
		owner = "ni",
		name = "v",
		desc = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;"
	)
	public Object method1096(Object var1, Object var2) {
		synchronized(this) {
			if (this.field2098 != -1L) {
				this.method1100();
			}

			class382 var5 = (class382)this.field2095.get(var1);
			if (var5 != null) {
				Object var9 = var5.field3226;
				var5.field3226 = var2;
				this.method1097(var5, false);
				return var9;
			} else {
				class382 var6;
				if (this.method1095() && this.field2095.size() == this.field2100) {
					var6 = (class382)this.field2097.remove();
					this.field2095.remove(var6.field3225);
					this.field2099.remove(var6);
				}

				var6 = new class382(var2, var1);
				this.field2095.put(var1, var6);
				this.method1097(var6, true);
				return null;
			}
		}
	}

	@ObfInfo(
		owner = "ni",
		name = "x",
		desc = "(Lnz;ZI)V"
	)
	void method1097(class382 var1, boolean var2) {
		if (!var2) {
			this.field2099.remove(var1);
			if (this.method1095() && !this.field2097.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field3224 = System.currentTimeMillis();
		if (this.method1095()) {
			switch(this.field2096.field2008) {
			case 0:
				var1.field3227 = var1.field3224;
				break;
			case 1:
				++var1.field3227;
			}

			this.field2097.add(var1);
		}

		this.field2099.add(var1);
	}

	@ObfInfo(
		owner = "ni",
		name = "m",
		desc = "(I)V"
	)
	void method1100() {
		if (this.field2098 == -1L) {
			throw new IllegalStateException("");
		} else {
			long var2 = System.currentTimeMillis() - this.field2098;

			while (!this.field2099.isEmpty()) {
				class382 var4 = (class382)this.field2099.peek();
				if (var4.field3224 >= var2) {
					return;
				}

				this.field2095.remove(var4.field3225);
				this.field2099.remove(var4);
				if (this.method1095()) {
					this.field2097.remove(var4);
				}
			}

		}
	}

	@ObfInfo(
		owner = "ni",
		name = "q",
		desc = "(I)V"
	)
	public void method1099() {
		synchronized(this) {
			this.field2095.clear();
			this.field2099.clear();
			if (this.method1095()) {
				this.field2097.clear();
			}

		}
	}

	@ObfInfo(
		owner = "ni",
		name = "m",
		desc = "(II)V"
	)
	public static void method1093(int var0) {
		class40.field201 = 1;
		class253.field2089 = null;
		class342.field2747 = -1;
		class40.field204 = -1;
		class489.field4078 = 0;
		class463.field3847 = false;
		class40.field203 = var0;
	}

	@ObfInfo(
		owner = "ni",
		name = "e",
		desc = "(I)V"
	)
	static void method1094() {
		class71.field638 = (short[][][])null;
		class419.field3433 = (short[][][])null;
		class71.field643 = (byte[][][])null;
		class471.field3958 = (byte[][][])null;
		class210.field1819 = (int[][][])null;
		class36.field182 = (byte[][][])null;
		class71.field640 = (int[][])null;
		class71.field641 = null;
		class233.field1986 = null;
		class71.field648 = null;
		class267.field2214 = null;
		class365.field3099 = null;
	}
}
