package in.swiggy.android.swiggylynx.plugin.restempathy;

import com.newrelic.agent.android.agentdata.HexAttribute;
import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.q;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: RestEmpathyResponsePayload.kt */
public final class RestEmpathySharePayload$$serializer implements q<RestEmpathySharePayload> {
    public static final RestEmpathySharePayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        RestEmpathySharePayload$$serializer restEmpathySharePayload$$serializer = new RestEmpathySharePayload$$serializer();
        INSTANCE = restEmpathySharePayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.restempathy.RestEmpathySharePayload", restEmpathySharePayload$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("buttonText", false);
        pluginGeneratedSerialDescriptor.j("header", false);
        pluginGeneratedSerialDescriptor.j(HexAttribute.HEX_ATTR_MESSAGE, true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("url", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RestEmpathySharePayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a1Var, a1Var, a.p(a1Var), a.p(a1Var), a.p(a1Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.restempathy.RestEmpathySharePayload deserialize(kotlinx.serialization.encoding.Decoder r23) {
        /*
            r22 = this;
            r0 = r23
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r22.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r3 = 3
            r4 = 4
            r5 = 2
            r6 = 0
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L_0x003a
            java.lang.String r2 = r0.j(r1, r6)
            java.lang.String r6 = r0.j(r1, r8)
            gq0.a1 r8 = gq0.a1.f23069b
            java.lang.Object r5 = r0.s(r1, r5, r8, r7)
            java.lang.Object r3 = r0.s(r1, r3, r8, r7)
            java.lang.Object r4 = r0.s(r1, r4, r8, r7)
            r7 = 31
            r16 = r2
            r17 = r6
            r15 = 31
            goto L_0x008d
        L_0x003a:
            r2 = r7
            r9 = r2
            r10 = r9
            r11 = r10
            r12 = r11
            r7 = 0
            r13 = 1
        L_0x0041:
            if (r13 == 0) goto L_0x0085
            int r14 = r0.w(r1)
            r15 = -1
            if (r14 == r15) goto L_0x0083
            if (r14 == 0) goto L_0x007c
            if (r14 == r8) goto L_0x0075
            if (r14 == r5) goto L_0x006c
            if (r14 == r3) goto L_0x0063
            if (r14 != r4) goto L_0x005d
            gq0.a1 r14 = gq0.a1.f23069b
            java.lang.Object r12 = r0.s(r1, r4, r14, r12)
            r7 = r7 | 16
            goto L_0x0041
        L_0x005d:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r14)
            throw r0
        L_0x0063:
            gq0.a1 r14 = gq0.a1.f23069b
            java.lang.Object r11 = r0.s(r1, r3, r14, r11)
            r7 = r7 | 8
            goto L_0x0041
        L_0x006c:
            gq0.a1 r14 = gq0.a1.f23069b
            java.lang.Object r10 = r0.s(r1, r5, r14, r10)
            r7 = r7 | 4
            goto L_0x0041
        L_0x0075:
            java.lang.String r9 = r0.j(r1, r8)
            r7 = r7 | 2
            goto L_0x0041
        L_0x007c:
            java.lang.String r2 = r0.j(r1, r6)
            r7 = r7 | 1
            goto L_0x0041
        L_0x0083:
            r13 = 0
            goto L_0x0041
        L_0x0085:
            r16 = r2
            r15 = r7
            r17 = r9
            r5 = r10
            r3 = r11
            r4 = r12
        L_0x008d:
            r0.c(r1)
            in.swiggy.android.swiggylynx.plugin.restempathy.RestEmpathySharePayload r0 = new in.swiggy.android.swiggylynx.plugin.restempathy.RestEmpathySharePayload
            r18 = r5
            java.lang.String r18 = (java.lang.String) r18
            r19 = r3
            java.lang.String r19 = (java.lang.String) r19
            r20 = r4
            java.lang.String r20 = (java.lang.String) r20
            r21 = 0
            r14 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.restempathy.RestEmpathySharePayload$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.restempathy.RestEmpathySharePayload");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public RestEmpathySharePayload patch(Decoder decoder, RestEmpathySharePayload restEmpathySharePayload) {
        return (RestEmpathySharePayload) q.a.a(this, decoder, restEmpathySharePayload);
    }

    public void serialize(Encoder encoder, RestEmpathySharePayload restEmpathySharePayload) {
        p.j(encoder, "encoder");
        p.j(restEmpathySharePayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        RestEmpathySharePayload.a(restEmpathySharePayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
