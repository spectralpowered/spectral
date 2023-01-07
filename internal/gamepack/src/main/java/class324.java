import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "mz"
)
public class class324 {
	@ObfInfo(
		owner = "mz",
		name = "h",
		desc = "B"
	)
	byte field2570;
	@ObfInfo(
		owner = "mz",
		name = "q",
		desc = "I"
	)
	public int field2566;
	@ObfInfo(
		owner = "mz",
		name = "e",
		desc = "I"
	)
	public int field2567;
	@ObfInfo(
		owner = "mz",
		name = "v",
		desc = "I"
	)
	public int field2568;
	@ObfInfo(
		owner = "mz",
		name = "x",
		desc = "I"
	)
	public int field2569;
	@ObfInfo(
		owner = "mz",
		name = "m",
		desc = "I"
	)
	public int field2571;

	@ObfInfo(
		owner = "mz",
		name = "<init>",
		desc = "()V"
	)
	public class324() {
	}

	@ObfInfo(
		owner = "mz",
		name = "<init>",
		desc = "(Lqy;Z)V"
	)
	public class324(class127 var1, boolean var2) {
		this.field2570 = var1.method548();
		this.field2567 = var1.method549();
		this.field2568 = var1.method595();
		this.field2569 = var1.method595();
		this.field2571 = var1.method595();
		this.field2566 = var1.method595();
		if (var2) {
			int var4 = 0;
			boolean var5 = false;

			while (true) {
				int var6 = var1.method547();
				if (var6 == 255) {
					Integer var3 = var5 ? var4 : null;
					this.method1655(var3);
					break;
				}

				if (var6 != 0) {
					throw new IllegalStateException("");
				}

				while (true) {
					int var7 = var1.method547();
					if (var7 == 255) {
						break;
					}

					--var1.field1070;
					if (var1.method549() != 0) {
						throw new IllegalStateException("");
					}

					if (var5) {
						throw new IllegalStateException("");
					}

					var4 = var1.method595();
					var5 = true;
				}
			}
		}

	}

	@ObfInfo(
		owner = "mz",
		name = "h",
		desc = "(Ljava/lang/Integer;I)V"
	)
	void method1655(Integer var1) {
	}

	@ObfInfo(
		owner = "mz",
		name = "e",
		desc = "(B)I"
	)
	public int method1656() {
		return this.field2570 & 7;
	}

	@ObfInfo(
		owner = "mz",
		name = "v",
		desc = "(I)I"
	)
	public int method1658() {
		return (this.field2570 & 8) == 8 ? 1 : 0;
	}

	@ObfInfo(
		owner = "mz",
		name = "x",
		desc = "(IB)V"
	)
	void method1659(int var1) {
		this.field2570 &= -8;
		this.field2570 = (byte)(this.field2570 | var1 & 7);
	}

	@ObfInfo(
		owner = "mz",
		name = "m",
		desc = "(II)V"
	)
	void method1657(int var1) {
		this.field2570 &= -9;
		if (var1 == 1) {
			this.field2570 = (byte)(this.field2570 | 8);
		}

	}
}
