package in.swiggy.android.tejas.feature.instamart.model.localinstamartitem;

import com.newrelic.agent.android.agentdata.HexAttribute;
import dq0.a;
import fq0.c;
import fq0.d;
import gq0.a1;
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

/* compiled from: SkuSlotInfo.kt */
public final class SkuSlotInfo$$serializer implements q<SkuSlotInfo> {
    public static final SkuSlotInfo$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        SkuSlotInfo$$serializer skuSlotInfo$$serializer = new SkuSlotInfo$$serializer();
        INSTANCE = skuSlotInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.tejas.feature.instamart.model.localinstamartitem.SkuSlotInfo", skuSlotInfo$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("isAvail", true);
        pluginGeneratedSerialDescriptor.j(HexAttribute.HEX_ATTR_MESSAGE, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SkuSlotInfo$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.p(h.f23089b), a.p(a1.f23069b)};
    }

    public SkuSlotInfo deserialize(Decoder decoder) {
        int i11;
        Object obj;
        Object obj2;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.k()) {
            obj2 = b11.s(descriptor2, 0, h.f23089b, null);
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
                    obj2 = b11.s(descriptor2, 0, h.f23089b, obj2);
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
        return new SkuSlotInfo(i11, (Boolean) obj2, (String) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public SkuSlotInfo patch(Decoder decoder, SkuSlotInfo skuSlotInfo) {
        return (SkuSlotInfo) q.a.a(this, decoder, skuSlotInfo);
    }

    public void serialize(Encoder encoder, SkuSlotInfo skuSlotInfo) {
        p.j(encoder, "encoder");
        p.j(skuSlotInfo, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        SkuSlotInfo.write$Self(skuSlotInfo, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
