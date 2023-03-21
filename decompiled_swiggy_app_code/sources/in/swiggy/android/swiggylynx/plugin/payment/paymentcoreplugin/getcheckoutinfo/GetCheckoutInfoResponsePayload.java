package in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.getcheckoutinfo;

import com.google.gson.annotations.SerializedName;
import fq0.d;
import gq0.a1;
import gq0.w;
import gq0.x0;
import hh0.a;
import hh0.b;
import in.swiggy.android.tejas.feature.address.model.Address;
import in.swiggy.android.tejas.oldapi.models.restaurant.Restaurant;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: GetCheckoutInfoResponsePayload.kt */
public final class GetCheckoutInfoResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final Restaurant f19284a;

    /* renamed from: b  reason: collision with root package name */
    private final int f19285b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f19286c;

    /* renamed from: d  reason: collision with root package name */
    private final String f19287d;

    /* renamed from: e  reason: collision with root package name */
    private final Address f19288e;

    /* renamed from: f  reason: collision with root package name */
    private final String f19289f;

    /* renamed from: g  reason: collision with root package name */
    private final String f19290g;
    @SerializedName("orderComments")

    /* renamed from: h  reason: collision with root package name */
    private final String f19291h;

    /* compiled from: GetCheckoutInfoResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<GetCheckoutInfoResponsePayload> serializer() {
            return GetCheckoutInfoResponsePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetCheckoutInfoResponsePayload(int i11, Restaurant restaurant, int i12, Integer num, String str, Address address, String str2, String str3, String str4, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19284a = restaurant;
            if ((i11 & 2) != 0) {
                this.f19285b = i12;
                if ((i11 & 4) != 0) {
                    this.f19286c = num;
                    if ((i11 & 8) != 0) {
                        this.f19287d = str;
                        if ((i11 & 16) != 0) {
                            this.f19288e = address;
                            if ((i11 & 32) != 0) {
                                this.f19289f = str2;
                                if ((i11 & 64) != 0) {
                                    this.f19290g = str3;
                                    if ((i11 & 128) != 0) {
                                        this.f19291h = str4;
                                        return;
                                    }
                                    throw new MissingFieldException("orderComments");
                                }
                                throw new MissingFieldException("discountMessage");
                            }
                            throw new MissingFieldException("couponCode");
                        }
                        throw new MissingFieldException("deliveryAddress");
                    }
                    throw new MissingFieldException("slaMessage");
                }
                throw new MissingFieldException("slaTime");
            }
            throw new MissingFieldException("cartItemsCount");
        }
        throw new MissingFieldException("restaurantDetails");
    }

    public static final void a(GetCheckoutInfoResponsePayload getCheckoutInfoResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(getCheckoutInfoResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.v(serialDescriptor, 0, b.f18347a, getCheckoutInfoResponsePayload.f19284a);
        dVar.l(serialDescriptor, 1, getCheckoutInfoResponsePayload.f19285b);
        dVar.E(serialDescriptor, 2, w.f23130b, getCheckoutInfoResponsePayload.f19286c);
        a1 a1Var = a1.f23069b;
        dVar.E(serialDescriptor, 3, a1Var, getCheckoutInfoResponsePayload.f19287d);
        dVar.E(serialDescriptor, 4, a.f18345a, getCheckoutInfoResponsePayload.f19288e);
        dVar.E(serialDescriptor, 5, a1Var, getCheckoutInfoResponsePayload.f19289f);
        dVar.E(serialDescriptor, 6, a1Var, getCheckoutInfoResponsePayload.f19290g);
        dVar.E(serialDescriptor, 7, a1Var, getCheckoutInfoResponsePayload.f19291h);
    }

    public GetCheckoutInfoResponsePayload(Restaurant restaurant, int i11, Integer num, String str, Address address, String str2, String str3, String str4) {
        p.j(restaurant, "restaurantDetails");
        this.f19284a = restaurant;
        this.f19285b = i11;
        this.f19286c = num;
        this.f19287d = str;
        this.f19288e = address;
        this.f19289f = str2;
        this.f19290g = str3;
        this.f19291h = str4;
    }
}
