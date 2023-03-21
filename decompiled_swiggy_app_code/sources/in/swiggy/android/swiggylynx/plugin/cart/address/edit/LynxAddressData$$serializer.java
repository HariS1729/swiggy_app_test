package in.swiggy.android.swiggylynx.plugin.cart.address.edit;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.n;
import gq0.q;
import gq0.w;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: EditAddressRequestPayload.kt */
public final class LynxAddressData$$serializer implements q<LynxAddressData> {
    public static final LynxAddressData$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        LynxAddressData$$serializer lynxAddressData$$serializer = new LynxAddressData$$serializer();
        INSTANCE = lynxAddressData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.cart.address.edit.LynxAddressData", lynxAddressData$$serializer, 15);
        pluginGeneratedSerialDescriptor.j("address_line2", false);
        pluginGeneratedSerialDescriptor.j("address", false);
        pluginGeneratedSerialDescriptor.j("annotation", false);
        pluginGeneratedSerialDescriptor.j("annotationTag", false);
        pluginGeneratedSerialDescriptor.j("area", false);
        pluginGeneratedSerialDescriptor.j("city", false);
        pluginGeneratedSerialDescriptor.j("mobile", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("instructions", false);
        pluginGeneratedSerialDescriptor.j("flat_no", false);
        pluginGeneratedSerialDescriptor.j(DistributedTracing.NR_ID_ATTRIBUTE, false);
        pluginGeneratedSerialDescriptor.j("landmark", false);
        pluginGeneratedSerialDescriptor.j("lat", false);
        pluginGeneratedSerialDescriptor.j("lng", false);
        pluginGeneratedSerialDescriptor.j("voice_directions_s3_uri", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LynxAddressData$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        n nVar = n.f23109b;
        return new KSerializer[]{a.p(a1Var), a.p(a1Var), a.p(a1Var), w.f23130b, a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a1Var, a.p(a1Var), nVar, nVar, a.p(a1Var)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00eb, code lost:
        r5 = 14;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0174, code lost:
        r5 = 14;
        r6 = 11;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a8, code lost:
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a8, code lost:
        r14 = r14;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.cart.address.edit.LynxAddressData deserialize(kotlinx.serialization.encoding.Decoder r34) {
        /*
            r33 = this;
            r0 = r34
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r33.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r6 = 11
            r7 = 10
            r8 = 9
            r9 = 7
            r10 = 6
            r11 = 5
            r12 = 3
            r13 = 8
            r14 = 4
            r15 = 2
            r3 = 1
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L_0x008b
            gq0.a1 r2 = gq0.a1.f23069b
            java.lang.Object r4 = r0.s(r1, r4, r2, r5)
            java.lang.Object r3 = r0.s(r1, r3, r2, r5)
            java.lang.Object r15 = r0.s(r1, r15, r2, r5)
            int r12 = r0.g(r1, r12)
            java.lang.Object r14 = r0.s(r1, r14, r2, r5)
            java.lang.Object r11 = r0.s(r1, r11, r2, r5)
            java.lang.Object r10 = r0.s(r1, r10, r2, r5)
            java.lang.Object r9 = r0.s(r1, r9, r2, r5)
            java.lang.Object r13 = r0.s(r1, r13, r2, r5)
            java.lang.Object r8 = r0.s(r1, r8, r2, r5)
            java.lang.String r7 = r0.j(r1, r7)
            java.lang.Object r6 = r0.s(r1, r6, r2, r5)
            r5 = 12
            double r19 = r0.E(r1, r5)
            r5 = 13
            double r16 = r0.E(r1, r5)
            r34 = r4
            r4 = 0
            r5 = 14
            java.lang.Object r2 = r0.s(r1, r5, r2, r4)
            r4 = 32767(0x7fff, float:4.5916E-41)
            r24 = r7
            r25 = r12
            r18 = r19
            r5 = 32767(0x7fff, float:4.5916E-41)
            r20 = r16
            r16 = r13
            r13 = r9
            r9 = r6
            r6 = r34
            r31 = r15
            r15 = r8
            r8 = r31
            r32 = r14
            r14 = r10
            r10 = r32
            goto L_0x019b
        L_0x008b:
            r4 = r5
            r2 = 0
            r5 = 14
            r18 = 0
            r2 = r4
            r3 = r2
            r8 = r3
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r21 = r15
            r24 = r21
            r26 = r18
            r28 = r26
            r4 = 0
            r25 = 0
            r30 = 1
        L_0x00a8:
            if (r30 == 0) goto L_0x0187
            int r7 = r0.w(r1)
            switch(r7) {
                case -1: goto L_0x017c;
                case 0: goto L_0x0166;
                case 1: goto L_0x0159;
                case 2: goto L_0x014c;
                case 3: goto L_0x0141;
                case 4: goto L_0x0134;
                case 5: goto L_0x0127;
                case 6: goto L_0x011a;
                case 7: goto L_0x010c;
                case 8: goto L_0x00fd;
                case 9: goto L_0x00ef;
                case 10: goto L_0x00e1;
                case 11: goto L_0x00d6;
                case 12: goto L_0x00cb;
                case 13: goto L_0x00c1;
                case 14: goto L_0x00b7;
                default: goto L_0x00b1;
            }
        L_0x00b1:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r7)
            throw r0
        L_0x00b7:
            gq0.a1 r7 = gq0.a1.f23069b
            java.lang.Object r8 = r0.s(r1, r5, r7, r8)
            r4 = r4 | 16384(0x4000, float:2.2959E-41)
            goto L_0x0178
        L_0x00c1:
            r7 = 13
            double r26 = r0.E(r1, r7)
            r4 = r4 | 8192(0x2000, float:1.14794E-41)
            goto L_0x0178
        L_0x00cb:
            r5 = 12
            r7 = 13
            double r28 = r0.E(r1, r5)
            r4 = r4 | 4096(0x1000, float:5.74E-42)
            goto L_0x00eb
        L_0x00d6:
            r7 = 13
            gq0.a1 r5 = gq0.a1.f23069b
            java.lang.Object r13 = r0.s(r1, r6, r5, r13)
            r4 = r4 | 2048(0x800, float:2.87E-42)
            goto L_0x00eb
        L_0x00e1:
            r5 = 10
            r7 = 13
            java.lang.String r24 = r0.j(r1, r5)
            r4 = r4 | 1024(0x400, float:1.435E-42)
        L_0x00eb:
            r5 = 14
            goto L_0x0178
        L_0x00ef:
            r7 = 13
            gq0.a1 r5 = gq0.a1.f23069b
            r6 = 9
            java.lang.Object r9 = r0.s(r1, r6, r5, r9)
            r4 = r4 | 512(0x200, float:7.175E-43)
            goto L_0x0174
        L_0x00fd:
            r6 = 9
            r7 = 13
            gq0.a1 r5 = gq0.a1.f23069b
            r6 = 8
            java.lang.Object r10 = r0.s(r1, r6, r5, r10)
            r4 = r4 | 256(0x100, float:3.59E-43)
            goto L_0x0174
        L_0x010c:
            r6 = 8
            r7 = 13
            gq0.a1 r5 = gq0.a1.f23069b
            r6 = 7
            java.lang.Object r11 = r0.s(r1, r6, r5, r11)
            r4 = r4 | 128(0x80, float:1.794E-43)
            goto L_0x0174
        L_0x011a:
            r6 = 7
            r7 = 13
            gq0.a1 r5 = gq0.a1.f23069b
            r6 = 6
            java.lang.Object r14 = r0.s(r1, r6, r5, r14)
            r4 = r4 | 64
            goto L_0x0174
        L_0x0127:
            r6 = 6
            r7 = 13
            gq0.a1 r5 = gq0.a1.f23069b
            r6 = 5
            java.lang.Object r12 = r0.s(r1, r6, r5, r12)
            r4 = r4 | 32
            goto L_0x0174
        L_0x0134:
            r6 = 5
            r7 = 13
            gq0.a1 r5 = gq0.a1.f23069b
            r6 = 4
            java.lang.Object r15 = r0.s(r1, r6, r5, r15)
            r4 = r4 | 16
            goto L_0x0174
        L_0x0141:
            r5 = 3
            r6 = 4
            r7 = 13
            int r25 = r0.g(r1, r5)
            r4 = r4 | 8
            goto L_0x0174
        L_0x014c:
            r6 = 4
            r7 = 13
            gq0.a1 r5 = gq0.a1.f23069b
            r6 = 2
            java.lang.Object r3 = r0.s(r1, r6, r5, r3)
            r4 = r4 | 4
            goto L_0x0174
        L_0x0159:
            r6 = 2
            r7 = 13
            gq0.a1 r5 = gq0.a1.f23069b
            r6 = 1
            java.lang.Object r2 = r0.s(r1, r6, r5, r2)
            r4 = r4 | 2
            goto L_0x0174
        L_0x0166:
            r6 = 1
            r7 = 13
            gq0.a1 r5 = gq0.a1.f23069b
            r6 = r21
            r7 = 0
            java.lang.Object r21 = r0.s(r1, r7, r5, r6)
            r4 = r4 | 1
        L_0x0174:
            r5 = 14
            r6 = 11
        L_0x0178:
            r7 = 10
            goto L_0x00a8
        L_0x017c:
            r6 = r21
            r7 = 0
            r6 = 11
            r7 = 10
            r30 = 0
            goto L_0x00a8
        L_0x0187:
            r6 = r21
            r5 = r4
            r16 = r10
            r10 = r15
            r20 = r26
            r18 = r28
            r15 = r9
            r9 = r13
            r13 = r11
            r11 = r12
            r31 = r3
            r3 = r2
            r2 = r8
            r8 = r31
        L_0x019b:
            r0.c(r1)
            in.swiggy.android.swiggylynx.plugin.cart.address.edit.LynxAddressData r0 = new in.swiggy.android.swiggylynx.plugin.cart.address.edit.LynxAddressData
            r4 = r0
            java.lang.String r6 = (java.lang.String) r6
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = (java.lang.String) r11
            r12 = r14
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = (java.lang.String) r13
            r14 = r16
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r15 = (java.lang.String) r15
            r17 = r9
            java.lang.String r17 = (java.lang.String) r17
            r22 = r2
            java.lang.String r22 = (java.lang.String) r22
            r23 = 0
            r9 = r25
            r16 = r24
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22, r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.cart.address.edit.LynxAddressData$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.cart.address.edit.LynxAddressData");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public LynxAddressData patch(Decoder decoder, LynxAddressData lynxAddressData) {
        return (LynxAddressData) q.a.a(this, decoder, lynxAddressData);
    }

    public void serialize(Encoder encoder, LynxAddressData lynxAddressData) {
        p.j(encoder, "encoder");
        p.j(lynxAddressData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        LynxAddressData.p(lynxAddressData, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
