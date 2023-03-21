package in.swiggy.android.swiggylynx.plugin.cart.address.add;

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

/* compiled from: AddNewAddressResponsePayload.kt */
public final class AddNewAddressResponsePayload$$serializer implements q<AddNewAddressResponsePayload> {
    public static final AddNewAddressResponsePayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        AddNewAddressResponsePayload$$serializer addNewAddressResponsePayload$$serializer = new AddNewAddressResponsePayload$$serializer();
        INSTANCE = addNewAddressResponsePayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.cart.address.add.AddNewAddressResponsePayload", addNewAddressResponsePayload$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("addressId", true);
        pluginGeneratedSerialDescriptor.j("userContext", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AddNewAddressResponsePayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.p(a1.f23069b), a.p(new EnumSerializer("in.swiggy.android.swiggylynx.plugin.cart.address.add.UserContext", UserContext.values()))};
    }

    public AddNewAddressResponsePayload deserialize(Decoder decoder) {
        int i11;
        Object obj;
        Object obj2;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.k()) {
            obj2 = b11.s(descriptor2, 0, a1.f23069b, null);
            obj = b11.s(descriptor2, 1, new EnumSerializer("in.swiggy.android.swiggylynx.plugin.cart.address.add.UserContext", UserContext.values()), null);
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
                    obj3 = b11.s(descriptor2, 1, new EnumSerializer("in.swiggy.android.swiggylynx.plugin.cart.address.add.UserContext", UserContext.values()), obj3);
                    i12 |= 2;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            obj = obj3;
            i11 = i12;
        }
        b11.c(descriptor2);
        return new AddNewAddressResponsePayload(i11, (String) obj2, (UserContext) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public AddNewAddressResponsePayload patch(Decoder decoder, AddNewAddressResponsePayload addNewAddressResponsePayload) {
        return (AddNewAddressResponsePayload) q.a.a(this, decoder, addNewAddressResponsePayload);
    }

    public void serialize(Encoder encoder, AddNewAddressResponsePayload addNewAddressResponsePayload) {
        p.j(encoder, "encoder");
        p.j(addNewAddressResponsePayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        AddNewAddressResponsePayload.a(addNewAddressResponsePayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
