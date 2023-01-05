import java.util.ArrayList;
import java.util.HashMap;

public class class461 {
   public static ArrayList field3849 = new ArrayList();
   static byte[][] field3838 = new byte[100][];
   static byte[][] field3845 = new byte[1000][];
   static byte[][] field3846 = new byte[250][];
   static byte[][] field3848 = new byte[50][];
   static int field3837 = 250;
   static int field3839 = 0;
   static int field3840 = 0;
   static int field3841 = 0;
   static int field3842 = 1000;
   static int field3843 = 50;
   static int field3844 = 100;
   static int field3847 = 0;

   static {
      field3849.clear();
      field3849.add(Integer.valueOf(100));
      field3849.add(Integer.valueOf(5000));
      field3849.add(Integer.valueOf(10000));
      field3849.add(Integer.valueOf(30000));
      new HashMap();
   }

   public static synchronized byte[] method2265(int var0, boolean var1) {
      byte[] var5;
      if ((var0 == 100 || var0 < 100 && var1) && field3847 > 0) {
         var5 = field3845[--field3847];
         field3845[field3847] = null;
         return var5;
      } else if ((var0 == 5000 || var0 < 5000 && var1) && field3839 > 0) {
         var5 = field3846[--field3839];
         field3846[field3839] = null;
         return var5;
      } else if ((var0 == 10000 || var0 < 10000 && var1) && field3840 > 0) {
         var5 = field3838[--field3840];
         field3838[field3840] = null;
         return var5;
      } else if ((var0 == 30000 || var0 < 30000 && var1) && field3841 > 0) {
         var5 = field3848[--field3841];
         field3848[field3841] = null;
         return var5;
      } else {
         int var3;
         if (null != class211.field2368) {
            for(var3 = 0; var3 < class405.field3529.length; ++var3) {
               if ((var0 == class405.field3529[var3] || var0 < class405.field3529[var3] && var1) && class83.field952[var3] > 0) {
                  byte[] var4 = class211.field2368[var3][--class83.field952[var3]];
                  class211.field2368[var3][class83.field952[var3]] = null;
                  return var4;
               }
            }
         }

         if (var1 && null != class405.field3529) {
            for(var3 = 0; var3 < class405.field3529.length; ++var3) {
               if (var0 <= class405.field3529[var3] && class83.field952[var3] < class211.field2368[var3].length) {
                  return new byte[class405.field3529[var3]];
               }
            }
         }

         return new byte[var0];
      }
   }

   static final void method2264(int var0, int var1, int var2, boolean var3) {
      if (class25.method126(var0)) {
         class233.method1165(class71.field853[var0], -1, var1, var2, var3);
      }
   }
}
