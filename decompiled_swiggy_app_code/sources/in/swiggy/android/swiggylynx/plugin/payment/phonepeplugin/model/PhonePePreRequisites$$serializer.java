package in.swiggy.android.swiggylynx.plugin.payment.phonepeplugin.model;

import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.h;
import gq0.q;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: PhonePePreRequisites.kt */
public final class PhonePePreRequisites$$serializer implements q<PhonePePreRequisites> {
    public static final PhonePePreRequisites$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        PhonePePreRequisites$$serializer phonePePreRequisites$$serializer = new PhonePePreRequisites$$serializer();
        INSTANCE = phonePePreRequisites$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.phonepeplugin.model.PhonePePreRequisites", phonePePreRequisites$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("base64Body", true);
        pluginGeneratedSerialDescriptor.j("checksum", true);
        pluginGeneratedSerialDescriptor.j("apiEndPoint", true);
        pluginGeneratedSerialDescriptor.j("transactionId", true);
        pluginGeneratedSerialDescriptor.j("s2s_call_back_url", true);
        pluginGeneratedSerialDescriptor.j("isPhonePeUpiFlow", true);
        pluginGeneratedSerialDescriptor.j("packageName", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PhonePePreRequisites$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(h.f23089b), a.p(a1Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.payment.phonepeplugin.model.PhonePePreRequisites deserialize(kotlinx.serialization.encoding.Decoder r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r17.getDescriptor()
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
            if (r2 == 0) goto L_0x0044
            gq0.a1 r2 = gq0.a1.f23069b
            java.lang.Object r8 = r0.s(r1, r8, r2, r10)
            java.lang.Object r9 = r0.s(r1, r9, r2, r10)
            java.lang.Object r7 = r0.s(r1, r7, r2, r10)
            java.lang.Object r5 = r0.s(r1, r5, r2, r10)
            java.lang.Object r6 = r0.s(r1, r6, r2, r10)
            gq0.h r11 = gq0.h.f23089b
            java.lang.Object r4 = r0.s(r1, r4, r11, r10)
            java.lang.Object r2 = r0.s(r1, r3, r2, r10)
            r3 = 127(0x7f, float:1.78E-43)
            r15 = r4
            r4 = 127(0x7f, float:1.78E-43)
            goto L_0x00ad
        L_0x0044:
            r8 = r10
            r11 = r8
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r2 = 0
            r16 = 1
        L_0x004d:
            if (r16 == 0) goto L_0x00a6
            int r9 = r0.w(r1)
            switch(r9) {
                case -1: goto L_0x00a0;
                case 0: goto L_0x0093;
                case 1: goto L_0x0089;
                case 2: goto L_0x0080;
                case 3: goto L_0x0077;
                case 4: goto L_0x006e;
                case 5: goto L_0x0065;
                case 6: goto L_0x005c;
                default: goto L_0x0056;
            }
        L_0x0056:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r9)
            throw r0
        L_0x005c:
            gq0.a1 r9 = gq0.a1.f23069b
            java.lang.Object r8 = r0.s(r1, r3, r9, r8)
            r2 = r2 | 64
            goto L_0x009e
        L_0x0065:
            gq0.h r9 = gq0.h.f23089b
            java.lang.Object r15 = r0.s(r1, r4, r9, r15)
            r2 = r2 | 32
            goto L_0x009e
        L_0x006e:
            gq0.a1 r9 = gq0.a1.f23069b
            java.lang.Object r14 = r0.s(r1, r6, r9, r14)
            r2 = r2 | 16
            goto L_0x009e
        L_0x0077:
            gq0.a1 r9 = gq0.a1.f23069b
            java.lang.Object r13 = r0.s(r1, r5, r9, r13)
            r2 = r2 | 8
            goto L_0x009e
        L_0x0080:
            gq0.a1 r9 = gq0.a1.f23069b
            java.lang.Object r12 = r0.s(r1, r7, r9, r12)
            r2 = r2 | 4
            goto L_0x009e
        L_0x0089:
            gq0.a1 r9 = gq0.a1.f23069b
            r3 = 1
            java.lang.Object r11 = r0.s(r1, r3, r9, r11)
            r2 = r2 | 2
            goto L_0x009d
        L_0x0093:
            r3 = 1
            gq0.a1 r9 = gq0.a1.f23069b
            r3 = 0
            java.lang.Object r10 = r0.s(r1, r3, r9, r10)
            r2 = r2 | 1
        L_0x009d:
            r3 = 6
        L_0x009e:
            r9 = 1
            goto L_0x004d
        L_0x00a0:
            r3 = 0
            r3 = 6
            r9 = 1
            r16 = 0
            goto L_0x004d
        L_0x00a6:
            r4 = r2
            r2 = r8
            r8 = r10
            r9 = r11
            r7 = r12
            r5 = r13
            r6 = r14
        L_0x00ad:
            r0.c(r1)
            in.swiggy.android.swiggylynx.plugin.payment.phonepeplugin.model.PhonePePreRequisites r0 = new in.swiggy.android.swiggylynx.plugin.payment.phonepeplugin.model.PhonePePreRequisites
            r1 = r8
            java.lang.String r1 = (java.lang.String) r1
            r8 = r9
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r7 = (java.lang.String) r7
            r9 = r5
            java.lang.String r9 = (java.lang.String) r9
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10
            r11 = r15
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            java.lang.String r2 = (java.lang.String) r2
            r12 = 0
            r3 = r0
            r5 = r1
            r6 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r2
            r3.<init>((int) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.Boolean) r10, (java.lang.String) r11, (gq0.x0) r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.payment.phonepeplugin.model.PhonePePreRequisites$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.payment.phonepeplugin.model.PhonePePreRequisites");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public PhonePePreRequisites patch(Decoder decoder, PhonePePreRequisites phonePePreRequisites) {
        return (PhonePePreRequisites) q.a.a(this, decoder, phonePePreRequisites);
    }

    public void serialize(Encoder encoder, PhonePePreRequisites phonePePreRequisites) {
        p.j(encoder, "encoder");
        p.j(phonePePreRequisites, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        PhonePePreRequisites.g(phonePePreRequisites, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
