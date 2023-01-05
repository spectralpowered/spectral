public class class113 {
   int field1398;
   int field1401;
   int field1402;
   int field1403;
   int field1404;
   int field1405;
   int field1406;
   int field1407 = 2;
   int field1408;
   int[] field1399 = new int[2];
   int[] field1400 = new int[2];

   class113() {
      this.field1399[0] = 0;
      this.field1399[1] = 65535;
      this.field1400[0] = 0;
      this.field1400[1] = 65535;
   }

   final void method594(class134 var1) {
      this.field1408 = var1.method669();
      this.field1401 = var1.method717();
      this.field1402 = var1.method717();
      this.method592(var1);
   }

   final void method592(class134 var1) {
      this.field1407 = var1.method669();
      this.field1399 = new int[this.field1407];
      this.field1400 = new int[this.field1407];

      for(int var2 = 0; var2 < this.field1407; ++var2) {
         this.field1399[var2] = var1.method671();
         this.field1400[var2] = var1.method671();
      }

   }

   final void method593() {
      this.field1404 = 0;
      this.field1398 = 0;
      this.field1406 = 0;
      this.field1403 = 0;
      this.field1405 = 0;
   }

   final int method591(int var1) {
      if (this.field1405 >= this.field1404) {
         this.field1403 = this.field1400[this.field1398++] << 15;
         if (this.field1398 >= this.field1407) {
            this.field1398 = this.field1407 - 1;
         }

         this.field1404 = (int)((double)this.field1399[this.field1398] / 65536.0D * (double)var1);
         if (this.field1404 > this.field1405) {
            this.field1406 = ((this.field1400[this.field1398] << 15) - this.field1403) / (this.field1404 - this.field1405);
         }
      }

      this.field1403 += this.field1406;
      ++this.field1405;
      return this.field1403 - this.field1406 >> 15;
   }
}
