public class class42 extends class27 {
	boolean field306;
	int field296;
	int field297;
	int field298;
	int field299;
	int field300;
	int field301;
	int field302;
	int field303;
	int field304;
	int field305;
	int field307;
	int field308;
	int field309;
	int field310;

	static int method768(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	static int method797(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	int method354() {
		int var1 = this.field300 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.field303 == 0) {
			var1 -= var1 * this.field296 / (((class32)super.field144).field179.length << 8);
		} else if (this.field303 >= 0) {
			var1 -= var1 * this.field304 / ((class32)super.field144).field179.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	class42(class32 var1, int var2, int var3) {
		super.field144 = var1;
		this.field304 = var1.field180;
		this.field301 = var1.field178;
		this.field306 = var1.field182;
		this.field297 = var2;
		this.field310 = var3;
		this.field298 = 8192;
		this.field296 = 0;
		this.method726();
	}

	class42(class32 var1, int var2, int var3, int var4) {
		super.field144 = var1;
		this.field304 = var1.field180;
		this.field301 = var1.field178;
		this.field306 = var1.field182;
		this.field297 = var2;
		this.field310 = var3;
		this.field298 = var4;
		this.field296 = 0;
		this.method726();
	}

	public static class42 method725(class32 var0, int var1, int var2) {
		return var0.field179 != null && var0.field179.length != 0 ? new class42(var0, (int)((long)var0.field181 * 256L * (long)var1 / (long)(class50.field363 * 100)), var2 << 6) : null;
	}

	public static class42 method832(class32 var0, int var1, int var2, int var3) {
		return var0.field179 != null && var0.field179.length != 0 ? new class42(var0, var1, var2, var3) : null;
	}

	void method726() {
		this.field300 = this.field310;
		this.field299 = method768(this.field310, this.field298);
		this.field302 = method797(this.field310, this.field298);
	}

	public synchronized void method727(int var1) {
		this.field303 = var1;
	}

	public synchronized void method728(int var1) {
		this.method730(var1 << 6, this.method742());
	}

	synchronized void method815(int var1) {
		this.method730(var1, this.method742());
	}

	synchronized void method730(int var1, int var2) {
		this.field310 = var1;
		this.field298 = var2;
		this.field307 = 0;
		this.method726();
	}

	public synchronized int method771() {
		return this.field310 == Integer.MIN_VALUE ? 0 : this.field310;
	}

	public synchronized int method742() {
		return this.field298 < 0 ? -1 : this.field298;
	}

	public synchronized void method732(int var1) {
		int var2 = ((class32)super.field144).field179.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field296 = var1;
	}

	public synchronized void method733(boolean var1) {
		this.field297 = (this.field297 ^ this.field297 >> 31) + (this.field297 >>> 31);
		if (var1) {
			this.field297 = -this.field297;
		}

	}

	void method766() {
		if (this.field307 != 0) {
			if (this.field310 == Integer.MIN_VALUE) {
				this.field310 = 0;
			}

			this.field307 = 0;
			this.method726();
		}

	}

	public synchronized void method735(int var1, int var2) {
		this.method736(var1, var2, this.method742());
	}

	public synchronized void method736(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method730(var2, var3);
		} else {
			int var4 = method768(var2, var3);
			int var5 = method797(var2, var3);
			if (this.field299 == var4 && this.field302 == var5) {
				this.field307 = 0;
			} else {
				int var6 = var2 - this.field300;
				if (this.field300 - var2 > var6) {
					var6 = this.field300 - var2;
				}

				if (var4 - this.field299 > var6) {
					var6 = var4 - this.field299;
				}

				if (this.field299 - var4 > var6) {
					var6 = this.field299 - var4;
				}

				if (var5 - this.field302 > var6) {
					var6 = var5 - this.field302;
				}

				if (this.field302 - var5 > var6) {
					var6 = this.field302 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field307 = var1;
				this.field310 = var2;
				this.field298 = var3;
				this.field308 = (var2 - this.field300) / var1;
				this.field309 = (var4 - this.field299) / var1;
				this.field305 = (var5 - this.field302) / var1;
			}
		}
	}

	public synchronized void method737(int var1) {
		if (var1 == 0) {
			this.method815(0);
			this.method7951();
		} else if (this.field299 == 0 && this.field302 == 0) {
			this.field307 = 0;
			this.field310 = 0;
			this.field300 = 0;
			this.method7951();
		} else {
			int var2 = -this.field300;
			if (this.field300 > var2) {
				var2 = this.field300;
			}

			if (-this.field299 > var2) {
				var2 = -this.field299;
			}

			if (this.field299 > var2) {
				var2 = this.field299;
			}

			if (-this.field302 > var2) {
				var2 = -this.field302;
			}

			if (this.field302 > var2) {
				var2 = this.field302;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field307 = var1;
			this.field310 = Integer.MIN_VALUE;
			this.field308 = -this.field300 / var1;
			this.field309 = -this.field299 / var1;
			this.field305 = -this.field302 / var1;
		}
	}

	public synchronized void method738(int var1) {
		if (this.field297 < 0) {
			this.field297 = -var1;
		} else {
			this.field297 = var1;
		}

	}

	public synchronized int method739() {
		return this.field297 < 0 ? -this.field297 : this.field297;
	}

	public boolean method740() {
		return this.field296 < 0 || this.field296 >= ((class32)super.field144).field179.length << 8;
	}

	public boolean method783() {
		return this.field307 != 0;
	}

	protected class27 method355() {
		return null;
	}

	protected class27 method359() {
		return null;
	}

	protected int method365() {
		return this.field310 == 0 && this.field307 == 0 ? 0 : 1;
	}

	public synchronized void method356(int[] var1, int var2, int var3) {
		if (this.field310 == 0 && this.field307 == 0) {
			this.method360(var3);
		} else {
			class32 var4 = (class32)super.field144;
			int var5 = this.field304 << 8;
			int var6 = this.field301 << 8;
			int var7 = var4.field179.length << 8;
			int var8 = var6 - var5;
			if (var8 <= 0) {
				this.field303 = 0;
			}

			int var9 = var2;
			var3 += var2;
			if (this.field296 < 0) {
				if (this.field297 <= 0) {
					this.method766();
					this.method7951();
					return;
				}

				this.field296 = 0;
			}

			if (this.field296 >= var7) {
				if (this.field297 >= 0) {
					this.method766();
					this.method7951();
					return;
				}

				this.field296 = var7 - 1;
			}

			if (this.field303 < 0) {
				if (this.field306) {
					if (this.field297 < 0) {
						var9 = this.method746(var1, var2, var5, var3, var4.field179[this.field304]);
						if (this.field296 >= var5) {
							return;
						}

						this.field296 = var5 + var5 - 1 - this.field296;
						this.field297 = -this.field297;
					}

					while (true) {
						var9 = this.method745(var1, var9, var6, var3, var4.field179[this.field301 - 1]);
						if (this.field296 < var6) {
							return;
						}

						this.field296 = var6 + var6 - 1 - this.field296;
						this.field297 = -this.field297;
						var9 = this.method746(var1, var9, var5, var3, var4.field179[this.field304]);
						if (this.field296 >= var5) {
							return;
						}

						this.field296 = var5 + var5 - 1 - this.field296;
						this.field297 = -this.field297;
					}
				} else if (this.field297 < 0) {
					while (true) {
						var9 = this.method746(var1, var9, var5, var3, var4.field179[this.field301 - 1]);
						if (this.field296 >= var5) {
							return;
						}

						this.field296 = var6 - 1 - (var6 - 1 - this.field296) % var8;
					}
				} else {
					while (true) {
						var9 = this.method745(var1, var9, var6, var3, var4.field179[this.field304]);
						if (this.field296 < var6) {
							return;
						}

						this.field296 = var5 + (this.field296 - var5) % var8;
					}
				}
			} else {
				if (this.field303 > 0) {
					if (this.field306) {
						label130: {
							if (this.field297 < 0) {
								var9 = this.method746(var1, var2, var5, var3, var4.field179[this.field304]);
								if (this.field296 >= var5) {
									return;
								}

								this.field296 = var5 + var5 - 1 - this.field296;
								this.field297 = -this.field297;
								if (--this.field303 == 0) {
									break label130;
								}
							}

							do {
								var9 = this.method745(var1, var9, var6, var3, var4.field179[this.field301 - 1]);
								if (this.field296 < var6) {
									return;
								}

								this.field296 = var6 + var6 - 1 - this.field296;
								this.field297 = -this.field297;
								if (--this.field303 == 0) {
									break;
								}

								var9 = this.method746(var1, var9, var5, var3, var4.field179[this.field304]);
								if (this.field296 >= var5) {
									return;
								}

								this.field296 = var5 + var5 - 1 - this.field296;
								this.field297 = -this.field297;
							} while(--this.field303 != 0);
						}
					} else {
						int var10;
						if (this.field297 < 0) {
							while (true) {
								var9 = this.method746(var1, var9, var5, var3, var4.field179[this.field301 - 1]);
								if (this.field296 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field296) / var8;
								if (var10 >= this.field303) {
									this.field296 += var8 * this.field303;
									this.field303 = 0;
									break;
								}

								this.field296 += var8 * var10;
								this.field303 -= var10;
							}
						} else {
							while (true) {
								var9 = this.method745(var1, var9, var6, var3, var4.field179[this.field304]);
								if (this.field296 < var6) {
									return;
								}

								var10 = (this.field296 - var5) / var8;
								if (var10 >= this.field303) {
									this.field296 -= var8 * this.field303;
									this.field303 = 0;
									break;
								}

								this.field296 -= var8 * var10;
								this.field303 -= var10;
							}
						}
					}
				}

				if (this.field297 < 0) {
					this.method746(var1, var9, 0, var3, 0);
					if (this.field296 < 0) {
						this.field296 = -1;
						this.method766();
						this.method7951();
					}
				} else {
					this.method745(var1, var9, var7, var3, 0);
					if (this.field296 >= var7) {
						this.field296 = var7;
						this.method766();
						this.method7951();
					}
				}

			}
		}
	}

	public synchronized void method360(int var1) {
		if (this.field307 > 0) {
			if (var1 >= this.field307) {
				if (this.field310 == Integer.MIN_VALUE) {
					this.field310 = 0;
					this.field302 = 0;
					this.field299 = 0;
					this.field300 = 0;
					this.method7951();
					var1 = this.field307;
				}

				this.field307 = 0;
				this.method726();
			} else {
				this.field300 += this.field308 * var1;
				this.field299 += this.field309 * var1;
				this.field302 += this.field305 * var1;
				this.field307 -= var1;
			}
		}

		class32 var2 = (class32)super.field144;
		int var3 = this.field304 << 8;
		int var4 = this.field301 << 8;
		int var5 = var2.field179.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.field303 = 0;
		}

		if (this.field296 < 0) {
			if (this.field297 <= 0) {
				this.method766();
				this.method7951();
				return;
			}

			this.field296 = 0;
		}

		if (this.field296 >= var5) {
			if (this.field297 >= 0) {
				this.method766();
				this.method7951();
				return;
			}

			this.field296 = var5 - 1;
		}

		this.field296 += this.field297 * var1;
		if (this.field303 < 0) {
			if (!this.field306) {
				if (this.field297 < 0) {
					if (this.field296 >= var3) {
						return;
					}

					this.field296 = var4 - 1 - (var4 - 1 - this.field296) % var6;
				} else {
					if (this.field296 < var4) {
						return;
					}

					this.field296 = var3 + (this.field296 - var3) % var6;
				}

			} else {
				if (this.field297 < 0) {
					if (this.field296 >= var3) {
						return;
					}

					this.field296 = var3 + var3 - 1 - this.field296;
					this.field297 = -this.field297;
				}

				while (this.field296 >= var4) {
					this.field296 = var4 + var4 - 1 - this.field296;
					this.field297 = -this.field297;
					if (this.field296 >= var3) {
						return;
					}

					this.field296 = var3 + var3 - 1 - this.field296;
					this.field297 = -this.field297;
				}

			}
		} else {
			if (this.field303 > 0) {
				if (this.field306) {
					label121: {
						if (this.field297 < 0) {
							if (this.field296 >= var3) {
								return;
							}

							this.field296 = var3 + var3 - 1 - this.field296;
							this.field297 = -this.field297;
							if (--this.field303 == 0) {
								break label121;
							}
						}

						do {
							if (this.field296 < var4) {
								return;
							}

							this.field296 = var4 + var4 - 1 - this.field296;
							this.field297 = -this.field297;
							if (--this.field303 == 0) {
								break;
							}

							if (this.field296 >= var3) {
								return;
							}

							this.field296 = var3 + var3 - 1 - this.field296;
							this.field297 = -this.field297;
						} while(--this.field303 != 0);
					}
				} else {
					label153: {
						int var7;
						if (this.field297 < 0) {
							if (this.field296 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field296) / var6;
							if (var7 >= this.field303) {
								this.field296 += var6 * this.field303;
								this.field303 = 0;
								break label153;
							}

							this.field296 += var6 * var7;
							this.field303 -= var7;
						} else {
							if (this.field296 < var4) {
								return;
							}

							var7 = (this.field296 - var3) / var6;
							if (var7 >= this.field303) {
								this.field296 -= var6 * this.field303;
								this.field303 = 0;
								break label153;
							}

							this.field296 -= var6 * var7;
							this.field303 -= var7;
						}

						return;
					}
				}
			}

			if (this.field297 < 0) {
				if (this.field296 < 0) {
					this.field296 = -1;
					this.method766();
					this.method7951();
				}
			} else if (this.field296 >= var5) {
				this.field296 = var5;
				this.method766();
				this.method7951();
			}

		}
	}

	int method745(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field307 > 0) {
				int var6 = var2 + this.field307;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field307 += var2;
				if (this.field297 == 256 && (this.field296 & 255) == 0) {
					if (class300.field3640) {
						var2 = method779(0, ((class32)super.field144).field179, var1, this.field296, var2, this.field299, this.field302, this.field309, this.field305, 0, var6, var3, this);
					} else {
						var2 = method755(((class32)super.field144).field179, var1, this.field296, var2, this.field300, this.field308, 0, var6, var3, this);
					}
				} else if (class300.field3640) {
					var2 = method743(0, 0, ((class32)super.field144).field179, var1, this.field296, var2, this.field299, this.field302, this.field309, this.field305, 0, var6, var3, this, this.field297, var5);
				} else {
					var2 = method758(0, 0, ((class32)super.field144).field179, var1, this.field296, var2, this.field300, this.field308, 0, var6, var3, this, this.field297, var5);
				}

				this.field307 -= var2;
				if (this.field307 != 0) {
					return var2;
				}

				if (!this.method817()) {
					continue;
				}

				return var4;
			}

			if (this.field297 == 256 && (this.field296 & 255) == 0) {
				if (class300.field3640) {
					return method749(0, ((class32)super.field144).field179, var1, this.field296, var2, this.field299, this.field302, 0, var4, var3, this);
				}

				return method731(((class32)super.field144).field179, var1, this.field296, var2, this.field300, 0, var4, var3, this);
			}

			if (class300.field3640) {
				return method752(0, 0, ((class32)super.field144).field179, var1, this.field296, var2, this.field299, this.field302, 0, var4, var3, this, this.field297, var5);
			}

			return method818(0, 0, ((class32)super.field144).field179, var1, this.field296, var2, this.field300, 0, var4, var3, this, this.field297, var5);
		}
	}

	int method746(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field307 > 0) {
				int var6 = var2 + this.field307;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field307 += var2;
				if (this.field297 == -256 && (this.field296 & 255) == 0) {
					if (class300.field3640) {
						var2 = method757(0, ((class32)super.field144).field179, var1, this.field296, var2, this.field299, this.field302, this.field309, this.field305, 0, var6, var3, this);
					} else {
						var2 = method756(((class32)super.field144).field179, var1, this.field296, var2, this.field300, this.field308, 0, var6, var3, this);
					}
				} else if (class300.field3640) {
					var2 = method761(0, 0, ((class32)super.field144).field179, var1, this.field296, var2, this.field299, this.field302, this.field309, this.field305, 0, var6, var3, this, this.field297, var5);
				} else {
					var2 = method760(0, 0, ((class32)super.field144).field179, var1, this.field296, var2, this.field300, this.field308, 0, var6, var3, this, this.field297, var5);
				}

				this.field307 -= var2;
				if (this.field307 != 0) {
					return var2;
				}

				if (!this.method817()) {
					continue;
				}

				return var4;
			}

			if (this.field297 == -256 && (this.field296 & 255) == 0) {
				if (class300.field3640) {
					return method750(0, ((class32)super.field144).field179, var1, this.field296, var2, this.field299, this.field302, 0, var4, var3, this);
				}

				return method810(((class32)super.field144).field179, var1, this.field296, var2, this.field300, 0, var4, var3, this);
			}

			if (class300.field3640) {
				return method754(0, 0, ((class32)super.field144).field179, var1, this.field296, var2, this.field299, this.field302, 0, var4, var3, this, this.field297, var5);
			}

			return method753(0, 0, ((class32)super.field144).field179, var1, this.field296, var2, this.field300, 0, var4, var3, this, this.field297, var5);
		}
	}

	boolean method817() {
		int var1 = this.field310;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method768(var1, this.field298);
			var3 = method797(var1, this.field298);
		}

		if (this.field300 == var1 && this.field299 == var2 && this.field302 == var3) {
			if (this.field310 == Integer.MIN_VALUE) {
				this.field310 = 0;
				this.field302 = 0;
				this.field299 = 0;
				this.field300 = 0;
				this.method7951();
				return true;
			} else {
				this.method726();
				return false;
			}
		} else {
			if (this.field300 < var1) {
				this.field308 = 1;
				this.field307 = var1 - this.field300;
			} else if (this.field300 > var1) {
				this.field308 = -1;
				this.field307 = this.field300 - var1;
			} else {
				this.field308 = 0;
			}

			if (this.field299 < var2) {
				this.field309 = 1;
				if (this.field307 == 0 || this.field307 > var2 - this.field299) {
					this.field307 = var2 - this.field299;
				}
			} else if (this.field299 > var2) {
				this.field309 = -1;
				if (this.field307 == 0 || this.field307 > this.field299 - var2) {
					this.field307 = this.field299 - var2;
				}
			} else {
				this.field309 = 0;
			}

			if (this.field302 < var3) {
				this.field305 = 1;
				if (this.field307 == 0 || this.field307 > var3 - this.field302) {
					this.field307 = var3 - this.field302;
				}
			} else if (this.field302 > var3) {
				this.field305 = -1;
				if (this.field307 == 0 || this.field307 > this.field302 - var3) {
					this.field307 = this.field302 - var3;
				}
			} else {
				this.field305 = 0;
			}

			return false;
		}
	}

	static int method731(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class42 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var7 - var2) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
		}

		var8.field296 = var2 << 8;
		return var3;
	}

	static int method749(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class42 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var9 - var3) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field296 = var3 << 8;
		return var4 >> 1;
	}

	static int method810(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class42 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
		}

		var8.field296 = var2 << 8;
		return var3;
	}

	static int method750(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class42 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field296 = var3 << 8;
		return var4 >> 1;
	}

	static int method818(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class42 var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
			var7 = var8;
		}

		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
			var7 = var8;
		}

		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
		}

		var10.field296 = var4;
		return var5;
	}

	static int method752(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class42 var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field296 = var4;
		return var5 >> 1;
	}

	static int method753(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class42 var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}

		var0 = var12;

		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
		}

		var10.field296 = var4;
		return var5;
	}

	static int method754(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class42 var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field296 = var4;
		return var5 >> 1;
	}

	static int method755(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class42 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field299 += var9.field309 * (var6 - var3);
		var9.field302 += var9.field305 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		var9.field300 = var4 >> 2;
		var9.field296 = var2 << 8;
		return var3;
	}

	static int method779(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class42 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var4 + var11 - var3) > var10) {
			var9 = var10;
		}

		var12.field300 += var12.field308 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field299 = var5 >> 2;
		var12.field302 = var6 >> 2;
		var12.field296 = var3 << 8;
		return var4 >> 1;
	}

	static int method756(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class42 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field299 += var9.field309 * (var6 - var3);
		var9.field302 += var9.field305 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		var9.field300 = var4 >> 2;
		var9.field296 = var2 << 8;
		return var3;
	}

	static int method757(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class42 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field300 += var12.field308 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field299 = var5 >> 2;
		var12.field302 = var6 >> 2;
		var12.field296 = var3 << 8;
		return var4 >> 1;
	}

	static int method758(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class42 var11, int var12, int var13) {
		var11.field299 -= var11.field309 * var5;
		var11.field302 -= var11.field305 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field299 += var11.field309 * var5;
		var11.field302 += var11.field305 * var5;
		var11.field300 = var6;
		var11.field296 = var4;
		return var5;
	}

	static int method743(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class42 var13, int var14, int var15) {
		var13.field300 -= var13.field308 * var5;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field300 += var13.field308 * var5;
		var13.field299 = var6;
		var13.field302 = var7;
		var13.field296 = var4;
		return var5;
	}

	static int method760(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class42 var11, int var12, int var13) {
		var11.field299 -= var11.field309 * var5;
		var11.field302 -= var11.field305 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var0 = var13;

		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field299 += var11.field309 * var5;
		var11.field302 += var11.field305 * var5;
		var11.field300 = var6;
		var11.field296 = var4;
		return var5;
	}

	static int method761(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class42 var13, int var14, int var15) {
		var13.field300 -= var13.field308 * var5;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			byte var16 = var2[var1 - 1];
			var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field300 += var13.field308 * var5;
		var13.field299 = var6;
		var13.field302 = var7;
		var13.field296 = var4;
		return var5;
	}
}
