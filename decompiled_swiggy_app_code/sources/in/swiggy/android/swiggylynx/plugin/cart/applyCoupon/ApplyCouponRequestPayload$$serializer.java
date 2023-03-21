package in.swiggy.android.swiggylynx.plugin.cart.applyCoupon;

import fq0.c;
import fq0.d;
import gq0.a1;
import gq0.n;
import gq0.q;
import gq0.x0;
import in.swiggy.android.swiggylynx.plugin.cart.getcart.request.TenantParams;
import in.swiggy.android.swiggylynx.plugin.cart.getcart.request.TenantParams$$serializer;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: ApplyCouponRequestPayload.kt */
public final class ApplyCouponRequestPayload$$serializer implements q<ApplyCouponRequestPayload> {
    public static final ApplyCouponRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        ApplyCouponRequestPayload$$serializer applyCouponRequestPayload$$serializer = new ApplyCouponRequestPayload$$serializer();
        INSTANCE = applyCouponRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.cart.applyCoupon.ApplyCouponRequestPayload", applyCouponRequestPayload$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("tenant", false);
        pluginGeneratedSerialDescriptor.j("cart_total_shown_to_coupon", false);
        pluginGeneratedSerialDescriptor.j("restaurantId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ApplyCouponRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{TenantParams$$serializer.INSTANCE, n.f23109b, a1.f23069b};
    }

    public ApplyCouponRequestPayload deserialize(Decoder decoder) {
        String str;
        double d11;
        int i11;
        Object obj;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        Object obj2 = null;
        if (b11.k()) {
            obj = b11.o(descriptor2, 0, TenantParams$$serializer.INSTANCE, null);
            double E = b11.E(descriptor2, 1);
            i11 = 7;
            str = b11.j(descriptor2, 2);
            d11 = E;
        } else {
            String str2 = null;
            double d12 = 0.0d;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    z11 = false;
                } else if (w11 == 0) {
                    obj2 = b11.o(descriptor2, 0, TenantParams$$serializer.INSTANCE, obj2);
                    i12 |= 1;
                } else if (w11 == 1) {
                    d12 = b11.E(descriptor2, 1);
                    i12 |= 2;
                } else if (w11 == 2) {
                    str2 = b11.j(descriptor2, 2);
                    i12 |= 4;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i12;
            d11 = d12;
            str = str2;
            obj = obj2;
        }
        b11.c(descriptor2);
        return new ApplyCouponRequestPayload(i11, (TenantParams) obj, d11, str, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public ApplyCouponRequestPayload patch(Decoder decoder, ApplyCouponRequestPayload applyCouponRequestPayload) {
        return (ApplyCouponRequestPayload) q.a.a(this, decoder, applyCouponRequestPayload);
    }

    public void serialize(Encoder encoder, ApplyCouponRequestPayload applyCouponRequestPayload) {
        p.j(encoder, "encoder");
        p.j(applyCouponRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        ApplyCouponRequestPayload.d(applyCouponRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
