package in.swiggy.android.tejas.feature.instamart.model.cartdata;

import dq0.a;
import fq0.c;
import fq0.d;
import gq0.q;
import gq0.x0;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: InstamartMetaData.kt */
public final class InstamartMetaData$$serializer implements q<InstamartMetaData> {
    public static final InstamartMetaData$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        InstamartMetaData$$serializer instamartMetaData$$serializer = new InstamartMetaData$$serializer();
        INSTANCE = instamartMetaData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartMetaData", instamartMetaData$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("values", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InstamartMetaData$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.p(MetaDataValues$$serializer.INSTANCE)};
    }

    public InstamartMetaData deserialize(Decoder decoder) {
        Object obj;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.k()) {
            obj = b11.s(descriptor2, 0, MetaDataValues$$serializer.INSTANCE, null);
        } else {
            obj = null;
            int i12 = 0;
            while (i11 != 0) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    i11 = 0;
                } else if (w11 == 0) {
                    obj = b11.s(descriptor2, 0, MetaDataValues$$serializer.INSTANCE, obj);
                    i12 |= 1;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i12;
        }
        b11.c(descriptor2);
        return new InstamartMetaData(i11, (MetaDataValues) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public InstamartMetaData patch(Decoder decoder, InstamartMetaData instamartMetaData) {
        return (InstamartMetaData) q.a.a(this, decoder, instamartMetaData);
    }

    public void serialize(Encoder encoder, InstamartMetaData instamartMetaData) {
        p.j(encoder, "encoder");
        p.j(instamartMetaData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        InstamartMetaData.write$Self(instamartMetaData, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
