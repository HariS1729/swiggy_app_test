package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.userinfo;

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

/* compiled from: UserInfoResponsePayload.kt */
public final class UserInfoResponsePayload$$serializer implements q<UserInfoResponsePayload> {
    public static final UserInfoResponsePayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        UserInfoResponsePayload$$serializer userInfoResponsePayload$$serializer = new UserInfoResponsePayload$$serializer();
        INSTANCE = userInfoResponsePayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.userinfo.UserInfoResponsePayload", userInfoResponsePayload$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("customerId", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("mobile", false);
        pluginGeneratedSerialDescriptor.j("email", false);
        pluginGeneratedSerialDescriptor.j("isSuperUser", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UserInfoResponsePayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a1Var, a1Var, a1Var, a1Var, h.f23089b};
    }

    public UserInfoResponsePayload deserialize(Decoder decoder) {
        boolean z11;
        String str;
        String str2;
        String str3;
        String str4;
        int i11;
        Decoder decoder2 = decoder;
        p.j(decoder2, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder2.b(descriptor2);
        if (b11.k()) {
            String j = b11.j(descriptor2, 0);
            String j11 = b11.j(descriptor2, 1);
            String j12 = b11.j(descriptor2, 2);
            str4 = j;
            str = b11.j(descriptor2, 3);
            z11 = b11.B(descriptor2, 4);
            str2 = j12;
            str3 = j11;
            i11 = 31;
        } else {
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            boolean z12 = false;
            int i12 = 0;
            boolean z13 = true;
            while (z13) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    z13 = false;
                } else if (w11 == 0) {
                    str5 = b11.j(descriptor2, 0);
                    i12 |= 1;
                } else if (w11 == 1) {
                    str8 = b11.j(descriptor2, 1);
                    i12 |= 2;
                } else if (w11 == 2) {
                    str7 = b11.j(descriptor2, 2);
                    i12 |= 4;
                } else if (w11 == 3) {
                    str6 = b11.j(descriptor2, 3);
                    i12 |= 8;
                } else if (w11 == 4) {
                    z12 = b11.B(descriptor2, 4);
                    i12 |= 16;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            str4 = str5;
            str = str6;
            z11 = z12;
            str2 = str7;
            str3 = str8;
            i11 = i12;
        }
        b11.c(descriptor2);
        return new UserInfoResponsePayload(i11, str4, str3, str2, str, z11, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public UserInfoResponsePayload patch(Decoder decoder, UserInfoResponsePayload userInfoResponsePayload) {
        return (UserInfoResponsePayload) q.a.a(this, decoder, userInfoResponsePayload);
    }

    public void serialize(Encoder encoder, UserInfoResponsePayload userInfoResponsePayload) {
        p.j(encoder, "encoder");
        p.j(userInfoResponsePayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        UserInfoResponsePayload.a(userInfoResponsePayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
