import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Locale;
import javax.imageio.ImageIO;

@class128
@class455
public class class22 implements class445 {
   public static int field161;
   public static final class22 field155;
   public static final class22 field157;
   public static final class22 field160;
   public static final class22[] field166;
   static boolean[] field167;
   static final class22 field156;
   static final class22 field158;
   static final class22 field159;
   static final class22 field164;
   final int field165;
   final String field162;
   final String field163;

   static {
      field155 = new class22("EN", "en", "English", class213.field2398, 0, "GB");
      field164 = new class22("DE", "de", "German", class213.field2398, 1, "DE");
      field157 = new class22("FR", "fr", "French", class213.field2398, 2, "FR");
      field158 = new class22("PT", "pt", "Portuguese", class213.field2398, 3, "BR");
      field159 = new class22("NL", "nl", "Dutch", class213.field2382, 4, "NL");
      field160 = new class22("ES", "es", "Spanish", class213.field2382, 5, "ES");
      field156 = new class22("ES_MX", "es-mx", "Spanish (Latin American)", class213.field2398, 6, "MX");
      class22[] var0 = new class22[]{field164, field160, field157, field159, field156, field158, field155};
      field166 = new class22[var0.length];
      class22[] var2 = var0;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class22 var4 = var2[var3];
         if (field166[var4.field165] != null) {
            throw new IllegalStateException();
         }

         field166[var4.field165] = var4;
      }

   }

   class22(String var1, String var2, String var3, class213 var4, int var5, String var6) {
      this.field162 = var1;
      this.field163 = var2;
      this.field165 = var5;
      if (var6 != null) {
         new Locale(var2.substring(0, 2), var6);
      } else {
         new Locale(var2.substring(0, 2));
      }

   }

   String method117() {
      return this.field163;
   }

   public int method2118() {
      return this.field165;
   }

   public String toString() {
      return this.method117().toLowerCase(Locale.ENGLISH);
   }

   public static final class319 method119(byte[] var0) {
      BufferedImage var2 = null;

      try {
         Class var3 = ImageIO.class;
         synchronized(ImageIO.class) {
            var2 = ImageIO.read(new ByteArrayInputStream(var0));
         }

         int var10 = var2.getWidth();
         int var4 = var2.getHeight();
         int[] var5 = new int[var10 * var4];
         PixelGrabber var6 = new PixelGrabber(var2, 0, 0, var10, var4, var5, 0, var10);
         var6.grabPixels();
         return new class319(var5, var10, var4);
      } catch (IOException var8) {
         ;
      } catch (InterruptedException var9) {
         ;
      }

      return new class319(0, 0);
   }

   static void method120() {
      class25.field180 = 0;

      for(int var1 = 0; var1 < 2048; ++var1) {
         class25.field177[var1] = null;
         class25.field184[var1] = class156.field1620;
      }

   }
}
