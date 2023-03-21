package in.swiggy.android.tejas.feature.instamart.model.cartdata;

import com.rudderstack.android.sdk.core.ecomm.ECommerceParamNames;
import fq0.c;
import fq0.d;
import gq0.a1;
import gq0.h;
import gq0.q;
import gq0.x0;
import in.swiggy.android.tejas.feature.menu.MenuConstants;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: InstamartCallouts.kt */
public final class InstamartCallouts$$serializer implements q<InstamartCallouts> {
    public static final InstamartCallouts$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        InstamartCallouts$$serializer instamartCallouts$$serializer = new InstamartCallouts$$serializer();
        INSTANCE = instamartCallouts$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.tejas.feature.instamart.model.cartdata.InstamartCallouts", instamartCallouts$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j(MenuConstants.MENU_OFFER_ICON, false);
        pluginGeneratedSerialDescriptor.j("placement", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("body", false);
        pluginGeneratedSerialDescriptor.j(ECommerceParamNames.REASON, false);
        pluginGeneratedSerialDescriptor.j("enabled", false);
        pluginGeneratedSerialDescriptor.j("forward", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InstamartCallouts$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        h hVar = h.f23089b;
        return new KSerializer[]{a1Var, a1Var, a1Var, a1Var, a1Var, a1Var, hVar, hVar};
    }

    public InstamartCallouts deserialize(Decoder decoder) {
        boolean z11;
        boolean z12;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i11;
        Decoder decoder2 = decoder;
        p.j(decoder2, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder2.b(descriptor2);
        int i12 = 0;
        if (b11.k()) {
            String j = b11.j(descriptor2, 0);
            String j11 = b11.j(descriptor2, 1);
            String j12 = b11.j(descriptor2, 2);
            String j13 = b11.j(descriptor2, 3);
            String j14 = b11.j(descriptor2, 4);
            String j15 = b11.j(descriptor2, 5);
            boolean B = b11.B(descriptor2, 6);
            str6 = j;
            z11 = b11.B(descriptor2, 7);
            z12 = B;
            str = j15;
            str3 = j13;
            str2 = j14;
            str4 = j12;
            str5 = j11;
            i11 = 255;
        } else {
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = true;
            while (z15) {
                int w11 = b11.w(descriptor2);
                switch (w11) {
                    case -1:
                        z15 = false;
                        break;
                    case 0:
                        i12 |= 1;
                        str7 = b11.j(descriptor2, 0);
                        continue;
                    case 1:
                        str12 = b11.j(descriptor2, 1);
                        i12 |= 2;
                        continue;
                    case 2:
                        str11 = b11.j(descriptor2, 2);
                        i12 |= 4;
                        break;
                    case 3:
                        str9 = b11.j(descriptor2, 3);
                        i12 |= 8;
                        break;
                    case 4:
                        str10 = b11.j(descriptor2, 4);
                        i12 |= 16;
                        break;
                    case 5:
                        str8 = b11.j(descriptor2, 5);
                        i12 |= 32;
                        break;
                    case 6:
                        z14 = b11.B(descriptor2, 6);
                        i12 |= 64;
                        break;
                    case 7:
                        z13 = b11.B(descriptor2, 7);
                        i12 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(w11);
                }
            }
            z11 = z13;
            z12 = z14;
            str6 = str7;
            i11 = i12;
            String str13 = str12;
            str = str8;
            str5 = str13;
            String str14 = str10;
            str3 = str9;
            str4 = str11;
            str2 = str14;
        }
        b11.c(descriptor2);
        return new InstamartCallouts(i11, str6, str5, str4, str3, str2, str, z12, z11, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public InstamartCallouts patch(Decoder decoder, InstamartCallouts instamartCallouts) {
        return (InstamartCallouts) q.a.a(this, decoder, instamartCallouts);
    }

    public void serialize(Encoder encoder, InstamartCallouts instamartCallouts) {
        p.j(encoder, "encoder");
        p.j(instamartCallouts, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        InstamartCallouts.write$Self(instamartCallouts, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
