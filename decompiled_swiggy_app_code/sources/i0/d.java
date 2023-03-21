package i0;

import g0.b;
import g0.e;
import g0.g;
import i0.t;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractMap;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: PersistentHashMap.kt */
public final class d<K, V> extends AbstractMap<K, V> implements g<K, V> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f14819d = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final d f14820e = new d(t.f14843e.a(), 0);

    /* renamed from: b  reason: collision with root package name */
    private final t<K, V> f14821b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14822c;

    /* compiled from: PersistentHashMap.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final <K, V> d<K, V> a() {
            return d.f14820e;
        }
    }

    public d(t<K, V> tVar, int i11) {
        p.j(tVar, "node");
        this.f14821b = tVar;
        this.f14822c = i11;
    }

    private final e<Map.Entry<K, V>> o() {
        return new n(this);
    }

    public boolean containsKey(Object obj) {
        return this.f14821b.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final Set<Map.Entry<K, V>> d() {
        return o();
    }

    public int g() {
        return this.f14822c;
    }

    public V get(Object obj) {
        return this.f14821b.o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    /* renamed from: n */
    public f<K, V> j() {
        return new f<>(this);
    }

    /* renamed from: p */
    public e<K> f() {
        return new p(this);
    }

    public final t<K, V> q() {
        return this.f14821b;
    }

    /* renamed from: r */
    public b<V> h() {
        return new r(this);
    }

    public d<K, V> s(K k, V v) {
        t.b<K, V> P = this.f14821b.P(k != null ? k.hashCode() : 0, k, v, 0);
        if (P == null) {
            return this;
        }
        return new d<>(P.a(), size() + P.b());
    }

    public d<K, V> t(K k) {
        t<K, V> Q = this.f14821b.Q(k != null ? k.hashCode() : 0, k, 0);
        if (this.f14821b == Q) {
            return this;
        }
        if (Q == null) {
            return f14819d.a();
        }
        return new d<>(Q, size() - 1);
    }
}
