package h0;

import kotlin.jvm.internal.p;

/* compiled from: PersistentVectorIterator.kt */
public final class e<T> extends a<T> {

    /* renamed from: c  reason: collision with root package name */
    private final T[] f14755c;

    /* renamed from: d  reason: collision with root package name */
    private final i<T> f14756d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Object[] objArr, T[] tArr, int i11, int i12, int i13) {
        super(i11, i12);
        p.j(objArr, "root");
        p.j(tArr, "tail");
        this.f14755c = tArr;
        int d11 = j.d(i12);
        this.f14756d = new i<>(objArr, l.i(i11, d11), d11, i13);
    }

    public T next() {
        b();
        if (this.f14756d.hasNext()) {
            g(d() + 1);
            return this.f14756d.next();
        }
        T[] tArr = this.f14755c;
        int d11 = d();
        g(d11 + 1);
        return tArr[d11 - this.f14756d.f()];
    }

    public T previous() {
        c();
        if (d() > this.f14756d.f()) {
            T[] tArr = this.f14755c;
            g(d() - 1);
            return tArr[d() - this.f14756d.f()];
        }
        g(d() - 1);
        return this.f14756d.previous();
    }
}
