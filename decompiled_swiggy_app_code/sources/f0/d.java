package f0;

import e0.b;
import java.util.Arrays;
import kotlin.jvm.internal.p;

/* compiled from: IdentityScopeMap.kt */
public final class d<T> {

    /* renamed from: a  reason: collision with root package name */
    private int[] f14464a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f14465b;

    /* renamed from: c  reason: collision with root package name */
    private c<T>[] f14466c;

    /* renamed from: d  reason: collision with root package name */
    private int f14467d;

    public d() {
        int[] iArr = new int[50];
        for (int i11 = 0; i11 < 50; i11++) {
            iArr[i11] = i11;
        }
        this.f14464a = iArr;
        this.f14465b = new Object[50];
        this.f14466c = new c[50];
    }

    /* access modifiers changed from: private */
    public final int f(Object obj) {
        int a11 = b.a(obj);
        int i11 = this.f14467d - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            Object obj2 = this.f14465b[this.f14464a[i13]];
            p.g(obj2);
            int a12 = b.a(obj2);
            if (a12 < a11) {
                i12 = i13 + 1;
            } else if (a12 > a11) {
                i11 = i13 - 1;
            } else if (obj == obj2) {
                return i13;
            } else {
                return g(i13, obj, a11);
            }
        }
        return -(i12 + 1);
    }

    private final int g(int i11, Object obj, int i12) {
        for (int i13 = i11 - 1; -1 < i13; i13--) {
            Object obj2 = this.f14465b[this.f14464a[i13]];
            p.g(obj2);
            if (obj2 == obj) {
                return i13;
            }
            if (b.a(obj2) != i12) {
                break;
            }
        }
        int i14 = i11 + 1;
        int i15 = this.f14467d;
        while (true) {
            if (i14 >= i15) {
                i14 = this.f14467d;
                break;
            }
            Object obj3 = this.f14465b[this.f14464a[i14]];
            p.g(obj3);
            if (obj3 == obj) {
                return i14;
            }
            if (b.a(obj3) != i12) {
                break;
            }
            i14++;
        }
        return -(i14 + 1);
    }

    private final c<T> h(Object obj) {
        int i11;
        if (this.f14467d > 0) {
            i11 = f(obj);
            if (i11 >= 0) {
                return o(i11);
            }
        } else {
            i11 = -1;
        }
        int i12 = -(i11 + 1);
        int i13 = this.f14467d;
        int[] iArr = this.f14464a;
        if (i13 < iArr.length) {
            int i14 = iArr[i13];
            this.f14465b[i14] = obj;
            c<T> cVar = this.f14466c[i14];
            if (cVar == null) {
                cVar = new c<>();
                this.f14466c[i14] = cVar;
            }
            int i15 = this.f14467d;
            if (i12 < i15) {
                int[] iArr2 = this.f14464a;
                int[] unused = g.h(iArr2, iArr2, i12 + 1, i12, i15);
            }
            this.f14464a[i12] = i14;
            this.f14467d++;
            return cVar;
        }
        int length = iArr.length * 2;
        Object[] copyOf = Arrays.copyOf(this.f14466c, length);
        p.i(copyOf, "copyOf(this, newSize)");
        this.f14466c = (c[]) copyOf;
        c<T> cVar2 = new c<>();
        this.f14466c[i13] = cVar2;
        Object[] copyOf2 = Arrays.copyOf(this.f14465b, length);
        p.i(copyOf2, "copyOf(this, newSize)");
        this.f14465b = copyOf2;
        copyOf2[i13] = obj;
        int[] iArr3 = new int[length];
        int i16 = this.f14467d;
        while (true) {
            i16++;
            if (i16 >= length) {
                break;
            }
            iArr3[i16] = i16;
        }
        int i17 = this.f14467d;
        if (i12 < i17) {
            int[] unused2 = g.h(this.f14464a, iArr3, i12 + 1, i12, i17);
        }
        iArr3[i12] = i13;
        if (i12 > 0) {
            int[] unused3 = g.m(this.f14464a, iArr3, 0, 0, i12, 6, (Object) null);
        }
        this.f14464a = iArr3;
        this.f14467d++;
        return cVar2;
    }

    /* access modifiers changed from: private */
    public final c<T> o(int i11) {
        c<T> cVar = this.f14466c[this.f14464a[i11]];
        p.g(cVar);
        return cVar;
    }

    public final boolean c(Object obj, T t) {
        p.j(obj, "value");
        p.j(t, "scope");
        return h(obj).add(t);
    }

    public final void d() {
        int length = this.f14466c.length;
        for (int i11 = 0; i11 < length; i11++) {
            c<T> cVar = this.f14466c[i11];
            if (cVar != null) {
                cVar.clear();
            }
            this.f14464a[i11] = i11;
            this.f14465b[i11] = null;
        }
        this.f14467d = 0;
    }

    public final boolean e(Object obj) {
        p.j(obj, "element");
        return f(obj) >= 0;
    }

    public final c<T>[] i() {
        return this.f14466c;
    }

    public final int j() {
        return this.f14467d;
    }

    public final int[] k() {
        return this.f14464a;
    }

    public final Object[] l() {
        return this.f14465b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r4.f14464a[r5];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(java.lang.Object r5, T r6) {
        /*
            r4 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.p.j(r5, r0)
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.p.j(r6, r0)
            int r5 = r4.f(r5)
            r0 = 0
            if (r5 < 0) goto L_0x0043
            int[] r1 = r4.f14464a
            r1 = r1[r5]
            f0.c<T>[] r2 = r4.f14466c
            r2 = r2[r1]
            if (r2 != 0) goto L_0x001c
            return r0
        L_0x001c:
            boolean r6 = r2.remove(r6)
            int r0 = r2.size()
            if (r0 != 0) goto L_0x0042
            int r0 = r5 + 1
            int r2 = r4.f14467d
            if (r0 >= r2) goto L_0x0031
            int[] r3 = r4.f14464a
            int[] unused = kotlin.collections.g.h(r3, r3, r5, r0, r2)
        L_0x0031:
            int[] r5 = r4.f14464a
            int r0 = r4.f14467d
            int r2 = r0 + -1
            r5[r2] = r1
            java.lang.Object[] r5 = r4.f14465b
            r2 = 0
            r5[r1] = r2
            int r0 = r0 + -1
            r4.f14467d = r0
        L_0x0042:
            return r6
        L_0x0043:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.d.m(java.lang.Object, java.lang.Object):boolean");
    }

    public final void n(T t) {
        p.j(t, "scope");
        int j = j();
        int i11 = 0;
        for (int i12 = 0; i12 < j; i12++) {
            int i13 = k()[i12];
            c cVar = i()[i13];
            p.g(cVar);
            cVar.remove(t);
            if (cVar.size() > 0) {
                if (i11 != i12) {
                    int i14 = k()[i11];
                    k()[i11] = i13;
                    k()[i12] = i14;
                }
                i11++;
            }
        }
        int j11 = j();
        for (int i15 = i11; i15 < j11; i15++) {
            l()[k()[i15]] = null;
        }
        p(i11);
    }

    public final void p(int i11) {
        this.f14467d = i11;
    }
}
