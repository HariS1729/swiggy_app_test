package in.swiggy.android.swiggylynx.plugin.cart.getcart.request;

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

/* compiled from: TenantParams.kt */
public final class TenantParams$$serializer implements q<TenantParams> {
    public static final TenantParams$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        TenantParams$$serializer tenantParams$$serializer = new TenantParams$$serializer();
        INSTANCE = tenantParams$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.cart.getcart.request.TenantParams", tenantParams$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("marketplaceId", false);
        pluginGeneratedSerialDescriptor.j("marketplaceCategory", false);
        pluginGeneratedSerialDescriptor.j("marketplaceBusinessline", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TenantParams$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{w.f23130b, a1Var, a1Var};
    }

    public TenantParams deserialize(Decoder decoder) {
        String str;
        String str2;
        int i11;
        int i12;
        Decoder decoder2 = decoder;
        p.j(decoder2, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder2.b(descriptor2);
        if (b11.k()) {
            int g11 = b11.g(descriptor2, 0);
            String j = b11.j(descriptor2, 1);
            i11 = g11;
            str = b11.j(descriptor2, 2);
            str2 = j;
            i12 = 7;
        } else {
            String str3 = null;
            String str4 = null;
            int i13 = 0;
            int i14 = 0;
            boolean z11 = true;
            while (z11) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    z11 = false;
                } else if (w11 == 0) {
                    i13 = b11.g(descriptor2, 0);
                    i14 |= 1;
                } else if (w11 == 1) {
                    str4 = b11.j(descriptor2, 1);
                    i14 |= 2;
                } else if (w11 == 2) {
                    str3 = b11.j(descriptor2, 2);
                    i14 |= 4;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i13;
            str = str3;
            str2 = str4;
            i12 = i14;
        }
        b11.c(descriptor2);
        return new TenantParams(i12, i11, str2, str, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public TenantParams patch(Decoder decoder, TenantParams tenantParams) {
        return (TenantParams) q.a.a(this, decoder, tenantParams);
    }

    public void serialize(Encoder encoder, TenantParams tenantParams) {
        p.j(encoder, "encoder");
        p.j(tenantParams, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        TenantParams.a(tenantParams, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
