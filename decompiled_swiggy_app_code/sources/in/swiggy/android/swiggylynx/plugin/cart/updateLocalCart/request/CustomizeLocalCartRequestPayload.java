package in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request;

import fq0.d;
import gq0.x0;
import in.swiggy.android.swiggylynx.plugin.cart.getcart.request.TenantParams;
import in.swiggy.android.swiggylynx.plugin.cart.getcart.request.TenantParams$$serializer;
import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: CustomizeLocalCartRequestPayload.kt */
public final class CustomizeLocalCartRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final TenantParams f19072a;

    /* renamed from: b  reason: collision with root package name */
    private final CartCustomizeParams f19073b;

    /* compiled from: CustomizeLocalCartRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<CustomizeLocalCartRequestPayload> serializer() {
            return CustomizeLocalCartRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CustomizeLocalCartRequestPayload(int i11, TenantParams tenantParams, CartCustomizeParams cartCustomizeParams, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19072a = tenantParams;
            if ((i11 & 2) != 0) {
                this.f19073b = cartCustomizeParams;
                return;
            }
            throw new MissingFieldException(CardTypeAdapterFactory.DATA);
        }
        throw new MissingFieldException("tenant");
    }

    public static final void c(CustomizeLocalCartRequestPayload customizeLocalCartRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(customizeLocalCartRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.v(serialDescriptor, 0, TenantParams$$serializer.INSTANCE, customizeLocalCartRequestPayload.f19072a);
        dVar.v(serialDescriptor, 1, CartCustomizeParams$$serializer.INSTANCE, customizeLocalCartRequestPayload.f19073b);
    }

    public final CartCustomizeParams b() {
        return this.f19073b;
    }
}
