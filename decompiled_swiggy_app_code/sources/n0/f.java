package n0;

/* compiled from: SnapshotDoubleIndexHeap.kt */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private int f15735a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f15736b = new int[16];

    /* renamed from: c  reason: collision with root package name */
    private int[] f15737c = new int[16];

    /* renamed from: d  reason: collision with root package name */
    private int[] f15738d;

    /* renamed from: e  reason: collision with root package name */
    private int f15739e;

    public f() {
        int[] iArr = new int[16];
        int i11 = 0;
        while (i11 < 16) {
            int i12 = i11 + 1;
            iArr[i11] = i12;
            i11 = i12;
        }
        this.f15738d = iArr;
    }

    private final int b() {
        int length = this.f15738d.length;
        if (this.f15739e >= length) {
            int i11 = 0;
            int i12 = length * 2;
            int[] iArr = new int[i12];
            while (i11 < i12) {
                int i13 = i11 + 1;
                iArr[i11] = i13;
                i11 = i13;
            }
            int[] unused = g.m(this.f15738d, iArr, 0, 0, 0, 14, (Object) null);
            this.f15738d = iArr;
        }
        int i14 = this.f15739e;
        this.f15739e = this.f15738d[i14];
        return i14;
    }

    private final void c(int i11) {
        int[] iArr = this.f15736b;
        int length = iArr.length;
        if (i11 > length) {
            int i12 = length * 2;
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            int[] unused = g.m(iArr, iArr2, 0, 0, 0, 14, (Object) null);
            int[] unused2 = g.m(this.f15737c, iArr3, 0, 0, 0, 14, (Object) null);
            this.f15736b = iArr2;
            this.f15737c = iArr3;
        }
    }

    private final void d(int i11) {
        this.f15738d[i11] = this.f15739e;
        this.f15739e = i11;
    }

    private final void g(int i11) {
        int[] iArr = this.f15736b;
        int i12 = this.f15735a >> 1;
        while (i11 < i12) {
            int i13 = (i11 + 1) << 1;
            int i14 = i13 - 1;
            if (i13 >= this.f15735a || iArr[i13] >= iArr[i14]) {
                if (iArr[i14] < iArr[i11]) {
                    i(i14, i11);
                    i11 = i14;
                } else {
                    return;
                }
            } else if (iArr[i13] < iArr[i11]) {
                i(i13, i11);
                i11 = i13;
            } else {
                return;
            }
        }
    }

    private final void h(int i11) {
        int[] iArr = this.f15736b;
        int i12 = iArr[i11];
        while (i11 > 0) {
            int i13 = ((i11 + 1) >> 1) - 1;
            if (iArr[i13] > i12) {
                i(i13, i11);
                i11 = i13;
            } else {
                return;
            }
        }
    }

    private final void i(int i11, int i12) {
        int[] iArr = this.f15736b;
        int[] iArr2 = this.f15737c;
        int[] iArr3 = this.f15738d;
        int i13 = iArr[i11];
        iArr[i11] = iArr[i12];
        iArr[i12] = i13;
        int i14 = iArr2[i11];
        iArr2[i11] = iArr2[i12];
        iArr2[i12] = i14;
        iArr3[iArr2[i11]] = i11;
        iArr3[iArr2[i12]] = i12;
    }

    public final int a(int i11) {
        c(this.f15735a + 1);
        int i12 = this.f15735a;
        this.f15735a = i12 + 1;
        int b11 = b();
        this.f15736b[i12] = i11;
        this.f15737c[i12] = b11;
        this.f15738d[b11] = i12;
        h(i12);
        return b11;
    }

    public final int e(int i11) {
        return this.f15735a > 0 ? this.f15736b[0] : i11;
    }

    public final void f(int i11) {
        int i12 = this.f15738d[i11];
        i(i12, this.f15735a - 1);
        this.f15735a--;
        h(i12);
        g(i12);
        d(i11);
    }
}
