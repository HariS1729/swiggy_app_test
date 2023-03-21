package in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import kotlin.jvm.internal.p;

/* compiled from: BusinessLineInfo.kt */
public final class BusinessLineInfo {
    private final String iconId;

    /* renamed from: id  reason: collision with root package name */
    private final String f20250id;

    public BusinessLineInfo(String str, String str2) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "iconId");
        this.f20250id = str;
        this.iconId = str2;
    }

    public static /* synthetic */ BusinessLineInfo copy$default(BusinessLineInfo businessLineInfo, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = businessLineInfo.f20250id;
        }
        if ((i11 & 2) != 0) {
            str2 = businessLineInfo.iconId;
        }
        return businessLineInfo.copy(str, str2);
    }

    public final String component1() {
        return this.f20250id;
    }

    public final String component2() {
        return this.iconId;
    }

    public final BusinessLineInfo copy(String str, String str2) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        p.j(str2, "iconId");
        return new BusinessLineInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessLineInfo)) {
            return false;
        }
        BusinessLineInfo businessLineInfo = (BusinessLineInfo) obj;
        return p.e(this.f20250id, businessLineInfo.f20250id) && p.e(this.iconId, businessLineInfo.iconId);
    }

    public final String getIconId() {
        return this.iconId;
    }

    public final String getId() {
        return this.f20250id;
    }

    public int hashCode() {
        return (this.f20250id.hashCode() * 31) + this.iconId.hashCode();
    }

    public String toString() {
        return "BusinessLineInfo(id=" + this.f20250id + ", iconId=" + this.iconId + ')';
    }
}
