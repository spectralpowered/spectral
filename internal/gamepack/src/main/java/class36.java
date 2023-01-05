import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

@ObfInfo(
   name = "z"
)
public final class class36 extends Canvas {
   @ObfInfo(
      owner = "z",
      name = "r",
      desc = "[[[B"
   )
   static byte[][][] field182;
   @ObfInfo(
      owner = "z",
      name = "h",
      desc = "Ljava/awt/Component;"
   )
   Component field181;

   @ObfInfo(
      owner = "z",
      name = "<init>",
      desc = "(Ljava/awt/Component;)V"
   )
   class36(Component var1) {
      this.field181 = var1;
   }

   @ObfInfo(
      owner = "z",
      name = "update",
      desc = "(Ljava/awt/Graphics;)V"
   )
   public final void update(Graphics var1) {
      this.field181.update(var1);
   }

   @ObfInfo(
      owner = "z",
      name = "paint",
      desc = "(Ljava/awt/Graphics;)V"
   )
   public final void paint(Graphics var1) {
      this.field181.paint(var1);
   }
}
