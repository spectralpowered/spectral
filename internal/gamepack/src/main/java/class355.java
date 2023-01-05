import java.util.ArrayList;
import java.util.HashMap;

@ObfInfo(
   name = "nf"
)
public class class355 {
   @ObfInfo(
      owner = "nf",
      name = "t",
      desc = "Ljava/util/ArrayList;"
   )
   public static ArrayList field2929 = new ArrayList();
   @ObfInfo(
      owner = "nf",
      name = "n",
      desc = "[[B"
   )
   static byte[][] field2918 = new byte[100][];
   @ObfInfo(
      owner = "nf",
      name = "i",
      desc = "[[B"
   )
   static byte[][] field2925 = new byte[1000][];
   @ObfInfo(
      owner = "nf",
      name = "o",
      desc = "[[B"
   )
   static byte[][] field2926 = new byte[250][];
   @ObfInfo(
      owner = "nf",
      name = "k",
      desc = "[[B"
   )
   static byte[][] field2928 = new byte[50][];
   @ObfInfo(
      owner = "nf",
      name = "b",
      desc = "I"
   )
   static int field2917 = 250;
   @ObfInfo(
      owner = "nf",
      name = "q",
      desc = "I"
   )
   static int field2919 = 0;
   @ObfInfo(
      owner = "nf",
      name = "f",
      desc = "I"
   )
   static int field2920 = 0;
   @ObfInfo(
      owner = "nf",
      name = "r",
      desc = "I"
   )
   static int field2921 = 0;
   @ObfInfo(
      owner = "nf",
      name = "u",
      desc = "I"
   )
   static int field2922 = 1000;
   @ObfInfo(
      owner = "nf",
      name = "g",
      desc = "I"
   )
   static int field2923 = 50;
   @ObfInfo(
      owner = "nf",
      name = "j",
      desc = "I"
   )
   static int field2924 = 100;
   @ObfInfo(
      owner = "nf",
      name = "m",
      desc = "I"
   )
   static int field2927 = 0;

   static {
      field2929.clear();
      field2929.add(Integer.valueOf(100));
      field2929.add(Integer.valueOf(5000));
      field2929.add(Integer.valueOf(10000));
      field2929.add(Integer.valueOf(30000));
      new HashMap();
   }

   @ObfInfo(
      owner = "nf",
      name = "h",
      desc = "(IZB)[B"
   )
   public static synchronized byte[] method1775(int var0, boolean var1) {
      byte[] var5;
      if ((var0 == 100 || var0 < 100 && var1) && field2927 > 0) {
         var5 = field2925[--field2927];
         field2925[field2927] = null;
         return var5;
      } else if ((var0 == 5000 || var0 < 5000 && var1) && field2919 > 0) {
         var5 = field2926[--field2919];
         field2926[field2919] = null;
         return var5;
      } else if ((var0 == 10000 || var0 < 10000 && var1) && field2920 > 0) {
         var5 = field2918[--field2920];
         field2918[field2920] = null;
         return var5;
      } else if ((var0 == 30000 || var0 < 30000 && var1) && field2921 > 0) {
         var5 = field2928[--field2921];
         field2928[field2921] = null;
         return var5;
      } else {
         int var3;
         if (null != class151.field1173) {
            for(var3 = 0; var3 < class298.field2394.length; ++var3) {
               if ((var0 == class298.field2394[var3] || var0 < class298.field2394[var3] && var1) && class119.field879[var3] > 0) {
                  byte[] var4 = class151.field1173[var3][--class119.field879[var3]];
                  class151.field1173[var3][class119.field879[var3]] = null;
                  return var4;
               }
            }
         }

         if (var1 && null != class298.field2394) {
            for(var3 = 0; var3 < class298.field2394.length; ++var3) {
               if (var0 <= class298.field2394[var3] && class119.field879[var3] < class151.field1173[var3].length) {
                  return new byte[class298.field2394[var3]];
               }
            }
         }

         return new byte[var0];
      }
   }

   @ObfInfo(
      owner = "nf",
      name = "kt",
      desc = "(IIIZB)V"
   )
   static final void method1774(int var0, int var1, int var2, boolean var3) {
      if (class268.method1275(var0)) {
         class201.method886(class329.field2600[var0], -1, var1, var2, var3);
      }
   }
}
