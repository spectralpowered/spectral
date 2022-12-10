import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class54 {
	static class451 field404;
	ExecutorService field406;
	Future field403;

	class54() {
		this.field406 = Executors.newSingleThreadExecutor();
		this.field403 = this.field406.submit(new class90());
	}

	void method1043() {
		this.field406.shutdown();
		this.field406 = null;
	}

	boolean method1044() {
		return this.field403.isDone();
	}

	SecureRandom method1045() {
		try {
			return (SecureRandom)this.field403.get();
		} catch (Exception var5) {
			SecureRandom var4 = new SecureRandom();
			var4.nextInt();
			return var4;
		}
	}

	static int method1054(int var0, class65 var1, boolean var2) {
		if (var0 < 1000) {
			return class123.method2324(var0, var1, var2);
		} else if (var0 < 1100) {
			return class244.method4878(var0, var1, var2);
		} else if (var0 < 1200) {
			return class85.method1715(var0, var1, var2);
		} else if (var0 < 1300) {
			return class59.method1110(var0, var1, var2);
		} else if (var0 < 1400) {
			return class44.method866(var0, var1, var2);
		} else if (var0 < 1500) {
			return class310.method6125(var0, var1, var2);
		} else if (var0 < 1600) {
			return class72.method1407(var0, var1, var2);
		} else if (var0 < 1700) {
			return class357.method6627(var0, var1, var2);
		} else if (var0 < 1800) {
			return class293.method5662(var0, var1, var2);
		} else if (var0 < 1900) {
			return class254.method5033(var0, var1, var2);
		} else if (var0 < 2000) {
			return class388.method7237(var0, var1, var2);
		} else if (var0 < 2100) {
			return class244.method4878(var0, var1, var2);
		} else if (var0 < 2200) {
			return class85.method1715(var0, var1, var2);
		} else if (var0 < 2300) {
			return class59.method1110(var0, var1, var2);
		} else if (var0 < 2400) {
			return class44.method866(var0, var1, var2);
		} else if (var0 < 2500) {
			return class310.method6125(var0, var1, var2);
		} else if (var0 < 2600) {
			return class14.method183(var0, var1, var2);
		} else if (var0 < 2700) {
			return class18.method224(var0, var1, var2);
		} else if (var0 < 2800) {
			return class97.method2036(var0, var1, var2);
		} else if (var0 < 2900) {
			return class255.method5064(var0, var1, var2);
		} else if (var0 < 3000) {
			return class388.method7237(var0, var1, var2);
		} else if (var0 < 3200) {
			return class403.method7517(var0, var1, var2);
		} else if (var0 < 3300) {
			return client.method3498(var0, var1, var2);
		} else if (var0 < 3400) {
			return class362.method6745(var0, var1, var2);
		} else if (var0 < 3500) {
			return class36.method479(var0, var1, var2);
		} else if (var0 < 3600) {
			return class176.method2955(var0, var1, var2);
		} else if (var0 < 3700) {
			return class237.method4728(var0, var1, var2);
		} else if (var0 < 3800) {
			return class69.method25(var0, var1, var2);
		} else if (var0 < 3900) {
			return class218.method4525(var0, var1, var2);
		} else if (var0 < 4000) {
			return class363.method6766(var0, var1, var2);
		} else if (var0 < 4100) {
			return class204.method4025(var0, var1, var2);
		} else if (var0 < 4200) {
			return class208.method4140(var0, var1, var2);
		} else if (var0 < 4300) {
			return class3.method27(var0, var1, var2);
		} else if (var0 < 5100) {
			return class132.method2463(var0, var1, var2);
		} else if (var0 < 5400) {
			return class263.method5258(var0, var1, var2);
		} else if (var0 < 5600) {
			return class101.method2075(var0, var1, var2);
		} else if (var0 < 5700) {
			return class210.method4147(var0, var1, var2);
		} else if (var0 < 6300) {
			return class10.method132(var0, var1, var2);
		} else if (var0 < 6600) {
			return class154.method2710(var0, var1, var2);
		} else if (var0 < 6700) {
			return class114.method2199(var0, var1, var2);
		} else if (var0 < 6800) {
			return class45.method896(var0, var1, var2);
		} else if (var0 < 6900) {
			return class74.method1496(var0, var1, var2);
		} else if (var0 < 7000) {
			return class69.method6104(var0, var1, var2);
		} else if (var0 < 7100) {
			return class69.method2945(var0, var1, var2);
		} else if (var0 < 7200) {
			return class88.method1950(var0, var1, var2);
		} else if (var0 < 7300) {
			return class69.method3560(var0, var1, var2);
		} else if (var0 < 7500) {
			return class251.method4961(var0, var1, var2);
		} else if (var0 < 7600) {
			return class438.method7995(var0, var1, var2);
		} else {
			return var0 < 7700 ? class69.method2062(var0, var1, var2) : 2;
		}
	}

	static final int method1053() {
		if (class186.field2040.method1774()) {
			return class384.field4486;
		} else {
			int var1 = class199.method3912(class141.field1363, class170.field1608, class384.field4486);
			return var1 - class392.field4523 < 800 && (class84.field773[class384.field4486][class141.field1363 >> 7][class170.field1608 >> 7] & 4) != 0 ? class384.field4486 : 3;
		}
	}
}
