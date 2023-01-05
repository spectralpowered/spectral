public abstract class class187 extends class106 {
   abstract void method972(class134 var1);

   abstract void method973(class112 var1);

   static final void method974(String var0) {
      if (var0.equalsIgnoreCase("toggleroof")) {
         class111.field1385.method1344(!class111.field1385.method1317());
         if (class111.field1385.method1317()) {
            class237.method1197(99, "", "Roofs are now all hidden");
         } else {
            class237.method1197(99, "", "Roofs will only be removed selectively");
         }
      }

      if (var0.equalsIgnoreCase("displayfps")) {
         class111.field1385.method1332();
      }

      if (var0.equalsIgnoreCase("renderself")) {
         client.field462 = !client.field462;
      }

      if (var0.equalsIgnoreCase("mouseovertext")) {
         client.field585 = !client.field585;
      }

      if (client.field685 >= 2) {
         if (var0.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
         }

         if (var0.equalsIgnoreCase("showcoord")) {
            class237.field2566.field3412 = !class237.field2566.field3412;
         }

         if (var0.equalsIgnoreCase("fpson")) {
            class111.field1385.method1341(true);
         }

         if (var0.equalsIgnoreCase("fpsoff")) {
            class111.field1385.method1341(false);
         }

         if (var0.equalsIgnoreCase("gc")) {
            System.gc();
         }

         if (var0.equalsIgnoreCase("clientdrop")) {
            class380.method1808();
         }
      }

      class81 var2 = class189.method982(class165.field1753, client.field483.field3459);
      var2.field933.method666(var0.length() + 1);
      var2.field933.method660(var0, (byte)3);
      client.field483.method1920(var2);
   }
}
