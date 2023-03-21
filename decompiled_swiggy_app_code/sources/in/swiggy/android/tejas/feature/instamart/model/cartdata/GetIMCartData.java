package in.swiggy.android.tejas.feature.instamart.model.cartdata;

import com.google.gson.annotations.SerializedName;
import com.truecaller.android.sdk.TruecallerSdkScope;
import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.x0;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartCoupon;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartCoupon$$serializer;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItem;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItem$$serializer;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartLocation;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartLocation$$serializer;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: GetIMCartData.kt */
public final class GetIMCartData {
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("addressId")
    private final String addressId;
    @SerializedName("bill")
    private final InstamartBill bill;
    @SerializedName("cartId")
    private final String cartId;
    @SerializedName("coupon")
    private final InstamartCoupon coupon;
    @SerializedName("deliveryType")
    private final String deliveryType;
    @SerializedName("items")
    private final List<InstamartItem> items;
    @SerializedName("location")
    private final InstamartLocation location;
    @SerializedName("metadata")
    private final InstamartMetaData metaData;
    @SerializedName("slotId")
    private final String slotId;
    @SerializedName("storesInfo")
    private final List<InstamartStoresInfo> storesInfo;
    @SerializedName("superData")
    private final InstamartSuperData superData;
    @SerializedName("type")
    private final String type;

    /* compiled from: GetIMCartData.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<GetIMCartData> serializer() {
            return GetIMCartData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetIMCartData(int i11, InstamartBill instamartBill, List list, InstamartLocation instamartLocation, InstamartCoupon instamartCoupon, List list2, String str, String str2, InstamartSuperData instamartSuperData, InstamartMetaData instamartMetaData, String str3, String str4, String str5, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.bill = instamartBill;
            if ((i11 & 2) != 0) {
                this.items = list;
                if ((i11 & 4) != 0) {
                    this.location = instamartLocation;
                    if ((i11 & 8) == 0) {
                        this.coupon = null;
                    } else {
                        this.coupon = instamartCoupon;
                    }
                    if ((i11 & 16) != 0) {
                        this.storesInfo = list2;
                        if ((i11 & 32) != 0) {
                            this.cartId = str;
                            if ((i11 & 64) != 0) {
                                this.type = str2;
                                if ((i11 & 128) == 0) {
                                    this.superData = null;
                                } else {
                                    this.superData = instamartSuperData;
                                }
                                if ((i11 & 256) == 0) {
                                    this.metaData = null;
                                } else {
                                    this.metaData = instamartMetaData;
                                }
                                if ((i11 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) == 0) {
                                    this.addressId = null;
                                } else {
                                    this.addressId = str3;
                                }
                                if ((i11 & 1024) == 0) {
                                    this.deliveryType = null;
                                } else {
                                    this.deliveryType = str4;
                                }
                                if ((i11 & 2048) == 0) {
                                    this.slotId = null;
                                } else {
                                    this.slotId = str5;
                                }
                            } else {
                                throw new MissingFieldException("type");
                            }
                        } else {
                            throw new MissingFieldException("cartId");
                        }
                    } else {
                        throw new MissingFieldException("storesInfo");
                    }
                } else {
                    throw new MissingFieldException("location");
                }
            } else {
                throw new MissingFieldException("items");
            }
        } else {
            throw new MissingFieldException("bill");
        }
    }

    public static /* synthetic */ GetIMCartData copy$default(GetIMCartData getIMCartData, InstamartBill instamartBill, List list, InstamartLocation instamartLocation, InstamartCoupon instamartCoupon, List list2, String str, String str2, InstamartSuperData instamartSuperData, InstamartMetaData instamartMetaData, String str3, String str4, String str5, int i11, Object obj) {
        GetIMCartData getIMCartData2 = getIMCartData;
        int i12 = i11;
        return getIMCartData.copy((i12 & 1) != 0 ? getIMCartData2.bill : instamartBill, (i12 & 2) != 0 ? getIMCartData2.items : list, (i12 & 4) != 0 ? getIMCartData2.location : instamartLocation, (i12 & 8) != 0 ? getIMCartData2.coupon : instamartCoupon, (i12 & 16) != 0 ? getIMCartData2.storesInfo : list2, (i12 & 32) != 0 ? getIMCartData2.cartId : str, (i12 & 64) != 0 ? getIMCartData2.type : str2, (i12 & 128) != 0 ? getIMCartData2.superData : instamartSuperData, (i12 & 256) != 0 ? getIMCartData2.metaData : instamartMetaData, (i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? getIMCartData2.addressId : str3, (i12 & 1024) != 0 ? getIMCartData2.deliveryType : str4, (i12 & 2048) != 0 ? getIMCartData2.slotId : str5);
    }

    public static /* synthetic */ void getAddressId$annotations() {
    }

    public static /* synthetic */ void getBill$annotations() {
    }

    public static /* synthetic */ void getCartId$annotations() {
    }

    public static /* synthetic */ void getCoupon$annotations() {
    }

    public static /* synthetic */ void getDeliveryType$annotations() {
    }

    public static /* synthetic */ void getItems$annotations() {
    }

    public static /* synthetic */ void getLocation$annotations() {
    }

    public static /* synthetic */ void getMetaData$annotations() {
    }

    public static /* synthetic */ void getSlotId$annotations() {
    }

    public static /* synthetic */ void getStoresInfo$annotations() {
    }

    public static /* synthetic */ void getSuperData$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static final void write$Self(GetIMCartData getIMCartData, d dVar, SerialDescriptor serialDescriptor) {
        p.j(getIMCartData, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        dVar.v(serialDescriptor, 0, InstamartBill$$serializer.INSTANCE, getIMCartData.bill);
        dVar.v(serialDescriptor, 1, new f(InstamartItem$$serializer.INSTANCE), getIMCartData.items);
        dVar.v(serialDescriptor, 2, InstamartLocation$$serializer.INSTANCE, getIMCartData.location);
        if (dVar.o(serialDescriptor, 3) || getIMCartData.coupon != null) {
            dVar.E(serialDescriptor, 3, InstamartCoupon$$serializer.INSTANCE, getIMCartData.coupon);
        }
        dVar.v(serialDescriptor, 4, new f(InstamartStoresInfo$$serializer.INSTANCE), getIMCartData.storesInfo);
        dVar.n(serialDescriptor, 5, getIMCartData.cartId);
        dVar.n(serialDescriptor, 6, getIMCartData.type);
        if (dVar.o(serialDescriptor, 7) || getIMCartData.superData != null) {
            dVar.E(serialDescriptor, 7, InstamartSuperData$$serializer.INSTANCE, getIMCartData.superData);
        }
        if (dVar.o(serialDescriptor, 8) || getIMCartData.metaData != null) {
            dVar.E(serialDescriptor, 8, InstamartMetaData$$serializer.INSTANCE, getIMCartData.metaData);
        }
        if (dVar.o(serialDescriptor, 9) || getIMCartData.addressId != null) {
            dVar.E(serialDescriptor, 9, a1.f23069b, getIMCartData.addressId);
        }
        if (dVar.o(serialDescriptor, 10) || getIMCartData.deliveryType != null) {
            dVar.E(serialDescriptor, 10, a1.f23069b, getIMCartData.deliveryType);
        }
        if (dVar.o(serialDescriptor, 11) || getIMCartData.slotId != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 11, a1.f23069b, getIMCartData.slotId);
        }
    }

    public final InstamartBill component1() {
        return this.bill;
    }

    public final String component10() {
        return this.addressId;
    }

    public final String component11() {
        return this.deliveryType;
    }

    public final String component12() {
        return this.slotId;
    }

    public final List<InstamartItem> component2() {
        return this.items;
    }

    public final InstamartLocation component3() {
        return this.location;
    }

    public final InstamartCoupon component4() {
        return this.coupon;
    }

    public final List<InstamartStoresInfo> component5() {
        return this.storesInfo;
    }

    public final String component6() {
        return this.cartId;
    }

    public final String component7() {
        return this.type;
    }

    public final InstamartSuperData component8() {
        return this.superData;
    }

    public final InstamartMetaData component9() {
        return this.metaData;
    }

    public final GetIMCartData copy(InstamartBill instamartBill, List<InstamartItem> list, InstamartLocation instamartLocation, InstamartCoupon instamartCoupon, List<InstamartStoresInfo> list2, String str, String str2, InstamartSuperData instamartSuperData, InstamartMetaData instamartMetaData, String str3, String str4, String str5) {
        p.j(instamartBill, "bill");
        List<InstamartItem> list3 = list;
        p.j(list3, "items");
        InstamartLocation instamartLocation2 = instamartLocation;
        p.j(instamartLocation2, "location");
        List<InstamartStoresInfo> list4 = list2;
        p.j(list4, "storesInfo");
        String str6 = str;
        p.j(str6, "cartId");
        String str7 = str2;
        p.j(str7, "type");
        return new GetIMCartData(instamartBill, list3, instamartLocation2, instamartCoupon, list4, str6, str7, instamartSuperData, instamartMetaData, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetIMCartData)) {
            return false;
        }
        GetIMCartData getIMCartData = (GetIMCartData) obj;
        return p.e(this.bill, getIMCartData.bill) && p.e(this.items, getIMCartData.items) && p.e(this.location, getIMCartData.location) && p.e(this.coupon, getIMCartData.coupon) && p.e(this.storesInfo, getIMCartData.storesInfo) && p.e(this.cartId, getIMCartData.cartId) && p.e(this.type, getIMCartData.type) && p.e(this.superData, getIMCartData.superData) && p.e(this.metaData, getIMCartData.metaData) && p.e(this.addressId, getIMCartData.addressId) && p.e(this.deliveryType, getIMCartData.deliveryType) && p.e(this.slotId, getIMCartData.slotId);
    }

    public final String getAddressId() {
        return this.addressId;
    }

    public final InstamartBill getBill() {
        return this.bill;
    }

    public final String getCartId() {
        return this.cartId;
    }

    public final InstamartCoupon getCoupon() {
        return this.coupon;
    }

    public final String getDeliveryType() {
        return this.deliveryType;
    }

    public final List<InstamartItem> getItems() {
        return this.items;
    }

    public final InstamartLocation getLocation() {
        return this.location;
    }

    public final InstamartMetaData getMetaData() {
        return this.metaData;
    }

    public final String getSlotId() {
        return this.slotId;
    }

    public final List<InstamartStoresInfo> getStoresInfo() {
        return this.storesInfo;
    }

    public final InstamartSuperData getSuperData() {
        return this.superData;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((this.bill.hashCode() * 31) + this.items.hashCode()) * 31) + this.location.hashCode()) * 31;
        InstamartCoupon instamartCoupon = this.coupon;
        int i11 = 0;
        int hashCode2 = (((((((hashCode + (instamartCoupon == null ? 0 : instamartCoupon.hashCode())) * 31) + this.storesInfo.hashCode()) * 31) + this.cartId.hashCode()) * 31) + this.type.hashCode()) * 31;
        InstamartSuperData instamartSuperData = this.superData;
        int hashCode3 = (hashCode2 + (instamartSuperData == null ? 0 : instamartSuperData.hashCode())) * 31;
        InstamartMetaData instamartMetaData = this.metaData;
        int hashCode4 = (hashCode3 + (instamartMetaData == null ? 0 : instamartMetaData.hashCode())) * 31;
        String str = this.addressId;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deliveryType;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.slotId;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return hashCode6 + i11;
    }

    public String toString() {
        return "GetIMCartData(bill=" + this.bill + ", items=" + this.items + ", location=" + this.location + ", coupon=" + this.coupon + ", storesInfo=" + this.storesInfo + ", cartId=" + this.cartId + ", type=" + this.type + ", superData=" + this.superData + ", metaData=" + this.metaData + ", addressId=" + this.addressId + ", deliveryType=" + this.deliveryType + ", slotId=" + this.slotId + ')';
    }

    public GetIMCartData(InstamartBill instamartBill, List<InstamartItem> list, InstamartLocation instamartLocation, InstamartCoupon instamartCoupon, List<InstamartStoresInfo> list2, String str, String str2, InstamartSuperData instamartSuperData, InstamartMetaData instamartMetaData, String str3, String str4, String str5) {
        p.j(instamartBill, "bill");
        p.j(list, "items");
        p.j(instamartLocation, "location");
        p.j(list2, "storesInfo");
        p.j(str, "cartId");
        p.j(str2, "type");
        this.bill = instamartBill;
        this.items = list;
        this.location = instamartLocation;
        this.coupon = instamartCoupon;
        this.storesInfo = list2;
        this.cartId = str;
        this.type = str2;
        this.superData = instamartSuperData;
        this.metaData = instamartMetaData;
        this.addressId = str3;
        this.deliveryType = str4;
        this.slotId = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GetIMCartData(in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartBill r17, java.util.List r18, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartLocation r19, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartCoupon r20, java.util.List r21, java.lang.String r22, java.lang.String r23, in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartSuperData r24, in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartMetaData r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, int r29, kotlin.jvm.internal.i r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r20
        L_0x000b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0011
            r11 = r2
            goto L_0x0013
        L_0x0011:
            r11 = r24
        L_0x0013:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0019
            r12 = r2
            goto L_0x001b
        L_0x0019:
            r12 = r25
        L_0x001b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0021
            r13 = r2
            goto L_0x0023
        L_0x0021:
            r13 = r26
        L_0x0023:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0029
            r14 = r2
            goto L_0x002b
        L_0x0029:
            r14 = r27
        L_0x002b:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0031
            r15 = r2
            goto L_0x0033
        L_0x0031:
            r15 = r28
        L_0x0033:
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r8 = r21
            r9 = r22
            r10 = r23
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.feature.instamart.model.cartdata.GetIMCartData.<init>(in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartBill, java.util.List, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartLocation, in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartCoupon, java.util.List, java.lang.String, java.lang.String, in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartSuperData, in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartMetaData, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
