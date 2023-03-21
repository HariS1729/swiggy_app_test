package n0;

import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.b;
import bp0.k;
import g0.e;
import g0.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.x;
import n0.n;

/* compiled from: SnapshotStateMap.kt */
final class h<K, V> extends j<K, V, Map.Entry<K, V>> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(n<K, V> nVar) {
        super(nVar);
        p.j(nVar, "map");
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) g((Map.Entry) obj)).booleanValue();
    }

    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) h(collection)).booleanValue();
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!x.l(obj)) {
            return false;
        }
        return i((Map.Entry) obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        p.j(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!contains((Map.Entry) it2.next())) {
                return false;
            }
        }
        return true;
    }

    public Void g(Map.Entry<K, V> entry) {
        p.j(entry, "element");
        o.b();
        throw new KotlinNothingValueException();
    }

    public Void h(Collection<? extends Map.Entry<K, V>> collection) {
        p.j(collection, "elements");
        o.b();
        throw new KotlinNothingValueException();
    }

    public boolean i(Map.Entry<K, V> entry) {
        p.j(entry, "element");
        return p.e(c().get(entry.getKey()), entry.getValue());
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new p(c(), ((e) c().h().g().entrySet()).iterator());
    }

    public boolean k(Map.Entry<K, V> entry) {
        p.j(entry, "element");
        return c().remove(entry.getKey()) != null;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!x.l(obj)) {
            return false;
        }
        return k((Map.Entry) obj);
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        p.j(collection, "elements");
        Iterator<? extends Object> it2 = collection.iterator();
        while (true) {
            boolean z11 = false;
            while (true) {
                if (!it2.hasNext()) {
                    return z11;
                }
                if (c().remove(((Map.Entry) it2.next()).getKey()) != null || z11) {
                    z11 = true;
                }
            }
        }
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        g g11;
        int h11;
        boolean z11;
        b b11;
        p.j(collection, "elements");
        LinkedHashMap linkedHashMap = new LinkedHashMap(l.d(w.b(l.u(collection, 10)), 16));
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Pair a11 = bp0.h.a(entry.getKey(), entry.getValue());
            linkedHashMap.put(a11.c(), a11.d());
        }
        n c11 = c();
        boolean z12 = false;
        do {
            synchronized (o.f15748a) {
                n.a aVar = (n.a) SnapshotKt.A((n.a) c11.k(), b.f6287e.b());
                g11 = aVar.g();
                h11 = aVar.h();
                k kVar = k.f22762a;
            }
            p.g(g11);
            g.a j = g11.j();
            z11 = true;
            for (Map.Entry entry2 : c11.entrySet()) {
                if (!linkedHashMap.containsKey(entry2.getKey()) || !p.e(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    j.remove(entry2.getKey());
                    z12 = true;
                }
            }
            k kVar2 = k.f22762a;
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
