import io.spectralpowered.ObfInfo;
import java.util.Arrays;
import java.util.Date;

@ObfInfo(
	name = "oj"
)
public final class class44 {
	@ObfInfo(
		owner = "oj",
		name = "q",
		desc = "Loj;"
	)
	public static final class44 field542;
	@ObfInfo(
		owner = "oj",
		name = "ic",
		desc = "[Lrx;"
	)
	static class266[] field540;
	@ObfInfo(
		owner = "oj",
		name = "e",
		desc = "[Loj;"
	)
	static class44[] field539;
	@ObfInfo(
		owner = "oj",
		name = "x",
		desc = "I"
	)
	static int field538;
	@ObfInfo(
		owner = "oj",
		name = "v",
		desc = "I"
	)
	static int field543;
	@ObfInfo(
		owner = "oj",
		name = "m",
		desc = "[F"
	)
	public float[] field541;

	static {
		field539 = new class44[0];
		field543 = 100;
		field539 = new class44[100];
		field538 = 0;
		field542 = new class44();
	}

	@ObfInfo(
		owner = "oj",
		name = "<init>",
		desc = "()V"
	)
	public class44() {
		this.field541 = new float[16];
		this.method207();
	}

	@ObfInfo(
		owner = "oj",
		name = "<init>",
		desc = "(Loj;)V"
	)
	public class44(class44 var1) {
		this.field541 = new float[16];
		this.method209(var1);
	}

	@ObfInfo(
		owner = "oj",
		name = "<init>",
		desc = "(Lqy;Z)V"
	)
	public class44(class127 var1, boolean var2) {
		this.field541 = new float[16];
		this.method204(var1, var2);
	}

	@ObfInfo(
		owner = "oj",
		name = "e",
		desc = "(I)V"
	)
	public void method217() {
		synchronized(field539) {
			if (field538 < field543 - 1) {
				field539[++field538 - 1] = this;
			}

		}
	}

	@ObfInfo(
		owner = "oj",
		name = "v",
		desc = "(Lqy;ZI)V"
	)
	void method204(class127 var1, boolean var2) {
		if (var2) {
			class43 var4 = new class43();
			int var7 = var1.method550();
			var7 &= 16383;
			float var6 = (float)((double)((float)var7 / 16384.0F) * 6.283185307179586D);
			var4.method199(var6);
			int var10 = var1.method550();
			var10 &= 16383;
			float var9 = (float)((double)((float)var10 / 16384.0F) * 6.283185307179586D);
			var4.method200(var9);
			int var13 = var1.method550();
			var13 &= 16383;
			float var12 = (float)(6.283185307179586D * (double)((float)var13 / 16384.0F));
			var4.method203(var12);
			var4.method202((float)var1.method550(), (float)var1.method550(), (float)var1.method550());
			this.method214(var4);
		} else {
			for (int var14 = 0; var14 < 16; ++var14) {
				this.field541[var14] = var1.method552();
			}
		}

	}

	@ObfInfo(
		owner = "oj",
		name = "x",
		desc = "(B)[F"
	)
	float[] method205() {
		float[] var2 = new float[3];
		if ((double)this.field541[2] < 0.999D && (double)this.field541[2] > -0.999D) {
			var2[1] = (float)(-Math.asin((double)this.field541[2]));
			double var3 = Math.cos((double)var2[1]);
			var2[0] = (float)Math.atan2((double)this.field541[6] / var3, (double)this.field541[10] / var3);
			var2[2] = (float)Math.atan2((double)this.field541[1] / var3, (double)this.field541[0] / var3);
		} else {
			var2[0] = 0.0F;
			var2[1] = (float)Math.atan2((double)this.field541[2], 0.0D);
			var2[2] = (float)Math.atan2((double)(-this.field541[9]), (double)this.field541[5]);
		}

		return var2;
	}

	@ObfInfo(
		owner = "oj",
		name = "m",
		desc = "(I)[F"
	)
	public float[] method206() {
		float[] var2 = new float[]{(float)(-Math.asin((double)this.field541[6])), 0.0F, 0.0F};
		double var3 = Math.cos((double)var2[0]);
		double var5;
		double var7;
		if (Math.abs(var3) > 0.005D) {
			var5 = (double)this.field541[2];
			var7 = (double)this.field541[10];
			double var9 = (double)this.field541[4];
			double var11 = (double)this.field541[5];
			var2[1] = (float)Math.atan2(var5, var7);
			var2[2] = (float)Math.atan2(var9, var11);
		} else {
			var5 = (double)this.field541[1];
			var7 = (double)this.field541[0];
			if (this.field541[6] < 0.0F) {
				var2[1] = (float)Math.atan2(var5, var7);
			} else {
				var2[1] = (float)(-Math.atan2(var5, var7));
			}

			var2[2] = 0.0F;
		}

		return var2;
	}

	@ObfInfo(
		owner = "oj",
		name = "q",
		desc = "(B)V"
	)
	void method207() {
		this.field541[0] = 1.0F;
		this.field541[1] = 0.0F;
		this.field541[2] = 0.0F;
		this.field541[3] = 0.0F;
		this.field541[4] = 0.0F;
		this.field541[5] = 1.0F;
		this.field541[6] = 0.0F;
		this.field541[7] = 0.0F;
		this.field541[8] = 0.0F;
		this.field541[9] = 0.0F;
		this.field541[10] = 1.0F;
		this.field541[11] = 0.0F;
		this.field541[12] = 0.0F;
		this.field541[13] = 0.0F;
		this.field541[14] = 0.0F;
		this.field541[15] = 1.0F;
	}

	@ObfInfo(
		owner = "oj",
		name = "f",
		desc = "(I)V"
	)
	public void method208() {
		this.field541[0] = 0.0F;
		this.field541[1] = 0.0F;
		this.field541[2] = 0.0F;
		this.field541[3] = 0.0F;
		this.field541[4] = 0.0F;
		this.field541[5] = 0.0F;
		this.field541[6] = 0.0F;
		this.field541[7] = 0.0F;
		this.field541[8] = 0.0F;
		this.field541[9] = 0.0F;
		this.field541[10] = 0.0F;
		this.field541[11] = 0.0F;
		this.field541[12] = 0.0F;
		this.field541[13] = 0.0F;
		this.field541[14] = 0.0F;
		this.field541[15] = 0.0F;
	}

	@ObfInfo(
		owner = "oj",
		name = "r",
		desc = "(Loj;I)V"
	)
	public void method209(class44 var1) {
		System.arraycopy(var1.field541, 0, this.field541, 0, 16);
	}

	@ObfInfo(
		owner = "oj",
		name = "u",
		desc = "(FS)V"
	)
	public void method210(float var1) {
		this.method211(var1, var1, var1);
	}

	@ObfInfo(
		owner = "oj",
		name = "b",
		desc = "(FFFI)V"
	)
	public void method211(float var1, float var2, float var3) {
		this.method207();
		this.field541[0] = var1;
		this.field541[5] = var2;
		this.field541[10] = var3;
	}

	@ObfInfo(
		owner = "oj",
		name = "j",
		desc = "(Loj;I)V"
	)
	public void method219(class44 var1) {
		for (int var3 = 0; var3 < this.field541.length; ++var3) {
			float[] var10000 = this.field541;
			var10000[var3] += var1.field541[var3];
		}

	}

	@ObfInfo(
		owner = "oj",
		name = "g",
		desc = "(Loj;I)V"
	)
	public void method212(class44 var1) {
		float var3 = this.field541[3] * var1.field541[12] + this.field541[2] * var1.field541[8] + var1.field541[4] * this.field541[1] + var1.field541[0] * this.field541[0];
		float var4 = this.field541[1] * var1.field541[5] + var1.field541[1] * this.field541[0] + var1.field541[9] * this.field541[2] + var1.field541[13] * this.field541[3];
		float var5 = this.field541[1] * var1.field541[6] + var1.field541[2] * this.field541[0] + var1.field541[10] * this.field541[2] + this.field541[3] * var1.field541[14];
		float var6 = this.field541[3] * var1.field541[15] + this.field541[2] * var1.field541[11] + var1.field541[3] * this.field541[0] + var1.field541[7] * this.field541[1];
		float var7 = var1.field541[0] * this.field541[4] + var1.field541[4] * this.field541[5] + var1.field541[8] * this.field541[6] + this.field541[7] * var1.field541[12];
		float var8 = var1.field541[13] * this.field541[7] + var1.field541[1] * this.field541[4] + this.field541[5] * var1.field541[5] + this.field541[6] * var1.field541[9];
		float var9 = var1.field541[14] * this.field541[7] + var1.field541[10] * this.field541[6] + var1.field541[6] * this.field541[5] + var1.field541[2] * this.field541[4];
		float var10 = this.field541[5] * var1.field541[7] + var1.field541[3] * this.field541[4] + this.field541[6] * var1.field541[11] + var1.field541[15] * this.field541[7];
		float var11 = var1.field541[12] * this.field541[11] + this.field541[10] * var1.field541[8] + var1.field541[0] * this.field541[8] + this.field541[9] * var1.field541[4];
		float var12 = this.field541[11] * var1.field541[13] + this.field541[9] * var1.field541[5] + var1.field541[1] * this.field541[8] + var1.field541[9] * this.field541[10];
		float var13 = this.field541[9] * var1.field541[6] + var1.field541[2] * this.field541[8] + var1.field541[10] * this.field541[10] + this.field541[11] * var1.field541[14];
		float var14 = var1.field541[11] * this.field541[10] + this.field541[9] * var1.field541[7] + this.field541[8] * var1.field541[3] + var1.field541[15] * this.field541[11];
		float var15 = this.field541[15] * var1.field541[12] + var1.field541[8] * this.field541[14] + var1.field541[4] * this.field541[13] + var1.field541[0] * this.field541[12];
		float var16 = this.field541[12] * var1.field541[1] + this.field541[13] * var1.field541[5] + this.field541[14] * var1.field541[9] + var1.field541[13] * this.field541[15];
		float var17 = var1.field541[14] * this.field541[15] + var1.field541[10] * this.field541[14] + var1.field541[6] * this.field541[13] + var1.field541[2] * this.field541[12];
		float var18 = var1.field541[15] * this.field541[15] + this.field541[13] * var1.field541[7] + var1.field541[3] * this.field541[12] + var1.field541[11] * this.field541[14];
		this.field541[0] = var3;
		this.field541[1] = var4;
		this.field541[2] = var5;
		this.field541[3] = var6;
		this.field541[4] = var7;
		this.field541[5] = var8;
		this.field541[6] = var9;
		this.field541[7] = var10;
		this.field541[8] = var11;
		this.field541[9] = var12;
		this.field541[10] = var13;
		this.field541[11] = var14;
		this.field541[12] = var15;
		this.field541[13] = var16;
		this.field541[14] = var17;
		this.field541[15] = var18;
	}

	@ObfInfo(
		owner = "oj",
		name = "i",
		desc = "(Lop;B)V"
	)
	public void method213(class175 var1) {
		float var3 = var1.field1316 * var1.field1316;
		float var4 = var1.field1313 * var1.field1316;
		float var5 = var1.field1310 * var1.field1316;
		float var6 = var1.field1315 * var1.field1316;
		float var7 = var1.field1313 * var1.field1313;
		float var8 = var1.field1313 * var1.field1310;
		float var9 = var1.field1313 * var1.field1315;
		float var10 = var1.field1310 * var1.field1310;
		float var11 = var1.field1310 * var1.field1315;
		float var12 = var1.field1315 * var1.field1315;
		this.field541[0] = var7 + var3 - var12 - var10;
		this.field541[1] = var8 + var8 + var6 + var6;
		this.field541[2] = var9 + (var9 - var5 - var5);
		this.field541[4] = var8 + (var8 - var6 - var6);
		this.field541[5] = var10 + var3 - var7 - var12;
		this.field541[6] = var4 + var11 + var4 + var11;
		this.field541[8] = var5 + var9 + var9 + var5;
		this.field541[9] = var11 - var4 - var4 + var11;
		this.field541[10] = var3 + var12 - var10 - var7;
	}

	@ObfInfo(
		owner = "oj",
		name = "o",
		desc = "(Loc;I)V"
	)
	void method214(class43 var1) {
		this.field541[0] = var1.field534;
		this.field541[1] = var1.field527;
		this.field541[2] = var1.field528;
		this.field541[3] = 0.0F;
		this.field541[4] = var1.field535;
		this.field541[5] = var1.field530;
		this.field541[6] = var1.field531;
		this.field541[7] = 0.0F;
		this.field541[8] = var1.field532;
		this.field541[9] = var1.field533;
		this.field541[10] = var1.field526;
		this.field541[11] = 0.0F;
		this.field541[12] = var1.field537;
		this.field541[13] = var1.field536;
		this.field541[14] = var1.field529;
		this.field541[15] = 1.0F;
	}

	@ObfInfo(
		owner = "oj",
		name = "n",
		desc = "(B)F"
	)
	float method218() {
		return this.field541[12] * this.field541[6] * this.field541[3] * this.field541[9] + (this.field541[13] * this.field541[3] * this.field541[4] * this.field541[10] + (this.field541[11] * this.field541[2] * this.field541[5] * this.field541[12] + (this.field541[15] * this.field541[2] * this.field541[4] * this.field541[9] + this.field541[15] * this.field541[10] * this.field541[5] * this.field541[0] - this.field541[11] * this.field541[5] * this.field541[0] * this.field541[14] - this.field541[15] * this.field541[9] * this.field541[0] * this.field541[6] + this.field541[13] * this.field541[0] * this.field541[6] * this.field541[11] + this.field541[0] * this.field541[7] * this.field541[9] * this.field541[14] - this.field541[13] * this.field541[10] * this.field541[0] * this.field541[7] - this.field541[15] * this.field541[4] * this.field541[1] * this.field541[10] + this.field541[14] * this.field541[4] * this.field541[1] * this.field541[11] + this.field541[15] * this.field541[8] * this.field541[1] * this.field541[6] - this.field541[12] * this.field541[11] * this.field541[1] * this.field541[6] - this.field541[8] * this.field541[1] * this.field541[7] * this.field541[14] + this.field541[12] * this.field541[7] * this.field541[1] * this.field541[10] - this.field541[13] * this.field541[11] * this.field541[4] * this.field541[2] - this.field541[8] * this.field541[5] * this.field541[2] * this.field541[15]) + this.field541[7] * this.field541[2] * this.field541[8] * this.field541[13] - this.field541[7] * this.field541[2] * this.field541[9] * this.field541[12] - this.field541[3] * this.field541[4] * this.field541[9] * this.field541[14]) + this.field541[3] * this.field541[5] * this.field541[8] * this.field541[14] - this.field541[10] * this.field541[5] * this.field541[3] * this.field541[12] - this.field541[8] * this.field541[3] * this.field541[6] * this.field541[13]);
	}

	@ObfInfo(
		owner = "oj",
		name = "k",
		desc = "(B)V"
	)
	public void method215() {
		float var2 = 1.0F / this.method218();
		float var3 = (this.field541[14] * this.field541[7] * this.field541[9] + this.field541[11] * this.field541[6] * this.field541[13] + (this.field541[15] * this.field541[10] * this.field541[5] - this.field541[14] * this.field541[5] * this.field541[11] - this.field541[9] * this.field541[6] * this.field541[15]) - this.field541[10] * this.field541[7] * this.field541[13]) * var2;
		float var4 = var2 * (this.field541[10] * this.field541[3] * this.field541[13] + (this.field541[15] * this.field541[9] * this.field541[2] + this.field541[14] * this.field541[1] * this.field541[11] + this.field541[15] * -this.field541[1] * this.field541[10] - this.field541[13] * this.field541[2] * this.field541[11] - this.field541[3] * this.field541[9] * this.field541[14]));
		float var5 = var2 * (this.field541[13] * this.field541[7] * this.field541[2] + (this.field541[6] * this.field541[1] * this.field541[15] - this.field541[14] * this.field541[1] * this.field541[7] - this.field541[2] * this.field541[5] * this.field541[15]) + this.field541[5] * this.field541[3] * this.field541[14] - this.field541[6] * this.field541[3] * this.field541[13]);
		float var6 = (this.field541[6] * this.field541[3] * this.field541[9] + (this.field541[11] * this.field541[2] * this.field541[5] + this.field541[1] * this.field541[7] * this.field541[10] + -this.field541[1] * this.field541[6] * this.field541[11] - this.field541[9] * this.field541[7] * this.field541[2] - this.field541[10] * this.field541[5] * this.field541[3])) * var2;
		float var7 = var2 * (this.field541[7] * this.field541[10] * this.field541[12] + (-this.field541[4] * this.field541[10] * this.field541[15] + this.field541[4] * this.field541[11] * this.field541[14] + this.field541[6] * this.field541[8] * this.field541[15] - this.field541[6] * this.field541[11] * this.field541[12] - this.field541[14] * this.field541[7] * this.field541[8]));
		float var8 = (this.field541[10] * this.field541[0] * this.field541[15] - this.field541[14] * this.field541[0] * this.field541[11] - this.field541[15] * this.field541[8] * this.field541[2] + this.field541[2] * this.field541[11] * this.field541[12] + this.field541[14] * this.field541[8] * this.field541[3] - this.field541[10] * this.field541[3] * this.field541[12]) * var2;
		float var9 = var2 * (this.field541[12] * this.field541[6] * this.field541[3] + (this.field541[14] * this.field541[0] * this.field541[7] + this.field541[15] * -this.field541[0] * this.field541[6] + this.field541[15] * this.field541[2] * this.field541[4] - this.field541[7] * this.field541[2] * this.field541[12] - this.field541[4] * this.field541[3] * this.field541[14]));
		float var10 = (this.field541[4] * this.field541[3] * this.field541[10] + this.field541[2] * this.field541[7] * this.field541[8] + (this.field541[6] * this.field541[0] * this.field541[11] - this.field541[0] * this.field541[7] * this.field541[10] - this.field541[11] * this.field541[4] * this.field541[2]) - this.field541[6] * this.field541[3] * this.field541[8]) * var2;
		float var11 = var2 * (this.field541[11] * this.field541[5] * this.field541[12] + (this.field541[15] * this.field541[4] * this.field541[9] - this.field541[4] * this.field541[11] * this.field541[13] - this.field541[15] * this.field541[5] * this.field541[8]) + this.field541[7] * this.field541[8] * this.field541[13] - this.field541[9] * this.field541[7] * this.field541[12]);
		float var12 = var2 * (this.field541[9] * this.field541[3] * this.field541[12] + (this.field541[9] * -this.field541[0] * this.field541[15] + this.field541[0] * this.field541[11] * this.field541[13] + this.field541[1] * this.field541[8] * this.field541[15] - this.field541[12] * this.field541[11] * this.field541[1] - this.field541[13] * this.field541[8] * this.field541[3]));
		float var13 = (this.field541[13] * this.field541[4] * this.field541[3] + this.field541[12] * this.field541[7] * this.field541[1] + (this.field541[0] * this.field541[5] * this.field541[15] - this.field541[7] * this.field541[0] * this.field541[13] - this.field541[15] * this.field541[1] * this.field541[4]) - this.field541[12] * this.field541[5] * this.field541[3]) * var2;
		float var14 = (this.field541[5] * this.field541[3] * this.field541[8] + (this.field541[4] * this.field541[1] * this.field541[11] + this.field541[9] * this.field541[0] * this.field541[7] + this.field541[5] * -this.field541[0] * this.field541[11] - this.field541[8] * this.field541[7] * this.field541[1] - this.field541[4] * this.field541[3] * this.field541[9])) * var2;
		float var15 = (this.field541[12] * this.field541[6] * this.field541[9] + (this.field541[14] * this.field541[5] * this.field541[8] + this.field541[13] * this.field541[10] * this.field541[4] + -this.field541[4] * this.field541[9] * this.field541[14] - this.field541[12] * this.field541[5] * this.field541[10] - this.field541[13] * this.field541[6] * this.field541[8])) * var2;
		float var16 = (this.field541[14] * this.field541[9] * this.field541[0] - this.field541[10] * this.field541[0] * this.field541[13] - this.field541[1] * this.field541[8] * this.field541[14] + this.field541[10] * this.field541[1] * this.field541[12] + this.field541[13] * this.field541[8] * this.field541[2] - this.field541[12] * this.field541[2] * this.field541[9]) * var2;
		float var17 = var2 * (this.field541[14] * this.field541[1] * this.field541[4] + this.field541[14] * -this.field541[0] * this.field541[5] + this.field541[13] * this.field541[0] * this.field541[6] - this.field541[12] * this.field541[6] * this.field541[1] - this.field541[13] * this.field541[2] * this.field541[4] + this.field541[5] * this.field541[2] * this.field541[12]);
		float var18 = (this.field541[8] * this.field541[1] * this.field541[6] + (this.field541[10] * this.field541[5] * this.field541[0] - this.field541[0] * this.field541[6] * this.field541[9] - this.field541[4] * this.field541[1] * this.field541[10]) + this.field541[4] * this.field541[2] * this.field541[9] - this.field541[2] * this.field541[5] * this.field541[8]) * var2;
		this.field541[0] = var3;
		this.field541[1] = var4;
		this.field541[2] = var5;
		this.field541[3] = var6;
		this.field541[4] = var7;
		this.field541[5] = var8;
		this.field541[6] = var9;
		this.field541[7] = var10;
		this.field541[8] = var11;
		this.field541[9] = var12;
		this.field541[10] = var13;
		this.field541[11] = var14;
		this.field541[12] = var15;
		this.field541[13] = var16;
		this.field541[14] = var17;
		this.field541[15] = var18;
	}

	@ObfInfo(
		owner = "oj",
		name = "toString",
		desc = "()Ljava/lang/String;"
	)
	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method206();
		this.method205();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field541[var3 + var2 * 4];
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
					var4 = 0.0F;
				}

				var1.append(var4);
			}

			var1.append("\n");
		}

		return var1.toString();
	}

	@ObfInfo(
		owner = "oj",
		name = "hashCode",
		desc = "()I"
	)
	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = var2 * 31 + Arrays.hashCode(this.field541);
		return var3;
	}

	@ObfInfo(
		owner = "oj",
		name = "equals",
		desc = "(Ljava/lang/Object;)Z"
	)
	public boolean equals(Object var1) {
		if (!(var1 instanceof class44)) {
			return false;
		} else {
			class44 var2 = (class44)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (var2.field541[var3] != this.field541[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfInfo(
		owner = "oj",
		name = "a",
		desc = "(I)[F"
	)
	public float[] method216() {
		float[] var2 = new float[3];
		class133 var3 = new class133(this.field541[0], this.field541[1], this.field541[2]);
		class133 var4 = new class133(this.field541[4], this.field541[5], this.field541[6]);
		class133 var5 = new class133(this.field541[8], this.field541[9], this.field541[10]);
		var2[0] = var3.method626();
		var2[1] = var4.method626();
		var2[2] = var5.method626();
		return var2;
	}

	@ObfInfo(
		owner = "oj",
		name = "r",
		desc = "(Ljava/util/Date;B)Z"
	)
	static boolean method220(Date var0) {
		Date var2 = class70.method307();
		return var0.after(var2);
	}
}
