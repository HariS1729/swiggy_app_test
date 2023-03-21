package in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import lp.b;

/* compiled from: CartCustomizeParams.kt */
public final class CartCustomizeParams extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private JsonElement f19049a;

    /* renamed from: b  reason: collision with root package name */
    private RestaurantDetailsParams f19050b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f19051c;

    /* compiled from: CartCustomizeParams.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<CartCustomizeParams> serializer() {
            return CartCustomizeParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CartCustomizeParams(int i11, JsonElement jsonElement, RestaurantDetailsParams restaurantDetailsParams, boolean z11, x0 x0Var) {
        super(i11, x0Var);
        this.f19049a = (i11 & 1) == 0 ? null : jsonElement;
        if ((i11 & 2) != 0) {
            this.f19050b = restaurantDetailsParams;
            if ((i11 & 4) != 0) {
                this.f19051c = z11;
                return;
            }
            throw new MissingFieldException("addNewItem");
        }
        throw new MissingFieldException("restaurantDetails");
    }

    public static final void e(CartCustomizeParams cartCustomizeParams, d dVar, SerialDescriptor serialDescriptor) {
        p.j(cartCustomizeParams, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        if (dVar.o(serialDescriptor, 0) || cartCustomizeParams.f19049a != null) {
            dVar.E(serialDescriptor, 0, JsonElementSerializer.f26449b, cartCustomizeParams.f19049a);
        }
        dVar.v(serialDescriptor, 1, RestaurantDetailsParams$$serializer.INSTANCE, cartCustomizeParams.f19050b);
        dVar.m(serialDescriptor, 2, cartCustomizeParams.f19051c);
    }

    public final boolean b() {
        return this.f19051c;
    }

    public final RestaurantDetailsParams c() {
        return this.f19050b;
    }

    public final JsonElement d() {
        return this.f19049a;
    }
}
