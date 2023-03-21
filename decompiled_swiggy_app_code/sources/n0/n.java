package n0;

import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.b;
import bp0.k;
import g0.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.p;
import mp0.e;

/* compiled from: SnapshotStateMap.kt */
public final class n<K, V> implements Map<K, V>, u, e {

    /* renamed from: a  reason: collision with root package name */
    private v f15742a = new a(g0.a.a());

    /* renamed from: b  reason: collision with root package name */
    private final Set<Map.Entry<K, V>> f15743b = new h(this);

    /* renamed from: c  reason: collision with root package name */
    private final Set<K> f15744c = new i(this);

    /* renamed from: d  reason: collision with root package name */
    private final Collection<V> f15745d = new k(this);

    /* compiled from: SnapshotStateMap.kt */
    public static final class a<K, V> extends v {

        /* renamed from: c  reason: collision with root package name */
        private g<K, ? extends V> f15746c;

        /* renamed from: d  reason: collision with root package name */
        private int f15747d;

        public a(g<K, ? extends V> gVar) {
            p.j(gVar, "map");
            this.f15746c = gVar;
        }

        public void a(v vVar) {
            p.j(vVar, "value");
            a aVar = (a) vVar;
            synchronized (o.f15748a) {
                this.f15746c = aVar.f15746c;
                this.f15747d = aVar.f15747d;
                k kVar = k.f22762a;
            }
        }

        public v b() {
            return new a(this.f15746c);
        }

        public final g<K, V> g() {
            return this.f15746c;
        }

        public final int h() {
            return this.f15747d;
        }

        public final void i(g<K, ? extends V> gVar) {
            p.j(gVar, "<set-?>");
            this.f15746c = gVar;
        }

        public final void j(int i11) {
            this.f15747d = i11;
        }
    }

    public Set<Map.Entry<K, V>> a() {
        return this.f15743b;
    }

    public Set<K> b() {
        return this.f15744c;
    }

    public void clear() {
        b b11;
        b.a aVar = b.f6287e;
        a aVar2 = (a) SnapshotKt.A((a) k(), aVar.b());
        aVar2.g();
        g a11 = g0.a.a();
        if (a11 != aVar2.g()) {
            synchronized (o.f15748a) {
                a aVar3 = (a) k();
                SnapshotKt.D();
                synchronized (SnapshotKt.C()) {
                    b11 = aVar.b();
                    a aVar4 = (a) SnapshotKt.Z(aVar3, this, b11);
                    aVar4.i(a11);
                    aVar4.j(aVar4.h() + 1);
                }
                SnapshotKt.J(b11, this);
            }
        }
    }

    public boolean containsKey(Object obj) {
        return h().g().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return h().g().containsValue(obj);
    }

    public /* synthetic */ v d(v vVar, v vVar2, v vVar3) {
        return t.a(this, vVar, vVar2, vVar3);
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return a();
    }

    public void f(v vVar) {
        p.j(vVar, "value");
        this.f15742a = (a) vVar;
    }

    public final int g() {
        return h().h();
    }

    public V get(Object obj) {
        return h().g().get(obj);
    }

    public final a<K, V> h() {
        return (a) SnapshotKt.O((a) k(), this);
    }

    public boolean isEmpty() {
        return h().g().isEmpty();
    }

    public v k() {
        return this.f15742a;
    }

    public final /* bridge */ Set<K> keySet() {
        return b();
    }

    public int l() {
        return h().g().size();
    }

    public Collection<V> m() {
        return this.f15745d;
    }

    public final boolean n(V v) {
        Object obj;
        Iterator it2 = entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (p.e(((Map.Entry) obj).getValue(), v)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    public V put(K k, V v) {
        b.a aVar;
        g g11;
        int h11;
        V put;
        b b11;
        boolean z11;
        do {
            synchronized (o.f15748a) {
                aVar = b.f6287e;
                a aVar2 = (a) SnapshotKt.A((a) k(), aVar.b());
                g11 = aVar2.g();
                h11 = aVar2.h();
                k kVar = k.f22762a;
            }
            p.g(g11);
            g.a j = g11.j();
            put = j.put(k, v);
            g build = j.build();
            if (p.e(build, g11)) {
                break;
            }
            synchronized (o.f15748a) {
                a aVar3 = (a) k();
                SnapshotKt.D();
                synchronized (SnapshotKt.C()) {
                    b11 = aVar.b();
                    a aVar4 = (a) SnapshotKt.Z(aVar3, this, b11);
                    z11 = true;
                    if (aVar4.h() == h11) {
                        aVar4.i(build);
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z11 = false;
                    }
                }
                SnapshotKt.J(b11, this);
            }
        } while (!z11);
        return put;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        b.a aVar;
        g g11;
        int h11;
        b b11;
        boolean z11;
        p.j(map, "from");
        do {
            synchronized (o.f15748a) {
                aVar = b.f6287e;
                a aVar2 = (a) SnapshotKt.A((a) k(), aVar.b());
                g11 = aVar2.g();
                h11 = aVar2.h();
                k kVar = k.f22762a;
            }
            p.g(g11);
            g.a j = g11.j();
            j.putAll(map);
            g build = j.build();
            if (!p.e(build, g11)) {
                synchronized (o.f15748a) {
                    a aVar3 = (a) k();
                    SnapshotKt.D();
                    synchronized (SnapshotKt.C()) {
                        b11 = aVar.b();
                        a aVar4 = (a) SnapshotKt.Z(aVar3, this, b11);
                        z11 = true;
                        if (aVar4.h() == h11) {
                            aVar4.i(build);
                            aVar4.j(aVar4.h() + 1);
                        } else {
                            z11 = false;
                        }
                    }
                    SnapshotKt.J(b11, this);
                }
            } else {
                return;
            }
        } while (!z11);
    }

    public V remove(Object obj) {
        b.a aVar;
        g g11;
        int h11;
        V remove;
        b b11;
        boolean z11;
        do {
            synchronized (o.f15748a) {
                aVar = b.f6287e;
                a aVar2 = (a) SnapshotKt.A((a) k(), aVar.b());
                g11 = aVar2.g();
                h11 = aVar2.h();
                k kVar = k.f22762a;
            }
            p.g(g11);
            g.a j = g11.j();
            remove = j.remove(obj);
            g build = j.build();
            if (p.e(build, g11)) {
                break;
            }
            synchronized (o.f15748a) {
                a aVar3 = (a) k();
                SnapshotKt.D();
                synchronized (SnapshotKt.C()) {
                    b11 = aVar.b();
                    a aVar4 = (a) SnapshotKt.Z(aVar3, this, b11);
                    z11 = true;
                    if (aVar4.h() == h11) {
                        aVar4.i(build);
                        aVar4.j(aVar4.h() + 1);
                    } else {
                        z11 = false;
                    }
                }
                SnapshotKt.J(b11, this);
            }
        } while (!z11);
        return remove;
    }

    public final /* bridge */ int size() {
        return l();
    }

    public final /* bridge */ Collection<V> values() {
        return m();
    }
}
