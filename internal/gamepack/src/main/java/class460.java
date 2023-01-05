import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

public class class460 extends class157 {
   byte[] field3833;
   int field3835;
   AudioFormat field3834;
   SourceDataLine field3836;

   protected void method827() {
      this.field3834 = new AudioFormat((float)class157.field1636, 16, class126.field1464 ? 2 : 1, true, false);
      this.field3833 = new byte[256 << (class126.field1464 ? 2 : 1)];
   }

   protected void method834(int var1) throws LineUnavailableException {
      try {
         Info var3 = new Info(SourceDataLine.class, this.field3834, var1 << (class126.field1464 ? 2 : 1));
         this.field3836 = (SourceDataLine)AudioSystem.getLine(var3);
         this.field3836.open();
         this.field3836.start();
         this.field3835 = var1;
      } catch (LineUnavailableException var4) {
         if (class102.method555(var1) != 1) {
            this.method834(class476.method2306(var1));
         } else {
            this.field3836 = null;
            throw var4;
         }
      }
   }

   protected int method828() {
      return this.field3835 - (this.field3836.available() >> (class126.field1464 ? 2 : 1));
   }

   protected void method829() {
      int var1 = 256;
      if (class126.field1464) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = super.field1642[var2];
         if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field3833[var2 * 2] = (byte)(var3 >> 8);
         this.field3833[1 + var2 * 2] = (byte)(var3 >> 16);
      }

      this.field3836.write(this.field3833, 0, var1 << 1);
   }

   protected void method830() {
      if (null != this.field3836) {
         this.field3836.close();
         this.field3836 = null;
      }

   }

   protected void method831() {
      this.field3836.flush();
   }
}
