package in.swiggy.android.tejas.feature.home.model;

import com.google.gson.annotations.SerializedName;
import com.truecaller.android.sdk.TruecallerSdkScope;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ItemPop.kt */
public final class ItemPop {
    public static final Companion Companion = new Companion((i) null);
    public static final int EGG = 3;
    public static final int NON_VEG = 2;
    public static final String OTHER = "OTHER";
    public static final String SERVICEABLE = "SERVICEABLE";
    public static final int UNRECOGNIZED = 4;
    public static final String UNSERVICEABLE = "UNSERVICEABLE";
    public static final int VEG = 1;
    @SerializedName("availability")
    private final Availability availability;
    @SerializedName("basePrice")
    private final float basePrice;
    @SerializedName("description")
    private final String description;
    @SerializedName("imageId")
    private final String imageId;
    @SerializedName("maxQuantityAllowed")
    private final int maxQuantityAllowed;
    @SerializedName("maxQuantityMessage")
    private final String maxQuantityMessage;
    @SerializedName("name")
    private final String name;
    @SerializedName("price")
    private final float price;
    @SerializedName("restaurantId")
    private final String restaurantId;
    @SerializedName("restaurantName")
    private final String restaurantName;
    @SerializedName("serviceability")
    private final String serviceability;
    @SerializedName("showOutOfStock")
    private final boolean showOutOfStock;
    @SerializedName("skuId")
    private final String skuId;
    @SerializedName("type")
    private final int type;

    /* compiled from: ItemPop.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* compiled from: ItemPop.kt */
    public @interface Serviceability {
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* compiled from: ItemPop.kt */
    public @interface Type {
    }

    public ItemPop(String str, String str2, String str3, String str4, boolean z11, String str5, String str6, String str7, float f11, float f12, int i11, @Type int i12, @Serviceability String str8, Availability availability2) {
        p.j(str, "skuId");
        p.j(str2, "name");
        p.j(str3, "description");
        p.j(str4, "imageId");
        p.j(str5, "maxQuantityMessage");
        p.j(str6, "restaurantId");
        p.j(str7, "restaurantName");
        p.j(str8, "serviceability");
        p.j(availability2, "availability");
        this.skuId = str;
        this.name = str2;
        this.description = str3;
        this.imageId = str4;
        this.showOutOfStock = z11;
        this.maxQuantityMessage = str5;
        this.restaurantId = str6;
        this.restaurantName = str7;
        this.price = f11;
        this.basePrice = f12;
        this.maxQuantityAllowed = i11;
        this.type = i12;
        this.serviceability = str8;
        this.availability = availability2;
    }

    public static /* synthetic */ ItemPop copy$default(ItemPop itemPop, String str, String str2, String str3, String str4, boolean z11, String str5, String str6, String str7, float f11, float f12, int i11, int i12, String str8, Availability availability2, int i13, Object obj) {
        ItemPop itemPop2 = itemPop;
        int i14 = i13;
        return itemPop.copy((i14 & 1) != 0 ? itemPop2.skuId : str, (i14 & 2) != 0 ? itemPop2.name : str2, (i14 & 4) != 0 ? itemPop2.description : str3, (i14 & 8) != 0 ? itemPop2.imageId : str4, (i14 & 16) != 0 ? itemPop2.showOutOfStock : z11, (i14 & 32) != 0 ? itemPop2.maxQuantityMessage : str5, (i14 & 64) != 0 ? itemPop2.restaurantId : str6, (i14 & 128) != 0 ? itemPop2.restaurantName : str7, (i14 & 256) != 0 ? itemPop2.price : f11, (i14 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? itemPop2.basePrice : f12, (i14 & 1024) != 0 ? itemPop2.maxQuantityAllowed : i11, (i14 & 2048) != 0 ? itemPop2.type : i12, (i14 & 4096) != 0 ? itemPop2.serviceability : str8, (i14 & 8192) != 0 ? itemPop2.availability : availability2);
    }

    public final String component1() {
        return this.skuId;
    }

    public final float component10() {
        return this.basePrice;
    }

    public final int component11() {
        return this.maxQuantityAllowed;
    }

    public final int component12() {
        return this.type;
    }

    public final String component13() {
        return this.serviceability;
    }

    public final Availability component14() {
        return this.availability;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.imageId;
    }

    public final boolean component5() {
        return this.showOutOfStock;
    }

    public final String component6() {
        return this.maxQuantityMessage;
    }

    public final String component7() {
        return this.restaurantId;
    }

    public final String component8() {
        return this.restaurantName;
    }

    public final float component9() {
        return this.price;
    }

    public final ItemPop copy(String str, String str2, String str3, String str4, boolean z11, String str5, String str6, String str7, float f11, float f12, int i11, @Type int i12, @Serviceability String str8, Availability availability2) {
        String str9 = str;
        p.j(str9, "skuId");
        String str10 = str2;
        p.j(str10, "name");
        String str11 = str3;
        p.j(str11, "description");
        String str12 = str4;
        p.j(str12, "imageId");
        String str13 = str5;
        p.j(str13, "maxQuantityMessage");
        String str14 = str6;
        p.j(str14, "restaurantId");
        String str15 = str7;
        p.j(str15, "restaurantName");
        String str16 = str8;
        p.j(str16, "serviceability");
        Availability availability3 = availability2;
        p.j(availability3, "availability");
        return new ItemPop(str9, str10, str11, str12, z11, str13, str14, str15, f11, f12, i11, i12, str16, availability3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemPop)) {
            return false;
        }
        ItemPop itemPop = (ItemPop) obj;
        return p.e(this.skuId, itemPop.skuId) && p.e(this.name, itemPop.name) && p.e(this.description, itemPop.description) && p.e(this.imageId, itemPop.imageId) && this.showOutOfStock == itemPop.showOutOfStock && p.e(this.maxQuantityMessage, itemPop.maxQuantityMessage) && p.e(this.restaurantId, itemPop.restaurantId) && p.e(this.restaurantName, itemPop.restaurantName) && p.e(Float.valueOf(this.price), Float.valueOf(itemPop.price)) && p.e(Float.valueOf(this.basePrice), Float.valueOf(itemPop.basePrice)) && this.maxQuantityAllowed == itemPop.maxQuantityAllowed && this.type == itemPop.type && p.e(this.serviceability, itemPop.serviceability) && p.e(this.availability, itemPop.availability);
    }

    public final Availability getAvailability() {
        return this.availability;
    }

    public final float getBasePrice() {
        return this.basePrice;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImageId() {
        return this.imageId;
    }

    public final int getMaxQuantityAllowed() {
        return this.maxQuantityAllowed;
    }

    public final String getMaxQuantityMessage() {
        return this.maxQuantityMessage;
    }

    public final String getName() {
        return this.name;
    }

    public final float getPrice() {
        return this.price;
    }

    public final String getRestaurantId() {
        return this.restaurantId;
    }

    public final String getRestaurantName() {
        return this.restaurantName;
    }

    public final String getServiceability() {
        return this.serviceability;
    }

    public final boolean getShowOutOfStock() {
        return this.showOutOfStock;
    }

    public final String getSkuId() {
        return this.skuId;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((((this.skuId.hashCode() * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.imageId.hashCode()) * 31;
        boolean z11 = this.showOutOfStock;
        if (z11) {
            z11 = true;
        }
        return ((((((((((((((((((hashCode + (z11 ? 1 : 0)) * 31) + this.maxQuantityMessage.hashCode()) * 31) + this.restaurantId.hashCode()) * 31) + this.restaurantName.hashCode()) * 31) + Float.floatToIntBits(this.price)) * 31) + Float.floatToIntBits(this.basePrice)) * 31) + this.maxQuantityAllowed) * 31) + this.type) * 31) + this.serviceability.hashCode()) * 31) + this.availability.hashCode();
    }

    public String toString() {
        return "ItemPop(skuId=" + this.skuId + ", name=" + this.name + ", description=" + this.description + ", imageId=" + this.imageId + ", showOutOfStock=" + this.showOutOfStock + ", maxQuantityMessage=" + this.maxQuantityMessage + ", restaurantId=" + this.restaurantId + ", restaurantName=" + this.restaurantName + ", price=" + this.price + ", basePrice=" + this.basePrice + ", maxQuantityAllowed=" + this.maxQuantityAllowed + ", type=" + this.type + ", serviceability=" + this.serviceability + ", availability=" + this.availability + ')';
    }
}
