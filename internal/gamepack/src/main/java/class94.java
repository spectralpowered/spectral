import io.spectralpowered.ObfInfo;
import java.util.zip.Inflater;

@ObfInfo(
	name = "rr"
)
public class class94 {
	@ObfInfo(
		owner = "rr",
		name = "h",
		desc = "Ljava/util/zip/Inflater;"
	)
	Inflater field781;

	@ObfInfo(
		owner = "rr",
		name = "<init>",
		desc = "()V"
	)
	public class94() {
		this(-1, 1000000, 1000000);
	}

	@ObfInfo(
		owner = "rr",
		name = "<init>",
		desc = "(III)V"
	)
	class94(int var1, int var2, int var3) {
	}

	@ObfInfo(
		owner = "rr",
		name = "h",
		desc = "(Lqy;[BI)V"
	)
	public void method386(class127 var1, byte[] var2) {
		if (var1.field1072[var1.field1070] == 31 && -117 == var1.field1072[1 + var1.field1070]) {
			if (this.field781 == null) {
				this.field781 = new Inflater(true);
			}

			try {
				this.field781.setInput(var1.field1072, var1.field1070 + 10, var1.field1072.length - (var1.field1070 + 10 + 8));
				this.field781.inflate(var2);
			} catch (Exception var5) {
				this.field781.reset();
				throw new RuntimeException("");
			}

			this.field781.reset();
		} else {
			throw new RuntimeException("");
		}
	}
}
