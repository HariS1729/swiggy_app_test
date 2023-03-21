package in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem;

import com.google.gson.annotations.SerializedName;
import fq0.d;
import gq0.a1;
import gq0.w;
import gq0.x0;
import in.swiggy.android.tejas.feature.listing.instamart.model.MartMenuCartAllowedQuantity;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: InstamartItemCartAllowedQty.kt */
public final class InstamartItemCartAllowedQty {
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("message")
    private final String message;
    @SerializedName("total")
    private final Integer total;

    /* compiled from: InstamartItemCartAllowedQty.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<InstamartItemCartAllowedQty> serializer() {
            return InstamartItemCartAllowedQty$$serializer.INSTANCE;
        }
    }

    public InstamartItemCartAllowedQty() {
        this((Integer) null, (String) null, 3, (i) null);
    }

    public /* synthetic */ InstamartItemCartAllowedQty(int i11, Integer num, String str, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.total = null;
        } else {
            this.total = num;
        }
        if ((i11 & 2) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
    }

    public static /* synthetic */ InstamartItemCartAllowedQty copy$default(InstamartItemCartAllowedQty instamartItemCartAllowedQty, Integer num, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = instamartItemCartAllowedQty.total;
        }
        if ((i11 & 2) != 0) {
            str = instamartItemCartAllowedQty.message;
        }
        return instamartItemCartAllowedQty.copy(num, str);
    }

    public static /* synthetic */ void getMessage$annotations() {
    }

    public static /* synthetic */ void getTotal$annotations() {
    }

    public static final void write$Self(InstamartItemCartAllowedQty instamartItemCartAllowedQty, d dVar, SerialDescriptor serialDescriptor) {
        p.j(instamartItemCartAllowedQty, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || instamartItemCartAllowedQty.total != null) {
            dVar.E(serialDescriptor, 0, w.f23130b, instamartItemCartAllowedQty.total);
        }
        if (dVar.o(serialDescriptor, 1) || instamartItemCartAllowedQty.message != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 1, a1.f23069b, instamartItemCartAllowedQty.message);
        }
    }

    public final Integer component1() {
        return this.total;
    }

    public final String component2() {
        return this.message;
    }

    public final InstamartItemCartAllowedQty copy(Integer num, String str) {
        return new InstamartItemCartAllowedQty(num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstamartItemCartAllowedQty)) {
            return false;
        }
        InstamartItemCartAllowedQty instamartItemCartAllowedQty = (InstamartItemCartAllowedQty) obj;
        return p.e(this.total, instamartItemCartAllowedQty.total) && p.e(this.message, instamartItemCartAllowedQty.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public final Integer getTotal() {
        return this.total;
    }

    public int hashCode() {
        Integer num = this.total;
        int i11 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        if (str != null) {
            i11 = str.hashCode();
        }
        return hashCode + i11;
    }

    public String toString() {
        return "InstamartItemCartAllowedQty(total=" + this.total + ", message=" + this.message + ')';
    }

    public InstamartItemCartAllowedQty(Integer num, String str) {
        this.total = num;
        this.message = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstamartItemCartAllowedQty(Integer num, String str, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InstamartItemCartAllowedQty(MartMenuCartAllowedQuantity martMenuCartAllowedQuantity) {
        this(Integer.valueOf(martMenuCartAllowedQuantity.getTotal()), martMenuCartAllowedQuantity.getMessage());
        p.j(martMenuCartAllowedQuantity, "cartAllowedQuantity");
    }
}
