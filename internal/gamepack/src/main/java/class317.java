public class class317 extends class185 {
   boolean field3008;
   boolean field3009;

   int method1526(class317 var1) {
      if (client.field599 == super.field1978 && client.field599 != var1.field1978) {
         return -1;
      } else if (client.field599 == var1.field1978 && client.field599 != super.field1978) {
         return 1;
      } else if (0 != super.field1978 && var1.field1978 == 0) {
         return -1;
      } else if (var1.field1978 != 0 && 0 == super.field1978) {
         return 1;
      } else if (this.field3009 && !var1.field3009) {
         return -1;
      } else if (!this.field3009 && var1.field3009) {
         return 1;
      } else if (this.field3008 && !var1.field3008) {
         return -1;
      } else if (!this.field3008 && var1.field3008) {
         return 1;
      } else {
         return super.field1978 != 0 ? super.field1980 - var1.field1980 : var1.field1980 - super.field1980;
      }
   }

   public int method1062(class209 var1) {
      return this.method1526((class317)var1);
   }

   public int compareTo(Object var1) {
      return this.method1526((class317)var1);
   }

   static final void method1527(String var0) {
      if (!var0.equals("")) {
         class81 var2 = class189.method982(class165.field1814, client.field483.field3459);
         var2.field933.method666(class444.method2117(var0));
         var2.field933.method660(var0, (byte)122);
         client.field483.method1920(var2);
      }
   }
}
