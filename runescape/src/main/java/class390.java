public final class class390 implements Comparable {
	Object field4516;
	Object field4517;
	long field4515;
	long field4518;

	class390(Object var1, Object var2) {
		this.field4517 = var1;
		this.field4516 = var2;
	}

	int method7247(class390 var1) {
		if (this.field4518 < var1.field4518) {
			return -1;
		} else {
			return this.field4518 > var1.field4518 ? 1 : 0;
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class390) {
			return this.field4516.equals(((class390)var1).field4516);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int hashCode() {
		return this.field4516.hashCode();
	}

	public int compareTo(Object var1) {
		return this.method7247((class390)var1);
	}
}
