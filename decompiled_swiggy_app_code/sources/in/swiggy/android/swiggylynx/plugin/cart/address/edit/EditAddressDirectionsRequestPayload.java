package in.swiggy.android.swiggylynx.plugin.cart.address.edit;

import fq0.d;
import gq0.h;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: EditAddressRequestPayload.kt */
public final class EditAddressDirectionsRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final LynxAddressData f18997a;

    /* renamed from: b  reason: collision with root package name */
    private final Boolean f18998b;

    /* compiled from: EditAddressRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<EditAddressDirectionsRequestPayload> serializer() {
            return EditAddressDirectionsRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EditAddressDirectionsRequestPayload(int i11, LynxAddressData lynxAddressData, Boolean bool, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f18997a = lynxAddressData;
            if ((i11 & 2) == 0) {
                this.f18998b = null;
            } else {
                this.f18998b = bool;
            }
        } else {
            throw new MissingFieldException("address");
        }
    }

    public static final void c(EditAddressDirectionsRequestPayload editAddressDirectionsRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(editAddressDirectionsRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        dVar.v(serialDescriptor, 0, LynxAddressData$$serializer.INSTANCE, editAddressDirectionsRequestPayload.f18997a);
        if (dVar.o(serialDescriptor, 1) || editAddressDirectionsRequestPayload.f18998b != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 1, h.f23089b, editAddressDirectionsRequestPayload.f18998b);
        }
    }

    public final LynxAddressData b() {
        return this.f18997a;
    }
}
