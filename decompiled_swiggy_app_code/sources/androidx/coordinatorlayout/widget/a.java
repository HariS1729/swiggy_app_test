package androidx.coordinatorlayout.widget;

import androidx.collection.g;
import androidx.core.util.Pools$SimplePool;
import androidx.core.util.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: DirectedAcyclicGraph */
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final e<ArrayList<T>> f8947a = new Pools$SimplePool(10);

    /* renamed from: b  reason: collision with root package name */
    private final g<T, ArrayList<T>> f8948b = new g<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<T> f8949c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<T> f8950d = new HashSet<>();

    private void e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = this.f8948b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        e(arrayList2.get(i11), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    private ArrayList<T> f() {
        ArrayList<T> b11 = this.f8947a.b();
        return b11 == null ? new ArrayList<>() : b11;
    }

    private void k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f8947a.a(arrayList);
    }

    public void a(T t, T t11) {
        if (!this.f8948b.containsKey(t) || !this.f8948b.containsKey(t11)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = this.f8948b.get(t);
        if (arrayList == null) {
            arrayList = f();
            this.f8948b.put(t, arrayList);
        }
        arrayList.add(t11);
    }

    public void b(T t) {
        if (!this.f8948b.containsKey(t)) {
            this.f8948b.put(t, null);
        }
    }

    public void c() {
        int size = this.f8948b.size();
        for (int i11 = 0; i11 < size; i11++) {
            ArrayList q = this.f8948b.q(i11);
            if (q != null) {
                k(q);
            }
        }
        this.f8948b.clear();
    }

    public boolean d(T t) {
        return this.f8948b.containsKey(t);
    }

    public List g(T t) {
        return this.f8948b.get(t);
    }

    public List<T> h(T t) {
        int size = this.f8948b.size();
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < size; i11++) {
            ArrayList q = this.f8948b.q(i11);
            if (q != null && q.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f8948b.m(i11));
            }
        }
        return arrayList;
    }

    public ArrayList<T> i() {
        this.f8949c.clear();
        this.f8950d.clear();
        int size = this.f8948b.size();
        for (int i11 = 0; i11 < size; i11++) {
            e(this.f8948b.m(i11), this.f8949c, this.f8950d);
        }
        return this.f8949c;
    }

    public boolean j(T t) {
        int size = this.f8948b.size();
        for (int i11 = 0; i11 < size; i11++) {
            ArrayList q = this.f8948b.q(i11);
            if (q != null && q.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
