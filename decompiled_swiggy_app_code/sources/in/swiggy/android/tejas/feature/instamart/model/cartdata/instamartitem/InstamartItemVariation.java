package in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem;

import com.google.gson.annotations.SerializedName;
import com.truecaller.android.sdk.TruecallerSdkScope;
import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.h;
import gq0.w;
import gq0.x0;
import in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.SkuSlotInfo;
import in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.SkuSlotInfo$$serializer;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.apache.pdfbox.pdmodel.interactive.form.PDButton;
import org.apache.pdfbox.pdmodel.interactive.form.PDChoice;

/* compiled from: InstamartItemVariation.kt */
public final class InstamartItemVariation {
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("cart_allowed_quantity")
    private final InstamartItemCartAllowedQty cartAllowedQuantity;
    @SerializedName("category")
    private final String category;
    @SerializedName("commission_code")
    private final String commissionCode;
    @SerializedName("default")

    /* renamed from: default  reason: not valid java name */
    private final Boolean f0default;
    @SerializedName("dimensions")
    private final InstamartItemDimension dimensions;
    @SerializedName("discount")
    private final String discount;
    @SerializedName("display_name")
    private final String displayName;
    @SerializedName("hsn_code")
    private final String hsnCode;
    @SerializedName("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f20254id;
    @SerializedName("images")
    private final List<String> images;
    @SerializedName("inventory")
    private final InstamartItemInventory inventory;
    @SerializedName("max_allowed_quantity")
    private final Integer maxAllowedQuantity;
    @SerializedName("meta")
    private final InstamartItemMeta meta;
    @SerializedName("meta_for_pd")
    private final String metaForPd;
    @SerializedName("price")
    private final InstamartItemPrice price;
    @SerializedName("quantity")
    private final String quantity;
    @SerializedName("skuSlotInfo")
    private final SkuSlotInfo skuSlotInfo;
    @SerializedName("spin")
    private final String spin;
    @SerializedName("sub_category_type")
    private final String subCategoryType;
    @SerializedName("sub_category_type_max_allowed_quantity")
    private final Integer subCategoryTypeMaxAllowedQuantity;
    @SerializedName("super_category")
    private final String superCategory;
    @SerializedName("tags")
    private final List<String> tags;
    @SerializedName("tax_code")
    private final String taxCode;
    @SerializedName("weight_in_grams")
    private final Integer weightInGrams;

    /* compiled from: InstamartItemVariation.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<InstamartItemVariation> serializer() {
            return InstamartItemVariation$$serializer.INSTANCE;
        }
    }

    public InstamartItemVariation() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (InstamartItemPrice) null, (String) null, (String) null, (String) null, (InstamartItemMeta) null, (List) null, (InstamartItemInventory) null, (InstamartItemCartAllowedQty) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (InstamartItemDimension) null, (String) null, (String) null, (SkuSlotInfo) null, (Boolean) null, 16777215, (i) null);
    }

    public /* synthetic */ InstamartItemVariation(int i11, String str, String str2, String str3, String str4, String str5, String str6, List list, InstamartItemPrice instamartItemPrice, String str7, String str8, String str9, InstamartItemMeta instamartItemMeta, List list2, InstamartItemInventory instamartItemInventory, InstamartItemCartAllowedQty instamartItemCartAllowedQty, Integer num, Integer num2, Integer num3, String str10, InstamartItemDimension instamartItemDimension, String str11, String str12, SkuSlotInfo skuSlotInfo2, Boolean bool, x0 x0Var) {
        int i12 = i11;
        if ((i12 & 1) == 0) {
            this.f20254id = null;
        } else {
            this.f20254id = str;
        }
        if ((i12 & 2) == 0) {
            this.taxCode = null;
        } else {
            this.taxCode = str2;
        }
        if ((i12 & 4) == 0) {
            this.commissionCode = null;
        } else {
            this.commissionCode = str3;
        }
        if ((i12 & 8) == 0) {
            this.hsnCode = null;
        } else {
            this.hsnCode = str4;
        }
        if ((i12 & 16) == 0) {
            this.displayName = null;
        } else {
            this.displayName = str5;
        }
        if ((i12 & 32) == 0) {
            this.spin = null;
        } else {
            this.spin = str6;
        }
        if ((i12 & 64) == 0) {
            this.images = null;
        } else {
            this.images = list;
        }
        if ((i12 & 128) == 0) {
            this.price = null;
        } else {
            this.price = instamartItemPrice;
        }
        if ((i12 & 256) == 0) {
            this.discount = null;
        } else {
            this.discount = str7;
        }
        if ((i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) == 0) {
            this.quantity = null;
        } else {
            this.quantity = str8;
        }
        if ((i12 & 1024) == 0) {
            this.metaForPd = null;
        } else {
            this.metaForPd = str9;
        }
        if ((i12 & 2048) == 0) {
            this.meta = null;
        } else {
            this.meta = instamartItemMeta;
        }
        if ((i12 & 4096) == 0) {
            this.tags = null;
        } else {
            this.tags = list2;
        }
        if ((i12 & 8192) == 0) {
            this.inventory = null;
        } else {
            this.inventory = instamartItemInventory;
        }
        if ((i12 & 16384) == 0) {
            this.cartAllowedQuantity = null;
        } else {
            this.cartAllowedQuantity = instamartItemCartAllowedQty;
        }
        if ((32768 & i12) == 0) {
            this.maxAllowedQuantity = null;
        } else {
            this.maxAllowedQuantity = num;
        }
        if ((65536 & i12) == 0) {
            this.weightInGrams = null;
        } else {
            this.weightInGrams = num2;
        }
        if ((131072 & i12) == 0) {
            this.subCategoryTypeMaxAllowedQuantity = null;
        } else {
            this.subCategoryTypeMaxAllowedQuantity = num3;
        }
        if ((262144 & i12) == 0) {
            this.subCategoryType = null;
        } else {
            this.subCategoryType = str10;
        }
        if ((524288 & i12) == 0) {
            this.dimensions = null;
        } else {
            this.dimensions = instamartItemDimension;
        }
        if ((1048576 & i12) == 0) {
            this.category = null;
        } else {
            this.category = str11;
        }
        if ((2097152 & i12) == 0) {
            this.superCategory = null;
        } else {
            this.superCategory = str12;
        }
        if ((4194304 & i12) == 0) {
            this.skuSlotInfo = null;
        } else {
            this.skuSlotInfo = skuSlotInfo2;
        }
        if ((i12 & 8388608) == 0) {
            this.f0default = null;
        } else {
            this.f0default = bool;
        }
    }

    public static /* synthetic */ InstamartItemVariation copy$default(InstamartItemVariation instamartItemVariation, String str, String str2, String str3, String str4, String str5, String str6, List list, InstamartItemPrice instamartItemPrice, String str7, String str8, String str9, InstamartItemMeta instamartItemMeta, List list2, InstamartItemInventory instamartItemInventory, InstamartItemCartAllowedQty instamartItemCartAllowedQty, Integer num, Integer num2, Integer num3, String str10, InstamartItemDimension instamartItemDimension, String str11, String str12, SkuSlotInfo skuSlotInfo2, Boolean bool, int i11, Object obj) {
        InstamartItemVariation instamartItemVariation2 = instamartItemVariation;
        int i12 = i11;
        return instamartItemVariation.copy((i12 & 1) != 0 ? instamartItemVariation2.f20254id : str, (i12 & 2) != 0 ? instamartItemVariation2.taxCode : str2, (i12 & 4) != 0 ? instamartItemVariation2.commissionCode : str3, (i12 & 8) != 0 ? instamartItemVariation2.hsnCode : str4, (i12 & 16) != 0 ? instamartItemVariation2.displayName : str5, (i12 & 32) != 0 ? instamartItemVariation2.spin : str6, (i12 & 64) != 0 ? instamartItemVariation2.images : list, (i12 & 128) != 0 ? instamartItemVariation2.price : instamartItemPrice, (i12 & 256) != 0 ? instamartItemVariation2.discount : str7, (i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? instamartItemVariation2.quantity : str8, (i12 & 1024) != 0 ? instamartItemVariation2.metaForPd : str9, (i12 & 2048) != 0 ? instamartItemVariation2.meta : instamartItemMeta, (i12 & 4096) != 0 ? instamartItemVariation2.tags : list2, (i12 & 8192) != 0 ? instamartItemVariation2.inventory : instamartItemInventory, (i12 & 16384) != 0 ? instamartItemVariation2.cartAllowedQuantity : instamartItemCartAllowedQty, (i12 & 32768) != 0 ? instamartItemVariation2.maxAllowedQuantity : num, (i12 & PDButton.FLAG_PUSHBUTTON) != 0 ? instamartItemVariation2.weightInGrams : num2, (i12 & PDChoice.FLAG_COMBO) != 0 ? instamartItemVariation2.subCategoryTypeMaxAllowedQuantity : num3, (i12 & 262144) != 0 ? instamartItemVariation2.subCategoryType : str10, (i12 & 524288) != 0 ? instamartItemVariation2.dimensions : instamartItemDimension, (i12 & 1048576) != 0 ? instamartItemVariation2.category : str11, (i12 & 2097152) != 0 ? instamartItemVariation2.superCategory : str12, (i12 & 4194304) != 0 ? instamartItemVariation2.skuSlotInfo : skuSlotInfo2, (i12 & 8388608) != 0 ? instamartItemVariation2.f0default : bool);
    }

    public static /* synthetic */ void getCartAllowedQuantity$annotations() {
    }

    public static /* synthetic */ void getCategory$annotations() {
    }

    public static /* synthetic */ void getCommissionCode$annotations() {
    }

    public static /* synthetic */ void getDefault$annotations() {
    }

    public static /* synthetic */ void getDimensions$annotations() {
    }

    public static /* synthetic */ void getDiscount$annotations() {
    }

    public static /* synthetic */ void getDisplayName$annotations() {
    }

    public static /* synthetic */ void getHsnCode$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getImages$annotations() {
    }

    public static /* synthetic */ void getInventory$annotations() {
    }

    public static /* synthetic */ void getMaxAllowedQuantity$annotations() {
    }

    public static /* synthetic */ void getMeta$annotations() {
    }

    public static /* synthetic */ void getMetaForPd$annotations() {
    }

    public static /* synthetic */ void getPrice$annotations() {
    }

    public static /* synthetic */ void getQuantity$annotations() {
    }

    public static /* synthetic */ void getSkuSlotInfo$annotations() {
    }

    public static /* synthetic */ void getSpin$annotations() {
    }

    public static /* synthetic */ void getSubCategoryType$annotations() {
    }

    public static /* synthetic */ void getSubCategoryTypeMaxAllowedQuantity$annotations() {
    }

    public static /* synthetic */ void getSuperCategory$annotations() {
    }

    public static /* synthetic */ void getTags$annotations() {
    }

    public static /* synthetic */ void getTaxCode$annotations() {
    }

    public static /* synthetic */ void getWeightInGrams$annotations() {
    }

    public static final void write$Self(InstamartItemVariation instamartItemVariation, d dVar, SerialDescriptor serialDescriptor) {
        p.j(instamartItemVariation, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || instamartItemVariation.f20254id != null) {
            dVar.E(serialDescriptor, 0, a1.f23069b, instamartItemVariation.f20254id);
        }
        if (dVar.o(serialDescriptor, 1) || instamartItemVariation.taxCode != null) {
            dVar.E(serialDescriptor, 1, a1.f23069b, instamartItemVariation.taxCode);
        }
        if (dVar.o(serialDescriptor, 2) || instamartItemVariation.commissionCode != null) {
            dVar.E(serialDescriptor, 2, a1.f23069b, instamartItemVariation.commissionCode);
        }
        if (dVar.o(serialDescriptor, 3) || instamartItemVariation.hsnCode != null) {
            dVar.E(serialDescriptor, 3, a1.f23069b, instamartItemVariation.hsnCode);
        }
        if (dVar.o(serialDescriptor, 4) || instamartItemVariation.displayName != null) {
            dVar.E(serialDescriptor, 4, a1.f23069b, instamartItemVariation.displayName);
        }
        if (dVar.o(serialDescriptor, 5) || instamartItemVariation.spin != null) {
            dVar.E(serialDescriptor, 5, a1.f23069b, instamartItemVariation.spin);
        }
        if (dVar.o(serialDescriptor, 6) || instamartItemVariation.images != null) {
            dVar.E(serialDescriptor, 6, new f(a1.f23069b), instamartItemVariation.images);
        }
        if (dVar.o(serialDescriptor, 7) || instamartItemVariation.price != null) {
            dVar.E(serialDescriptor, 7, InstamartItemPrice$$serializer.INSTANCE, instamartItemVariation.price);
        }
        if (dVar.o(serialDescriptor, 8) || instamartItemVariation.discount != null) {
            dVar.E(serialDescriptor, 8, a1.f23069b, instamartItemVariation.discount);
        }
        if (dVar.o(serialDescriptor, 9) || instamartItemVariation.quantity != null) {
            dVar.E(serialDescriptor, 9, a1.f23069b, instamartItemVariation.quantity);
        }
        if (dVar.o(serialDescriptor, 10) || instamartItemVariation.metaForPd != null) {
            dVar.E(serialDescriptor, 10, a1.f23069b, instamartItemVariation.metaForPd);
        }
        if (dVar.o(serialDescriptor, 11) || instamartItemVariation.meta != null) {
            dVar.E(serialDescriptor, 11, InstamartItemMeta$$serializer.INSTANCE, instamartItemVariation.meta);
        }
        if (dVar.o(serialDescriptor, 12) || instamartItemVariation.tags != null) {
            dVar.E(serialDescriptor, 12, new f(a1.f23069b), instamartItemVariation.tags);
        }
        if (dVar.o(serialDescriptor, 13) || instamartItemVariation.inventory != null) {
            dVar.E(serialDescriptor, 13, InstamartItemInventory$$serializer.INSTANCE, instamartItemVariation.inventory);
        }
        if (dVar.o(serialDescriptor, 14) || instamartItemVariation.cartAllowedQuantity != null) {
            dVar.E(serialDescriptor, 14, InstamartItemCartAllowedQty$$serializer.INSTANCE, instamartItemVariation.cartAllowedQuantity);
        }
        if (dVar.o(serialDescriptor, 15) || instamartItemVariation.maxAllowedQuantity != null) {
            dVar.E(serialDescriptor, 15, w.f23130b, instamartItemVariation.maxAllowedQuantity);
        }
        if (dVar.o(serialDescriptor, 16) || instamartItemVariation.weightInGrams != null) {
            dVar.E(serialDescriptor, 16, w.f23130b, instamartItemVariation.weightInGrams);
        }
        if (dVar.o(serialDescriptor, 17) || instamartItemVariation.subCategoryTypeMaxAllowedQuantity != null) {
            dVar.E(serialDescriptor, 17, w.f23130b, instamartItemVariation.subCategoryTypeMaxAllowedQuantity);
        }
        if (dVar.o(serialDescriptor, 18) || instamartItemVariation.subCategoryType != null) {
            dVar.E(serialDescriptor, 18, a1.f23069b, instamartItemVariation.subCategoryType);
        }
        if (dVar.o(serialDescriptor, 19) || instamartItemVariation.dimensions != null) {
            dVar.E(serialDescriptor, 19, InstamartItemDimension$$serializer.INSTANCE, instamartItemVariation.dimensions);
        }
        if (dVar.o(serialDescriptor, 20) || instamartItemVariation.category != null) {
            dVar.E(serialDescriptor, 20, a1.f23069b, instamartItemVariation.category);
        }
        if (dVar.o(serialDescriptor, 21) || instamartItemVariation.superCategory != null) {
            dVar.E(serialDescriptor, 21, a1.f23069b, instamartItemVariation.superCategory);
        }
        if (dVar.o(serialDescriptor, 22) || instamartItemVariation.skuSlotInfo != null) {
            dVar.E(serialDescriptor, 22, SkuSlotInfo$$serializer.INSTANCE, instamartItemVariation.skuSlotInfo);
        }
        if (dVar.o(serialDescriptor, 23) || instamartItemVariation.f0default != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 23, h.f23089b, instamartItemVariation.f0default);
        }
    }

    public final String component1() {
        return this.f20254id;
    }

    public final String component10() {
        return this.quantity;
    }

    public final String component11() {
        return this.metaForPd;
    }

    public final InstamartItemMeta component12() {
        return this.meta;
    }

    public final List<String> component13() {
        return this.tags;
    }

    public final InstamartItemInventory component14() {
        return this.inventory;
    }

    public final InstamartItemCartAllowedQty component15() {
        return this.cartAllowedQuantity;
    }

    public final Integer component16() {
        return this.maxAllowedQuantity;
    }

    public final Integer component17() {
        return this.weightInGrams;
    }

    public final Integer component18() {
        return this.subCategoryTypeMaxAllowedQuantity;
    }

    public final String component19() {
        return this.subCategoryType;
    }

    public final String component2() {
        return this.taxCode;
    }

    public final InstamartItemDimension component20() {
        return this.dimensions;
    }

    public final String component21() {
        return this.category;
    }

    public final String component22() {
        return this.superCategory;
    }

    public final SkuSlotInfo component23() {
        return this.skuSlotInfo;
    }

    public final Boolean component24() {
        return this.f0default;
    }

    public final String component3() {
        return this.commissionCode;
    }

    public final String component4() {
        return this.hsnCode;
    }

    public final String component5() {
        return this.displayName;
    }

    public final String component6() {
        return this.spin;
    }

    public final List<String> component7() {
        return this.images;
    }

    public final InstamartItemPrice component8() {
        return this.price;
    }

    public final String component9() {
        return this.discount;
    }

    public final InstamartItemVariation copy(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, InstamartItemPrice instamartItemPrice, String str7, String str8, String str9, InstamartItemMeta instamartItemMeta, List<String> list2, InstamartItemInventory instamartItemInventory, InstamartItemCartAllowedQty instamartItemCartAllowedQty, Integer num, Integer num2, Integer num3, String str10, InstamartItemDimension instamartItemDimension, String str11, String str12, SkuSlotInfo skuSlotInfo2, Boolean bool) {
        return new InstamartItemVariation(str, str2, str3, str4, str5, str6, list, instamartItemPrice, str7, str8, str9, instamartItemMeta, list2, instamartItemInventory, instamartItemCartAllowedQty, num, num2, num3, str10, instamartItemDimension, str11, str12, skuSlotInfo2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstamartItemVariation)) {
            return false;
        }
        InstamartItemVariation instamartItemVariation = (InstamartItemVariation) obj;
        return p.e(this.f20254id, instamartItemVariation.f20254id) && p.e(this.taxCode, instamartItemVariation.taxCode) && p.e(this.commissionCode, instamartItemVariation.commissionCode) && p.e(this.hsnCode, instamartItemVariation.hsnCode) && p.e(this.displayName, instamartItemVariation.displayName) && p.e(this.spin, instamartItemVariation.spin) && p.e(this.images, instamartItemVariation.images) && p.e(this.price, instamartItemVariation.price) && p.e(this.discount, instamartItemVariation.discount) && p.e(this.quantity, instamartItemVariation.quantity) && p.e(this.metaForPd, instamartItemVariation.metaForPd) && p.e(this.meta, instamartItemVariation.meta) && p.e(this.tags, instamartItemVariation.tags) && p.e(this.inventory, instamartItemVariation.inventory) && p.e(this.cartAllowedQuantity, instamartItemVariation.cartAllowedQuantity) && p.e(this.maxAllowedQuantity, instamartItemVariation.maxAllowedQuantity) && p.e(this.weightInGrams, instamartItemVariation.weightInGrams) && p.e(this.subCategoryTypeMaxAllowedQuantity, instamartItemVariation.subCategoryTypeMaxAllowedQuantity) && p.e(this.subCategoryType, instamartItemVariation.subCategoryType) && p.e(this.dimensions, instamartItemVariation.dimensions) && p.e(this.category, instamartItemVariation.category) && p.e(this.superCategory, instamartItemVariation.superCategory) && p.e(this.skuSlotInfo, instamartItemVariation.skuSlotInfo) && p.e(this.f0default, instamartItemVariation.f0default);
    }

    public final InstamartItemCartAllowedQty getCartAllowedQuantity() {
        return this.cartAllowedQuantity;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getCommissionCode() {
        return this.commissionCode;
    }

    public final Boolean getDefault() {
        return this.f0default;
    }

    public final InstamartItemDimension getDimensions() {
        return this.dimensions;
    }

    public final String getDiscount() {
        return this.discount;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getHsnCode() {
        return this.hsnCode;
    }

    public final String getId() {
        return this.f20254id;
    }

    public final List<String> getImages() {
        return this.images;
    }

    public final InstamartItemInventory getInventory() {
        return this.inventory;
    }

    public final Integer getMaxAllowedQuantity() {
        return this.maxAllowedQuantity;
    }

    public final InstamartItemMeta getMeta() {
        return this.meta;
    }

    public final String getMetaForPd() {
        return this.metaForPd;
    }

    public final InstamartItemPrice getPrice() {
        return this.price;
    }

    public final String getQuantity() {
        return this.quantity;
    }

    public final SkuSlotInfo getSkuSlotInfo() {
        return this.skuSlotInfo;
    }

    public final String getSpin() {
        return this.spin;
    }

    public final String getSubCategoryType() {
        return this.subCategoryType;
    }

    public final Integer getSubCategoryTypeMaxAllowedQuantity() {
        return this.subCategoryTypeMaxAllowedQuantity;
    }

    public final String getSuperCategory() {
        return this.superCategory;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getTaxCode() {
        return this.taxCode;
    }

    public final Integer getWeightInGrams() {
        return this.weightInGrams;
    }

    public int hashCode() {
        String str = this.f20254id;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.taxCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.commissionCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.hsnCode;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.displayName;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.spin;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<String> list = this.images;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        InstamartItemPrice instamartItemPrice = this.price;
        int hashCode8 = (hashCode7 + (instamartItemPrice == null ? 0 : instamartItemPrice.hashCode())) * 31;
        String str7 = this.discount;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.quantity;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.metaForPd;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        InstamartItemMeta instamartItemMeta = this.meta;
        int hashCode12 = (hashCode11 + (instamartItemMeta == null ? 0 : instamartItemMeta.hashCode())) * 31;
        List<String> list2 = this.tags;
        int hashCode13 = (hashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        InstamartItemInventory instamartItemInventory = this.inventory;
        int hashCode14 = (hashCode13 + (instamartItemInventory == null ? 0 : instamartItemInventory.hashCode())) * 31;
        InstamartItemCartAllowedQty instamartItemCartAllowedQty = this.cartAllowedQuantity;
        int hashCode15 = (hashCode14 + (instamartItemCartAllowedQty == null ? 0 : instamartItemCartAllowedQty.hashCode())) * 31;
        Integer num = this.maxAllowedQuantity;
        int hashCode16 = (hashCode15 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.weightInGrams;
        int hashCode17 = (hashCode16 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.subCategoryTypeMaxAllowedQuantity;
        int hashCode18 = (hashCode17 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str10 = this.subCategoryType;
        int hashCode19 = (hashCode18 + (str10 == null ? 0 : str10.hashCode())) * 31;
        InstamartItemDimension instamartItemDimension = this.dimensions;
        int hashCode20 = (hashCode19 + (instamartItemDimension == null ? 0 : instamartItemDimension.hashCode())) * 31;
        String str11 = this.category;
        int hashCode21 = (hashCode20 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.superCategory;
        int hashCode22 = (hashCode21 + (str12 == null ? 0 : str12.hashCode())) * 31;
        SkuSlotInfo skuSlotInfo2 = this.skuSlotInfo;
        int hashCode23 = (hashCode22 + (skuSlotInfo2 == null ? 0 : skuSlotInfo2.hashCode())) * 31;
        Boolean bool = this.f0default;
        if (bool != null) {
            i11 = bool.hashCode();
        }
        return hashCode23 + i11;
    }

    public String toString() {
        return "InstamartItemVariation(id=" + this.f20254id + ", taxCode=" + this.taxCode + ", commissionCode=" + this.commissionCode + ", hsnCode=" + this.hsnCode + ", displayName=" + this.displayName + ", spin=" + this.spin + ", images=" + this.images + ", price=" + this.price + ", discount=" + this.discount + ", quantity=" + this.quantity + ", metaForPd=" + this.metaForPd + ", meta=" + this.meta + ", tags=" + this.tags + ", inventory=" + this.inventory + ", cartAllowedQuantity=" + this.cartAllowedQuantity + ", maxAllowedQuantity=" + this.maxAllowedQuantity + ", weightInGrams=" + this.weightInGrams + ", subCategoryTypeMaxAllowedQuantity=" + this.subCategoryTypeMaxAllowedQuantity + ", subCategoryType=" + this.subCategoryType + ", dimensions=" + this.dimensions + ", category=" + this.category + ", superCategory=" + this.superCategory + ", skuSlotInfo=" + this.skuSlotInfo + ", default=" + this.f0default + ')';
    }

    public InstamartItemVariation(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, InstamartItemPrice instamartItemPrice, String str7, String str8, String str9, InstamartItemMeta instamartItemMeta, List<String> list2, InstamartItemInventory instamartItemInventory, InstamartItemCartAllowedQty instamartItemCartAllowedQty, Integer num, Integer num2, Integer num3, String str10, InstamartItemDimension instamartItemDimension, String str11, String str12, SkuSlotInfo skuSlotInfo2, Boolean bool) {
        this.f20254id = str;
        this.taxCode = str2;
        this.commissionCode = str3;
        this.hsnCode = str4;
        this.displayName = str5;
        this.spin = str6;
        this.images = list;
        this.price = instamartItemPrice;
        this.discount = str7;
        this.quantity = str8;
        this.metaForPd = str9;
        this.meta = instamartItemMeta;
        this.tags = list2;
        this.inventory = instamartItemInventory;
        this.cartAllowedQuantity = instamartItemCartAllowedQty;
        this.maxAllowedQuantity = num;
        this.weightInGrams = num2;
        this.subCategoryTypeMaxAllowedQuantity = num3;
        this.subCategoryType = str10;
        this.dimensions = instamartItemDimension;
        this.category = str11;
        this.superCategory = str12;
        this.skuSlotInfo = skuSlotInfo2;
        this.f0default = bool;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ InstamartItemVariation(java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.util.List r32, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemPrice r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta r37, java.util.List r38, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory r39, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemCartAllowedQty r40, java.lang.Integer r41, java.lang.Integer r42, java.lang.Integer r43, java.lang.String r44, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension r45, java.lang.String r46, java.lang.String r47, in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.SkuSlotInfo r48, java.lang.Boolean r49, int r50, kotlin.jvm.internal.i r51) {
        /*
            r25 = this;
            r0 = r50
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r26
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r27
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r28
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r29
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r30
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r31
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r32
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r33
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r34
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r35
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r36
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r37
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r38
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r39
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r40
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r41
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r42
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r43
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a5
            r19 = 0
            goto L_0x00a7
        L_0x00a5:
            r19 = r44
        L_0x00a7:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b0
            r20 = 0
            goto L_0x00b2
        L_0x00b0:
            r20 = r45
        L_0x00b2:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bb
            r21 = 0
            goto L_0x00bd
        L_0x00bb:
            r21 = r46
        L_0x00bd:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00c6
            r22 = 0
            goto L_0x00c8
        L_0x00c6:
            r22 = r47
        L_0x00c8:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00d1
            r23 = 0
            goto L_0x00d3
        L_0x00d1:
            r23 = r48
        L_0x00d3:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r24
            if (r0 == 0) goto L_0x00db
            r0 = 0
            goto L_0x00dd
        L_0x00db:
            r0 = r49
        L_0x00dd:
            r26 = r25
            r27 = r1
            r28 = r3
            r29 = r4
            r30 = r5
            r31 = r6
            r32 = r7
            r33 = r8
            r34 = r9
            r35 = r10
            r36 = r11
            r37 = r12
            r38 = r13
            r39 = r14
            r40 = r15
            r41 = r2
            r42 = r16
            r43 = r17
            r44 = r18
            r45 = r19
            r46 = r20
            r47 = r21
            r48 = r22
            r49 = r23
            r50 = r0
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemVariation.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemPrice, java.lang.String, java.lang.String, java.lang.String, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta, java.util.List, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemCartAllowedQty, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension, java.lang.String, java.lang.String, in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.SkuSlotInfo, java.lang.Boolean, int, kotlin.jvm.internal.i):void");
    }
}
