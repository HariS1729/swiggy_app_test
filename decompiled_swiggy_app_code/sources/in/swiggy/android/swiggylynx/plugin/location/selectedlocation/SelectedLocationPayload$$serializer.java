package in.swiggy.android.swiggylynx.plugin.location.selectedlocation;

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

/* compiled from: SelectedLocationPayload.kt */
public final class SelectedLocationPayload$$serializer implements q<SelectedLocationPayload> {
    public static final SelectedLocationPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        SelectedLocationPayload$$serializer selectedLocationPayload$$serializer = new SelectedLocationPayload$$serializer();
        INSTANCE = selectedLocationPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.location.selectedlocation.SelectedLocationPayload", selectedLocationPayload$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("lat", false);
        pluginGeneratedSerialDescriptor.j("lng", false);
        pluginGeneratedSerialDescriptor.j("addressId", false);
        pluginGeneratedSerialDescriptor.j("annotation", false);
        pluginGeneratedSerialDescriptor.j("displayableName", false);
        pluginGeneratedSerialDescriptor.j("addressTag", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SelectedLocationPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        n nVar = n.f23109b;
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{nVar, nVar, a1Var, a1Var, a1Var, a1Var};
    }

    public SelectedLocationPayload deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        double d11;
        double d12;
        int i11;
        Decoder decoder2 = decoder;
        p.j(decoder2, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder2.b(descriptor2);
        if (b11.k()) {
            double E = b11.E(descriptor2, 0);
            double E2 = b11.E(descriptor2, 1);
            String j = b11.j(descriptor2, 2);
            String j11 = b11.j(descriptor2, 3);
            String j12 = b11.j(descriptor2, 4);
            str4 = j;
            str = b11.j(descriptor2, 5);
            str3 = j11;
            str2 = j12;
            d11 = E2;
            d12 = E;
            i11 = 63;
        } else {
            String str5 = null;
            String str6 = null;
            double d13 = 0.0d;
            double d14 = 0.0d;
            int i12 = 0;
            boolean z11 = true;
            String str7 = null;
            String str8 = null;
            while (z11) {
                int w11 = b11.w(descriptor2);
                switch (w11) {
                    case -1:
                        z11 = false;
                        continue;
                    case 0:
                        d14 = b11.E(descriptor2, 0);
                        i12 |= 1;
                        continue;
                    case 1:
                        d13 = b11.E(descriptor2, 1);
                        i12 |= 2;
                        break;
                    case 2:
                        str5 = b11.j(descriptor2, 2);
                        i12 |= 4;
                        break;
                    case 3:
                        str8 = b11.j(descriptor2, 3);
                        i12 |= 8;
                        break;
                    case 4:
                        str6 = b11.j(descriptor2, 4);
                        i12 |= 16;
                        break;
                    case 5:
                        str7 = b11.j(descriptor2, 5);
                        i12 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(w11);
                }
            }
            str = str7;
            i11 = i12;
            d11 = d13;
            str4 = str5;
            double d15 = d14;
            str3 = str8;
            str2 = str6;
            d12 = d15;
        }
        b11.c(descriptor2);
        return new SelectedLocationPayload(i11, d12, d11, str4, str3, str2, str, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public SelectedLocationPayload patch(Decoder decoder, SelectedLocationPayload selectedLocationPayload) {
        return (SelectedLocationPayload) q.a.a(this, decoder, selectedLocationPayload);
    }

    public void serialize(Encoder encoder, SelectedLocationPayload selectedLocationPayload) {
        p.j(encoder, "encoder");
        p.j(selectedLocationPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        SelectedLocationPayload.a(selectedLocationPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
