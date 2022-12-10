import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class448 extends class439 {
	class460[] field4844;
	List field4845;

	public class448(class337 var1, int var2, int var3) {
		byte[] var4 = var1.method6374(var2, var3 + 1);
		this.method8073(new class467(var4));
	}

	public class448(class337 var1, int var2) {
		byte[] var3 = var1.method6374(var2, 0);
		this.method8073(new class467(var3));
	}

	void method8073(class467 var1) {
		int var3 = var1.method8346();
		this.field4844 = new class460[var3];
		this.field4845 = new ArrayList(var3);

		for (int var4 = 0; var4 < var3; ++var4) {
			this.field4844[var4] = (class460)class78.method1584(class460.method8211(), var1.method8326());
			int var5 = var1.method8346();
			HashMap var6 = new HashMap(var5);

			while (var5-- > 0) {
				Object var7 = this.field4844[var4].method8203(var1);
				int var8 = var1.method8346();
				ArrayList var9 = new ArrayList();

				while (var8-- > 0) {
					int var10 = var1.method8346();
					var9.add(var10);
				}

				var6.put(var7, var9);
			}

			this.field4845.add(var4, var6);
		}

	}

	public List method8074(Object var1, int var2) {
		if (var2 < 0) {
			var2 = 0;
		}

		Map var4 = (Map)this.field4845.get(var2);
		return (List)var4.get(var1);
	}
}
