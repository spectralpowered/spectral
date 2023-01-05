import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfInfo(
   name = "dn"
)
public class class220 {
   @ObfInfo(
      owner = "dn",
      name = "q",
      desc = "Z"
   )
   boolean field1899 = false;
   @ObfInfo(
      owner = "dn",
      name = "v",
      desc = "[Z"
   )
   boolean[] field1896;
   /** @deprecated */
   @ObfInfo(
      owner = "dn",
      name = "m",
      desc = "[Ljava/lang/String;"
   )
   String[] field1898;
   @ObfInfo(
      owner = "dn",
      name = "x",
      desc = "Ljava/util/Map;"
   )
   Map field1897;
   @ObfInfo(
      owner = "dn",
      name = "f",
      desc = "J"
   )
   long field1900;

   @ObfInfo(
      owner = "dn",
      name = "<init>",
      desc = "()V"
   )
   class220() {
      int var1 = class473.field3989.method1360(19);
      this.field1897 = new HashMap();
      this.field1896 = new boolean[var1];

      int var2;
      for(var2 = 0; var2 < var1; ++var2) {
         class198 var3 = class197.method875(var2);
         this.field1896[var2] = var3.field1742;
      }

      var2 = 0;
      if (class473.field3989.method160(15)) {
         var2 = class473.field3989.method1360(15);
      }

      this.field1898 = new String[var2];
      this.method972();
   }

   @ObfInfo(
      owner = "dn",
      name = "h",
      desc = "(III)V"
   )
   void method965(int var1, int var2) {
      this.field1897.put(var1, var2);
      if (this.field1896[var1]) {
         this.field1899 = true;
      }

   }

   @ObfInfo(
      owner = "dn",
      name = "e",
      desc = "(II)I"
   )
   int method974(int var1) {
      Object var3 = this.field1897.get(var1);
      return var3 instanceof Integer ? ((Integer)var3).intValue() : -1;
   }

   @ObfInfo(
      owner = "dn",
      name = "v",
      desc = "(ILjava/lang/String;I)V"
   )
   void method966(int var1, String var2) {
      this.field1897.put(var1, var2);
   }

   @ObfInfo(
      owner = "dn",
      name = "x",
      desc = "(IB)Ljava/lang/String;"
   )
   String method967(int var1) {
      Object var3 = this.field1897.get(var1);
      return var3 instanceof String ? (String)var3 : "";
   }

   /** @deprecated */
   @ObfInfo(
      owner = "dn",
      name = "m",
      desc = "(ILjava/lang/String;I)V"
   )
   void method968(int var1, String var2) {
      this.field1898[var1] = var2;
   }

   /** @deprecated */
   @ObfInfo(
      owner = "dn",
      name = "q",
      desc = "(II)Ljava/lang/String;"
   )
   String method969(int var1) {
      return this.field1898[var1];
   }

   @ObfInfo(
      owner = "dn",
      name = "f",
      desc = "(I)V"
   )
   void method970() {
      int var2;
      for(var2 = 0; var2 < this.field1896.length; ++var2) {
         if (!this.field1896[var2]) {
            this.field1897.remove(var2);
         }
      }

      for(var2 = 0; var2 < this.field1898.length; ++var2) {
         this.field1898[var2] = null;
      }

   }

   @ObfInfo(
      owner = "dn",
      name = "r",
      desc = "(ZB)Lqq;"
   )
   class455 method973(boolean var1) {
      return class161.method737("2", class41.field210.field4117, var1);
   }

   @ObfInfo(
      owner = "dn",
      name = "u",
      desc = "(I)V"
   )
   void method971() {
      class455 var2 = this.method973(true);

      try {
         int var3 = 3;
         int var4 = 0;
         Iterator var5 = this.field1897.entrySet().iterator();

         while(var5.hasNext()) {
            Entry var6 = (Entry)var5.next();
            int var7 = ((Integer)var6.getKey()).intValue();
            if (this.field1896[var7]) {
               Object var8 = var6.getValue();
               var3 += 3;
               if (var8 instanceof Integer) {
                  var3 += 4;
               } else if (var8 instanceof String) {
                  var3 += class319.method1614((String)var8);
               }

               ++var4;
            }
         }

         class127 var21 = new class127(var3);
         var21.method544(2);
         var21.method533(var4);
         Iterator var22 = this.field1897.entrySet().iterator();

         while(var22.hasNext()) {
            Entry var23 = (Entry)var22.next();
            int var24 = ((Integer)var23.getKey()).intValue();
            if (this.field1896[var24]) {
               var21.method533(var24);
               Object var9 = var23.getValue();
               class185 var10 = class185.method838(var9.getClass());
               var21.method544(var10.field1692);
               class185.method839(var9, var21);
            }
         }

         var2.method2247(var21.field1072, 0, var21.field1070);
      } catch (Exception var19) {
         ;
      } finally {
         try {
            var2.method2248();
         } catch (Exception var18) {
            ;
         }

      }

      this.field1899 = false;
      this.field1900 = class152.method711();
   }

   @ObfInfo(
      owner = "dn",
      name = "b",
      desc = "(I)V"
   )
   void method972() {
      class455 var2 = this.method973(false);

      label202: {
         try {
            byte[] var3 = new byte[(int)var2.method2251()];

            int var5;
            for(int var4 = 0; var4 < var3.length; var4 += var5) {
               var5 = var2.method2250(var3, var4, var3.length - var4);
               if (var5 == -1) {
                  throw new EOFException();
               }
            }

            class127 var25 = new class127(var3);
            if (var25.field1072.length - var25.field1070 < 1) {
               return;
            }

            int var6 = var25.method547();
            if (var6 >= 0 && var6 <= 2) {
               int var7;
               int var8;
               int var9;
               int var10;
               if (var6 >= 2) {
                  var7 = var25.method549();
                  var8 = 0;

                  while(true) {
                     if (var8 >= var7) {
                        break label202;
                     }

                     var9 = var25.method549();
                     var10 = var25.method547();
                     class185 var11 = (class185)class2.method10(class185.method841(), var10);
                     Object var12 = var11.method840(var25);
                     if (this.field1896[var9]) {
                        this.field1897.put(var9, var12);
                     }

                     ++var8;
                  }
               } else {
                  var7 = var25.method549();

                  for(var8 = 0; var8 < var7; ++var8) {
                     var9 = var25.method549();
                     var10 = var25.method595();
                     if (this.field1896[var9]) {
                        this.field1897.put(var9, var10);
                     }
                  }

                  var8 = var25.method549();
                  var9 = 0;

                  while(true) {
                     if (var9 >= var8) {
                        break label202;
                     }

                     var25.method549();
                     var25.method555();
                     ++var9;
                  }
               }
            }
         } catch (Exception var23) {
            break label202;
         } finally {
            try {
               var2.method2248();
            } catch (Exception var22) {
               ;
            }

         }

         return;
      }

      this.field1899 = false;
   }

   @ObfInfo(
      owner = "dn",
      name = "j",
      desc = "(I)V"
   )
   void method975() {
      if (this.field1899 && this.field1900 < class152.method711() - 60000L) {
         this.method971();
      }

   }

   @ObfInfo(
      owner = "dn",
      name = "g",
      desc = "(I)Z"
   )
   boolean method964() {
      return this.field1899;
   }
}
