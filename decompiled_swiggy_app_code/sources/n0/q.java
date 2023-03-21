package n0;

import bp0.k;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: SnapshotStateMap.kt */
abstract class q<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final n<K, V> f15752a;

    /* renamed from: b  reason: collision with root package name */
    private final Iterator<Map.Entry<K, V>> f15753b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f15754c;

    /* renamed from: d  reason: collision with root package name */
    private Map.Entry<? extends K, ? extends V> f15755d;

    /* renamed from: e  reason: collision with root package name */
    private Map.Entry<? extends K, ? extends V> f15756e;

    public q(n<K, V> nVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it2) {
        p.j(nVar, "map");
        p.j(it2, "iterator");
        this.f15752a = nVar;
        this.f15753b = it2;
        this.f15754c = nVar.g();
        c();
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.f15755d = this.f15756e;
        this.f15756e = this.f15753b.hasNext() ? this.f15753b.next() : null;
    }

    /* access modifiers changed from: protected */
    public final Map.Entry<K, V> d() {
        return this.f15755d;
    }

    public final n<K, V> f() {
        return this.f15752a;
    }

    /* access modifiers changed from: protected */
    public final Map.Entry<K, V> g() {
        return this.f15756e;
    }

    public final boolean hasNext() {
        return this.f15756e != null;
    }

    public final void remove() {
        if (f().g() == this.f15754c) {
            Map.Entry<? extends K, ? extends V> entry = this.f15755d;
            if (entry != null) {
                this.f15752a.remove(entry.getKey());
                this.f15755d = null;
                k kVar = k.f22762a;
                this.f15754c = f().g();
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
