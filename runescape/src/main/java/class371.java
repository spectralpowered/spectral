public class class371 extends class394 {
	int field4425;
	final class451 field4424;
	public class339 field4423;

	public class371(class451 var1) {
		super(400);
		this.field4425 = 1;
		this.field4423 = new class339();
		this.field4424 = var1;
	}

	class412 method7309() {
		return new class395();
	}

	class412[] method7316(int var1) {
		return new class395[var1];
	}

	public boolean method6963(class483 var1, boolean var2) {
		class395 var4 = (class395)this.method7314(var1);
		if (null == var4) {
			return false;
		} else {
			return !var2 || var4.field4520 != 0;
		}
	}

	public void method6953(class467 var1, int var2) {
		while (true) {
			if (var1.field4915 < var2) {
				boolean var4 = var1.method8326() == 1;
				class483 var5 = new class483(var1.method8335(), this.field4424);
				class483 var6 = new class483(var1.method8335(), this.field4424);
				int var7 = var1.method8328();
				int var8 = var1.method8326();
				int var9 = var1.method8326();
				boolean var10 = 0 != (var9 & 2);
				boolean var11 = 0 != (var9 & 1);
				if (var7 > 0) {
					var1.method8335();
					var1.method8326();
					var1.method8480();
				}

				var1.method8335();
				if (var5 != null && var5.method8773()) {
					class395 var12 = (class395)this.method7311(var5);
					if (var4) {
						class395 var13 = (class395)this.method7311(var6);
						if (var13 != null && var12 != var13) {
							if (null != var12) {
								this.method7298(var13);
							} else {
								var12 = var13;
							}
						}
					}

					if (null != var12) {
						this.method7303(var12, var5, var6);
						if (var12.field4520 != var7) {
							boolean var15 = true;

							for (class415 var14 = (class415)this.field4423.method6404(); var14 != null; var14 = (class415)this.field4423.method6406()) {
								if (var14.field4642.equals(var5)) {
									if (var7 != 0 && var14.field4643 == 0) {
										var14.method7971();
										var15 = false;
									} else if (var7 == 0 && var14.field4643 != 0) {
										var14.method7971();
										var15 = false;
									}
								}
							}

							if (var15) {
								this.field4423.method6405(new class415(var5, var7));
							}
						}
					} else {
						if (this.method7291() >= 400) {
							continue;
						}

						var12 = (class395)this.method7300(var5, var6);
					}

					if (var7 != var12.field4520) {
						var12.field4522 = ++this.field4425 - 1;
						if (-1 == var12.field4520 && var7 == 0) {
							var12.field4522 = -(var12.field4522 * -388257165) * 1595280059;
						}

						var12.field4520 = var7;
					}

					var12.field4521 = var8;
					var12.field4546 = var10;
					var12.field4545 = var11;
					continue;
				}

				throw new IllegalStateException();
			}

			this.method7353();
			return;
		}
	}
}
