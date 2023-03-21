package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.setlocation;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.n;
import gq0.q;
import gq0.w;
import in.swiggy.android.tejas.feature.trackv3.responsedatatypes.TrackOrderType;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: SetLocationRequestPayload.kt */
public final class SetLocationRequestPayload$$serializer implements q<SetLocationRequestPayload> {
    public static final SetLocationRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        SetLocationRequestPayload$$serializer setLocationRequestPayload$$serializer = new SetLocationRequestPayload$$serializer();
        INSTANCE = setLocationRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.setlocation.SetLocationRequestPayload", setLocationRequestPayload$$serializer, 18);
        pluginGeneratedSerialDescriptor.j("lat", false);
        pluginGeneratedSerialDescriptor.j("lng", false);
        pluginGeneratedSerialDescriptor.j("city", false);
        pluginGeneratedSerialDescriptor.j("area", false);
        pluginGeneratedSerialDescriptor.j("address", false);
        pluginGeneratedSerialDescriptor.j("addressType", true);
        pluginGeneratedSerialDescriptor.j(DistributedTracing.NR_ID_ATTRIBUTE, true);
        pluginGeneratedSerialDescriptor.j("deliveryLocation", true);
        pluginGeneratedSerialDescriptor.j("mainText", true);
        pluginGeneratedSerialDescriptor.j("landmark", true);
        pluginGeneratedSerialDescriptor.j("isDeleted", true);
        pluginGeneratedSerialDescriptor.j("annotation", true);
        pluginGeneratedSerialDescriptor.j("flatNo", true);
        pluginGeneratedSerialDescriptor.j("reverseGeoCodeFailed", true);
        pluginGeneratedSerialDescriptor.j(TrackOrderType.DEFAULT, true);
        pluginGeneratedSerialDescriptor.j("sortScore", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("mobile", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SetLocationRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        n nVar = n.f23109b;
        a1 a1Var = a1.f23069b;
        w wVar = w.f23130b;
        return new KSerializer[]{nVar, nVar, a1Var, a1Var, a1Var, a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), wVar, a.p(a1Var), a.p(a1Var), wVar, wVar, a.p(wVar), a.p(a1Var), a.p(a1Var)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00fa, code lost:
        r7 = r7 | r8;
        r14 = r14;
        r13 = r13;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x01d9, code lost:
        r3 = r18;
        r10 = r10;
        r14 = r14;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x01db, code lost:
        r2 = 17;
        r14 = r14;
        r13 = r13;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c8, code lost:
        r14 = r14;
        r13 = r13;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c8, code lost:
        r14 = r14;
        r13 = r13;
        r10 = r10;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.setlocation.SetLocationRequestPayload deserialize(kotlinx.serialization.encoding.Decoder r38) {
        /*
            r37 = this;
            r0 = r38
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r37.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r8 = 11
            r9 = 10
            r10 = 9
            r11 = 7
            r12 = 6
            r13 = 5
            r14 = 3
            r3 = 8
            r15 = 4
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = 0
            if (r2 == 0) goto L_0x00a9
            double r21 = r0.E(r1, r6)
            double r5 = r0.E(r1, r5)
            java.lang.String r2 = r0.j(r1, r4)
            java.lang.String r4 = r0.j(r1, r14)
            java.lang.String r14 = r0.j(r1, r15)
            gq0.a1 r15 = gq0.a1.f23069b
            java.lang.Object r13 = r0.s(r1, r13, r15, r7)
            java.lang.Object r12 = r0.s(r1, r12, r15, r7)
            java.lang.Object r11 = r0.s(r1, r11, r15, r7)
            java.lang.Object r3 = r0.s(r1, r3, r15, r7)
            java.lang.Object r10 = r0.s(r1, r10, r15, r7)
            int r9 = r0.g(r1, r9)
            java.lang.Object r8 = r0.s(r1, r8, r15, r7)
            r23 = r2
            r2 = 12
            java.lang.Object r2 = r0.s(r1, r2, r15, r7)
            r7 = 13
            int r7 = r0.g(r1, r7)
            r19 = r2
            r2 = 14
            int r2 = r0.g(r1, r2)
            r18 = r2
            gq0.w r2 = gq0.w.f23130b
            r20 = r3
            r24 = r5
            r3 = 15
            r6 = 0
            java.lang.Object r2 = r0.s(r1, r3, r2, r6)
            r3 = 16
            java.lang.Object r3 = r0.s(r1, r3, r15, r6)
            r5 = 17
            java.lang.Object r5 = r0.s(r1, r5, r15, r6)
            r6 = 262143(0x3ffff, float:3.6734E-40)
            r32 = r7
            r33 = r9
            r7 = r12
            r26 = r14
            r27 = r18
            r15 = r23
            r16 = r24
            r23 = r4
            r14 = r11
            r18 = r13
            r4 = r20
            r11 = r21
            r13 = r10
            r10 = r3
            r3 = r2
            r2 = r19
            goto L_0x0202
        L_0x00a9:
            r6 = r7
            r2 = 17
            r7 = 0
            r21 = 0
            r3 = r6
            r4 = r3
            r5 = r4
            r9 = r5
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r24 = r15
            r25 = r24
            r26 = r25
            r34 = r21
            r6 = 0
            r32 = 0
            r33 = 0
            r36 = 1
        L_0x00c8:
            if (r36 == 0) goto L_0x01ee
            int r8 = r0.w(r1)
            switch(r8) {
                case -1: goto L_0x01e1;
                case 0: goto L_0x01cd;
                case 1: goto L_0x01c0;
                case 2: goto L_0x01b3;
                case 3: goto L_0x01a6;
                case 4: goto L_0x0199;
                case 5: goto L_0x018a;
                case 6: goto L_0x017b;
                case 7: goto L_0x016b;
                case 8: goto L_0x0159;
                case 9: goto L_0x0147;
                case 10: goto L_0x0137;
                case 11: goto L_0x0125;
                case 12: goto L_0x0115;
                case 13: goto L_0x0109;
                case 14: goto L_0x00fd;
                case 15: goto L_0x00ed;
                case 16: goto L_0x00e2;
                case 17: goto L_0x00d7;
                default: goto L_0x00d1;
            }
        L_0x00d1:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r8)
            throw r0
        L_0x00d7:
            gq0.a1 r8 = gq0.a1.f23069b
            java.lang.Object r9 = r0.s(r1, r2, r8, r9)
            r8 = 131072(0x20000, float:1.83671E-40)
            r7 = r7 | r8
            goto L_0x01dd
        L_0x00e2:
            gq0.a1 r8 = gq0.a1.f23069b
            r2 = 16
            java.lang.Object r10 = r0.s(r1, r2, r8, r10)
            r8 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00fa
        L_0x00ed:
            r2 = 16
            gq0.w r8 = gq0.w.f23130b
            r2 = 15
            java.lang.Object r3 = r0.s(r1, r2, r8, r3)
            r8 = 32768(0x8000, float:4.5918E-41)
        L_0x00fa:
            r7 = r7 | r8
            goto L_0x01db
        L_0x00fd:
            r2 = 15
            r8 = 14
            int r6 = r0.g(r1, r8)
            r7 = r7 | 16384(0x4000, float:2.2959E-41)
            goto L_0x01db
        L_0x0109:
            r2 = 13
            r8 = 14
            int r32 = r0.g(r1, r2)
            r7 = r7 | 8192(0x2000, float:1.14794E-41)
            goto L_0x01db
        L_0x0115:
            r8 = 14
            gq0.a1 r2 = gq0.a1.f23069b
            r18 = r3
            r3 = 12
            java.lang.Object r11 = r0.s(r1, r3, r2, r11)
            r7 = r7 | 4096(0x1000, float:5.74E-42)
            goto L_0x01d9
        L_0x0125:
            r18 = r3
            r3 = 12
            r8 = 14
            gq0.a1 r2 = gq0.a1.f23069b
            r3 = 11
            java.lang.Object r12 = r0.s(r1, r3, r2, r12)
            r7 = r7 | 2048(0x800, float:2.87E-42)
            goto L_0x01d9
        L_0x0137:
            r18 = r3
            r2 = 10
            r3 = 11
            r8 = 14
            int r33 = r0.g(r1, r2)
            r7 = r7 | 1024(0x400, float:1.435E-42)
            goto L_0x01d9
        L_0x0147:
            r18 = r3
            r3 = 11
            r8 = 14
            gq0.a1 r2 = gq0.a1.f23069b
            r3 = 9
            java.lang.Object r13 = r0.s(r1, r3, r2, r13)
            r7 = r7 | 512(0x200, float:7.175E-43)
            goto L_0x01d9
        L_0x0159:
            r18 = r3
            r3 = 9
            r8 = 14
            gq0.a1 r2 = gq0.a1.f23069b
            r3 = 8
            java.lang.Object r15 = r0.s(r1, r3, r2, r15)
            r7 = r7 | 256(0x100, float:3.59E-43)
            goto L_0x01d9
        L_0x016b:
            r18 = r3
            r3 = 8
            r8 = 14
            gq0.a1 r2 = gq0.a1.f23069b
            r3 = 7
            java.lang.Object r14 = r0.s(r1, r3, r2, r14)
            r7 = r7 | 128(0x80, float:1.794E-43)
            goto L_0x01d9
        L_0x017b:
            r18 = r3
            r3 = 7
            r8 = 14
            gq0.a1 r2 = gq0.a1.f23069b
            r3 = 6
            java.lang.Object r4 = r0.s(r1, r3, r2, r4)
            r7 = r7 | 64
            goto L_0x01d9
        L_0x018a:
            r18 = r3
            r3 = 6
            r8 = 14
            gq0.a1 r2 = gq0.a1.f23069b
            r3 = 5
            java.lang.Object r5 = r0.s(r1, r3, r2, r5)
            r7 = r7 | 32
            goto L_0x01d9
        L_0x0199:
            r18 = r3
            r2 = 4
            r3 = 5
            r8 = 14
            java.lang.String r26 = r0.j(r1, r2)
            r7 = r7 | 16
            goto L_0x01d9
        L_0x01a6:
            r18 = r3
            r2 = 3
            r3 = 5
            r8 = 14
            java.lang.String r25 = r0.j(r1, r2)
            r7 = r7 | 8
            goto L_0x01d9
        L_0x01b3:
            r18 = r3
            r2 = 2
            r3 = 5
            r8 = 14
            java.lang.String r24 = r0.j(r1, r2)
            r7 = r7 | 4
            goto L_0x01d9
        L_0x01c0:
            r18 = r3
            r2 = 1
            r3 = 5
            r8 = 14
            double r21 = r0.E(r1, r2)
            r7 = r7 | 2
            goto L_0x01d9
        L_0x01cd:
            r18 = r3
            r2 = 0
            r3 = 5
            r8 = 14
            double r34 = r0.E(r1, r2)
            r7 = r7 | 1
        L_0x01d9:
            r3 = r18
        L_0x01db:
            r2 = 17
        L_0x01dd:
            r8 = 11
            goto L_0x00c8
        L_0x01e1:
            r18 = r3
            r2 = 0
            r8 = 14
            r2 = 17
            r8 = 11
            r36 = 0
            goto L_0x00c8
        L_0x01ee:
            r18 = r3
            r27 = r6
            r6 = r7
            r2 = r11
            r8 = r12
            r16 = r21
            r23 = r25
            r11 = r34
            r7 = r4
            r18 = r5
            r5 = r9
            r4 = r15
            r15 = r24
        L_0x0202:
            r0.c(r1)
            in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.setlocation.SetLocationRequestPayload r0 = new in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.setlocation.SetLocationRequestPayload
            r9 = r0
            java.lang.String r18 = (java.lang.String) r18
            r19 = r7
            java.lang.String r19 = (java.lang.String) r19
            r20 = r14
            java.lang.String r20 = (java.lang.String) r20
            r21 = r4
            java.lang.String r21 = (java.lang.String) r21
            r22 = r13
            java.lang.String r22 = (java.lang.String) r22
            r24 = r8
            java.lang.String r24 = (java.lang.String) r24
            r25 = r2
            java.lang.String r25 = (java.lang.String) r25
            r28 = r3
            java.lang.Integer r28 = (java.lang.Integer) r28
            r29 = r10
            java.lang.String r29 = (java.lang.String) r29
            r30 = r5
            java.lang.String r30 = (java.lang.String) r30
            r31 = 0
            r10 = r6
            r13 = r16
            r16 = r23
            r17 = r26
            r23 = r33
            r26 = r32
            r9.<init>(r10, r11, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.setlocation.SetLocationRequestPayload$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.setlocation.SetLocationRequestPayload");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public SetLocationRequestPayload patch(Decoder decoder, SetLocationRequestPayload setLocationRequestPayload) {
        return (SetLocationRequestPayload) q.a.a(this, decoder, setLocationRequestPayload);
    }

    public void serialize(Encoder encoder, SetLocationRequestPayload setLocationRequestPayload) {
        p.j(encoder, "encoder");
        p.j(setLocationRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        SetLocationRequestPayload.p(setLocationRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
