import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class18 {
	ExecutorService field102;
	Future field103;
	final class24 field107;
	final class467 field104;

	public class18(class467 var1, class24 var2) {
		this.field102 = Executors.newSingleThreadExecutor();
		this.field104 = var1;
		this.field107 = var2;
		this.method216();
	}

	public boolean method227() {
		return this.field103.isDone();
	}

	public void method215() {
		this.field102.shutdown();
		this.field102 = null;
	}

	public class467 method226() {
		try {
			return (class467)this.field103.get();
		} catch (Exception var3) {
			return null;
		}
	}

	void method216() {
		this.field103 = this.field102.submit(new class5(this, this.field104, this.field107));
	}

	static int method224(int var0, class65 var1, boolean var2) {
		class290 var4 = class180.method2988(class69.field579[--class94.field920]);
		if (var0 == CS2Opcodes.IF_GETSCROLLX) {
			class69.field579[++class94.field920 - 1] = var4.field3427;
			return 1;
		} else if (var0 == CS2Opcodes.IF_GETSCROLLY) {
			class69.field579[++class94.field920 - 1] = var4.field3421;
			return 1;
		} else if (var0 == CS2Opcodes.IF_GETTEXT) {
			class69.field580[++class69.field581 - 1] = var4.field3461;
			return 1;
		} else if (var0 == CS2Opcodes.IF_GETSCROLLWIDTH) {
			class69.field579[++class94.field920 - 1] = var4.field3422;
			return 1;
		} else if (var0 == CS2Opcodes.IF_GETSCROLLHEIGHT) {
			class69.field579[++class94.field920 - 1] = var4.field3423;
			return 1;
		} else if (var0 == CS2Opcodes.IF_GETMODELZOOM) {
			class69.field579[++class94.field920 - 1] = var4.field3382;
			return 1;
		} else if (var0 == CS2Opcodes.IF_GETMODELANGLE_X) {
			class69.field579[++class94.field920 - 1] = var4.field3467;
			return 1;
		} else if (var0 == CS2Opcodes.IF_GETMODELANGLE_Z) {
			class69.field579[++class94.field920 - 1] = var4.field3453;
			return 1;
		} else if (var0 == CS2Opcodes.IF_GETMODELANGLE_Y) {
			class69.field579[++class94.field920 - 1] = var4.field3454;
			return 1;
		} else if (var0 == CS2Opcodes.IF_GETTRANS) {
			class69.field579[++class94.field920 - 1] = var4.field3533;
			return 1;
		} else if (var0 == CS2Opcodes._2610) {
			class69.field579[++class94.field920 - 1] = var4.field3431;
			return 1;
		} else if (var0 == CS2Opcodes.IF_GETCOLOUR) {
			class69.field579[++class94.field920 - 1] = var4.field3424;
			return 1;
		} else if (var0 == CS2Opcodes.IF_GETFILLCOLOUR) {
			class69.field579[++class94.field920 - 1] = var4.field3545;
			return 1;
		} else if (var0 == CS2Opcodes._2613) {
			class69.field579[++class94.field920 - 1] = var4.field3446.method6487();
			return 1;
		} else if (var0 == CS2Opcodes.IF_GETMODELTRANSPARENT) {
			class69.field579[++class94.field920 - 1] = var4.field3458 ? 1 : 0;
			return 1;
		} else {
			class288 var5;
			if (var0 == CS2Opcodes.IF_INPUTUNK1) {
				var5 = var4.method5636();
				class69.field579[++class94.field920 - 1] = null != var5 ? var5.field3375 : 0;
			}

			if (var0 == CS2Opcodes.IF_INPUTUNK2) {
				var5 = var4.method5636();
				class69.field579[++class94.field920 - 1] = var5 != null ? var5.field3377 : 0;
				return 1;
			} else {
				class295 var8;
				if (var0 == CS2Opcodes.IF_INPUTFIELDUNK1) {
					var8 = var4.method5510();
					class69.field580[++class69.field581 - 1] = var8 != null ? var8.method5693().method7171() : "";
					return 1;
				} else if (var0 == CS2Opcodes.IF_INPUTFIELDUNK2) {
					var5 = var4.method5636();
					class69.field579[++class94.field920 - 1] = var5 != null ? var5.field3376 : 0;
					return 1;
				} else if (var0 == CS2Opcodes.IF_INPUTFIELDUNK3) {
					var8 = var4.method5510();
					class69.field579[++class94.field920 - 1] = var8 != null ? var8.method5739() : 0;
					return 1;
				} else if (var0 == CS2Opcodes.IF_INPUTFIELDUNK4) {
					var8 = var4.method5510();
					class69.field579[++class94.field920 - 1] = var8 != null ? var8.method5740() : 0;
					return 1;
				} else if (var0 == CS2Opcodes.IF_INPUTFIELDUNK5) {
					var8 = var4.method5510();
					class69.field579[++class94.field920 - 1] = var8 != null ? var8.method5911() : 0;
					return 1;
				} else if (var0 == CS2Opcodes.IF_INPUTFIELDUNK6) {
					var8 = var4.method5510();
					class69.field579[++class94.field920 - 1] = null != var8 && var8.method5763() ? 1 : 0;
					return 1;
				} else if (var0 != CS2Opcodes.IF_INPUTFIELDUNK7) {
					if (var0 == CS2Opcodes.IF_INPUTFIELDUNK8) {
						var8 = var4.method5510();
						class69.field580[++class69.field581 - 1] = null != var8 ? var8.method5730().method6806() : "";
						return 1;
					} else if (var0 == CS2Opcodes.IF_INPUTFIELDUNK9) {
						var8 = var4.method5510();
						int var6 = null != var8 ? var8.method5713() : 0;
						int var7 = null != var8 ? var8.method5734() : 0;
						class69.field579[++class94.field920 - 1] = Math.min(var6, var7);
						class69.field579[++class94.field920 - 1] = Math.max(var6, var7);
						return 1;
					} else if (var0 == CS2Opcodes.IF_INPUTFIELDUNK10) {
						var8 = var4.method5510();
						class69.field579[++class94.field920 - 1] = var8 != null ? var8.method5734() : 0;
						return 1;
					} else if (var0 == CS2Opcodes.IF_INPUTFIELDUNK11) {
						var8 = var4.method5510();
						class69.field579[++class94.field920 - 1] = null != var8 ? var8.method5854() : 0;
						return 1;
					} else if (var0 == CS2Opcodes.IF_INPUTFIELDUNK12) {
						var8 = var4.method5510();
						class69.field579[++class94.field920 - 1] = null != var8 ? var8.method5742() : 0;
						return 1;
					} else if (var0 == CS2Opcodes.IF_INPUTFIELDUNK13) {
						var8 = var4.method5510();
						class69.field579[++class94.field920 - 1] = var8 != null ? var8.method5744() : 0;
						return 1;
					} else if (var0 == CS2Opcodes.IF_INPUTFIELDUNK14) {
						var8 = var4.method5510();
						class69.field579[++class94.field920 - 1] = var8 != null ? var8.method5824() : 0;
						return 1;
					} else {
						class41 var9;
						if (var0 == CS2Opcodes.IF_INPUTFIELDUNK15) {
							var9 = var4.method5530();
							class69.field579[class94.field920 - 1] = null != var9 ? var9.method688(class69.field579[class94.field920 - 1]) : 0;
							return 1;
						} else if (var0 == CS2Opcodes.IF_INPUTFIELDUNK16) {
							var9 = var4.method5530();
							class69.field579[class94.field920 - 1] = null != var9 ? var9.method691((char)class69.field579[class94.field920 - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var8 = var4.method5510();
					class69.field579[++class94.field920 - 1] = null != var8 && var8.method5678() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	static final class102 method214(int var0, int var1, int var2) {
		class102 var4 = new class102();
		var4.field1057 = var1;
		var4.field1052 = var2;
		client.field1863.method8170(var4, (long)var0);
		class53.method1039(var1);
		class290 var5 = class180.method2988(var0);
		class53.method1040(var5);
		if (null != client.field1868) {
			class53.method1040(client.field1868);
			client.field1868 = null;
		}

		class164.method2766(class72.field625[var0 >> 16], var5, false);
		class47.method920(var1);
		if (client.field1862 != -1) {
			client.method6246(client.field1862, 1);
		}

		return var4;
	}
}
