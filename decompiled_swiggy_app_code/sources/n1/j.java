package n1;

import a0.h;
import androidx.compose.ui.platform.q0;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import bp0.c;
import in.swiggy.android.tejas.network.HttpRequest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.p;
import mp0.a;

/* compiled from: SemanticsConfiguration.kt */
public final class j implements q, Iterable<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>>, a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<SemanticsPropertyKey<?>, Object> f15802a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private boolean f15803b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15804c;

    public <T> void a(SemanticsPropertyKey<T> semanticsPropertyKey, T t) {
        p.j(semanticsPropertyKey, HttpRequest.HEADER_KEY);
        this.f15802a.put(semanticsPropertyKey, t);
    }

    public final void b(j jVar) {
        p.j(jVar, "peer");
        if (jVar.f15803b) {
            this.f15803b = true;
        }
        if (jVar.f15804c) {
            this.f15804c = true;
        }
        for (Map.Entry next : jVar.f15802a.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) next.getKey();
            Object value = next.getValue();
            if (!this.f15802a.containsKey(semanticsPropertyKey)) {
                this.f15802a.put(semanticsPropertyKey, value);
            } else if (value instanceof a) {
                Object obj = this.f15802a.get(semanticsPropertyKey);
                Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                a aVar = (a) obj;
                Map<SemanticsPropertyKey<?>, Object> map = this.f15802a;
                String b11 = aVar.b();
                if (b11 == null) {
                    b11 = ((a) value).b();
                }
                c a11 = aVar.a();
                if (a11 == null) {
                    a11 = ((a) value).a();
                }
                map.put(semanticsPropertyKey, new a(b11, a11));
            }
        }
    }

    public final <T> boolean c(SemanticsPropertyKey<T> semanticsPropertyKey) {
        p.j(semanticsPropertyKey, HttpRequest.HEADER_KEY);
        return this.f15802a.containsKey(semanticsPropertyKey);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p.e(this.f15802a, jVar.f15802a) && this.f15803b == jVar.f15803b && this.f15804c == jVar.f15804c;
    }

    public final j f() {
        j jVar = new j();
        jVar.f15803b = this.f15803b;
        jVar.f15804c = this.f15804c;
        jVar.f15802a.putAll(this.f15802a);
        return jVar;
    }

    public final <T> T g(SemanticsPropertyKey<T> semanticsPropertyKey) {
        p.j(semanticsPropertyKey, HttpRequest.HEADER_KEY);
        T t = this.f15802a.get(semanticsPropertyKey);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Key not present: " + semanticsPropertyKey + " - consider getOrElse or getOrNull");
    }

    public final <T> T h(SemanticsPropertyKey<T> semanticsPropertyKey, lp0.a<? extends T> aVar) {
        p.j(semanticsPropertyKey, HttpRequest.HEADER_KEY);
        p.j(aVar, "defaultValue");
        T t = this.f15802a.get(semanticsPropertyKey);
        return t == null ? aVar.invoke() : t;
    }

    public int hashCode() {
        return (((this.f15802a.hashCode() * 31) + h.a(this.f15803b)) * 31) + h.a(this.f15804c);
    }

    public final <T> T i(SemanticsPropertyKey<T> semanticsPropertyKey, lp0.a<? extends T> aVar) {
        p.j(semanticsPropertyKey, HttpRequest.HEADER_KEY);
        p.j(aVar, "defaultValue");
        T t = this.f15802a.get(semanticsPropertyKey);
        return t == null ? aVar.invoke() : t;
    }

    public Iterator<Map.Entry<SemanticsPropertyKey<?>, Object>> iterator() {
        return this.f15802a.entrySet().iterator();
    }

    public final boolean k() {
        return this.f15804c;
    }

    public final boolean l() {
        return this.f15803b;
    }

    public final void m(j jVar) {
        p.j(jVar, "child");
        for (Map.Entry next : jVar.f15802a.entrySet()) {
            SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) next.getKey();
            Object b11 = semanticsPropertyKey.b(this.f15802a.get(semanticsPropertyKey), next.getValue());
            if (b11 != null) {
                this.f15802a.put(semanticsPropertyKey, b11);
            }
        }
    }

    public final void n(boolean z11) {
        this.f15804c = z11;
    }

    public final void o(boolean z11) {
        this.f15803b = z11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        if (this.f15803b) {
            sb2.append(str);
            sb2.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.f15804c) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry next : this.f15802a.entrySet()) {
            Object value = next.getValue();
            sb2.append(str);
            sb2.append(((SemanticsPropertyKey) next.getKey()).a());
            sb2.append(" : ");
            sb2.append(value);
            str = ", ";
        }
        return q0.a(this, (String) null) + "{ " + sb2 + " }";
    }
}
