package h0;

import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.jvm.internal.p;

/* compiled from: TrieIterator.kt */
public final class i<E> extends a<E> {

    /* renamed from: c  reason: collision with root package name */
    private int f14765c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f14766d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14767e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(Object[] objArr, int i11, int i12, int i13) {
        super(i11, i12);
        p.j(objArr, "root");
        this.f14765c = i13;
        Object[] objArr2 = new Object[i13];
        this.f14766d = objArr2;
        boolean z11 = i11 == i12;
        this.f14767e = z11;
        objArr2[0] = objArr;
        k(i11 - (z11 ? 1 : 0), 1);
    }

    private final E i() {
        Object obj = this.f14766d[this.f14765c - 1];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[d() & 31];
    }

    private final void k(int i11, int i12) {
        int i13 = (this.f14765c - i12) * 5;
        while (i12 < this.f14765c) {
            Object[] objArr = this.f14766d;
            Object[] objArr2 = objArr[i12 - 1];
            Objects.requireNonNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i12] = objArr2[j.a(i11, i13)];
            i13 -= 5;
            i12++;
        }
    }

    private final void l(int i11) {
        int i12 = 0;
        while (j.a(d(), i12) == i11) {
            i12 += 5;
        }
        if (i12 > 0) {
            k(d(), ((this.f14765c - 1) - (i12 / 5)) + 1);
        }
    }

    public final void m(Object[] objArr, int i11, int i12, int i13) {
        p.j(objArr, "root");
        g(i11);
        h(i12);
        this.f14765c = i13;
        if (this.f14766d.length < i13) {
            this.f14766d = new Object[i13];
        }
        boolean z11 = false;
        this.f14766d[0] = objArr;
        if (i11 == i12) {
            z11 = true;
        }
        this.f14767e = z11;
        k(i11 - (z11 ? 1 : 0), 1);
    }

    public E next() {
        if (hasNext()) {
            E i11 = i();
            g(d() + 1);
            if (d() == f()) {
                this.f14767e = true;
                return i11;
            }
            l(0);
            return i11;
        }
        throw new NoSuchElementException();
    }

    public E previous() {
        if (hasPrevious()) {
            g(d() - 1);
            if (this.f14767e) {
                this.f14767e = false;
                return i();
            }
            l(31);
            return i();
        }
        throw new NoSuchElementException();
    }
}
