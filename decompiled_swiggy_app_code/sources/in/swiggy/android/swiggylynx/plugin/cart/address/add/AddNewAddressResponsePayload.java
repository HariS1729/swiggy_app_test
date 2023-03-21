package in.swiggy.android.swiggylynx.plugin.cart.address.add;

import fq0.d;
import gq0.a1;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.EnumSerializer;

/* compiled from: AddNewAddressResponsePayload.kt */
public final class AddNewAddressResponsePayload {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private String f18995a;

    /* renamed from: b  reason: collision with root package name */
    private UserContext f18996b;

    /* compiled from: AddNewAddressResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<AddNewAddressResponsePayload> serializer() {
            return AddNewAddressResponsePayload$$serializer.INSTANCE;
        }
    }

    public AddNewAddressResponsePayload() {
        this((String) null, (UserContext) null, 3, (i) null);
    }

    public /* synthetic */ AddNewAddressResponsePayload(int i11, String str, UserContext userContext, x0 x0Var) {
        this.f18995a = (i11 & 1) == 0 ? "" : str;
        if ((i11 & 2) == 0) {
            this.f18996b = null;
        } else {
            this.f18996b = userContext;
        }
    }

    public static final void a(AddNewAddressResponsePayload addNewAddressResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        boolean z11;
        p.j(addNewAddressResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z12 = false;
        if (!dVar.o(serialDescriptor, 0) && p.e(addNewAddressResponsePayload.f18995a, "")) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 0, a1.f23069b, addNewAddressResponsePayload.f18995a);
        }
        if (dVar.o(serialDescriptor, 1) || addNewAddressResponsePayload.f18996b != null) {
            z12 = true;
        }
        if (z12) {
            dVar.E(serialDescriptor, 1, new EnumSerializer("in.swiggy.android.swiggylynx.plugin.cart.address.add.UserContext", UserContext.values()), addNewAddressResponsePayload.f18996b);
        }
    }

    public AddNewAddressResponsePayload(String str, UserContext userContext) {
        this.f18995a = str;
        this.f18996b = userContext;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddNewAddressResponsePayload(String str, UserContext userContext, int i11, i iVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : userContext);
    }
}
