package f0;

import in.swiggy.android.tejas.network.HttpRequest;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: IdentityArrayMap.kt */
public final class b<Key, Value> {

    /* renamed from: a  reason: collision with root package name */
    private Object[] f14457a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f14458b;

    /* renamed from: c  reason: collision with root package name */
    private int f14459c;

    public b(int i11) {
        this.f14457a = new Object[i11];
        this.f14458b = new Object[i11];
    }

    private final int b(Object obj) {
        int a11 = e0.b.a(obj);
        int i11 = this.f14459c - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            Object obj2 = this.f14457a[i13];
            int a12 = e0.b.a(obj2);
            if (a12 < a11) {
                i12 = i13 + 1;
            } else if (a12 > a11) {
                i11 = i13 - 1;
            } else if (obj == obj2) {
                return i13;
            } else {
                return c(i13, obj, a11);
            }
        }
        return -(i12 + 1);
    }

    private final int c(int i11, Object obj, int i12) {
        for (int i13 = i11 - 1; -1 < i13; i13--) {
            Object obj2 = this.f14457a[i13];
            if (obj2 == obj) {
                return i13;
            }
            if (e0.b.a(obj2) != i12) {
                break;
            }
        }
        int i14 = i11 + 1;
        int i15 = this.f14459c;
        while (true) {
            if (i14 >= i15) {
                i14 = this.f14459c;
                break;
            }
            Object obj3 = this.f14457a[i14];
            if (obj3 == obj) {
                return i14;
            }
            if (e0.b.a(obj3) != i12) {
                break;
            }
            i14++;
        }
        return -(i14 + 1);
    }

    public final boolean a(Key key) {
        p.j(key, HttpRequest.HEADER_KEY);
        return b(key) >= 0;
    }

    public final Value d(Key key) {
        p.j(key, HttpRequest.HEADER_KEY);
        int b11 = b(key);
        if (b11 >= 0) {
            return this.f14458b[b11];
        }
        return null;
    }

    public final Object[] e() {
        return this.f14457a;
    }

    public final int f() {
        return this.f14459c;
    }

    public final Object[] g() {
        return this.f14458b;
    }

    public final boolean h() {
        return this.f14459c > 0;
    }

    public final boolean i(Key key) {
        p.j(key, HttpRequest.HEADER_KEY);
        int b11 = b(key);
        if (b11 < 0) {
            return false;
        }
        int i11 = this.f14459c;
        Object[] objArr = this.f14457a;
        Object[] objArr2 = this.f14458b;
        int i12 = b11 + 1;
        Object[] unused = g.j(objArr, objArr, b11, i12, i11);
        Object[] unused2 = g.j(objArr2, objArr2, b11, i12, i11);
        int i13 = i11 - 1;
        objArr[i13] = null;
        objArr2[i13] = null;
        this.f14459c = i13;
        return true;
    }

    public final void j(Key key, Value value) {
        Object[] objArr;
        p.j(key, HttpRequest.HEADER_KEY);
        int b11 = b(key);
        if (b11 >= 0) {
            this.f14458b[b11] = value;
            return;
        }
        int i11 = -(b11 + 1);
        int i12 = this.f14459c;
        Object[] objArr2 = this.f14457a;
        boolean z11 = i12 == objArr2.length;
        Object[] objArr3 = z11 ? new Object[(i12 * 2)] : objArr2;
        int i13 = i11 + 1;
        Object[] unused = g.j(objArr2, objArr3, i13, i11, i12);
        if (z11) {
            Object[] unused2 = g.n(this.f14457a, objArr3, 0, 0, i11, 6, (Object) null);
        }
        objArr3[i11] = key;
        this.f14457a = objArr3;
        if (z11) {
            objArr = new Object[(this.f14459c * 2)];
        } else {
            objArr = this.f14458b;
        }
        Object[] unused3 = g.j(this.f14458b, objArr, i13, i11, this.f14459c);
        if (z11) {
            Object[] unused4 = g.n(this.f14458b, objArr, 0, 0, i11, 6, (Object) null);
        }
        objArr[i11] = value;
        this.f14458b = objArr;
        this.f14459c++;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i11, int i12, i iVar) {
        this((i12 & 1) != 0 ? 16 : i11);
    }
}
