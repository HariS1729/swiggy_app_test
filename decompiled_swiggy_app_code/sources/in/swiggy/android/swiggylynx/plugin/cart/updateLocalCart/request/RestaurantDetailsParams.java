package in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request;

import fq0.d;
import gq0.a1;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: RestaurantDetailsParams.kt */
public final class RestaurantDetailsParams {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private String f19074a;

    /* renamed from: b  reason: collision with root package name */
    private String f19075b;

    /* compiled from: RestaurantDetailsParams.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<RestaurantDetailsParams> serializer() {
            return RestaurantDetailsParams$$serializer.INSTANCE;
        }
    }

    public RestaurantDetailsParams() {
        this((String) null, (String) null, 3, (i) null);
    }

    public /* synthetic */ RestaurantDetailsParams(int i11, String str, String str2, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.f19074a = "";
        } else {
            this.f19074a = str;
        }
        if ((i11 & 2) == 0) {
            this.f19075b = "";
        } else {
            this.f19075b = str2;
        }
    }

    public static final void c(RestaurantDetailsParams restaurantDetailsParams, d dVar, SerialDescriptor serialDescriptor) {
        boolean z11;
        p.j(restaurantDetailsParams, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z12 = false;
        if (!dVar.o(serialDescriptor, 0) && p.e(restaurantDetailsParams.f19074a, "")) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 0, a1.f23069b, restaurantDetailsParams.f19074a);
        }
        if (dVar.o(serialDescriptor, 1) || !p.e(restaurantDetailsParams.f19075b, "")) {
            z12 = true;
        }
        if (z12) {
            dVar.E(serialDescriptor, 1, a1.f23069b, restaurantDetailsParams.f19075b);
        }
    }

    public final String a() {
        return this.f19074a;
    }

    public final String b() {
        return this.f19075b;
    }

    public RestaurantDetailsParams(String str, String str2) {
        this.f19074a = str;
        this.f19075b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RestaurantDetailsParams(String str, String str2, int i11, i iVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2);
    }
}
