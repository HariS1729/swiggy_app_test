package in.swiggy.android.swiggylynx.plugin.cart.address.edit;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: EditAddressResponsePayload.kt */
public final class EditAddressDirectionsResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f18999a;

    /* compiled from: EditAddressResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<EditAddressDirectionsResponsePayload> serializer() {
            return EditAddressDirectionsResponsePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EditAddressDirectionsResponsePayload(int i11, boolean z11, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f18999a = z11;
            return;
        }
        throw new MissingFieldException("isDirectionsToReachUpdated");
    }

    public static final void a(EditAddressDirectionsResponsePayload editAddressDirectionsResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(editAddressDirectionsResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.m(serialDescriptor, 0, editAddressDirectionsResponsePayload.f18999a);
    }

    public EditAddressDirectionsResponsePayload(boolean z11) {
        this.f18999a = z11;
    }
}
