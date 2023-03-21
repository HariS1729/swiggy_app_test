package in.swiggy.android.swiggylynx.plugin.cart.address.edit;

import dq0.a;
import fq0.c;
import fq0.d;
import gq0.h;
import gq0.q;
import gq0.x0;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: EditAddressRequestPayload.kt */
public final class EditAddressDirectionsRequestPayload$$serializer implements q<EditAddressDirectionsRequestPayload> {
    public static final EditAddressDirectionsRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        EditAddressDirectionsRequestPayload$$serializer editAddressDirectionsRequestPayload$$serializer = new EditAddressDirectionsRequestPayload$$serializer();
        INSTANCE = editAddressDirectionsRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.cart.address.edit.EditAddressDirectionsRequestPayload", editAddressDirectionsRequestPayload$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("address", false);
        pluginGeneratedSerialDescriptor.j("enable_voice_directions", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EditAddressDirectionsRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{LynxAddressData$$serializer.INSTANCE, a.p(h.f23089b)};
    }

    public EditAddressDirectionsRequestPayload deserialize(Decoder decoder) {
        int i11;
        Object obj;
        Object obj2;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.k()) {
            obj2 = b11.o(descriptor2, 0, LynxAddressData$$serializer.INSTANCE, null);
            obj = b11.s(descriptor2, 1, h.f23089b, null);
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
                    obj2 = b11.o(descriptor2, 0, LynxAddressData$$serializer.INSTANCE, obj2);
                    i12 |= 1;
                } else if (w11 == 1) {
                    obj3 = b11.s(descriptor2, 1, h.f23089b, obj3);
                    i12 |= 2;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            obj = obj3;
            i11 = i12;
        }
        b11.c(descriptor2);
        return new EditAddressDirectionsRequestPayload(i11, (LynxAddressData) obj2, (Boolean) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public EditAddressDirectionsRequestPayload patch(Decoder decoder, EditAddressDirectionsRequestPayload editAddressDirectionsRequestPayload) {
        return (EditAddressDirectionsRequestPayload) q.a.a(this, decoder, editAddressDirectionsRequestPayload);
    }

    public void serialize(Encoder encoder, EditAddressDirectionsRequestPayload editAddressDirectionsRequestPayload) {
        p.j(encoder, "encoder");
        p.j(editAddressDirectionsRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        EditAddressDirectionsRequestPayload.c(editAddressDirectionsRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
