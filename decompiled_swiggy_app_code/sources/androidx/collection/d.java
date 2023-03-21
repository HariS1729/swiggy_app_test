package androidx.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: IndexBasedArrayIterator */
abstract class d<T> implements Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    private int f2372a;

    /* renamed from: b  reason: collision with root package name */
    private int f2373b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2374c;

    d(int i11) {
        this.f2372a = i11;
    }

    /* access modifiers changed from: protected */
    public abstract T a(int i11);

    /* access modifiers changed from: protected */
    public abstract void b(int i11);

    public final boolean hasNext() {
        return this.f2373b < this.f2372a;
    }

    public T next() {
        if (hasNext()) {
            T a11 = a(this.f2373b);
            this.f2373b++;
            this.f2374c = true;
            return a11;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        if (this.f2374c) {
            int i11 = this.f2373b - 1;
            this.f2373b = i11;
            b(i11);
            this.f2372a--;
            this.f2374c = false;
            return;
        }
        throw new IllegalStateException();
    }
}
