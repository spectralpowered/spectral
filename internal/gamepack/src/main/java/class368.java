import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
public class class368 {
   boolean field3281 = false;
   boolean[] field3278;
   /** @deprecated */
   String[] field3280;
   Map field3279;
   long field3282;

   class368() {
      int var1 = class399.field3509.method887(19);
      this.field3279 = new HashMap();
      this.field3278 = new boolean[var1];

      int var2;
      for(var2 = 0; var2 < var1; ++var2) {
         class359 var3 = class488.method2322(var2);
         this.field3278[var2] = var3.field3205;
      }

      var2 = 0;
      if (class399.field3509.method1155(15)) {
         var2 = class399.field3509.method887(15);
      }

      this.field3280 = new String[var2];
      this.method1776();
   }

   void method1769(int var1, int var2) {
      this.field3279.put(var1, var2);
      if (this.field3278[var1]) {
         this.field3281 = true;
      }

   }

   int method1778(int var1) {
      Object var3 = this.field3279.get(var1);
      return var3 instanceof Integer ? ((Integer)var3).intValue() : -1;
   }

   void method1770(int var1, String var2) {
      this.field3279.put(var1, var2);
   }

   String method1771(int var1) {
      Object var3 = this.field3279.get(var1);
      return var3 instanceof String ? (String)var3 : "";
   }

   /** @deprecated */
   @Deprecated
   void method1772(int var1, String var2) {
      this.field3280[var1] = var2;
   }

   /** @deprecated */
   @Deprecated
   String method1773(int var1) {
      return this.field3280[var1];
   }

   void method1774() {
      int var2;
      for(var2 = 0; var2 < this.field3278.length; ++var2) {
         if (!this.field3278[var2]) {
            this.field3279.remove(var2);
         }
      }

      for(var2 = 0; var2 < this.field3280.length; ++var2) {
         this.field3280[var2] = null;
      }

   }

   class476 method1777(boolean var1) {
      return class188.method976("2", class451.field3700.field3137, var1);
   }

   void method1775() {
      class476 var2 = this.method1777(true);

      try {
         int var3 = 3;
         int var4 = 0;
         Iterator var5 = this.field3279.entrySet().iterator();

         while(var5.hasNext()) {
            Entry var6 = (Entry)var5.next();
            int var7 = ((Integer)var6.getKey()).intValue();
            if (this.field3278[var7]) {
               Object var8 = var6.getValue();
               var3 += 3;
               if (var8 instanceof Integer) {
                  var3 += 4;
               } else if (var8 instanceof String) {
                  var3 += class444.method2117((String)var8);
               }

               ++var4;
            }
         }

         class134 var21 = new class134(var3);
         var21.method666(2);
         var21.method655(var4);
         Iterator var22 = this.field3279.entrySet().iterator();

         while(var22.hasNext()) {
            Entry var23 = (Entry)var22.next();
            int var24 = ((Integer)var23.getKey()).intValue();
            if (this.field3278[var24]) {
               var21.method655(var24);
               Object var9 = var23.getValue();
               class180 var10 = class180.method939(var9.getClass());
               var21.method666(var10.field1936);
               class180.method940(var9, var21);
            }
         }

         var2.method2301(var21.field1489, 0, var21.field1487);
      } catch (Exception var19) {
         ;
      } finally {
         try {
            var2.method2302();
         } catch (Exception var18) {
            ;
         }

      }

      this.field3281 = false;
      this.field3282 = class154.method814();
   }

   void method1776() {
      class476 var2 = this.method1777(false);

      label217: {
         try {
            byte[] var3 = new byte[(int)var2.method2305()];

            int var5;
            for(int var4 = 0; var4 < var3.length; var4 += var5) {
               var5 = var2.method2304(var3, var4, var3.length - var4);
               if (var5 == -1) {
                  throw new EOFException();
               }
            }

            class134 var25 = new class134(var3);
            if (var25.field1489.length - var25.field1487 >= 1) {
               int var6 = var25.method669();
               if (var6 >= 0 && var6 <= 2) {
                  int var7;
                  int var8;
                  int var9;
                  int var10;
                  if (var6 >= 2) {
                     var7 = var25.method671();
                     var8 = 0;

                     while(true) {
                        if (var8 >= var7) {
                           break label217;
                        }

                        var9 = var25.method671();
                        var10 = var25.method669();
                        class180 var11 = (class180)class296.method1399(class180.method943(), var10);
                        Object var12 = var11.method941(var25);
                        if (this.field3278[var9]) {
                           this.field3279.put(var9, var12);
                        }

                        ++var8;
                     }
                  } else {
                     var7 = var25.method671();

                     for(var8 = 0; var8 < var7; ++var8) {
                        var9 = var25.method671();
                        var10 = var25.method717();
                        if (this.field3278[var9]) {
                           this.field3279.put(var9, var10);
                        }
                     }

                     var8 = var25.method671();
                     var9 = 0;

                     while(true) {
                        if (var9 >= var8) {
                           break label217;
                        }

                        var25.method671();
                        var25.method677();
                        ++var9;
                     }
                  }
               }

               return;
            }
         } catch (Exception var23) {
            break label217;
         } finally {
            try {
               var2.method2302();
            } catch (Exception var22) {
               ;
            }

         }

         return;
      }

      this.field3281 = false;
   }

   void method1779() {
      if (this.field3281 && this.field3282 < class154.method814() - 60000L) {
         this.method1775();
      }

   }

   boolean method1768() {
      return this.field3281;
   }
}
