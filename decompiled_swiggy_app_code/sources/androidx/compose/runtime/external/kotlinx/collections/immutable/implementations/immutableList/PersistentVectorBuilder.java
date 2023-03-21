package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import cp0.c;
import g0.f;
import h0.g;
import h0.h;
import h0.i;
import h0.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;
import k0.a;
import k0.d;
import k0.e;
import kotlin.jvm.internal.b;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: PersistentVectorBuilder.kt */
public final class PersistentVectorBuilder<E> extends c<E> implements f.a<E> {

    /* renamed from: a  reason: collision with root package name */
    private f<? extends E> f6130a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f6131b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f6132c;

    /* renamed from: d  reason: collision with root package name */
    private int f6133d;

    /* renamed from: e  reason: collision with root package name */
    private e f6134e = new e();

    /* renamed from: f  reason: collision with root package name */
    private Object[] f6135f = this.f6131b;

    /* renamed from: g  reason: collision with root package name */
    private Object[] f6136g = this.f6132c;

    /* renamed from: h  reason: collision with root package name */
    private int f6137h = this.f6130a.size();

    public PersistentVectorBuilder(f<? extends E> fVar, Object[] objArr, Object[] objArr2, int i11) {
        p.j(fVar, "vector");
        p.j(objArr2, "vectorTail");
        this.f6130a = fVar;
        this.f6131b = objArr;
        this.f6132c = objArr2;
        this.f6133d = i11;
    }

    private final Object[] D(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f6134e;
        return objArr;
    }

    private final Object[] E(Object[] objArr, int i11, int i12) {
        if (!(i12 >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (i12 == 0) {
            return objArr;
        } else {
            int a11 = j.a(i11, i12);
            Object[] objArr2 = objArr[a11];
            Objects.requireNonNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object E = E(objArr2, i11, i12 - 5);
            if (a11 < 31) {
                int i13 = a11 + 1;
                if (objArr[i13] != null) {
                    if (q(objArr)) {
                        g.t(objArr, null, i13, 32);
                    }
                    objArr = g.j(objArr, v(), 0, 0, i13);
                }
            }
            if (E == objArr[a11]) {
                return objArr;
            }
            Object[] s11 = s(objArr);
            s11[a11] = E;
            return s11;
        }
    }

    private final Object[] F(Object[] objArr, int i11, int i12, h0.c cVar) {
        Object[] objArr2;
        int a11 = j.a(i12 - 1, i11);
        if (i11 == 5) {
            cVar.b(objArr[a11]);
            objArr2 = null;
        } else {
            Object[] objArr3 = objArr[a11];
            Objects.requireNonNull(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = F(objArr3, i11 - 5, i12, cVar);
        }
        if (objArr2 == null && a11 == 0) {
            return null;
        }
        Object[] s11 = s(objArr);
        s11[a11] = objArr2;
        return s11;
    }

    private final void G(Object[] objArr, int i11, int i12) {
        if (i12 == 0) {
            this.f6135f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f6136g = objArr;
            this.f6137h = i11;
            this.f6133d = i12;
            return;
        }
        h0.c cVar = new h0.c((Object) null);
        p.g(objArr);
        Object[] F = F(objArr, i12, i11, cVar);
        p.g(F);
        Object a11 = cVar.a();
        Objects.requireNonNull(a11, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f6136g = (Object[]) a11;
        this.f6137h = i11;
        if (F[1] == null) {
            this.f6135f = (Object[]) F[0];
            this.f6133d = i12 - 5;
            return;
        }
        this.f6135f = F;
        this.f6133d = i12;
    }

    private final Object[] H(Object[] objArr, int i11, int i12, Iterator<Object[]> it2) {
        if (it2.hasNext()) {
            if (!(i12 >= 0)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (i12 == 0) {
                return it2.next();
            } else {
                Object[] s11 = s(objArr);
                int a11 = j.a(i11, i12);
                int i13 = i12 - 5;
                s11[a11] = H((Object[]) s11[a11], i11, i13, it2);
                while (true) {
                    a11++;
                    if (a11 >= 32 || !it2.hasNext()) {
                        return s11;
                    }
                    s11[a11] = H((Object[]) s11[a11], 0, i13, it2);
                }
                return s11;
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    private final Object[] I(Object[] objArr, int i11, Object[][] objArr2) {
        Object[] objArr3;
        Iterator a11 = b.a(objArr2);
        int i12 = i11 >> 5;
        int i13 = this.f6133d;
        if (i12 < (1 << i13)) {
            objArr3 = H(objArr, i11, i13, a11);
        } else {
            objArr3 = s(objArr);
        }
        while (a11.hasNext()) {
            this.f6133d += 5;
            objArr3 = D(objArr3);
            int i14 = this.f6133d;
            H(objArr3, 1 << i14, i14, a11);
        }
        return objArr3;
    }

    private final void J(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i11 = this.f6133d;
        if (size > (1 << i11)) {
            this.f6135f = K(D(objArr), objArr2, this.f6133d + 5);
            this.f6136g = objArr3;
            this.f6133d += 5;
            this.f6137h = size() + 1;
        } else if (objArr == null) {
            this.f6135f = objArr2;
            this.f6136g = objArr3;
            this.f6137h = size() + 1;
        } else {
            this.f6135f = K(objArr, objArr2, i11);
            this.f6136g = objArr3;
            this.f6137h = size() + 1;
        }
    }

    private final Object[] K(Object[] objArr, Object[] objArr2, int i11) {
        int a11 = j.a(size() - 1, i11);
        Object[] s11 = s(objArr);
        if (i11 == 5) {
            s11[a11] = objArr2;
        } else {
            s11[a11] = K((Object[]) s11[a11], objArr2, i11 - 5);
        }
        return s11;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int L(lp0.l<? super E, java.lang.Boolean> r7, java.lang.Object[] r8, int r9, int r10, h0.c r11, java.util.List<java.lang.Object[]> r12, java.util.List<java.lang.Object[]> r13) {
        /*
            r6 = this;
            boolean r0 = r6.q(r8)
            if (r0 == 0) goto L_0x0009
            r12.add(r8)
        L_0x0009:
            java.lang.Object r0 = r11.a()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            java.util.Objects.requireNonNull(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = 0
            r3 = r0
            r2 = 0
        L_0x0017:
            if (r2 >= r9) goto L_0x004e
            r4 = r8[r2]
            java.lang.Object r5 = r7.invoke(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x004b
            r5 = 32
            if (r10 != r5) goto L_0x0046
            boolean r10 = r12.isEmpty()
            r10 = r10 ^ 1
            if (r10 == 0) goto L_0x0040
            int r10 = r12.size()
            int r10 = r10 + -1
            java.lang.Object r10 = r12.remove(r10)
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            goto L_0x0044
        L_0x0040:
            java.lang.Object[] r10 = r6.v()
        L_0x0044:
            r3 = r10
            r10 = 0
        L_0x0046:
            int r5 = r10 + 1
            r3[r10] = r4
            r10 = r5
        L_0x004b:
            int r2 = r2 + 1
            goto L_0x0017
        L_0x004e:
            r11.b(r3)
            java.lang.Object r7 = r11.a()
            if (r0 == r7) goto L_0x005a
            r13.add(r0)
        L_0x005a:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder.L(lp0.l, java.lang.Object[], int, int, h0.c, java.util.List, java.util.List):int");
    }

    private final int M(l<? super E, Boolean> lVar, Object[] objArr, int i11, h0.c cVar) {
        Object[] objArr2 = objArr;
        int i12 = i11;
        boolean z11 = false;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z11) {
                    objArr2 = s(objArr);
                    z11 = true;
                    i12 = i13;
                }
            } else if (z11) {
                objArr2[i12] = obj;
                i12++;
            }
        }
        cVar.b(objArr2);
        return i12;
    }

    private final boolean N(l<? super E, Boolean> lVar) {
        Object[] objArr;
        l<? super E, Boolean> lVar2 = lVar;
        int X = X();
        h0.c cVar = new h0.c((Object) null);
        if (this.f6135f != null) {
            ListIterator<Object[]> r11 = r(0);
            int i11 = 32;
            while (i11 == 32 && r11.hasNext()) {
                i11 = M(lVar2, r11.next(), 32, cVar);
            }
            if (i11 == 32) {
                a.a(!r11.hasNext());
                int O = O(lVar2, X, cVar);
                if (O == 0) {
                    G(this.f6135f, size(), this.f6133d);
                }
                if (O != X) {
                    return true;
                }
                return false;
            }
            int previousIndex = r11.previousIndex() << 5;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i12 = i11;
            while (r11.hasNext()) {
                i12 = L(lVar, r11.next(), 32, i12, cVar, arrayList2, arrayList);
                previousIndex = previousIndex;
            }
            int i13 = previousIndex;
            int L = L(lVar, this.f6136g, X, i12, cVar, arrayList2, arrayList);
            Object a11 = cVar.a();
            Objects.requireNonNull(a11, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object[] objArr2 = (Object[]) a11;
            g.t(objArr2, null, L, 32);
            if (arrayList.isEmpty()) {
                objArr = this.f6135f;
                p.g(objArr);
            } else {
                objArr = H(this.f6135f, i13, this.f6133d, arrayList.iterator());
            }
            int size = i13 + (arrayList.size() << 5);
            this.f6135f = S(objArr, size);
            this.f6136g = objArr2;
            this.f6137h = size + L;
            return true;
        } else if (O(lVar2, X, cVar) != X) {
            return true;
        } else {
            return false;
        }
    }

    private final int O(l<? super E, Boolean> lVar, int i11, h0.c cVar) {
        int M = M(lVar, this.f6136g, i11, cVar);
        if (M == i11) {
            a.a(cVar.a() == this.f6136g);
            return i11;
        }
        Object a11 = cVar.a();
        Objects.requireNonNull(a11, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) a11;
        g.t(objArr, null, M, i11);
        this.f6136g = objArr;
        this.f6137h = size() - (i11 - M);
        return M;
    }

    private final Object[] Q(Object[] objArr, int i11, int i12, h0.c cVar) {
        int a11 = j.a(i12, i11);
        int i13 = 31;
        if (i11 == 0) {
            Object obj = objArr[a11];
            Object[] j = g.j(objArr, s(objArr), a11, a11 + 1, 32);
            j[31] = cVar.a();
            cVar.b(obj);
            return j;
        }
        if (objArr[31] == null) {
            i13 = j.a(T() - 1, i11);
        }
        Object[] s11 = s(objArr);
        int i14 = i11 - 5;
        int i15 = a11 + 1;
        if (i15 <= i13) {
            while (true) {
                Object obj2 = s11[i13];
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                s11[i13] = Q((Object[]) obj2, i14, 0, cVar);
                if (i13 == i15) {
                    break;
                }
                i13--;
            }
        }
        Object obj3 = s11[a11];
        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        s11[a11] = Q((Object[]) obj3, i14, i12, cVar);
        return s11;
    }

    private final Object R(Object[] objArr, int i11, int i12, int i13) {
        int size = size() - i11;
        a.a(i13 < size);
        if (size == 1) {
            Object obj = this.f6136g[0];
            G(objArr, i11, i12);
            return obj;
        }
        Object[] objArr2 = this.f6136g;
        Object obj2 = objArr2[i13];
        Object[] j = g.j(objArr2, s(objArr2), i13, i13 + 1, size);
        j[size - 1] = null;
        this.f6135f = objArr;
        this.f6136g = j;
        this.f6137h = (i11 + size) - 1;
        this.f6133d = i12;
        return obj2;
    }

    private final Object[] S(Object[] objArr, int i11) {
        if (!((i11 & 31) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (i11 == 0) {
            this.f6133d = 0;
            return null;
        } else {
            int i12 = i11 - 1;
            while (true) {
                int i13 = this.f6133d;
                if ((i12 >> i13) != 0) {
                    return E(objArr, i12, i13);
                }
                this.f6133d = i13 - 5;
                Object[] objArr2 = objArr[0];
                Objects.requireNonNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = objArr2;
            }
        }
    }

    private final int T() {
        if (size() <= 32) {
            return 0;
        }
        return j.d(size());
    }

    private final Object[] U(Object[] objArr, int i11, int i12, E e11, h0.c cVar) {
        int a11 = j.a(i12, i11);
        Object[] s11 = s(objArr);
        if (i11 == 0) {
            if (s11 != objArr) {
                this.modCount++;
            }
            cVar.b(s11[a11]);
            s11[a11] = e11;
            return s11;
        }
        Object obj = s11[a11];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        s11[a11] = U((Object[]) obj, i11 - 5, i12, e11, cVar);
        return s11;
    }

    private final Object[] V(int i11, int i12, Object[][] objArr, int i13, Object[] objArr2) {
        if (this.f6135f != null) {
            ListIterator<Object[]> r11 = r(T() >> 5);
            while (r11.previousIndex() != i11) {
                Object[] previous = r11.previous();
                Object[] unused = g.j(previous, objArr2, 0, 32 - i12, 32);
                objArr2 = t(previous, i12);
                i13--;
                objArr[i13] = objArr2;
            }
            return r11.previous();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    private final void W(Collection<? extends E> collection, int i11, Object[] objArr, int i12, Object[][] objArr2, int i13, Object[] objArr3) {
        Object[] objArr4;
        if (i13 >= 1) {
            Object[] s11 = s(objArr);
            objArr2[0] = s11;
            int i14 = i11 & 31;
            int size = ((i11 + collection.size()) - 1) & 31;
            int i15 = (i12 - i14) + size;
            if (i15 < 32) {
                Object[] unused = g.j(s11, objArr3, size + 1, i14, i12);
            } else {
                int i16 = (i15 - 32) + 1;
                if (i13 == 1) {
                    objArr4 = s11;
                } else {
                    objArr4 = v();
                    i13--;
                    objArr2[i13] = objArr4;
                }
                int i17 = i12 - i16;
                Object[] unused2 = g.j(s11, objArr3, 0, i17, i12);
                Object[] unused3 = g.j(s11, objArr4, size + 1, i14, i17);
                objArr3 = objArr4;
            }
            Iterator<? extends E> it2 = collection.iterator();
            h(s11, i14, it2);
            for (int i18 = 1; i18 < i13; i18++) {
                objArr2[i18] = h(v(), 0, it2);
            }
            h(objArr3, 0, it2);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final int X() {
        return Y(size());
    }

    private final int Y(int i11) {
        return i11 <= 32 ? i11 : i11 - j.d(i11);
    }

    private final Object[] g(int i11) {
        if (T() <= i11) {
            return this.f6136g;
        }
        Object[] objArr = this.f6135f;
        p.g(objArr);
        for (int i12 = this.f6133d; i12 > 0; i12 -= 5) {
            Object[] objArr2 = objArr[j.a(i11, i12)];
            Objects.requireNonNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] h(Object[] objArr, int i11, Iterator<? extends Object> it2) {
        while (i11 < 32 && it2.hasNext()) {
            objArr[i11] = it2.next();
            i11++;
        }
        return objArr;
    }

    private final void n(Collection<? extends E> collection, int i11, int i12, Object[][] objArr, int i13, Object[] objArr2) {
        if (this.f6135f != null) {
            int i14 = i11 >> 5;
            Object[] V = V(i14, i12, objArr, i13, objArr2);
            int T = i13 - (((T() >> 5) - 1) - i14);
            if (T < i13) {
                objArr2 = objArr[T];
                p.g(objArr2);
            }
            W(collection, i11, V, 32, objArr, T, objArr2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    private final Object[] o(Object[] objArr, int i11, int i12, Object obj, h0.c cVar) {
        int a11 = j.a(i12, i11);
        if (i11 == 0) {
            cVar.b(objArr[31]);
            Object[] j = g.j(objArr, s(objArr), a11 + 1, a11, 31);
            j[a11] = obj;
            return j;
        }
        Object[] s11 = s(objArr);
        int i13 = i11 - 5;
        Object obj2 = s11[a11];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        s11[a11] = o((Object[]) obj2, i13, i12, obj, cVar);
        while (true) {
            a11++;
            if (a11 >= 32 || s11[a11] == null) {
                return s11;
            }
            Object obj3 = s11[a11];
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            s11[a11] = o((Object[]) obj3, i13, 0, cVar.a(), cVar);
        }
        return s11;
    }

    private final void p(Object[] objArr, int i11, E e11) {
        int X = X();
        Object[] s11 = s(this.f6136g);
        if (X < 32) {
            Object[] unused = g.j(this.f6136g, s11, i11 + 1, i11, X);
            s11[i11] = e11;
            this.f6135f = objArr;
            this.f6136g = s11;
            this.f6137h = size() + 1;
            return;
        }
        Object[] objArr2 = this.f6136g;
        Object obj = objArr2[31];
        Object[] unused2 = g.j(objArr2, s11, i11 + 1, i11, 31);
        s11[i11] = e11;
        J(objArr, s11, D(obj));
    }

    private final boolean q(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f6134e;
    }

    private final ListIterator<Object[]> r(int i11) {
        if (this.f6135f != null) {
            int T = T() >> 5;
            d.b(i11, T);
            int i12 = this.f6133d;
            if (i12 == 0) {
                Object[] objArr = this.f6135f;
                p.g(objArr);
                return new g(objArr, i11);
            }
            Object[] objArr2 = this.f6135f;
            p.g(objArr2);
            return new i(objArr2, i11, T, i12 / 5);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    private final Object[] s(Object[] objArr) {
        if (objArr == null) {
            return v();
        }
        if (q(objArr)) {
            return objArr;
        }
        return g.n(objArr, v(), 0, 0, l.i(objArr.length, 32), 6, (Object) null);
    }

    private final Object[] t(Object[] objArr, int i11) {
        if (q(objArr)) {
            return g.j(objArr, objArr, i11, 0, 32 - i11);
        }
        return g.j(objArr, v(), i11, 0, 32 - i11);
    }

    private final Object[] v() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f6134e;
        return objArr;
    }

    public final boolean P(l<? super E, Boolean> lVar) {
        p.j(lVar, "predicate");
        boolean N = N(lVar);
        if (N) {
            this.modCount++;
        }
        return N;
    }

    public boolean add(E e11) {
        this.modCount++;
        int X = X();
        if (X < 32) {
            Object[] s11 = s(this.f6136g);
            s11[X] = e11;
            this.f6136g = s11;
            this.f6137h = size() + 1;
        } else {
            J(this.f6135f, this.f6136g, D(e11));
        }
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        p.j(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int X = X();
        Iterator<? extends E> it2 = collection.iterator();
        if (32 - X >= collection.size()) {
            this.f6136g = h(s(this.f6136g), X, it2);
            this.f6137h = size() + collection.size();
        } else {
            int size = ((collection.size() + X) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = h(s(this.f6136g), X, it2);
            for (int i11 = 1; i11 < size; i11++) {
                objArr[i11] = h(v(), 0, it2);
            }
            this.f6135f = I(this.f6135f, T(), objArr);
            this.f6136g = h(v(), 0, it2);
            this.f6137h = size() + collection.size();
        }
        return true;
    }

    public f<E> build() {
        f<? extends E> fVar;
        if (this.f6135f == this.f6131b && this.f6136g == this.f6132c) {
            fVar = this.f6130a;
        } else {
            this.f6134e = new e();
            Object[] objArr = this.f6135f;
            this.f6131b = objArr;
            Object[] objArr2 = this.f6136g;
            this.f6132c = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    fVar = j.b();
                } else {
                    Object[] copyOf = Arrays.copyOf(this.f6136g, size());
                    p.i(copyOf, "copyOf(this, newSize)");
                    fVar = new h<>(copyOf);
                }
            } else {
                Object[] objArr3 = this.f6135f;
                p.g(objArr3);
                fVar = new h0.d<>(objArr3, this.f6136g, size(), this.f6133d);
            }
        }
        this.f6130a = fVar;
        return fVar;
    }

    public int c() {
        return this.f6137h;
    }

    public E d(int i11) {
        d.a(i11, size());
        this.modCount++;
        int T = T();
        if (i11 >= T) {
            return R(this.f6135f, T, this.f6133d, i11 - T);
        }
        h0.c cVar = new h0.c(this.f6136g[0]);
        Object[] objArr = this.f6135f;
        p.g(objArr);
        R(Q(objArr, this.f6133d, i11, cVar), T, this.f6133d, 0);
        return cVar.a();
    }

    public E get(int i11) {
        d.a(i11, size());
        return g(i11)[i11 & 31];
    }

    public final int i() {
        return this.modCount;
    }

    public Iterator<E> iterator() {
        return listIterator();
    }

    public final Object[] k() {
        return this.f6135f;
    }

    public final int l() {
        return this.f6133d;
    }

    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public final Object[] m() {
        return this.f6136g;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        p.j(collection, "elements");
        return P(new PersistentVectorBuilder$removeAll$1(collection));
    }

    public E set(int i11, E e11) {
        d.a(i11, size());
        if (T() <= i11) {
            E[] s11 = s(this.f6136g);
            if (s11 != this.f6136g) {
                this.modCount++;
            }
            int i12 = i11 & 31;
            E e12 = s11[i12];
            s11[i12] = e11;
            this.f6136g = s11;
            return e12;
        }
        h0.c cVar = new h0.c((Object) null);
        Object[] objArr = this.f6135f;
        p.g(objArr);
        this.f6135f = U(objArr, this.f6133d, i11, e11, cVar);
        return cVar.a();
    }

    public ListIterator<E> listIterator(int i11) {
        d.b(i11, size());
        return new h0.f(this, i11);
    }

    public void add(int i11, E e11) {
        d.b(i11, size());
        if (i11 == size()) {
            add(e11);
            return;
        }
        this.modCount++;
        int T = T();
        if (i11 >= T) {
            p(this.f6135f, i11 - T, e11);
            return;
        }
        h0.c cVar = new h0.c((Object) null);
        Object[] objArr = this.f6135f;
        p.g(objArr);
        p(o(objArr, this.f6133d, i11, e11, cVar), 0, cVar.a());
    }

    public boolean addAll(int i11, Collection<? extends E> collection) {
        Object[] objArr;
        p.j(collection, "elements");
        d.b(i11, size());
        if (i11 == size()) {
            return addAll(collection);
        }
        boolean z11 = false;
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int i12 = (i11 >> 5) << 5;
        int size = (((size() - i12) + collection.size()) - 1) / 32;
        if (size == 0) {
            if (i11 >= T()) {
                z11 = true;
            }
            a.a(z11);
            int i13 = i11 & 31;
            Object[] objArr2 = this.f6136g;
            Object[] j = g.j(objArr2, s(objArr2), (((i11 + collection.size()) - 1) & 31) + 1, i13, X());
            h(j, i13, collection.iterator());
            this.f6136g = j;
            this.f6137h = size() + collection.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int X = X();
        int Y = Y(size() + collection.size());
        if (i11 >= T()) {
            objArr = v();
            W(collection, i11, this.f6136g, X, objArr3, size, objArr);
        } else if (Y > X) {
            int i14 = Y - X;
            objArr = t(this.f6136g, i14);
            n(collection, i11, i14, objArr3, size, objArr);
        } else {
            int i15 = X - Y;
            objArr = g.j(this.f6136g, v(), 0, i15, X);
            int i16 = 32 - i15;
            Object[] t = t(this.f6136g, i16);
            int i17 = size - 1;
            objArr3[i17] = t;
            n(collection, i11, i16, objArr3, i17, t);
        }
        this.f6135f = I(this.f6135f, i12, objArr3);
        this.f6136g = objArr;
        this.f6137h = size() + collection.size();
        return true;
    }
}
