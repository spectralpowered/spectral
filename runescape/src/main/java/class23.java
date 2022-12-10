import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

public class class23 extends class50 {
	byte[] field127;
	int field129;
	AudioFormat field128;
	SourceDataLine field130;

	class23() {
	}

	protected void method955() {
		this.field128 = new AudioFormat((float)class50.field363, 16, class300.field3640 ? 2 : 1, true, false);
		this.field127 = new byte[256 << (class300.field3640 ? 2 : 1)];
	}

	protected void method998(int var1) throws LineUnavailableException {
		try {
			Info var3 = new Info(SourceDataLine.class, this.field128, var1 << (class300.field3640 ? 2 : 1));
			this.field130 = (SourceDataLine)AudioSystem.getLine(var3);
			this.field130.open();
			this.field130.start();
			this.field129 = var1;
		} catch (LineUnavailableException var4) {
			if (class279.method4663(var1) != 1) {
				this.method998(class279.method8200(var1));
			} else {
				this.field130 = null;
				throw var4;
			}
		}
	}

	protected int method957() {
		return this.field129 - (this.field130.available() >> (class300.field3640 ? 2 : 1));
	}

	protected void method958() {
		int var1 = 256;
		if (class300.field3640) {
			var1 <<= 1;
		}

		for (int var2 = 0; var2 < var1; ++var2) {
			int var3 = super.field370[var2];
			if ((var3 + 8388608 & -16777216) != 0) {
				var3 = 8388607 ^ var3 >> 31;
			}

			this.field127[var2 * 2] = (byte)(var3 >> 8);
			this.field127[1 + var2 * 2] = (byte)(var3 >> 16);
		}

		this.field130.write(this.field127, 0, var1 << 1);
	}

	protected void method959() {
		if (null != this.field130) {
			this.field130.close();
			this.field130 = null;
		}

	}

	protected void method960() {
		this.field130.flush();
	}
}
