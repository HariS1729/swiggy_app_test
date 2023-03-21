package in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem;

import com.google.gson.annotations.SerializedName;
import fq0.d;
import gq0.a1;
import gq0.x0;
import in.swiggy.android.tejas.feature.listing.instamart.model.MartMenuMeta;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: InstamartItemMeta.kt */
public final class InstamartItemMeta {
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("disclaimer")
    private final String disclaimer;
    @SerializedName("product_long_description")
    private final String productLongDescription;
    @SerializedName("product_short_description")
    private final String productShortDescription;

    /* compiled from: InstamartItemMeta.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<InstamartItemMeta> serializer() {
            return InstamartItemMeta$$serializer.INSTANCE;
        }
    }

    public InstamartItemMeta() {
        this((String) null, (String) null, (String) null, 7, (i) null);
    }

    public /* synthetic */ InstamartItemMeta(int i11, String str, String str2, String str3, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.productLongDescription = null;
        } else {
            this.productLongDescription = str;
        }
        if ((i11 & 2) == 0) {
            this.productShortDescription = null;
        } else {
            this.productShortDescription = str2;
        }
        if ((i11 & 4) == 0) {
            this.disclaimer = null;
        } else {
            this.disclaimer = str3;
        }
    }

    public static /* synthetic */ InstamartItemMeta copy$default(InstamartItemMeta instamartItemMeta, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = instamartItemMeta.productLongDescription;
        }
        if ((i11 & 2) != 0) {
            str2 = instamartItemMeta.productShortDescription;
        }
        if ((i11 & 4) != 0) {
            str3 = instamartItemMeta.disclaimer;
        }
        return instamartItemMeta.copy(str, str2, str3);
    }

    public static /* synthetic */ void getDisclaimer$annotations() {
    }

    public static /* synthetic */ void getProductLongDescription$annotations() {
    }

    public static /* synthetic */ void getProductShortDescription$annotations() {
    }

    public static final void write$Self(InstamartItemMeta instamartItemMeta, d dVar, SerialDescriptor serialDescriptor) {
        p.j(instamartItemMeta, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || instamartItemMeta.productLongDescription != null) {
            dVar.E(serialDescriptor, 0, a1.f23069b, instamartItemMeta.productLongDescription);
        }
        if (dVar.o(serialDescriptor, 1) || instamartItemMeta.productShortDescription != null) {
            dVar.E(serialDescriptor, 1, a1.f23069b, instamartItemMeta.productShortDescription);
        }
        if (dVar.o(serialDescriptor, 2) || instamartItemMeta.disclaimer != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 2, a1.f23069b, instamartItemMeta.disclaimer);
        }
    }

    public final String component1() {
        return this.productLongDescription;
    }

    public final String component2() {
        return this.productShortDescription;
    }

    public final String component3() {
        return this.disclaimer;
    }

    public final InstamartItemMeta copy(String str, String str2, String str3) {
        return new InstamartItemMeta(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstamartItemMeta)) {
            return false;
        }
        InstamartItemMeta instamartItemMeta = (InstamartItemMeta) obj;
        return p.e(this.productLongDescription, instamartItemMeta.productLongDescription) && p.e(this.productShortDescription, instamartItemMeta.productShortDescription) && p.e(this.disclaimer, instamartItemMeta.disclaimer);
    }

    public final String getDisclaimer() {
        return this.disclaimer;
    }

    public final String getProductLongDescription() {
        return this.productLongDescription;
    }

    public final String getProductShortDescription() {
        return this.productShortDescription;
    }

    public int hashCode() {
        String str = this.productLongDescription;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productShortDescription;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.disclaimer;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return hashCode2 + i11;
    }

    public String toString() {
        return "InstamartItemMeta(productLongDescription=" + this.productLongDescription + ", productShortDescription=" + this.productShortDescription + ", disclaimer=" + this.disclaimer + ')';
    }

    public InstamartItemMeta(String str, String str2, String str3) {
        this.productLongDescription = str;
        this.productShortDescription = str2;
        this.disclaimer = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InstamartItemMeta(String str, String str2, String str3, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InstamartItemMeta(MartMenuMeta martMenuMeta) {
        this(martMenuMeta.getShortDescription(), martMenuMeta.getLongDescription(), martMenuMeta.getDisclaimer());
        p.j(martMenuMeta, "meta");
    }
}
