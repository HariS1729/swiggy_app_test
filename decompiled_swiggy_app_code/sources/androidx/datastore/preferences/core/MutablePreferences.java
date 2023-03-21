package androidx.datastore.preferences.core;

import b3.a;
import in.swiggy.android.tejas.network.HttpRequest;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Preferences.kt */
public final class MutablePreferences extends a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<a.C0100a<?>, Object> f9886a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f9887b;

    public MutablePreferences() {
        this((Map) null, false, 3, (i) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutablePreferences(Map map, boolean z11, int i11, i iVar) {
        this((i11 & 1) != 0 ? new LinkedHashMap() : map, (i11 & 2) != 0 ? true : z11);
    }

    public Map<a.C0100a<?>, Object> a() {
        Map<a.C0100a<?>, Object> unmodifiableMap = Collections.unmodifiableMap(this.f9886a);
        p.i(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    public <T> T b(a.C0100a<T> aVar) {
        p.j(aVar, HttpRequest.HEADER_KEY);
        return this.f9886a.get(aVar);
    }

    public final void e() {
        if (!(!this.f9887b.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof MutablePreferences) {
            return p.e(this.f9886a, ((MutablePreferences) obj).f9886a);
        }
        return false;
    }

    public final void f() {
        this.f9887b.set(true);
    }

    public final void g(a.b<?>... bVarArr) {
        p.j(bVarArr, "pairs");
        e();
        for (a.b<?> bVar : bVarArr) {
            j(bVar.a(), bVar.b());
        }
    }

    public final <T> T h(a.C0100a<T> aVar) {
        p.j(aVar, HttpRequest.HEADER_KEY);
        e();
        return this.f9886a.remove(aVar);
    }

    public int hashCode() {
        return this.f9886a.hashCode();
    }

    public final <T> void i(a.C0100a<T> aVar, T t) {
        p.j(aVar, HttpRequest.HEADER_KEY);
        j(aVar, t);
    }

    public final void j(a.C0100a<?> aVar, Object obj) {
        p.j(aVar, HttpRequest.HEADER_KEY);
        e();
        if (obj == null) {
            h(aVar);
        } else if (obj instanceof Set) {
            Map<a.C0100a<?>, Object> map = this.f9886a;
            Set unmodifiableSet = Collections.unmodifiableSet(s.I0((Iterable) obj));
            p.i(unmodifiableSet, "unmodifiableSet(value.toSet())");
            map.put(aVar, unmodifiableSet);
        } else {
            this.f9886a.put(aVar, obj);
        }
    }

    public String toString() {
        return s.f0(this.f9886a.entrySet(), ",\n", "{\n", "\n}", 0, (CharSequence) null, MutablePreferences$toString$1.f9888a, 24, (Object) null);
    }

    public MutablePreferences(Map<a.C0100a<?>, Object> map, boolean z11) {
        p.j(map, "preferencesMap");
        this.f9886a = map;
        this.f9887b = new AtomicBoolean(z11);
    }
}
