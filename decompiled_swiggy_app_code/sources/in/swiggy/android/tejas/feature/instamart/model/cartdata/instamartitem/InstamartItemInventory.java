package in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem;

import com.google.gson.annotations.SerializedName;
import fq0.d;
import gq0.a1;
import gq0.h;
import gq0.w;
import gq0.x0;
import in.swiggy.android.tejas.feature.listing.instamart.model.MartMenuInventory;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: InstamartItemInventory.kt */
public final class InstamartItemInventory {
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("in_stock")
    private final Boolean inStock;
    @SerializedName("message")
    private final String message;
    @SerializedName("remaining")
    private final Integer remaining;
    @SerializedName("total")
    private final Integer total;

    /* compiled from: InstamartItemInventory.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<InstamartItemInventory> serializer() {
            return InstamartItemInventory$$serializer.INSTANCE;
        }
    }

    public InstamartItemInventory() {
        this((Boolean) null, (Integer) null, (Integer) null, (String) null, 15, (i) null);
    }

    public /* synthetic */ InstamartItemInventory(int i11, Boolean bool, Integer num, Integer num2, String str, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.inStock = null;
        } else {
            this.inStock = bool;
        }
        if ((i11 & 2) == 0) {
            this.total = null;
        } else {
            this.total = num;
        }
        if ((i11 & 4) == 0) {
            this.remaining = null;
        } else {
            this.remaining = num2;
        }
        if ((i11 & 8) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
    }

    public static /* synthetic */ InstamartItemInventory copy$default(InstamartItemInventory instamartItemInventory, Boolean bool, Integer num, Integer num2, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = instamartItemInventory.inStock;
        }
        if ((i11 & 2) != 0) {
            num = instamartItemInventory.total;
        }
        if ((i11 & 4) != 0) {
            num2 = instamartItemInventory.remaining;
        }
        if ((i11 & 8) != 0) {
            str = instamartItemInventory.message;
        }
        return instamartItemInventory.copy(bool, num, num2, str);
    }

    public static /* synthetic */ void getInStock$annotations() {
    }

    public static /* synthetic */ void getMessage$annotations() {
    }

    public static /* synthetic */ void getRemaining$annotations() {
    }

    public static /* synthetic */ void getTotal$annotations() {
    }

    public static final void write$Self(InstamartItemInventory instamartItemInventory, d dVar, SerialDescriptor serialDescriptor) {
        p.j(instamartItemInventory, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || instamartItemInventory.inStock != null) {
            dVar.E(serialDescriptor, 0, h.f23089b, instamartItemInventory.inStock);
        }
        if (dVar.o(serialDescriptor, 1) || instamartItemInventory.total != null) {
            dVar.E(serialDescriptor, 1, w.f23130b, instamartItemInventory.total);
        }
        if (dVar.o(serialDescriptor, 2) || instamartItemInventory.remaining != null) {
            dVar.E(serialDescriptor, 2, w.f23130b, instamartItemInventory.remaining);
        }
        if (dVar.o(serialDescriptor, 3) || instamartItemInventory.message != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 3, a1.f23069b, instamartItemInventory.message);
        }
    }

    public final Boolean component1() {
        return this.inStock;
    }

    public final Integer component2() {
        return this.total;
    }

    public final Integer component3() {
        return this.remaining;
    }

    public final String component4() {
        return this.message;
    }

    public final InstamartItemInventory copy(Boolean bool, Integer num, Integer num2, String str) {
        return new InstamartItemInventory(bool, num, num2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstamartItemInventory)) {
            return false;
        }
        InstamartItemInventory instamartItemInventory = (InstamartItemInventory) obj;
        return p.e(this.inStock, instamartItemInventory.inStock) && p.e(this.total, instamartItemInventory.total) && p.e(this.remaining, instamartItemInventory.remaining) && p.e(this.message, instamartItemInventory.message);
    }

    public final Boolean getInStock() {
        return this.inStock;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Integer getRemaining() {
        return this.remaining;
    }

    public final Integer getTotal() {
        return this.total;
    }

    public int hashCode() {
        Boolean bool = this.inStock;
        int i11 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.total;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.remaining;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.message;
        if (str != null) {
            i11 = str.hashCode();
        }
        return hashCode3 + i11;
    }

    public String toString() {
        return "InstamartItemInventory(inStock=" + this.inStock + ", total=" + this.total + ", remaining=" + this.remaining + ", message=" + this.message + ')';
    }

    public InstamartItemInventory(Boolean bool, Integer num, Integer num2, String str) {
        this.inStock = bool;
        this.total = num;
        this.remaining = num2;
        this.message = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstamartItemInventory(Boolean bool, Integer num, Integer num2, String str, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : num2, (i11 & 8) != 0 ? null : str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InstamartItemInventory(MartMenuInventory martMenuInventory) {
        this(Boolean.valueOf(martMenuInventory.getInStock()), Integer.valueOf(martMenuInventory.getTotal()), Integer.valueOf(martMenuInventory.getRemaining()), martMenuInventory.getMessage());
        p.j(martMenuInventory, "inventory");
    }
}
