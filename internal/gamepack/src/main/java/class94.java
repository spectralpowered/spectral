import java.util.zip.Inflater;

public class class94 {
   Inflater field781;

   public class94() {
      this(-1, 1000000);
   }

   class94(int var1, int var2) {
   }

   public void method386(class127 var1, byte[] var2) {
      if (var1.field1072[var1.field1070] == 31 && -117 == var1.field1072[1 + var1.field1070]) {
         if (this.field781 == null) {
            this.field781 = new Inflater(true);
         }

         try {
            this.field781.setInput(var1.field1072, var1.field1070 + 10, var1.field1072.length - (var1.field1070 + 10 + 8));
            this.field781.inflate(var2);
         } catch (Exception var5) {
            this.field781.reset();
            throw new RuntimeException("");
         }

         this.field781.reset();
      } else {
         throw new RuntimeException("");
      }
   }
}
