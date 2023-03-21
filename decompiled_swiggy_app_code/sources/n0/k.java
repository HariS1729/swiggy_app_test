package n0;

import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.b;
import g0.e;
import g0.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.p;
import n0.n;

/* compiled from: SnapshotStateMap.kt */
final class k<K, V> extends j<K, V, V> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(n<K, V> nVar) {
        super(nVar);
        p.j(nVar, "map");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) g(obj)).booleanValue();
    }

    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) h(collection)).booleanValue();
    }

    public boolean contains(Object obj) {
        return c().containsValue(obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        p.j(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!c().containsValue(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public Void g(V v) {
        o.b();
        throw new KotlinNothingValueException();
    }

    public Void h(Collection<? extends V> collection) {
        p.j(collection, "elements");
        o.b();
        throw new KotlinNothingValueException();
    }

    /* renamed from: i */
    public s<K, V> iterator() {
        return new s<>(c(), ((e) c().h().g().entrySet()).iterator());
    }

    public boolean remove(Object obj) {
        return c().n(obj);
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        g g11;
        int h11;
        boolean z11;
        b b11;
        p.j(collection, "elements");
        Set I0 = s.I0(collection);
        n c11 = c();
        boolean z12 = false;
        do {
            synchronized (o.f15748a) {
                n.a aVar = (n.a) SnapshotKt.A((n.a) c11.k(), b.f6287e.b());
                g11 = aVar.g();
                h11 = aVar.h();
                bp0.k kVar = bp0.k.f22762a;
            }
            p.g(g11);
            g.a j = g11.j();
            z11 = true;
            for (Map.Entry entry : c11.entrySet()) {
                if (I0.contains(entry.getValue())) {
                    j.remove(entry.getKey());
                    z12 = true;
                }
            }
            bp0.k kVar2 = bp0.k.f22762a;
            g build = j.build();
            if (p.e(build, g11)) {
                break;
            }
            synchronized (o.f15748a) {
                n.a aVar2 = (n.a) c11.k();
                SnapshotKt.D();
                synchronized (SnapshotKt.C()) {
                    b11 = b.f6287e.b();
                    n.a aVar3 = (n.a) SnapshotKt.Z(aVar2, c11, b11);
                    if (aVar3.h() == h11) {
                        aVar3.i(build);
                        aVar3.j(aVar3.h() + 1);
                    } else {
                        z11 = false;
                    }
                }
                SnapshotKt.J(b11, c11);
            }
        } while (!z11);
        return z12;
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        g g11;
        int h11;
        boolean z11;
        b b11;
        p.j(collection, "elements");
        Set I0 = s.I0(collection);
        n c11 = c();
        boolean z12 = false;
        do {
            synchronized (o.f15748a) {
                n.a aVar = (n.a) SnapshotKt.A((n.a) c11.k(), b.f6287e.b());
                g11 = aVar.g();
                h11 = aVar.h();
                bp0.k kVar = bp0.k.f22762a;
            }
            p.g(g11);
            g.a j = g11.j();
            z11 = true;
            for (Map.Entry entry : c11.entrySet()) {
                if (!I0.contains(entry.getValue())) {
                    j.remove(entry.getKey());
                    z12 = true;
                }
            }
            bp0.k kVar2 = bp0.k.f22762a;
            g build = j.build();
            if (p.e(build, g11)) {
                break;
            }
            synchronized (o.f15748a) {
                n.a aVar2 = (n.a) c11.k();
                SnapshotKt.D();
                synchronized (SnapshotKt.C()) {
                    b11 = b.f6287e.b();
                    n.a aVar3 = (n.a) SnapshotKt.Z(aVar2, c11, b11);
                    if (aVar3.h() == h11) {
                        aVar3.i(build);
                        aVar3.j(aVar3.h() + 1);
                    } else {
                        z11 = false;
                    }
                }
                SnapshotKt.J(b11, c11);
            }
        } while (!z11);
        return z12;
    }
}
