package in.swiggy.android.tejas.feature.home.model;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import kotlin.jvm.internal.p;

/* compiled from: AssociatedParam.kt */
public final class AssociatedParam {

    /* renamed from: id  reason: collision with root package name */
    private final String f20235id;
    private final String value;

    public AssociatedParam(String str, String str2) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "value");
        this.f20235id = str;
        this.value = str2;
    }

    public static /* synthetic */ AssociatedParam copy$default(AssociatedParam associatedParam, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = associatedParam.f20235id;
        }
        if ((i11 & 2) != 0) {
            str2 = associatedParam.value;
        }
        return associatedParam.copy(str, str2);
    }

    public final String component1() {
        return this.f20235id;
    }

    public final String component2() {
        return this.value;
    }

    public final AssociatedParam copy(String str, String str2) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "value");
        return new AssociatedParam(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssociatedParam)) {
            return false;
        }
        AssociatedParam associatedParam = (AssociatedParam) obj;
        return p.e(this.f20235id, associatedParam.f20235id) && p.e(this.value, associatedParam.value);
    }

    public final String getId() {
        return this.f20235id;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.f20235id.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return "AssociatedParam(id=" + this.f20235id + ", value=" + this.value + ')';
    }
}
