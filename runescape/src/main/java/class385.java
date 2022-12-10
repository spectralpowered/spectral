import java.util.ArrayList;

public class class385 {
	static class290 field4502;
	boolean field4496;
	boolean field4497;
	class369 field4498;
	int field4491;
	int field4495;
	int field4500;
	int field4501;
	ArrayList field4499;

	public class385() {
		this.field4491 = Integer.MAX_VALUE;
		this.field4495 = 0;
		this.field4496 = true;
		this.field4497 = true;
		this.field4499 = new ArrayList();
		this.field4500 = 0;
		this.field4501 = 0;
	}

	public class380 method7118(int var1) {
		return (class380)this.field4499.get(var1);
	}

	class380 method7119() {
		return this.field4499.size() == 0 ? null : (class380)this.field4499.get(this.field4499.size() - 1);
	}

	public boolean method7183() {
		return this.field4499.size() == 0;
	}

	public int method7121() {
		return this.field4499.size();
	}

	public String method7171() {
		if (this.method7183()) {
			return "";
		} else {
			StringBuilder var2 = new StringBuilder(this.method7121());

			for (int var3 = 0; var3 < this.method7121(); ++var3) {
				class380 var4 = this.method7118(var3);
				var2.append(var4.field4464);
			}

			return var2.toString();
		}
	}

	public void method7122(int var1, boolean var2) {
		if (null != this.field4498 && var1 < this.field4498.field4392 * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field4491 != var1 || var2 != this.field4496) {
			this.field4491 = var1;
			this.field4496 = var2;
			this.method7120(0, this.field4499.size(), false);
		}

	}

	public void method7123(int var1) {
		if (this.field4501 != var1) {
			this.field4501 = var1;
			this.method7120(0, this.field4499.size(), false);
		}

	}

	public void method7188(class369 var1) {
		if (var1 != this.field4498) {
			this.field4498 = var1;
			if (null != this.field4498) {
				if (this.field4495 == 0) {
					this.field4495 = this.field4498.field4392;
				}

				if (!this.method7183()) {
					this.method7120(0, this.field4499.size(), false);
				}
			}
		}

	}

	public void method7203(int var1) {
		if (this.field4500 != var1) {
			this.field4500 = var1;
			this.method7120(0, this.field4499.size(), false);
		}

	}

	public void method7197(int var1) {
		if (var1 != this.field4495) {
			this.field4495 = var1;
			this.method7120(0, this.field4499.size(), false);
		}

	}

	public class365 method7172(int var1, int var2) {
		if (var2 == var1) {
			return new class365(this, 0, 0);
		} else if (var1 <= this.field4499.size() && var2 <= this.field4499.size()) {
			return var2 < var1 ? new class365(this, var2, var1) : new class365(this, var1, var2);
		} else {
			return new class365(this, 0, 0);
		}
	}

	public class389 method7128(char var1, int var2, int var3, int var4) {
		return this.method7129(Character.toString(var1), var2, var3, var4);
	}

	public class389 method7129(String var1, int var2, int var3, int var4) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		if (this.field4499.size() >= var3) {
			return new class389(var2, true);
		} else {
			this.field4499.ensureCapacity(this.field4499.size() + var1.length());
			int var6 = var2;
			int var7 = 0;
			class380 var8 = this.method7146(var2);
			int var9 = this.method7147(var2);

			int var10;
			int var11;
			for (var10 = -1; var7 < var1.length() && this.field4499.size() < var3; ++var6) {
				class380 var12 = new class380();
				var12.field4464 = var1.charAt(var7++);
				if (var12.field4464 == '\n') {
					var12.field4466 = var8.field4466 + this.method7211();
					var11 = 0;
				} else {
					var12.field4467 = var9 + var8.field4467;
					var12.field4466 = var8.field4466;
					var11 = this.method7149(var12, false);
					if (this.field4496 && var11 + var12.field4467 > this.field4491) {
						if (this.field4500 == 0) {
							var12.field4467 = 0;
							var12.field4466 += this.method7211();
						} else if (var10 == -1) {
							var10 = var6;
						}
					}
				}

				var8 = var12;
				var9 = var11;
				this.field4499.add(var6, var12);
			}

			var11 = var10 == -1 ? var6 : var10;
			this.method7120(var11, this.field4499.size(), true);
			if (var4 != 0 && this.method7213() > var4) {
				while (var2 != var6) {
					--var6;
					this.method7133(var6);
					if (this.method7213() <= var4) {
						break;
					}
				}

				return new class389(var6, true);
			} else {
				return new class389(var6, false);
			}
		}
	}

	class389 method7130(String var1, int var2, int var3) {
		return this.method7129(var1, this.field4499.size(), var2, var3);
	}

	public class389 method7131(String var1) {
		this.method7132();
		return this.method7130(var1, 0, 0);
	}

	void method7132() {
		this.field4499.clear();
	}

	public int method7133(int var1) {
		return this.method7126(var1, var1 + 1);
	}

	public int method7126(int var1, int var2) {
		int var4;
		if (var2 < var1) {
			var4 = var2;
			var2 = var1;
			var1 = var4;
		}

		this.field4499.subList(var1, var2).clear();
		var4 = var1;
		if (this.field4496 && 1 == this.field4500) {
			label35: {
				int var5 = var1;

				char var6;
				do {
					if (var5 <= 0) {
						break label35;
					}

					--var5;
					var6 = ((class380)this.field4499.get(var5)).field4464;
				} while(var6 != ' ' && var6 != '\t');

				var4 = var5;
			}
		}

		this.method7120(var4, this.field4499.size(), true);
		return var1;
	}

	public int method7135(int var1, int var2) {
		if (null != this.field4498 && var1 >= 0 && var2 >= 0) {
			if (this.field4496 && var1 > this.field4491) {
				return this.field4499.size();
			} else {
				if (!this.field4499.isEmpty()) {
					for (int var4 = 0; var4 < this.field4499.size(); ++var4) {
						class380 var5 = (class380)this.field4499.get(var4);
						if (var2 <= var5.field4466 + this.method7211()) {
							if (var2 < var5.field4466) {
								break;
							}

							if (var1 < var5.field4467) {
								return var4 > 0 ? var4 - 1 : 0;
							}

							if (var4 + 1 != this.field4499.size() && ((class380)this.field4499.get(var4 + 1)).field4466 != var5.field4466) {
								int var6 = this.method7149((class380)this.field4499.get(var4), false);
								if (var1 < var5.field4467 + var6) {
									return var4;
								}

								if (var2 <= var5.field4466 + this.method7211()) {
									return var4 + 1;
								}
							}
						}
					}

					class380 var7 = (class380)this.field4499.get(this.field4499.size() - 1);
					if (var1 >= var7.field4467 && var1 <= var7.field4467 + this.method7141() && var2 >= var7.field4466 && var2 <= var7.field4466 + this.method7211()) {
						return this.field4499.size() - 1;
					}
				}

				return this.field4499.size();
			}
		} else {
			return 0;
		}
	}

	public int method7136(int var1, int var2) {
		if (null != this.field4498 && !this.method7183() && var1 <= this.field4499.size()) {
			byte var4;
			if (var2 > 0) {
				var4 = 1;
			} else {
				var4 = -1;
				var2 = -var2;
			}

			int var5 = 0;
			int var6 = 0;
			if (var1 > 0) {
				class380 var7 = (class380)this.field4499.get(var1 - 1);
				var5 = var7.field4467 + this.method7145(var1 - 1);
				var6 = var7.field4466;
			} else if (var4 == -1 && var1 == 0) {
				return 0;
			}

			int var15 = 16777215;
			int var8 = 0;
			int var9 = var1;
			int var10 = 16777215;
			int var11 = var4 == 1 ? this.field4499.size() + 1 : 0;

			for (int var12 = var1 + var4; var12 != var11; var12 += var4) {
				class380 var13 = (class380)this.field4499.get(var12 - 1);
				if (var13.field4466 != var6) {
					++var8;
					var6 = var13.field4466;
					if (var8 > var2) {
						return var9;
					}
				}

				if (var8 == var2) {
					int var14 = Math.abs(var13.field4467 + this.method7145(var12 - 1) - var5);
					if (var14 >= var10) {
						return var9;
					}

					var9 = var12;
					var10 = var14;
				}
			}

			if (var4 == 1) {
				return this.field4499.size();
			} else {
				if (var6 != 0) {
					++var8;
				}

				return var10 != 16777215 && (var8 != var2 || var5 >= var10) ? var9 : 0;
			}
		} else {
			return 0;
		}
	}

	public int method7137() {
		if (!this.field4499.isEmpty() && this.method7213() == 1) {
			return this.field4499.isEmpty() ? 0 : ((class380)this.field4499.get(this.field4499.size() - 1)).field4467 + this.method7141();
		} else {
			int var2 = -1;
			int var3 = 0;

			for (int var4 = this.field4499.size() - 1; var4 >= 0; --var4) {
				class380 var5 = (class380)this.field4499.get(var4);
				if (var5.field4466 != var2) {
					int var6 = this.method7149(var5, false) + var5.field4467;
					var3 = Math.max(var6, var3);
					var2 = var5.field4466;
				}
			}

			return var3;
		}
	}

	public int method7220() {
		return this.method7183() ? 0 : this.field4498.field4392 + ((class380)this.field4499.get(this.field4499.size() - 1)).field4466;
	}

	public int method7211() {
		return this.field4495;
	}

	public int method7213() {
		return this.method7220() / this.field4498.field4392;
	}

	int method7141() {
		return this.method7183() ? 0 : this.method7149((class380)this.field4499.get(this.field4499.size() - 1), false);
	}

	public int method7142() {
		return this.field4491;
	}

	public int method7143() {
		return this.field4500;
	}

	public int method7184() {
		return this.field4501;
	}

	void method7120(int var1, int var2, boolean var3) {
		if (!this.method7183() && null != this.field4498) {
			class380 var5 = this.method7146(var1);
			int var6 = this.method7147(var1);

			for (int var7 = var1; var7 < var2; ++var7) {
				class380 var8 = (class380)this.field4499.get(var7);
				int var11;
				if (var8.field4464 == '\n') {
					int var10 = var5.field4466 + this.method7211();
					if (var3) {
						if (var8.field4466 != var10) {
							var11 = var10 - var8.field4466;

							for (int var12 = var7; var12 < var2; ++var12) {
								class380 var10000 = (class380)this.field4499.get(var12);
								var10000.field4466 += var11;
							}
						}
						break;
					}

					var8.field4466 = var10;
					boolean var9 = false;
				} else {
					var8.field4467 = var6 + var5.field4467;
					var8.field4466 = var5.field4466;
					int var19 = this.method7149(var8, false);
					if (this.field4496 && var8.field4467 + var19 > this.field4491) {
						boolean var20 = false;
						if (1 == this.field4500) {
							for (var11 = var7; var11 > 0; --var11) {
								class380 var18 = (class380)this.field4499.get(var11 - 1);
								if (var8.field4466 != var18.field4466) {
									break;
								}

								if (var18.field4464 == ' ' || var18.field4464 == '\t') {
									class380 var13 = (class380)this.field4499.get(var11);
									int var14 = var13.field4467;
									int var15 = var13.field4466 + this.method7211();

									for (int var16 = var11; var16 <= var7; ++var16) {
										class380 var17 = (class380)this.field4499.get(var16);
										var17.field4467 -= var14;
										var17.field4466 = var15;
									}

									var20 = true;
									break;
								}
							}
						}

						if (!var20) {
							var8.field4467 = 0;
							var8.field4466 += this.method7211();
						}
					}
				}

				var5 = (class380)this.field4499.get(var7);
				var6 = this.method7149(var5, false);
			}

		}
	}

	class380 method7146(int var1) {
		if (var1 > 0 && !this.field4499.isEmpty()) {
			return var1 >= this.field4499.size() ? (class380)this.field4499.get(this.field4499.size() - 1) : (class380)this.field4499.get(var1 - 1);
		} else {
			return new class380();
		}
	}

	int method7147(int var1) {
		if (var1 > 0 && !this.field4499.isEmpty()) {
			return var1 >= this.field4499.size() ? this.method7145(this.field4499.size() - 1) : this.method7145(var1 - 1);
		} else {
			return 0;
		}
	}

	int method7145(int var1) {
		return var1 < this.field4499.size() ? this.method7149((class380)this.field4499.get(var1), false) : 0;
	}

	int method7149(class380 var1, boolean var2) {
		if (var1.field4464 == '\n') {
			return 0;
		} else if (!var2 && 0 != this.field4501) {
			return this.field4498.field4400[42];
		} else {
			int var4 = this.field4498.field4400[var1.field4464];
			if (var4 == 0) {
				return var1.field4464 == '\t' ? this.field4498.field4400[32] * 3 : this.field4498.field4400[32];
			} else {
				return var4;
			}
		}
	}
}
