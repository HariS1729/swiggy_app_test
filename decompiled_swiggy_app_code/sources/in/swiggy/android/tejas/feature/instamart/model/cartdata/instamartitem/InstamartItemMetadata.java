package in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem;

import com.google.gson.annotations.SerializedName;
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

/* compiled from: InstamartItemMetadata.kt */
public final class InstamartItemMetadata {
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("display_name")
    private final String displayName;
    @SerializedName("in_stock")
    private final Boolean inStock;
    @SerializedName("is_avail")
    private final Boolean isAvail;
    @SerializedName("max_allowed_quantity")
    private final Integer maxAllowedQuantity;
    @SerializedName("product_id")
    private final String productId;
    @SerializedName("sub_category_type")
    private final String subCategoryType;
    @SerializedName("sub_category_type_max_allowed_quantity")
    private final Integer subCategoryTypeMaxAllowedQuantity;
    @SerializedName("variations")
    private final List<InstamartItemVariation> variations;
    @SerializedName("weight_in_grams")
    private final Integer weightInGrams;

    /* compiled from: InstamartItemMetadata.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<InstamartItemMetadata> serializer() {
            return InstamartItemMetadata$$serializer.INSTANCE;
        }
    }

    public InstamartItemMetadata() {
        this((String) null, (String) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (List) null, 511, (i) null);
    }

    public /* synthetic */ InstamartItemMetadata(int i11, String str, String str2, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, String str3, List list, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.productId = null;
        } else {
            this.productId = str;
        }
        if ((i11 & 2) == 0) {
            this.displayName = null;
        } else {
            this.displayName = str2;
        }
        if ((i11 & 4) == 0) {
            this.isAvail = null;
        } else {
            this.isAvail = bool;
        }
        if ((i11 & 8) == 0) {
            this.inStock = null;
        } else {
            this.inStock = bool2;
        }
        if ((i11 & 16) == 0) {
            this.maxAllowedQuantity = null;
        } else {
            this.maxAllowedQuantity = num;
        }
        if ((i11 & 32) == 0) {
            this.weightInGrams = null;
        } else {
            this.weightInGrams = num2;
        }
        if ((i11 & 64) == 0) {
            this.subCategoryTypeMaxAllowedQuantity = null;
        } else {
            this.subCategoryTypeMaxAllowedQuantity = num3;
        }
        if ((i11 & 128) == 0) {
            this.subCategoryType = null;
        } else {
            this.subCategoryType = str3;
        }
        if ((i11 & 256) == 0) {
            this.variations = null;
        } else {
            this.variations = list;
        }
    }

    public static /* synthetic */ InstamartItemMetadata copy$default(InstamartItemMetadata instamartItemMetadata, String str, String str2, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, String str3, List list, int i11, Object obj) {
        InstamartItemMetadata instamartItemMetadata2 = instamartItemMetadata;
        int i12 = i11;
        return instamartItemMetadata.copy((i12 & 1) != 0 ? instamartItemMetadata2.productId : str, (i12 & 2) != 0 ? instamartItemMetadata2.displayName : str2, (i12 & 4) != 0 ? instamartItemMetadata2.isAvail : bool, (i12 & 8) != 0 ? instamartItemMetadata2.inStock : bool2, (i12 & 16) != 0 ? instamartItemMetadata2.maxAllowedQuantity : num, (i12 & 32) != 0 ? instamartItemMetadata2.weightInGrams : num2, (i12 & 64) != 0 ? instamartItemMetadata2.subCategoryTypeMaxAllowedQuantity : num3, (i12 & 128) != 0 ? instamartItemMetadata2.subCategoryType : str3, (i12 & 256) != 0 ? instamartItemMetadata2.variations : list);
    }

    public static /* synthetic */ void getDisplayName$annotations() {
    }

    public static /* synthetic */ void getInStock$annotations() {
    }

    public static /* synthetic */ void getMaxAllowedQuantity$annotations() {
    }

    public static /* synthetic */ void getProductId$annotations() {
    }

    public static /* synthetic */ void getSubCategoryType$annotations() {
    }

    public static /* synthetic */ void getSubCategoryTypeMaxAllowedQuantity$annotations() {
    }

    public static /* synthetic */ void getVariations$annotations() {
    }

    public static /* synthetic */ void getWeightInGrams$annotations() {
    }

    public static /* synthetic */ void isAvail$annotations() {
    }

    public static final void write$Self(InstamartItemMetadata instamartItemMetadata, d dVar, SerialDescriptor serialDescriptor) {
        p.j(instamartItemMetadata, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || instamartItemMetadata.productId != null) {
            dVar.E(serialDescriptor, 0, a1.f23069b, instamartItemMetadata.productId);
        }
        if (dVar.o(serialDescriptor, 1) || instamartItemMetadata.displayName != null) {
            dVar.E(serialDescriptor, 1, a1.f23069b, instamartItemMetadata.displayName);
        }
        if (dVar.o(serialDescriptor, 2) || instamartItemMetadata.isAvail != null) {
            dVar.E(serialDescriptor, 2, h.f23089b, instamartItemMetadata.isAvail);
        }
        if (dVar.o(serialDescriptor, 3) || instamartItemMetadata.inStock != null) {
            dVar.E(serialDescriptor, 3, h.f23089b, instamartItemMetadata.inStock);
        }
        if (dVar.o(serialDescriptor, 4) || instamartItemMetadata.maxAllowedQuantity != null) {
            dVar.E(serialDescriptor, 4, w.f23130b, instamartItemMetadata.maxAllowedQuantity);
        }
        if (dVar.o(serialDescriptor, 5) || instamartItemMetadata.weightInGrams != null) {
            dVar.E(serialDescriptor, 5, w.f23130b, instamartItemMetadata.weightInGrams);
        }
        if (dVar.o(serialDescriptor, 6) || instamartItemMetadata.subCategoryTypeMaxAllowedQuantity != null) {
            dVar.E(serialDescriptor, 6, w.f23130b, instamartItemMetadata.subCategoryTypeMaxAllowedQuantity);
        }
        if (dVar.o(serialDescriptor, 7) || instamartItemMetadata.subCategoryType != null) {
            dVar.E(serialDescriptor, 7, a1.f23069b, instamartItemMetadata.subCategoryType);
        }
        if (dVar.o(serialDescriptor, 8) || instamartItemMetadata.variations != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 8, new f(InstamartItemVariation$$serializer.INSTANCE), instamartItemMetadata.variations);
        }
    }

    public final String component1() {
        return this.productId;
    }

    public final String component2() {
        return this.displayName;
    }

    public final Boolean component3() {
        return this.isAvail;
    }

    public final Boolean component4() {
        return this.inStock;
    }

    public final Integer component5() {
        return this.maxAllowedQuantity;
    }

    public final Integer component6() {
        return this.weightInGrams;
    }

    public final Integer component7() {
        return this.subCategoryTypeMaxAllowedQuantity;
    }

    public final String component8() {
        return this.subCategoryType;
    }

    public final List<InstamartItemVariation> component9() {
        return this.variations;
    }

    public final InstamartItemMetadata copy(String str, String str2, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, String str3, List<InstamartItemVariation> list) {
        return new InstamartItemMetadata(str, str2, bool, bool2, num, num2, num3, str3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstamartItemMetadata)) {
            return false;
        }
        InstamartItemMetadata instamartItemMetadata = (InstamartItemMetadata) obj;
        return p.e(this.productId, instamartItemMetadata.productId) && p.e(this.displayName, instamartItemMetadata.displayName) && p.e(this.isAvail, instamartItemMetadata.isAvail) && p.e(this.inStock, instamartItemMetadata.inStock) && p.e(this.maxAllowedQuantity, instamartItemMetadata.maxAllowedQuantity) && p.e(this.weightInGrams, instamartItemMetadata.weightInGrams) && p.e(this.subCategoryTypeMaxAllowedQuantity, instamartItemMetadata.subCategoryTypeMaxAllowedQuantity) && p.e(this.subCategoryType, instamartItemMetadata.subCategoryType) && p.e(this.variations, instamartItemMetadata.variations);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Boolean getInStock() {
        return this.inStock;
    }

    public final Integer getMaxAllowedQuantity() {
        return this.maxAllowedQuantity;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getSubCategoryType() {
        return this.subCategoryType;
    }

    public final Integer getSubCategoryTypeMaxAllowedQuantity() {
        return this.subCategoryTypeMaxAllowedQuantity;
    }

    public final List<InstamartItemVariation> getVariations() {
        return this.variations;
    }

    public final Integer getWeightInGrams() {
        return this.weightInGrams;
    }

    public int hashCode() {
        String str = this.productId;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.displayName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isAvail;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.inStock;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.maxAllowedQuantity;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.weightInGrams;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.subCategoryTypeMaxAllowedQuantity;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.subCategoryType;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<InstamartItemVariation> list = this.variations;
        if (list != null) {
            i11 = list.hashCode();
        }
        return hashCode8 + i11;
    }

    public final Boolean isAvail() {
        return this.isAvail;
    }

    public String toString() {
        return "InstamartItemMetadata(productId=" + this.productId + ", displayName=" + this.displayName + ", isAvail=" + this.isAvail + ", inStock=" + this.inStock + ", maxAllowedQuantity=" + this.maxAllowedQuantity + ", weightInGrams=" + this.weightInGrams + ", subCategoryTypeMaxAllowedQuantity=" + this.subCategoryTypeMaxAllowedQuantity + ", subCategoryType=" + this.subCategoryType + ", variations=" + this.variations + ')';
    }

    public InstamartItemMetadata(String str, String str2, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, String str3, List<InstamartItemVariation> list) {
        this.productId = str;
        this.displayName = str2;
        this.isAvail = bool;
        this.inStock = bool2;
        this.maxAllowedQuantity = num;
        this.weightInGrams = num2;
        this.subCategoryTypeMaxAllowedQuantity = num3;
        this.subCategoryType = str3;
        this.variations = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ InstamartItemMetadata(java.lang.String r11, java.lang.String r12, java.lang.Boolean r13, java.lang.Boolean r14, java.lang.Integer r15, java.lang.Integer r16, java.lang.Integer r17, java.lang.String r18, java.util.List r19, int r20, kotlin.jvm.internal.i r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r12
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r13
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r14
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r15
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002e
        L_0x002c:
            r7 = r16
        L_0x002e:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0034
            r8 = r2
            goto L_0x0036
        L_0x0034:
            r8 = r17
        L_0x0036:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003c
            r9 = r2
            goto L_0x003e
        L_0x003c:
            r9 = r18
        L_0x003e:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r2 = r19
        L_0x0045:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemMetadata.<init>(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.util.List, int, kotlin.jvm.internal.i):void");
    }
}
