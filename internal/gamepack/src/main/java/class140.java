import java.net.URL;

@ObfInfo(
   name = "dm"
)
public class class140 {
   @ObfInfo(
      owner = "dm",
      name = "g",
      desc = "Lfz;"
   )
   static class203 field1139;
   @ObfInfo(
      owner = "dm",
      name = "d",
      desc = "I"
   )
   static int field1136;
   @ObfInfo(
      owner = "dm",
      name = "h",
      desc = "Ljava/net/URL;"
   )
   final URL field1137;
   @ObfInfo(
      owner = "dm",
      name = "e",
      desc = "Z"
   )
   volatile boolean field1138;
   @ObfInfo(
      owner = "dm",
      name = "v",
      desc = "[B"
   )
   volatile byte[] field1135;

   @ObfInfo(
      owner = "dm",
      name = "<init>",
      desc = "(Ljava/net/URL;)V"
   )
   class140(URL var1) {
      this.field1137 = var1;
   }

   @ObfInfo(
      owner = "dm",
      name = "h",
      desc = "(I)Z"
   )
   public boolean method640() {
      return this.field1138;
   }

   @ObfInfo(
      owner = "dm",
      name = "e",
      desc = "(I)[B"
   )
   public byte[] method638() {
      return this.field1135;
   }

   @ObfInfo(
      owner = "dm",
      name = "v",
      desc = "(I)Ljava/lang/String;"
   )
   public String method639() {
      return this.field1137.toString();
   }

   @ObfInfo(
      owner = "dm",
      name = "h",
      desc = "(B)[Lrv;"
   )
   public static class7[] method641() {
      return new class7[]{class7.field33, class7.field32, class7.field34};
   }
}
