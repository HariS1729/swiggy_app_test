package in.swiggy.android.tejas.feature.instamart.model.cartdata;

import com.truecaller.android.sdk.TruecallerSdkScope;
import fq0.c;
import fq0.d;
import gq0.a1;
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

/* compiled from: InstamartBill.kt */
public final class InstamartBill$$serializer implements q<InstamartBill> {
    public static final InstamartBill$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        InstamartBill$$serializer instamartBill$$serializer = new InstamartBill$$serializer();
        INSTANCE = instamartBill$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartBill", instamartBill$$serializer, 11);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("itemTotal", false);
        pluginGeneratedSerialDescriptor.j("storePackingCharges", false);
        pluginGeneratedSerialDescriptor.j("gst", false);
        pluginGeneratedSerialDescriptor.j("toPay", false);
        pluginGeneratedSerialDescriptor.j("toPayWithoutDelFee", false);
        pluginGeneratedSerialDescriptor.j("deliveryFeeAfterDiscount", false);
        pluginGeneratedSerialDescriptor.j("deliveryCharges", false);
        pluginGeneratedSerialDescriptor.j("totalOfferAmount", false);
        pluginGeneratedSerialDescriptor.j("storeBill", false);
        pluginGeneratedSerialDescriptor.j("convenienceFee", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InstamartBill$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        n nVar = n.f23109b;
        return new KSerializer[]{a1.f23069b, nVar, nVar, nVar, nVar, nVar, nVar, nVar, nVar, nVar, nVar};
    }

    public InstamartBill deserialize(Decoder decoder) {
        double d11;
        double d12;
        double d13;
        double d14;
        double d15;
        double d16;
        double d17;
        double d18;
        double d19;
        double d21;
        String str;
        int i11;
        Decoder decoder2 = decoder;
        p.j(decoder2, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder2.b(descriptor2);
        int i12 = 0;
        if (b11.k()) {
            String j = b11.j(descriptor2, 0);
            double E = b11.E(descriptor2, 1);
            double E2 = b11.E(descriptor2, 2);
            double E3 = b11.E(descriptor2, 3);
            double E4 = b11.E(descriptor2, 4);
            double E5 = b11.E(descriptor2, 5);
            double E6 = b11.E(descriptor2, 6);
            double E7 = b11.E(descriptor2, 7);
            double E8 = b11.E(descriptor2, 8);
            double E9 = b11.E(descriptor2, 9);
            d11 = b11.E(descriptor2, 10);
            d14 = E7;
            d16 = E5;
            d15 = E6;
            d13 = E8;
            d12 = E9;
            d17 = E4;
            d19 = E2;
            d18 = E3;
            i11 = 2047;
            str = j;
            d21 = E;
        } else {
            double d22 = 0.0d;
            String str2 = null;
            double d23 = 0.0d;
            double d24 = 0.0d;
            double d25 = 0.0d;
            double d26 = 0.0d;
            double d27 = 0.0d;
            double d28 = 0.0d;
            double d29 = 0.0d;
            double d31 = 0.0d;
            double d32 = 0.0d;
            boolean z11 = true;
            while (z11) {
                int w11 = b11.w(descriptor2);
                switch (w11) {
                    case -1:
                        z11 = false;
                        break;
                    case 0:
                        i12 |= 1;
                        str2 = b11.j(descriptor2, 0);
                        continue;
                    case 1:
                        d26 = b11.E(descriptor2, 1);
                        i12 |= 2;
                        continue;
                    case 2:
                        d27 = b11.E(descriptor2, 2);
                        i12 |= 4;
                        break;
                    case 3:
                        d28 = b11.E(descriptor2, 3);
                        i12 |= 8;
                        break;
                    case 4:
                        d25 = b11.E(descriptor2, 4);
                        i12 |= 16;
                        break;
                    case 5:
                        d24 = b11.E(descriptor2, 5);
                        i12 |= 32;
                        break;
                    case 6:
                        d29 = b11.E(descriptor2, 6);
                        i12 |= 64;
                        break;
                    case 7:
                        d23 = b11.E(descriptor2, 7);
                        i12 |= 128;
                        break;
                    case 8:
                        d31 = b11.E(descriptor2, 8);
                        i12 |= 256;
                        break;
                    case 9:
                        d32 = b11.E(descriptor2, 9);
                        i12 |= TruecallerSdkScope.FOOTER_TYPE_MANUALLY;
                        break;
                    case 10:
                        d22 = b11.E(descriptor2, 10);
                        i12 |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(w11);
                }
            }
            d11 = d22;
            d12 = d32;
            i11 = i12;
            d13 = d31;
            double d33 = d23;
            str = str2;
            d15 = d29;
            d14 = d33;
            d18 = d28;
            d19 = d27;
            d16 = d24;
            d17 = d25;
            d21 = d26;
        }
        b11.c(descriptor2);
        return new InstamartBill(i11, str, d21, d19, d18, d17, d16, d15, d14, d13, d12, d11, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public InstamartBill patch(Decoder decoder, InstamartBill instamartBill) {
        return (InstamartBill) q.a.a(this, decoder, instamartBill);
    }

    public void serialize(Encoder encoder, InstamartBill instamartBill) {
        p.j(encoder, "encoder");
        p.j(instamartBill, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        InstamartBill.write$Self(instamartBill, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
