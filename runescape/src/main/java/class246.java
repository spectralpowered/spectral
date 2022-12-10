import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class class246 extends class254 {
	HashSet field2909;
	HashSet field2910;
	List field2911;

	class246() {
	}

	void method4884(class467 var1, class467 var2, int var3, boolean var4) {
		this.method4976(var1, var3);
		int var6 = var2.method8328();
		this.field2909 = new HashSet(var6);

		int var7;
		for (var7 = 0; var7 < var6; ++var7) {
			class212 var8 = new class212();

			try {
				var8.method4332(var2);
			} catch (IllegalStateException var13) {
				continue;
			}

			this.field2909.add(var8);
		}

		var7 = var2.method8328();
		this.field2910 = new HashSet(var7);

		for (int var11 = 0; var11 < var7; ++var11) {
			class244 var9 = new class244();

			try {
				var9.method4866(var2);
			} catch (IllegalStateException var12) {
				continue;
			}

			this.field2910.add(var9);
		}

		this.method4881(var2, var4);
	}

	void method4881(class467 var1, boolean var2) {
		this.field2911 = new LinkedList();
		int var4 = var1.method8328();

		for (int var5 = 0; var5 < var4; ++var5) {
			int var6 = var1.method8344();
			class311 var7 = new class311(var1.method8480());
			boolean var8 = var1.method8326() == 1;
			if (var2 || !var8) {
				this.field2911.add(new class249((class311)null, var7, var6, (class243)null));
			}
		}

	}

	static void method4885(class88 var0, boolean var1) {
		if (null != var0 && var0.method2043() && !var0.field846) {
			var0.field844 = false;
			if ((client.field1743 && class87.field818 > 50 || class87.field818 > 200) && var1 && var0.field985 == var0.field953) {
				var0.field844 = true;
			}

			int var3 = var0.field1012 >> 7;
			int var4 = var0.field948 >> 7;
			if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
				long var5 = class40.method601(0, 0, 0, false, var0.field848);
				if (var0.field839 != null && client.field1700 >= var0.field851 && client.field1700 < var0.field835) {
					var0.field844 = false;
					var0.field834 = class199.method3912(var0.field1012, var0.field948, class384.field4486);
					var0.field952 = client.field1700;
					class33.field194.method4164(class384.field4486, var0.field1012, var0.field948, var0.field834, 60, var0, var0.field962, var5, var0.field853, var0.field841, var0.field837, var0.field833);
				} else {
					if ((var0.field1012 & 127) == 64 && 64 == (var0.field948 & 127)) {
						if (client.field1797[var3][var4] == client.field1798) {
							return;
						}

						client.field1797[var3][var4] = client.field1798;
					}

					var0.field834 = class199.method3912(var0.field1012, var0.field948, class384.field4486);
					var0.field952 = client.field1700;
					class33.field194.method4261(class384.field4486, var0.field1012, var0.field948, var0.field834, 60, var0, var0.field962, var5, var0.field949);
				}
			}
		}

	}
}
