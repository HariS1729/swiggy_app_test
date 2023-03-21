package in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem;

import dq0.a;
import fq0.c;
import fq0.d;
import gq0.n;
import gq0.q;
import gq0.x0;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: InstamartLocation.kt */
public final class InstamartLocation$$serializer implements q<InstamartLocation> {
    public static final InstamartLocation$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        InstamartLocation$$serializer instamartLocation$$serializer = new InstamartLocation$$serializer();
        INSTANCE = instamartLocation$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartLocation", instamartLocation$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("latitude", true);
        pluginGeneratedSerialDescriptor.j("longitude", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InstamartLocation$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        n nVar = n.f23109b;
        return new KSerializer[]{a.p(nVar), a.p(nVar)};
    }

    public InstamartLocation deserialize(Decoder decoder) {
        int i11;
        Object obj;
        Object obj2;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.k()) {
            n nVar = n.f23109b;
            obj = b11.s(descriptor2, 0, nVar, null);
            obj2 = b11.s(descriptor2, 1, nVar, null);
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
                    obj3 = b11.s(descriptor2, 0, n.f23109b, obj3);
                    i12 |= 1;
                } else if (w11 == 1) {
                    obj2 = b11.s(descriptor2, 1, n.f23109b, obj2);
                    i12 |= 2;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            obj = obj3;
            i11 = i12;
        }
        b11.c(descriptor2);
        return new InstamartLocation(i11, (Double) obj, (Double) obj2, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public InstamartLocation patch(Decoder decoder, InstamartLocation instamartLocation) {
        return (InstamartLocation) q.a.a(this, decoder, instamartLocation);
    }

    public void serialize(Encoder encoder, InstamartLocation instamartLocation) {
        p.j(encoder, "encoder");
        p.j(instamartLocation, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        InstamartLocation.write$Self(instamartLocation, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
