import io.spectralpowered.ObfInfo;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfInfo(
	name = "w"
)
public class class260 extends class233 {
	@ObfInfo(
		owner = "w",
		name = "x",
		desc = "[B"
	)
	byte[] field2109;
	@ObfInfo(
		owner = "w",
		name = "v",
		desc = "I"
	)
	int field2111;
	@ObfInfo(
		owner = "w",
		name = "h",
		desc = "Ljavax/sound/sampled/AudioFormat;"
	)
	AudioFormat field2110;
	@ObfInfo(
		owner = "w",
		name = "e",
		desc = "Ljavax/sound/sampled/SourceDataLine;"
	)
	SourceDataLine field2112;

	@ObfInfo(
		owner = "w",
		name = "<init>",
		desc = "()V"
	)
	class260() {
	}

	@ObfInfo(
		owner = "w",
		name = "h",
		desc = "(I)V"
	)
	protected void method1012() {
		this.field2110 = new AudioFormat((float)class233.field1985, 16, class40.field207 ? 2 : 1, true, false);
		this.field2109 = new byte[256 << (class40.field207 ? 2 : 1)];
	}

	@ObfInfo(
		owner = "w",
		name = "e",
		desc = "(IB)V"
	)
	protected void method1019(int var1) throws LineUnavailableException {
		try {
			Info var3 = new Info(SourceDataLine.class, this.field2110, var1 << (class40.field207 ? 2 : 1));
			this.field2112 = (SourceDataLine)AudioSystem.getLine(var3);
			this.field2112.open();
			this.field2112.start();
			this.field2111 = var1;
		} catch (LineUnavailableException var4) {
			if (class259.method1108(var1) != 1) {
				this.method1019(class455.method2252(var1));
			} else {
				this.field2112 = null;
				throw var4;
			}
		}
	}

	@ObfInfo(
		owner = "w",
		name = "v",
		desc = "(B)I"
	)
	protected int method1013() {
		return this.field2111 - (this.field2112.available() >> (class40.field207 ? 2 : 1));
	}

	@ObfInfo(
		owner = "w",
		name = "x",
		desc = "()V"
	)
	protected void method1014() {
		int var1 = 256;
		if (class40.field207) {
			var1 <<= 1;
		}

		for (int var2 = 0; var2 < var1; ++var2) {
			int var3 = super.field1991[var2];
			if ((var3 + 8388608 & -16777216) != 0) {
				var3 = 8388607 ^ var3 >> 31;
			}

			this.field2109[var2 * 2] = (byte)(var3 >> 8);
			this.field2109[1 + var2 * 2] = (byte)(var3 >> 16);
		}

		this.field2112.write(this.field2109, 0, var1 << 1);
	}

	@ObfInfo(
		owner = "w",
		name = "m",
		desc = "(B)V"
	)
	protected void method1015() {
		if (null != this.field2112) {
			this.field2112.close();
			this.field2112 = null;
		}

	}

	@ObfInfo(
		owner = "w",
		name = "q",
		desc = "(I)V"
	)
	protected void method1016() {
		this.field2112.flush();
	}
}
