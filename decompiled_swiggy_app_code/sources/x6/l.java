package x6;

import bp0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Parameters.kt */
public final class l implements Iterable<Pair<? extends String, ? extends c>>, mp0.a {

    /* renamed from: b  reason: collision with root package name */
    public static final b f17828b = new b((i) null);

    /* renamed from: c  reason: collision with root package name */
    public static final l f17829c = new l();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, c> f17830a;

    /* compiled from: Parameters.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, c> f17831a;

        public a(l lVar) {
            this.f17831a = x.t(lVar.f17830a);
        }

        public final l a() {
            return new l(c7.c.b(this.f17831a), (i) null);
        }
    }

    /* compiled from: Parameters.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(i iVar) {
            this();
        }
    }

    /* compiled from: Parameters.kt */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Object f17832a;

        /* renamed from: b  reason: collision with root package name */
        private final String f17833b;

        public final String a() {
            return this.f17833b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (!p.e(this.f17832a, cVar.f17832a) || !p.e(this.f17833b, cVar.f17833b)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f17832a;
            int i11 = 0;
            int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            String str = this.f17833b;
            if (str != null) {
                i11 = str.hashCode();
            }
            return hashCode + i11;
        }

        public String toString() {
            return "Entry(value=" + this.f17832a + ", memoryCacheKey=" + this.f17833b + ')';
        }
    }

    private l(Map<String, c> map) {
        this.f17830a = map;
    }

    public /* synthetic */ l(Map map, i iVar) {
        this(map);
    }

    public final Map<String, String> c() {
        if (isEmpty()) {
            return x.f();
        }
        Map<String, c> map = this.f17830a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            String a11 = ((c) next.getValue()).a();
            if (a11 != null) {
                linkedHashMap.put(next.getKey(), a11);
            }
        }
        return linkedHashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && p.e(this.f17830a, ((l) obj).f17830a);
    }

    public final a f() {
        return new a(this);
    }

    public int hashCode() {
        return this.f17830a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f17830a.isEmpty();
    }

    public Iterator<Pair<String, c>> iterator() {
        Map<String, c> map = this.f17830a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(h.a((String) next.getKey(), (c) next.getValue()));
        }
        return arrayList.iterator();
    }

    public String toString() {
        return "Parameters(entries=" + this.f17830a + ')';
    }

    public l() {
        this(x.f());
    }
}
