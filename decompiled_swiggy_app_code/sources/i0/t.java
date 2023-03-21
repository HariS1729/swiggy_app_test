package i0;

import java.util.Arrays;
import java.util.Objects;
import k0.e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import rp0.d;

/* compiled from: TrieNode.kt */
public final class t<K, V> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f14843e = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final t f14844f = new t(0, 0, new Object[0]);

    /* renamed from: a  reason: collision with root package name */
    private int f14845a;

    /* renamed from: b  reason: collision with root package name */
    private int f14846b;

    /* renamed from: c  reason: collision with root package name */
    private final e f14847c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f14848d;

    /* compiled from: TrieNode.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final t a() {
            return t.f14844f;
        }
    }

    /* compiled from: TrieNode.kt */
    public static final class b<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private t<K, V> f14849a;

        /* renamed from: b  reason: collision with root package name */
        private final int f14850b;

        public b(t<K, V> tVar, int i11) {
            p.j(tVar, "node");
            this.f14849a = tVar;
            this.f14850b = i11;
        }

        public final t<K, V> a() {
            return this.f14849a;
        }

        public final int b() {
            return this.f14850b;
        }

        public final void c(t<K, V> tVar) {
            p.j(tVar, "<set-?>");
            this.f14849a = tVar;
        }
    }

    public t(int i11, int i12, Object[] objArr, e eVar) {
        p.j(objArr, "buffer");
        this.f14845a = i11;
        this.f14846b = i12;
        this.f14847c = eVar;
        this.f14848d = objArr;
    }

    private final t<K, V> A(int i11, f<K, V> fVar) {
        fVar.o(fVar.size() - 1);
        fVar.n(W(i11));
        if (this.f14848d.length == 2) {
            return null;
        }
        if (this.f14847c != fVar.l()) {
            return new t<>(0, 0, x.h(this.f14848d, i11), fVar.l());
        }
        this.f14848d = x.h(this.f14848d, i11);
        return this;
    }

    private final t<K, V> B(int i11, K k, V v, e eVar) {
        int n = n(i11);
        if (this.f14847c == eVar) {
            this.f14848d = x.g(this.f14848d, n, k, v);
            this.f14845a = i11 | this.f14845a;
            return this;
        }
        return new t<>(i11 | this.f14845a, this.f14846b, x.g(this.f14848d, n, k, v), eVar);
    }

    private final t<K, V> C(int i11, int i12, int i13, K k, V v, int i14, e eVar) {
        if (this.f14847c == eVar) {
            this.f14848d = d(i11, i12, i13, k, v, i14, eVar);
            this.f14845a ^= i12;
            this.f14846b |= i12;
            return this;
        }
        return new t<>(this.f14845a ^ i12, i12 | this.f14846b, d(i11, i12, i13, k, v, i14, eVar), eVar);
    }

    private final t<K, V> F(t<K, V> tVar, int i11, int i12, k0.b bVar, f<K, V> fVar) {
        t<K, V> tVar2 = tVar;
        int i13 = i11;
        k0.b bVar2 = bVar;
        int i14 = 0;
        if (r(i13)) {
            t<K, V> N = N(O(i13));
            if (tVar.r(i11)) {
                return N.E(tVar2.N(tVar.O(i11)), i12 + 5, bVar2, fVar);
            }
            f<K, V> fVar2 = fVar;
            if (!tVar.q(i11)) {
                return N;
            }
            int n = tVar.n(i11);
            K t = tVar2.t(n);
            V W = tVar2.W(n);
            int size = fVar.size();
            t<K, V> D = N.D(t != null ? t.hashCode() : 0, t, W, i12 + 5, fVar);
            if (fVar.size() != size) {
                return D;
            }
            bVar2.c(bVar.a() + 1);
            return D;
        }
        f<K, V> fVar3 = fVar;
        if (tVar.r(i11)) {
            t<K, V> N2 = tVar2.N(tVar.O(i11));
            if (q(i13)) {
                int n11 = n(i13);
                Object t11 = t(n11);
                int i15 = i12 + 5;
                if (N2.k(t11 != null ? t11.hashCode() : 0, t11, i15)) {
                    bVar2.c(bVar.a() + 1);
                } else {
                    return N2.D(t11 != null ? t11.hashCode() : 0, t11, W(n11), i15, fVar);
                }
            }
            return N2;
        }
        int n12 = n(i13);
        Object t12 = t(n12);
        Object W2 = W(n12);
        int n13 = tVar.n(i11);
        K t13 = tVar2.t(n13);
        V W3 = tVar2.W(n13);
        int hashCode = t12 != null ? t12.hashCode() : 0;
        if (t13 != null) {
            i14 = t13.hashCode();
        }
        return u(hashCode, t12, W2, i14, t13, W3, i12 + 5, fVar.l());
    }

    private final t<K, V> I(int i11, int i12, f<K, V> fVar) {
        fVar.o(fVar.size() - 1);
        fVar.n(W(i11));
        if (this.f14848d.length == 2) {
            return null;
        }
        if (this.f14847c == fVar.l()) {
            this.f14848d = x.h(this.f14848d, i11);
            this.f14845a ^= i12;
            return this;
        }
        return new t<>(i12 ^ this.f14845a, this.f14846b, x.h(this.f14848d, i11), fVar.l());
    }

    private final t<K, V> J(int i11, int i12, e eVar) {
        Object[] objArr = this.f14848d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f14847c == eVar) {
            this.f14848d = x.i(objArr, i11);
            this.f14846b ^= i12;
            return this;
        }
        return new t<>(this.f14845a, i12 ^ this.f14846b, x.i(objArr, i11), eVar);
    }

    private final t<K, V> K(t<K, V> tVar, t<K, V> tVar2, int i11, int i12, e eVar) {
        if (tVar2 == null) {
            return J(i11, i12, eVar);
        }
        if (this.f14847c == eVar || tVar != tVar2) {
            return L(i11, tVar2, eVar);
        }
        return this;
    }

    private final t<K, V> L(int i11, t<K, V> tVar, e eVar) {
        Object[] objArr = this.f14848d;
        if (objArr.length == 1 && tVar.f14848d.length == 2 && tVar.f14846b == 0) {
            tVar.f14845a = this.f14846b;
            return tVar;
        } else if (this.f14847c == eVar) {
            objArr[i11] = tVar;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            p.i(copyOf, "copyOf(this, size)");
            copyOf[i11] = tVar;
            return new t<>(this.f14845a, this.f14846b, copyOf, eVar);
        }
    }

    private final t<K, V> M(int i11, V v, f<K, V> fVar) {
        if (this.f14847c == fVar.l()) {
            this.f14848d[i11 + 1] = v;
            return this;
        }
        fVar.m(fVar.h() + 1);
        Object[] objArr = this.f14848d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        p.i(copyOf, "copyOf(this, size)");
        copyOf[i11 + 1] = v;
        return new t<>(this.f14845a, this.f14846b, copyOf, fVar.l());
    }

    private final t<K, V> R(int i11, int i12) {
        Object[] objArr = this.f14848d;
        if (objArr.length == 2) {
            return null;
        }
        return new t<>(i12 ^ this.f14845a, this.f14846b, x.h(objArr, i11));
    }

    private final t<K, V> S(int i11, int i12) {
        Object[] objArr = this.f14848d;
        if (objArr.length == 1) {
            return null;
        }
        return new t<>(this.f14845a, i12 ^ this.f14846b, x.i(objArr, i11));
    }

    private final t<K, V> T(t<K, V> tVar, t<K, V> tVar2, int i11, int i12) {
        if (tVar2 == null) {
            return S(i11, i12);
        }
        return tVar != tVar2 ? U(i11, i12, tVar2) : this;
    }

    private final t<K, V> U(int i11, int i12, t<K, V> tVar) {
        Object[] objArr = tVar.f14848d;
        if (objArr.length != 2 || tVar.f14846b != 0) {
            Object[] objArr2 = this.f14848d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            p.i(copyOf, "copyOf(this, newSize)");
            copyOf[i11] = tVar;
            return new t<>(this.f14845a, this.f14846b, copyOf);
        } else if (this.f14848d.length == 1) {
            tVar.f14845a = this.f14846b;
            return tVar;
        } else {
            return new t<>(this.f14845a ^ i12, i12 ^ this.f14846b, x.k(this.f14848d, i11, n(i12), objArr[0], objArr[1]));
        }
    }

    private final t<K, V> V(int i11, V v) {
        Object[] objArr = this.f14848d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        p.i(copyOf, "copyOf(this, size)");
        copyOf[i11 + 1] = v;
        return new t<>(this.f14845a, this.f14846b, copyOf);
    }

    private final V W(int i11) {
        return this.f14848d[i11 + 1];
    }

    private final b<K, V> b() {
        return new b<>(this, 1);
    }

    private final b<K, V> c() {
        return new b<>(this, 0);
    }

    private final Object[] d(int i11, int i12, int i13, K k, V v, int i14, e eVar) {
        Object t = t(i11);
        int i15 = i12;
        int i16 = i11;
        return x.j(this.f14848d, i11, O(i12) + 1, u(t != null ? t.hashCode() : 0, t, W(i11), i13, k, v, i14 + 5, eVar));
    }

    private final int e() {
        if (this.f14846b == 0) {
            return this.f14848d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f14845a);
        int length = this.f14848d.length;
        for (int i11 = bitCount * 2; i11 < length; i11++) {
            bitCount += N(i11).e();
        }
        return bitCount;
    }

    private final boolean f(K k) {
        d t = l.t(l.u(0, this.f14848d.length), 2);
        int f11 = t.f();
        int g11 = t.g();
        int h11 = t.h();
        if ((h11 > 0 && f11 <= g11) || (h11 < 0 && g11 <= f11)) {
            while (!p.e(k, this.f14848d[f11])) {
                if (f11 != g11) {
                    f11 += h11;
                }
            }
            return true;
        }
        return false;
    }

    private final V g(K k) {
        d t = l.t(l.u(0, this.f14848d.length), 2);
        int f11 = t.f();
        int g11 = t.g();
        int h11 = t.h();
        if ((h11 <= 0 || f11 > g11) && (h11 >= 0 || g11 > f11)) {
            return null;
        }
        while (!p.e(k, t(f11))) {
            if (f11 == g11) {
                return null;
            }
            f11 += h11;
        }
        return W(f11);
    }

    private final b<K, V> h(K k, V v) {
        d t = l.t(l.u(0, this.f14848d.length), 2);
        int f11 = t.f();
        int g11 = t.g();
        int h11 = t.h();
        if ((h11 > 0 && f11 <= g11) || (h11 < 0 && g11 <= f11)) {
            while (!p.e(k, t(f11))) {
                if (f11 != g11) {
                    f11 += h11;
                }
            }
            if (v == W(f11)) {
                return null;
            }
            Object[] objArr = this.f14848d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            p.i(copyOf, "copyOf(this, size)");
            copyOf[f11 + 1] = v;
            return new t(0, 0, copyOf).c();
        }
        return new t(0, 0, x.g(this.f14848d, 0, k, v)).b();
    }

    private final t<K, V> i(K k) {
        d t = l.t(l.u(0, this.f14848d.length), 2);
        int f11 = t.f();
        int g11 = t.g();
        int h11 = t.h();
        if ((h11 > 0 && f11 <= g11) || (h11 < 0 && g11 <= f11)) {
            while (!p.e(k, t(f11))) {
                if (f11 != g11) {
                    f11 += h11;
                }
            }
            return j(f11);
        }
        return this;
    }

    private final t<K, V> j(int i11) {
        Object[] objArr = this.f14848d;
        if (objArr.length == 2) {
            return null;
        }
        return new t<>(0, 0, x.h(objArr, i11));
    }

    private final boolean l(t<K, V> tVar) {
        if (this == tVar) {
            return true;
        }
        if (this.f14846b != tVar.f14846b || this.f14845a != tVar.f14845a) {
            return false;
        }
        int length = this.f14848d.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f14848d[i11] != tVar.f14848d[i11]) {
                return false;
            }
        }
        return true;
    }

    private final boolean r(int i11) {
        return (i11 & this.f14846b) != 0;
    }

    private final t<K, V> s(int i11, K k, V v) {
        return new t<>(i11 | this.f14845a, this.f14846b, x.g(this.f14848d, n(i11), k, v));
    }

    private final K t(int i11) {
        return this.f14848d[i11];
    }

    private final t<K, V> u(int i11, K k, V v, int i12, K k11, V v11, int i13, e eVar) {
        int i14 = i13;
        e eVar2 = eVar;
        if (i14 > 30) {
            return new t<>(0, 0, new Object[]{k, v, k11, v11}, eVar2);
        }
        int i15 = i11;
        int f11 = x.f(i11, i14);
        int f12 = x.f(i12, i14);
        if (f11 != f12) {
            return new t<>((1 << f11) | (1 << f12), 0, f11 < f12 ? new Object[]{k, v, k11, v11} : new Object[]{k11, v11, k, v}, eVar2);
        }
        return new t<>(0, 1 << f11, new Object[]{u(i11, k, v, i12, k11, v11, i14 + 5, eVar)}, eVar2);
    }

    private final t<K, V> v(int i11, int i12, int i13, K k, V v, int i14) {
        return new t<>(this.f14845a ^ i12, i12 | this.f14846b, d(i11, i12, i13, k, v, i14, (e) null));
    }

    private final t<K, V> w(K k, V v, f<K, V> fVar) {
        d t = l.t(l.u(0, this.f14848d.length), 2);
        int f11 = t.f();
        int g11 = t.g();
        int h11 = t.h();
        if ((h11 > 0 && f11 <= g11) || (h11 < 0 && g11 <= f11)) {
            while (!p.e(k, t(f11))) {
                if (f11 != g11) {
                    f11 += h11;
                }
            }
            fVar.n(W(f11));
            if (this.f14847c == fVar.l()) {
                this.f14848d[f11 + 1] = v;
                return this;
            }
            fVar.m(fVar.h() + 1);
            Object[] objArr = this.f14848d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            p.i(copyOf, "copyOf(this, size)");
            copyOf[f11 + 1] = v;
            return new t<>(0, 0, copyOf, fVar.l());
        }
        fVar.o(fVar.size() + 1);
        return new t<>(0, 0, x.g(this.f14848d, 0, k, v), fVar.l());
    }

    private final t<K, V> x(t<K, V> tVar, k0.b bVar, e eVar) {
        k0.a.a(this.f14846b == 0);
        k0.a.a(this.f14845a == 0);
        k0.a.a(tVar.f14846b == 0);
        k0.a.a(tVar.f14845a == 0);
        Object[] objArr = this.f14848d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + tVar.f14848d.length);
        p.i(copyOf, "copyOf(this, newSize)");
        int length = this.f14848d.length;
        d t = l.t(l.u(0, tVar.f14848d.length), 2);
        int f11 = t.f();
        int g11 = t.g();
        int h11 = t.h();
        if ((h11 > 0 && f11 <= g11) || (h11 < 0 && g11 <= f11)) {
            while (true) {
                if (!f(tVar.f14848d[f11])) {
                    Object[] objArr2 = tVar.f14848d;
                    copyOf[length] = objArr2[f11];
                    copyOf[length + 1] = objArr2[f11 + 1];
                    length += 2;
                } else {
                    bVar.c(bVar.a() + 1);
                }
                if (f11 == g11) {
                    break;
                }
                f11 += h11;
            }
        }
        if (length == this.f14848d.length) {
            return this;
        }
        if (length == tVar.f14848d.length) {
            return tVar;
        }
        if (length == copyOf.length) {
            return new t<>(0, 0, copyOf, eVar);
        }
        Object[] copyOf2 = Arrays.copyOf(copyOf, length);
        p.i(copyOf2, "copyOf(this, newSize)");
        return new t<>(0, 0, copyOf2, eVar);
    }

    private final t<K, V> y(K k, f<K, V> fVar) {
        d t = l.t(l.u(0, this.f14848d.length), 2);
        int f11 = t.f();
        int g11 = t.g();
        int h11 = t.h();
        if ((h11 > 0 && f11 <= g11) || (h11 < 0 && g11 <= f11)) {
            while (!p.e(k, t(f11))) {
                if (f11 != g11) {
                    f11 += h11;
                }
            }
            return A(f11, fVar);
        }
        return this;
    }

    private final t<K, V> z(K k, V v, f<K, V> fVar) {
        d t = l.t(l.u(0, this.f14848d.length), 2);
        int f11 = t.f();
        int g11 = t.g();
        int h11 = t.h();
        if ((h11 > 0 && f11 <= g11) || (h11 < 0 && g11 <= f11)) {
            while (true) {
                if (!p.e(k, t(f11)) || !p.e(v, W(f11))) {
                    if (f11 == g11) {
                        break;
                    }
                    f11 += h11;
                } else {
                    return A(f11, fVar);
                }
            }
        }
        return this;
    }

    public final t<K, V> D(int i11, K k, V v, int i12, f<K, V> fVar) {
        t<K, V> tVar;
        p.j(fVar, "mutator");
        int f11 = 1 << x.f(i11, i12);
        if (q(f11)) {
            int n = n(f11);
            if (p.e(k, t(n))) {
                fVar.n(W(n));
                if (W(n) == v) {
                    return this;
                }
                return M(n, v, fVar);
            }
            fVar.o(fVar.size() + 1);
            return C(n, f11, i11, k, v, i12, fVar.l());
        } else if (r(f11)) {
            int O = O(f11);
            t<K, V> N = N(O);
            if (i12 == 30) {
                tVar = N.w(k, v, fVar);
            } else {
                tVar = N.D(i11, k, v, i12 + 5, fVar);
            }
            if (N == tVar) {
                return this;
            }
            return L(O, tVar, fVar.l());
        } else {
            fVar.o(fVar.size() + 1);
            return B(f11, k, v, fVar.l());
        }
    }

    public final t<K, V> E(t<K, V> tVar, int i11, k0.b bVar, f<K, V> fVar) {
        t tVar2;
        t<K, V> tVar3 = tVar;
        k0.b bVar2 = bVar;
        p.j(tVar3, "otherNode");
        p.j(bVar2, "intersectionCounter");
        p.j(fVar, "mutator");
        if (this == tVar3) {
            bVar2.b(e());
            return this;
        } else if (i11 > 30) {
            return x(tVar3, bVar2, fVar.l());
        } else {
            int i12 = this.f14846b | tVar3.f14846b;
            int i13 = this.f14845a;
            int i14 = tVar3.f14845a;
            int i15 = i13 & i14;
            int i16 = (i13 ^ i14) & (~i12);
            while (i15 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i15);
                if (p.e(t(n(lowestOneBit)), tVar3.t(tVar3.n(lowestOneBit)))) {
                    i16 |= lowestOneBit;
                } else {
                    i12 |= lowestOneBit;
                }
                i15 ^= lowestOneBit;
            }
            int i17 = 0;
            if ((i12 & i16) == 0) {
                if (p.e(this.f14847c, fVar.l()) && this.f14845a == i16 && this.f14846b == i12) {
                    tVar2 = this;
                } else {
                    tVar2 = new t(i16, i12, new Object[((Integer.bitCount(i16) * 2) + Integer.bitCount(i12))]);
                }
                int i18 = i12;
                int i19 = 0;
                while (i18 != 0) {
                    int lowestOneBit2 = Integer.lowestOneBit(i18);
                    Object[] objArr = tVar2.f14848d;
                    objArr[(objArr.length - 1) - i19] = F(tVar, lowestOneBit2, i11, bVar, fVar);
                    i19++;
                    i18 ^= lowestOneBit2;
                }
                while (i16 != 0) {
                    int lowestOneBit3 = Integer.lowestOneBit(i16);
                    int i21 = i17 * 2;
                    if (!tVar3.q(lowestOneBit3)) {
                        int n = n(lowestOneBit3);
                        tVar2.f14848d[i21] = t(n);
                        tVar2.f14848d[i21 + 1] = W(n);
                    } else {
                        int n11 = tVar3.n(lowestOneBit3);
                        tVar2.f14848d[i21] = tVar3.t(n11);
                        tVar2.f14848d[i21 + 1] = tVar3.W(n11);
                        if (q(lowestOneBit3)) {
                            bVar2.c(bVar.a() + 1);
                        }
                    }
                    i17++;
                    i16 ^= lowestOneBit3;
                }
                if (l(tVar2)) {
                    return this;
                }
                return tVar3.l(tVar2) ? tVar3 : tVar2;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final t<K, V> G(int i11, K k, int i12, f<K, V> fVar) {
        t<K, V> tVar;
        p.j(fVar, "mutator");
        int f11 = 1 << x.f(i11, i12);
        if (q(f11)) {
            int n = n(f11);
            return p.e(k, t(n)) ? I(n, f11, fVar) : this;
        } else if (!r(f11)) {
            return this;
        } else {
            int O = O(f11);
            t N = N(O);
            if (i12 == 30) {
                tVar = N.y(k, fVar);
            } else {
                tVar = N.G(i11, k, i12 + 5, fVar);
            }
            return K(N, tVar, O, f11, fVar.l());
        }
    }

    public final t<K, V> H(int i11, K k, V v, int i12, f<K, V> fVar) {
        t<K, V> tVar;
        K k11 = k;
        V v11 = v;
        int i13 = i12;
        f<K, V> fVar2 = fVar;
        p.j(fVar2, "mutator");
        int i14 = i11;
        int f11 = 1 << x.f(i11, i12);
        if (q(f11)) {
            int n = n(f11);
            return (!p.e(k, t(n)) || !p.e(v, W(n))) ? this : I(n, f11, fVar2);
        } else if (!r(f11)) {
            return this;
        } else {
            int O = O(f11);
            t N = N(O);
            if (i13 == 30) {
                tVar = N.z(k, v, fVar2);
            } else {
                tVar = N.H(i11, k, v, i13 + 5, fVar);
            }
            return K(N, tVar, O, f11, fVar.l());
        }
    }

    public final t<K, V> N(int i11) {
        Object obj = this.f14848d[i11];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (t) obj;
    }

    public final int O(int i11) {
        return (this.f14848d.length - 1) - Integer.bitCount((i11 - 1) & this.f14846b);
    }

    public final b<K, V> P(int i11, K k, V v, int i12) {
        b<K, V> bVar;
        int f11 = 1 << x.f(i11, i12);
        if (q(f11)) {
            int n = n(f11);
            if (!p.e(k, t(n))) {
                return v(n, f11, i11, k, v, i12).b();
            }
            if (W(n) == v) {
                return null;
            }
            return V(n, v).c();
        } else if (!r(f11)) {
            return s(f11, k, v).b();
        } else {
            int O = O(f11);
            t N = N(O);
            if (i12 == 30) {
                bVar = N.h(k, v);
                if (bVar == null) {
                    return null;
                }
            } else {
                bVar = N.P(i11, k, v, i12 + 5);
                if (bVar == null) {
                    return null;
                }
            }
            bVar.c(U(O, f11, bVar.a()));
            return bVar;
        }
    }

    public final t<K, V> Q(int i11, K k, int i12) {
        t tVar;
        int f11 = 1 << x.f(i11, i12);
        if (q(f11)) {
            int n = n(f11);
            return p.e(k, t(n)) ? R(n, f11) : this;
        } else if (!r(f11)) {
            return this;
        } else {
            int O = O(f11);
            t N = N(O);
            if (i12 == 30) {
                tVar = N.i(k);
            } else {
                tVar = N.Q(i11, k, i12 + 5);
            }
            return T(N, tVar, O, f11);
        }
    }

    public final boolean k(int i11, K k, int i12) {
        int f11 = 1 << x.f(i11, i12);
        if (q(f11)) {
            return p.e(k, t(n(f11)));
        }
        if (!r(f11)) {
            return false;
        }
        t N = N(O(f11));
        if (i12 == 30) {
            return N.f(k);
        }
        return N.k(i11, k, i12 + 5);
    }

    public final int m() {
        return Integer.bitCount(this.f14845a);
    }

    public final int n(int i11) {
        return Integer.bitCount((i11 - 1) & this.f14845a) * 2;
    }

    public final V o(int i11, K k, int i12) {
        int f11 = 1 << x.f(i11, i12);
        if (q(f11)) {
            int n = n(f11);
            if (p.e(k, t(n))) {
                return W(n);
            }
            return null;
        } else if (!r(f11)) {
            return null;
        } else {
            t N = N(O(f11));
            if (i12 == 30) {
                return N.g(k);
            }
            return N.o(i11, k, i12 + 5);
        }
    }

    public final Object[] p() {
        return this.f14848d;
    }

    public final boolean q(int i11) {
        return (i11 & this.f14845a) != 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public t(int i11, int i12, Object[] objArr) {
        this(i11, i12, objArr, (e) null);
        p.j(objArr, "buffer");
    }
}
