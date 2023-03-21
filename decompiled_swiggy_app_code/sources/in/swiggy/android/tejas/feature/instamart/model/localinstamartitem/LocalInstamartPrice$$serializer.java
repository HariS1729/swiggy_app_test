package in.swiggy.android.tejas.feature.instamart.model.localinstamartitem;

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

/* compiled from: LocalInstamartPrice.kt */
public final class LocalInstamartPrice$$serializer implements q<LocalInstamartPrice> {
    public static final LocalInstamartPrice$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        LocalInstamartPrice$$serializer localInstamartPrice$$serializer = new LocalInstamartPrice$$serializer();
        INSTANCE = localInstamartPrice$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartPrice", localInstamartPrice$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("mrp", false);
        pluginGeneratedSerialDescriptor.j("storePrice", false);
        pluginGeneratedSerialDescriptor.j("offerPrice", false);
        pluginGeneratedSerialDescriptor.j("offerApplied", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LocalInstamartPrice$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        n nVar = n.f23109b;
        return new KSerializer[]{nVar, nVar, nVar, a.p(LocalInstamartOfferApplied$$serializer.INSTANCE)};
    }

    public LocalInstamartPrice deserialize(Decoder decoder) {
        double d11;
        double d12;
        double d13;
        int i11;
        Object obj;
        Decoder decoder2 = decoder;
        p.j(decoder2, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder2.b(descriptor2);
        Object obj2 = null;
        if (b11.k()) {
            double E = b11.E(descriptor2, 0);
            double E2 = b11.E(descriptor2, 1);
            double E3 = b11.E(descriptor2, 2);
            obj = b11.s(descriptor2, 3, LocalInstamartOfferApplied$$serializer.INSTANCE, null);
            i11 = 15;
            d11 = E3;
            d12 = E2;
            d13 = E;
        } else {
            double d14 = 0.0d;
            double d15 = 0.0d;
            double d16 = 0.0d;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    z11 = false;
                } else if (w11 == 0) {
                    d15 = b11.E(descriptor2, 0);
                    i12 |= 1;
                } else if (w11 == 1) {
                    d14 = b11.E(descriptor2, 1);
                    i12 |= 2;
                } else if (w11 == 2) {
                    d16 = b11.E(descriptor2, 2);
                    i12 |= 4;
                } else if (w11 == 3) {
                    obj2 = b11.s(descriptor2, 3, LocalInstamartOfferApplied$$serializer.INSTANCE, obj2);
                    i12 |= 8;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i12;
            obj = obj2;
            d12 = d14;
            d13 = d15;
            d11 = d16;
        }
        b11.c(descriptor2);
        return new LocalInstamartPrice(i11, d13, d12, d11, (LocalInstamartOfferApplied) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public LocalInstamartPrice patch(Decoder decoder, LocalInstamartPrice localInstamartPrice) {
        return (LocalInstamartPrice) q.a.a(this, decoder, localInstamartPrice);
    }

    public void serialize(Encoder encoder, LocalInstamartPrice localInstamartPrice) {
        p.j(encoder, "encoder");
        p.j(localInstamartPrice, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        LocalInstamartPrice.write$Self(localInstamartPrice, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
