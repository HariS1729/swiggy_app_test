package h0;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import g0.f;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Objects;
import k0.a;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: PersistentVector.kt */
public final class d<E> extends AbstractPersistentList<E> {

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f14751b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f14752c;

    /* renamed from: d  reason: collision with root package name */
    private final int f14753d;

    /* renamed from: e  reason: collision with root package name */
    private final int f14754e;

    public d(Object[] objArr, Object[] objArr2, int i11, int i12) {
        p.j(objArr, "root");
        p.j(objArr2, "tail");
        this.f14751b = objArr;
        this.f14752c = objArr2;
        this.f14753d = i11;
        this.f14754e = i12;
        boolean z11 = true;
        if (size() > 32) {
            a.a(size() - j.d(size()) > l.i(objArr2.length, 32) ? false : z11);
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + size()).toString());
    }

    private final Object[] f(int i11) {
        if (q() <= i11) {
            return this.f14752c;
        }
        Object[] objArr = this.f14751b;
        for (int i12 = this.f14754e; i12 > 0; i12 -= 5) {
            Object[] objArr2 = objArr[j.a(i11, i12)];
            Objects.requireNonNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] h(Object[] objArr, int i11, int i12, Object obj, c cVar) {
        Object[] objArr2;
        Object[] objArr3 = objArr;
        int i13 = i11;
        int a11 = j.a(i12, i13);
        if (i13 == 0) {
            if (a11 == 0) {
                objArr2 = new Object[32];
            } else {
                objArr2 = Arrays.copyOf(objArr3, 32);
                p.i(objArr2, "copyOf(this, newSize)");
            }
            Object[] unused = g.j(objArr3, objArr2, a11 + 1, a11, 31);
            cVar.b(objArr3[31]);
            objArr2[a11] = obj;
            return objArr2;
        }
        c cVar2 = cVar;
        Object[] copyOf = Arrays.copyOf(objArr3, 32);
        p.i(copyOf, "copyOf(this, newSize)");
        int i14 = i13 - 5;
        Object obj2 = objArr3[a11];
        String str = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        Objects.requireNonNull(obj2, str);
        copyOf[a11] = h((Object[]) obj2, i14, i12, obj, cVar);
        int i15 = a11 + 1;
        while (i15 < 32 && copyOf[i15] != null) {
            Object obj3 = objArr3[i15];
            Objects.requireNonNull(obj3, str);
            Object[] objArr4 = copyOf;
            objArr4[i15] = h((Object[]) obj3, i14, 0, cVar.a(), cVar);
            i15++;
            copyOf = objArr4;
            str = str;
        }
        return copyOf;
    }

    private final d<E> i(Object[] objArr, int i11, Object obj) {
        int size = size() - q();
        Object[] copyOf = Arrays.copyOf(this.f14752c, 32);
        p.i(copyOf, "copyOf(this, newSize)");
        if (size < 32) {
            Object[] unused = g.j(this.f14752c, copyOf, i11 + 1, i11, size);
            copyOf[i11] = obj;
            return new d<>(objArr, copyOf, size() + 1, this.f14754e);
        }
        Object[] objArr2 = this.f14752c;
        Object obj2 = objArr2[31];
        Object[] unused2 = g.j(objArr2, copyOf, i11 + 1, i11, size - 1);
        copyOf[i11] = obj;
        return m(objArr, copyOf, j.c(obj2));
    }

    private final Object[] k(Object[] objArr, int i11, int i12, c cVar) {
        Object[] objArr2;
        int a11 = j.a(i12, i11);
        if (i11 == 5) {
            cVar.b(objArr[a11]);
            objArr2 = null;
        } else {
            Object[] objArr3 = objArr[a11];
            Objects.requireNonNull(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = k(objArr3, i11 - 5, i12, cVar);
        }
        if (objArr2 == null && a11 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        p.i(copyOf, "copyOf(this, newSize)");
        copyOf[a11] = objArr2;
        return copyOf;
    }

    private final f<E> l(Object[] objArr, int i11, int i12) {
        if (i12 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                p.i(objArr, "copyOf(this, newSize)");
            }
            return new h(objArr);
        }
        c cVar = new c((Object) null);
        Object[] k = k(objArr, i12, i11 - 1, cVar);
        p.g(k);
        Object a11 = cVar.a();
        Objects.requireNonNull(a11, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) a11;
        if (k[1] != null) {
            return new d(k, objArr2, i11, i12);
        }
        Object obj = k[0];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new d((Object[]) obj, objArr2, i11, i12 - 5);
    }

    private final d<E> m(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i11 = this.f14754e;
        if (size <= (1 << i11)) {
            return new d<>(n(objArr, i11, objArr2), objArr3, size() + 1, this.f14754e);
        }
        Object[] c11 = j.c(objArr);
        int i12 = this.f14754e + 5;
        return new d<>(n(c11, i12, objArr2), objArr3, size() + 1, i12);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r4 == null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object[] n(java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + -1
            int r0 = h0.j.a(r0, r5)
            r1 = 32
            if (r4 == 0) goto L_0x0019
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = "copyOf(this, newSize)"
            kotlin.jvm.internal.p.i(r4, r2)
            if (r4 != 0) goto L_0x001b
        L_0x0019:
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L_0x001b:
            r1 = 5
            if (r5 != r1) goto L_0x0021
            r4[r0] = r6
            goto L_0x002c
        L_0x0021:
            r2 = r4[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r5 = r5 - r1
            java.lang.Object[] r5 = r3.n(r2, r5, r6)
            r4[r0] = r5
        L_0x002c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.d.n(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    private final Object[] o(Object[] objArr, int i11, int i12, c cVar) {
        Object[] objArr2;
        int a11 = j.a(i12, i11);
        int i13 = 31;
        if (i11 == 0) {
            if (a11 == 0) {
                objArr2 = new Object[32];
            } else {
                objArr2 = Arrays.copyOf(objArr, 32);
                p.i(objArr2, "copyOf(this, newSize)");
            }
            Object[] unused = g.j(objArr, objArr2, a11, a11 + 1, 32);
            objArr2[31] = cVar.a();
            cVar.b(objArr[a11]);
            return objArr2;
        }
        if (objArr[31] == null) {
            i13 = j.a(q() - 1, i11);
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        p.i(copyOf, "copyOf(this, newSize)");
        int i14 = i11 - 5;
        int i15 = a11 + 1;
        if (i15 <= i13) {
            while (true) {
                Object obj = copyOf[i13];
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf[i13] = o((Object[]) obj, i14, 0, cVar);
                if (i13 == i15) {
                    break;
                }
                i13--;
            }
        }
        Object obj2 = copyOf[a11];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf[a11] = o((Object[]) obj2, i14, i12, cVar);
        return copyOf;
    }

    private final f<E> p(Object[] objArr, int i11, int i12, int i13) {
        int size = size() - i11;
        a.a(i13 < size);
        if (size == 1) {
            return l(objArr, i11, i12);
        }
        Object[] copyOf = Arrays.copyOf(this.f14752c, 32);
        p.i(copyOf, "copyOf(this, newSize)");
        int i14 = size - 1;
        if (i13 < i14) {
            Object[] unused = g.j(this.f14752c, copyOf, i13, i13 + 1, size);
        }
        copyOf[i14] = null;
        return new d(objArr, copyOf, (i11 + size) - 1, i12);
    }

    private final int q() {
        return j.d(size());
    }

    private final Object[] r(Object[] objArr, int i11, int i12, Object obj) {
        int a11 = j.a(i12, i11);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        p.i(copyOf, "copyOf(this, newSize)");
        if (i11 == 0) {
            copyOf[a11] = obj;
        } else {
            Object obj2 = copyOf[a11];
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[a11] = r((Object[]) obj2, i11 - 5, i12, obj);
        }
        return copyOf;
    }

    public f<E> C(int i11) {
        k0.d.a(i11, size());
        int q = q();
        if (i11 >= q) {
            return p(this.f14751b, q, this.f14754e, i11 - q);
        }
        return p(o(this.f14751b, this.f14754e, i11, new c(this.f14752c[0])), q, this.f14754e, 0);
    }

    public f<E> add(E e11) {
        int size = size() - q();
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(this.f14752c, 32);
            p.i(copyOf, "copyOf(this, newSize)");
            copyOf[size] = e11;
            return new d(this.f14751b, copyOf, size() + 1, this.f14754e);
        }
        return m(this.f14751b, this.f14752c, j.c(e11));
    }

    public int c() {
        return this.f14753d;
    }

    /* renamed from: g */
    public PersistentVectorBuilder<E> j() {
        return new PersistentVectorBuilder<>(this, this.f14751b, this.f14752c, this.f14754e);
    }

    public E get(int i11) {
        k0.d.a(i11, size());
        return f(i11)[i11 & 31];
    }

    public ListIterator<E> listIterator(int i11) {
        k0.d.b(i11, size());
        return new e(this.f14751b, this.f14752c, i11, size(), (this.f14754e / 5) + 1);
    }

    public f<E> set(int i11, E e11) {
        k0.d.a(i11, size());
        if (q() > i11) {
            return new d(r(this.f14751b, this.f14754e, i11, e11), this.f14752c, size(), this.f14754e);
        }
        Object[] copyOf = Arrays.copyOf(this.f14752c, 32);
        p.i(copyOf, "copyOf(this, newSize)");
        copyOf[i11 & 31] = e11;
        return new d(this.f14751b, copyOf, size(), this.f14754e);
    }

    public f<E> x(l<? super E, Boolean> lVar) {
        p.j(lVar, "predicate");
        PersistentVectorBuilder g11 = j();
        g11.P(lVar);
        return g11.build();
    }

    public f<E> add(int i11, E e11) {
        k0.d.b(i11, size());
        if (i11 == size()) {
            return add(e11);
        }
        int q = q();
        if (i11 >= q) {
            return i(this.f14751b, i11 - q, e11);
        }
        c cVar = new c((Object) null);
        return i(h(this.f14751b, this.f14754e, i11, e11, cVar), 0, cVar.a());
    }
}
