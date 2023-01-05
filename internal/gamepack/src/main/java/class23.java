import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

public class class23 implements class445 {
   public static final class23 field169 = new class23(2, 0);
   public static final class23 field170 = new class23(0, 2);
   public static final class23 field171 = new class23(3, 3);
   public static final class23 field173 = new class23(1, 4);
   public static final class23 field174 = new class23(4, 1);
   final int field168;
   public final int field172;

   class23(int var1, int var2) {
      this.field172 = var1;
      this.field168 = var2;
   }

   public int method2118() {
      return this.field168;
   }

   public static void method122(String var0, Throwable var1) {
      try {
         String var3 = "";
         if (var1 != null) {
            Throwable var5 = var1;
            String var6;
            if (var1 instanceof class139) {
               class139 var7 = (class139)var1;
               var6 = var7.field1506 + " | ";
               var5 = var7.field1507;
            } else {
               var6 = "";
            }

            StringWriter var19 = new StringWriter();
            PrintWriter var8 = new PrintWriter(var19);
            var5.printStackTrace(var8);
            var8.close();
            String var9 = var19.toString();
            BufferedReader var10 = new BufferedReader(new StringReader(var9));
            String var11 = var10.readLine();

            while(true) {
               String var12 = var10.readLine();
               if (var12 == null) {
                  var6 = var6 + "| " + var11;
                  var3 = var6;
                  break;
               }

               int var13 = var12.indexOf(40);
               int var14 = var12.indexOf(41, var13 + 1);
               if (var13 >= 0 && var14 >= 0) {
                  String var15 = var12.substring(var13 + 1, var14);
                  int var16 = var15.indexOf(".java:");
                  if (var16 >= 0) {
                     var15 = var15.substring(0, var16) + var15.substring(var16 + 5);
                     var6 = var6 + var15 + ' ';
                     continue;
                  }

                  var12 = var12.substring(0, var13);
               }

               var12 = var12.trim();
               var12 = var12.substring(var12.lastIndexOf(32) + 1);
               var12 = var12.substring(var12.lastIndexOf(9) + 1);
               var6 = var6 + var12 + ' ';
            }
         }

         if (null != var0) {
            if (null != var1) {
               var3 = var3 + " | ";
            }

            var3 = var3 + var0;
         }

         System.out.println("Error: " + var3);
         var3 = var3.replace(':', '.');
         var3 = var3.replace('@', '_');
         var3 = var3.replace('&', '_');
         var3 = var3.replace('#', '_');
         if (null == class477.field3970) {
            return;
         }

         URL var4 = new URL(class477.field3970.getCodeBase(), "clienterror.ws?cv=" + class139.field1503 + "&cs=" + class139.field1502 + "&u=" + class139.field1505 + "&v1=" + class20.field149 + "&v2=" + class20.field147 + "&ct=" + class139.field1504 + "&e=" + var3);
         DataInputStream var18 = new DataInputStream(var4.openStream());
         var18.read();
         var18.close();
      } catch (Exception var17) {
         ;
      }

   }
}
