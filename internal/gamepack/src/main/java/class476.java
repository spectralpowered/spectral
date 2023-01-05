import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

public final class class476 {
   RandomAccessFile field3965;
   long field3967;
   final long field3966;

   public class476(File var1, String var2, long var3) throws IOException {
      if (-1L == var3) {
         var3 = Long.MAX_VALUE;
      }

      if (var1.length() > var3) {
         var1.delete();
      }

      this.field3965 = new RandomAccessFile(var1, var2);
      this.field3966 = var3;
      this.field3967 = 0L;
      int var5 = this.field3965.read();
      if (var5 != -1 && !var2.equals("r")) {
         this.field3965.seek(0L);
         this.field3965.write(var5);
      }

      this.field3965.seek(0L);
   }

   final void method2300(long var1) throws IOException {
      this.field3965.seek(var1);
      this.field3967 = var1;
   }

   public final void method2301(byte[] var1, int var2, int var3) throws IOException {
      if ((long)var3 + this.field3967 > this.field3966) {
         this.field3965.seek(this.field3966);
         this.field3965.write(1);
         throw new EOFException();
      } else {
         this.field3965.write(var1, var2, var3);
         this.field3967 += (long)var3;
      }
   }

   public final void method2302() throws IOException {
      this.method2303(false);
   }

   public final void method2303(boolean var1) throws IOException {
      if (this.field3965 != null) {
         if (var1) {
            try {
               this.field3965.getFD().sync();
            } catch (SyncFailedException var4) {
               ;
            }
         }

         this.field3965.close();
         this.field3965 = null;
      }

   }

   public final long method2305() throws IOException {
      return this.field3965.length();
   }

   public final int method2304(byte[] var1, int var2, int var3) throws IOException {
      int var5 = this.field3965.read(var1, var2, var3);
      if (var5 > 0) {
         this.field3967 += (long)var5;
      }

      return var5;
   }

   protected void finalize() throws Throwable {
      if (null != this.field3965) {
         System.out.println("");
         this.method2302();
      }

   }

   public static int method2306(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }
}
