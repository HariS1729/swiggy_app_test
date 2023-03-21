package f0;

import e0.b;
import in.swiggy.android.tejas.network.HttpRequest;
import kotlin.jvm.internal.p;

/* compiled from: IdentityArrayIntMap.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private int f14454a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f14455b = new Object[4];

    /* renamed from: c  reason: collision with root package name */
    private int[] f14456c = new int[4];

    private final int b(Object obj) {
        int i11 = this.f14454a - 1;
        int a11 = b.a(obj);
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            Object obj2 = this.f14455b[i13];
            int a12 = b.a(obj2);
            if (a12 < a11) {
                i12 = i13 + 1;
            } else if (a12 > a11) {
                i11 = i13 - 1;
            } else if (obj2 == obj) {
                return i13;
            } else {
                return c(i13, obj, a11);
            }
        }
        return -(i12 + 1);
    }

    private final int c(int i11, Object obj, int i12) {
        for (int i13 = i11 - 1; -1 < i13; i13--) {
            Object obj2 = this.f14455b[i13];
            if (obj2 == obj) {
                return i13;
            }
            if (b.a(obj2) != i12) {
                break;
            }
        }
        int i14 = i11 + 1;
        int i15 = this.f14454a;
        while (true) {
            if (i14 >= i15) {
                i14 = this.f14454a;
                break;
            }
            Object obj3 = this.f14455b[i14];
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

    public final void a(Object obj, int i11) {
        int i12;
        p.j(obj, HttpRequest.HEADER_KEY);
        if (this.f14454a > 0) {
            i12 = b(obj);
            if (i12 >= 0) {
                this.f14456c[i12] = i11;
                return;
            }
        } else {
            i12 = -1;
        }
        int i13 = -(i12 + 1);
        int i14 = this.f14454a;
        Object[] objArr = this.f14455b;
        if (i14 == objArr.length) {
            Object[] objArr2 = new Object[(objArr.length * 2)];
            int[] iArr = new int[(objArr.length * 2)];
            int i15 = i13 + 1;
            Object[] unused = g.j(objArr, objArr2, i15, i13, i14);
            int[] unused2 = g.h(this.f14456c, iArr, i15, i13, this.f14454a);
            int i16 = i13;
            Object[] unused3 = g.n(this.f14455b, objArr2, 0, 0, i16, 6, (Object) null);
            int[] unused4 = g.m(this.f14456c, iArr, 0, 0, i16, 6, (Object) null);
            this.f14455b = objArr2;
            this.f14456c = iArr;
        } else {
            int i17 = i13 + 1;
            Object[] unused5 = g.j(objArr, objArr, i17, i13, i14);
            int[] iArr2 = this.f14456c;
            int[] unused6 = g.h(iArr2, iArr2, i17, i13, this.f14454a);
        }
        this.f14455b[i13] = obj;
        this.f14456c[i13] = i11;
        this.f14454a++;
    }

    public final Object[] d() {
        return this.f14455b;
    }

    public final int e() {
        return this.f14454a;
    }

    public final int[] f() {
        return this.f14456c;
    }

    public final void g(int i11) {
        this.f14454a = i11;
    }
}
