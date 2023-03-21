package in.swiggy.android.swiggylynx.plugin.cart.address.edit;

import fq0.d;
import gq0.f;
import gq0.x0;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.EnumSerializer;
import lp.b;

/* compiled from: EditAddressRequestPayload.kt */
public final class EditAddressRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final LynxAddressData f19000a;

    /* renamed from: b  reason: collision with root package name */
    private final List<FormField> f19001b;

    /* renamed from: c  reason: collision with root package name */
    private final FormField f19002c;

    /* renamed from: d  reason: collision with root package name */
    private final OperationType f19003d;

    /* compiled from: EditAddressRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<EditAddressRequestPayload> serializer() {
            return EditAddressRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EditAddressRequestPayload(int i11, LynxAddressData lynxAddressData, List list, FormField formField, OperationType operationType, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19000a = lynxAddressData;
            if ((i11 & 2) == 0) {
                this.f19001b = k.j();
            } else {
                this.f19001b = list;
            }
            if ((i11 & 4) == 0) {
                this.f19002c = null;
            } else {
                this.f19002c = formField;
            }
            if ((i11 & 8) == 0) {
                this.f19003d = null;
            } else {
                this.f19003d = operationType;
            }
        } else {
            throw new MissingFieldException("address");
        }
    }

    public static final void f(EditAddressRequestPayload editAddressRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        boolean z11;
        p.j(editAddressRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z12 = false;
        dVar.v(serialDescriptor, 0, LynxAddressData$$serializer.INSTANCE, editAddressRequestPayload.f19000a);
        if (!dVar.o(serialDescriptor, 1) && p.e(editAddressRequestPayload.f19001b, k.j())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            dVar.v(serialDescriptor, 1, new f(new EnumSerializer("in.swiggy.android.swiggylynx.plugin.cart.address.edit.FormField", FormField.values())), editAddressRequestPayload.f19001b);
        }
        if (dVar.o(serialDescriptor, 2) || editAddressRequestPayload.f19002c != null) {
            dVar.E(serialDescriptor, 2, new EnumSerializer("in.swiggy.android.swiggylynx.plugin.cart.address.edit.FormField", FormField.values()), editAddressRequestPayload.f19002c);
        }
        if (dVar.o(serialDescriptor, 3) || editAddressRequestPayload.f19003d != null) {
            z12 = true;
        }
        if (z12) {
            dVar.E(serialDescriptor, 3, new EnumSerializer("in.swiggy.android.swiggylynx.plugin.cart.address.edit.OperationType", OperationType.values()), editAddressRequestPayload.f19003d);
        }
    }

    public final OperationType b() {
        return this.f19003d;
    }

    public final List<FormField> c() {
        return this.f19001b;
    }

    public final FormField d() {
        return this.f19002c;
    }

    public final LynxAddressData e() {
        return this.f19000a;
    }
}
