public final class class342 {
	class439 field4274;

	public class342() {
		this.field4274 = new class439();
		this.field4274.field4798 = this.field4274;
		this.field4274.field4796 = this.field4274;
	}

	public void method6474(class439 var1) {
		if (var1.field4796 != null) {
			var1.method7996();
		}

		var1.field4796 = this.field4274.field4796;
		var1.field4798 = this.field4274;
		var1.field4796.field4798 = var1;
		var1.field4798.field4796 = var1;
	}

	public void method6475(class439 var1) {
		if (var1.field4796 != null) {
			var1.method7996();
		}

		var1.field4796 = this.field4274;
		var1.field4798 = this.field4274.field4798;
		var1.field4796.field4798 = var1;
		var1.field4798.field4796 = var1;
	}

	public class439 method6476() {
		class439 var1 = this.field4274.field4798;
		return var1 == this.field4274 ? null : var1;
	}
}
