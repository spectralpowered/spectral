import io.spectralpowered.ObfInfo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfInfo(
	name = "r"
)
public class class472 {
	@ObfInfo(
		owner = "r",
		name = "h",
		desc = "Ljava/util/concurrent/ExecutorService;"
	)
	ExecutorService field3964;
	@ObfInfo(
		owner = "r",
		name = "e",
		desc = "Ljava/util/concurrent/Future;"
	)
	Future field3965;
	@ObfInfo(
		owner = "r",
		name = "v",
		desc = "Lqy;"
	)
	final class127 field3966;
	@ObfInfo(
		owner = "r",
		name = "x",
		desc = "Lx;"
	)
	final class269 field3967;

	@ObfInfo(
		owner = "r",
		name = "<init>",
		desc = "(Lqy;Lx;)V"
	)
	public class472(class127 var1, class269 var2) {
		this.field3964 = Executors.newSingleThreadExecutor();
		this.field3966 = var1;
		this.field3967 = var2;
		this.method2334();
	}

	@ObfInfo(
		owner = "r",
		name = "h",
		desc = "(B)Z"
	)
	public boolean method2337() {
		return this.field3965.isDone();
	}

	@ObfInfo(
		owner = "r",
		name = "e",
		desc = "(B)V"
	)
	public void method2333() {
		this.field3964.shutdown();
		this.field3964 = null;
	}

	@ObfInfo(
		owner = "r",
		name = "v",
		desc = "(I)Lqy;"
	)
	public class127 method2336() {
		try {
			return (class127)this.field3965.get();
		} catch (Exception var3) {
			return null;
		}
	}

	@ObfInfo(
		owner = "r",
		name = "x",
		desc = "(B)V"
	)
	void method2334() {
		this.field3965 = this.field3964.submit(new class338(this, this.field3966, this.field3967));
	}

	@ObfInfo(
		owner = "r",
		name = "c",
		desc = "(ILbm;ZI)I"
	)
	static int method2335(int var0, class461 var1, boolean var2) {
		class120 var4 = class67.method299(class386.field3248[--class161.field1227]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			class386.field3248[++class161.field1227 - 1] = var4.field920;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			class386.field3248[++class161.field1227 - 1] = var4.field914;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			class386.field3249[++class386.field3250 - 1] = var4.field954;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			class386.field3248[++class161.field1227 - 1] = var4.field915;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			class386.field3248[++class161.field1227 - 1] = var4.field916;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			class386.field3248[++class161.field1227 - 1] = var4.field882;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			class386.field3248[++class161.field1227 - 1] = var4.field960;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			class386.field3248[++class161.field1227 - 1] = var4.field946;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			class386.field3248[++class161.field1227 - 1] = var4.field947;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) {
			class386.field3248[++class161.field1227 - 1] = var4.field1024;
			return 1;
		} else if (var0 == ScriptOpcodes._2610) {
			class386.field3248[++class161.field1227 - 1] = var4.field924;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			class386.field3248[++class161.field1227 - 1] = var4.field917;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			class386.field3248[++class161.field1227 - 1] = var4.field1035;
			return 1;
		} else if (var0 == ScriptOpcodes._2613) {
			class386.field3248[++class161.field1227 - 1] = var4.field939.method330();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			class386.field3248[++class161.field1227 - 1] = var4.field951 ? 1 : 0;
			return 1;
		} else {
			class146 var5;
			if (var0 == ScriptOpcodes.IF_INPUTUNK1) {
				var5 = var4.method509();
				class386.field3248[++class161.field1227 - 1] = null != var5 ? var5.field1160 : 0;
			}

			if (var0 == ScriptOpcodes.IF_INPUTUNK2) {
				var5 = var4.method509();
				class386.field3248[++class161.field1227 - 1] = var5 != null ? var5.field1162 : 0;
				return 1;
			} else {
				class262 var8;
				if (var0 == ScriptOpcodes.IF_INPUTFIELDUNK1) {
					var8 = var4.method485();
					class386.field3249[++class386.field3250 - 1] = var8 != null ? var8.method1130().method1640() : "";
					return 1;
				} else if (var0 == ScriptOpcodes.IF_INPUTFIELDUNK2) {
					var5 = var4.method509();
					class386.field3248[++class161.field1227 - 1] = var5 != null ? var5.field1161 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.IF_INPUTFIELDUNK3) {
					var8 = var4.method485();
					class386.field3248[++class161.field1227 - 1] = var8 != null ? var8.method1165() : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.IF_INPUTFIELDUNK4) {
					var8 = var4.method485();
					class386.field3248[++class161.field1227 - 1] = var8 != null ? var8.method1166() : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.IF_INPUTFIELDUNK5) {
					var8 = var4.method485();
					class386.field3248[++class161.field1227 - 1] = var8 != null ? var8.method1191() : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.IF_INPUTFIELDUNK6) {
					var8 = var4.method485();
					class386.field3248[++class161.field1227 - 1] = null != var8 && var8.method1177() ? 1 : 0;
					return 1;
				} else if (var0 != ScriptOpcodes.IF_INPUTFIELDUNK7) {
					if (var0 == ScriptOpcodes.IF_INPUTFIELDUNK8) {
						var8 = var4.method485();
						class386.field3249[++class386.field3250 - 1] = null != var8 ? var8.method1159().method1041() : "";
						return 1;
					} else if (var0 == ScriptOpcodes.IF_INPUTFIELDUNK9) {
						var8 = var4.method485();
						int var6 = null != var8 ? var8.method1146() : 0;
						int var7 = null != var8 ? var8.method1161() : 0;
						class386.field3248[++class161.field1227 - 1] = Math.min(var6, var7);
						class386.field3248[++class161.field1227 - 1] = Math.max(var6, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_INPUTFIELDUNK10) {
						var8 = var4.method485();
						class386.field3248[++class161.field1227 - 1] = var8 != null ? var8.method1161() : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.IF_INPUTFIELDUNK11) {
						var8 = var4.method485();
						class386.field3248[++class161.field1227 - 1] = null != var8 ? var8.method1187() : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.IF_INPUTFIELDUNK12) {
						var8 = var4.method485();
						class386.field3248[++class161.field1227 - 1] = null != var8 ? var8.method1168() : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.IF_INPUTFIELDUNK13) {
						var8 = var4.method485();
						class386.field3248[++class161.field1227 - 1] = var8 != null ? var8.method1169() : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.IF_INPUTFIELDUNK14) {
						var8 = var4.method485();
						class386.field3248[++class161.field1227 - 1] = var8 != null ? var8.method1181() : 0;
						return 1;
					} else {
						class109 var9;
						if (var0 == ScriptOpcodes.IF_INPUTFIELDUNK15) {
							var9 = var4.method498();
							class386.field3248[class161.field1227 - 1] = null != var9 ? var9.method427(class386.field3248[class161.field1227 - 1]) : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.IF_INPUTFIELDUNK16) {
							var9 = var4.method498();
							class386.field3248[class161.field1227 - 1] = null != var9 ? var9.method429((char)class386.field3248[class161.field1227 - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var8 = var4.method485();
					class386.field3248[++class161.field1227 - 1] = null != var8 && var8.method1116() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	@ObfInfo(
		owner = "r",
		name = "ld",
		desc = "(IS)V"
	)
	static final void method2331(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class50.field574.method2227(var0);
	}

	@ObfInfo(
		owner = "r",
		name = "la",
		desc = "(IIII)Lcx;"
	)
	static final class415 method2332(int var0, int var1, int var2) {
		class415 var4 = new class415();
		var4.field3426 = var1;
		var4.field3424 = var2;
		client.field394.method788(var4, (long)var0);
		class184.method835(var1);
		class120 var5 = class67.method299(var0);
		class184.method836(var5);
		if (null != client.field399) {
			class184.method836(client.field399);
			client.field399 = null;
		}

		class378.method1862(class329.field2600[var0 >> 16], var5, false);
		class148.method696(var1);
		if (client.field393 != -1) {
			class452.method2240(client.field393, 1);
		}

		return var4;
	}

	@ObfInfo(
		owner = "r",
		name = "mi",
		desc = "(I)V"
	)
	static final void method2338() {
		class299 var1 = class480.method2370(class356.field3028, client.field279.field4042);
		var1.field2403.method544(0);
		client.field279.method2389(var1);
	}
}
