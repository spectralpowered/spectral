@ObfInfo(
   name = "mp"
)
public class class158 {
   @ObfInfo(
      owner = "mp",
      name = "h",
      desc = "[C"
   )
   static char[] field1212 = new char[64];
   @ObfInfo(
      owner = "mp",
      name = "v",
      desc = "[C"
   )
   static char[] field1214;
   @ObfInfo(
      owner = "mp",
      name = "e",
      desc = "[C"
   )
   static char[] field1215;
   @ObfInfo(
      owner = "mp",
      name = "x",
      desc = "[I"
   )
   static int[] field1213;

   static {
      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         field1212[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field1212[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field1212[var0] = (char)(var0 + 48 - 52);
      }

      field1212[62] = '+';
      field1212[63] = '/';
      field1215 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field1215[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field1215[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field1215[var0] = (char)(var0 + 48 - 52);
      }

      field1215[62] = '*';
      field1215[63] = '-';
      field1214 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field1214[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field1214[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field1214[var0] = (char)(var0 + 48 - 52);
      }

      field1214[62] = '-';
      field1214[63] = '_';
      field1213 = new int[128];

      for(var0 = 0; var0 < field1213.length; ++var0) {
         field1213[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         field1213[var0] = var0 - 65;
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         field1213[var0] = var0 - 97 + 26;
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         field1213[var0] = var0 - 48 + 52;
      }

      int[] var2 = field1213;
      field1213[43] = 62;
      var2[42] = 62;
      int[] var1 = field1213;
      field1213[47] = 63;
      var1[45] = 63;
   }
}
