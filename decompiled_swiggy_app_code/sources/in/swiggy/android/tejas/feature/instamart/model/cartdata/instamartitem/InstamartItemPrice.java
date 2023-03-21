package in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem;

import com.google.gson.annotations.SerializedName;
import fq0.d;
import gq0.a1;
import gq0.n;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: InstamartItemPrice.kt */
public final class InstamartItemPrice {
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("currency")
    private final String currency;
    @SerializedName("mrp")
    private final Double mrp;
    @SerializedName("offer_price")
    private final Double offerPrice;
    @SerializedName("store_price")
    private final Double storePrice;

    /* compiled from: InstamartItemPrice.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<InstamartItemPrice> serializer() {
            return InstamartItemPrice$$serializer.INSTANCE;
        }
    }

    public InstamartItemPrice() {
        this((Double) null, (Double) null, (String) null, (Double) null, 15, (i) null);
    }

    public /* synthetic */ InstamartItemPrice(int i11, Double d11, Double d12, String str, Double d13, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.mrp = null;
        } else {
            this.mrp = d11;
        }
        if ((i11 & 2) == 0) {
            this.storePrice = null;
        } else {
            this.storePrice = d12;
        }
        if ((i11 & 4) == 0) {
            this.currency = null;
        } else {
            this.currency = str;
        }
        if ((i11 & 8) == 0) {
            this.offerPrice = null;
        } else {
            this.offerPrice = d13;
        }
    }

    public static /* synthetic */ InstamartItemPrice copy$default(InstamartItemPrice instamartItemPrice, Double d11, Double d12, String str, Double d13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = instamartItemPrice.mrp;
        }
        if ((i11 & 2) != 0) {
            d12 = instamartItemPrice.storePrice;
        }
        if ((i11 & 4) != 0) {
            str = instamartItemPrice.currency;
        }
        if ((i11 & 8) != 0) {
            d13 = instamartItemPrice.offerPrice;
        }
        return instamartItemPrice.copy(d11, d12, str, d13);
    }

    public static /* synthetic */ void getCurrency$annotations() {
    }

    public static /* synthetic */ void getMrp$annotations() {
    }

    public static /* synthetic */ void getOfferPrice$annotations() {
    }

    public static /* synthetic */ void getStorePrice$annotations() {
    }

    public static final void write$Self(InstamartItemPrice instamartItemPrice, d dVar, SerialDescriptor serialDescriptor) {
        p.j(instamartItemPrice, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || instamartItemPrice.mrp != null) {
            dVar.E(serialDescriptor, 0, n.f23109b, instamartItemPrice.mrp);
        }
        if (dVar.o(serialDescriptor, 1) || instamartItemPrice.storePrice != null) {
            dVar.E(serialDescriptor, 1, n.f23109b, instamartItemPrice.storePrice);
        }
        if (dVar.o(serialDescriptor, 2) || instamartItemPrice.currency != null) {
            dVar.E(serialDescriptor, 2, a1.f23069b, instamartItemPrice.currency);
        }
        if (dVar.o(serialDescriptor, 3) || instamartItemPrice.offerPrice != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 3, n.f23109b, instamartItemPrice.offerPrice);
        }
    }

    public final Double component1() {
        return this.mrp;
    }

    public final Double component2() {
        return this.storePrice;
    }

    public final String component3() {
        return this.currency;
    }

    public final Double component4() {
        return this.offerPrice;
    }

    public final InstamartItemPrice copy(Double d11, Double d12, String str, Double d13) {
        return new InstamartItemPrice(d11, d12, str, d13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstamartItemPrice)) {
            return false;
        }
        InstamartItemPrice instamartItemPrice = (InstamartItemPrice) obj;
        return p.e(this.mrp, instamartItemPrice.mrp) && p.e(this.storePrice, instamartItemPrice.storePrice) && p.e(this.currency, instamartItemPrice.currency) && p.e(this.offerPrice, instamartItemPrice.offerPrice);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Double getMrp() {
        return this.mrp;
    }

    public final Double getOfferPrice() {
        return this.offerPrice;
    }

    public final Double getStorePrice() {
        return this.storePrice;
    }

    public int hashCode() {
        Double d11 = this.mrp;
        int i11 = 0;
        int hashCode = (d11 == null ? 0 : d11.hashCode()) * 31;
        Double d12 = this.storePrice;
        int hashCode2 = (hashCode + (d12 == null ? 0 : d12.hashCode())) * 31;
        String str = this.currency;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Double d13 = this.offerPrice;
        if (d13 != null) {
            i11 = d13.hashCode();
        }
        return hashCode3 + i11;
    }

    public String toString() {
        return "InstamartItemPrice(mrp=" + this.mrp + ", storePrice=" + this.storePrice + ", currency=" + this.currency + ", offerPrice=" + this.offerPrice + ')';
    }

    public InstamartItemPrice(Double d11, Double d12, String str, Double d13) {
        this.mrp = d11;
        this.storePrice = d12;
        this.currency = str;
        this.offerPrice = d13;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstamartItemPrice(Double d11, Double d12, String str, Double d13, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : d11, (i11 & 2) != 0 ? null : d12, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : d13);
    }
}
