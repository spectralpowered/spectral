public class class168 {
   static char[] field1842 = new char[64];
   static char[] field1844;
   static char[] field1845;
   static int[] field1843;

   static {
      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         field1842[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field1842[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field1842[var0] = (char)(var0 + 48 - 52);
      }

      field1842[62] = '+';
      field1842[63] = '/';
      field1845 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field1845[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field1845[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field1845[var0] = (char)(var0 + 48 - 52);
      }

      field1845[62] = '*';
      field1845[63] = '-';
      field1844 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field1844[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field1844[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field1844[var0] = (char)(var0 + 48 - 52);
      }

      field1844[62] = '-';
      field1844[63] = '_';
      field1843 = new int[128];

      for(var0 = 0; var0 < field1843.length; ++var0) {
         field1843[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         field1843[var0] = var0 - 65;
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         field1843[var0] = var0 - 97 + 26;
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         field1843[var0] = var0 - 48 + 52;
      }

      int[] var2 = field1843;
      field1843[43] = 62;
      var2[42] = 62;
      int[] var1 = field1843;
      field1843[47] = 63;
      var1[45] = 63;
   }
}
