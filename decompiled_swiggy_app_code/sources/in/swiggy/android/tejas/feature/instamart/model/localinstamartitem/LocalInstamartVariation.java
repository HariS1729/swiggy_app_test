package in.swiggy.android.tejas.feature.instamart.model.localinstamartitem;

import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import com.truecaller.android.sdk.TruecallerSdkScope;
import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.w;
import gq0.x0;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemCartAllowedQty;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemCartAllowedQty$$serializer;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension$$serializer;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory$$serializer;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta$$serializer;
import in.swiggy.android.tejas.feature.trackv3.responsedatatypes.TrackOrderType;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: LocalInstamartVariation.kt */
public final class LocalInstamartVariation {
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("cart_allowed_quantity")
    private final InstamartItemCartAllowedQty cartAllowedQuantity;
    @SerializedName("default")

    /* renamed from: default  reason: not valid java name */
    private final boolean f1default;
    @SerializedName("dimensions")
    private final InstamartItemDimension dimensions;
    @SerializedName("display_name")
    private final String displayName;
    @SerializedName("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f20255id;
    @SerializedName("images")
    private final List<String> images;
    @SerializedName("inventory")
    private final InstamartItemInventory inventory;
    @SerializedName("max_allowed_quantity")
    private final Integer maxAllowedQuantity;
    @SerializedName("meta")
    private final InstamartItemMeta meta;
    @SerializedName("price")
    private final LocalInstamartPrice price;
    @SerializedName("quantity")
    private final String quantity;
    @SerializedName("sku_slot_info")
    private final SkuSlotInfo skuSlotInfo;
    @SerializedName("spin")
    private final String spin;
    @SerializedName("sub_category_type")
    private final String subCategoryType;
    @SerializedName("weight_in_grams")
    private final Integer weightInGrams;

    /* compiled from: LocalInstamartVariation.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<LocalInstamartVariation> serializer() {
            return LocalInstamartVariation$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LocalInstamartVariation(int i11, boolean z11, String str, String str2, String str3, LocalInstamartPrice localInstamartPrice, String str4, InstamartItemInventory instamartItemInventory, InstamartItemCartAllowedQty instamartItemCartAllowedQty, Integer num, Integer num2, String str5, InstamartItemDimension instamartItemDimension, InstamartItemMeta instamartItemMeta, List list, SkuSlotInfo skuSlotInfo2, x0 x0Var) {
        int i12 = i11;
        if ((i12 & 1) != 0) {
            this.f1default = z11;
            if ((i12 & 2) != 0) {
                this.f20255id = str;
                if ((i12 & 4) == 0) {
                    this.displayName = null;
                } else {
                    this.displayName = str2;
                }
                if ((i12 & 8) == 0) {
                    this.spin = null;
                } else {
                    this.spin = str3;
                }
                if ((i12 & 16) == 0) {
                    this.price = null;
                } else {
                    this.price = localInstamartPrice;
                }
                if ((i12 & 32) == 0) {
                    this.quantity = null;
                } else {
                    this.quantity = str4;
                }
                if ((i12 & 64) == 0) {
                    this.inventory = null;
                } else {
                    this.inventory = instamartItemInventory;
                }
                if ((i12 & 128) == 0) {
                    this.cartAllowedQuantity = null;
                } else {
                    this.cartAllowedQuantity = instamartItemCartAllowedQty;
                }
                if ((i12 & 256) == 0) {
                    this.maxAllowedQuantity = null;
                } else {
                    this.maxAllowedQuantity = num;
                }
                if ((i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) == 0) {
                    this.weightInGrams = null;
                } else {
                    this.weightInGrams = num2;
                }
                if ((i12 & 1024) == 0) {
                    this.subCategoryType = null;
                } else {
                    this.subCategoryType = str5;
                }
                if ((i12 & 2048) == 0) {
                    this.dimensions = null;
                } else {
                    this.dimensions = instamartItemDimension;
                }
                if ((i12 & 4096) != 0) {
                    this.meta = instamartItemMeta;
                    if ((i12 & 8192) != 0) {
                        this.images = list;
                        if ((i12 & 16384) == 0) {
                            this.skuSlotInfo = null;
                        } else {
                            this.skuSlotInfo = skuSlotInfo2;
                        }
                    } else {
                        throw new MissingFieldException("images");
                    }
                } else {
                    throw new MissingFieldException("meta");
                }
            } else {
                throw new MissingFieldException(DistributedTracing.NR_ID_ATTRIBUTE);
            }
        } else {
            throw new MissingFieldException(TrackOrderType.DEFAULT);
        }
    }

    public static /* synthetic */ LocalInstamartVariation copy$default(LocalInstamartVariation localInstamartVariation, boolean z11, String str, String str2, String str3, LocalInstamartPrice localInstamartPrice, String str4, InstamartItemInventory instamartItemInventory, InstamartItemCartAllowedQty instamartItemCartAllowedQty, Integer num, Integer num2, String str5, InstamartItemDimension instamartItemDimension, InstamartItemMeta instamartItemMeta, List list, SkuSlotInfo skuSlotInfo2, int i11, Object obj) {
        LocalInstamartVariation localInstamartVariation2 = localInstamartVariation;
        int i12 = i11;
        return localInstamartVariation.copy((i12 & 1) != 0 ? localInstamartVariation2.f1default : z11, (i12 & 2) != 0 ? localInstamartVariation2.f20255id : str, (i12 & 4) != 0 ? localInstamartVariation2.displayName : str2, (i12 & 8) != 0 ? localInstamartVariation2.spin : str3, (i12 & 16) != 0 ? localInstamartVariation2.price : localInstamartPrice, (i12 & 32) != 0 ? localInstamartVariation2.quantity : str4, (i12 & 64) != 0 ? localInstamartVariation2.inventory : instamartItemInventory, (i12 & 128) != 0 ? localInstamartVariation2.cartAllowedQuantity : instamartItemCartAllowedQty, (i12 & 256) != 0 ? localInstamartVariation2.maxAllowedQuantity : num, (i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? localInstamartVariation2.weightInGrams : num2, (i12 & 1024) != 0 ? localInstamartVariation2.subCategoryType : str5, (i12 & 2048) != 0 ? localInstamartVariation2.dimensions : instamartItemDimension, (i12 & 4096) != 0 ? localInstamartVariation2.meta : instamartItemMeta, (i12 & 8192) != 0 ? localInstamartVariation2.images : list, (i12 & 16384) != 0 ? localInstamartVariation2.skuSlotInfo : skuSlotInfo2);
    }

    public static final void write$Self(LocalInstamartVariation localInstamartVariation, d dVar, SerialDescriptor serialDescriptor) {
        p.j(localInstamartVariation, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        dVar.m(serialDescriptor, 0, localInstamartVariation.f1default);
        dVar.n(serialDescriptor, 1, localInstamartVariation.f20255id);
        if (dVar.o(serialDescriptor, 2) || localInstamartVariation.displayName != null) {
            dVar.E(serialDescriptor, 2, a1.f23069b, localInstamartVariation.displayName);
        }
        if (dVar.o(serialDescriptor, 3) || localInstamartVariation.spin != null) {
            dVar.E(serialDescriptor, 3, a1.f23069b, localInstamartVariation.spin);
        }
        if (dVar.o(serialDescriptor, 4) || localInstamartVariation.price != null) {
            dVar.E(serialDescriptor, 4, LocalInstamartPrice$$serializer.INSTANCE, localInstamartVariation.price);
        }
        if (dVar.o(serialDescriptor, 5) || localInstamartVariation.quantity != null) {
            dVar.E(serialDescriptor, 5, a1.f23069b, localInstamartVariation.quantity);
        }
        if (dVar.o(serialDescriptor, 6) || localInstamartVariation.inventory != null) {
            dVar.E(serialDescriptor, 6, InstamartItemInventory$$serializer.INSTANCE, localInstamartVariation.inventory);
        }
        if (dVar.o(serialDescriptor, 7) || localInstamartVariation.cartAllowedQuantity != null) {
            dVar.E(serialDescriptor, 7, InstamartItemCartAllowedQty$$serializer.INSTANCE, localInstamartVariation.cartAllowedQuantity);
        }
        if (dVar.o(serialDescriptor, 8) || localInstamartVariation.maxAllowedQuantity != null) {
            dVar.E(serialDescriptor, 8, w.f23130b, localInstamartVariation.maxAllowedQuantity);
        }
        if (dVar.o(serialDescriptor, 9) || localInstamartVariation.weightInGrams != null) {
            dVar.E(serialDescriptor, 9, w.f23130b, localInstamartVariation.weightInGrams);
        }
        if (dVar.o(serialDescriptor, 10) || localInstamartVariation.subCategoryType != null) {
            dVar.E(serialDescriptor, 10, a1.f23069b, localInstamartVariation.subCategoryType);
        }
        if (dVar.o(serialDescriptor, 11) || localInstamartVariation.dimensions != null) {
            dVar.E(serialDescriptor, 11, InstamartItemDimension$$serializer.INSTANCE, localInstamartVariation.dimensions);
        }
        dVar.E(serialDescriptor, 12, InstamartItemMeta$$serializer.INSTANCE, localInstamartVariation.meta);
        dVar.E(serialDescriptor, 13, new f(a1.f23069b), localInstamartVariation.images);
        if (dVar.o(serialDescriptor, 14) || localInstamartVariation.skuSlotInfo != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 14, SkuSlotInfo$$serializer.INSTANCE, localInstamartVariation.skuSlotInfo);
        }
    }

    public final boolean component1() {
        return this.f1default;
    }

    public final Integer component10() {
        return this.weightInGrams;
    }

    public final String component11() {
        return this.subCategoryType;
    }

    public final InstamartItemDimension component12() {
        return this.dimensions;
    }

    public final InstamartItemMeta component13() {
        return this.meta;
    }

    public final List<String> component14() {
        return this.images;
    }

    public final SkuSlotInfo component15() {
        return this.skuSlotInfo;
    }

    public final String component2() {
        return this.f20255id;
    }

    public final String component3() {
        return this.displayName;
    }

    public final String component4() {
        return this.spin;
    }

    public final LocalInstamartPrice component5() {
        return this.price;
    }

    public final String component6() {
        return this.quantity;
    }

    public final InstamartItemInventory component7() {
        return this.inventory;
    }

    public final InstamartItemCartAllowedQty component8() {
        return this.cartAllowedQuantity;
    }

    public final Integer component9() {
        return this.maxAllowedQuantity;
    }

    public final LocalInstamartVariation copy(boolean z11, String str, String str2, String str3, LocalInstamartPrice localInstamartPrice, String str4, InstamartItemInventory instamartItemInventory, InstamartItemCartAllowedQty instamartItemCartAllowedQty, Integer num, Integer num2, String str5, InstamartItemDimension instamartItemDimension, InstamartItemMeta instamartItemMeta, List<String> list, SkuSlotInfo skuSlotInfo2) {
        String str6 = str;
        p.j(str6, DistributedTracing.NR_ID_ATTRIBUTE);
        return new LocalInstamartVariation(z11, str6, str2, str3, localInstamartPrice, str4, instamartItemInventory, instamartItemCartAllowedQty, num, num2, str5, instamartItemDimension, instamartItemMeta, list, skuSlotInfo2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalInstamartVariation)) {
            return false;
        }
        LocalInstamartVariation localInstamartVariation = (LocalInstamartVariation) obj;
        return this.f1default == localInstamartVariation.f1default && p.e(this.f20255id, localInstamartVariation.f20255id) && p.e(this.displayName, localInstamartVariation.displayName) && p.e(this.spin, localInstamartVariation.spin) && p.e(this.price, localInstamartVariation.price) && p.e(this.quantity, localInstamartVariation.quantity) && p.e(this.inventory, localInstamartVariation.inventory) && p.e(this.cartAllowedQuantity, localInstamartVariation.cartAllowedQuantity) && p.e(this.maxAllowedQuantity, localInstamartVariation.maxAllowedQuantity) && p.e(this.weightInGrams, localInstamartVariation.weightInGrams) && p.e(this.subCategoryType, localInstamartVariation.subCategoryType) && p.e(this.dimensions, localInstamartVariation.dimensions) && p.e(this.meta, localInstamartVariation.meta) && p.e(this.images, localInstamartVariation.images) && p.e(this.skuSlotInfo, localInstamartVariation.skuSlotInfo);
    }

    public final InstamartItemCartAllowedQty getCartAllowedQuantity() {
        return this.cartAllowedQuantity;
    }

    public final boolean getDefault() {
        return this.f1default;
    }

    public final InstamartItemDimension getDimensions() {
        return this.dimensions;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getId() {
        return this.f20255id;
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

    public final LocalInstamartPrice getPrice() {
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

    public final Integer getWeightInGrams() {
        return this.weightInGrams;
    }

    public int hashCode() {
        boolean z11 = this.f1default;
        if (z11) {
            z11 = true;
        }
        int hashCode = (((z11 ? 1 : 0) * true) + this.f20255id.hashCode()) * 31;
        String str = this.displayName;
        int i11 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.spin;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocalInstamartPrice localInstamartPrice = this.price;
        int hashCode4 = (hashCode3 + (localInstamartPrice == null ? 0 : localInstamartPrice.hashCode())) * 31;
        String str3 = this.quantity;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        InstamartItemInventory instamartItemInventory = this.inventory;
        int hashCode6 = (hashCode5 + (instamartItemInventory == null ? 0 : instamartItemInventory.hashCode())) * 31;
        InstamartItemCartAllowedQty instamartItemCartAllowedQty = this.cartAllowedQuantity;
        int hashCode7 = (hashCode6 + (instamartItemCartAllowedQty == null ? 0 : instamartItemCartAllowedQty.hashCode())) * 31;
        Integer num = this.maxAllowedQuantity;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.weightInGrams;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.subCategoryType;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        InstamartItemDimension instamartItemDimension = this.dimensions;
        int hashCode11 = (hashCode10 + (instamartItemDimension == null ? 0 : instamartItemDimension.hashCode())) * 31;
        InstamartItemMeta instamartItemMeta = this.meta;
        int hashCode12 = (hashCode11 + (instamartItemMeta == null ? 0 : instamartItemMeta.hashCode())) * 31;
        List<String> list = this.images;
        int hashCode13 = (hashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        SkuSlotInfo skuSlotInfo2 = this.skuSlotInfo;
        if (skuSlotInfo2 != null) {
            i11 = skuSlotInfo2.hashCode();
        }
        return hashCode13 + i11;
    }

    public String toString() {
        return "LocalInstamartVariation(default=" + this.f1default + ", id=" + this.f20255id + ", displayName=" + this.displayName + ", spin=" + this.spin + ", price=" + this.price + ", quantity=" + this.quantity + ", inventory=" + this.inventory + ", cartAllowedQuantity=" + this.cartAllowedQuantity + ", maxAllowedQuantity=" + this.maxAllowedQuantity + ", weightInGrams=" + this.weightInGrams + ", subCategoryType=" + this.subCategoryType + ", dimensions=" + this.dimensions + ", meta=" + this.meta + ", images=" + this.images + ", skuSlotInfo=" + this.skuSlotInfo + ')';
    }

    public LocalInstamartVariation(boolean z11, String str, String str2, String str3, LocalInstamartPrice localInstamartPrice, String str4, InstamartItemInventory instamartItemInventory, InstamartItemCartAllowedQty instamartItemCartAllowedQty, Integer num, Integer num2, String str5, InstamartItemDimension instamartItemDimension, InstamartItemMeta instamartItemMeta, List<String> list, SkuSlotInfo skuSlotInfo2) {
        p.j(str, DistributedTracing.NR_ID_ATTRIBUTE);
        this.f1default = z11;
        this.f20255id = str;
        this.displayName = str2;
        this.spin = str3;
        this.price = localInstamartPrice;
        this.quantity = str4;
        this.inventory = instamartItemInventory;
        this.cartAllowedQuantity = instamartItemCartAllowedQty;
        this.maxAllowedQuantity = num;
        this.weightInGrams = num2;
        this.subCategoryType = str5;
        this.dimensions = instamartItemDimension;
        this.meta = instamartItemMeta;
        this.images = list;
        this.skuSlotInfo = skuSlotInfo2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ LocalInstamartVariation(boolean r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartPrice r24, java.lang.String r25, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory r26, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemCartAllowedQty r27, java.lang.Integer r28, java.lang.Integer r29, java.lang.String r30, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension r31, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta r32, java.util.List r33, in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.SkuSlotInfo r34, int r35, kotlin.jvm.internal.i r36) {
        /*
            r19 = this;
            r0 = r35
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r22
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r7 = r2
            goto L_0x0013
        L_0x0011:
            r7 = r23
        L_0x0013:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0019
            r8 = r2
            goto L_0x001b
        L_0x0019:
            r8 = r24
        L_0x001b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0021
            r9 = r2
            goto L_0x0023
        L_0x0021:
            r9 = r25
        L_0x0023:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0029
            r10 = r2
            goto L_0x002b
        L_0x0029:
            r10 = r26
        L_0x002b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0031
            r11 = r2
            goto L_0x0033
        L_0x0031:
            r11 = r27
        L_0x0033:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0039
            r12 = r2
            goto L_0x003b
        L_0x0039:
            r12 = r28
        L_0x003b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0041
            r13 = r2
            goto L_0x0043
        L_0x0041:
            r13 = r29
        L_0x0043:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0049
            r14 = r2
            goto L_0x004b
        L_0x0049:
            r14 = r30
        L_0x004b:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0051
            r15 = r2
            goto L_0x0053
        L_0x0051:
            r15 = r31
        L_0x0053:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x005a
            r18 = r2
            goto L_0x005c
        L_0x005a:
            r18 = r34
        L_0x005c:
            r3 = r19
            r4 = r20
            r5 = r21
            r16 = r32
            r17 = r33
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartVariation.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartPrice, java.lang.String, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemInventory, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemCartAllowedQty, java.lang.Integer, java.lang.Integer, java.lang.String, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemDimension, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMeta, java.util.List, in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.SkuSlotInfo, int, kotlin.jvm.internal.i):void");
    }
}
