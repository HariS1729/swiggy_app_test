package in.swiggy.android.tejas.feature.home.model;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: DynamicData.kt */
public final class DynamicData {
    private final List<AssociatedParam> associatedParams;

    /* renamed from: id  reason: collision with root package name */
    private final String f20240id;
    private final String type;
    private final String value;

    public DynamicData(String str, String str2, String str3, List<AssociatedParam> list) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "value");
        p.j(str3, "type");
        this.f20240id = str;
        this.value = str2;
        this.type = str3;
        this.associatedParams = list;
    }

    public static /* synthetic */ DynamicData copy$default(DynamicData dynamicData, String str, String str2, String str3, List<AssociatedParam> list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dynamicData.f20240id;
        }
        if ((i11 & 2) != 0) {
            str2 = dynamicData.value;
        }
        if ((i11 & 4) != 0) {
            str3 = dynamicData.type;
        }
        if ((i11 & 8) != 0) {
            list = dynamicData.associatedParams;
        }
        return dynamicData.copy(str, str2, str3, list);
    }

    public final String component1() {
        return this.f20240id;
    }

    public final String component2() {
        return this.value;
    }

    public final String component3() {
        return this.type;
    }

    public final List<AssociatedParam> component4() {
        return this.associatedParams;
    }

    public final DynamicData copy(String str, String str2, String str3, List<AssociatedParam> list) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "value");
        p.j(str3, "type");
        return new DynamicData(str, str2, str3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicData)) {
            return false;
        }
        DynamicData dynamicData = (DynamicData) obj;
        return p.e(this.f20240id, dynamicData.f20240id) && p.e(this.value, dynamicData.value) && p.e(this.type, dynamicData.type) && p.e(this.associatedParams, dynamicData.associatedParams);
    }

    public final List<AssociatedParam> getAssociatedParams() {
        return this.associatedParams;
    }

    public final String getId() {
        return this.f20240id;
    }

    public final AssociatedParam getParam(String str) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        List<AssociatedParam> list = this.associatedParams;
        if (list == null) {
            return null;
        }
        for (AssociatedParam next : list) {
            if (p.e(next.getId(), str)) {
                return next;
            }
        }
        return null;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = ((((this.f20240id.hashCode() * 31) + this.value.hashCode()) * 31) + this.type.hashCode()) * 31;
        List<AssociatedParam> list = this.associatedParams;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "DynamicData(id=" + this.f20240id + ", value=" + this.value + ", type=" + this.type + ", associatedParams=" + this.associatedParams + ')';
    }
}
