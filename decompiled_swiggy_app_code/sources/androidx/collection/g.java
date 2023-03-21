package androidx.collection;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: SimpleArrayMap */
public class g<K, V> {

    /* renamed from: d  reason: collision with root package name */
    static Object[] f2380d;

    /* renamed from: e  reason: collision with root package name */
    static int f2381e;

    /* renamed from: f  reason: collision with root package name */
    static Object[] f2382f;

    /* renamed from: g  reason: collision with root package name */
    static int f2383g;

    /* renamed from: a  reason: collision with root package name */
    int[] f2384a;

    /* renamed from: b  reason: collision with root package name */
    Object[] f2385b;

    /* renamed from: c  reason: collision with root package name */
    int f2386c;

    public g() {
        this.f2384a = c.f2369a;
        this.f2385b = c.f2371c;
        this.f2386c = 0;
    }

    private void a(int i11) {
        Class<g> cls = g.class;
        if (i11 == 8) {
            synchronized (cls) {
                Object[] objArr = f2382f;
                if (objArr != null) {
                    this.f2385b = objArr;
                    f2382f = (Object[]) objArr[0];
                    this.f2384a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2383g--;
                    return;
                }
            }
        } else if (i11 == 4) {
            synchronized (cls) {
                Object[] objArr2 = f2380d;
                if (objArr2 != null) {
                    this.f2385b = objArr2;
                    f2380d = (Object[]) objArr2[0];
                    this.f2384a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2381e--;
                    return;
                }
            }
        }
        this.f2384a = new int[i11];
        this.f2385b = new Object[(i11 << 1)];
    }

    private static int b(int[] iArr, int i11, int i12) {
        try {
            return c.a(iArr, i11, i12);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void f(int[] iArr, Object[] objArr, int i11) {
        Class<g> cls = g.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f2383g < 10) {
                    objArr[0] = f2382f;
                    objArr[1] = iArr;
                    for (int i12 = (i11 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f2382f = objArr;
                    f2383g++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f2381e < 10) {
                    objArr[0] = f2380d;
                    objArr[1] = iArr;
                    for (int i13 = (i11 << 1) - 1; i13 >= 2; i13--) {
                        objArr[i13] = null;
                    }
                    f2380d = objArr;
                    f2381e++;
                }
            }
        }
    }

    public void clear() {
        int i11 = this.f2386c;
        if (i11 > 0) {
            int[] iArr = this.f2384a;
            Object[] objArr = this.f2385b;
            this.f2384a = c.f2369a;
            this.f2385b = c.f2371c;
            this.f2386c = 0;
            f(iArr, objArr, i11);
        }
        if (this.f2386c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return l(obj) >= 0;
    }

    public void d(int i11) {
        int i12 = this.f2386c;
        int[] iArr = this.f2384a;
        if (iArr.length < i11) {
            Object[] objArr = this.f2385b;
            a(i11);
            if (this.f2386c > 0) {
                System.arraycopy(iArr, 0, this.f2384a, 0, i12);
                System.arraycopy(objArr, 0, this.f2385b, 0, i12 << 1);
            }
            f(iArr, objArr, i12);
        }
        if (this.f2386c != i12) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (size() != gVar.size()) {
                    return false;
                }
                for (int i11 = 0; i11 < this.f2386c; i11++) {
                    Object m11 = m(i11);
                    Object q = q(i11);
                    Object obj2 = gVar.get(m11);
                    if (q == null) {
                        if (obj2 != null || !gVar.containsKey(m11)) {
                            return false;
                        }
                    } else if (!q.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (size() != map.size()) {
                    return false;
                }
                for (int i12 = 0; i12 < this.f2386c; i12++) {
                    Object m12 = m(i12);
                    Object q11 = q(i12);
                    Object obj3 = map.get(m12);
                    if (q11 == null) {
                        if (obj3 != null || !map.containsKey(m12)) {
                            return false;
                        }
                    } else if (!q11.equals(obj3)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public int g(Object obj, int i11) {
        int i12 = this.f2386c;
        if (i12 == 0) {
            return -1;
        }
        int b11 = b(this.f2384a, i12, i11);
        if (b11 < 0 || obj.equals(this.f2385b[b11 << 1])) {
            return b11;
        }
        int i13 = b11 + 1;
        while (i13 < i12 && this.f2384a[i13] == i11) {
            if (obj.equals(this.f2385b[i13 << 1])) {
                return i13;
            }
            i13++;
        }
        int i14 = b11 - 1;
        while (i14 >= 0 && this.f2384a[i14] == i11) {
            if (obj.equals(this.f2385b[i14 << 1])) {
                return i14;
            }
            i14--;
        }
        return ~i13;
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v) {
        int h11 = h(obj);
        return h11 >= 0 ? this.f2385b[(h11 << 1) + 1] : v;
    }

    public int h(Object obj) {
        return obj == null ? k() : g(obj, obj.hashCode());
    }

    public int hashCode() {
        int[] iArr = this.f2384a;
        Object[] objArr = this.f2385b;
        int i11 = this.f2386c;
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            Object obj = objArr[i12];
            i14 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i13];
            i13++;
            i12 += 2;
        }
        return i14;
    }

    public boolean isEmpty() {
        return this.f2386c <= 0;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        int i11 = this.f2386c;
        if (i11 == 0) {
            return -1;
        }
        int b11 = b(this.f2384a, i11, 0);
        if (b11 < 0 || this.f2385b[b11 << 1] == null) {
            return b11;
        }
        int i12 = b11 + 1;
        while (i12 < i11 && this.f2384a[i12] == 0) {
            if (this.f2385b[i12 << 1] == null) {
                return i12;
            }
            i12++;
        }
        int i13 = b11 - 1;
        while (i13 >= 0 && this.f2384a[i13] == 0) {
            if (this.f2385b[i13 << 1] == null) {
                return i13;
            }
            i13--;
        }
        return ~i12;
    }

    /* access modifiers changed from: package-private */
    public int l(Object obj) {
        int i11 = this.f2386c * 2;
        Object[] objArr = this.f2385b;
        if (obj == null) {
            for (int i12 = 1; i12 < i11; i12 += 2) {
                if (objArr[i12] == null) {
                    return i12 >> 1;
                }
            }
            return -1;
        }
        for (int i13 = 1; i13 < i11; i13 += 2) {
            if (obj.equals(objArr[i13])) {
                return i13 >> 1;
            }
        }
        return -1;
    }

    public K m(int i11) {
        return this.f2385b[i11 << 1];
    }

    public void n(g<? extends K, ? extends V> gVar) {
        int i11 = gVar.f2386c;
        d(this.f2386c + i11);
        if (this.f2386c != 0) {
            for (int i12 = 0; i12 < i11; i12++) {
                put(gVar.m(i12), gVar.q(i12));
            }
        } else if (i11 > 0) {
            System.arraycopy(gVar.f2384a, 0, this.f2384a, 0, i11);
            System.arraycopy(gVar.f2385b, 0, this.f2385b, 0, i11 << 1);
            this.f2386c = i11;
        }
    }

    public V o(int i11) {
        V[] vArr = this.f2385b;
        int i12 = i11 << 1;
        V v = vArr[i12 + 1];
        int i13 = this.f2386c;
        if (i13 <= 1) {
            clear();
        } else {
            int i14 = i13 - 1;
            int[] iArr = this.f2384a;
            int i15 = 8;
            if (iArr.length <= 8 || i13 >= iArr.length / 3) {
                if (i11 < i14) {
                    int i16 = i11 + 1;
                    int i17 = i14 - i11;
                    System.arraycopy(iArr, i16, iArr, i11, i17);
                    Object[] objArr = this.f2385b;
                    System.arraycopy(objArr, i16 << 1, objArr, i12, i17 << 1);
                }
                Object[] objArr2 = this.f2385b;
                int i18 = i14 << 1;
                objArr2[i18] = null;
                objArr2[i18 + 1] = null;
            } else {
                if (i13 > 8) {
                    i15 = i13 + (i13 >> 1);
                }
                a(i15);
                if (i13 == this.f2386c) {
                    if (i11 > 0) {
                        System.arraycopy(iArr, 0, this.f2384a, 0, i11);
                        System.arraycopy(vArr, 0, this.f2385b, 0, i12);
                    }
                    if (i11 < i14) {
                        int i19 = i11 + 1;
                        int i21 = i14 - i11;
                        System.arraycopy(iArr, i19, this.f2384a, i11, i21);
                        System.arraycopy(vArr, i19 << 1, this.f2385b, i12, i21 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            if (i13 == this.f2386c) {
                this.f2386c = i14;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return v;
    }

    public V p(int i11, V v) {
        int i12 = (i11 << 1) + 1;
        V[] vArr = this.f2385b;
        V v11 = vArr[i12];
        vArr[i12] = v;
        return v11;
    }

    public V put(K k, V v) {
        int i11;
        int i12;
        int i13 = this.f2386c;
        if (k == null) {
            i12 = k();
            i11 = 0;
        } else {
            int hashCode = k.hashCode();
            i11 = hashCode;
            i12 = g(k, hashCode);
        }
        if (i12 >= 0) {
            int i14 = (i12 << 1) + 1;
            V[] vArr = this.f2385b;
            V v11 = vArr[i14];
            vArr[i14] = v;
            return v11;
        }
        int i15 = ~i12;
        int[] iArr = this.f2384a;
        if (i13 >= iArr.length) {
            int i16 = 4;
            if (i13 >= 8) {
                i16 = (i13 >> 1) + i13;
            } else if (i13 >= 4) {
                i16 = 8;
            }
            Object[] objArr = this.f2385b;
            a(i16);
            if (i13 == this.f2386c) {
                int[] iArr2 = this.f2384a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f2385b, 0, objArr.length);
                }
                f(iArr, objArr, i13);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i15 < i13) {
            int[] iArr3 = this.f2384a;
            int i17 = i15 + 1;
            System.arraycopy(iArr3, i15, iArr3, i17, i13 - i15);
            Object[] objArr2 = this.f2385b;
            System.arraycopy(objArr2, i15 << 1, objArr2, i17 << 1, (this.f2386c - i15) << 1);
        }
        int i18 = this.f2386c;
        if (i13 == i18) {
            int[] iArr4 = this.f2384a;
            if (i15 < iArr4.length) {
                iArr4[i15] = i11;
                Object[] objArr3 = this.f2385b;
                int i19 = i15 << 1;
                objArr3[i19] = k;
                objArr3[i19 + 1] = v;
                this.f2386c = i18 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v11 = get(k);
        return v11 == null ? put(k, v) : v11;
    }

    public V q(int i11) {
        return this.f2385b[(i11 << 1) + 1];
    }

    public V remove(Object obj) {
        int h11 = h(obj);
        if (h11 >= 0) {
            return o(h11);
        }
        return null;
    }

    public V replace(K k, V v) {
        int h11 = h(k);
        if (h11 >= 0) {
            return p(h11, v);
        }
        return null;
    }

    public int size() {
        return this.f2386c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f2386c * 28);
        sb2.append('{');
        for (int i11 = 0; i11 < this.f2386c; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object m11 = m(i11);
            if (m11 != this) {
                sb2.append(m11);
            } else {
                sb2.append("(this Map)");
            }
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

    public boolean remove(Object obj, Object obj2) {
        int h11 = h(obj);
        if (h11 < 0) {
            return false;
        }
        Object q = q(h11);
        if (obj2 != q && (obj2 == null || !obj2.equals(q))) {
            return false;
        }
        o(h11);
        return true;
    }

    public boolean replace(K k, V v, V v11) {
        int h11 = h(k);
        if (h11 < 0) {
            return false;
        }
        V q = q(h11);
        if (q != v && (v == null || !v.equals(q))) {
            return false;
        }
        p(h11, v11);
        return true;
    }

    public g(int i11) {
        if (i11 == 0) {
            this.f2384a = c.f2369a;
            this.f2385b = c.f2371c;
        } else {
            a(i11);
        }
        this.f2386c = 0;
    }

    public g(g<K, V> gVar) {
        this();
        if (gVar != null) {
            n(gVar);
        }
    }
}
