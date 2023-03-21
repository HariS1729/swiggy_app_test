package h0;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: AbstractListIterator.kt */
public abstract class a<E> implements ListIterator<E>, mp0.a {

    /* renamed from: a  reason: collision with root package name */
    private int f14747a;

    /* renamed from: b  reason: collision with root package name */
    private int f14748b;

    public a(int i11, int i12) {
        this.f14747a = i11;
        this.f14748b = i12;
    }

    public void add(E e11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void c() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    public final int d() {
        return this.f14747a;
    }

    public final int f() {
        return this.f14748b;
    }

    public final void g(int i11) {
        this.f14747a = i11;
    }

    public final void h(int i11) {
        this.f14748b = i11;
    }

    public boolean hasNext() {
        return this.f14747a < this.f14748b;
    }

    public boolean hasPrevious() {
        return this.f14747a > 0;
    }

    public int nextIndex() {
        return this.f14747a;
    }

    public int previousIndex() {
        return this.f14747a - 1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void set(E e11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
