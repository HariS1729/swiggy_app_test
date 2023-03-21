package androidx.collection;

/* compiled from: SparseArrayCompat */
public class h<E> implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    private static final Object f2387e = new Object();

    /* renamed from: a  reason: collision with root package name */
    private boolean f2388a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f2389b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f2390c;

    /* renamed from: d  reason: collision with root package name */
    private int f2391d;

    public h() {
        this(10);
    }

    private void h() {
        int i11 = this.f2391d;
        int[] iArr = this.f2389b;
        Object[] objArr = this.f2390c;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            if (obj != f2387e) {
                if (i13 != i12) {
                    iArr[i12] = iArr[i13];
                    objArr[i12] = obj;
                    objArr[i13] = null;
                }
                i12++;
            }
        }
        this.f2388a = false;
        this.f2391d = i12;
    }

    public void b(int i11, E e11) {
        int i12 = this.f2391d;
        if (i12 == 0 || i11 > this.f2389b[i12 - 1]) {
            if (this.f2388a && i12 >= this.f2389b.length) {
                h();
            }
            int i13 = this.f2391d;
            if (i13 >= this.f2389b.length) {
                int e12 = c.e(i13 + 1);
                int[] iArr = new int[e12];
                Object[] objArr = new Object[e12];
                int[] iArr2 = this.f2389b;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f2390c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f2389b = iArr;
                this.f2390c = objArr;
            }
            this.f2389b[i13] = i11;
            this.f2390c[i13] = e11;
            this.f2391d = i13 + 1;
            return;
        }
        n(i11, e11);
    }

    public void e() {
        int i11 = this.f2391d;
        Object[] objArr = this.f2390c;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        this.f2391d = 0;
        this.f2388a = false;
    }

    /* renamed from: f */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f2389b = (int[]) this.f2389b.clone();
            hVar.f2390c = (Object[]) this.f2390c.clone();
            return hVar;
        } catch (CloneNotSupportedException e11) {
            throw new AssertionError(e11);
        }
    }

    public boolean g(int i11) {
        return k(i11) >= 0;
    }

    public E i(int i11) {
        return j(i11, (Object) null);
    }

    public E j(int i11, E e11) {
        int a11 = c.a(this.f2389b, this.f2391d, i11);
        if (a11 >= 0) {
            E[] eArr = this.f2390c;
            if (eArr[a11] != f2387e) {
                return eArr[a11];
            }
        }
        return e11;
    }

    public int k(int i11) {
        if (this.f2388a) {
            h();
        }
        return c.a(this.f2389b, this.f2391d, i11);
    }

    public int l(E e11) {
        if (this.f2388a) {
            h();
        }
        for (int i11 = 0; i11 < this.f2391d; i11++) {
            if (this.f2390c[i11] == e11) {
                return i11;
            }
        }
        return -1;
    }

    public int m(int i11) {
        if (this.f2388a) {
            h();
        }
        return this.f2389b[i11];
    }

    public void n(int i11, E e11) {
        int a11 = c.a(this.f2389b, this.f2391d, i11);
        if (a11 >= 0) {
            this.f2390c[a11] = e11;
            return;
        }
        int i12 = ~a11;
        int i13 = this.f2391d;
        if (i12 < i13) {
            Object[] objArr = this.f2390c;
            if (objArr[i12] == f2387e) {
                this.f2389b[i12] = i11;
                objArr[i12] = e11;
                return;
            }
        }
        if (this.f2388a && i13 >= this.f2389b.length) {
            h();
            i12 = ~c.a(this.f2389b, this.f2391d, i11);
        }
        int i14 = this.f2391d;
        if (i14 >= this.f2389b.length) {
            int e12 = c.e(i14 + 1);
            int[] iArr = new int[e12];
            Object[] objArr2 = new Object[e12];
            int[] iArr2 = this.f2389b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f2390c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2389b = iArr;
            this.f2390c = objArr2;
        }
        int i15 = this.f2391d;
        if (i15 - i12 != 0) {
            int[] iArr3 = this.f2389b;
            int i16 = i12 + 1;
            System.arraycopy(iArr3, i12, iArr3, i16, i15 - i12);
            Object[] objArr4 = this.f2390c;
            System.arraycopy(objArr4, i12, objArr4, i16, this.f2391d - i12);
        }
        this.f2389b[i12] = i11;
        this.f2390c[i12] = e11;
        this.f2391d++;
    }

    public void o(int i11) {
        Object[] objArr = this.f2390c;
        Object obj = objArr[i11];
        Object obj2 = f2387e;
        if (obj != obj2) {
            objArr[i11] = obj2;
            this.f2388a = true;
        }
    }

    public int p() {
        if (this.f2388a) {
            h();
        }
        return this.f2391d;
    }

    public E q(int i11) {
        if (this.f2388a) {
            h();
        }
        return this.f2390c[i11];
    }

    public String toString() {
        if (p() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f2391d * 28);
        sb2.append('{');
        for (int i11 = 0; i11 < this.f2391d; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(m(i11));
            sb2.append('=');
            Object q = q(i11);
            if (q != this) {
                sb2.append(q);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public h(int i11) {
        this.f2388a = false;
        if (i11 == 0) {
            this.f2389b = c.f2369a;
            this.f2390c = c.f2371c;
            return;
        }
        int e11 = c.e(i11);
        this.f2389b = new int[e11];
        this.f2390c = new Object[e11];
    }
}
