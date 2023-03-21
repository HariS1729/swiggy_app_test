package in.swiggy.android.tejas.feature.instamart.model.localinstamartitem;

import com.google.gson.annotations.SerializedName;
import com.rudderstack.android.sdk.core.ecomm.ECommerceParamNames;
import fq0.d;
import gq0.a1;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: LocalInstamartItem.kt */
public final class LocalInstamartItem {
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("freebie")
    private final boolean freebie;
    @SerializedName("itemId")
    private final String itemId;
    @SerializedName("price")
    private final double price;
    @SerializedName("productId")
    private final String productId;
    @SerializedName("quantity")
    private final int quantity;
    @SerializedName("spin")
    private final String spin;
    @SerializedName("type")
    private final String type;
    @SerializedName("variation")
    private final LocalInstamartVariation variation;

    /* compiled from: LocalInstamartItem.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<LocalInstamartItem> serializer() {
            return LocalInstamartItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LocalInstamartItem(int i11, String str, int i12, String str2, String str3, String str4, double d11, LocalInstamartVariation localInstamartVariation, boolean z11, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.type = str;
            if ((i11 & 2) != 0) {
                this.quantity = i12;
                if ((i11 & 4) != 0) {
                    this.itemId = str2;
                    if ((i11 & 8) != 0) {
                        this.productId = str3;
                        if ((i11 & 16) == 0) {
                            this.spin = null;
                        } else {
                            this.spin = str4;
                        }
                        if ((i11 & 32) != 0) {
                            this.price = d11;
                            if ((i11 & 64) != 0) {
                                this.variation = localInstamartVariation;
                                if ((i11 & 128) != 0) {
                                    this.freebie = z11;
                                    return;
                                }
                                throw new MissingFieldException("freebie");
                            }
                            throw new MissingFieldException("variation");
                        }
                        throw new MissingFieldException(ECommerceParamNames.PRICE);
                    }
                    throw new MissingFieldException("productId");
                }
                throw new MissingFieldException("itemId");
            }
            throw new MissingFieldException(ECommerceParamNames.QUANTITY);
        }
        throw new MissingFieldException("type");
    }

    public static /* synthetic */ LocalInstamartItem copy$default(LocalInstamartItem localInstamartItem, String str, int i11, String str2, String str3, String str4, double d11, LocalInstamartVariation localInstamartVariation, boolean z11, int i12, Object obj) {
        LocalInstamartItem localInstamartItem2 = localInstamartItem;
        int i13 = i12;
        return localInstamartItem.copy((i13 & 1) != 0 ? localInstamartItem2.type : str, (i13 & 2) != 0 ? localInstamartItem2.quantity : i11, (i13 & 4) != 0 ? localInstamartItem2.itemId : str2, (i13 & 8) != 0 ? localInstamartItem2.productId : str3, (i13 & 16) != 0 ? localInstamartItem2.spin : str4, (i13 & 32) != 0 ? localInstamartItem2.price : d11, (i13 & 64) != 0 ? localInstamartItem2.variation : localInstamartVariation, (i13 & 128) != 0 ? localInstamartItem2.freebie : z11);
    }

    public static final void write$Self(LocalInstamartItem localInstamartItem, d dVar, SerialDescriptor serialDescriptor) {
        p.j(localInstamartItem, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        dVar.n(serialDescriptor, 0, localInstamartItem.type);
        dVar.l(serialDescriptor, 1, localInstamartItem.quantity);
        dVar.n(serialDescriptor, 2, localInstamartItem.itemId);
        dVar.n(serialDescriptor, 3, localInstamartItem.productId);
        if (dVar.o(serialDescriptor, 4) || localInstamartItem.spin != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 4, a1.f23069b, localInstamartItem.spin);
        }
        dVar.C(serialDescriptor, 5, localInstamartItem.price);
        dVar.v(serialDescriptor, 6, LocalInstamartVariation$$serializer.INSTANCE, localInstamartItem.variation);
        dVar.m(serialDescriptor, 7, localInstamartItem.freebie);
    }

    public final String component1() {
        return this.type;
    }

    public final int component2() {
        return this.quantity;
    }

    public final String component3() {
        return this.itemId;
    }

    public final String component4() {
        return this.productId;
    }

    public final String component5() {
        return this.spin;
    }

    public final double component6() {
        return this.price;
    }

    public final LocalInstamartVariation component7() {
        return this.variation;
    }

    public final boolean component8() {
        return this.freebie;
    }

    public final LocalInstamartItem copy(String str, int i11, String str2, String str3, String str4, double d11, LocalInstamartVariation localInstamartVariation, boolean z11) {
        p.j(str, "type");
        p.j(str2, "itemId");
        p.j(str3, "productId");
        LocalInstamartVariation localInstamartVariation2 = localInstamartVariation;
        p.j(localInstamartVariation2, "variation");
        return new LocalInstamartItem(str, i11, str2, str3, str4, d11, localInstamartVariation2, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalInstamartItem)) {
            return false;
        }
        LocalInstamartItem localInstamartItem = (LocalInstamartItem) obj;
        return p.e(this.type, localInstamartItem.type) && this.quantity == localInstamartItem.quantity && p.e(this.itemId, localInstamartItem.itemId) && p.e(this.productId, localInstamartItem.productId) && p.e(this.spin, localInstamartItem.spin) && p.e(Double.valueOf(this.price), Double.valueOf(localInstamartItem.price)) && p.e(this.variation, localInstamartItem.variation) && this.freebie == localInstamartItem.freebie;
    }

    public final boolean getFreebie() {
        return this.freebie;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final double getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final String getSpin() {
        return this.spin;
    }

    public final String getType() {
        return this.type;
    }

    public final LocalInstamartVariation getVariation() {
        return this.variation;
    }

    public int hashCode() {
        int hashCode = ((((((this.type.hashCode() * 31) + this.quantity) * 31) + this.itemId.hashCode()) * 31) + this.productId.hashCode()) * 31;
        String str = this.spin;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Double.doubleToLongBits(this.price)) * 31) + this.variation.hashCode()) * 31;
        boolean z11 = this.freebie;
        if (z11) {
            z11 = true;
        }
        return hashCode2 + (z11 ? 1 : 0);
    }

    public String toString() {
        return "LocalInstamartItem(type=" + this.type + ", quantity=" + this.quantity + ", itemId=" + this.itemId + ", productId=" + this.productId + ", spin=" + this.spin + ", price=" + this.price + ", variation=" + this.variation + ", freebie=" + this.freebie + ')';
    }

    public LocalInstamartItem(String str, int i11, String str2, String str3, String str4, double d11, LocalInstamartVariation localInstamartVariation, boolean z11) {
        p.j(str, "type");
        p.j(str2, "itemId");
        p.j(str3, "productId");
        p.j(localInstamartVariation, "variation");
        this.type = str;
        this.quantity = i11;
        this.itemId = str2;
        this.productId = str3;
        this.spin = str4;
        this.price = d11;
        this.variation = localInstamartVariation;
        this.freebie = z11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocalInstamartItem(String str, int i11, String str2, String str3, String str4, double d11, LocalInstamartVariation localInstamartVariation, boolean z11, int i12, i iVar) {
        this(str, i11, str2, str3, (i12 & 16) != 0 ? null : str4, d11, localInstamartVariation, z11);
    }
}
