package e0;

import java.util.ArrayList;

/* compiled from: Stack.kt */
public final class c1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<T> f14168a = new ArrayList<>();

    public final void a() {
        this.f14168a.clear();
    }

    public final int b() {
        return this.f14168a.size();
    }

    public final boolean c() {
        return this.f14168a.isEmpty();
    }

    public final boolean d() {
        return !c();
    }

    public final T e() {
        return this.f14168a.get(b() - 1);
    }

    public final T f(int i11) {
        return this.f14168a.get(i11);
    }

    public final T g() {
        return this.f14168a.remove(b() - 1);
    }

    public final boolean h(T t) {
        return this.f14168a.add(t);
    }

    public final T[] i() {
        int size = this.f14168a.size();
        T[] tArr = new Object[size];
        for (int i11 = 0; i11 < size; i11++) {
            tArr[i11] = this.f14168a.get(i11);
        }
        return tArr;
    }
}
