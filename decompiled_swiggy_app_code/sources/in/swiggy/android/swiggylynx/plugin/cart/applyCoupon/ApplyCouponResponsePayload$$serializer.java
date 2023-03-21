package in.swiggy.android.swiggylynx.plugin.cart.applyCoupon;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: ApplyCouponResponsePayload.kt */
public final class ApplyCouponResponsePayload$$serializer implements q<ApplyCouponResponsePayload> {
    public static final ApplyCouponResponsePayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        ApplyCouponResponsePayload$$serializer applyCouponResponsePayload$$serializer = new ApplyCouponResponsePayload$$serializer();
        INSTANCE = applyCouponResponsePayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.cart.applyCoupon.ApplyCouponResponsePayload", applyCouponResponsePayload$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("couponCode", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ApplyCouponResponsePayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.p(a1.f23069b)};
    }

    public ApplyCouponResponsePayload deserialize(Decoder decoder) {
        Object obj;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.k()) {
            obj = b11.s(descriptor2, 0, a1.f23069b, null);
        } else {
            obj = null;
            int i12 = 0;
            while (i11 != 0) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    i11 = 0;
                } else if (w11 == 0) {
                    obj = b11.s(descriptor2, 0, a1.f23069b, obj);
                    i12 |= 1;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i12;
        }
        b11.c(descriptor2);
        return new ApplyCouponResponsePayload(i11, (String) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public ApplyCouponResponsePayload patch(Decoder decoder, ApplyCouponResponsePayload applyCouponResponsePayload) {
        return (ApplyCouponResponsePayload) q.a.a(this, decoder, applyCouponResponsePayload);
    }

    public void serialize(Encoder encoder, ApplyCouponResponsePayload applyCouponResponsePayload) {
        p.j(encoder, "encoder");
        p.j(applyCouponResponsePayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        ApplyCouponResponsePayload.a(applyCouponResponsePayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
