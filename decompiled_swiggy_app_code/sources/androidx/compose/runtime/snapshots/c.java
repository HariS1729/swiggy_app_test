package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.p;
import mp0.a;
import n0.m;

/* compiled from: SnapshotStateList.kt */
final class c<T> implements ListIterator<T>, a {

    /* renamed from: a  reason: collision with root package name */
    private final SnapshotStateList<T> f6295a;

    /* renamed from: b  reason: collision with root package name */
    private int f6296b;

    /* renamed from: c  reason: collision with root package name */
    private int f6297c;

    public c(SnapshotStateList<T> snapshotStateList, int i11) {
        p.j(snapshotStateList, "list");
        this.f6295a = snapshotStateList;
        this.f6296b = i11 - 1;
        this.f6297c = snapshotStateList.c();
    }

    private final void b() {
        if (this.f6295a.c() != this.f6297c) {
            throw new ConcurrentModificationException();
        }
    }

    public void add(T t) {
        b();
        this.f6295a.add(this.f6296b + 1, t);
        this.f6296b++;
        this.f6297c = this.f6295a.c();
    }

    public boolean hasNext() {
        return this.f6296b < this.f6295a.size() - 1;
    }

    public boolean hasPrevious() {
        return this.f6296b >= 0;
    }

    public T next() {
        b();
        int i11 = this.f6296b + 1;
        m.e(i11, this.f6295a.size());
        T t = this.f6295a.get(i11);
        this.f6296b = i11;
        return t;
    }

    public int nextIndex() {
        return this.f6296b + 1;
    }

    public T previous() {
        b();
        m.e(this.f6296b, this.f6295a.size());
        this.f6296b--;
        return this.f6295a.get(this.f6296b);
    }

    public int previousIndex() {
        return this.f6296b;
    }

    public void remove() {
        b();
        this.f6295a.remove(this.f6296b);
        this.f6296b--;
        this.f6297c = this.f6295a.c();
    }

    public void set(T t) {
        b();
        this.f6295a.set(this.f6296b, t);
        this.f6297c = this.f6295a.c();
    }
}
