package in.swiggy.android.swiggylynx.plugin.cart.address.edit;

import fq0.d;
import gq0.a1;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.EnumSerializer;

/* compiled from: EditAddressResponsePayload.kt */
public final class EditAddressResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19004a;

    /* renamed from: b  reason: collision with root package name */
    private final OperationType f19005b;

    /* compiled from: EditAddressResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<EditAddressResponsePayload> serializer() {
            return EditAddressResponsePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EditAddressResponsePayload(int i11, String str, OperationType operationType, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19004a = str;
            if ((i11 & 2) == 0) {
                this.f19005b = null;
            } else {
                this.f19005b = operationType;
            }
        } else {
            throw new MissingFieldException("address");
        }
    }

    public static final void a(EditAddressResponsePayload editAddressResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(editAddressResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        dVar.E(serialDescriptor, 0, a1.f23069b, editAddressResponsePayload.f19004a);
        if (dVar.o(serialDescriptor, 1) || editAddressResponsePayload.f19005b != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 1, new EnumSerializer("in.swiggy.android.swiggylynx.plugin.cart.address.edit.OperationType", OperationType.values()), editAddressResponsePayload.f19005b);
        }
    }

    public EditAddressResponsePayload(String str, OperationType operationType) {
        this.f19004a = str;
        this.f19005b = operationType;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditAddressResponsePayload(String str, OperationType operationType, int i11, i iVar) {
        this(str, (i11 & 2) != 0 ? null : operationType);
    }
}
