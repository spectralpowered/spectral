import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class class466 implements MouseListener, MouseMotionListener, FocusListener {
   public static class466 field3857 = new class466();
   public static int field3858 = 0;
   public static int field3862 = 0;
   public static int field3863 = 0;
   public static int field3867 = 0;
   public static int field3869 = 0;
   public static int field3870 = 0;
   public static long field3855 = 0L;
   public static long field3865 = 0L;
   public static volatile int field3856 = 0;
   public static volatile int field3859 = -1;
   public static volatile int field3860 = -1;
   public static volatile int field3864 = 0;
   public static volatile int field3866 = 0;
   public static volatile int field3871 = 0;
   public static volatile int field3873 = 0;
   public static volatile long field3861 = -1L;
   public static volatile long field3868 = 0L;
   static class120[] field3875;
   static class266[] field3874;
   static int field3872;

   final int method2280(MouseEvent var1) {
      int var3 = var1.getButton();
      if (!var1.isAltDown() && var3 != 2) {
         return !var1.isMetaDown() && var3 != 3 ? 1 : 2;
      } else {
         return 4;
      }
   }

   public final synchronized void mousePressed(MouseEvent var1) {
      if (null != field3857) {
         field3871 = 0;
         field3864 = var1.getX();
         field3873 = var1.getY();
         field3868 = class152.method711();
         field3866 = this.method2280(var1);
         if (field3866 != 0) {
            field3856 = field3866;
         }
      }

      if (var1.isPopupTrigger()) {
         var1.consume();
      }

   }

   public final synchronized void mouseReleased(MouseEvent var1) {
      if (field3857 != null) {
         field3871 = 0;
         field3856 = 0;
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
      if (null != field3857) {
         field3871 = 0;
         field3859 = -1;
         field3860 = -1;
         field3861 = var1.getWhen();
      }

   }

   public final synchronized void mouseDragged(MouseEvent var1) {
      this.mouseMoved(var1);
   }

   public final synchronized void mouseMoved(MouseEvent var1) {
      if (null != field3857) {
         field3871 = 0;
         field3859 = var1.getX();
         field3860 = var1.getY();
         field3861 = var1.getWhen();
      }

   }

   public final void focusGained(FocusEvent var1) {
   }

   public final synchronized void focusLost(FocusEvent var1) {
      if (field3857 != null) {
         field3856 = 0;
      }

   }

   static final int method2281(int var0, int var1, int var2, int var3) {
      int var5 = 65536 - class341.field2744[var2 * 1024 / var3] >> 1;
      return (var0 * (65536 - var5) >> 16) + (var5 * var1 >> 16);
   }
}
