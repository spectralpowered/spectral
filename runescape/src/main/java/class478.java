public class class478 extends class439 {
	public static int field5010;
	public static int field5011;
	public static int field5013;
	public static int field5014;
	public static int field5015;
	public static int field5016;
	public static int[] field5012;

	static {
		field5013 = 0;
		field5014 = 0;
		field5015 = 0;
		field5016 = 0;
	}

	protected class478() {
	}

	public static void method8679(int[] var0, int var1, int var2) {
		field5012 = var0;
		field5011 = var1;
		field5010 = var2;
		method8672(0, 0, var1, var2);
	}

	public static void method8712() {
		field5015 = 0;
		field5013 = 0;
		field5016 = field5011;
		field5014 = field5010;
	}

	public static void method8672(int var0, int var1, int var2, int var3) {
		if (var0 < 0) {
			var0 = 0;
		}

		if (var1 < 0) {
			var1 = 0;
		}

		if (var2 > field5011) {
			var2 = field5011;
		}

		if (var3 > field5010) {
			var3 = field5010;
		}

		field5015 = var0;
		field5013 = var1;
		field5016 = var2;
		field5014 = var3;
	}

	public static void method8673(int var0, int var1, int var2, int var3) {
		if (field5015 < var0) {
			field5015 = var0;
		}

		if (field5013 < var1) {
			field5013 = var1;
		}

		if (field5016 > var2) {
			field5016 = var2;
		}

		if (field5014 > var3) {
			field5014 = var3;
		}

	}

	public static void method8674(int[] var0) {
		var0[0] = field5015;
		var0[1] = field5013;
		var0[2] = field5016;
		var0[3] = field5014;
	}

	public static void method8675(int[] var0) {
		field5015 = var0[0];
		field5013 = var0[1];
		field5016 = var0[2];
		field5014 = var0[3];
	}

	public static void method8676() {
		int var0 = 0;

		int var1;
		for (var1 = field5011 * field5010 - 7; var0 < var1; field5012[var0++] = 0) {
			field5012[var0++] = 0;
			field5012[var0++] = 0;
			field5012[var0++] = 0;
			field5012[var0++] = 0;
			field5012[var0++] = 0;
			field5012[var0++] = 0;
			field5012[var0++] = 0;
		}

		for (var1 += 7; var0 < var1; field5012[var0++] = 0) {
		}

	}

	static void method8677(int var0, int var1, int var2, int var3) {
		if (var2 == 0) {
			method8725(var0, var1, var3);
		} else {
			if (var2 < 0) {
				var2 = -var2;
			}

			int var4 = var1 - var2;
			if (var4 < field5013) {
				var4 = field5013;
			}

			int var5 = var1 + var2 + 1;
			if (var5 > field5014) {
				var5 = field5014;
			}

			int var6 = var4;
			int var7 = var2 * var2;
			int var8 = 0;
			int var9 = var1 - var4;
			int var10 = var9 * var9;
			int var11 = var10 - var9;
			if (var1 > var5) {
				var1 = var5;
			}

			int var12;
			int var13;
			int var14;
			int var15;
			while (var6 < var1) {
				while (var11 <= var7 || var10 <= var7) {
					var10 += var8 + var8;
					var11 += var8++ + var8;
				}

				var12 = var0 - var8 + 1;
				if (var12 < field5015) {
					var12 = field5015;
				}

				var13 = var0 + var8;
				if (var13 > field5016) {
					var13 = field5016;
				}

				var14 = var12 + var6 * field5011;

				for (var15 = var12; var15 < var13; ++var15) {
					field5012[var14++] = var3;
				}

				++var6;
				var10 -= var9-- + var9;
				var11 -= var9 + var9;
			}

			var8 = var2;
			var9 = var6 - var1;
			var11 = var9 * var9 + var7;
			var10 = var11 - var2;

			for (var11 -= var9; var6 < var5; var10 += var9++ + var9) {
				while (var11 > var7 && var10 > var7) {
					var11 -= var8-- + var8;
					var10 -= var8 + var8;
				}

				var12 = var0 - var8;
				if (var12 < field5015) {
					var12 = field5015;
				}

				var13 = var0 + var8;
				if (var13 > field5016 - 1) {
					var13 = field5016 - 1;
				}

				var14 = var12 + var6 * field5011;

				for (var15 = var12; var15 <= var13; ++var15) {
					field5012[var14++] = var3;
				}

				++var6;
				var11 += var9 + var9;
			}

		}
	}

	public static void method8670(int var0, int var1, int var2, int var3, int var4) {
		if (var4 != 0) {
			if (var4 == 256) {
				method8677(var0, var1, var2, var3);
			} else {
				if (var2 < 0) {
					var2 = -var2;
				}

				int var5 = 256 - var4;
				int var6 = (var3 >> 16 & 255) * var4;
				int var7 = (var3 >> 8 & 255) * var4;
				int var8 = (var3 & 255) * var4;
				int var12 = var1 - var2;
				if (var12 < field5013) {
					var12 = field5013;
				}

				int var13 = var1 + var2 + 1;
				if (var13 > field5014) {
					var13 = field5014;
				}

				int var14 = var12;
				int var15 = var2 * var2;
				int var16 = 0;
				int var17 = var1 - var12;
				int var18 = var17 * var17;
				int var19 = var18 - var17;
				if (var1 > var13) {
					var1 = var13;
				}

				int var9;
				int var10;
				int var11;
				int var20;
				int var21;
				int var22;
				int var23;
				int var24;
				while (var14 < var1) {
					while (var19 <= var15 || var18 <= var15) {
						var18 += var16 + var16;
						var19 += var16++ + var16;
					}

					var20 = var0 - var16 + 1;
					if (var20 < field5015) {
						var20 = field5015;
					}

					var21 = var0 + var16;
					if (var21 > field5016) {
						var21 = field5016;
					}

					var22 = var20 + var14 * field5011;

					for (var23 = var20; var23 < var21; ++var23) {
						var9 = (field5012[var22] >> 16 & 255) * var5;
						var10 = (field5012[var22] >> 8 & 255) * var5;
						var11 = (field5012[var22] & 255) * var5;
						var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
						field5012[var22++] = var24;
					}

					++var14;
					var18 -= var17-- + var17;
					var19 -= var17 + var17;
				}

				var16 = var2;
				var17 = -var17;
				var19 = var17 * var17 + var15;
				var18 = var19 - var2;

				for (var19 -= var17; var14 < var13; var18 += var17++ + var17) {
					while (var19 > var15 && var18 > var15) {
						var19 -= var16-- + var16;
						var18 -= var16 + var16;
					}

					var20 = var0 - var16;
					if (var20 < field5015) {
						var20 = field5015;
					}

					var21 = var0 + var16;
					if (var21 > field5016 - 1) {
						var21 = field5016 - 1;
					}

					var22 = var20 + var14 * field5011;

					for (var23 = var20; var23 <= var21; ++var23) {
						var9 = (field5012[var22] >> 16 & 255) * var5;
						var10 = (field5012[var22] >> 8 & 255) * var5;
						var11 = (field5012[var22] & 255) * var5;
						var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
						field5012[var22++] = var24;
					}

					++var14;
					var19 += var17 + var17;
				}

			}
		}
	}

	public static void method8731(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 < field5015) {
			var2 -= field5015 - var0;
			var0 = field5015;
		}

		if (var1 < field5013) {
			var3 -= field5013 - var1;
			var1 = field5013;
		}

		if (var0 + var2 > field5016) {
			var2 = field5016 - var0;
		}

		if (var1 + var3 > field5014) {
			var3 = field5014 - var1;
		}

		var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & 65280) * var5 >> 8 & 65280);
		int var6 = 256 - var5;
		int var7 = field5011 - var2;
		int var8 = var0 + var1 * field5011;

		for (int var9 = 0; var9 < var3; ++var9) {
			for (int var10 = -var2; var10 < 0; ++var10) {
				int var11 = field5012[var8];
				var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & 65280) * var6 >> 8 & 65280);
				field5012[var8++] = var4 + var11;
			}

			var8 += var7;
		}

	}

	public static void method8680(int var0, int var1, int var2, int var3, int var4) {
		if (var0 < field5015) {
			var2 -= field5015 - var0;
			var0 = field5015;
		}

		if (var1 < field5013) {
			var3 -= field5013 - var1;
			var1 = field5013;
		}

		if (var0 + var2 > field5016) {
			var2 = field5016 - var0;
		}

		if (var1 + var3 > field5014) {
			var3 = field5014 - var1;
		}

		int var5 = field5011 - var2;
		int var6 = var0 + var1 * field5011;

		for (int var7 = -var3; var7 < 0; ++var7) {
			for (int var8 = -var2; var8 < 0; ++var8) {
				field5012[var6++] = var4;
			}

			var6 += var5;
		}

	}

	public static void method8681(int var0, int var1, int var2, int var3, int var4, int var5) {
		if (var2 > 0 && var3 > 0) {
			int var6 = 0;
			int var7 = 65536 / var3;
			if (var0 < field5015) {
				var2 -= field5015 - var0;
				var0 = field5015;
			}

			if (var1 < field5013) {
				var6 += (field5013 - var1) * var7;
				var3 -= field5013 - var1;
				var1 = field5013;
			}

			if (var0 + var2 > field5016) {
				var2 = field5016 - var0;
			}

			if (var1 + var3 > field5014) {
				var3 = field5014 - var1;
			}

			int var8 = field5011 - var2;
			int var9 = var0 + var1 * field5011;

			for (int var10 = -var3; var10 < 0; ++var10) {
				int var11 = 65536 - var6 >> 8;
				int var12 = var6 >> 8;
				int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & 65280) * var11 + (var5 & 65280) * var12 & 16711680) >>> 8;

				for (int var14 = -var2; var14 < 0; ++var14) {
					field5012[var9++] = var13;
				}

				var9 += var8;
				var6 += var7;
			}

		}
	}

	public static void method8682(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 > 0 && var3 > 0) {
			int var8 = 0;
			int var9 = 65536 / var3;
			if (var0 < field5015) {
				var2 -= field5015 - var0;
				var0 = field5015;
			}

			if (var1 < field5013) {
				var8 += (field5013 - var1) * var9;
				var3 -= field5013 - var1;
				var1 = field5013;
			}

			if (var0 + var2 > field5016) {
				var2 = field5016 - var0;
			}

			if (var1 + var3 > field5014) {
				var3 = field5014 - var1;
			}

			int var10 = field5011 - var2;
			int var11 = var0 + var1 * field5011;

			for (int var12 = -var3; var12 < 0; ++var12) {
				int var13 = 65536 - var8 >> 8;
				int var14 = var8 >> 8;
				int var15 = (var6 * var13 + var7 * var14 & 65280) >>> 8;
				if (var15 == 0) {
					var11 += field5011;
					var8 += var9;
				} else {
					int var16 = ((var4 & 16711935) * var13 + (var5 & 16711935) * var14 & -16711936) + ((var4 & 65280) * var13 + (var5 & 65280) * var14 & 16711680) >>> 8;
					int var17 = 255 - var15;
					int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + ((var16 & 65280) * var15 >> 8 & 65280);

					for (int var19 = -var2; var19 < 0; ++var19) {
						int var20 = field5012[var11];
						if (var20 == 0) {
							field5012[var11++] = var18;
						} else {
							var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + ((var20 & 65280) * var17 >> 8 & 65280);
							field5012[var11++] = var18 + var20;
						}
					}

					var11 += var10;
					var8 += var9;
				}
			}

		}
	}

	public static void method8706(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
		if (var0 + var2 >= 0 && var1 + var3 >= 0) {
			if (var0 < field5011 && var1 < field5010) {
				int var9 = 0;
				int var10 = 0;
				if (var0 < 0) {
					var9 -= var0;
					var2 += var0;
				}

				if (var1 < 0) {
					var10 -= var1;
					var3 += var1;
				}

				if (var0 + var2 > field5011) {
					var2 = field5011 - var0;
				}

				if (var1 + var3 > field5010) {
					var3 = field5010 - var1;
				}

				int var11 = var6.length / var7;
				int var12 = field5011 - var2;
				int var13 = var4 >>> 24;
				int var14 = var5 >>> 24;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				if (var8 && (var13 != 255 || var14 != 255)) {
					var15 = (var1 + var10) * field5011 + var0 + var9;

					for (var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
						for (var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
							var18 = (var16 - var1) % var11;
							var19 = (var17 - var0) % var7;
							int var20 = var4;
							if (var6[var18 * var7 + var19] != 0) {
								var20 = var5;
							}

							int var21 = var20 >>> 24;
							int var22 = 255 - var21;
							int var23 = field5012[var15];
							int var24 = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936) + ((var20 & 65280) * var21 + (var23 & 65280) * var22 & 16711680) >> 8;
							field5012[var15++] = var24;
						}

						var15 += var12;
					}
				} else {
					var15 = (var1 + var10) * field5011 + var0 + var9;

					for (var16 = var1 + var10; var16 < var1 + var10 + var3; ++var16) {
						for (var17 = var0 + var9; var17 < var0 + var9 + var2; ++var17) {
							var18 = (var16 - var1) % var11;
							var19 = (var17 - var0) % var7;
							if (var6[var18 * var7 + var19] != 0) {
								field5012[var15++] = var5;
							} else {
								field5012[var15++] = var4;
							}
						}

						var15 += var12;
					}
				}

			}
		}
	}

	public static void method8671(int var0, int var1, int var2, int var3, int var4) {
		method8686(var0, var1, var2, var4);
		method8686(var0, var1 + var3 - 1, var2, var4);
		method8688(var0, var1, var3, var4);
		method8688(var0 + var2 - 1, var1, var3, var4);
	}

	public static void method8704(int var0, int var1, int var2, int var3, int var4, int var5) {
		method8724(var0, var1, var2, var4, var5);
		method8724(var0, var1 + var3 - 1, var2, var4, var5);
		if (var3 >= 3) {
			method8689(var0, var1 + 1, var3 - 2, var4, var5);
			method8689(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
		}

	}

	public static void method8686(int var0, int var1, int var2, int var3) {
		if (var1 >= field5013 && var1 < field5014) {
			if (var0 < field5015) {
				var2 -= field5015 - var0;
				var0 = field5015;
			}

			if (var0 + var2 > field5016) {
				var2 = field5016 - var0;
			}

			int var4 = var0 + var1 * field5011;

			for (int var5 = 0; var5 < var2; ++var5) {
				field5012[var4 + var5] = var3;
			}

		}
	}

	static void method8724(int var0, int var1, int var2, int var3, int var4) {
		if (var1 >= field5013 && var1 < field5014) {
			if (var0 < field5015) {
				var2 -= field5015 - var0;
				var0 = field5015;
			}

			if (var0 + var2 > field5016) {
				var2 = field5016 - var0;
			}

			int var5 = 256 - var4;
			int var6 = (var3 >> 16 & 255) * var4;
			int var7 = (var3 >> 8 & 255) * var4;
			int var8 = (var3 & 255) * var4;
			int var12 = var0 + var1 * field5011;

			for (int var13 = 0; var13 < var2; ++var13) {
				int var9 = (field5012[var12] >> 16 & 255) * var5;
				int var10 = (field5012[var12] >> 8 & 255) * var5;
				int var11 = (field5012[var12] & 255) * var5;
				int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
				field5012[var12++] = var14;
			}

		}
	}

	public static void method8688(int var0, int var1, int var2, int var3) {
		if (var0 >= field5015 && var0 < field5016) {
			if (var1 < field5013) {
				var2 -= field5013 - var1;
				var1 = field5013;
			}

			if (var1 + var2 > field5014) {
				var2 = field5014 - var1;
			}

			int var4 = var0 + var1 * field5011;

			for (int var5 = 0; var5 < var2; ++var5) {
				field5012[var4 + var5 * field5011] = var3;
			}

		}
	}

	static void method8689(int var0, int var1, int var2, int var3, int var4) {
		if (var0 >= field5015 && var0 < field5016) {
			if (var1 < field5013) {
				var2 -= field5013 - var1;
				var1 = field5013;
			}

			if (var1 + var2 > field5014) {
				var2 = field5014 - var1;
			}

			int var5 = 256 - var4;
			int var6 = (var3 >> 16 & 255) * var4;
			int var7 = (var3 >> 8 & 255) * var4;
			int var8 = (var3 & 255) * var4;
			int var12 = var0 + var1 * field5011;

			for (int var13 = 0; var13 < var2; ++var13) {
				int var9 = (field5012[var12] >> 16 & 255) * var5;
				int var10 = (field5012[var12] >> 8 & 255) * var5;
				int var11 = (field5012[var12] & 255) * var5;
				int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
				field5012[var12] = var14;
				var12 += field5011;
			}

		}
	}

	public static void method8715(int var0, int var1, int var2, int var3, int var4) {
		var2 -= var0;
		var3 -= var1;
		if (var3 == 0) {
			if (var2 >= 0) {
				method8686(var0, var1, var2 + 1, var4);
			} else {
				method8686(var0 + var2, var1, -var2 + 1, var4);
			}

		} else if (var2 == 0) {
			if (var3 >= 0) {
				method8688(var0, var1, var3 + 1, var4);
			} else {
				method8688(var0, var1 + var3, -var3 + 1, var4);
			}

		} else {
			if (var2 + var3 < 0) {
				var0 += var2;
				var2 = -var2;
				var1 += var3;
				var3 = -var3;
			}

			int var5;
			int var6;
			if (var2 > var3) {
				var1 <<= 16;
				var1 += 32768;
				var3 <<= 16;
				var5 = (int)Math.floor((double)var3 / (double)var2 + 0.5D);
				var2 += var0;
				if (var0 < field5015) {
					var1 += var5 * (field5015 - var0);
					var0 = field5015;
				}

				if (var2 >= field5016) {
					var2 = field5016 - 1;
				}

				while (var0 <= var2) {
					var6 = var1 >> 16;
					if (var6 >= field5013 && var6 < field5014) {
						field5012[var0 + var6 * field5011] = var4;
					}

					var1 += var5;
					++var0;
				}
			} else {
				var0 <<= 16;
				var0 += 32768;
				var2 <<= 16;
				var5 = (int)Math.floor((double)var2 / (double)var3 + 0.5D);
				var3 += var1;
				if (var1 < field5013) {
					var0 += var5 * (field5013 - var1);
					var1 = field5013;
				}

				if (var3 >= field5014) {
					var3 = field5014 - 1;
				}

				while (var1 <= var3) {
					var6 = var0 >> 16;
					if (var6 >= field5015 && var6 < field5016) {
						field5012[var6 + var1 * field5011] = var4;
					}

					var0 += var5;
					++var1;
				}
			}

		}
	}

	static void method8725(int var0, int var1, int var2) {
		if (var0 >= field5015 && var1 >= field5013 && var0 < field5016 && var1 < field5014) {
			field5012[var0 + var1 * field5011] = var2;
		}
	}

	public static void method8692(int var0, int var1, int var2, int[] var3, int[] var4) {
		int var5 = var0 + var1 * field5011;

		for (var1 = 0; var1 < var3.length; ++var1) {
			int var6 = var5 + var3[var1];

			for (var0 = -var4[var1]; var0 < 0; ++var0) {
				field5012[var6++] = var2;
			}

			var5 += field5011;
		}

	}
}
