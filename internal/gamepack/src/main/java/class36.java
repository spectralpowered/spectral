import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class class36 extends Canvas {
   static byte[][][] field182;
   Component field181;

   class36(Component var1) {
      this.field181 = var1;
   }

   public final void update(Graphics var1) {
      this.field181.update(var1);
   }

   public final void paint(Graphics var1) {
      this.field181.paint(var1);
   }
}
