public abstract class class337 {
	static class485 field4248;
	static int field4246;
	boolean field4244;
	boolean field4245;
	class471 field4233;
	class471[] field4239;
	int field4236;
	int[] field4230;
	int[] field4231;
	int[] field4232;
	int[] field4238;
	int[] field4242;
	int[][] field4237;
	int[][] field4247;
	Object[] field4240;
	Object[][] field4241;
	public int field4243;

	static {
		field4248 = new class485();
		field4246 = 0;
	}

	class337(boolean var1, boolean var2) {
		this.field4244 = var1;
		this.field4245 = var2;
	}

	void method6298(byte[] var1) {
		this.field4243 = class357.method6629(var1, var1.length);
		class467 var3 = new class467(class237.method4727(var1));
		int var4 = var3.method8326();
		if (var4 >= 5 && var4 <= 7) {
			if (var4 >= 6) {
				var3.method8480();
			}

			int var5 = var3.method8326();
			if (var4 >= 7) {
				this.field4236 = var3.method8388();
			} else {
				this.field4236 = var3.method8328();
			}

			int var6 = 0;
			int var7 = -1;
			this.field4230 = new int[this.field4236];
			int var8;
			if (var4 >= 7) {
				for (var8 = 0; var8 < this.field4236; ++var8) {
					this.field4230[var8] = var6 += var3.method8388();
					if (this.field4230[var8] > var7) {
						var7 = this.field4230[var8];
					}
				}
			} else {
				for (var8 = 0; var8 < this.field4236; ++var8) {
					this.field4230[var8] = var6 += var3.method8328();
					if (this.field4230[var8] > var7) {
						var7 = this.field4230[var8];
					}
				}
			}

			this.field4238 = new int[var7 + 1];
			this.field4231 = new int[var7 + 1];
			this.field4242 = new int[var7 + 1];
			this.field4237 = new int[var7 + 1][];
			this.field4240 = new Object[var7 + 1];
			this.field4241 = new Object[var7 + 1][];
			if (var5 != 0) {
				this.field4232 = new int[var7 + 1];

				for (var8 = 0; var8 < this.field4236; ++var8) {
					this.field4232[this.field4230[var8]] = var3.method8480();
				}

				this.field4233 = new class471(this.field4232);
			}

			for (var8 = 0; var8 < this.field4236; ++var8) {
				this.field4238[this.field4230[var8]] = var3.method8480();
			}

			for (var8 = 0; var8 < this.field4236; ++var8) {
				this.field4231[this.field4230[var8]] = var3.method8480();
			}

			for (var8 = 0; var8 < this.field4236; ++var8) {
				this.field4242[this.field4230[var8]] = var3.method8328();
			}

			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			if (var4 >= 7) {
				for (var8 = 0; var8 < this.field4236; ++var8) {
					var9 = this.field4230[var8];
					var10 = this.field4242[var9];
					var6 = 0;
					var11 = -1;
					this.field4237[var9] = new int[var10];

					for (var12 = 0; var12 < var10; ++var12) {
						var13 = this.field4237[var9][var12] = var6 += var3.method8388();
						if (var13 > var11) {
							var11 = var13;
						}
					}

					this.field4241[var9] = new Object[var11 + 1];
				}
			} else {
				for (var8 = 0; var8 < this.field4236; ++var8) {
					var9 = this.field4230[var8];
					var10 = this.field4242[var9];
					var6 = 0;
					var11 = -1;
					this.field4237[var9] = new int[var10];

					for (var12 = 0; var12 < var10; ++var12) {
						var13 = this.field4237[var9][var12] = var6 += var3.method8328();
						if (var13 > var11) {
							var11 = var13;
						}
					}

					this.field4241[var9] = new Object[var11 + 1];
				}
			}

			if (var5 != 0) {
				this.field4247 = new int[var7 + 1][];
				this.field4239 = new class471[var7 + 1];

				for (var8 = 0; var8 < this.field4236; ++var8) {
					var9 = this.field4230[var8];
					var10 = this.field4242[var9];
					this.field4247[var9] = new int[this.field4241[var9].length];

					for (var11 = 0; var11 < var10; ++var11) {
						this.field4247[var9][this.field4237[var9][var11]] = var3.method8480();
					}

					this.field4239[var9] = new class471(this.field4247[var9]);
				}
			}

		} else {
			throw new RuntimeException("");
		}
	}

	void method6300(int var1) {
	}

	public byte[] method6374(int var1, int var2) {
		return this.method6302(var1, var2, (int[])null);
	}

	public byte[] method6302(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < this.field4241.length && null != this.field4241[var1] && var2 >= 0 && var2 < this.field4241[var1].length) {
			if (this.field4241[var1][var2] == null) {
				boolean var5 = this.method6318(var1, var3);
				if (!var5) {
					this.method6311(var1);
					var5 = this.method6318(var1, var3);
					if (!var5) {
						return null;
					}
				}
			}

			byte[] var6 = class209.method4143(this.field4241[var1][var2], false);
			if (this.field4245) {
				this.field4241[var1][var2] = null;
			}

			return var6;
		} else {
			return null;
		}
	}

	public boolean method6366(int var1, int var2) {
		if (var1 >= 0 && var1 < this.field4241.length && null != this.field4241[var1] && var2 >= 0 && var2 < this.field4241[var1].length) {
			if (null != this.field4241[var1][var2]) {
				return true;
			} else if (this.field4240[var1] != null) {
				return true;
			} else {
				this.method6311(var1);
				return this.field4240[var1] != null;
			}
		} else {
			return false;
		}
	}

	public boolean method6346(int var1) {
		if (1 == this.field4241.length) {
			return this.method6366(0, var1);
		} else if (this.field4241[var1].length == 1) {
			return this.method6366(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	public boolean method6305(int var1) {
		if (null != this.field4240[var1]) {
			return true;
		} else {
			this.method6311(var1);
			return this.field4240[var1] != null;
		}
	}

	public boolean method6306() {
		boolean var2 = true;

		for (int var3 = 0; var3 < this.field4230.length; ++var3) {
			int var4 = this.field4230[var3];
			if (null == this.field4240[var4]) {
				this.method6311(var4);
				if (this.field4240[var4] == null) {
					var2 = false;
				}
			}
		}

		return var2;
	}

	int method6307(int var1) {
		return null != this.field4240[var1] ? 100 : 0;
	}

	public byte[] method6308(int var1) {
		if (this.field4241.length == 1) {
			return this.method6374(0, var1);
		} else if (this.field4241[var1].length == 1) {
			return this.method6374(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	public byte[] method6309(int var1, int var2) {
		if (var1 >= 0 && var1 < this.field4241.length && null != this.field4241[var1] && var2 >= 0 && var2 < this.field4241[var1].length) {
			if (this.field4241[var1][var2] == null) {
				boolean var4 = this.method6318(var1, (int[])null);
				if (!var4) {
					this.method6311(var1);
					var4 = this.method6318(var1, (int[])null);
					if (!var4) {
						return null;
					}
				}
			}

			byte[] var5 = class209.method4143(this.field4241[var1][var2], false);
			return var5;
		} else {
			return null;
		}
	}

	public byte[] method6310(int var1) {
		if (this.field4241.length == 1) {
			return this.method6309(0, var1);
		} else if (this.field4241[var1].length == 1) {
			return this.method6309(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	void method6311(int var1) {
	}

	public int[] method6312(int var1) {
		return var1 >= 0 && var1 < this.field4237.length ? this.field4237[var1] : null;
	}

	public int method6330(int var1) {
		return this.field4241[var1].length;
	}

	public int method6314() {
		return this.field4241.length;
	}

	public void method6313() {
		for (int var2 = 0; var2 < this.field4240.length; ++var2) {
			this.field4240[var2] = null;
		}

	}

	public void method6316(int var1) {
		for (int var3 = 0; var3 < this.field4241[var1].length; ++var3) {
			this.field4241[var1][var3] = null;
		}

	}

	public void method6375() {
		for (int var2 = 0; var2 < this.field4241.length; ++var2) {
			if (null != this.field4241[var2]) {
				for (int var3 = 0; var3 < this.field4241[var2].length; ++var3) {
					this.field4241[var2][var3] = null;
				}
			}
		}

	}

	boolean method6318(int var1, int[] var2) {
		if (null == this.field4240[var1]) {
			return false;
		} else {
			int var4 = this.field4242[var1];
			int[] var5 = this.field4237[var1];
			Object[] var6 = this.field4241[var1];
			boolean var7 = true;

			for (int var8 = 0; var8 < var4; ++var8) {
				if (var6[var5[var8]] == null) {
					var7 = false;
					break;
				}
			}

			if (var7) {
				return true;
			} else {
				byte[] var22;
				if (null == var2 || 0 == var2[0] && 0 == var2[1] && 0 == var2[2] && 0 == var2[3]) {
					var22 = class209.method4143(this.field4240[var1], false);
				} else {
					var22 = class209.method4143(this.field4240[var1], true);
					class467 var9 = new class467(var22);
					var9.method8489(var2, 5, var9.field4917.length);
				}

				byte[] var26 = class237.method4727(var22);
				if (this.field4244) {
					this.field4240[var1] = null;
				}

				int var11;
				if (var4 > 1) {
					int var10 = var26.length;
					--var10;
					var11 = var26[var10] & 255;
					var10 -= var11 * var4 * 4;
					class467 var12 = new class467(var26);
					int[] var13 = new int[var4];
					var12.field4915 = var10;

					int var15;
					int var16;
					for (int var14 = 0; var14 < var11; ++var14) {
						var15 = 0;

						for (var16 = 0; var16 < var4; ++var16) {
							var15 += var12.method8480();
							var13[var16] += var15;
						}
					}

					byte[][] var23 = new byte[var4][];

					for (var15 = 0; var15 < var4; ++var15) {
						var23[var15] = new byte[var13[var15]];
						var13[var15] = 0;
					}

					var12.field4915 = var10;
					var15 = 0;

					int var18;
					for (var16 = 0; var16 < var11; ++var16) {
						int var17 = 0;

						for (var18 = 0; var18 < var4; ++var18) {
							var17 += var12.method8480();
							System.arraycopy(var26, var15, var23[var18], var13[var18], var17);
							var13[var18] += var17;
							var15 += var17;
						}
					}

					for (var16 = 0; var16 < var4; ++var16) {
						if (!this.field4245) {
							var18 = var5[var16];
							byte[] var20 = var23[var16];
							Object var19;
							if (var20 == null) {
								var19 = null;
							} else if (var20.length > 136) {
								class294 var21 = new class294();
								var21.method6114(var20);
								var19 = var21;
							} else {
								var19 = var20;
							}

							var6[var18] = var19;
						} else {
							var6[var5[var16]] = var23[var16];
						}
					}
				} else if (!this.field4245) {
					var11 = var5[0];
					Object var27;
					if (var26 == null) {
						var27 = null;
					} else if (var26.length > 136) {
						class294 var28 = new class294();
						var28.method6114(var26);
						var27 = var28;
					} else {
						var27 = var26;
					}

					var6[var11] = var27;
				} else {
					var6[var5[0]] = var26;
				}

				return true;
			}
		}
	}

	public int method6319(String var1) {
		var1 = var1.toLowerCase();
		return this.field4233.method8617(class341.method2764(var1));
	}

	public int method6326(int var1, String var2) {
		var2 = var2.toLowerCase();
		return this.field4239[var1].method8617(class341.method2764(var2));
	}

	public boolean method6358(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = this.field4233.method8617(class341.method2764(var1));
		if (var4 < 0) {
			return false;
		} else {
			int var5 = this.field4239[var4].method8617(class341.method2764(var2));
			return var5 >= 0;
		}
	}

	public byte[] method6322(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = this.field4233.method8617(class341.method2764(var1));
		int var5 = this.field4239[var4].method8617(class341.method2764(var2));
		return this.method6374(var4, var5);
	}

	public boolean method6323(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = this.field4233.method8617(class341.method2764(var1));
		int var5 = this.field4239[var4].method8617(class341.method2764(var2));
		return this.method6366(var4, var5);
	}

	public boolean method6370(String var1) {
		var1 = var1.toLowerCase();
		int var3 = this.field4233.method8617(class341.method2764(var1));
		return this.method6305(var3);
	}

	public void method6390(String var1) {
		var1 = var1.toLowerCase();
		int var3 = this.field4233.method8617(class341.method2764(var1));
		if (var3 >= 0) {
			this.method6300(var3);
		}
	}

	public int method6303(String var1) {
		var1 = var1.toLowerCase();
		int var3 = this.field4233.method8617(class341.method2764(var1));
		return this.method6307(var3);
	}
}
