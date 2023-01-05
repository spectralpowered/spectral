import java.util.zip.Inflater;

public class class409 {
   Inflater field3546;

   public class409() {
      this(-1, 1000000);
   }

   class409(int var1, int var2) {
   }

   public void method1994(class134 var1, byte[] var2) {
      if (var1.field1489[var1.field1487] == 31 && -117 == var1.field1489[1 + var1.field1487]) {
         if (this.field3546 == null) {
            this.field3546 = new Inflater(true);
         }

         try {
            this.field3546.setInput(var1.field1489, var1.field1487 + 10, var1.field1489.length - (var1.field1487 + 10 + 8));
            this.field3546.inflate(var2);
         } catch (Exception var5) {
            this.field3546.reset();
            throw new RuntimeException("");
         }

         this.field3546.reset();
      } else {
         throw new RuntimeException("");
      }
   }
}
