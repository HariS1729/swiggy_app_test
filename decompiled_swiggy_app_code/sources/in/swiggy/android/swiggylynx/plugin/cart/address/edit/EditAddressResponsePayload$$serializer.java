package in.swiggy.android.swiggylynx.plugin.cart.address.edit;

import dq0.a;
import fq0.c;
import fq0.d;
import gq0.a1;
import gq0.q;
import gq0.x0;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: EditAddressResponsePayload.kt */
public final class EditAddressResponsePayload$$serializer implements q<EditAddressResponsePayload> {
    public static final EditAddressResponsePayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        EditAddressResponsePayload$$serializer editAddressResponsePayload$$serializer = new EditAddressResponsePayload$$serializer();
        INSTANCE = editAddressResponsePayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.cart.address.edit.EditAddressResponsePayload", editAddressResponsePayload$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("address", false);
        pluginGeneratedSerialDescriptor.j("actionType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EditAddressResponsePayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.p(a1.f23069b), a.p(new EnumSerializer("in.swiggy.android.swiggylynx.plugin.cart.address.edit.OperationType", OperationType.values()))};
    }

    public EditAddressResponsePayload deserialize(Decoder decoder) {
        int i11;
        Object obj;
        Object obj2;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.k()) {
            obj2 = b11.s(descriptor2, 0, a1.f23069b, null);
            obj = b11.s(descriptor2, 1, new EnumSerializer("in.swiggy.android.swiggylynx.plugin.cart.address.edit.OperationType", OperationType.values()), null);
            i11 = 3;
        } else {
            obj2 = null;
            Object obj3 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    z11 = false;
                } else if (w11 == 0) {
                    obj2 = b11.s(descriptor2, 0, a1.f23069b, obj2);
                    i12 |= 1;
                } else if (w11 == 1) {
                    obj3 = b11.s(descriptor2, 1, new EnumSerializer("in.swiggy.android.swiggylynx.plugin.cart.address.edit.OperationType", OperationType.values()), obj3);
                    i12 |= 2;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            obj = obj3;
            i11 = i12;
        }
        b11.c(descriptor2);
        return new EditAddressResponsePayload(i11, (String) obj2, (OperationType) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public EditAddressResponsePayload patch(Decoder decoder, EditAddressResponsePayload editAddressResponsePayload) {
        return (EditAddressResponsePayload) q.a.a(this, decoder, editAddressResponsePayload);
    }

    public void serialize(Encoder encoder, EditAddressResponsePayload editAddressResponsePayload) {
        p.j(encoder, "encoder");
        p.j(editAddressResponsePayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        EditAddressResponsePayload.a(editAddressResponsePayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
