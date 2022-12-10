public class class483 implements Comparable {
	String field5025;
	String field5026;

	public class483(String var1) {
		this.field5026 = var1;
		class451 var4 = class451.field4851;
		String var3;
		if (null == var1) {
			var3 = null;
		} else {
			label80: {
				int var5 = 0;

				int var6;
				for (var6 = var1.length(); var5 < var6; ++var5) {
					char var12 = var1.charAt(var5);
					boolean var7 = var12 == 160 || var12 == ' ' || var12 == '_' || var12 == '-';
					if (!var7) {
						break;
					}
				}

				while (var6 > var5 && class59.method1099(var1.charAt(var6 - 1))) {
					--var6;
				}

				int var13 = var6 - var5;
				if (var13 >= 1) {
					byte var9;
					if (var4 == null) {
						var9 = 12;
					} else {
						switch(var4.field4853) {
						case 1:
							var9 = 20;
							break;
						default:
							var9 = 12;
						}
					}

					if (var13 <= var9) {
						StringBuilder var8 = new StringBuilder(var13);

						for (int var14 = var5; var14 < var6; ++var14) {
							char var10 = var1.charAt(var14);
							if (class189.method3627(var10)) {
								char var11 = class462.method7347(var10);
								if (var11 != 0) {
									var8.append(var11);
								}
							}
						}

						if (var8.length() == 0) {
							var3 = null;
						} else {
							var3 = var8.toString();
						}
						break label80;
					}
				}

				var3 = null;
			}
		}

		this.field5025 = var3;
	}

	public class483(String var1, class451 var2) {
		this.field5026 = var1;
		String var4;
		if (var1 == null) {
			var4 = null;
		} else {
			label79: {
				int var5 = 0;

				int var6;
				for (var6 = var1.length(); var5 < var6; ++var5) {
					char var8 = var1.charAt(var5);
					boolean var7 = var8 == 160 || var8 == ' ' || var8 == '_' || var8 == '-';
					if (!var7) {
						break;
					}
				}

				while (var6 > var5 && class59.method1099(var1.charAt(var6 - 1))) {
					--var6;
				}

				int var13 = var6 - var5;
				if (var13 >= 1) {
					byte var9;
					if (null == var2) {
						var9 = 12;
					} else {
						switch(var2.field4853) {
						case 1:
							var9 = 20;
							break;
						default:
							var9 = 12;
						}
					}

					if (var13 <= var9) {
						StringBuilder var12 = new StringBuilder(var13);

						for (int var14 = var5; var14 < var6; ++var14) {
							char var10 = var1.charAt(var14);
							if (class189.method3627(var10)) {
								char var11 = class462.method7347(var10);
								if (var11 != 0) {
									var12.append(var11);
								}
							}
						}

						if (var12.length() == 0) {
							var4 = null;
						} else {
							var4 = var12.toString();
						}
						break label79;
					}
				}

				var4 = null;
			}
		}

		this.field5025 = var4;
	}

	public String method8771() {
		return this.field5026;
	}

	public String method8772() {
		return this.field5025;
	}

	public boolean method8773() {
		return this.field5025 != null;
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class483) {
			class483 var2 = (class483)var1;
			if (null == this.field5025) {
				return null == var2.field5025;
			} else if (var2.field5025 == null) {
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.field5025.equals(var2.field5025);
			}
		} else {
			return false;
		}
	}

	public int hashCode() {
		return null == this.field5025 ? 0 : this.field5025.hashCode();
	}

	public String toString() {
		return this.method8771();
	}

	public int method8779(class483 var1) {
		if (this.field5025 == null) {
			return null == var1.field5025 ? 0 : 1;
		} else {
			return null == var1.field5025 ? -1 : this.field5025.compareTo(var1.field5025);
		}
	}

	public int compareTo(Object var1) {
		return this.method8779((class483)var1);
	}
}
