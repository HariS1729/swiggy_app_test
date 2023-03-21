package h0;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import g0.d;
import g0.f;
import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: SmallPersistentVector.kt */
public final class h<E> extends AbstractPersistentList<E> implements d<E> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f14762c = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final h f14763d = new h(new Object[0]);

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f14764b;

    /* compiled from: SmallPersistentVector.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final h a() {
            return h.f14763d;
        }
    }

    public h(Object[] objArr) {
        p.j(objArr, "buffer");
        this.f14764b = objArr;
        k0.a.a(objArr.length <= 32);
    }

    private final Object[] g(int i11) {
        return new Object[i11];
    }

    public f<E> C(int i11) {
        k0.d.a(i11, size());
        if (size() == 1) {
            return f14763d;
        }
        Object[] copyOf = Arrays.copyOf(this.f14764b, size() - 1);
        p.i(copyOf, "copyOf(this, newSize)");
        Object[] unused = g.j(this.f14764b, copyOf, i11, i11 + 1, size());
        return new h(copyOf);
    }

    public f<E> add(E e11) {
        if (size() < 32) {
            Object[] copyOf = Arrays.copyOf(this.f14764b, size() + 1);
            p.i(copyOf, "copyOf(this, newSize)");
            copyOf[size()] = e11;
            return new h(copyOf);
        }
        return new d(this.f14764b, j.c(e11), size() + 1, 0);
    }

    public f<E> addAll(Collection<? extends E> collection) {
        p.j(collection, "elements");
        if (size() + collection.size() <= 32) {
            Object[] copyOf = Arrays.copyOf(this.f14764b, size() + collection.size());
            p.i(copyOf, "copyOf(this, newSize)");
            int size = size();
            for (Object obj : collection) {
                copyOf[size] = obj;
                size++;
            }
            return new h(copyOf);
        }
        f.a j = j();
        j.addAll(collection);
        return j.build();
    }

    public int c() {
        return this.f14764b.length;
    }

    public E get(int i11) {
        k0.d.a(i11, size());
        return this.f14764b[i11];
    }

    public int indexOf(Object obj) {
        return ArraysKt___ArraysKt.S(this.f14764b, obj);
    }

    public f.a<E> j() {
        return new PersistentVectorBuilder(this, (Object[]) null, this.f14764b, 0);
    }

    public int lastIndexOf(Object obj) {
        return ArraysKt___ArraysKt.a0(this.f14764b, obj);
    }

    public ListIterator<E> listIterator(int i11) {
        k0.d.b(i11, size());
        return new b(this.f14764b, i11, size());
    }

    public f<E> set(int i11, E e11) {
        k0.d.a(i11, size());
        Object[] objArr = this.f14764b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        p.i(copyOf, "copyOf(this, size)");
        copyOf[i11] = e11;
        return new h(copyOf);
    }

    public f<E> x(l<? super E, Boolean> lVar) {
        p.j(lVar, "predicate");
        Object[] objArr = this.f14764b;
        int size = size();
        int size2 = size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size2; i11++) {
            Object obj = this.f14764b[i11];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z11) {
                    Object[] objArr2 = this.f14764b;
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    p.i(objArr, "copyOf(this, size)");
                    z11 = true;
                    size = i11;
                }
            } else if (z11) {
                objArr[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        if (size == 0) {
            return f14763d;
        }
        return new h(g.q(objArr, 0, size));
    }

    public f<E> add(int i11, E e11) {
        k0.d.b(i11, size());
        if (i11 == size()) {
            return add(e11);
        }
        if (size() < 32) {
            Object[] g11 = g(size() + 1);
            Object[] unused = g.n(this.f14764b, g11, 0, 0, i11, 6, (Object) null);
            Object[] unused2 = g.j(this.f14764b, g11, i11 + 1, i11, size());
            g11[i11] = e11;
            return new h(g11);
        }
        Object[] objArr = this.f14764b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        p.i(copyOf, "copyOf(this, size)");
        Object[] unused3 = g.j(this.f14764b, copyOf, i11 + 1, i11, size() - 1);
        copyOf[i11] = e11;
        return new d(copyOf, j.c(this.f14764b[31]), size() + 1, 0);
    }
}
