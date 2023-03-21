package in.swiggy.android.tejas.feature.instamart.model.cartdata;

import com.google.gson.annotations.SerializedName;
import fq0.d;
import gq0.a1;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: InstamartSuperData.kt */
public final class InstamartSuperData {
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("subscriptionPlanId")
    private final String subscriptionPlanId;
    @SerializedName("userStatus")
    private final String userStatus;

    /* compiled from: InstamartSuperData.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<InstamartSuperData> serializer() {
            return InstamartSuperData$$serializer.INSTANCE;
        }
    }

    public InstamartSuperData() {
        this((String) null, (String) null, 3, (i) null);
    }

    public /* synthetic */ InstamartSuperData(int i11, String str, String str2, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.userStatus = null;
        } else {
            this.userStatus = str;
        }
        if ((i11 & 2) == 0) {
            this.subscriptionPlanId = null;
        } else {
            this.subscriptionPlanId = str2;
        }
    }

    public static /* synthetic */ InstamartSuperData copy$default(InstamartSuperData instamartSuperData, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = instamartSuperData.userStatus;
        }
        if ((i11 & 2) != 0) {
            str2 = instamartSuperData.subscriptionPlanId;
        }
        return instamartSuperData.copy(str, str2);
    }

    public static /* synthetic */ void getSubscriptionPlanId$annotations() {
    }

    public static /* synthetic */ void getUserStatus$annotations() {
    }

    public static final void write$Self(InstamartSuperData instamartSuperData, d dVar, SerialDescriptor serialDescriptor) {
        p.j(instamartSuperData, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || instamartSuperData.userStatus != null) {
            dVar.E(serialDescriptor, 0, a1.f23069b, instamartSuperData.userStatus);
        }
        if (dVar.o(serialDescriptor, 1) || instamartSuperData.subscriptionPlanId != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 1, a1.f23069b, instamartSuperData.subscriptionPlanId);
        }
    }

    public final String component1() {
        return this.userStatus;
    }

    public final String component2() {
        return this.subscriptionPlanId;
    }

    public final InstamartSuperData copy(String str, String str2) {
        return new InstamartSuperData(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstamartSuperData)) {
            return false;
        }
        InstamartSuperData instamartSuperData = (InstamartSuperData) obj;
        return p.e(this.userStatus, instamartSuperData.userStatus) && p.e(this.subscriptionPlanId, instamartSuperData.subscriptionPlanId);
    }

    public final String getSubscriptionPlanId() {
        return this.subscriptionPlanId;
    }

    public final String getUserStatus() {
        return this.userStatus;
    }

    public int hashCode() {
        String str = this.userStatus;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subscriptionPlanId;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        return "InstamartSuperData(userStatus=" + this.userStatus + ", subscriptionPlanId=" + this.subscriptionPlanId + ')';
    }

    public InstamartSuperData(String str, String str2) {
        this.userStatus = str;
        this.subscriptionPlanId = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstamartSuperData(String str, String str2, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
