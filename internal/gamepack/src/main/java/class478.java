import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class class478 implements class338, MouseWheelListener {
   int field3971 = 0;

   void method2310(Component var1) {
      var1.addMouseWheelListener(this);
   }

   void method2311(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      this.field3971 += var1.getWheelRotation();
   }

   public synchronized int method1624() {
      int var2 = this.field3971;
      this.field3971 = 0;
      return var2;
   }
}
