package in.swiggy.android.tejas.feature.instamart.model.localinstamartitem;

import com.google.gson.annotations.SerializedName;
import fq0.d;
import gq0.a1;
import gq0.h;
import gq0.x0;
import in.swiggy.android.tejas.feature.listing.instamart.model.MartMenuSkuSlotInfo;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: SkuSlotInfo.kt */
public final class SkuSlotInfo {
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("is_avail")
    private final Boolean isAvail;
    @SerializedName("message")
    private final String message;

    /* compiled from: SkuSlotInfo.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<SkuSlotInfo> serializer() {
            return SkuSlotInfo$$serializer.INSTANCE;
        }
    }

    public SkuSlotInfo() {
        this((Boolean) null, (String) null, 3, (i) null);
    }

    public /* synthetic */ SkuSlotInfo(int i11, Boolean bool, String str, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.isAvail = null;
        } else {
            this.isAvail = bool;
        }
        if ((i11 & 2) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
    }

    public static /* synthetic */ SkuSlotInfo copy$default(SkuSlotInfo skuSlotInfo, Boolean bool, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = skuSlotInfo.isAvail;
        }
        if ((i11 & 2) != 0) {
            str = skuSlotInfo.message;
        }
        return skuSlotInfo.copy(bool, str);
    }

    public static final void write$Self(SkuSlotInfo skuSlotInfo, d dVar, SerialDescriptor serialDescriptor) {
        p.j(skuSlotInfo, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || skuSlotInfo.isAvail != null) {
            dVar.E(serialDescriptor, 0, h.f23089b, skuSlotInfo.isAvail);
        }
        if (dVar.o(serialDescriptor, 1) || skuSlotInfo.message != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 1, a1.f23069b, skuSlotInfo.message);
        }
    }

    public final Boolean component1() {
        return this.isAvail;
    }

    public final String component2() {
        return this.message;
    }

    public final SkuSlotInfo copy(Boolean bool, String str) {
        return new SkuSlotInfo(bool, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuSlotInfo)) {
            return false;
        }
        SkuSlotInfo skuSlotInfo = (SkuSlotInfo) obj;
        return p.e(this.isAvail, skuSlotInfo.isAvail) && p.e(this.message, skuSlotInfo.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        Boolean bool = this.isAvail;
        int i11 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.message;
        if (str != null) {
            i11 = str.hashCode();
        }
        return hashCode + i11;
    }

    public final Boolean isAvail() {
        return this.isAvail;
    }

    public String toString() {
        return "SkuSlotInfo(isAvail=" + this.isAvail + ", message=" + this.message + ')';
    }

    public SkuSlotInfo(Boolean bool, String str) {
        this.isAvail = bool;
        this.message = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SkuSlotInfo(Boolean bool, String str, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SkuSlotInfo(MartMenuSkuSlotInfo martMenuSkuSlotInfo) {
        this(Boolean.valueOf(martMenuSkuSlotInfo.isAvail()), martMenuSkuSlotInfo.getMessage());
        p.j(martMenuSkuSlotInfo, "skuSlotInfo");
    }
}
