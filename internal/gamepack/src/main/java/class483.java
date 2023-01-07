import io.spectralpowered.ObfInfo;
import java.awt.Component;

@ObfInfo(
	name = "cz"
)
public class class483 implements class78 {
	@ObfInfo(
		owner = "cz",
		name = "mf",
		desc = "I"
	)
	static int field4027;
	@ObfInfo(
		owner = "cz",
		name = "e",
		desc = "Lcz;"
	)
	static final class483 field4022;
	@ObfInfo(
		owner = "cz",
		name = "x",
		desc = "Lcz;"
	)
	static final class483 field4024;
	@ObfInfo(
		owner = "cz",
		name = "m",
		desc = "Lcz;"
	)
	static final class483 field4025;
	@ObfInfo(
		owner = "cz",
		name = "v",
		desc = "Lcz;"
	)
	static final class483 field4026;
	@ObfInfo(
		owner = "cz",
		name = "h",
		desc = "Lcz;"
	)
	static final class483 field4028;
	@ObfInfo(
		owner = "cz",
		name = "q",
		desc = "I"
	)
	final int field4023;

	static {
		field4028 = new class483(0);
		field4022 = new class483(1);
		field4026 = new class483(2);
		field4024 = new class483(3);
		field4025 = new class483(4);
	}

	@ObfInfo(
		owner = "cz",
		name = "<init>",
		desc = "(I)V"
	)
	class483(int var1) {
		this.field4023 = var1;
	}

	@ObfInfo(
		owner = "cz",
		name = "e",
		desc = "(B)I"
	)
	public int method330() {
		return this.field4023;
	}

	@ObfInfo(
		owner = "cz",
		name = "h",
		desc = "(Ljava/awt/Component;B)V"
	)
	static void method2374(Component var0) {
		var0.removeMouseListener(class466.field3857);
		var0.removeMouseMotionListener(class466.field3857);
		var0.removeFocusListener(class466.field3857);
		class466.field3856 = 0;
	}

	@ObfInfo(
		owner = "cz",
		name = "v",
		desc = "(III)Lkd;"
	)
	public static class120 method2375(int var0, int var1) {
		class120 var3 = class67.method299(var0);
		if (var1 == -1) {
			return var3;
		} else {
			return null != var3 && null != var3.field1031 && var1 < var3.field1031.length ? var3.field1031[var1] : null;
		}
	}

	@ObfInfo(
		owner = "cz",
		name = "az",
		desc = "(IB)I"
	)
	static int method2377(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
	}

	@ObfInfo(
		owner = "cz",
		name = "bw",
		desc = "(ILky;ZB)V"
	)
	static void method2376(int var0, class464 var1, boolean var2) {
		class46 var4 = client.method197().method1301(var0);
		int var5 = class113.field846.field3214;
		int var6 = class312.field2465 + (class113.field846.field2672 >> 7);
		int var7 = class325.field2575 + (class113.field846.field2608 >> 7);
		class464 var8 = new class464(var5, var6, var7);
		client.method197().method1323(var4, var8, var1, var2);
	}
}
