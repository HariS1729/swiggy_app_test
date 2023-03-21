package in.swiggy.android.tejas.feature.instamart.model.cartdata;

import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import com.truecaller.android.sdk.TruecallerSdkScope;
import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.s;
import gq0.w;
import gq0.x0;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartLocation;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartLocation$$serializer;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: InstamartStoresInfo.kt */
public final class InstamartStoresInfo {
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("address")
    private final String address;
    @SerializedName("categories")
    private final List<InstamartCategories> categories;
    @SerializedName("id")

    /* renamed from: id  reason: collision with root package name */
    private final int f20253id;
    @SerializedName("imageId")
    private final String imageId;
    @SerializedName("location")
    private final InstamartLocation location;
    @SerializedName("maxAllowedCartVolumeInCc")
    private final Integer maxAllowedCartVolumeInCc;
    @SerializedName("maxAllowedCartWeightInGrams")
    private final Integer maxAllowedCartWeightInGrams;
    @SerializedName("maxAllowedItemsInCart")
    private final Integer maxAllowedItemsInCart;
    @SerializedName("minimumOrderValueInRs")
    private final Integer minimumOrderValueInRs;
    @SerializedName("name")
    private final String name;
    @SerializedName("storeType")
    private final String storeType;
    @SerializedName("subCategoryTypeMaxAllowedWeights")
    private final HashMap<String, Integer> subCategoryTypeMaxAllowedWeights;

    /* compiled from: InstamartStoresInfo.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<InstamartStoresInfo> serializer() {
            return InstamartStoresInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InstamartStoresInfo(int i11, String str, String str2, String str3, int i12, InstamartLocation instamartLocation, List list, String str4, Integer num, Integer num2, Integer num3, Integer num4, HashMap hashMap, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.name = str;
            if ((i11 & 2) == 0) {
                this.address = null;
            } else {
                this.address = str2;
            }
            if ((i11 & 4) == 0) {
                this.imageId = null;
            } else {
                this.imageId = str3;
            }
            if ((i11 & 8) != 0) {
                this.f20253id = i12;
                if ((i11 & 16) == 0) {
                    this.location = null;
                } else {
                    this.location = instamartLocation;
                }
                if ((i11 & 32) == 0) {
                    this.categories = null;
                } else {
                    this.categories = list;
                }
                if ((i11 & 64) == 0) {
                    this.storeType = null;
                } else {
                    this.storeType = str4;
                }
                if ((i11 & 128) == 0) {
                    this.maxAllowedCartWeightInGrams = null;
                } else {
                    this.maxAllowedCartWeightInGrams = num;
                }
                if ((i11 & 256) == 0) {
                    this.maxAllowedCartVolumeInCc = null;
                } else {
                    this.maxAllowedCartVolumeInCc = num2;
                }
                if ((i11 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) == 0) {
                    this.maxAllowedItemsInCart = null;
                } else {
                    this.maxAllowedItemsInCart = num3;
                }
                if ((i11 & 1024) == 0) {
                    this.minimumOrderValueInRs = null;
                } else {
                    this.minimumOrderValueInRs = num4;
                }
                if ((i11 & 2048) == 0) {
                    this.subCategoryTypeMaxAllowedWeights = null;
                } else {
                    this.subCategoryTypeMaxAllowedWeights = hashMap;
                }
            } else {
                throw new MissingFieldException(DistributedTracing.NR_ID_ATTRIBUTE);
            }
        } else {
            throw new MissingFieldException("name");
        }
    }

    public static /* synthetic */ InstamartStoresInfo copy$default(InstamartStoresInfo instamartStoresInfo, String str, String str2, String str3, int i11, InstamartLocation instamartLocation, List list, String str4, Integer num, Integer num2, Integer num3, Integer num4, HashMap hashMap, int i12, Object obj) {
        InstamartStoresInfo instamartStoresInfo2 = instamartStoresInfo;
        int i13 = i12;
        return instamartStoresInfo.copy((i13 & 1) != 0 ? instamartStoresInfo2.name : str, (i13 & 2) != 0 ? instamartStoresInfo2.address : str2, (i13 & 4) != 0 ? instamartStoresInfo2.imageId : str3, (i13 & 8) != 0 ? instamartStoresInfo2.f20253id : i11, (i13 & 16) != 0 ? instamartStoresInfo2.location : instamartLocation, (i13 & 32) != 0 ? instamartStoresInfo2.categories : list, (i13 & 64) != 0 ? instamartStoresInfo2.storeType : str4, (i13 & 128) != 0 ? instamartStoresInfo2.maxAllowedCartWeightInGrams : num, (i13 & 256) != 0 ? instamartStoresInfo2.maxAllowedCartVolumeInCc : num2, (i13 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? instamartStoresInfo2.maxAllowedItemsInCart : num3, (i13 & 1024) != 0 ? instamartStoresInfo2.minimumOrderValueInRs : num4, (i13 & 2048) != 0 ? instamartStoresInfo2.subCategoryTypeMaxAllowedWeights : hashMap);
    }

    public static /* synthetic */ void getAddress$annotations() {
    }

    public static /* synthetic */ void getCategories$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getImageId$annotations() {
    }

    public static /* synthetic */ void getLocation$annotations() {
    }

    public static /* synthetic */ void getMaxAllowedCartVolumeInCc$annotations() {
    }

    public static /* synthetic */ void getMaxAllowedCartWeightInGrams$annotations() {
    }

    public static /* synthetic */ void getMaxAllowedItemsInCart$annotations() {
    }

    public static /* synthetic */ void getMinimumOrderValueInRs$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getStoreType$annotations() {
    }

    public static /* synthetic */ void getSubCategoryTypeMaxAllowedWeights$annotations() {
    }

    public static final void write$Self(InstamartStoresInfo instamartStoresInfo, d dVar, SerialDescriptor serialDescriptor) {
        p.j(instamartStoresInfo, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        dVar.n(serialDescriptor, 0, instamartStoresInfo.name);
        if (dVar.o(serialDescriptor, 1) || instamartStoresInfo.address != null) {
            dVar.E(serialDescriptor, 1, a1.f23069b, instamartStoresInfo.address);
        }
        if (dVar.o(serialDescriptor, 2) || instamartStoresInfo.imageId != null) {
            dVar.E(serialDescriptor, 2, a1.f23069b, instamartStoresInfo.imageId);
        }
        dVar.l(serialDescriptor, 3, instamartStoresInfo.f20253id);
        if (dVar.o(serialDescriptor, 4) || instamartStoresInfo.location != null) {
            dVar.E(serialDescriptor, 4, InstamartLocation$$serializer.INSTANCE, instamartStoresInfo.location);
        }
        if (dVar.o(serialDescriptor, 5) || instamartStoresInfo.categories != null) {
            dVar.E(serialDescriptor, 5, new f(InstamartCategories$$serializer.INSTANCE), instamartStoresInfo.categories);
        }
        if (dVar.o(serialDescriptor, 6) || instamartStoresInfo.storeType != null) {
            dVar.E(serialDescriptor, 6, a1.f23069b, instamartStoresInfo.storeType);
        }
        if (dVar.o(serialDescriptor, 7) || instamartStoresInfo.maxAllowedCartWeightInGrams != null) {
            dVar.E(serialDescriptor, 7, w.f23130b, instamartStoresInfo.maxAllowedCartWeightInGrams);
        }
        if (dVar.o(serialDescriptor, 8) || instamartStoresInfo.maxAllowedCartVolumeInCc != null) {
            dVar.E(serialDescriptor, 8, w.f23130b, instamartStoresInfo.maxAllowedCartVolumeInCc);
        }
        if (dVar.o(serialDescriptor, 9) || instamartStoresInfo.maxAllowedItemsInCart != null) {
            dVar.E(serialDescriptor, 9, w.f23130b, instamartStoresInfo.maxAllowedItemsInCart);
        }
        if (dVar.o(serialDescriptor, 10) || instamartStoresInfo.minimumOrderValueInRs != null) {
            dVar.E(serialDescriptor, 10, w.f23130b, instamartStoresInfo.minimumOrderValueInRs);
        }
        if (dVar.o(serialDescriptor, 11) || instamartStoresInfo.subCategoryTypeMaxAllowedWeights != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 11, new s(a1.f23069b, w.f23130b), instamartStoresInfo.subCategoryTypeMaxAllowedWeights);
        }
    }

    public final String component1() {
        return this.name;
    }

    public final Integer component10() {
        return this.maxAllowedItemsInCart;
    }

    public final Integer component11() {
        return this.minimumOrderValueInRs;
    }

    public final HashMap<String, Integer> component12() {
        return this.subCategoryTypeMaxAllowedWeights;
    }

    public final String component2() {
        return this.address;
    }

    public final String component3() {
        return this.imageId;
    }

    public final int component4() {
        return this.f20253id;
    }

    public final InstamartLocation component5() {
        return this.location;
    }

    public final List<InstamartCategories> component6() {
        return this.categories;
    }

    public final String component7() {
        return this.storeType;
    }

    public final Integer component8() {
        return this.maxAllowedCartWeightInGrams;
    }

    public final Integer component9() {
        return this.maxAllowedCartVolumeInCc;
    }

    public final InstamartStoresInfo copy(String str, String str2, String str3, int i11, InstamartLocation instamartLocation, List<InstamartCategories> list, String str4, Integer num, Integer num2, Integer num3, Integer num4, HashMap<String, Integer> hashMap) {
        p.j(str, "name");
        return new InstamartStoresInfo(str, str2, str3, i11, instamartLocation, list, str4, num, num2, num3, num4, hashMap);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstamartStoresInfo)) {
            return false;
        }
        InstamartStoresInfo instamartStoresInfo = (InstamartStoresInfo) obj;
        return p.e(this.name, instamartStoresInfo.name) && p.e(this.address, instamartStoresInfo.address) && p.e(this.imageId, instamartStoresInfo.imageId) && this.f20253id == instamartStoresInfo.f20253id && p.e(this.location, instamartStoresInfo.location) && p.e(this.categories, instamartStoresInfo.categories) && p.e(this.storeType, instamartStoresInfo.storeType) && p.e(this.maxAllowedCartWeightInGrams, instamartStoresInfo.maxAllowedCartWeightInGrams) && p.e(this.maxAllowedCartVolumeInCc, instamartStoresInfo.maxAllowedCartVolumeInCc) && p.e(this.maxAllowedItemsInCart, instamartStoresInfo.maxAllowedItemsInCart) && p.e(this.minimumOrderValueInRs, instamartStoresInfo.minimumOrderValueInRs) && p.e(this.subCategoryTypeMaxAllowedWeights, instamartStoresInfo.subCategoryTypeMaxAllowedWeights);
    }

    public final String getAddress() {
        return this.address;
    }

    public final List<InstamartCategories> getCategories() {
        return this.categories;
    }

    public final int getId() {
        return this.f20253id;
    }

    public final String getImageId() {
        return this.imageId;
    }

    public final InstamartLocation getLocation() {
        return this.location;
    }

    public final Integer getMaxAllowedCartVolumeInCc() {
        return this.maxAllowedCartVolumeInCc;
    }

    public final Integer getMaxAllowedCartWeightInGrams() {
        return this.maxAllowedCartWeightInGrams;
    }

    public final Integer getMaxAllowedItemsInCart() {
        return this.maxAllowedItemsInCart;
    }

    public final Integer getMinimumOrderValueInRs() {
        return this.minimumOrderValueInRs;
    }

    public final String getName() {
        return this.name;
    }

    public final String getStoreType() {
        return this.storeType;
    }

    public final HashMap<String, Integer> getSubCategoryTypeMaxAllowedWeights() {
        return this.subCategoryTypeMaxAllowedWeights;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.address;
        int i11 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageId;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f20253id) * 31;
        InstamartLocation instamartLocation = this.location;
        int hashCode4 = (hashCode3 + (instamartLocation == null ? 0 : instamartLocation.hashCode())) * 31;
        List<InstamartCategories> list = this.categories;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.storeType;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.maxAllowedCartWeightInGrams;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxAllowedCartVolumeInCc;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.maxAllowedItemsInCart;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.minimumOrderValueInRs;
        int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        HashMap<String, Integer> hashMap = this.subCategoryTypeMaxAllowedWeights;
        if (hashMap != null) {
            i11 = hashMap.hashCode();
        }
        return hashCode10 + i11;
    }

    public String toString() {
        return "InstamartStoresInfo(name=" + this.name + ", address=" + this.address + ", imageId=" + this.imageId + ", id=" + this.f20253id + ", location=" + this.location + ", categories=" + this.categories + ", storeType=" + this.storeType + ", maxAllowedCartWeightInGrams=" + this.maxAllowedCartWeightInGrams + ", maxAllowedCartVolumeInCc=" + this.maxAllowedCartVolumeInCc + ", maxAllowedItemsInCart=" + this.maxAllowedItemsInCart + ", minimumOrderValueInRs=" + this.minimumOrderValueInRs + ", subCategoryTypeMaxAllowedWeights=" + this.subCategoryTypeMaxAllowedWeights + ')';
    }

    public InstamartStoresInfo(String str, String str2, String str3, int i11, InstamartLocation instamartLocation, List<InstamartCategories> list, String str4, Integer num, Integer num2, Integer num3, Integer num4, HashMap<String, Integer> hashMap) {
        p.j(str, "name");
        this.name = str;
        this.address = str2;
        this.imageId = str3;
        this.f20253id = i11;
        this.location = instamartLocation;
        this.categories = list;
        this.storeType = str4;
        this.maxAllowedCartWeightInGrams = num;
        this.maxAllowedCartVolumeInCc = num2;
        this.maxAllowedItemsInCart = num3;
        this.minimumOrderValueInRs = num4;
        this.subCategoryTypeMaxAllowedWeights = hashMap;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ InstamartStoresInfo(java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartLocation r21, java.util.List r22, java.lang.String r23, java.lang.Integer r24, java.lang.Integer r25, java.lang.Integer r26, java.lang.Integer r27, java.util.HashMap r28, int r29, kotlin.jvm.internal.i r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = r2
            goto L_0x000b
        L_0x0009:
            r5 = r18
        L_0x000b:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0011
            r6 = r2
            goto L_0x0013
        L_0x0011:
            r6 = r19
        L_0x0013:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0019
            r8 = r2
            goto L_0x001b
        L_0x0019:
            r8 = r21
        L_0x001b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0021
            r9 = r2
            goto L_0x0023
        L_0x0021:
            r9 = r22
        L_0x0023:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0029
            r10 = r2
            goto L_0x002b
        L_0x0029:
            r10 = r23
        L_0x002b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0031
            r11 = r2
            goto L_0x0033
        L_0x0031:
            r11 = r24
        L_0x0033:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0039
            r12 = r2
            goto L_0x003b
        L_0x0039:
            r12 = r25
        L_0x003b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0041
            r13 = r2
            goto L_0x0043
        L_0x0041:
            r13 = r26
        L_0x0043:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0049
            r14 = r2
            goto L_0x004b
        L_0x0049:
            r14 = r27
        L_0x004b:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0051
            r15 = r2
            goto L_0x0053
        L_0x0051:
            r15 = r28
        L_0x0053:
            r3 = r16
            r4 = r17
            r7 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartStoresInfo.<init>(java.lang.String, java.lang.String, java.lang.String, int, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartLocation, java.util.List, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.util.HashMap, int, kotlin.jvm.internal.i):void");
    }
}
