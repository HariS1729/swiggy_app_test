package in.swiggy.android.tejas.feature.instamart.model.localinstamartitem;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: LocalInstamartOfferApplied.kt */
public final class LocalInstamartOfferApplied$$serializer implements q<LocalInstamartOfferApplied> {
    public static final LocalInstamartOfferApplied$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        LocalInstamartOfferApplied$$serializer localInstamartOfferApplied$$serializer = new LocalInstamartOfferApplied$$serializer();
        INSTANCE = localInstamartOfferApplied$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.LocalInstamartOfferApplied", localInstamartOfferApplied$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("offerId", false);
        pluginGeneratedSerialDescriptor.j("listingDescription", false);
        pluginGeneratedSerialDescriptor.j("productDescription", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LocalInstamartOfferApplied$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a1Var, a1Var, a1Var};
    }

    public LocalInstamartOfferApplied deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        int i11;
        Decoder decoder2 = decoder;
        p.j(decoder2, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder2.b(descriptor2);
        if (b11.k()) {
            String j = b11.j(descriptor2, 0);
            String j11 = b11.j(descriptor2, 1);
            str3 = j;
            str = b11.j(descriptor2, 2);
            str2 = j11;
            i11 = 7;
        } else {
            String str4 = null;
            String str5 = null;
            String str6 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    z11 = false;
                } else if (w11 == 0) {
                    str4 = b11.j(descriptor2, 0);
                    i12 |= 1;
                } else if (w11 == 1) {
                    str6 = b11.j(descriptor2, 1);
                    i12 |= 2;
                } else if (w11 == 2) {
                    str5 = b11.j(descriptor2, 2);
                    i12 |= 4;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            str3 = str4;
            str = str5;
            str2 = str6;
            i11 = i12;
        }
        b11.c(descriptor2);
        return new LocalInstamartOfferApplied(i11, str3, str2, str, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public LocalInstamartOfferApplied patch(Decoder decoder, LocalInstamartOfferApplied localInstamartOfferApplied) {
        return (LocalInstamartOfferApplied) q.a.a(this, decoder, localInstamartOfferApplied);
    }

    public void serialize(Encoder encoder, LocalInstamartOfferApplied localInstamartOfferApplied) {
        p.j(encoder, "encoder");
        p.j(localInstamartOfferApplied, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        LocalInstamartOfferApplied.write$Self(localInstamartOfferApplied, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
