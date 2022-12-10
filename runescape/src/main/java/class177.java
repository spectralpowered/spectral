import java.io.File;

public class class177 extends class178 {
	static class326 field1644;
	int field1646;
	// $FF: synthetic field
	final class167 this$0;

	public static void method2957(File var0) {
		class176.field1641 = var0;
		if (!class176.field1641.exists()) {
			throw new RuntimeException("");
		} else {
			class176.field1640 = true;
		}
	}

	class177(class167 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1646 = var3;
	}

	public int method2964() {
		return 0;
	}

	public int method2971() {
		return this.field1646;
	}
}
