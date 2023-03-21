package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.login;

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

/* compiled from: LoginRequestPayload.kt */
public final class LoginRequestPayload$$serializer implements q<LoginRequestPayload> {
    public static final LoginRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        LoginRequestPayload$$serializer loginRequestPayload$$serializer = new LoginRequestPayload$$serializer();
        INSTANCE = loginRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.login.LoginRequestPayload", loginRequestPayload$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("reloadUrl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LoginRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.p(a1.f23069b)};
    }

    public LoginRequestPayload deserialize(Decoder decoder) {
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
        return new LoginRequestPayload(i11, (String) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public LoginRequestPayload patch(Decoder decoder, LoginRequestPayload loginRequestPayload) {
        return (LoginRequestPayload) q.a.a(this, decoder, loginRequestPayload);
    }

    public void serialize(Encoder encoder, LoginRequestPayload loginRequestPayload) {
        p.j(encoder, "encoder");
        p.j(loginRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        LoginRequestPayload.c(loginRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
