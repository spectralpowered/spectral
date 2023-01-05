@Deprecated
public class class254 implements Runnable {
   public static class141 field2091 = new class141();
   public static class141 field2094 = new class141();
   static int field2092 = 0;
   static Object field2093 = new Object();

   public void run() {
      try {
         while(true) {
            class141 var2 = field2094;
            class42 var1;
            synchronized(field2094) {
               var1 = (class42)field2094.method646();
            }

            Object var14;
            if (var1 != null) {
               if (0 == var1.field525) {
                  var1.field524.method95((int)var1.field1134, var1.field523, var1.field523.length);
                  var2 = field2094;
                  synchronized(field2094) {
                     var1.method637();
                  }
               } else if (var1.field525 == 1) {
                  var1.field523 = var1.field524.method93((int)var1.field1134);
                  var2 = field2094;
                  synchronized(field2094) {
                     field2091.method642(var1);
                  }
               }

               var14 = field2093;
               synchronized(field2093) {
                  if (field2092 <= 1) {
                     field2092 = 0;
                     field2093.notifyAll();
                     return;
                  }

                  field2092 = 600;
               }
            } else {
               class286.method1421(100L);
               var14 = field2093;
               synchronized(field2093) {
                  if (field2092 <= 1) {
                     field2092 = 0;
                     field2093.notifyAll();
                     return;
                  }

                  --field2092;
               }
            }
         }
      } catch (Exception var13) {
         class445.method2199((String)null, var13);
      }
   }
}
