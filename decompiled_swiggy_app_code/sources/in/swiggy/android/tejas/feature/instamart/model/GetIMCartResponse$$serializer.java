package in.swiggy.android.tejas.feature.instamart.model;

import dq0.a;
import fq0.c;
import fq0.d;
import gq0.q;
import gq0.x0;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.GetIMCartData;
import in.swiggy.android.tejas.feature.instamart.model.cartdata.GetIMCartData$$serializer;
import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: GetIMCartResponse.kt */
public final class GetIMCartResponse$$serializer implements q<GetIMCartResponse> {
    public static final GetIMCartResponse$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        GetIMCartResponse$$serializer getIMCartResponse$$serializer = new GetIMCartResponse$$serializer();
        INSTANCE = getIMCartResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.tejas.feature.instamart.model.GetIMCartResponse", getIMCartResponse$$serializer, 1);
        pluginGeneratedSerialDescriptor.j(CardTypeAdapterFactory.DATA, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GetIMCartResponse$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.p(GetIMCartData$$serializer.INSTANCE)};
    }

    public GetIMCartResponse deserialize(Decoder decoder) {
        Object obj;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.k()) {
            obj = b11.s(descriptor2, 0, GetIMCartData$$serializer.INSTANCE, null);
        } else {
            obj = null;
            int i12 = 0;
            while (i11 != 0) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    i11 = 0;
                } else if (w11 == 0) {
                    obj = b11.s(descriptor2, 0, GetIMCartData$$serializer.INSTANCE, obj);
                    i12 |= 1;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i12;
        }
        b11.c(descriptor2);
        return new GetIMCartResponse(i11, (GetIMCartData) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public GetIMCartResponse patch(Decoder decoder, GetIMCartResponse getIMCartResponse) {
        return (GetIMCartResponse) q.a.a(this, decoder, getIMCartResponse);
    }

    public void serialize(Encoder encoder, GetIMCartResponse getIMCartResponse) {
        p.j(encoder, "encoder");
        p.j(getIMCartResponse, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        GetIMCartResponse.write$Self(getIMCartResponse, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
