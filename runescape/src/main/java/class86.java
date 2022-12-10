import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class class86 {
	static class326 field798;
	boolean field795;
	boolean field799;
	boolean field800;
	boolean field801;
	double field810;
	int field803;
	int field804;
	int field805;
	int field806;
	int field807;
	int field809;
	String field808;
	final Map field802;

	static int method1876(int var0, int var1) {
		class81 var3 = (class81)class81.field749.method8177((long)var0);
		if (var3 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var3.field748.length ? var3.field748[var1] : 0;
		}
	}

	class86() {
		this.field799 = false;
		this.field801 = false;
		this.field810 = 0.8D;
		this.field804 = 127;
		this.field805 = 127;
		this.field806 = 127;
		this.field807 = -1;
		this.field808 = null;
		this.field809 = 1;
		this.field802 = new LinkedHashMap();
		this.method1771(true);
	}

	class86(class467 var1) {
		this.field799 = false;
		this.field801 = false;
		this.field810 = 0.8D;
		this.field804 = 127;
		this.field805 = 127;
		this.field806 = 127;
		this.field807 = -1;
		this.field808 = null;
		this.field809 = 1;
		this.field802 = new LinkedHashMap();
		if (null != var1 && var1.field4917 != null) {
			int var2 = var1.method8326();
			if (var2 >= 0 && var2 <= 10) {
				if (var1.method8326() == 1) {
					this.field795 = true;
				}

				if (var2 > 1) {
					this.field800 = var1.method8326() == 1;
				}

				if (var2 > 3) {
					this.field809 = var1.method8326();
				}

				if (var2 > 2) {
					int var3 = var1.method8326();

					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = var1.method8480();
						int var6 = var1.method8480();
						this.field802.put(var5, var6);
					}
				}

				if (var2 > 4) {
					this.field808 = var1.method8334();
				}

				if (var2 > 5) {
					this.field799 = var1.method8333();
				}

				if (var2 > 6) {
					this.field810 = (double)var1.method8326() / 100.0D;
					this.field804 = var1.method8326();
					this.field805 = var1.method8326();
					this.field806 = var1.method8326();
				}

				if (var2 > 7) {
					this.field807 = var1.method8326();
				}

				if (var2 > 8) {
					this.field801 = var1.method8326() == 1;
				}

				if (var2 > 9) {
					this.field803 = var1.method8480();
				}
			} else {
				this.method1771(true);
			}
		} else {
			this.method1771(true);
		}

	}

	void method1771(boolean var1) {
	}

	class467 method1772() {
		class467 var2 = new class467(417, true);
		var2.method8323(10);
		var2.method8323(this.field795 ? 1 : 0);
		var2.method8323(this.field800 ? 1 : 0);
		var2.method8323(this.field809);
		var2.method8323(this.field802.size());
		Iterator var3 = this.field802.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			var2.method8312((Integer)var4.getKey());
			var2.method8312((Integer)var4.getValue());
		}

		var2.method8316(null != this.field808 ? this.field808 : "");
		var2.method8315(this.field799);
		var2.method8323((int)(this.field810 * 100.0D));
		var2.method8323(this.field804);
		var2.method8323(this.field805);
		var2.method8323(this.field806);
		var2.method8323(this.field807);
		var2.method8323(this.field801 ? 1 : 0);
		var2.method8312(this.field803);
		return var2;
	}

	static void method4349() {
		class459 var1 = null;

		try {
			var1 = class94.method2015("", class268.field3153.field4224, true);
			class467 var2 = class186.field2040.method1772();
			var1.method8184(var2.field4917, 0, var2.field4915);
		} catch (Exception var4) {
		}

		try {
			if (var1 != null) {
				var1.method8186(true);
			}
		} catch (Exception var3) {
		}

	}

	void method1848(boolean var1) {
		this.field795 = var1;
		method4349();
	}

	boolean method1774() {
		return this.field795;
	}

	void method1823(boolean var1) {
		this.field799 = var1;
		method4349();
	}

	boolean method1775() {
		return this.field799;
	}

	void method1810(boolean var1) {
		this.field800 = var1;
		method4349();
	}

	boolean method1790() {
		return this.field800;
	}

	void method1832(boolean var1) {
		this.field801 = var1;
		method4349();
	}

	void method1795() {
		this.method1832(!this.field801);
	}

	boolean method1781() {
		return this.field801;
	}

	void method1782(int var1) {
		this.field803 = var1;
		method4349();
	}

	int method1783() {
		return this.field803;
	}

	void method1837(double var1) {
		this.field810 = var1;
		method4349();
	}

	double method1784() {
		return this.field810;
	}

	void method1776(int var1) {
		this.field804 = var1;
		method4349();
	}

	int method1787() {
		return this.field804;
	}

	void method1833(int var1) {
		this.field805 = var1;
		method4349();
	}

	int method1788() {
		return this.field805;
	}

	void method1789(int var1) {
		this.field806 = var1;
		method4349();
	}

	int method1868() {
		return this.field806;
	}

	void method1791(String var1) {
		this.field808 = var1;
		method4349();
	}

	String method1792() {
		return this.field808;
	}

	void method1793(int var1) {
		this.field807 = var1;
		method4349();
	}

	int method1786() {
		return this.field807;
	}

	void method1822(int var1) {
		this.field809 = var1;
		method4349();
	}

	int method1796() {
		return this.field809;
	}

	void method1797(String var1, int var2) {
		int var4 = this.method1800(var1);
		if (this.field802.size() >= 10 && !this.field802.containsKey(var4)) {
			Iterator var5 = this.field802.entrySet().iterator();
			var5.next();
			var5.remove();
		}

		this.field802.put(var4, var2);
		method4349();
	}

	boolean method1798(String var1) {
		int var3 = this.method1800(var1);
		return this.field802.containsKey(var3);
	}

	int method1799(String var1) {
		int var3 = this.method1800(var1);
		return !this.field802.containsKey(var3) ? 0 : (Integer)this.field802.get(var3);
	}

	int method1800(String var1) {
		String var4 = var1.toLowerCase();
		int var5 = var4.length();
		int var6 = 0;

		for (int var7 = 0; var7 < var5; ++var7) {
			var6 = (var6 << 5) - var6 + var4.charAt(var7);
		}

		return var6;
	}
}
