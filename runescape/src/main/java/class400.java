import java.util.Arrays;

public final class class400 {
	public static final class400 field4564;
	static class400[] field4560;
	static class491[] field4562;
	static int field4559;
	static int field4566;
	public float[] field4563;

	static {
		field4560 = new class400[0];
		field4566 = 100;
		field4560 = new class400[100];
		field4559 = 0;
		field4564 = new class400();
	}

	public void method7431() {
		synchronized(field4560) {
			if (field4559 < field4566 - 1) {
				field4560[++field4559 - 1] = this;
			}

		}
	}

	public class400() {
		this.field4563 = new float[16];
		this.method7418();
	}

	public class400(class400 var1) {
		this.field4563 = new float[16];
		this.method7420(var1);
	}

	public class400(class467 var1, boolean var2) {
		this.field4563 = new float[16];
		this.method7415(var1, var2);
	}

	void method7415(class467 var1, boolean var2) {
		if (var2) {
			class393 var4 = new class393();
			int var7 = var1.method8329();
			var7 &= 16383;
			float var6 = (float)((double)((float)var7 / 16384.0F) * 6.283185307179586D);
			var4.method7272(var6);
			int var10 = var1.method8329();
			var10 &= 16383;
			float var9 = (float)((double)((float)var10 / 16384.0F) * 6.283185307179586D);
			var4.method7273(var9);
			int var13 = var1.method8329();
			var13 &= 16383;
			float var12 = (float)(6.283185307179586D * (double)((float)var13 / 16384.0F));
			var4.method7277(var12);
			var4.method7275((float)var1.method8329(), (float)var1.method8329(), (float)var1.method8329());
			this.method7426(var4);
		} else {
			for (int var14 = 0; var14 < 16; ++var14) {
				this.field4563[var14] = var1.method8332();
			}
		}

	}

	float[] method7416() {
		float[] var2 = new float[3];
		if ((double)this.field4563[2] < 0.999D && (double)this.field4563[2] > -0.999D) {
			var2[1] = (float)(-Math.asin((double)this.field4563[2]));
			double var3 = Math.cos((double)var2[1]);
			var2[0] = (float)Math.atan2((double)this.field4563[6] / var3, (double)this.field4563[10] / var3);
			var2[2] = (float)Math.atan2((double)this.field4563[1] / var3, (double)this.field4563[0] / var3);
		} else {
			var2[0] = 0.0F;
			var2[1] = (float)Math.atan2((double)this.field4563[2], 0.0D);
			var2[2] = (float)Math.atan2((double)(-this.field4563[9]), (double)this.field4563[5]);
		}

		return var2;
	}

	public float[] method7417() {
		float[] var2 = new float[]{(float)(-Math.asin((double)this.field4563[6])), 0.0F, 0.0F};
		double var3 = Math.cos((double)var2[0]);
		double var5;
		double var7;
		if (Math.abs(var3) > 0.005D) {
			var5 = (double)this.field4563[2];
			var7 = (double)this.field4563[10];
			double var9 = (double)this.field4563[4];
			double var11 = (double)this.field4563[5];
			var2[1] = (float)Math.atan2(var5, var7);
			var2[2] = (float)Math.atan2(var9, var11);
		} else {
			var5 = (double)this.field4563[1];
			var7 = (double)this.field4563[0];
			if (this.field4563[6] < 0.0F) {
				var2[1] = (float)Math.atan2(var5, var7);
			} else {
				var2[1] = (float)(-Math.atan2(var5, var7));
			}

			var2[2] = 0.0F;
		}

		return var2;
	}

	void method7418() {
		this.field4563[0] = 1.0F;
		this.field4563[1] = 0.0F;
		this.field4563[2] = 0.0F;
		this.field4563[3] = 0.0F;
		this.field4563[4] = 0.0F;
		this.field4563[5] = 1.0F;
		this.field4563[6] = 0.0F;
		this.field4563[7] = 0.0F;
		this.field4563[8] = 0.0F;
		this.field4563[9] = 0.0F;
		this.field4563[10] = 1.0F;
		this.field4563[11] = 0.0F;
		this.field4563[12] = 0.0F;
		this.field4563[13] = 0.0F;
		this.field4563[14] = 0.0F;
		this.field4563[15] = 1.0F;
	}

	public void method7419() {
		this.field4563[0] = 0.0F;
		this.field4563[1] = 0.0F;
		this.field4563[2] = 0.0F;
		this.field4563[3] = 0.0F;
		this.field4563[4] = 0.0F;
		this.field4563[5] = 0.0F;
		this.field4563[6] = 0.0F;
		this.field4563[7] = 0.0F;
		this.field4563[8] = 0.0F;
		this.field4563[9] = 0.0F;
		this.field4563[10] = 0.0F;
		this.field4563[11] = 0.0F;
		this.field4563[12] = 0.0F;
		this.field4563[13] = 0.0F;
		this.field4563[14] = 0.0F;
		this.field4563[15] = 0.0F;
	}

	public void method7420(class400 var1) {
		System.arraycopy(var1.field4563, 0, this.field4563, 0, 16);
	}

	public void method7421(float var1) {
		this.method7422(var1, var1, var1);
	}

	public void method7422(float var1, float var2, float var3) {
		this.method7418();
		this.field4563[0] = var1;
		this.field4563[5] = var2;
		this.field4563[10] = var3;
	}

	public void method7466(class400 var1) {
		for (int var3 = 0; var3 < this.field4563.length; ++var3) {
			float[] var10000 = this.field4563;
			var10000[var3] += var1.field4563[var3];
		}

	}

	public void method7424(class400 var1) {
		float var3 = this.field4563[3] * var1.field4563[12] + this.field4563[2] * var1.field4563[8] + var1.field4563[4] * this.field4563[1] + var1.field4563[0] * this.field4563[0];
		float var4 = this.field4563[1] * var1.field4563[5] + var1.field4563[1] * this.field4563[0] + var1.field4563[9] * this.field4563[2] + var1.field4563[13] * this.field4563[3];
		float var5 = this.field4563[1] * var1.field4563[6] + var1.field4563[2] * this.field4563[0] + var1.field4563[10] * this.field4563[2] + this.field4563[3] * var1.field4563[14];
		float var6 = this.field4563[3] * var1.field4563[15] + this.field4563[2] * var1.field4563[11] + var1.field4563[3] * this.field4563[0] + var1.field4563[7] * this.field4563[1];
		float var7 = var1.field4563[0] * this.field4563[4] + var1.field4563[4] * this.field4563[5] + var1.field4563[8] * this.field4563[6] + this.field4563[7] * var1.field4563[12];
		float var8 = var1.field4563[13] * this.field4563[7] + var1.field4563[1] * this.field4563[4] + this.field4563[5] * var1.field4563[5] + this.field4563[6] * var1.field4563[9];
		float var9 = var1.field4563[14] * this.field4563[7] + var1.field4563[10] * this.field4563[6] + var1.field4563[6] * this.field4563[5] + var1.field4563[2] * this.field4563[4];
		float var10 = this.field4563[5] * var1.field4563[7] + var1.field4563[3] * this.field4563[4] + this.field4563[6] * var1.field4563[11] + var1.field4563[15] * this.field4563[7];
		float var11 = var1.field4563[12] * this.field4563[11] + this.field4563[10] * var1.field4563[8] + var1.field4563[0] * this.field4563[8] + this.field4563[9] * var1.field4563[4];
		float var12 = this.field4563[11] * var1.field4563[13] + this.field4563[9] * var1.field4563[5] + var1.field4563[1] * this.field4563[8] + var1.field4563[9] * this.field4563[10];
		float var13 = this.field4563[9] * var1.field4563[6] + var1.field4563[2] * this.field4563[8] + var1.field4563[10] * this.field4563[10] + this.field4563[11] * var1.field4563[14];
		float var14 = var1.field4563[11] * this.field4563[10] + this.field4563[9] * var1.field4563[7] + this.field4563[8] * var1.field4563[3] + var1.field4563[15] * this.field4563[11];
		float var15 = this.field4563[15] * var1.field4563[12] + var1.field4563[8] * this.field4563[14] + var1.field4563[4] * this.field4563[13] + var1.field4563[0] * this.field4563[12];
		float var16 = this.field4563[12] * var1.field4563[1] + this.field4563[13] * var1.field4563[5] + this.field4563[14] * var1.field4563[9] + var1.field4563[13] * this.field4563[15];
		float var17 = var1.field4563[14] * this.field4563[15] + var1.field4563[10] * this.field4563[14] + var1.field4563[6] * this.field4563[13] + var1.field4563[2] * this.field4563[12];
		float var18 = var1.field4563[15] * this.field4563[15] + this.field4563[13] * var1.field4563[7] + var1.field4563[3] * this.field4563[12] + var1.field4563[11] * this.field4563[14];
		this.field4563[0] = var3;
		this.field4563[1] = var4;
		this.field4563[2] = var5;
		this.field4563[3] = var6;
		this.field4563[4] = var7;
		this.field4563[5] = var8;
		this.field4563[6] = var9;
		this.field4563[7] = var10;
		this.field4563[8] = var11;
		this.field4563[9] = var12;
		this.field4563[10] = var13;
		this.field4563[11] = var14;
		this.field4563[12] = var15;
		this.field4563[13] = var16;
		this.field4563[14] = var17;
		this.field4563[15] = var18;
	}

	public void method7425(class406 var1) {
		float var3 = var1.field4609 * var1.field4609;
		float var4 = var1.field4606 * var1.field4609;
		float var5 = var1.field4603 * var1.field4609;
		float var6 = var1.field4608 * var1.field4609;
		float var7 = var1.field4606 * var1.field4606;
		float var8 = var1.field4606 * var1.field4603;
		float var9 = var1.field4606 * var1.field4608;
		float var10 = var1.field4603 * var1.field4603;
		float var11 = var1.field4603 * var1.field4608;
		float var12 = var1.field4608 * var1.field4608;
		this.field4563[0] = var7 + var3 - var12 - var10;
		this.field4563[1] = var8 + var8 + var6 + var6;
		this.field4563[2] = var9 + (var9 - var5 - var5);
		this.field4563[4] = var8 + (var8 - var6 - var6);
		this.field4563[5] = var10 + var3 - var7 - var12;
		this.field4563[6] = var4 + var11 + var4 + var11;
		this.field4563[8] = var5 + var9 + var9 + var5;
		this.field4563[9] = var11 - var4 - var4 + var11;
		this.field4563[10] = var3 + var12 - var10 - var7;
	}

	void method7426(class393 var1) {
		this.field4563[0] = var1.field4534;
		this.field4563[1] = var1.field4527;
		this.field4563[2] = var1.field4528;
		this.field4563[3] = 0.0F;
		this.field4563[4] = var1.field4535;
		this.field4563[5] = var1.field4530;
		this.field4563[6] = var1.field4531;
		this.field4563[7] = 0.0F;
		this.field4563[8] = var1.field4532;
		this.field4563[9] = var1.field4533;
		this.field4563[10] = var1.field4526;
		this.field4563[11] = 0.0F;
		this.field4563[12] = var1.field4537;
		this.field4563[13] = var1.field4536;
		this.field4563[14] = var1.field4529;
		this.field4563[15] = 1.0F;
	}

	float method7439() {
		return this.field4563[12] * this.field4563[6] * this.field4563[3] * this.field4563[9] + (this.field4563[13] * this.field4563[3] * this.field4563[4] * this.field4563[10] + (this.field4563[11] * this.field4563[2] * this.field4563[5] * this.field4563[12] + (this.field4563[15] * this.field4563[2] * this.field4563[4] * this.field4563[9] + this.field4563[15] * this.field4563[10] * this.field4563[5] * this.field4563[0] - this.field4563[11] * this.field4563[5] * this.field4563[0] * this.field4563[14] - this.field4563[15] * this.field4563[9] * this.field4563[0] * this.field4563[6] + this.field4563[13] * this.field4563[0] * this.field4563[6] * this.field4563[11] + this.field4563[0] * this.field4563[7] * this.field4563[9] * this.field4563[14] - this.field4563[13] * this.field4563[10] * this.field4563[0] * this.field4563[7] - this.field4563[15] * this.field4563[4] * this.field4563[1] * this.field4563[10] + this.field4563[14] * this.field4563[4] * this.field4563[1] * this.field4563[11] + this.field4563[15] * this.field4563[8] * this.field4563[1] * this.field4563[6] - this.field4563[12] * this.field4563[11] * this.field4563[1] * this.field4563[6] - this.field4563[8] * this.field4563[1] * this.field4563[7] * this.field4563[14] + this.field4563[12] * this.field4563[7] * this.field4563[1] * this.field4563[10] - this.field4563[13] * this.field4563[11] * this.field4563[4] * this.field4563[2] - this.field4563[8] * this.field4563[5] * this.field4563[2] * this.field4563[15]) + this.field4563[7] * this.field4563[2] * this.field4563[8] * this.field4563[13] - this.field4563[7] * this.field4563[2] * this.field4563[9] * this.field4563[12] - this.field4563[3] * this.field4563[4] * this.field4563[9] * this.field4563[14]) + this.field4563[3] * this.field4563[5] * this.field4563[8] * this.field4563[14] - this.field4563[10] * this.field4563[5] * this.field4563[3] * this.field4563[12] - this.field4563[8] * this.field4563[3] * this.field4563[6] * this.field4563[13]);
	}

	public void method7428() {
		float var2 = 1.0F / this.method7439();
		float var3 = (this.field4563[14] * this.field4563[7] * this.field4563[9] + this.field4563[11] * this.field4563[6] * this.field4563[13] + (this.field4563[15] * this.field4563[10] * this.field4563[5] - this.field4563[14] * this.field4563[5] * this.field4563[11] - this.field4563[9] * this.field4563[6] * this.field4563[15]) - this.field4563[10] * this.field4563[7] * this.field4563[13]) * var2;
		float var4 = var2 * (this.field4563[10] * this.field4563[3] * this.field4563[13] + (this.field4563[15] * this.field4563[9] * this.field4563[2] + this.field4563[14] * this.field4563[1] * this.field4563[11] + this.field4563[15] * -this.field4563[1] * this.field4563[10] - this.field4563[13] * this.field4563[2] * this.field4563[11] - this.field4563[3] * this.field4563[9] * this.field4563[14]));
		float var5 = var2 * (this.field4563[13] * this.field4563[7] * this.field4563[2] + (this.field4563[6] * this.field4563[1] * this.field4563[15] - this.field4563[14] * this.field4563[1] * this.field4563[7] - this.field4563[2] * this.field4563[5] * this.field4563[15]) + this.field4563[5] * this.field4563[3] * this.field4563[14] - this.field4563[6] * this.field4563[3] * this.field4563[13]);
		float var6 = (this.field4563[6] * this.field4563[3] * this.field4563[9] + (this.field4563[11] * this.field4563[2] * this.field4563[5] + this.field4563[1] * this.field4563[7] * this.field4563[10] + -this.field4563[1] * this.field4563[6] * this.field4563[11] - this.field4563[9] * this.field4563[7] * this.field4563[2] - this.field4563[10] * this.field4563[5] * this.field4563[3])) * var2;
		float var7 = var2 * (this.field4563[7] * this.field4563[10] * this.field4563[12] + (-this.field4563[4] * this.field4563[10] * this.field4563[15] + this.field4563[4] * this.field4563[11] * this.field4563[14] + this.field4563[6] * this.field4563[8] * this.field4563[15] - this.field4563[6] * this.field4563[11] * this.field4563[12] - this.field4563[14] * this.field4563[7] * this.field4563[8]));
		float var8 = (this.field4563[10] * this.field4563[0] * this.field4563[15] - this.field4563[14] * this.field4563[0] * this.field4563[11] - this.field4563[15] * this.field4563[8] * this.field4563[2] + this.field4563[2] * this.field4563[11] * this.field4563[12] + this.field4563[14] * this.field4563[8] * this.field4563[3] - this.field4563[10] * this.field4563[3] * this.field4563[12]) * var2;
		float var9 = var2 * (this.field4563[12] * this.field4563[6] * this.field4563[3] + (this.field4563[14] * this.field4563[0] * this.field4563[7] + this.field4563[15] * -this.field4563[0] * this.field4563[6] + this.field4563[15] * this.field4563[2] * this.field4563[4] - this.field4563[7] * this.field4563[2] * this.field4563[12] - this.field4563[4] * this.field4563[3] * this.field4563[14]));
		float var10 = (this.field4563[4] * this.field4563[3] * this.field4563[10] + this.field4563[2] * this.field4563[7] * this.field4563[8] + (this.field4563[6] * this.field4563[0] * this.field4563[11] - this.field4563[0] * this.field4563[7] * this.field4563[10] - this.field4563[11] * this.field4563[4] * this.field4563[2]) - this.field4563[6] * this.field4563[3] * this.field4563[8]) * var2;
		float var11 = var2 * (this.field4563[11] * this.field4563[5] * this.field4563[12] + (this.field4563[15] * this.field4563[4] * this.field4563[9] - this.field4563[4] * this.field4563[11] * this.field4563[13] - this.field4563[15] * this.field4563[5] * this.field4563[8]) + this.field4563[7] * this.field4563[8] * this.field4563[13] - this.field4563[9] * this.field4563[7] * this.field4563[12]);
		float var12 = var2 * (this.field4563[9] * this.field4563[3] * this.field4563[12] + (this.field4563[9] * -this.field4563[0] * this.field4563[15] + this.field4563[0] * this.field4563[11] * this.field4563[13] + this.field4563[1] * this.field4563[8] * this.field4563[15] - this.field4563[12] * this.field4563[11] * this.field4563[1] - this.field4563[13] * this.field4563[8] * this.field4563[3]));
		float var13 = (this.field4563[13] * this.field4563[4] * this.field4563[3] + this.field4563[12] * this.field4563[7] * this.field4563[1] + (this.field4563[0] * this.field4563[5] * this.field4563[15] - this.field4563[7] * this.field4563[0] * this.field4563[13] - this.field4563[15] * this.field4563[1] * this.field4563[4]) - this.field4563[12] * this.field4563[5] * this.field4563[3]) * var2;
		float var14 = (this.field4563[5] * this.field4563[3] * this.field4563[8] + (this.field4563[4] * this.field4563[1] * this.field4563[11] + this.field4563[9] * this.field4563[0] * this.field4563[7] + this.field4563[5] * -this.field4563[0] * this.field4563[11] - this.field4563[8] * this.field4563[7] * this.field4563[1] - this.field4563[4] * this.field4563[3] * this.field4563[9])) * var2;
		float var15 = (this.field4563[12] * this.field4563[6] * this.field4563[9] + (this.field4563[14] * this.field4563[5] * this.field4563[8] + this.field4563[13] * this.field4563[10] * this.field4563[4] + -this.field4563[4] * this.field4563[9] * this.field4563[14] - this.field4563[12] * this.field4563[5] * this.field4563[10] - this.field4563[13] * this.field4563[6] * this.field4563[8])) * var2;
		float var16 = (this.field4563[14] * this.field4563[9] * this.field4563[0] - this.field4563[10] * this.field4563[0] * this.field4563[13] - this.field4563[1] * this.field4563[8] * this.field4563[14] + this.field4563[10] * this.field4563[1] * this.field4563[12] + this.field4563[13] * this.field4563[8] * this.field4563[2] - this.field4563[12] * this.field4563[2] * this.field4563[9]) * var2;
		float var17 = var2 * (this.field4563[14] * this.field4563[1] * this.field4563[4] + this.field4563[14] * -this.field4563[0] * this.field4563[5] + this.field4563[13] * this.field4563[0] * this.field4563[6] - this.field4563[12] * this.field4563[6] * this.field4563[1] - this.field4563[13] * this.field4563[2] * this.field4563[4] + this.field4563[5] * this.field4563[2] * this.field4563[12]);
		float var18 = (this.field4563[8] * this.field4563[1] * this.field4563[6] + (this.field4563[10] * this.field4563[5] * this.field4563[0] - this.field4563[0] * this.field4563[6] * this.field4563[9] - this.field4563[4] * this.field4563[1] * this.field4563[10]) + this.field4563[4] * this.field4563[2] * this.field4563[9] - this.field4563[2] * this.field4563[5] * this.field4563[8]) * var2;
		this.field4563[0] = var3;
		this.field4563[1] = var4;
		this.field4563[2] = var5;
		this.field4563[3] = var6;
		this.field4563[4] = var7;
		this.field4563[5] = var8;
		this.field4563[6] = var9;
		this.field4563[7] = var10;
		this.field4563[8] = var11;
		this.field4563[9] = var12;
		this.field4563[10] = var13;
		this.field4563[11] = var14;
		this.field4563[12] = var15;
		this.field4563[13] = var16;
		this.field4563[14] = var17;
		this.field4563[15] = var18;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method7417();
		this.method7416();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4563[var3 + var2 * 4];
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
					var4 = 0.0F;
				}

				var1.append(var4);
			}

			var1.append("\n");
		}

		return var1.toString();
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = var2 * 31 + Arrays.hashCode(this.field4563);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class400)) {
			return false;
		} else {
			class400 var2 = (class400)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (var2.field4563[var3] != this.field4563[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	public float[] method7430() {
		float[] var2 = new float[3];
		class413 var3 = new class413(this.field4563[0], this.field4563[1], this.field4563[2]);
		class413 var4 = new class413(this.field4563[4], this.field4563[5], this.field4563[6]);
		class413 var5 = new class413(this.field4563[8], this.field4563[9], this.field4563[10]);
		var2[0] = var3.method7645();
		var2[1] = var4.method7645();
		var2[2] = var5.method7645();
		return var2;
	}
}
