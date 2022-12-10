public class class374 extends class394 {
	final class451 field4447;

	public class374(class451 var1) {
		super(400);
		this.field4447 = var1;
	}

	class412 method7309() {
		return new class407();
	}

	class412[] method7316(int var1) {
		return new class407[var1];
	}

	public void method7018(class467 var1, int var2) {
		while (true) {
			if (var1.field4915 < var2) {
				int var4 = var1.method8326();
				boolean var5 = (var4 & 1) == 1;
				class483 var6 = new class483(var1.method8335(), this.field4447);
				class483 var7 = new class483(var1.method8335(), this.field4447);
				var1.method8335();
				if (var6 != null && var6.method8773()) {
					class407 var8 = (class407)this.method7311(var6);
					if (var5) {
						class407 var9 = (class407)this.method7311(var7);
						if (null != var9 && var8 != var9) {
							if (null != var8) {
								this.method7298(var9);
							} else {
								var8 = var9;
							}
						}
					}

					if (null != var8) {
						this.method7303(var8, var6, var7);
						continue;
					}

					if (this.method7291() < 400) {
						int var10 = this.method7291();
						var8 = (class407)this.method7300(var6, var7);
						var8.field4612 = var10;
					}
					continue;
				}

				throw new IllegalStateException();
			}

			return;
		}
	}
}
