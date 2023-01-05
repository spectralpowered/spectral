@Deprecated
public class class267 implements Runnable {
   public static class397 field2690 = new class397();
   public static class397 field2693 = new class397();
   static int field2691 = 0;
   static Object field2692 = new Object();

   public void run() {
      try {
         while(true) {
            class397 var2 = field2693;
            class19 var1;
            synchronized(field2693) {
               var1 = (class19)field2693.method1934();
            }

            Object var14;
            if (var1 != null) {
               if (0 == var1.field146) {
                  var1.field145.method2008((int)var1.field1361, var1.field144, var1.field144.length);
                  var2 = field2693;
                  synchronized(field2693) {
                     var1.method567();
                  }
               } else if (var1.field146 == 1) {
                  var1.field144 = var1.field145.method2006((int)var1.field1361);
                  var2 = field2693;
                  synchronized(field2693) {
                     field2690.method1930(var1);
                  }
               }

               var14 = field2692;
               synchronized(field2692) {
                  if (field2691 <= 1) {
                     field2691 = 0;
                     field2692.notifyAll();
                     return;
                  }

                  field2691 = 600;
               }
            } else {
               class324.method1571(100L);
               var14 = field2692;
               synchronized(field2692) {
                  if (field2691 <= 1) {
                     field2691 = 0;
                     field2692.notifyAll();
                     return;
                  }

                  --field2691;
               }
            }
         }
      } catch (Exception var13) {
         class23.method122((String)null, var13);
      }
   }
}
