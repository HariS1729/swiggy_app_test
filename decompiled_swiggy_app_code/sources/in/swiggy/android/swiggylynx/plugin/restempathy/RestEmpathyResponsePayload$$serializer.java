package in.swiggy.android.swiggylynx.plugin.restempathy;

import com.newrelic.agent.android.agentdata.HexAttribute;
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
public final class RestEmpathyResponsePayload$$serializer implements q<RestEmpathyResponsePayload> {
    public static final RestEmpathyResponsePayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        RestEmpathyResponsePayload$$serializer restEmpathyResponsePayload$$serializer = new RestEmpathyResponsePayload$$serializer();
        INSTANCE = restEmpathyResponsePayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.restempathy.RestEmpathyResponsePayload", restEmpathyResponsePayload$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("imageId", false);
        pluginGeneratedSerialDescriptor.j("header", false);
        pluginGeneratedSerialDescriptor.j(HexAttribute.HEX_ATTR_MESSAGE, false);
        pluginGeneratedSerialDescriptor.j("share", false);
        pluginGeneratedSerialDescriptor.j("userName", false);
        pluginGeneratedSerialDescriptor.j("restaurantName", false);
        pluginGeneratedSerialDescriptor.j("orderId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RestEmpathyResponsePayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a1Var, a1Var, a1Var, RestEmpathySharePayload$$serializer.INSTANCE, a1Var, a1Var, a1Var};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.restempathy.RestEmpathyResponsePayload deserialize(kotlinx.serialization.encoding.Decoder r20) {
        /*
            r19 = this;
            r0 = r20
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r19.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r3 = 6
            r4 = 5
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 0
            r9 = 1
            r10 = 0
            if (r2 == 0) goto L_0x0049
            java.lang.String r2 = r0.j(r1, r8)
            java.lang.String r8 = r0.j(r1, r9)
            java.lang.String r7 = r0.j(r1, r7)
            in.swiggy.android.swiggylynx.plugin.restempathy.RestEmpathySharePayload$$serializer r9 = in.swiggy.android.swiggylynx.plugin.restempathy.RestEmpathySharePayload$$serializer.INSTANCE
            java.lang.Object r5 = r0.o(r1, r5, r9, r10)
            java.lang.String r6 = r0.j(r1, r6)
            java.lang.String r4 = r0.j(r1, r4)
            java.lang.String r3 = r0.j(r1, r3)
            r9 = 127(0x7f, float:1.78E-43)
            r11 = r2
            r17 = r3
            r16 = r4
            r15 = r6
            r13 = r7
            r12 = r8
            r10 = 127(0x7f, float:1.78E-43)
            goto L_0x00a5
        L_0x0049:
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r2 = 0
            r17 = 1
        L_0x0053:
            if (r17 == 0) goto L_0x009b
            int r8 = r0.w(r1)
            switch(r8) {
                case -1: goto L_0x0097;
                case 0: goto L_0x008f;
                case 1: goto L_0x0087;
                case 2: goto L_0x0080;
                case 3: goto L_0x0077;
                case 4: goto L_0x0070;
                case 5: goto L_0x0069;
                case 6: goto L_0x0062;
                default: goto L_0x005c;
            }
        L_0x005c:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r8)
            throw r0
        L_0x0062:
            java.lang.String r16 = r0.j(r1, r3)
            r2 = r2 | 64
            goto L_0x008d
        L_0x0069:
            java.lang.String r15 = r0.j(r1, r4)
            r2 = r2 | 32
            goto L_0x008d
        L_0x0070:
            java.lang.String r14 = r0.j(r1, r6)
            r2 = r2 | 16
            goto L_0x008d
        L_0x0077:
            in.swiggy.android.swiggylynx.plugin.restempathy.RestEmpathySharePayload$$serializer r8 = in.swiggy.android.swiggylynx.plugin.restempathy.RestEmpathySharePayload$$serializer.INSTANCE
            java.lang.Object r13 = r0.o(r1, r5, r8, r13)
            r2 = r2 | 8
            goto L_0x008d
        L_0x0080:
            java.lang.String r12 = r0.j(r1, r7)
            r2 = r2 | 4
            goto L_0x008d
        L_0x0087:
            java.lang.String r11 = r0.j(r1, r9)
            r2 = r2 | 2
        L_0x008d:
            r8 = 0
            goto L_0x0053
        L_0x008f:
            r8 = 0
            java.lang.String r10 = r0.j(r1, r8)
            r2 = r2 | 1
            goto L_0x0053
        L_0x0097:
            r8 = 0
            r17 = 0
            goto L_0x0053
        L_0x009b:
            r5 = r13
            r17 = r16
            r13 = r12
            r16 = r15
            r12 = r11
            r15 = r14
            r11 = r10
            r10 = r2
        L_0x00a5:
            r0.c(r1)
            in.swiggy.android.swiggylynx.plugin.restempathy.RestEmpathyResponsePayload r0 = new in.swiggy.android.swiggylynx.plugin.restempathy.RestEmpathyResponsePayload
            r14 = r5
            in.swiggy.android.swiggylynx.plugin.restempathy.RestEmpathySharePayload r14 = (in.swiggy.android.swiggylynx.plugin.restempathy.RestEmpathySharePayload) r14
            r18 = 0
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.restempathy.RestEmpathyResponsePayload$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.restempathy.RestEmpathyResponsePayload");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public RestEmpathyResponsePayload patch(Decoder decoder, RestEmpathyResponsePayload restEmpathyResponsePayload) {
        return (RestEmpathyResponsePayload) q.a.a(this, decoder, restEmpathyResponsePayload);
    }

    public void serialize(Encoder encoder, RestEmpathyResponsePayload restEmpathyResponsePayload) {
        p.j(encoder, "encoder");
        p.j(restEmpathyResponsePayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        RestEmpathyResponsePayload.b(restEmpathyResponsePayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
