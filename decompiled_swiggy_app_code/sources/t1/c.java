package t1;

import in.swiggy.android.tejas.network.HttpRequest;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: SimpleArrayMap.kt */
public final class c<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private int[] f16697a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f16698b;

    /* renamed from: c  reason: collision with root package name */
    private int f16699c;

    public c() {
        this(0, 1, (i) null);
    }

    public c(int i11) {
        if (i11 == 0) {
            this.f16697a = a.f16686a;
            this.f16698b = a.f16687b;
        } else {
            this.f16697a = new int[i11];
            this.f16698b = new Object[(i11 << 1)];
        }
        this.f16699c = 0;
    }

    public final boolean a(K k) {
        return d(k) >= 0;
    }

    public final V b(K k) {
        int d11 = d(k);
        if (d11 >= 0) {
            return this.f16698b[(d11 << 1) + 1];
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final int c(Object obj, int i11) {
        p.j(obj, HttpRequest.HEADER_KEY);
        int i12 = this.f16699c;
        if (i12 == 0) {
            return -1;
        }
        int a11 = a.a(this.f16697a, i12, i11);
        if (a11 < 0 || p.e(obj, this.f16698b[a11 << 1])) {
            return a11;
        }
        int i13 = a11 + 1;
        while (i13 < i12 && this.f16697a[i13] == i11) {
            if (p.e(obj, this.f16698b[i13 << 1])) {
                return i13;
            }
            i13++;
        }
        int i14 = a11 - 1;
        while (i14 >= 0 && this.f16697a[i14] == i11) {
            if (p.e(obj, this.f16698b[i14 << 1])) {
                return i14;
            }
            i14--;
        }
        return ~i13;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj, obj.hashCode());
    }

    /* access modifiers changed from: protected */
    public final int e() {
        int i11 = this.f16699c;
        if (i11 == 0) {
            return -1;
        }
        int a11 = a.a(this.f16697a, i11, 0);
        if (a11 < 0 || this.f16698b[a11 << 1] == null) {
            return a11;
        }
        int i12 = a11 + 1;
        while (i12 < i11 && this.f16697a[i12] == 0) {
            if (this.f16698b[i12 << 1] == null) {
                return i12;
            }
            i12++;
        }
        int i13 = a11 - 1;
        while (i13 >= 0 && this.f16697a[i13] == 0) {
            if (this.f16698b[i13 << 1] == null) {
                return i13;
            }
            i13--;
        }
        return ~i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof c) {
                c cVar = (c) obj;
                int i11 = this.f16699c;
                if (i11 != cVar.f16699c) {
                    return false;
                }
                for (int i12 = 0; i12 < i11; i12++) {
                    Object g11 = g(i12);
                    Object i13 = i(i12);
                    Object b11 = cVar.b(g11);
                    if (i13 == null) {
                        if (b11 != null || !cVar.a(g11)) {
                            return false;
                        }
                    } else if (!p.e(i13, b11)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.f16699c != ((Map) obj).size()) {
                return false;
            } else {
                int i14 = this.f16699c;
                for (int i15 = 0; i15 < i14; i15++) {
                    Object g12 = g(i15);
                    Object i16 = i(i15);
                    Object obj2 = ((Map) obj).get(g12);
                    if (i16 == null) {
                        if (obj2 != null || !((Map) obj).containsKey(g12)) {
                            return false;
                        }
                    } else if (!p.e(i16, obj2)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final boolean f() {
        return this.f16699c <= 0;
    }

    public final K g(int i11) {
        return this.f16698b[i11 << 1];
    }

    public final V h(K k, V v) {
        int i11;
        int i12;
        int i13 = this.f16699c;
        if (k == null) {
            i12 = 0;
            i11 = e();
        } else {
            i12 = k.hashCode();
            i11 = c(k, i12);
        }
        if (i11 >= 0) {
            int i14 = (i11 << 1) + 1;
            V[] vArr = this.f16698b;
            V v11 = vArr[i14];
            vArr[i14] = v;
            return v11;
        }
        int i15 = ~i11;
        int[] iArr = this.f16697a;
        if (i13 >= iArr.length) {
            int i16 = 4;
            if (i13 >= 8) {
                i16 = (i13 >> 1) + i13;
            } else if (i13 >= 4) {
                i16 = 8;
            }
            int[] copyOf = Arrays.copyOf(iArr, i16);
            p.i(copyOf, "copyOf(this, newSize)");
            this.f16697a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f16698b, i16 << 1);
            p.i(copyOf2, "copyOf(this, newSize)");
            this.f16698b = copyOf2;
            if (i13 != this.f16699c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i15 < i13) {
            int[] iArr2 = this.f16697a;
            int i17 = i15 + 1;
            int[] unused = g.h(iArr2, iArr2, i17, i15, i13);
            Object[] objArr = this.f16698b;
            Object[] unused2 = g.j(objArr, objArr, i17 << 1, i15 << 1, this.f16699c << 1);
        }
        int i18 = this.f16699c;
        if (i13 == i18) {
            int[] iArr3 = this.f16697a;
            if (i15 < iArr3.length) {
                iArr3[i15] = i12;
                Object[] objArr2 = this.f16698b;
                int i19 = i15 << 1;
                objArr2[i19] = k;
                objArr2[i19 + 1] = v;
                this.f16699c = i18 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public int hashCode() {
        int[] iArr = this.f16697a;
        Object[] objArr = this.f16698b;
        int i11 = this.f16699c;
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            Object obj = objArr[i12];
            i14 += (obj != null ? obj.hashCode() : 0) ^ iArr[i13];
            i13++;
            i12 += 2;
        }
        return i14;
    }

    public final V i(int i11) {
        return this.f16698b[(i11 << 1) + 1];
    }

    public String toString() {
        if (f()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f16699c * 28);
        sb2.append('{');
        int i11 = this.f16699c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            Object g11 = g(i12);
            if (g11 != this) {
                sb2.append(g11);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object i13 = i(i12);
            if (i13 != this) {
                sb2.append(i13);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        p.i(sb3, "buffer.toString()");
        return sb3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i11, int i12, i iVar) {
        this((i12 & 1) != 0 ? 0 : i11);
    }
}
