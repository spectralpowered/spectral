public class class242 {
	static class290 field2895;
	byte[][][] field2894;
	int field2893;

	class242(int var1) {
		this.field2893 = var1;
	}

	void method4811(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (var7 != 0 && this.field2893 != 0 && null != this.field2894) {
			var8 = this.method4812(var8, var7);
			var7 = this.method4838(var7);
			class478.method8706(var1, var2, var5, var6, var3, var4, this.field2894[var7 - 1][var8], this.field2893, true);
		}
	}

	int method4812(int var1, int var2) {
		if (var2 == 9) {
			var1 = var1 + 1 & 3;
		}

		if (var2 == 10) {
			var1 = var1 + 3 & 3;
		}

		if (var2 == 11) {
			var1 = var1 + 3 & 3;
		}

		return var1;
	}

	int method4838(int var1) {
		if (var1 != 9 && var1 != 10) {
			return var1 == 11 ? 8 : var1;
		} else {
			return 1;
		}
	}

	void method4814() {
		if (null == this.field2894) {
			this.field2894 = new byte[8][4][];
			this.method4833();
			this.method4816();
			this.method4841();
			this.method4830();
			this.method4839();
			this.method4840();
			this.method4821();
			this.method4822();
		}
	}

	void method4833() {
		byte[] var2 = new byte[this.field2893 * this.field2893];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field2893; ++var4) {
			for (var5 = 0; var5 < this.field2893; ++var5) {
				if (var5 <= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2894[0][0] = var2;
		var2 = new byte[this.field2893 * this.field2893];
		var3 = 0;

		for (var4 = this.field2893 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2893; ++var5) {
				if (var5 <= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2894[0][1] = var2;
		var2 = new byte[this.field2893 * this.field2893];
		var3 = 0;

		for (var4 = 0; var4 < this.field2893; ++var4) {
			for (var5 = 0; var5 < this.field2893; ++var5) {
				if (var5 >= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2894[0][2] = var2;
		var2 = new byte[this.field2893 * this.field2893];
		var3 = 0;

		for (var4 = this.field2893 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2893; ++var5) {
				if (var5 >= var4) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2894[0][3] = var2;
	}

	void method4816() {
		byte[] var2 = new byte[this.field2893 * this.field2893];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field2893 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2893; ++var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2894[1][0] = var2;
		var2 = new byte[this.field2893 * this.field2893];
		var3 = 0;

		for (var4 = 0; var4 < this.field2893; ++var4) {
			for (var5 = 0; var5 < this.field2893; ++var5) {
				if (var3 >= 0 && var3 < var2.length) {
					if (var5 >= var4 << 1) {
						var2[var3] = -1;
					}

					++var3;
				} else {
					++var3;
				}
			}
		}

		this.field2894[1][1] = var2;
		var2 = new byte[this.field2893 * this.field2893];
		var3 = 0;

		for (var4 = 0; var4 < this.field2893; ++var4) {
			for (var5 = this.field2893 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2894[1][2] = var2;
		var2 = new byte[this.field2893 * this.field2893];
		var3 = 0;

		for (var4 = this.field2893 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2893 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2894[1][3] = var2;
	}

	void method4841() {
		byte[] var2 = new byte[this.field2893 * this.field2893];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field2893 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2893 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2894[2][0] = var2;
		var2 = new byte[this.field2893 * this.field2893];
		var3 = 0;

		for (var4 = this.field2893 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2893; ++var5) {
				if (var5 >= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2894[2][1] = var2;
		var2 = new byte[this.field2893 * this.field2893];
		var3 = 0;

		for (var4 = 0; var4 < this.field2893; ++var4) {
			for (var5 = 0; var5 < this.field2893; ++var5) {
				if (var5 <= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2894[2][2] = var2;
		var2 = new byte[this.field2893 * this.field2893];
		var3 = 0;

		for (var4 = 0; var4 < this.field2893; ++var4) {
			for (var5 = this.field2893 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2894[2][3] = var2;
	}

	void method4830() {
		byte[] var2 = new byte[this.field2893 * this.field2893];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field2893 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2893; ++var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2894[3][0] = var2;
		var2 = new byte[this.field2893 * this.field2893];
		var3 = 0;

		for (var4 = 0; var4 < this.field2893; ++var4) {
			for (var5 = 0; var5 < this.field2893; ++var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2894[3][1] = var2;
		var2 = new byte[this.field2893 * this.field2893];
		var3 = 0;

		for (var4 = 0; var4 < this.field2893; ++var4) {
			for (var5 = this.field2893 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2894[3][2] = var2;
		var2 = new byte[this.field2893 * this.field2893];
		var3 = 0;

		for (var4 = this.field2893 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2893 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2894[3][3] = var2;
	}

	void method4839() {
		byte[] var2 = new byte[this.field2893 * this.field2893];
		int var3 = 0;

		int var4;
		int var5;
		for (var4 = this.field2893 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2893 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2894[4][0] = var2;
		var2 = new byte[this.field2893 * this.field2893];
		var3 = 0;

		for (var4 = this.field2893 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2893; ++var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2894[4][1] = var2;
		var2 = new byte[this.field2893 * this.field2893];
		var3 = 0;

		for (var4 = 0; var4 < this.field2893; ++var4) {
			for (var5 = 0; var5 < this.field2893; ++var5) {
				if (var5 >= var4 >> 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2894[4][2] = var2;
		var2 = new byte[this.field2893 * this.field2893];
		var3 = 0;

		for (var4 = 0; var4 < this.field2893; ++var4) {
			for (var5 = this.field2893 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 << 1) {
					var2[var3] = -1;
				}

				++var3;
			}
		}

		this.field2894[4][3] = var2;
	}

	void method4840() {
		byte[] var2 = new byte[this.field2893 * this.field2893];
		boolean var3 = false;
		var2 = new byte[this.field2893 * this.field2893];
		int var6 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field2893; ++var4) {
			for (var5 = 0; var5 < this.field2893; ++var5) {
				if (var5 <= this.field2893 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2894[5][0] = var2;
		var2 = new byte[this.field2893 * this.field2893];
		var6 = 0;

		for (var4 = 0; var4 < this.field2893; ++var4) {
			for (var5 = 0; var5 < this.field2893; ++var5) {
				if (var4 <= this.field2893 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2894[5][1] = var2;
		var2 = new byte[this.field2893 * this.field2893];
		var6 = 0;

		for (var4 = 0; var4 < this.field2893; ++var4) {
			for (var5 = 0; var5 < this.field2893; ++var5) {
				if (var5 >= this.field2893 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2894[5][2] = var2;
		var2 = new byte[this.field2893 * this.field2893];
		var6 = 0;

		for (var4 = 0; var4 < this.field2893; ++var4) {
			for (var5 = 0; var5 < this.field2893; ++var5) {
				if (var4 >= this.field2893 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2894[5][3] = var2;
	}

	void method4821() {
		byte[] var2 = new byte[this.field2893 * this.field2893];
		boolean var3 = false;
		var2 = new byte[this.field2893 * this.field2893];
		int var6 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field2893; ++var4) {
			for (var5 = 0; var5 < this.field2893; ++var5) {
				if (var5 <= var4 - this.field2893 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2894[6][0] = var2;
		var2 = new byte[this.field2893 * this.field2893];
		var6 = 0;

		for (var4 = this.field2893 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2893; ++var5) {
				if (var5 <= var4 - this.field2893 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2894[6][1] = var2;
		var2 = new byte[this.field2893 * this.field2893];
		var6 = 0;

		for (var4 = this.field2893 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2893 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 - this.field2893 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2894[6][2] = var2;
		var2 = new byte[this.field2893 * this.field2893];
		var6 = 0;

		for (var4 = 0; var4 < this.field2893; ++var4) {
			for (var5 = this.field2893 - 1; var5 >= 0; --var5) {
				if (var5 <= var4 - this.field2893 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2894[6][3] = var2;
	}

	void method4822() {
		byte[] var2 = new byte[this.field2893 * this.field2893];
		boolean var3 = false;
		var2 = new byte[this.field2893 * this.field2893];
		int var6 = 0;

		int var4;
		int var5;
		for (var4 = 0; var4 < this.field2893; ++var4) {
			for (var5 = 0; var5 < this.field2893; ++var5) {
				if (var5 >= var4 - this.field2893 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2894[7][0] = var2;
		var2 = new byte[this.field2893 * this.field2893];
		var6 = 0;

		for (var4 = this.field2893 - 1; var4 >= 0; --var4) {
			for (var5 = 0; var5 < this.field2893; ++var5) {
				if (var5 >= var4 - this.field2893 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2894[7][1] = var2;
		var2 = new byte[this.field2893 * this.field2893];
		var6 = 0;

		for (var4 = this.field2893 - 1; var4 >= 0; --var4) {
			for (var5 = this.field2893 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 - this.field2893 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2894[7][2] = var2;
		var2 = new byte[this.field2893 * this.field2893];
		var6 = 0;

		for (var4 = 0; var4 < this.field2893; ++var4) {
			for (var5 = this.field2893 - 1; var5 >= 0; --var5) {
				if (var5 >= var4 - this.field2893 / 2) {
					var2[var6] = -1;
				}

				++var6;
			}
		}

		this.field2894[7][3] = var2;
	}
}
