package in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem;

import com.google.gson.annotations.SerializedName;
import com.truecaller.android.sdk.TruecallerSdkScope;
import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.h;
import gq0.w;
import gq0.x0;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: InstamartItem.kt */
public final class InstamartItem {
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("freebie")
    private final Boolean freebie;
    @SerializedName("imageIds")
    private final List<String> imageIds;
    @SerializedName("itemId")
    private final String itemId;
    @SerializedName("itemVariantId")
    private final String itemVariantId;
    @SerializedName("metadata")
    private final InstamartItemMetadata metadata;
    @SerializedName("name")
    private final String name;
    @SerializedName("outOfStock")
    private final Boolean outOfStock;
    @SerializedName("quantity")
    private final Integer quantity;
    @SerializedName("stockLimited")
    private final Boolean stockLimited;
    @SerializedName("storeId")
    private final Integer storeId;
    @SerializedName("type")
    private final String type;

    /* compiled from: InstamartItem.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<InstamartItem> serializer() {
            return InstamartItem$$serializer.INSTANCE;
        }
    }

    public InstamartItem() {
        this((String) null, (String) null, (Integer) null, (Integer) null, (List) null, (String) null, (String) null, (InstamartItemMetadata) null, (Boolean) null, (Boolean) null, (Boolean) null, 2047, (i) null);
    }

    public /* synthetic */ InstamartItem(int i11, String str, String str2, Integer num, Integer num2, List list, String str3, String str4, InstamartItemMetadata instamartItemMetadata, Boolean bool, Boolean bool2, Boolean bool3, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.itemId = null;
        } else {
            this.itemId = str;
        }
        if ((i11 & 2) == 0) {
            this.itemVariantId = null;
        } else {
            this.itemVariantId = str2;
        }
        if ((i11 & 4) == 0) {
            this.quantity = null;
        } else {
            this.quantity = num;
        }
        if ((i11 & 8) == 0) {
            this.storeId = null;
        } else {
            this.storeId = num2;
        }
        if ((i11 & 16) == 0) {
            this.imageIds = null;
        } else {
            this.imageIds = list;
        }
        if ((i11 & 32) == 0) {
            this.type = null;
        } else {
            this.type = str3;
        }
        if ((i11 & 64) == 0) {
            this.name = null;
        } else {
            this.name = str4;
        }
        if ((i11 & 128) == 0) {
            this.metadata = null;
        } else {
            this.metadata = instamartItemMetadata;
        }
        if ((i11 & 256) == 0) {
            this.outOfStock = null;
        } else {
            this.outOfStock = bool;
        }
        if ((i11 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) == 0) {
            this.stockLimited = null;
        } else {
            this.stockLimited = bool2;
        }
        if ((i11 & 1024) == 0) {
            this.freebie = null;
        } else {
            this.freebie = bool3;
        }
    }

    public static /* synthetic */ InstamartItem copy$default(InstamartItem instamartItem, String str, String str2, Integer num, Integer num2, List list, String str3, String str4, InstamartItemMetadata instamartItemMetadata, Boolean bool, Boolean bool2, Boolean bool3, int i11, Object obj) {
        InstamartItem instamartItem2 = instamartItem;
        int i12 = i11;
        return instamartItem.copy((i12 & 1) != 0 ? instamartItem2.itemId : str, (i12 & 2) != 0 ? instamartItem2.itemVariantId : str2, (i12 & 4) != 0 ? instamartItem2.quantity : num, (i12 & 8) != 0 ? instamartItem2.storeId : num2, (i12 & 16) != 0 ? instamartItem2.imageIds : list, (i12 & 32) != 0 ? instamartItem2.type : str3, (i12 & 64) != 0 ? instamartItem2.name : str4, (i12 & 128) != 0 ? instamartItem2.metadata : instamartItemMetadata, (i12 & 256) != 0 ? instamartItem2.outOfStock : bool, (i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? instamartItem2.stockLimited : bool2, (i12 & 1024) != 0 ? instamartItem2.freebie : bool3);
    }

    public static /* synthetic */ void getFreebie$annotations() {
    }

    public static /* synthetic */ void getImageIds$annotations() {
    }

    public static /* synthetic */ void getItemId$annotations() {
    }

    public static /* synthetic */ void getItemVariantId$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getOutOfStock$annotations() {
    }

    public static /* synthetic */ void getQuantity$annotations() {
    }

    public static /* synthetic */ void getStockLimited$annotations() {
    }

    public static /* synthetic */ void getStoreId$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static final void write$Self(InstamartItem instamartItem, d dVar, SerialDescriptor serialDescriptor) {
        p.j(instamartItem, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || instamartItem.itemId != null) {
            dVar.E(serialDescriptor, 0, a1.f23069b, instamartItem.itemId);
        }
        if (dVar.o(serialDescriptor, 1) || instamartItem.itemVariantId != null) {
            dVar.E(serialDescriptor, 1, a1.f23069b, instamartItem.itemVariantId);
        }
        if (dVar.o(serialDescriptor, 2) || instamartItem.quantity != null) {
            dVar.E(serialDescriptor, 2, w.f23130b, instamartItem.quantity);
        }
        if (dVar.o(serialDescriptor, 3) || instamartItem.storeId != null) {
            dVar.E(serialDescriptor, 3, w.f23130b, instamartItem.storeId);
        }
        if (dVar.o(serialDescriptor, 4) || instamartItem.imageIds != null) {
            dVar.E(serialDescriptor, 4, new f(a1.f23069b), instamartItem.imageIds);
        }
        if (dVar.o(serialDescriptor, 5) || instamartItem.type != null) {
            dVar.E(serialDescriptor, 5, a1.f23069b, instamartItem.type);
        }
        if (dVar.o(serialDescriptor, 6) || instamartItem.name != null) {
            dVar.E(serialDescriptor, 6, a1.f23069b, instamartItem.name);
        }
        if (dVar.o(serialDescriptor, 7) || instamartItem.metadata != null) {
            dVar.E(serialDescriptor, 7, InstamartItemMetadata$$serializer.INSTANCE, instamartItem.metadata);
        }
        if (dVar.o(serialDescriptor, 8) || instamartItem.outOfStock != null) {
            dVar.E(serialDescriptor, 8, h.f23089b, instamartItem.outOfStock);
        }
        if (dVar.o(serialDescriptor, 9) || instamartItem.stockLimited != null) {
            dVar.E(serialDescriptor, 9, h.f23089b, instamartItem.stockLimited);
        }
        if (dVar.o(serialDescriptor, 10) || instamartItem.freebie != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 10, h.f23089b, instamartItem.freebie);
        }
    }

    public final String component1() {
        return this.itemId;
    }

    public final Boolean component10() {
        return this.stockLimited;
    }

    public final Boolean component11() {
        return this.freebie;
    }

    public final String component2() {
        return this.itemVariantId;
    }

    public final Integer component3() {
        return this.quantity;
    }

    public final Integer component4() {
        return this.storeId;
    }

    public final List<String> component5() {
        return this.imageIds;
    }

    public final String component6() {
        return this.type;
    }

    public final String component7() {
        return this.name;
    }

    public final InstamartItemMetadata component8() {
        return this.metadata;
    }

    public final Boolean component9() {
        return this.outOfStock;
    }

    public final InstamartItem copy(String str, String str2, Integer num, Integer num2, List<String> list, String str3, String str4, InstamartItemMetadata instamartItemMetadata, Boolean bool, Boolean bool2, Boolean bool3) {
        return new InstamartItem(str, str2, num, num2, list, str3, str4, instamartItemMetadata, bool, bool2, bool3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstamartItem)) {
            return false;
        }
        InstamartItem instamartItem = (InstamartItem) obj;
        return p.e(this.itemId, instamartItem.itemId) && p.e(this.itemVariantId, instamartItem.itemVariantId) && p.e(this.quantity, instamartItem.quantity) && p.e(this.storeId, instamartItem.storeId) && p.e(this.imageIds, instamartItem.imageIds) && p.e(this.type, instamartItem.type) && p.e(this.name, instamartItem.name) && p.e(this.metadata, instamartItem.metadata) && p.e(this.outOfStock, instamartItem.outOfStock) && p.e(this.stockLimited, instamartItem.stockLimited) && p.e(this.freebie, instamartItem.freebie);
    }

    public final Boolean getFreebie() {
        return this.freebie;
    }

    public final List<String> getImageIds() {
        return this.imageIds;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getItemVariantId() {
        return this.itemVariantId;
    }

    public final InstamartItemMetadata getMetadata() {
        return this.metadata;
    }

    public final String getName() {
        return this.name;
    }

    public final Boolean getOutOfStock() {
        return this.outOfStock;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final Boolean getStockLimited() {
        return this.stockLimited;
    }

    public final Integer getStoreId() {
        return this.storeId;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.itemId;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.itemVariantId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.quantity;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.storeId;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list = this.imageIds;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.type;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        InstamartItemMetadata instamartItemMetadata = this.metadata;
        int hashCode8 = (hashCode7 + (instamartItemMetadata == null ? 0 : instamartItemMetadata.hashCode())) * 31;
        Boolean bool = this.outOfStock;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.stockLimited;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.freebie;
        if (bool3 != null) {
            i11 = bool3.hashCode();
        }
        return hashCode10 + i11;
    }

    public String toString() {
        return "InstamartItem(itemId=" + this.itemId + ", itemVariantId=" + this.itemVariantId + ", quantity=" + this.quantity + ", storeId=" + this.storeId + ", imageIds=" + this.imageIds + ", type=" + this.type + ", name=" + this.name + ", metadata=" + this.metadata + ", outOfStock=" + this.outOfStock + ", stockLimited=" + this.stockLimited + ", freebie=" + this.freebie + ')';
    }

    public InstamartItem(String str, String str2, Integer num, Integer num2, List<String> list, String str3, String str4, InstamartItemMetadata instamartItemMetadata, Boolean bool, Boolean bool2, Boolean bool3) {
        this.itemId = str;
        this.itemVariantId = str2;
        this.quantity = num;
        this.storeId = num2;
        this.imageIds = list;
        this.type = str3;
        this.name = str4;
        this.metadata = instamartItemMetadata;
        this.outOfStock = bool;
        this.stockLimited = bool2;
        this.freebie = bool3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ InstamartItem(java.lang.String r13, java.lang.String r14, java.lang.Integer r15, java.lang.Integer r16, java.util.List r17, java.lang.String r18, java.lang.String r19, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMetadata r20, java.lang.Boolean r21, java.lang.Boolean r22, java.lang.Boolean r23, int r24, kotlin.jvm.internal.i r25) {
        /*
            r12 = this;
            r0 = r24
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r13
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r14
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r15
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x0020
        L_0x001e:
            r5 = r16
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r2
            goto L_0x0028
        L_0x0026:
            r6 = r17
        L_0x0028:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002e
            r7 = r2
            goto L_0x0030
        L_0x002e:
            r7 = r18
        L_0x0030:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0036
            r8 = r2
            goto L_0x0038
        L_0x0036:
            r8 = r19
        L_0x0038:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003e
            r9 = r2
            goto L_0x0040
        L_0x003e:
            r9 = r20
        L_0x0040:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0046
            r10 = r2
            goto L_0x0048
        L_0x0046:
            r10 = r21
        L_0x0048:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x004e
            r11 = r2
            goto L_0x0050
        L_0x004e:
            r11 = r22
        L_0x0050:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r2 = r23
        L_0x0057:
            r13 = r12
            r14 = r1
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItem.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.util.List, java.lang.String, java.lang.String, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMetadata, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, int, kotlin.jvm.internal.i):void");
    }
}
