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

/* compiled from: UpdateLocalCartRequestPayload.kt */
public final class UpdateLocalCartRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final TenantParams f19076a;

    /* renamed from: b  reason: collision with root package name */
    private final CartUpdateParams f19077b;

    /* compiled from: UpdateLocalCartRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<UpdateLocalCartRequestPayload> serializer() {
            return UpdateLocalCartRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UpdateLocalCartRequestPayload(int i11, TenantParams tenantParams, CartUpdateParams cartUpdateParams, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19076a = tenantParams;
            if ((i11 & 2) != 0) {
                this.f19077b = cartUpdateParams;
                return;
            }
            throw new MissingFieldException(CardTypeAdapterFactory.DATA);
        }
        throw new MissingFieldException("tenant");
    }

    public static final void c(UpdateLocalCartRequestPayload updateLocalCartRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(updateLocalCartRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.v(serialDescriptor, 0, TenantParams$$serializer.INSTANCE, updateLocalCartRequestPayload.f19076a);
        dVar.v(serialDescriptor, 1, CartUpdateParams$$serializer.INSTANCE, updateLocalCartRequestPayload.f19077b);
    }

    public final CartUpdateParams b() {
        return this.f19077b;
    }
}
