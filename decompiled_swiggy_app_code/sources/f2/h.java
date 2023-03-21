package f2;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import java.util.HashMap;
import kotlin.jvm.internal.p;

/* compiled from: ConstraintLayout.kt */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private String f14571a;

    /* renamed from: b  reason: collision with root package name */
    private String f14572b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, String> f14573c;

    public h(String str, String str2, HashMap<String, String> hashMap) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "type");
        p.j(hashMap, "params");
        this.f14571a = str;
        this.f14572b = str2;
        this.f14573c = hashMap;
    }

    public final String a() {
        return this.f14571a;
    }

    public final HashMap<String, String> b() {
        return this.f14573c;
    }

    public final String c() {
        return this.f14572b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p.e(this.f14571a, hVar.f14571a) && p.e(this.f14572b, hVar.f14572b) && p.e(this.f14573c, hVar.f14573c);
    }

    public int hashCode() {
        return (((this.f14571a.hashCode() * 31) + this.f14572b.hashCode()) * 31) + this.f14573c.hashCode();
    }

    public String toString() {
        return "DesignElement(id=" + this.f14571a + ", type=" + this.f14572b + ", params=" + this.f14573c + ')';
    }
}
