package in.swiggy.android.swiggylynx.plugin.cart.getcart.request;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: GetLocalCartRequestPayload.kt */
public final class GetLocalCartRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final TenantParams f19022a;

    /* compiled from: GetLocalCartRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<GetLocalCartRequestPayload> serializer() {
            return GetLocalCartRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetLocalCartRequestPayload(int i11, TenantParams tenantParams, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19022a = tenantParams;
            return;
        }
        throw new MissingFieldException("tenant");
    }

    public static final void b(GetLocalCartRequestPayload getLocalCartRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(getLocalCartRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.v(serialDescriptor, 0, TenantParams$$serializer.INSTANCE, getLocalCartRequestPayload.f19022a);
    }
}
