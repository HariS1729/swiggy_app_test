package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility;

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

/* compiled from: JuspayRequestParams.kt */
public final class JuspayRequestParams$$serializer implements q<JuspayRequestParams> {
    public static final JuspayRequestParams$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        JuspayRequestParams$$serializer juspayRequestParams$$serializer = new JuspayRequestParams$$serializer();
        INSTANCE = juspayRequestParams$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspayRequestParams", juspayRequestParams$$serializer, 21);
        pluginGeneratedSerialDescriptor.j("orderId", false);
        pluginGeneratedSerialDescriptor.j("returnUrl", false);
        pluginGeneratedSerialDescriptor.j("paymentMethodType", false);
        pluginGeneratedSerialDescriptor.j("bankCode", true);
        pluginGeneratedSerialDescriptor.j("cardToken", true);
        pluginGeneratedSerialDescriptor.j("redirectAfterPayment", true);
        pluginGeneratedSerialDescriptor.j("tokenize", true);
        pluginGeneratedSerialDescriptor.j("format", true);
        pluginGeneratedSerialDescriptor.j("paymentMethod", true);
        pluginGeneratedSerialDescriptor.j("cardSecurityCode", true);
        pluginGeneratedSerialDescriptor.j("juspayClientAuthToken", true);
        pluginGeneratedSerialDescriptor.j("authTypeForCard", true);
        pluginGeneratedSerialDescriptor.j("saveToLocker", true);
        pluginGeneratedSerialDescriptor.j("nameOnCard", true);
        pluginGeneratedSerialDescriptor.j("cardNumber", true);
        pluginGeneratedSerialDescriptor.j("cardBin", true);
        pluginGeneratedSerialDescriptor.j("cardExpMonth", true);
        pluginGeneratedSerialDescriptor.j("cardExpYear", true);
        pluginGeneratedSerialDescriptor.j("clientAuthToken", true);
        pluginGeneratedSerialDescriptor.j("nickname", true);
        pluginGeneratedSerialDescriptor.j("orderAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private JuspayRequestParams$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        h hVar = h.f23089b;
        return new KSerializer[]{a1Var, a1Var, a1Var, a.p(a1Var), a.p(a1Var), a.p(hVar), a.p(hVar), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(hVar), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a1Var};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x02c3, code lost:
        r8 = r16;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x02c5, code lost:
        r11 = r45;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0315, code lost:
        r3 = r16;
        r11 = r45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x034c, code lost:
        r8 = r2;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x034d, code lost:
        r2 = 20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f0, code lost:
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f0, code lost:
        r13 = r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspayRequestParams deserialize(kotlinx.serialization.encoding.Decoder r48) {
        /*
            r47 = this;
            r0 = r48
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r47.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r12 = 10
            r13 = 9
            r14 = 7
            r15 = 6
            r3 = 5
            r4 = 3
            r6 = 8
            r5 = 4
            r7 = 2
            r8 = 0
            r9 = 1
            r10 = 0
            if (r2 == 0) goto L_0x00cd
            java.lang.String r2 = r0.j(r1, r8)
            java.lang.String r8 = r0.j(r1, r9)
            java.lang.String r7 = r0.j(r1, r7)
            gq0.a1 r9 = gq0.a1.f23069b
            java.lang.Object r4 = r0.s(r1, r4, r9, r10)
            java.lang.Object r5 = r0.s(r1, r5, r9, r10)
            gq0.h r11 = gq0.h.f23089b
            java.lang.Object r3 = r0.s(r1, r3, r11, r10)
            java.lang.Object r15 = r0.s(r1, r15, r11, r10)
            java.lang.Object r14 = r0.s(r1, r14, r9, r10)
            java.lang.Object r6 = r0.s(r1, r6, r9, r10)
            java.lang.Object r13 = r0.s(r1, r13, r9, r10)
            java.lang.Object r12 = r0.s(r1, r12, r9, r10)
            r25 = r2
            r2 = 11
            java.lang.Object r2 = r0.s(r1, r2, r9, r10)
            r24 = r2
            r2 = 12
            java.lang.Object r2 = r0.s(r1, r2, r11, r10)
            r11 = 13
            java.lang.Object r11 = r0.s(r1, r11, r9, r10)
            r22 = r2
            r2 = 14
            java.lang.Object r2 = r0.s(r1, r2, r9, r10)
            r21 = r2
            r2 = 15
            java.lang.Object r2 = r0.s(r1, r2, r9, r10)
            r20 = r2
            r2 = 16
            java.lang.Object r2 = r0.s(r1, r2, r9, r10)
            r19 = r2
            r2 = 17
            java.lang.Object r2 = r0.s(r1, r2, r9, r10)
            r18 = r2
            r2 = 18
            java.lang.Object r2 = r0.s(r1, r2, r9, r10)
            r17 = r2
            r2 = 19
            java.lang.Object r2 = r0.s(r1, r2, r9, r10)
            r9 = 20
            java.lang.String r9 = r0.j(r1, r9)
            r10 = 2097151(0x1fffff, float:2.938734E-39)
            r10 = r4
            r16 = r6
            r37 = r7
            r36 = r8
            r43 = r9
            r23 = r13
            r6 = r17
            r4 = r19
            r8 = r21
            r13 = r22
            r34 = 2097151(0x1fffff, float:2.938734E-39)
            r7 = r2
            r9 = r3
            r21 = r14
            r3 = r20
            r2 = r24
            r14 = r25
            r24 = r12
            r20 = r15
            r15 = r11
            r11 = r5
            r5 = r18
            goto L_0x0383
        L_0x00cd:
            r2 = 20
            r3 = r10
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r11 = r9
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r25 = r15
            r26 = r25
            r37 = r26
            r38 = r37
            r39 = r38
            r40 = r39
            r41 = r40
            r42 = r41
            r43 = r42
            r10 = 0
            r44 = 1
        L_0x00f0:
            if (r44 == 0) goto L_0x0351
            r45 = r11
            int r11 = r0.w(r1)
            switch(r11) {
                case -1: goto L_0x0336;
                case 0: goto L_0x031a;
                case 1: goto L_0x02fe;
                case 2: goto L_0x02e6;
                case 3: goto L_0x02c9;
                case 4: goto L_0x02ab;
                case 5: goto L_0x0292;
                case 6: goto L_0x0279;
                case 7: goto L_0x025f;
                case 8: goto L_0x0243;
                case 9: goto L_0x0227;
                case 10: goto L_0x020b;
                case 11: goto L_0x01ef;
                case 12: goto L_0x01d3;
                case 13: goto L_0x01b7;
                case 14: goto L_0x0195;
                case 15: goto L_0x0173;
                case 16: goto L_0x0154;
                case 17: goto L_0x0137;
                case 18: goto L_0x011c;
                case 19: goto L_0x010b;
                case 20: goto L_0x0101;
                default: goto L_0x00fb;
            }
        L_0x00fb:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r11)
            throw r0
        L_0x0101:
            java.lang.String r43 = r0.j(r1, r2)
            r11 = 1048576(0x100000, float:1.469368E-39)
            r10 = r10 | r11
            r11 = r45
            goto L_0x00f0
        L_0x010b:
            gq0.a1 r11 = gq0.a1.f23069b
            r16 = r8
            r2 = r42
            r8 = 19
            java.lang.Object r42 = r0.s(r1, r8, r11, r2)
            r2 = 524288(0x80000, float:7.34684E-40)
            r10 = r10 | r2
            goto L_0x02c3
        L_0x011c:
            r16 = r8
            r2 = r42
            r8 = 19
            gq0.a1 r11 = gq0.a1.f23069b
            r17 = r2
            r8 = r41
            r2 = 18
            java.lang.Object r41 = r0.s(r1, r2, r11, r8)
            r8 = 262144(0x40000, float:3.67342E-40)
            r10 = r10 | r8
            r8 = r16
            r42 = r17
            goto L_0x02c5
        L_0x0137:
            r16 = r8
            r8 = r41
            r17 = r42
            r2 = 18
            gq0.a1 r11 = gq0.a1.f23069b
            r18 = r8
            r2 = r40
            r8 = 17
            java.lang.Object r40 = r0.s(r1, r8, r11, r2)
            r2 = 131072(0x20000, float:1.83671E-40)
            r10 = r10 | r2
            r8 = r16
            r41 = r18
            goto L_0x02c5
        L_0x0154:
            r16 = r8
            r2 = r40
            r18 = r41
            r17 = r42
            r8 = 17
            gq0.a1 r11 = gq0.a1.f23069b
            r19 = r2
            r8 = r39
            r2 = 16
            java.lang.Object r39 = r0.s(r1, r2, r11, r8)
            r8 = 65536(0x10000, float:9.18355E-41)
            r10 = r10 | r8
            r8 = r16
            r40 = r19
            goto L_0x02c5
        L_0x0173:
            r16 = r8
            r8 = r39
            r19 = r40
            r18 = r41
            r17 = r42
            r2 = 16
            gq0.a1 r11 = gq0.a1.f23069b
            r20 = r8
            r2 = r38
            r8 = 15
            java.lang.Object r38 = r0.s(r1, r8, r11, r2)
            r2 = 32768(0x8000, float:4.5918E-41)
            r10 = r10 | r2
            r8 = r16
            r39 = r20
            goto L_0x02c5
        L_0x0195:
            r16 = r8
            r2 = r38
            r20 = r39
            r19 = r40
            r18 = r41
            r17 = r42
            r8 = 15
            gq0.a1 r11 = gq0.a1.f23069b
            r21 = r2
            r8 = r37
            r2 = 14
            java.lang.Object r37 = r0.s(r1, r2, r11, r8)
            r10 = r10 | 16384(0x4000, float:2.2959E-41)
            r8 = r16
            r38 = r21
            goto L_0x02c5
        L_0x01b7:
            r16 = r8
            r8 = r37
            r21 = r38
            r20 = r39
            r19 = r40
            r18 = r41
            r17 = r42
            r2 = 14
            gq0.a1 r11 = gq0.a1.f23069b
            r2 = 13
            java.lang.Object r12 = r0.s(r1, r2, r11, r12)
            r10 = r10 | 8192(0x2000, float:1.14794E-41)
            goto L_0x02c3
        L_0x01d3:
            r16 = r8
            r8 = r37
            r21 = r38
            r20 = r39
            r19 = r40
            r18 = r41
            r17 = r42
            r2 = 13
            gq0.h r11 = gq0.h.f23089b
            r2 = 12
            java.lang.Object r13 = r0.s(r1, r2, r11, r13)
            r10 = r10 | 4096(0x1000, float:5.74E-42)
            goto L_0x02c3
        L_0x01ef:
            r16 = r8
            r8 = r37
            r21 = r38
            r20 = r39
            r19 = r40
            r18 = r41
            r17 = r42
            r2 = 12
            gq0.a1 r11 = gq0.a1.f23069b
            r2 = 11
            java.lang.Object r6 = r0.s(r1, r2, r11, r6)
            r10 = r10 | 2048(0x800, float:2.87E-42)
            goto L_0x02c3
        L_0x020b:
            r16 = r8
            r8 = r37
            r21 = r38
            r20 = r39
            r19 = r40
            r18 = r41
            r17 = r42
            r2 = 11
            gq0.a1 r11 = gq0.a1.f23069b
            r2 = 10
            java.lang.Object r14 = r0.s(r1, r2, r11, r14)
            r10 = r10 | 1024(0x400, float:1.435E-42)
            goto L_0x02c3
        L_0x0227:
            r16 = r8
            r8 = r37
            r21 = r38
            r20 = r39
            r19 = r40
            r18 = r41
            r17 = r42
            r2 = 10
            gq0.a1 r11 = gq0.a1.f23069b
            r2 = 9
            java.lang.Object r15 = r0.s(r1, r2, r11, r15)
            r10 = r10 | 512(0x200, float:7.175E-43)
            goto L_0x02c3
        L_0x0243:
            r16 = r8
            r8 = r37
            r21 = r38
            r20 = r39
            r19 = r40
            r18 = r41
            r17 = r42
            r2 = 9
            gq0.a1 r11 = gq0.a1.f23069b
            r2 = 8
            java.lang.Object r3 = r0.s(r1, r2, r11, r3)
            r10 = r10 | 256(0x100, float:3.59E-43)
            goto L_0x02c3
        L_0x025f:
            r16 = r8
            r8 = r37
            r21 = r38
            r20 = r39
            r19 = r40
            r18 = r41
            r17 = r42
            r2 = 8
            gq0.a1 r11 = gq0.a1.f23069b
            r2 = 7
            java.lang.Object r5 = r0.s(r1, r2, r11, r5)
            r10 = r10 | 128(0x80, float:1.794E-43)
            goto L_0x02c3
        L_0x0279:
            r16 = r8
            r8 = r37
            r21 = r38
            r20 = r39
            r19 = r40
            r18 = r41
            r17 = r42
            r2 = 7
            gq0.h r11 = gq0.h.f23089b
            r2 = 6
            java.lang.Object r4 = r0.s(r1, r2, r11, r4)
            r10 = r10 | 64
            goto L_0x02c3
        L_0x0292:
            r16 = r8
            r8 = r37
            r21 = r38
            r20 = r39
            r19 = r40
            r18 = r41
            r17 = r42
            r2 = 6
            gq0.h r11 = gq0.h.f23089b
            r2 = 5
            java.lang.Object r7 = r0.s(r1, r2, r11, r7)
            r10 = r10 | 32
            goto L_0x02c3
        L_0x02ab:
            r16 = r8
            r8 = r37
            r21 = r38
            r20 = r39
            r19 = r40
            r18 = r41
            r17 = r42
            r2 = 5
            gq0.a1 r11 = gq0.a1.f23069b
            r2 = 4
            java.lang.Object r9 = r0.s(r1, r2, r11, r9)
            r10 = r10 | 16
        L_0x02c3:
            r8 = r16
        L_0x02c5:
            r11 = r45
            goto L_0x034d
        L_0x02c9:
            r16 = r8
            r8 = r37
            r21 = r38
            r20 = r39
            r19 = r40
            r18 = r41
            r17 = r42
            r2 = 4
            gq0.a1 r11 = gq0.a1.f23069b
            r2 = r16
            r16 = r3
            r3 = 3
            java.lang.Object r2 = r0.s(r1, r3, r11, r2)
            r10 = r10 | 8
            goto L_0x0315
        L_0x02e6:
            r16 = r3
            r2 = r8
            r8 = r37
            r21 = r38
            r20 = r39
            r19 = r40
            r18 = r41
            r17 = r42
            r3 = 3
            r11 = 2
            java.lang.String r26 = r0.j(r1, r11)
            r10 = r10 | 4
            goto L_0x0315
        L_0x02fe:
            r16 = r3
            r2 = r8
            r8 = r37
            r21 = r38
            r20 = r39
            r19 = r40
            r18 = r41
            r17 = r42
            r3 = 1
            r11 = 2
            java.lang.String r25 = r0.j(r1, r3)
            r10 = r10 | 2
        L_0x0315:
            r3 = r16
            r11 = r45
            goto L_0x034c
        L_0x031a:
            r16 = r3
            r2 = r8
            r8 = r37
            r21 = r38
            r20 = r39
            r19 = r40
            r18 = r41
            r17 = r42
            r3 = 0
            r11 = 2
            java.lang.String r28 = r0.j(r1, r3)
            r10 = r10 | 1
            r3 = r16
            r11 = r28
            goto L_0x034c
        L_0x0336:
            r16 = r3
            r2 = r8
            r8 = r37
            r21 = r38
            r20 = r39
            r19 = r40
            r18 = r41
            r17 = r42
            r3 = 0
            r3 = r16
            r11 = r45
            r44 = 0
        L_0x034c:
            r8 = r2
        L_0x034d:
            r2 = 20
            goto L_0x00f0
        L_0x0351:
            r16 = r3
            r2 = r8
            r45 = r11
            r8 = r37
            r21 = r38
            r20 = r39
            r19 = r40
            r18 = r41
            r17 = r42
            r11 = r9
            r34 = r10
            r24 = r14
            r23 = r15
            r3 = r21
            r36 = r25
            r37 = r26
            r14 = r45
            r10 = r2
            r21 = r5
            r2 = r6
            r9 = r7
            r15 = r12
            r7 = r17
            r6 = r18
            r5 = r19
            r46 = r20
            r20 = r4
            r4 = r46
        L_0x0383:
            r0.c(r1)
            in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspayRequestParams r0 = new in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspayRequestParams
            r12 = r0
            r17 = r10
            java.lang.String r17 = (java.lang.String) r17
            r18 = r11
            java.lang.String r18 = (java.lang.String) r18
            r19 = r9
            java.lang.Boolean r19 = (java.lang.Boolean) r19
            java.lang.Boolean r20 = (java.lang.Boolean) r20
            java.lang.String r21 = (java.lang.String) r21
            r22 = r16
            java.lang.String r22 = (java.lang.String) r22
            java.lang.String r23 = (java.lang.String) r23
            java.lang.String r24 = (java.lang.String) r24
            r25 = r2
            java.lang.String r25 = (java.lang.String) r25
            r26 = r13
            java.lang.Boolean r26 = (java.lang.Boolean) r26
            r27 = r15
            java.lang.String r27 = (java.lang.String) r27
            r28 = r8
            java.lang.String r28 = (java.lang.String) r28
            r29 = r3
            java.lang.String r29 = (java.lang.String) r29
            r30 = r4
            java.lang.String r30 = (java.lang.String) r30
            r31 = r5
            java.lang.String r31 = (java.lang.String) r31
            r32 = r6
            java.lang.String r32 = (java.lang.String) r32
            r33 = r7
            java.lang.String r33 = (java.lang.String) r33
            r35 = 0
            r13 = r34
            r15 = r36
            r16 = r37
            r34 = r43
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspayRequestParams$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.utility.JuspayRequestParams");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public JuspayRequestParams patch(Decoder decoder, JuspayRequestParams juspayRequestParams) {
        return (JuspayRequestParams) q.a.a(this, decoder, juspayRequestParams);
    }

    public void serialize(Encoder encoder, JuspayRequestParams juspayRequestParams) {
        p.j(encoder, "encoder");
        p.j(juspayRequestParams, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        JuspayRequestParams.t(juspayRequestParams, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
