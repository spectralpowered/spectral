import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class class182 implements MouseListener, MouseMotionListener, FocusListener {
   public static class182 field1951 = new class182();
   public static int field1952 = 0;
   public static int field1956 = 0;
   public static int field1957 = 0;
   public static int field1961 = 0;
   public static int field1963 = 0;
   public static int field1964 = 0;
   public static long field1949 = 0L;
   public static long field1959 = 0L;
   public static volatile int field1950 = 0;
   public static volatile int field1953 = -1;
   public static volatile int field1954 = -1;
   public static volatile int field1958 = 0;
   public static volatile int field1960 = 0;
   public static volatile int field1965 = 0;
   public static volatile int field1967 = 0;
   public static volatile long field1955 = -1L;
   public static volatile long field1962 = 0L;
   static class210[] field1969;
   static class319[] field1968;
   static int field1966;

   final int method952(MouseEvent var1) {
      int var3 = var1.getButton();
      if (!var1.isAltDown() && var3 != 2) {
         return !var1.isMetaDown() && var3 != 3 ? 1 : 2;
      } else {
         return 4;
      }
   }

   public final synchronized void mousePressed(MouseEvent var1) {
      if (null != field1951) {
         field1965 = 0;
         field1958 = var1.getX();
         field1967 = var1.getY();
         field1962 = class154.method814();
         field1960 = this.method952(var1);
         if (field1960 != 0) {
            field1950 = field1960;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if (field1951 != null) {
         field1965 = 0;
         field1950 = 0;
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final void mouseClicked(MouseEvent var1) {
      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseEntered(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void mouseExited(MouseEvent var1) {
      if (null != field1951) {
         field1965 = 0;
         field1953 = -1;
         field1954 = -1;
         field1955 = var1.getWhen();
      }

   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if (null != field1951) {
         field1965 = 0;
         field1953 = var1.getX();
         field1954 = var1.getY();
         field1955 = var1.getWhen();
      }

   }

   public final void focusGained(FocusEvent var1) {
   }

   public final synchronized void focusLost(FocusEvent var1) {
      if (field1951 != null) {
         field1950 = 0;
      }

   }

   static final int method953(int var0, int var1, int var2, int var3) {
      int var5 = 65536 - class234.field2544[var2 * 1024 / var3] >> 1;
      return (var0 * (65536 - var5) >> 16) + (var5 * var1 >> 16);
   }
}
