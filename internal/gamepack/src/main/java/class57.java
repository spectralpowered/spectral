import io.spectralpowered.ObfInfo;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfInfo(
	name = "fn"
)
public class class57 extends class139 {
	@ObfInfo(
		owner = "fn",
		name = "fy",
		desc = "I"
	)
	static int field589;
	@ObfInfo(
		owner = "fn",
		name = "jw",
		desc = "I"
	)
	static int field594;
	@ObfInfo(
		owner = "fn",
		name = "e",
		desc = "Z"
	)
	boolean field588;
	@ObfInfo(
		owner = "fn",
		name = "h",
		desc = "Z"
	)
	boolean field596;
	@ObfInfo(
		owner = "fn",
		name = "x",
		desc = "[I"
	)
	int[] field590;
	@ObfInfo(
		owner = "fn",
		name = "m",
		desc = "J"
	)
	long field591;
	@ObfInfo(
		owner = "fn",
		name = "f",
		desc = "B"
	)
	public byte field593;
	@ObfInfo(
		owner = "fn",
		name = "r",
		desc = "B"
	)
	public byte field595;
	@ObfInfo(
		owner = "fn",
		name = "q",
		desc = "Ljava/lang/String;"
	)
	public String field592;
	@ObfInfo(
		owner = "fn",
		name = "v",
		desc = "Ljava/util/List;"
	)
	public List field597;

	static {
		new BitSet(65536);
	}

	@ObfInfo(
		owner = "fn",
		name = "<init>",
		desc = "(Lqy;)V"
	)
	public class57(class127 var1) {
		this.field588 = true;
		this.field592 = null;
		this.method272(var1);
	}

	@ObfInfo(
		owner = "fn",
		name = "h",
		desc = "(I)[I"
	)
	public int[] method268() {
		if (this.field590 == null) {
			String[] var2 = new String[this.field597.size()];
			this.field590 = new int[this.field597.size()];

			for (int var3 = 0; var3 < this.field597.size(); this.field590[var3] = var3++) {
				var2[var3] = ((class49)this.field597.get(var3)).field567.method1102();
			}

			class201.method885(var2, this.field590);
		}

		return this.field590;
	}

	@ObfInfo(
		owner = "fn",
		name = "e",
		desc = "(Lee;I)V"
	)
	void method273(class49 var1) {
		this.field597.add(var1);
		this.field590 = null;
	}

	@ObfInfo(
		owner = "fn",
		name = "v",
		desc = "(II)V"
	)
	void method269(int var1) {
		this.field597.remove(var1);
		this.field590 = null;
	}

	@ObfInfo(
		owner = "fn",
		name = "x",
		desc = "(I)I"
	)
	public int method270() {
		return this.field597.size();
	}

	@ObfInfo(
		owner = "fn",
		name = "m",
		desc = "(Ljava/lang/String;I)I"
	)
	public int method271(String var1) {
		if (!this.field588) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var3 = 0; var3 < this.field597.size(); ++var3) {
				if (((class49)this.field597.get(var3)).field567.method1101().equalsIgnoreCase(var1)) {
					return var3;
				}
			}

			return -1;
		}
	}

	@ObfInfo(
		owner = "fn",
		name = "q",
		desc = "(Lqy;B)V"
	)
	void method272(class127 var1) {
		int var3 = var1.method547();
		if (0 != (var3 & 1)) {
			this.field596 = true;
		}

		if (0 != (var3 & 2)) {
			this.field588 = true;
		}

		int var4 = 2;
		if (0 != (var3 & 4)) {
			var4 = var1.method547();
		}

		super.field1134 = var1.method598();
		this.field591 = var1.method598();
		this.field592 = var1.method555();
		var1.method553();
		this.field595 = var1.method548();
		this.field593 = var1.method548();
		int var5 = var1.method549();
		if (var5 > 0) {
			this.field597 = new ArrayList(var5);

			for (int var6 = 0; var6 < var5; ++var6) {
				class49 var7 = new class49();
				if (this.field596) {
					var1.method598();
				}

				if (this.field588) {
					var7.field567 = new class257(var1.method555());
				}

				var7.field569 = var1.method548();
				var7.field568 = var1.method549();
				if (var4 >= 3) {
					var1.method553();
				}

				this.field597.add(var6, var7);
			}
		}

	}
}
