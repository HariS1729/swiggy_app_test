package in.swiggy.android.tejas.feature.instamart.model.cartdata;

import com.google.gson.annotations.SerializedName;
import com.truecaller.android.sdk.TruecallerSdkScope;
import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: InstamartBill.kt */
public final class InstamartBill {
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("convenienceFee")
    private final double convenienceFee;
    @SerializedName("deliveryCharges")
    private final double deliveryCharges;
    @SerializedName("deliveryFeeAfterDiscount")
    private final double deliveryFeeAfterDiscount;
    @SerializedName("gst")
    private final double gst;
    @SerializedName("itemTotal")
    private final double itemTotal;
    @SerializedName("storeBill")
    private final double storeBill;
    @SerializedName("storePackingCharges")
    private final double storePackingCharges;
    @SerializedName("toPay")
    private final double toPay;
    @SerializedName("toPayWithoutDelFee")
    private final double toPayWithoutDelFee;
    @SerializedName("totalOfferAmount")
    private final double totalOfferAmount;
    @SerializedName("type")
    private final String type;

    /* compiled from: InstamartBill.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<InstamartBill> serializer() {
            return InstamartBill$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InstamartBill(int i11, String str, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d21, x0 x0Var) {
        int i12 = i11;
        if ((i12 & 1) != 0) {
            this.type = str;
            if ((i12 & 2) != 0) {
                this.itemTotal = d11;
                if ((i12 & 4) != 0) {
                    this.storePackingCharges = d12;
                    if ((i12 & 8) != 0) {
                        this.gst = d13;
                        if ((i12 & 16) != 0) {
                            this.toPay = d14;
                            if ((i12 & 32) != 0) {
                                this.toPayWithoutDelFee = d15;
                                if ((i12 & 64) != 0) {
                                    this.deliveryFeeAfterDiscount = d16;
                                    if ((i12 & 128) != 0) {
                                        this.deliveryCharges = d17;
                                        if ((i12 & 256) != 0) {
                                            this.totalOfferAmount = d18;
                                            if ((i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0) {
                                                this.storeBill = d19;
                                                if ((i12 & 1024) != 0) {
                                                    this.convenienceFee = d21;
                                                    return;
                                                }
                                                throw new MissingFieldException("convenienceFee");
                                            }
                                            throw new MissingFieldException("storeBill");
                                        }
                                        throw new MissingFieldException("totalOfferAmount");
                                    }
                                    throw new MissingFieldException("deliveryCharges");
                                }
                                throw new MissingFieldException("deliveryFeeAfterDiscount");
                            }
                            throw new MissingFieldException("toPayWithoutDelFee");
                        }
                        throw new MissingFieldException("toPay");
                    }
                    throw new MissingFieldException("gst");
                }
                throw new MissingFieldException("storePackingCharges");
            }
            throw new MissingFieldException("itemTotal");
        }
        throw new MissingFieldException("type");
    }

    public static /* synthetic */ InstamartBill copy$default(InstamartBill instamartBill, String str, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d21, int i11, Object obj) {
        InstamartBill instamartBill2 = instamartBill;
        int i12 = i11;
        return instamartBill.copy((i12 & 1) != 0 ? instamartBill2.type : str, (i12 & 2) != 0 ? instamartBill2.itemTotal : d11, (i12 & 4) != 0 ? instamartBill2.storePackingCharges : d12, (i12 & 8) != 0 ? instamartBill2.gst : d13, (i12 & 16) != 0 ? instamartBill2.toPay : d14, (i12 & 32) != 0 ? instamartBill2.toPayWithoutDelFee : d15, (i12 & 64) != 0 ? instamartBill2.deliveryFeeAfterDiscount : d16, (i12 & 128) != 0 ? instamartBill2.deliveryCharges : d17, (i12 & 256) != 0 ? instamartBill2.totalOfferAmount : d18, (i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? instamartBill2.storeBill : d19, (i12 & 1024) != 0 ? instamartBill2.convenienceFee : d21);
    }

    public static /* synthetic */ void getConvenienceFee$annotations() {
    }

    public static /* synthetic */ void getDeliveryCharges$annotations() {
    }

    public static /* synthetic */ void getDeliveryFeeAfterDiscount$annotations() {
    }

    public static /* synthetic */ void getGst$annotations() {
    }

    public static /* synthetic */ void getItemTotal$annotations() {
    }

    public static /* synthetic */ void getStoreBill$annotations() {
    }

    public static /* synthetic */ void getStorePackingCharges$annotations() {
    }

    public static /* synthetic */ void getToPay$annotations() {
    }

    public static /* synthetic */ void getToPayWithoutDelFee$annotations() {
    }

    public static /* synthetic */ void getTotalOfferAmount$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static final void write$Self(InstamartBill instamartBill, d dVar, SerialDescriptor serialDescriptor) {
        p.j(instamartBill, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, instamartBill.type);
        dVar.C(serialDescriptor, 1, instamartBill.itemTotal);
        dVar.C(serialDescriptor, 2, instamartBill.storePackingCharges);
        dVar.C(serialDescriptor, 3, instamartBill.gst);
        dVar.C(serialDescriptor, 4, instamartBill.toPay);
        dVar.C(serialDescriptor, 5, instamartBill.toPayWithoutDelFee);
        dVar.C(serialDescriptor, 6, instamartBill.deliveryFeeAfterDiscount);
        dVar.C(serialDescriptor, 7, instamartBill.deliveryCharges);
        dVar.C(serialDescriptor, 8, instamartBill.totalOfferAmount);
        dVar.C(serialDescriptor, 9, instamartBill.storeBill);
        dVar.C(serialDescriptor, 10, instamartBill.convenienceFee);
    }

    public final String component1() {
        return this.type;
    }

    public final double component10() {
        return this.storeBill;
    }

    public final double component11() {
        return this.convenienceFee;
    }

    public final double component2() {
        return this.itemTotal;
    }

    public final double component3() {
        return this.storePackingCharges;
    }

    public final double component4() {
        return this.gst;
    }

    public final double component5() {
        return this.toPay;
    }

    public final double component6() {
        return this.toPayWithoutDelFee;
    }

    public final double component7() {
        return this.deliveryFeeAfterDiscount;
    }

    public final double component8() {
        return this.deliveryCharges;
    }

    public final double component9() {
        return this.totalOfferAmount;
    }

    public final InstamartBill copy(String str, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d21) {
        String str2 = str;
        String str3 = str2;
        p.j(str2, "type");
        return new InstamartBill(str2, d11, d12, d13, d14, d15, d16, d17, d18, d19, d21);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstamartBill)) {
            return false;
        }
        InstamartBill instamartBill = (InstamartBill) obj;
        return p.e(this.type, instamartBill.type) && p.e(Double.valueOf(this.itemTotal), Double.valueOf(instamartBill.itemTotal)) && p.e(Double.valueOf(this.storePackingCharges), Double.valueOf(instamartBill.storePackingCharges)) && p.e(Double.valueOf(this.gst), Double.valueOf(instamartBill.gst)) && p.e(Double.valueOf(this.toPay), Double.valueOf(instamartBill.toPay)) && p.e(Double.valueOf(this.toPayWithoutDelFee), Double.valueOf(instamartBill.toPayWithoutDelFee)) && p.e(Double.valueOf(this.deliveryFeeAfterDiscount), Double.valueOf(instamartBill.deliveryFeeAfterDiscount)) && p.e(Double.valueOf(this.deliveryCharges), Double.valueOf(instamartBill.deliveryCharges)) && p.e(Double.valueOf(this.totalOfferAmount), Double.valueOf(instamartBill.totalOfferAmount)) && p.e(Double.valueOf(this.storeBill), Double.valueOf(instamartBill.storeBill)) && p.e(Double.valueOf(this.convenienceFee), Double.valueOf(instamartBill.convenienceFee));
    }

    public final double getConvenienceFee() {
        return this.convenienceFee;
    }

    public final double getDeliveryCharges() {
        return this.deliveryCharges;
    }

    public final double getDeliveryFeeAfterDiscount() {
        return this.deliveryFeeAfterDiscount;
    }

    public final double getGst() {
        return this.gst;
    }

    public final double getItemTotal() {
        return this.itemTotal;
    }

    public final double getStoreBill() {
        return this.storeBill;
    }

    public final double getStorePackingCharges() {
        return this.storePackingCharges;
    }

    public final double getToPay() {
        return this.toPay;
    }

    public final double getToPayWithoutDelFee() {
        return this.toPayWithoutDelFee;
    }

    public final double getTotalOfferAmount() {
        return this.totalOfferAmount;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((((((((((((this.type.hashCode() * 31) + Double.doubleToLongBits(this.itemTotal)) * 31) + Double.doubleToLongBits(this.storePackingCharges)) * 31) + Double.doubleToLongBits(this.gst)) * 31) + Double.doubleToLongBits(this.toPay)) * 31) + Double.doubleToLongBits(this.toPayWithoutDelFee)) * 31) + Double.doubleToLongBits(this.deliveryFeeAfterDiscount)) * 31) + Double.doubleToLongBits(this.deliveryCharges)) * 31) + Double.doubleToLongBits(this.totalOfferAmount)) * 31) + Double.doubleToLongBits(this.storeBill)) * 31) + Double.doubleToLongBits(this.convenienceFee);
    }

    public String toString() {
        return "InstamartBill(type=" + this.type + ", itemTotal=" + this.itemTotal + ", storePackingCharges=" + this.storePackingCharges + ", gst=" + this.gst + ", toPay=" + this.toPay + ", toPayWithoutDelFee=" + this.toPayWithoutDelFee + ", deliveryFeeAfterDiscount=" + this.deliveryFeeAfterDiscount + ", deliveryCharges=" + this.deliveryCharges + ", totalOfferAmount=" + this.totalOfferAmount + ", storeBill=" + this.storeBill + ", convenienceFee=" + this.convenienceFee + ')';
    }

    public InstamartBill(String str, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d21) {
        p.j(str, "type");
        this.type = str;
        this.itemTotal = d11;
        this.storePackingCharges = d12;
        this.gst = d13;
        this.toPay = d14;
        this.toPayWithoutDelFee = d15;
        this.deliveryFeeAfterDiscount = d16;
        this.deliveryCharges = d17;
        this.totalOfferAmount = d18;
        this.storeBill = d19;
        this.convenienceFee = d21;
    }
}
