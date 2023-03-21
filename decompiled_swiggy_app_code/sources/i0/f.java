package i0;

import cp0.d;
import g0.g;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import k0.b;
import k0.e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: PersistentHashMapBuilder.kt */
public final class f<K, V> extends d<K, V> implements g.a<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private d<K, V> f14826a;

    /* renamed from: b  reason: collision with root package name */
    private e f14827b = new e();

    /* renamed from: c  reason: collision with root package name */
    private t<K, V> f14828c = this.f14826a.q();

    /* renamed from: d  reason: collision with root package name */
    private V f14829d;

    /* renamed from: e  reason: collision with root package name */
    private int f14830e;

    /* renamed from: f  reason: collision with root package name */
    private int f14831f = this.f14826a.size();

    public f(d<K, V> dVar) {
        p.j(dVar, "map");
        this.f14826a = dVar;
    }

    public Set<Map.Entry<K, V>> a() {
        return new h(this);
    }

    public Set<K> b() {
        return new j(this);
    }

    public void clear() {
        this.f14828c = t.f14843e.a();
        o(0);
    }

    public boolean containsKey(Object obj) {
        return this.f14828c.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public int d() {
        return this.f14831f;
    }

    public Collection<V> f() {
        return new l(this);
    }

    /* renamed from: g */
    public d<K, V> build() {
        d<K, V> dVar;
        if (this.f14828c == this.f14826a.q()) {
            dVar = this.f14826a;
        } else {
            this.f14827b = new e();
            dVar = new d<>(this.f14828c, size());
        }
        this.f14826a = dVar;
        return dVar;
    }

    public V get(Object obj) {
        return this.f14828c.o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final int h() {
        return this.f14830e;
    }

    public final t<K, V> k() {
        return this.f14828c;
    }

    public final e l() {
        return this.f14827b;
    }

    public final void m(int i11) {
        this.f14830e = i11;
    }

    public final void n(V v) {
        this.f14829d = v;
    }

    public void o(int i11) {
        this.f14831f = i11;
        this.f14830e++;
    }

    public V put(K k, V v) {
        this.f14829d = null;
        this.f14828c = this.f14828c.D(k != null ? k.hashCode() : 0, k, v, 0, this);
        return this.f14829d;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        p.j(map, "from");
        d dVar = map instanceof d ? (d) map : null;
        if (dVar == null) {
            f fVar = map instanceof f ? (f) map : null;
            dVar = fVar != null ? fVar.build() : null;
        }
        if (dVar != null) {
            b bVar = new b(0, 1, (i) null);
            int size = size();
            this.f14828c = this.f14828c.E(dVar.q(), 0, bVar, this);
            int size2 = (dVar.size() + size) - bVar.a();
            if (size != size2) {
                o(size2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    public V remove(Object obj) {
        this.f14829d = null;
        t<K, V> G = this.f14828c.G(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (G == null) {
            G = t.f14843e.a();
        }
        this.f14828c = G;
        return this.f14829d;
    }

    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        t<K, V> H = this.f14828c.H(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (H == null) {
            H = t.f14843e.a();
        }
        this.f14828c = H;
        if (size != size()) {
            return true;
        }
        return false;
    }
}
