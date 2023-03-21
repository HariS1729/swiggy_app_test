package in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
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

/* compiled from: RestaurantDetailsParams.kt */
public final class RestaurantDetailsParams$$serializer implements q<RestaurantDetailsParams> {
    public static final RestaurantDetailsParams$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        RestaurantDetailsParams$$serializer restaurantDetailsParams$$serializer = new RestaurantDetailsParams$$serializer();
        INSTANCE = restaurantDetailsParams$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.cart.updateLocalCart.request.RestaurantDetailsParams", restaurantDetailsParams$$serializer, 2);
        pluginGeneratedSerialDescriptor.j(DistributedTracing.NR_ID_ATTRIBUTE, true);
        pluginGeneratedSerialDescriptor.j("name", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RestaurantDetailsParams$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a.p(a1Var), a.p(a1Var)};
    }

    public RestaurantDetailsParams deserialize(Decoder decoder) {
        int i11;
        Object obj;
        Object obj2;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.k()) {
            a1 a1Var = a1.f23069b;
            obj = b11.s(descriptor2, 0, a1Var, null);
            obj2 = b11.s(descriptor2, 1, a1Var, null);
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
                    obj3 = b11.s(descriptor2, 0, a1.f23069b, obj3);
                    i12 |= 1;
                } else if (w11 == 1) {
                    obj2 = b11.s(descriptor2, 1, a1.f23069b, obj2);
                    i12 |= 2;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            obj = obj3;
            i11 = i12;
        }
        b11.c(descriptor2);
        return new RestaurantDetailsParams(i11, (String) obj, (String) obj2, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public RestaurantDetailsParams patch(Decoder decoder, RestaurantDetailsParams restaurantDetailsParams) {
        return (RestaurantDetailsParams) q.a.a(this, decoder, restaurantDetailsParams);
    }

    public void serialize(Encoder encoder, RestaurantDetailsParams restaurantDetailsParams) {
        p.j(encoder, "encoder");
        p.j(restaurantDetailsParams, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        RestaurantDetailsParams.c(restaurantDetailsParams, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
