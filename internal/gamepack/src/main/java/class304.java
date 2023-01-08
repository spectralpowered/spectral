import io.spectralpowered.ObfInfo;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfInfo(
	name = "od"
)
public abstract class class304 {
	@ObfInfo(
		owner = "od",
		name = "j",
		desc = "[Lov;"
	)
	class368[] field2441;
	@ObfInfo(
		owner = "od",
		name = "b",
		desc = "I"
	)
	int field2439;
	@ObfInfo(
		owner = "od",
		name = "o",
		desc = "Ljava/util/Comparator;"
	)
	Comparator field2438;
	@ObfInfo(
		owner = "od",
		name = "i",
		desc = "Ljava/util/HashMap;"
	)
	HashMap field2440;
	@ObfInfo(
		owner = "od",
		name = "g",
		desc = "Ljava/util/HashMap;"
	)
	HashMap field2443;
	@ObfInfo(
		owner = "od",
		name = "u",
		desc = "I"
	)
	final int field2442;

	@ObfInfo(
		owner = "od",
		name = "<init>",
		desc = "(I)V"
	)
	class304(int var1) {
		this.field2439 = 0;
		this.field2438 = null;
		this.field2442 = var1;
		this.field2441 = this.method1485(var1);
		this.field2443 = new HashMap(var1 / 8);
		this.field2440 = new HashMap(var1 / 8);
	}

	@ObfInfo(
		owner = "od",
		name = "h",
		desc = "(B)Lov;"
	)
	abstract class368 method1482();

	@ObfInfo(
		owner = "od",
		name = "e",
		desc = "(II)[Lov;"
	)
	abstract class368[] method1485(int var1);

	@ObfInfo(
		owner = "od",
		name = "ar",
		desc = "(S)V"
	)
	public void method1466() {
		this.field2439 = 0;
		Arrays.fill(this.field2441, (Object)null);
		this.field2443.clear();
		this.field2440.clear();
	}

	@ObfInfo(
		owner = "od",
		name = "at",
		desc = "(I)I"
	)
	public int method1467() {
		return this.field2439;
	}

	@ObfInfo(
		owner = "od",
		name = "ay",
		desc = "(I)Z"
	)
	public boolean method1468() {
		return this.field2442 == this.field2439;
	}

	@ObfInfo(
		owner = "od",
		name = "an",
		desc = "(Lrp;B)Z"
	)
	public boolean method1469(class257 var1) {
		if (!var1.method1103()) {
			return false;
		} else {
			return this.field2443.containsKey(var1) ? true : this.field2440.containsKey(var1);
		}
	}

	@ObfInfo(
		owner = "od",
		name = "ab",
		desc = "(Lrp;B)Lov;"
	)
	public class368 method1484(class257 var1) {
		class368 var3 = this.method1483(var1);
		return var3 != null ? var3 : this.method1471(var1);
	}

	@ObfInfo(
		owner = "od",
		name = "al",
		desc = "(Lrp;B)Lov;"
	)
	class368 method1483(class257 var1) {
		return !var1.method1103() ? null : (class368)this.field2443.get(var1);
	}

	@ObfInfo(
		owner = "od",
		name = "ag",
		desc = "(Lrp;I)Lov;"
	)
	class368 method1471(class257 var1) {
		return !var1.method1103() ? null : (class368)this.field2440.get(var1);
	}

	@ObfInfo(
		owner = "od",
		name = "az",
		desc = "(Lrp;B)Z"
	)
	public final boolean method1488(class257 var1) {
		class368 var3 = this.method1483(var1);
		if (null == var3) {
			return false;
		} else {
			this.method1472(var3);
			return true;
		}
	}

	@ObfInfo(
		owner = "od",
		name = "ak",
		desc = "(Lov;I)V"
	)
	final void method1472(class368 var1) {
		int var3 = this.method1477(var1);
		if (var3 != -1) {
			this.method1481(var3);
			this.method1478(var1);
		}
	}

	@ObfInfo(
		owner = "od",
		name = "af",
		desc = "(Lrp;B)Lov;"
	)
	class368 method1473(class257 var1) {
		return this.method1474(var1, (class257)null);
	}

	@ObfInfo(
		owner = "od",
		name = "ai",
		desc = "(Lrp;Lrp;B)Lov;"
	)
	class368 method1474(class257 var1, class257 var2) {
		if (this.method1483(var1) != null) {
			throw new IllegalStateException();
		} else {
			class368 var4 = this.method1482();
			var4.method1815(var1, var2);
			this.method1479(var4);
			this.method1480(var4);
			return var4;
		}
	}

	@ObfInfo(
		owner = "od",
		name = "ax",
		desc = "(II)Lov;"
	)
	public final class368 method1475(int var1) {
		if (var1 >= 0 && var1 < this.field2439) {
			return this.field2441[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	@ObfInfo(
		owner = "od",
		name = "ah",
		desc = "(I)V"
	)
	public final void method1487() {
		if (this.field2438 == null) {
			Arrays.sort(this.field2441, 0, this.field2439);
		} else {
			Arrays.sort(this.field2441, 0, this.field2439, this.field2438);
		}

	}

	@ObfInfo(
		owner = "od",
		name = "aw",
		desc = "(Lov;Lrp;Lrp;I)V"
	)
	final void method1476(class368 var1, class257 var2, class257 var3) {
		this.method1478(var1);
		var1.method1815(var2, var3);
		this.method1480(var1);
	}

	@ObfInfo(
		owner = "od",
		name = "aj",
		desc = "(Lov;I)I"
	)
	final int method1477(class368 var1) {
		for (int var3 = 0; var3 < this.field2439; ++var3) {
			if (this.field2441[var3] == var1) {
				return var3;
			}
		}

		return -1;
	}

	@ObfInfo(
		owner = "od",
		name = "aq",
		desc = "(Lov;B)V"
	)
	final void method1478(class368 var1) {
		if (this.field2443.remove(var1.field3127) == null) {
			throw new IllegalStateException();
		} else {
			if (var1.field3128 != null) {
				this.field2440.remove(var1.field3128);
			}

		}
	}

	@ObfInfo(
		owner = "od",
		name = "ap",
		desc = "(Lov;I)V"
	)
	final void method1479(class368 var1) {
		this.field2441[++this.field2439 - 1] = var1;
	}

	@ObfInfo(
		owner = "od",
		name = "aa",
		desc = "(Lov;I)V"
	)
	final void method1480(class368 var1) {
		this.field2443.put(var1.field3127, var1);
		if (null != var1.field3128) {
			class368 var3 = (class368)this.field2440.put(var1.field3128, var1);
			if (var3 != null && var3 != var1) {
				var3.field3128 = null;
			}
		}

	}

	@ObfInfo(
		owner = "od",
		name = "ae",
		desc = "(IB)V"
	)
	final void method1481(int var1) {
		--this.field2439;
		if (var1 < this.field2439) {
			System.arraycopy(this.field2441, var1 + 1, this.field2441, var1, this.field2439 - var1);
		}

	}

	@ObfInfo(
		owner = "od",
		name = "ac",
		desc = "(I)V"
	)
	public final void method1470() {
		this.field2438 = null;
	}

	@ObfInfo(
		owner = "od",
		name = "bh",
		desc = "(Ljava/util/Comparator;I)V"
	)
	public final void method1489(Comparator var1) {
		if (null == this.field2438) {
			this.field2438 = var1;
		} else if (this.field2438 instanceof class392) {
			((class392)this.field2438).method1917(var1);
		}

	}

	@ObfInfo(
		owner = "od",
		name = "v",
		desc = "(CI)C"
	)
	public static char method1486(char var0) {
		switch(var0) {
		case ' ':
		case '-':
		case '_':
		case '\u00A0':
			return '_';
		case '#':
		case '[':
		case ']':
			return var0;
		case '\u00C0':
		case '\u00C1':
		case '\u00C2':
		case '\u00C3':
		case '\u00C4':
		case '\u00E0':
		case '\u00E1':
		case '\u00E2':
		case '\u00E3':
		case '\u00E4':
			return 'a';
		case '\u00C7':
		case '\u00E7':
			return 'c';
		case '\u00C8':
		case '\u00C9':
		case '\u00CA':
		case '\u00CB':
		case '\u00E8':
		case '\u00E9':
		case '\u00EA':
		case '\u00EB':
			return 'e';
		case '\u00CD':
		case '\u00CE':
		case '\u00CF':
		case '\u00ED':
		case '\u00EE':
		case '\u00EF':
			return 'i';
		case '\u00D1':
		case '\u00F1':
			return 'n';
		case '\u00D2':
		case '\u00D3':
		case '\u00D4':
		case '\u00D5':
		case '\u00D6':
		case '\u00F2':
		case '\u00F3':
		case '\u00F4':
		case '\u00F5':
		case '\u00F6':
			return 'o';
		case '\u00D9':
		case '\u00DA':
		case '\u00DB':
		case '\u00DC':
		case '\u00F9':
		case '\u00FA':
		case '\u00FB':
		case '\u00FC':
			return 'u';
		case '\u00DF':
			return 'b';
		case '\u00FF':
		case '\u0178':
			return 'y';
		default:
			return Character.toLowerCase(var0);
		}
	}
}
