import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public final class class390 implements class217, MouseWheelListener {
   int field3278 = 0;

   void method1913(Component var1) {
      var1.addMouseWheelListener(this);
   }

   void method1914(Component var1) {
      var1.removeMouseWheelListener(this);
   }

   public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
      this.field3278 += var1.getWheelRotation();
   }

   public synchronized int method962() {
      int var2 = this.field3278;
      this.field3278 = 0;
      return var2;
   }
}
