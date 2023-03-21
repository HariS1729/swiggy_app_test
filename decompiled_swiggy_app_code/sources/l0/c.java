package l0;

import kotlin.jvm.internal.p;

/* compiled from: ThreadMap.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f15430a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f15431b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f15432c;

    public c(int i11, long[] jArr, Object[] objArr) {
        p.j(jArr, "keys");
        p.j(objArr, "values");
        this.f15430a = i11;
        this.f15431b = jArr;
        this.f15432c = objArr;
    }

    private final int a(long j) {
        int i11 = this.f15430a - 1;
        if (i11 == -1) {
            return -1;
        }
        int i12 = 0;
        if (i11 != 0) {
            while (i12 <= i11) {
                int i13 = (i12 + i11) >>> 1;
                int i14 = ((this.f15431b[i13] - j) > 0 ? 1 : ((this.f15431b[i13] - j) == 0 ? 0 : -1));
                if (i14 < 0) {
                    i12 = i13 + 1;
                } else if (i14 <= 0) {
                    return i13;
                } else {
                    i11 = i13 - 1;
                }
            }
            return -(i12 + 1);
        }
        long[] jArr = this.f15431b;
        if (jArr[0] == j) {
            return 0;
        }
        if (jArr[0] > j) {
            return -2;
        }
        return -1;
    }

    public final Object b(long j) {
        int a11 = a(j);
        if (a11 >= 0) {
            return this.f15432c[a11];
        }
        return null;
    }

    public final c c(long j, Object obj) {
        int i11 = this.f15430a;
        Object[] objArr = this.f15432c;
        int length = objArr.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            boolean z11 = true;
            if (i13 >= length) {
                break;
            }
            if (objArr[i13] == null) {
                z11 = false;
            }
            if (z11) {
                i14++;
            }
            i13++;
        }
        int i15 = i14 + 1;
        long[] jArr = new long[i15];
        Object[] objArr2 = new Object[i15];
        if (i15 > 1) {
            int i16 = 0;
            while (true) {
                if (i12 >= i15 || i16 >= i11) {
                    break;
                }
                long j11 = this.f15431b[i16];
                Object obj2 = this.f15432c[i16];
                if (j11 > j) {
                    jArr[i12] = j;
                    objArr2[i12] = obj;
                    i12++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i12] = j11;
                    objArr2[i12] = obj2;
                    i12++;
                }
                i16++;
            }
            if (i16 == i11) {
                int i17 = i15 - 1;
                jArr[i17] = j;
                objArr2[i17] = obj;
            } else {
                while (i12 < i15) {
                    long j12 = this.f15431b[i16];
                    Object obj3 = this.f15432c[i16];
                    if (obj3 != null) {
                        jArr[i12] = j12;
                        objArr2[i12] = obj3;
                        i12++;
                    }
                    i16++;
                }
            }
        } else {
            jArr[0] = j;
            objArr2[0] = obj;
        }
        return new c(i15, jArr, objArr2);
    }

    public final boolean d(long j, Object obj) {
        int a11 = a(j);
        if (a11 < 0) {
            return false;
        }
        this.f15432c[a11] = obj;
        return true;
    }
}
