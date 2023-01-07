import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "fd"
)
public class class107 extends class203 {
	@ObfInfo(
		owner = "fd",
		name = "h",
		desc = "J"
	)
	long field821;

	@ObfInfo(
		owner = "fd",
		name = "<init>",
		desc = "()V"
	)
	public class107() {
		this.field821 = System.nanoTime();
	}

	@ObfInfo(
		owner = "fd",
		name = "h",
		desc = "(I)V"
	)
	public void method889() {
		this.field821 = System.nanoTime();
	}

	@ObfInfo(
		owner = "fd",
		name = "e",
		desc = "(III)I"
	)
	public int method890(int var1, int var2) {
		long var4 = 1000000L * (long)var2;
		long var6 = this.field821 - System.nanoTime();
		if (var6 < var4) {
			var6 = var4;
		}

		class286.method1421(var6 / 1000000L);
		long var8 = System.nanoTime();

		int var10;
		for (var10 = 0; var10 < 10 && (var10 < 1 || this.field821 < var8); this.field821 += (long)var1 * 1000000L) {
			++var10;
		}

		if (this.field821 < var8) {
			this.field821 = var8;
		}

		return var10;
	}
}
