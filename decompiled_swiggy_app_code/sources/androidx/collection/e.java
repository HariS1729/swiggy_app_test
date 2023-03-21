package androidx.collection;

/* compiled from: LongSparseArray */
public class e<E> implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    private static final Object f2375e = new Object();

    /* renamed from: a  reason: collision with root package name */
    private boolean f2376a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f2377b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f2378c;

    /* renamed from: d  reason: collision with root package name */
    private int f2379d;

    public e() {
        this(10);
    }

    private void h() {
        int i11 = this.f2379d;
        long[] jArr = this.f2377b;
        Object[] objArr = this.f2378c;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            if (obj != f2375e) {
                if (i13 != i12) {
                    jArr[i12] = jArr[i13];
                    objArr[i12] = obj;
                    objArr[i13] = null;
                }
                i12++;
            }
        }
        this.f2376a = false;
        this.f2379d = i12;
    }

    public void b(long j, E e11) {
        int i11 = this.f2379d;
        if (i11 == 0 || j > this.f2377b[i11 - 1]) {
            if (this.f2376a && i11 >= this.f2377b.length) {
                h();
            }
            int i12 = this.f2379d;
            if (i12 >= this.f2377b.length) {
                int f11 = c.f(i12 + 1);
                long[] jArr = new long[f11];
                Object[] objArr = new Object[f11];
                long[] jArr2 = this.f2377b;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f2378c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f2377b = jArr;
                this.f2378c = objArr;
            }
            this.f2377b[i12] = j;
            this.f2378c[i12] = e11;
            this.f2379d = i12 + 1;
            return;
        }
        n(j, e11);
    }

    public void e() {
        int i11 = this.f2379d;
        Object[] objArr = this.f2378c;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        this.f2379d = 0;
        this.f2376a = false;
    }

    /* renamed from: f */
    public e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f2377b = (long[]) this.f2377b.clone();
            eVar.f2378c = (Object[]) this.f2378c.clone();
            return eVar;
        } catch (CloneNotSupportedException e11) {
            throw new AssertionError(e11);
        }
    }

    public boolean g(long j) {
        return k(j) >= 0;
    }

    public E i(long j) {
        return j(j, (Object) null);
    }

    public E j(long j, E e11) {
        int b11 = c.b(this.f2377b, this.f2379d, j);
        if (b11 >= 0) {
            E[] eArr = this.f2378c;
            if (eArr[b11] != f2375e) {
                return eArr[b11];
            }
        }
        return e11;
    }

    public int k(long j) {
        if (this.f2376a) {
            h();
        }
        return c.b(this.f2377b, this.f2379d, j);
    }

    public boolean l() {
        return q() == 0;
    }

    public long m(int i11) {
        if (this.f2376a) {
            h();
        }
        return this.f2377b[i11];
    }

    public void n(long j, E e11) {
        int b11 = c.b(this.f2377b, this.f2379d, j);
        if (b11 >= 0) {
            this.f2378c[b11] = e11;
            return;
        }
        int i11 = ~b11;
        int i12 = this.f2379d;
        if (i11 < i12) {
            Object[] objArr = this.f2378c;
            if (objArr[i11] == f2375e) {
                this.f2377b[i11] = j;
                objArr[i11] = e11;
                return;
            }
        }
        if (this.f2376a && i12 >= this.f2377b.length) {
            h();
            i11 = ~c.b(this.f2377b, this.f2379d, j);
        }
        int i13 = this.f2379d;
        if (i13 >= this.f2377b.length) {
            int f11 = c.f(i13 + 1);
            long[] jArr = new long[f11];
            Object[] objArr2 = new Object[f11];
            long[] jArr2 = this.f2377b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f2378c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2377b = jArr;
            this.f2378c = objArr2;
        }
        int i14 = this.f2379d;
        if (i14 - i11 != 0) {
            long[] jArr3 = this.f2377b;
            int i15 = i11 + 1;
            System.arraycopy(jArr3, i11, jArr3, i15, i14 - i11);
            Object[] objArr4 = this.f2378c;
            System.arraycopy(objArr4, i11, objArr4, i15, this.f2379d - i11);
        }
        this.f2377b[i11] = j;
        this.f2378c[i11] = e11;
        this.f2379d++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f2378c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f2377b
            int r1 = r2.f2379d
            int r3 = androidx.collection.c.b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f2378c
            r0 = r4[r3]
            java.lang.Object r1 = f2375e
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f2376a = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.e.o(long):void");
    }

    public void p(int i11) {
        Object[] objArr = this.f2378c;
        Object obj = objArr[i11];
        Object obj2 = f2375e;
        if (obj != obj2) {
            objArr[i11] = obj2;
            this.f2376a = true;
        }
    }

    public int q() {
        if (this.f2376a) {
            h();
        }
        return this.f2379d;
    }

    public E r(int i11) {
        if (this.f2376a) {
            h();
        }
        return this.f2378c[i11];
    }

    public String toString() {
        if (q() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f2379d * 28);
        sb2.append('{');
        for (int i11 = 0; i11 < this.f2379d; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(m(i11));
            sb2.append('=');
            Object r11 = r(i11);
            if (r11 != this) {
                sb2.append(r11);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public e(int i11) {
        this.f2376a = false;
        if (i11 == 0) {
            this.f2377b = c.f2370b;
            this.f2378c = c.f2371c;
            return;
        }
        int f11 = c.f(i11);
        this.f2377b = new long[f11];
        this.f2378c = new Object[f11];
    }
}
