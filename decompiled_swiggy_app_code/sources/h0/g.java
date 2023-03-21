package h0;

/* compiled from: AbstractListIterator.kt */
public final class g<E> extends a<E> {

    /* renamed from: c  reason: collision with root package name */
    private final E f14761c;

    public g(E e11, int i11) {
        super(i11, 1);
        this.f14761c = e11;
    }

    public E next() {
        b();
        g(d() + 1);
        return this.f14761c;
    }

    public E previous() {
        c();
        g(d() - 1);
        return this.f14761c;
    }
}
