package in.swiggy.android.tejas.feature.instamart.model.localinstamartitem;

import com.google.gson.annotations.SerializedName;
import com.rudderstack.android.sdk.core.ecomm.ECommerceParamNames;
import fq0.d;
import gq0.x0;
import in.swiggy.android.tejas.feature.listing.instamart.model.MartMenuPrice;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: LocalInstamartPrice.kt */
public final class LocalInstamartPrice {
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("mrp")
    private final double mrp;
    @SerializedName("offer_applied")
    private final LocalInstamartOfferApplied offerApplied;
    @SerializedName("offer_price")
    private final double offerPrice;
    @SerializedName("store_price")
    private final double storePrice;

    /* compiled from: LocalInstamartPrice.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<LocalInstamartPrice> serializer() {
            return LocalInstamartPrice$$serializer.INSTANCE;
        }
    }

    public LocalInstamartPrice(double d11, double d12, double d13, LocalInstamartOfferApplied localInstamartOfferApplied) {
        this.mrp = d11;
        this.storePrice = d12;
        this.offerPrice = d13;
        this.offerApplied = localInstamartOfferApplied;
    }

    public static /* synthetic */ LocalInstamartPrice copy$default(LocalInstamartPrice localInstamartPrice, double d11, double d12, double d13, LocalInstamartOfferApplied localInstamartOfferApplied, int i11, Object obj) {
        LocalInstamartPrice localInstamartPrice2 = localInstamartPrice;
        return localInstamartPrice.copy((i11 & 1) != 0 ? localInstamartPrice2.mrp : d11, (i11 & 2) != 0 ? localInstamartPrice2.storePrice : d12, (i11 & 4) != 0 ? localInstamartPrice2.offerPrice : d13, (i11 & 8) != 0 ? localInstamartPrice2.offerApplied : localInstamartOfferApplied);
    }

    public static final void write$Self(LocalInstamartPrice localInstamartPrice, d dVar, SerialDescriptor serialDescriptor) {
        p.j(localInstamartPrice, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.C(serialDescriptor, 0, localInstamartPrice.mrp);
        dVar.C(serialDescriptor, 1, localInstamartPrice.storePrice);
        dVar.C(serialDescriptor, 2, localInstamartPrice.offerPrice);
        dVar.E(serialDescriptor, 3, LocalInstamartOfferApplied$$serializer.INSTANCE, localInstamartPrice.offerApplied);
    }

    public final double component1() {
        return this.mrp;
    }

    public final double component2() {
        return this.storePrice;
    }

    public final double component3() {
        return this.offerPrice;
    }

    public final LocalInstamartOfferApplied component4() {
        return this.offerApplied;
    }

    public final LocalInstamartPrice copy(double d11, double d12, double d13, LocalInstamartOfferApplied localInstamartOfferApplied) {
        return new LocalInstamartPrice(d11, d12, d13, localInstamartOfferApplied);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalInstamartPrice)) {
            return false;
        }
        LocalInstamartPrice localInstamartPrice = (LocalInstamartPrice) obj;
        return p.e(Double.valueOf(this.mrp), Double.valueOf(localInstamartPrice.mrp)) && p.e(Double.valueOf(this.storePrice), Double.valueOf(localInstamartPrice.storePrice)) && p.e(Double.valueOf(this.offerPrice), Double.valueOf(localInstamartPrice.offerPrice)) && p.e(this.offerApplied, localInstamartPrice.offerApplied);
    }

    public final double getMrp() {
        return this.mrp;
    }

    public final LocalInstamartOfferApplied getOfferApplied() {
        return this.offerApplied;
    }

    public final double getOfferPrice() {
        return this.offerPrice;
    }

    public final double getStorePrice() {
        return this.storePrice;
    }

    public int hashCode() {
        int a11 = ((((Double.doubleToLongBits(this.mrp) * 31) + Double.doubleToLongBits(this.storePrice)) * 31) + Double.doubleToLongBits(this.offerPrice)) * 31;
        LocalInstamartOfferApplied localInstamartOfferApplied = this.offerApplied;
        return a11 + (localInstamartOfferApplied == null ? 0 : localInstamartOfferApplied.hashCode());
    }

    public String toString() {
        return "LocalInstamartPrice(mrp=" + this.mrp + ", storePrice=" + this.storePrice + ", offerPrice=" + this.offerPrice + ", offerApplied=" + this.offerApplied + ')';
    }

    public /* synthetic */ LocalInstamartPrice(int i11, double d11, double d12, double d13, LocalInstamartOfferApplied localInstamartOfferApplied, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.mrp = d11;
            if ((i11 & 2) != 0) {
                this.storePrice = d12;
                if ((i11 & 4) != 0) {
                    this.offerPrice = d13;
                    if ((i11 & 8) != 0) {
                        this.offerApplied = localInstamartOfferApplied;
                        return;
                    }
                    throw new MissingFieldException("offerApplied");
                }
                throw new MissingFieldException("offerPrice");
            }
            throw new MissingFieldException("storePrice");
        }
        throw new MissingFieldException("mrp");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LocalInstamartPrice(MartMenuPrice martMenuPrice) {
        this(martMenuPrice.getMrp(), martMenuPrice.getStorePrice(), martMenuPrice.getOfferPrice(), new LocalInstamartOfferApplied(martMenuPrice.getOfferApplied()));
        p.j(martMenuPrice, ECommerceParamNames.PRICE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r2 = r13.getMrp();
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LocalInstamartPrice(in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemPrice r13) {
        /*
            r12 = this;
            r0 = 0
            if (r13 != 0) goto L_0x0006
        L_0x0004:
            r5 = r0
            goto L_0x0012
        L_0x0006:
            java.lang.Double r2 = r13.getMrp()
            if (r2 != 0) goto L_0x000d
            goto L_0x0004
        L_0x000d:
            double r2 = r2.doubleValue()
            r5 = r2
        L_0x0012:
            if (r13 != 0) goto L_0x0016
        L_0x0014:
            r7 = r0
            goto L_0x0022
        L_0x0016:
            java.lang.Double r2 = r13.getStorePrice()
            if (r2 != 0) goto L_0x001d
            goto L_0x0014
        L_0x001d:
            double r2 = r2.doubleValue()
            r7 = r2
        L_0x0022:
            if (r13 != 0) goto L_0x0026
        L_0x0024:
            r9 = r0
            goto L_0x0032
        L_0x0026:
            java.lang.Double r13 = r13.getOfferPrice()
            if (r13 != 0) goto L_0x002d
            goto L_0x0024
        L_0x002d:
            double r0 = r13.doubleValue()
            goto L_0x0024
        L_0x0032:
            r11 = 0
            r4 = r12
            r4.<init>(r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartPrice.<init>(in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemPrice):void");
    }
}
