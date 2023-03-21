package in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem;

import com.newrelic.agent.android.agentdata.HexAttribute;
import com.rudderstack.android.sdk.core.ecomm.ECommerceParamNames;
import dq0.a;
import fq0.c;
import fq0.d;
import gq0.a1;
import gq0.q;
import gq0.w;
import gq0.x0;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: InstamartItemCartAllowedQty.kt */
public final class InstamartItemCartAllowedQty$$serializer implements q<InstamartItemCartAllowedQty> {
    public static final InstamartItemCartAllowedQty$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        InstamartItemCartAllowedQty$$serializer instamartItemCartAllowedQty$$serializer = new InstamartItemCartAllowedQty$$serializer();
        INSTANCE = instamartItemCartAllowedQty$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.tejas.feature.instamart.model.cartdata.instamartitem.InstamartItemCartAllowedQty", instamartItemCartAllowedQty$$serializer, 2);
        pluginGeneratedSerialDescriptor.j(ECommerceParamNames.TOTAL, true);
        pluginGeneratedSerialDescriptor.j(HexAttribute.HEX_ATTR_MESSAGE, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InstamartItemCartAllowedQty$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.p(w.f23130b), a.p(a1.f23069b)};
    }

    public InstamartItemCartAllowedQty deserialize(Decoder decoder) {
        int i11;
        Object obj;
        Object obj2;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.k()) {
            obj2 = b11.s(descriptor2, 0, w.f23130b, null);
            obj = b11.s(descriptor2, 1, a1.f23069b, null);
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
                    obj2 = b11.s(descriptor2, 0, w.f23130b, obj2);
                    i12 |= 1;
                } else if (w11 == 1) {
                    obj3 = b11.s(descriptor2, 1, a1.f23069b, obj3);
                    i12 |= 2;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            obj = obj3;
            i11 = i12;
        }
        b11.c(descriptor2);
        return new InstamartItemCartAllowedQty(i11, (Integer) obj2, (String) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public InstamartItemCartAllowedQty patch(Decoder decoder, InstamartItemCartAllowedQty instamartItemCartAllowedQty) {
        return (InstamartItemCartAllowedQty) q.a.a(this, decoder, instamartItemCartAllowedQty);
    }

    public void serialize(Encoder encoder, InstamartItemCartAllowedQty instamartItemCartAllowedQty) {
        p.j(encoder, "encoder");
        p.j(instamartItemCartAllowedQty, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        InstamartItemCartAllowedQty.write$Self(instamartItemCartAllowedQty, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
