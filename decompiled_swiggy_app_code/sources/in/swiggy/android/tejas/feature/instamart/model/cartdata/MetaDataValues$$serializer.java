package in.swiggy.android.tejas.feature.instamart.model.cartdata;

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

/* compiled from: MetaDataValues.kt */
public final class MetaDataValues$$serializer implements q<MetaDataValues> {
    public static final MetaDataValues$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        MetaDataValues$$serializer metaDataValues$$serializer = new MetaDataValues$$serializer();
        INSTANCE = metaDataValues$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.tejas.feature.instamart.model.cartdata.MetaDataValues", metaDataValues$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("contactless_delivery", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MetaDataValues$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.p(h.f23089b)};
    }

    public MetaDataValues deserialize(Decoder decoder) {
        Object obj;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.k()) {
            obj = b11.s(descriptor2, 0, h.f23089b, null);
        } else {
            obj = null;
            int i12 = 0;
            while (i11 != 0) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    i11 = 0;
                } else if (w11 == 0) {
                    obj = b11.s(descriptor2, 0, h.f23089b, obj);
                    i12 |= 1;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i12;
        }
        b11.c(descriptor2);
        return new MetaDataValues(i11, (Boolean) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public MetaDataValues patch(Decoder decoder, MetaDataValues metaDataValues) {
        return (MetaDataValues) q.a.a(this, decoder, metaDataValues);
    }

    public void serialize(Encoder encoder, MetaDataValues metaDataValues) {
        p.j(encoder, "encoder");
        p.j(metaDataValues, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        MetaDataValues.write$Self(metaDataValues, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
