package in.swiggy.android.tejas.feature.instamart.model.localinstamartitem;

import com.google.gson.annotations.SerializedName;
import fq0.d;
import gq0.x0;
import in.swiggy.android.tejas.feature.listing.instamart.model.MartMenuOfferApplied;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: LocalInstamartOfferApplied.kt */
public final class LocalInstamartOfferApplied {
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("listing_description")
    private final String listingDescription;
    @SerializedName("offer_id")
    private final String offerId;
    @SerializedName("product_description")
    private final String productDescription;

    /* compiled from: LocalInstamartOfferApplied.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<LocalInstamartOfferApplied> serializer() {
            return LocalInstamartOfferApplied$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LocalInstamartOfferApplied(int i11, String str, String str2, String str3, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.offerId = str;
            if ((i11 & 2) != 0) {
                this.listingDescription = str2;
                if ((i11 & 4) != 0) {
                    this.productDescription = str3;
                    return;
                }
                throw new MissingFieldException("productDescription");
            }
            throw new MissingFieldException("listingDescription");
        }
        throw new MissingFieldException("offerId");
    }

    public static /* synthetic */ LocalInstamartOfferApplied copy$default(LocalInstamartOfferApplied localInstamartOfferApplied, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = localInstamartOfferApplied.offerId;
        }
        if ((i11 & 2) != 0) {
            str2 = localInstamartOfferApplied.listingDescription;
        }
        if ((i11 & 4) != 0) {
            str3 = localInstamartOfferApplied.productDescription;
        }
        return localInstamartOfferApplied.copy(str, str2, str3);
    }

    public static final void write$Self(LocalInstamartOfferApplied localInstamartOfferApplied, d dVar, SerialDescriptor serialDescriptor) {
        p.j(localInstamartOfferApplied, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, localInstamartOfferApplied.offerId);
        dVar.n(serialDescriptor, 1, localInstamartOfferApplied.listingDescription);
        dVar.n(serialDescriptor, 2, localInstamartOfferApplied.productDescription);
    }

    public final String component1() {
        return this.offerId;
    }

    public final String component2() {
        return this.listingDescription;
    }

    public final String component3() {
        return this.productDescription;
    }

    public final LocalInstamartOfferApplied copy(String str, String str2, String str3) {
        p.j(str, "offerId");
        p.j(str2, "listingDescription");
        p.j(str3, "productDescription");
        return new LocalInstamartOfferApplied(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalInstamartOfferApplied)) {
            return false;
        }
        LocalInstamartOfferApplied localInstamartOfferApplied = (LocalInstamartOfferApplied) obj;
        return p.e(this.offerId, localInstamartOfferApplied.offerId) && p.e(this.listingDescription, localInstamartOfferApplied.listingDescription) && p.e(this.productDescription, localInstamartOfferApplied.productDescription);
    }

    public final String getListingDescription() {
        return this.listingDescription;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final String getProductDescription() {
        return this.productDescription;
    }

    public int hashCode() {
        return (((this.offerId.hashCode() * 31) + this.listingDescription.hashCode()) * 31) + this.productDescription.hashCode();
    }

    public String toString() {
        return "LocalInstamartOfferApplied(offerId=" + this.offerId + ", listingDescription=" + this.listingDescription + ", productDescription=" + this.productDescription + ')';
    }

    public LocalInstamartOfferApplied(String str, String str2, String str3) {
        p.j(str, "offerId");
        p.j(str2, "listingDescription");
        p.j(str3, "productDescription");
        this.offerId = str;
        this.listingDescription = str2;
        this.productDescription = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LocalInstamartOfferApplied(MartMenuOfferApplied martMenuOfferApplied) {
        this(martMenuOfferApplied.getOfferId(), martMenuOfferApplied.getListingDescription(), martMenuOfferApplied.getProductDescription());
        p.j(martMenuOfferApplied, "offerApplied");
    }
}
