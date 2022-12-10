public final class class84 {
	static byte[][][] field772;
	static byte[][][] field773;
	static int field766;
	static int field778;
	static int field779;
	static int[] field770;
	static int[] field777;
	static int[][] field769;
	static int[][][] field765;
	static short[][][] field767;
	static final int[] field764;
	static final int[] field768;
	static final int[] field771;
	static final int[] field774;
	static final int[] field775;
	static final int[] field776;

	static {
		field765 = new int[4][105][105];
		field773 = new byte[4][104][104];
		field766 = 99;
		field771 = new int[]{1, 2, 4, 8};
		field775 = new int[]{16, 32, 64, 128};
		field774 = new int[]{1, 0, -1, 0};
		field768 = new int[]{0, -1, 0, 1};
		field776 = new int[]{1, -1, -1, 1};
		field764 = new int[]{-1, -1, 1, 1};
		field778 = (int)(Math.random() * 17.0D) - 8;
		field779 = (int)(Math.random() * 33.0D) - 16;
	}

	class84() throws Throwable {
		throw new Error();
	}

	static void method6489() {
		field766 = 99;
		field767 = new short[4][104][104];
		class482.field5023 = new short[4][104][104];
		field772 = new byte[4][104][104];
		class363.field4350 = new byte[4][104][104];
		class171.field1618 = new int[4][105][105];
		class26.field141 = new byte[4][105][105];
		field769 = new int[105][105];
		field770 = new int[104];
		class50.field364 = new int[104];
		field777 = new int[104];
		class85.field791 = new int[104];
		class71.field617 = new int[104];
	}

	static void method6997() {
		field767 = (short[][][])null;
		class482.field5023 = (short[][][])null;
		field772 = (byte[][][])null;
		class363.field4350 = (byte[][][])null;
		class171.field1618 = (int[][][])null;
		class26.field141 = (byte[][][])null;
		field769 = (int[][])null;
		field770 = null;
		class50.field364 = null;
		field777 = null;
		class85.field791 = null;
		class71.field617 = null;
	}

	static final boolean method1712(byte[] var0, int var1, int var2) {
		boolean var4 = true;
		class467 var5 = new class467(var0);
		int var6 = -1;

		label67:
		while (true) {
			int var7 = var5.method8508();
			if (var7 == 0) {
				return var4;
			}

			var6 += var7;
			int var8 = 0;
			boolean var9 = false;

			while (true) {
				int var10;
				while (!var9) {
					var10 = var5.method8340();
					if (var10 == 0) {
						continue label67;
					}

					var8 += var10 - 1;
					int var11 = var8 & 63;
					int var12 = var8 >> 6 & 63;
					int var13 = var5.method8326() >> 2;
					int var14 = var12 + var1;
					int var15 = var2 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						class196 var16 = class165.method2780(var6);
						if (var13 != 22 || !client.field1743 || var16.field2182 != 0 || 1 == var16.field2175 || var16.field2201) {
							if (!var16.method3869()) {
								++client.field1968;
								var4 = false;
							}

							var9 = true;
						}
					}
				}

				var10 = var5.method8340();
				if (var10 == 0) {
					break;
				}

				var5.method8326();
			}
		}
	}

	static final void method1652(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, class211 var8, class205[] var9) {
		class467 var10 = new class467(var0);
		int var11 = -1;

		while (true) {
			int var12 = var10.method8508();
			if (var12 == 0) {
				return;
			}

			var11 += var12;
			int var13 = 0;

			while (true) {
				int var14 = var10.method8340();
				if (var14 == 0) {
					break;
				}

				var13 += var14 - 1;
				int var15 = var13 & 63;
				int var16 = var13 >> 6 & 63;
				int var17 = var13 >> 12;
				int var18 = var10.method8326();
				int var19 = var18 >> 2;
				int var20 = var18 & 3;
				if (var4 == var17 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
					class196 var21 = class165.method2780(var11);
					int var22 = var2 + class200.method3985(var16 & 7, var15 & 7, var7, var21.field2178, var21.field2179, var20);
					int var25 = var16 & 7;
					int var26 = var15 & 7;
					int var28 = var21.field2178;
					int var29 = var21.field2179;
					int var30;
					if (1 == (var20 & 1)) {
						var30 = var28;
						var28 = var29;
						var29 = var30;
					}

					int var27 = var7 & 3;
					int var24;
					if (var27 == 0) {
						var24 = var26;
					} else if (var27 == 1) {
						var24 = 7 - var25 - (var28 - 1);
					} else if (var27 == 2) {
						var24 = 7 - var26 - (var29 - 1);
					} else {
						var24 = var25;
					}

					var30 = var3 + var24;
					if (var22 > 0 && var30 > 0 && var22 < 103 && var30 < 103) {
						int var31 = var1;
						if ((field773[1][var22][var30] & 2) == 2) {
							var31 = var1 - 1;
						}

						class205 var32 = null;
						if (var31 >= 0) {
							var32 = var9[var31];
						}

						class116.method2236(var1, var22, var30, var11, var7 + var20 & 3, var19, var8, var32);
					}
				}
			}
		}
	}

	static final int method1589(int var0, int var1, int var2) {
		int var4 = var0 / var2;
		int var5 = var0 & var2 - 1;
		int var6 = var1 / var2;
		int var7 = var1 & var2 - 1;
		int var8 = method2475(var4, var6);
		int var9 = method2475(var4 + 1, var6);
		int var10 = method2475(var4, var6 + 1);
		int var11 = method2475(var4 + 1, var6 + 1);
		int var12 = method409(var8, var9, var5, var2);
		int var13 = method409(var10, var11, var5, var2);
		return method409(var12, var13, var7, var2);
	}

	static final int method409(int var0, int var1, int var2, int var3) {
		int var5 = 65536 - class221.field2690[var2 * 1024 / var3] >> 1;
		return (var0 * (65536 - var5) >> 16) + (var5 * var1 >> 16);
	}

	static final int method2475(int var0, int var1) {
		int var3 = method4926(var0 - 1, var1 - 1) + method4926(var0 + 1, var1 - 1) + method4926(var0 - 1, var1 + 1) + method4926(var0 + 1, var1 + 1);
		int var4 = method4926(var0 - 1, var1) + method4926(var0 + 1, var1) + method4926(var0, var1 - 1) + method4926(var0, var1 + 1);
		int var5 = method4926(var0, var1);
		return var3 / 16 + var4 / 8 + var5 / 4;
	}

	static final int method4926(int var0, int var1) {
		int var3 = var1 * 57 + var0;
		var3 ^= var3 << 13;
		int var4 = (15731 * var3 * var3 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
		return var4 >> 19 & 255;
	}

	static void method1651() {
		int var1;
		if (client.field1717 == 0) {
			class33.field194 = new class211(4, 104, 104, field765);

			for (var1 = 0; var1 < 4; ++var1) {
				client.field1758[var1] = new class205(104, 104);
			}

			class224.field2727 = new class491(512, 512);
			class73.field638 = class321.field3768;
			class73.field637 = 5;
			client.field1717 = 20;
		} else if (client.field1717 == 20) {
			class73.field638 = class321.field3769;
			class73.field637 = 10;
			client.field1717 = 30;
		} else if (client.field1717 == 30) {
			class83.field760 = class310.method6127(0, false, true, true, false);
			class2.field21 = class310.method6127(1, false, true, true, false);
			class195.field2162 = class310.method6127(2, true, false, true, false);
			class190.field2066 = class310.method6127(3, false, true, true, false);
			class235.field2839 = class310.method6127(4, false, true, true, false);
			class13.field73 = class310.method6127(5, true, true, true, false);
			class174.field1635 = class310.method6127(6, true, true, true, false);
			class306.field3673 = class310.method6127(7, false, true, true, false);
			class86.field798 = class310.method6127(8, false, true, true, false);
			class209.field2429 = class310.method6127(9, false, true, true, false);
			class135.field1332 = class310.method6127(10, false, true, true, false);
			class16.field98 = class310.method6127(11, false, true, true, false);
			class72.field619 = class310.method6127(12, false, true, true, false);
			class363.field4355 = class310.method6127(13, true, false, true, false);
			class165.field1536 = class310.method6127(14, false, true, true, false);
			class92.field884 = class310.method6127(15, false, true, true, false);
			class194.field2138 = class310.method6127(17, true, true, true, false);
			class177.field1644 = class310.method6127(18, false, true, true, false);
			class436.field4788 = class310.method6127(19, false, true, true, false);
			class254.field2968 = class310.method6127(20, false, true, true, false);
			class407.field4611 = class310.method6127(21, false, true, true, true);
			class73.field638 = class321.field4004;
			class73.field637 = 20;
			client.field1717 = 40;
		} else if (40 == client.field1717) {
			byte var24 = 0;
			var1 = var24 + class83.field760.method6204() * 4 / 100;
			var1 += class2.field21.method6204() * 4 / 100;
			var1 += class195.field2162.method6204() * 2 / 100;
			var1 += class190.field2066.method6204() * 2 / 100;
			var1 += class235.field2839.method6204() * 6 / 100;
			var1 += class13.field73.method6204() * 4 / 100;
			var1 += class174.field1635.method6204() * 2 / 100;
			var1 += class306.field3673.method6204() * 55 / 100;
			var1 += class86.field798.method6204() * 2 / 100;
			var1 += class209.field2429.method6204() * 2 / 100;
			var1 += class135.field1332.method6204() * 2 / 100;
			var1 += class16.field98.method6204() * 2 / 100;
			var1 += class72.field619.method6204() * 2 / 100;
			var1 += class363.field4355.method6204() * 2 / 100;
			var1 += class165.field1536.method6204() * 2 / 100;
			var1 += class92.field884.method6204() * 2 / 100;
			var1 += class436.field4788.method6204() / 100;
			var1 += class177.field1644.method6204() / 100;
			var1 += class254.field2968.method6204() / 100;
			var1 += class407.field4611.method6204() / 100;
			var1 += class194.field2138.method6203() && class194.field2138.method6306() ? 1 : 0;
			if (var1 != 100) {
				if (var1 != 0) {
					class73.field638 = class321.field3771 + var1 + "%";
				}

				class73.field637 = 30;
			} else {
				client.method163(class83.field760, "Animations");
				client.method163(class2.field21, "Skeletons");
				client.method163(class235.field2839, "Sound FX");
				client.method163(class13.field73, "Maps");
				client.method163(class174.field1635, "Music Tracks");
				client.method163(class306.field3673, "Models");
				client.method163(class86.field798, "Sprites");
				client.method163(class16.field98, "Music Jingles");
				client.method163(class165.field1536, "Music Samples");
				client.method163(class92.field884, "Music Patches");
				client.method163(class436.field4788, "World Map");
				client.method163(class177.field1644, "World Map Geography");
				client.method163(class254.field2968, "World Map Ground");
				class115.field1161 = new class404();
				class115.field1161.method7518(class194.field2138);
				class73.field638 = class321.field3772;
				class73.field637 = 30;
				client.field1717 = 45;
			}
		} else if (45 == client.field1717) {
			boolean var23 = !client.field1743;
			class50.field363 = 22050;
			class300.field3640 = var23;
			class51.field381 = 2;
			class287 var20 = new class287();
			var20.method5387(9, 128);
			class96.field938 = class50.method1202(class245.field2906, 0, 22050);
			class96.field938.method949(var20);
			class300.method5246(class92.field884, class165.field1536, class235.field2839, var20);
			class123.field1217 = class50.method1202(class245.field2906, 1, 2048);
			class76.field694 = new class52();
			class123.field1217.method949(class76.field694);
			class25.field131 = new class77(22050, class50.field363);
			class73.field638 = class321.field3964;
			class73.field637 = 35;
			client.field1717 = 50;
			class97.field945 = new class442(class86.field798, class363.field4355);
		} else if (50 == client.field1717) {
			var1 = class436.method7978().length;
			client.field1752 = class97.field945.method8006(class436.method7978());
			if (client.field1752.size() < var1) {
				class73.field638 = class321.field3951 + client.field1752.size() * 100 / var1 + "%";
				class73.field637 = 40;
			} else {
				class136.field1339 = (class386)client.field1752.get(class436.field4791);
				class248.field2935 = (class386)client.field1752.get(class436.field4787);
				class140.field1352 = (class386)client.field1752.get(class436.field4793);
				class217.field2637 = client.field1724.method7898();
				class73.field638 = class321.field3933;
				class73.field637 = 40;
				client.field1717 = 60;
			}
		} else {
			class326 var3;
			int var4;
			if (60 == client.field1717) {
				var1 = class145.method2562(class135.field1332, class86.field798);
				var3 = class86.field798;
				var4 = class73.field644.length + class73.field646.length;
				String[] var21 = class73.field665;

				for (int var6 = 0; var6 < var21.length; ++var6) {
					String var22 = var21[var6];
					if (var3.method6319(var22) != -1) {
						++var4;
					}
				}

				if (var1 < var4) {
					class73.field638 = class321.field3776 + var1 * 100 / var4 + "%";
					class73.field637 = 50;
				} else {
					class73.field638 = class321.field3777;
					class73.field637 = 50;
					class131.method2451(5);
					client.field1717 = 70;
				}
			} else if (client.field1717 == 70) {
				if (!class195.field2162.method6306()) {
					class73.field638 = class321.field3778 + class195.field2162.method6230() + "%";
					class73.field637 = 60;
				} else if (!class407.field4611.method6306()) {
					class73.field638 = class321.field3778 + (80 + class72.field619.method6230() / 6) + "%";
					class73.field637 = 60;
				} else {
					class326 var25 = class195.field2162;
					class193.field2119 = var25;
					class190.method2447(class195.field2162);
					class326 var2 = class195.field2162;
					var3 = class306.field3673;
					class166.field1538 = var2;
					class166.field1546 = var3;
					class72.field622 = class166.field1538.method6330(3);
					class196.method2234(class195.field2162, class306.field3673, client.field1743);
					class208.method2170(class195.field2162, class306.field3673, client.field1697 <= 209, class115.field1161.field4591);
					class326 var16 = class195.field2162;
					class186.field2041 = var16;
					class200.method6515(class195.field2162, class306.field3673, client.field1691, class136.field1339);
					class183.method4959(class195.field2162, class83.field760, class2.field21);
					class199.method4890(class195.field2162, class306.field3673);
					class203.method3614(class195.field2162);
					class326 var5 = class195.field2162;
					class165.field1532 = var5;
					class165.field1534 = class165.field1532.method6330(16);
					class290.method3548(class190.field2066, class306.field3673, class86.field798, class363.field4355);
					class173.method2120(class195.field2162);
					class197.method4958(class195.field2162);
					class326 var17 = class195.field2162;
					class161.field1504 = var17;
					class187.method2496(class195.field2162);
					class204.method1650(class195.field2162);
					class461.method7550(class195.field2162);
					class455.method8164(class195.field2162);
					class147.field1422 = new class453(class268.field3153, 54, class178.field1654, class195.field2162);
					class51.field380 = new class453(class268.field3153, 47, class178.field1654, class195.field2162);
					class254.field2979 = new class118();
					class326 var7 = class195.field2162;
					class326 var8 = class86.field798;
					class326 var9 = class363.field4355;
					class12.field70 = var7;
					class195.field2146 = var8;
					class195.field2140 = var9;
					class179.method2198(class195.field2162, class86.field798);
					class326 var10 = class195.field2162;
					class326 var11 = class86.field798;
					class169.field1594 = var11;
					if (var10.method6306()) {
						class169.field1576 = var10.method6330(35);
						class169.field1575 = new class169[class169.field1576];

						for (int var12 = 0; var12 < class169.field1576; ++var12) {
							byte[] var13 = var10.method6374(35, var12);
							class169.field1575[var12] = new class169(var12);
							if (null != var13) {
								class169.field1575[var12].method2866(new class467(var13));
								class169.field1575[var12].method2868();
							}
						}
					}

					class73.field638 = class321.field3841;
					class73.field637 = 60;
					client.field1717 = 80;
				}
			} else if (client.field1717 == 80) {
				var1 = 0;
				if (null == class185.field2036) {
					class185.field2036 = class125.method2359(class86.field798, class115.field1161.field4589, 0);
				} else {
					++var1;
				}

				if (null == class143.field1379) {
					class143.field1379 = class125.method2359(class86.field798, class115.field1161.field4594, 0);
				} else {
					++var1;
				}

				if (null == class44.field326) {
					class44.field326 = class248.method4895(class86.field798, class115.field1161.field4590, 0);
				} else {
					++var1;
				}

				if (null == class78.field706) {
					class78.field706 = class183.method3549(class86.field798, class115.field1161.field4588, 0);
				} else {
					++var1;
				}

				if (class400.field4562 == null) {
					class400.field4562 = class183.method3549(class86.field798, class115.field1161.field4591, 0);
				} else {
					++var1;
				}

				if (class363.field4354 == null) {
					class363.field4354 = class183.method3549(class86.field798, class115.field1161.field4593, 0);
				} else {
					++var1;
				}

				if (class132.field1306 == null) {
					class132.field1306 = class183.method3549(class86.field798, class115.field1161.field4597, 0);
				} else {
					++var1;
				}

				if (null == class28.field172) {
					class28.field172 = class183.method3549(class86.field798, class115.field1161.field4595, 0);
				} else {
					++var1;
				}

				if (null == class267.field3150) {
					class267.field3150 = class183.method3549(class86.field798, class115.field1161.field4596, 0);
				} else {
					++var1;
				}

				if (null == class92.field887) {
					class92.field887 = class248.method4895(class86.field798, class115.field1161.field4592, 0);
				} else {
					++var1;
				}

				if (class311.field3711 == null) {
					class311.field3711 = class248.method4895(class86.field798, class115.field1161.field4598, 0);
				} else {
					++var1;
				}

				if (var1 < 11) {
					class73.field638 = class321.field3875 + var1 * 100 / 12 + "%";
					class73.field637 = 70;
				} else {
					class369.field4393 = class311.field3711;
					class143.field1379.method8843();
					int var14 = (int)(Math.random() * 21.0D) - 10;
					int var18 = (int)(Math.random() * 21.0D) - 10;
					var4 = (int)(Math.random() * 21.0D) - 10;
					int var19 = (int)(Math.random() * 41.0D) - 20;
					class44.field326[0].method8589(var14 + var19, var18 + var19, var19 + var4);
					class73.field638 = class321.field3781;
					class73.field637 = 70;
					client.field1717 = 90;
				}
			} else if (client.field1717 == 90) {
				if (!class209.field2429.method6306()) {
					class73.field638 = class321.field3782 + "0%";
					class73.field637 = 90;
				} else {
					class222.field2700 = new class228(class209.field2429, class86.field798, 20, class186.field2040.method1784(), client.field1743 ? 64 : 128);
					class221.method4534(class222.field2700);
					class221.method4529(class186.field2040.method1784());
					client.field1717 = 100;
				}
			} else if (client.field1717 == 100) {
				var1 = class222.field2700.method4634();
				if (var1 < 100) {
					class73.field638 = class321.field3782 + var1 + "%";
					class73.field637 = 90;
				} else {
					class73.field638 = class321.field4058;
					class73.field637 = 90;
					client.field1717 = 110;
				}
			} else if (client.field1717 == 110) {
				class286.field3343 = new class97();
				class245.field2906.method2913(class286.field3343, 10);
				class73.field638 = class321.field3838;
				class73.field637 = 92;
				client.field1717 = 120;
			} else if (client.field1717 == 120) {
				if (!class135.field1332.method6323("huffman", "")) {
					class73.field638 = class321.field3785 + 0 + "%";
					class73.field637 = 94;
				} else {
					class303 var15 = new class303(class135.field1332.method6322("huffman", ""));
					class297.method1336(var15);
					class73.field638 = class321.field3999;
					class73.field637 = 94;
					client.field1717 = 130;
				}
			} else if (client.field1717 == 130) {
				if (!class190.field2066.method6306()) {
					class73.field638 = class321.field3787 + class190.field2066.method6230() * 4 / 5 + "%";
					class73.field637 = 96;
				} else if (!class72.field619.method6306()) {
					class73.field638 = class321.field3787 + (80 + class72.field619.method6230() / 6) + "%";
					class73.field637 = 96;
				} else if (!class363.field4355.method6306()) {
					class73.field638 = class321.field3787 + (96 + class363.field4355.method6230() / 50) + "%";
					class73.field637 = 96;
				} else {
					class73.field638 = class321.field3876;
					class73.field637 = 98;
					client.field1717 = 140;
				}
			} else if (client.field1717 == 140) {
				class73.field637 = 100;
				if (!class436.field4788.method6370(class237.field2851.field2849)) {
					class73.field638 = class321.field3754 + class436.field4788.method6303(class237.field2851.field2849) / 10 + "%";
				} else {
					if (null == class166.field1548) {
						class166.field1548 = new class418();
						class166.field1548.method7674(class436.field4788, class177.field1644, class254.field2968, class140.field1352, client.field1752, class44.field326);
					}

					class73.field638 = class321.field4042;
					client.field1717 = 150;
				}
			} else if (client.field1717 == 150) {
				class131.method2451(10);
			}
		}
	}
}
