package co.hyperverge.crashguard.data.models;

import co.hyperverge.crashguard.data.models.CrashEvent;
import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import com.xiaomi.mipush.sdk.Constants;
import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.f0;
import gq0.h;
import gq0.p;
import gq0.q;
import gq0.w;
import in.swiggy.android.tejas.network.HttpRequest;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: CrashEvent.kt */
public final class CrashEvent$Contexts$Device$$serializer implements q<CrashEvent.Contexts.Device> {
    public static final CrashEvent$Contexts$Device$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CrashEvent$Contexts$Device$$serializer crashEvent$Contexts$Device$$serializer = new CrashEvent$Contexts$Device$$serializer();
        INSTANCE = crashEvent$Contexts$Device$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("co.hyperverge.crashguard.data.models.CrashEvent.Contexts.Device", crashEvent$Contexts$Device$$serializer, 30);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("family", true);
        pluginGeneratedSerialDescriptor.j("model", true);
        pluginGeneratedSerialDescriptor.j("arch", true);
        pluginGeneratedSerialDescriptor.j("orientation", true);
        pluginGeneratedSerialDescriptor.j(HttpRequest.SWIGGY_HEADER_DEVICE_MANUFACTURER, true);
        pluginGeneratedSerialDescriptor.j(Constants.PHONE_BRAND, true);
        pluginGeneratedSerialDescriptor.j("online", true);
        pluginGeneratedSerialDescriptor.j("charging", true);
        pluginGeneratedSerialDescriptor.j("simulator", true);
        pluginGeneratedSerialDescriptor.j("timezone", true);
        pluginGeneratedSerialDescriptor.j(DistributedTracing.NR_ID_ATTRIBUTE, true);
        pluginGeneratedSerialDescriptor.j("language", true);
        pluginGeneratedSerialDescriptor.j("archs", true);
        pluginGeneratedSerialDescriptor.j("model_id", true);
        pluginGeneratedSerialDescriptor.j("battery_level", true);
        pluginGeneratedSerialDescriptor.j("screen_resolution", true);
        pluginGeneratedSerialDescriptor.j("screen_density", true);
        pluginGeneratedSerialDescriptor.j("screen_dpi", true);
        pluginGeneratedSerialDescriptor.j("low_memory", true);
        pluginGeneratedSerialDescriptor.j("memory_size", true);
        pluginGeneratedSerialDescriptor.j("free_memory", true);
        pluginGeneratedSerialDescriptor.j("storage_size", true);
        pluginGeneratedSerialDescriptor.j("free_storage", true);
        pluginGeneratedSerialDescriptor.j("boot_time", true);
        pluginGeneratedSerialDescriptor.j("battery_temperature", true);
        pluginGeneratedSerialDescriptor.j("connection_type", true);
        pluginGeneratedSerialDescriptor.j("screen_height_pixels", true);
        pluginGeneratedSerialDescriptor.j("screen_width_pixels", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CrashEvent$Contexts$Device$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        h hVar = h.f23089b;
        p pVar = p.f23116b;
        w wVar = w.f23130b;
        f0 f0Var = f0.f23081b;
        return new KSerializer[]{a1Var, a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(hVar), a.p(hVar), a.p(hVar), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(new f(a1Var)), a.p(a1Var), a.p(pVar), a.p(a1Var), a.p(pVar), a.p(wVar), a.p(hVar), a.p(f0Var), a.p(f0Var), a.p(f0Var), a.p(f0Var), a.p(new a5.a()), a.p(pVar), a.p(a1Var), a.p(wVar), a.p(wVar)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v0, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Float} */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0219, code lost:
        r17 = r5;
        r26 = r38;
        r27 = r39;
        r28 = r40;
        r29 = r41;
        r30 = r42;
        r31 = r43;
        r32 = r44;
        r33 = r45;
        r34 = r46;
        r35 = r47;
        r24 = r48;
        r23 = r49;
        r22 = r50;
        r21 = r51;
        r20 = r52;
        r19 = r54;
        r18 = r55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0275, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0775, code lost:
        r5 = r58;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0777, code lost:
        r3 = r5;
        r5 = r17;
        r4 = r18;
        r7 = r19;
        r52 = r20;
        r51 = r21;
        r50 = r22;
        r49 = r23;
        r48 = r24;
        r38 = r26;
        r39 = r27;
        r40 = r28;
        r41 = r29;
        r42 = r30;
        r43 = r31;
        r44 = r32;
        r45 = r33;
        r46 = r34;
        r47 = r35;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public co.hyperverge.crashguard.data.models.CrashEvent.Contexts.Device deserialize(kotlinx.serialization.encoding.Decoder r58) {
        /*
            r57 = this;
            r0 = r58
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r57.getDescriptor()
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
            if (r2 == 0) goto L_0x0139
            java.lang.String r2 = r0.j(r1, r8)
            gq0.a1 r8 = gq0.a1.f23069b
            java.lang.Object r9 = r0.s(r1, r9, r8, r10)
            java.lang.Object r7 = r0.s(r1, r7, r8, r10)
            java.lang.Object r4 = r0.s(r1, r4, r8, r10)
            java.lang.Object r5 = r0.s(r1, r5, r8, r10)
            java.lang.Object r3 = r0.s(r1, r3, r8, r10)
            java.lang.Object r15 = r0.s(r1, r15, r8, r10)
            java.lang.Object r14 = r0.s(r1, r14, r8, r10)
            gq0.h r11 = gq0.h.f23089b
            java.lang.Object r6 = r0.s(r1, r6, r11, r10)
            java.lang.Object r13 = r0.s(r1, r13, r11, r10)
            java.lang.Object r12 = r0.s(r1, r12, r11, r10)
            r25 = r2
            r2 = 11
            java.lang.Object r2 = r0.s(r1, r2, r8, r10)
            r24 = r2
            r2 = 12
            java.lang.Object r2 = r0.s(r1, r2, r8, r10)
            r23 = r2
            r2 = 13
            java.lang.Object r2 = r0.s(r1, r2, r8, r10)
            r22 = r2
            gq0.f r2 = new gq0.f
            r2.<init>(r8)
            r26 = r3
            r3 = 14
            java.lang.Object r2 = r0.s(r1, r3, r2, r10)
            r3 = 15
            java.lang.Object r3 = r0.s(r1, r3, r8, r10)
            r20 = r2
            gq0.p r2 = gq0.p.f23116b
            r21 = r3
            r3 = 16
            java.lang.Object r3 = r0.s(r1, r3, r2, r10)
            r19 = r3
            r3 = 17
            java.lang.Object r3 = r0.s(r1, r3, r8, r10)
            r18 = r3
            r3 = 18
            java.lang.Object r3 = r0.s(r1, r3, r2, r10)
            r17 = r3
            gq0.w r3 = gq0.w.f23130b
            r27 = r4
            r4 = 19
            java.lang.Object r4 = r0.s(r1, r4, r3, r10)
            r16 = r4
            r4 = 20
            java.lang.Object r4 = r0.s(r1, r4, r11, r10)
            r11 = 21
            r58 = r4
            gq0.f0 r4 = gq0.f0.f23081b
            java.lang.Object r11 = r0.s(r1, r11, r4, r10)
            r28 = r5
            r5 = 22
            java.lang.Object r5 = r0.s(r1, r5, r4, r10)
            r29 = r5
            r5 = 23
            java.lang.Object r5 = r0.s(r1, r5, r4, r10)
            r30 = r5
            r5 = 24
            java.lang.Object r4 = r0.s(r1, r5, r4, r10)
            r5 = 25
            r31 = r4
            a5.a r4 = new a5.a
            r4.<init>()
            java.lang.Object r4 = r0.s(r1, r5, r4, r10)
            r5 = 26
            java.lang.Object r2 = r0.s(r1, r5, r2, r10)
            r5 = 27
            java.lang.Object r5 = r0.s(r1, r5, r8, r10)
            r8 = 28
            java.lang.Object r8 = r0.s(r1, r8, r3, r10)
            r32 = r2
            r2 = 29
            java.lang.Object r2 = r0.s(r1, r2, r3, r10)
            r3 = 1073741823(0x3fffffff, float:1.9999999)
            r35 = r4
            r37 = r5
            r38 = r8
            r4 = r20
            r3 = r22
            r10 = r25
            r33 = r30
            r34 = r31
            r5 = r32
            r41 = 1073741823(0x3fffffff, float:1.9999999)
            r30 = r58
            r31 = r11
            r20 = r12
            r32 = r29
            r12 = r7
            r11 = r9
            r29 = r16
            r7 = r19
            r9 = r2
            r19 = r13
            r16 = r15
            r2 = r24
            r13 = r27
            r27 = r18
            r18 = r6
            r6 = r21
            r56 = r17
            r17 = r14
            r14 = r28
            r28 = r56
            goto L_0x0802
        L_0x0139:
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
            r36 = r15
            r37 = r36
            r38 = r37
            r39 = r38
            r40 = r39
            r41 = r40
            r42 = r41
            r43 = r42
            r44 = r43
            r45 = r44
            r46 = r45
            r47 = r46
            r48 = r47
            r49 = r48
            r50 = r49
            r51 = r50
            r52 = r51
            r2 = 0
            r53 = 1
        L_0x016a:
            if (r53 == 0) goto L_0x079e
            r54 = r7
            int r7 = r0.w(r1)
            switch(r7) {
                case -1: goto L_0x0745;
                case 0: goto L_0x070e;
                case 1: goto L_0x06cf;
                case 2: goto L_0x0693;
                case 3: goto L_0x0658;
                case 4: goto L_0x061c;
                case 5: goto L_0x05e0;
                case 6: goto L_0x05a4;
                case 7: goto L_0x0567;
                case 8: goto L_0x0529;
                case 9: goto L_0x04eb;
                case 10: goto L_0x04ad;
                case 11: goto L_0x046f;
                case 12: goto L_0x0431;
                case 13: goto L_0x03f3;
                case 14: goto L_0x03b0;
                case 15: goto L_0x0370;
                case 16: goto L_0x0331;
                case 17: goto L_0x02f3;
                case 18: goto L_0x02b4;
                case 19: goto L_0x0279;
                case 20: goto L_0x0241;
                case 21: goto L_0x0209;
                case 22: goto L_0x01f8;
                case 23: goto L_0x01e7;
                case 24: goto L_0x01d6;
                case 25: goto L_0x01c2;
                case 26: goto L_0x01b1;
                case 27: goto L_0x019f;
                case 28: goto L_0x018d;
                case 29: goto L_0x017b;
                default: goto L_0x0175;
            }
        L_0x0175:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r7)
            throw r0
        L_0x017b:
            r7 = 29
            r55 = r4
            gq0.w r4 = gq0.w.f23130b
            java.lang.Object r4 = r0.s(r1, r7, r4, r9)
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            r2 = r2 | r7
            bp0.k r7 = bp0.k.f22762a
            r9 = r4
            goto L_0x0219
        L_0x018d:
            r55 = r4
            r4 = 28
            gq0.w r7 = gq0.w.f23130b
            java.lang.Object r4 = r0.s(r1, r4, r7, r8)
            r7 = 268435456(0x10000000, float:2.5243549E-29)
            r2 = r2 | r7
            bp0.k r7 = bp0.k.f22762a
            r8 = r4
            goto L_0x0219
        L_0x019f:
            r55 = r4
            r4 = 27
            gq0.a1 r7 = gq0.a1.f23069b
            java.lang.Object r4 = r0.s(r1, r4, r7, r11)
            r7 = 134217728(0x8000000, float:3.85186E-34)
            r2 = r2 | r7
            bp0.k r7 = bp0.k.f22762a
            r11 = r4
            goto L_0x0219
        L_0x01b1:
            r55 = r4
            r4 = 26
            gq0.p r7 = gq0.p.f23116b
            java.lang.Object r4 = r0.s(r1, r4, r7, r10)
            r7 = 67108864(0x4000000, float:1.5046328E-36)
            r2 = r2 | r7
            bp0.k r7 = bp0.k.f22762a
            r10 = r4
            goto L_0x0219
        L_0x01c2:
            r55 = r4
            r4 = 25
            a5.a r7 = new a5.a
            r7.<init>()
            java.lang.Object r4 = r0.s(r1, r4, r7, r12)
            r7 = 33554432(0x2000000, float:9.403955E-38)
            r2 = r2 | r7
            bp0.k r7 = bp0.k.f22762a
            r12 = r4
            goto L_0x0219
        L_0x01d6:
            r55 = r4
            r4 = 24
            gq0.f0 r7 = gq0.f0.f23081b
            java.lang.Object r4 = r0.s(r1, r4, r7, r13)
            r7 = 16777216(0x1000000, float:2.3509887E-38)
            r2 = r2 | r7
            bp0.k r7 = bp0.k.f22762a
            r13 = r4
            goto L_0x0219
        L_0x01e7:
            r55 = r4
            r4 = 23
            gq0.f0 r7 = gq0.f0.f23081b
            java.lang.Object r4 = r0.s(r1, r4, r7, r6)
            r6 = 8388608(0x800000, float:1.17549435E-38)
            r2 = r2 | r6
            bp0.k r6 = bp0.k.f22762a
            r6 = r4
            goto L_0x0219
        L_0x01f8:
            r55 = r4
            r4 = 22
            gq0.f0 r7 = gq0.f0.f23081b
            java.lang.Object r4 = r0.s(r1, r4, r7, r14)
            r7 = 4194304(0x400000, float:5.877472E-39)
            r2 = r2 | r7
            bp0.k r7 = bp0.k.f22762a
            r14 = r4
            goto L_0x0219
        L_0x0209:
            r55 = r4
            r4 = 21
            gq0.f0 r7 = gq0.f0.f23081b
            java.lang.Object r4 = r0.s(r1, r4, r7, r15)
            r7 = 2097152(0x200000, float:2.938736E-39)
            r2 = r2 | r7
            bp0.k r7 = bp0.k.f22762a
            r15 = r4
        L_0x0219:
            r17 = r5
            r26 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r47
            r24 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r18 = r55
            r4 = 0
            r7 = 20
            goto L_0x0275
        L_0x0241:
            r55 = r4
            gq0.h r4 = gq0.h.f23089b
            r7 = 20
            java.lang.Object r3 = r0.s(r1, r7, r4, r3)
            r4 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 | r4
            bp0.k r4 = bp0.k.f22762a
            r17 = r5
            r26 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r47
            r24 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r18 = r55
            r4 = 0
        L_0x0275:
            r5 = r3
            r3 = 1
            goto L_0x0777
        L_0x0279:
            r55 = r4
            r7 = 20
            gq0.w r4 = gq0.w.f23130b
            r58 = r3
            r3 = 19
            java.lang.Object r4 = r0.s(r1, r3, r4, r5)
            r5 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 | r5
            bp0.k r5 = bp0.k.f22762a
            r5 = r58
            r17 = r4
            r26 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r47
            r24 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r18 = r55
            goto L_0x06cd
        L_0x02b4:
            r58 = r3
            r55 = r4
            r3 = 19
            r7 = 20
            gq0.p r4 = gq0.p.f23116b
            r17 = r5
            r3 = r55
            r5 = 18
            java.lang.Object r3 = r0.s(r1, r5, r4, r3)
            r4 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 | r4
            bp0.k r4 = bp0.k.f22762a
            r5 = r58
            r18 = r3
            r26 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r47
            r24 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            goto L_0x06cd
        L_0x02f3:
            r58 = r3
            r3 = r4
            r17 = r5
            r5 = 18
            r7 = 20
            gq0.a1 r4 = gq0.a1.f23069b
            r18 = r3
            r5 = r54
            r3 = 17
            java.lang.Object r4 = r0.s(r1, r3, r4, r5)
            r5 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r5
            bp0.k r5 = bp0.k.f22762a
            r5 = r58
            r19 = r4
            r26 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r47
            r24 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            goto L_0x06cd
        L_0x0331:
            r58 = r3
            r18 = r4
            r17 = r5
            r5 = r54
            r3 = 17
            r7 = 20
            gq0.p r4 = gq0.p.f23116b
            r19 = r5
            r3 = r52
            r5 = 16
            java.lang.Object r3 = r0.s(r1, r5, r4, r3)
            r4 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r4
            bp0.k r4 = bp0.k.f22762a
            r5 = r58
            r20 = r3
            r26 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r47
            r24 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            goto L_0x06cd
        L_0x0370:
            r58 = r3
            r18 = r4
            r17 = r5
            r3 = r52
            r19 = r54
            r5 = 16
            r7 = 20
            gq0.a1 r4 = gq0.a1.f23069b
            r20 = r3
            r5 = r51
            r3 = 15
            java.lang.Object r4 = r0.s(r1, r3, r4, r5)
            r5 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 | r5
            bp0.k r5 = bp0.k.f22762a
            r5 = r58
            r21 = r4
            r26 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r47
            r24 = r48
            r23 = r49
            r22 = r50
            goto L_0x06cd
        L_0x03b0:
            r58 = r3
            r18 = r4
            r17 = r5
            r5 = r51
            r20 = r52
            r19 = r54
            r3 = 15
            r7 = 20
            gq0.f r4 = new gq0.f
            gq0.a1 r3 = gq0.a1.f23069b
            r4.<init>(r3)
            r21 = r5
            r3 = r50
            r5 = 14
            java.lang.Object r3 = r0.s(r1, r5, r4, r3)
            r2 = r2 | 16384(0x4000, float:2.2959E-41)
            bp0.k r4 = bp0.k.f22762a
            r5 = r58
            r22 = r3
            r26 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r47
            r24 = r48
            r23 = r49
            goto L_0x06cd
        L_0x03f3:
            r58 = r3
            r18 = r4
            r17 = r5
            r3 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r5 = 14
            r7 = 20
            gq0.a1 r4 = gq0.a1.f23069b
            r22 = r3
            r5 = r49
            r3 = 13
            java.lang.Object r4 = r0.s(r1, r3, r4, r5)
            r2 = r2 | 8192(0x2000, float:1.14794E-41)
            bp0.k r5 = bp0.k.f22762a
            r5 = r58
            r23 = r4
            r26 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r47
            r24 = r48
            goto L_0x06cd
        L_0x0431:
            r58 = r3
            r18 = r4
            r17 = r5
            r5 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r3 = 13
            r7 = 20
            gq0.a1 r4 = gq0.a1.f23069b
            r23 = r5
            r3 = r48
            r5 = 12
            java.lang.Object r3 = r0.s(r1, r5, r4, r3)
            r2 = r2 | 4096(0x1000, float:5.74E-42)
            bp0.k r4 = bp0.k.f22762a
            r5 = r58
            r24 = r3
            r26 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r47
            goto L_0x06cd
        L_0x046f:
            r58 = r3
            r18 = r4
            r17 = r5
            r3 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r5 = 12
            r7 = 20
            gq0.a1 r4 = gq0.a1.f23069b
            r24 = r3
            r5 = r47
            r3 = 11
            java.lang.Object r4 = r0.s(r1, r3, r4, r5)
            r2 = r2 | 2048(0x800, float:2.87E-42)
            bp0.k r5 = bp0.k.f22762a
            r5 = r58
            r35 = r4
            r26 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            goto L_0x06cd
        L_0x04ad:
            r58 = r3
            r18 = r4
            r17 = r5
            r5 = r47
            r24 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r3 = 11
            r7 = 20
            gq0.h r4 = gq0.h.f23089b
            r35 = r5
            r3 = r46
            r5 = 10
            java.lang.Object r3 = r0.s(r1, r5, r4, r3)
            r2 = r2 | 1024(0x400, float:1.435E-42)
            bp0.k r4 = bp0.k.f22762a
            r5 = r58
            r34 = r3
            r26 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            goto L_0x06cd
        L_0x04eb:
            r58 = r3
            r18 = r4
            r17 = r5
            r3 = r46
            r35 = r47
            r24 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r5 = 10
            r7 = 20
            gq0.h r4 = gq0.h.f23089b
            r34 = r3
            r5 = r45
            r3 = 9
            java.lang.Object r4 = r0.s(r1, r3, r4, r5)
            r2 = r2 | 512(0x200, float:7.175E-43)
            bp0.k r5 = bp0.k.f22762a
            r5 = r58
            r33 = r4
            r26 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            goto L_0x06cd
        L_0x0529:
            r58 = r3
            r18 = r4
            r17 = r5
            r5 = r45
            r34 = r46
            r35 = r47
            r24 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r3 = 9
            r7 = 20
            gq0.h r4 = gq0.h.f23089b
            r33 = r5
            r3 = r44
            r5 = 8
            java.lang.Object r3 = r0.s(r1, r5, r4, r3)
            r2 = r2 | 256(0x100, float:3.59E-43)
            bp0.k r4 = bp0.k.f22762a
            r5 = r58
            r32 = r3
            r26 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            goto L_0x06cd
        L_0x0567:
            r58 = r3
            r18 = r4
            r17 = r5
            r3 = r44
            r33 = r45
            r34 = r46
            r35 = r47
            r24 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r5 = 8
            r7 = 20
            gq0.a1 r4 = gq0.a1.f23069b
            r32 = r3
            r5 = r43
            r3 = 7
            java.lang.Object r4 = r0.s(r1, r3, r4, r5)
            r2 = r2 | 128(0x80, float:1.794E-43)
            bp0.k r5 = bp0.k.f22762a
            r5 = r58
            r31 = r4
            r26 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            goto L_0x06cd
        L_0x05a4:
            r58 = r3
            r18 = r4
            r17 = r5
            r5 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r47
            r24 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r3 = 7
            r7 = 20
            gq0.a1 r4 = gq0.a1.f23069b
            r31 = r5
            r3 = r42
            r5 = 6
            java.lang.Object r3 = r0.s(r1, r5, r4, r3)
            r2 = r2 | 64
            bp0.k r4 = bp0.k.f22762a
            r5 = r58
            r30 = r3
            r26 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            goto L_0x06cd
        L_0x05e0:
            r58 = r3
            r18 = r4
            r17 = r5
            r3 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r47
            r24 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r5 = 6
            r7 = 20
            gq0.a1 r4 = gq0.a1.f23069b
            r30 = r3
            r5 = r41
            r3 = 5
            java.lang.Object r4 = r0.s(r1, r3, r4, r5)
            r2 = r2 | 32
            bp0.k r5 = bp0.k.f22762a
            r5 = r58
            r29 = r4
            r26 = r38
            r27 = r39
            r28 = r40
            goto L_0x06cd
        L_0x061c:
            r58 = r3
            r18 = r4
            r17 = r5
            r5 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r47
            r24 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r3 = 5
            r7 = 20
            gq0.a1 r4 = gq0.a1.f23069b
            r29 = r5
            r3 = r40
            r5 = 4
            java.lang.Object r3 = r0.s(r1, r5, r4, r3)
            r2 = r2 | 16
            bp0.k r4 = bp0.k.f22762a
            r5 = r58
            r28 = r3
            r26 = r38
            r27 = r39
            goto L_0x06cd
        L_0x0658:
            r58 = r3
            r18 = r4
            r17 = r5
            r3 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r47
            r24 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r5 = 4
            r7 = 20
            gq0.a1 r4 = gq0.a1.f23069b
            r28 = r3
            r5 = r39
            r3 = 3
            java.lang.Object r4 = r0.s(r1, r3, r4, r5)
            r2 = r2 | 8
            bp0.k r5 = bp0.k.f22762a
            r5 = r58
            r27 = r4
            r26 = r38
            goto L_0x06cd
        L_0x0693:
            r58 = r3
            r18 = r4
            r17 = r5
            r5 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r47
            r24 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r3 = 3
            r7 = 20
            gq0.a1 r4 = gq0.a1.f23069b
            r27 = r5
            r3 = r38
            r5 = 2
            java.lang.Object r3 = r0.s(r1, r5, r4, r3)
            r2 = r2 | 4
            bp0.k r4 = bp0.k.f22762a
            r5 = r58
            r26 = r3
        L_0x06cd:
            r3 = 1
            goto L_0x070b
        L_0x06cf:
            r58 = r3
            r18 = r4
            r17 = r5
            r3 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r47
            r24 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r5 = 2
            r7 = 20
            gq0.a1 r4 = gq0.a1.f23069b
            r26 = r3
            r5 = r37
            r3 = 1
            java.lang.Object r4 = r0.s(r1, r3, r4, r5)
            r2 = r2 | 2
            bp0.k r5 = bp0.k.f22762a
            r5 = r58
            r37 = r4
        L_0x070b:
            r4 = 0
            goto L_0x0777
        L_0x070e:
            r58 = r3
            r18 = r4
            r17 = r5
            r5 = r37
            r26 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r47
            r24 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r3 = 1
            r4 = 0
            r7 = 20
            java.lang.String r25 = r0.j(r1, r4)
            r2 = r2 | 1
            bp0.k r36 = bp0.k.f22762a
            r36 = r25
            goto L_0x0775
        L_0x0745:
            r58 = r3
            r18 = r4
            r17 = r5
            r5 = r37
            r26 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r47
            r24 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r19 = r54
            r3 = 1
            r4 = 0
            r7 = 20
            bp0.k r25 = bp0.k.f22762a
            r53 = 0
        L_0x0775:
            r5 = r58
        L_0x0777:
            r3 = r5
            r5 = r17
            r4 = r18
            r7 = r19
            r52 = r20
            r51 = r21
            r50 = r22
            r49 = r23
            r48 = r24
            r38 = r26
            r39 = r27
            r40 = r28
            r41 = r29
            r42 = r30
            r43 = r31
            r44 = r32
            r45 = r33
            r46 = r34
            r47 = r35
            goto L_0x016a
        L_0x079e:
            r58 = r3
            r18 = r4
            r17 = r5
            r19 = r7
            r5 = r37
            r26 = r38
            r27 = r39
            r28 = r40
            r29 = r41
            r30 = r42
            r31 = r43
            r32 = r44
            r33 = r45
            r34 = r46
            r35 = r47
            r24 = r48
            r23 = r49
            r22 = r50
            r21 = r51
            r20 = r52
            r41 = r2
            r38 = r8
            r37 = r11
            r7 = r20
            r4 = r22
            r3 = r23
            r23 = r24
            r16 = r30
            r20 = r34
            r2 = r35
            r30 = r58
            r11 = r5
            r5 = r10
            r35 = r12
            r34 = r13
            r12 = r26
            r13 = r27
            r26 = r29
            r10 = r36
            r29 = r17
            r27 = r19
            r17 = r31
            r19 = r33
            r33 = r6
            r31 = r15
            r6 = r21
            r56 = r32
            r32 = r14
            r14 = r28
            r28 = r18
            r18 = r56
        L_0x0802:
            r0.c(r1)
            co.hyperverge.crashguard.data.models.CrashEvent$Contexts$Device r0 = new co.hyperverge.crashguard.data.models.CrashEvent$Contexts$Device
            r8 = r0
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = (java.lang.String) r14
            r15 = r26
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r16 = (java.lang.String) r16
            java.lang.String r17 = (java.lang.String) r17
            java.lang.Boolean r18 = (java.lang.Boolean) r18
            java.lang.Boolean r19 = (java.lang.Boolean) r19
            java.lang.Boolean r20 = (java.lang.Boolean) r20
            r21 = r2
            java.lang.String r21 = (java.lang.String) r21
            r22 = r23
            java.lang.String r22 = (java.lang.String) r22
            r23 = r3
            java.lang.String r23 = (java.lang.String) r23
            r24 = r4
            java.util.List r24 = (java.util.List) r24
            r25 = r6
            java.lang.String r25 = (java.lang.String) r25
            r26 = r7
            java.lang.Float r26 = (java.lang.Float) r26
            java.lang.String r27 = (java.lang.String) r27
            java.lang.Float r28 = (java.lang.Float) r28
            java.lang.Integer r29 = (java.lang.Integer) r29
            java.lang.Boolean r30 = (java.lang.Boolean) r30
            java.lang.Long r31 = (java.lang.Long) r31
            java.lang.Long r32 = (java.lang.Long) r32
            java.lang.Long r33 = (java.lang.Long) r33
            java.lang.Long r34 = (java.lang.Long) r34
            java.util.Date r35 = (java.util.Date) r35
            r36 = r5
            java.lang.Float r36 = (java.lang.Float) r36
            java.lang.String r37 = (java.lang.String) r37
            java.lang.Integer r38 = (java.lang.Integer) r38
            r39 = r9
            java.lang.Integer r39 = (java.lang.Integer) r39
            r40 = 0
            r9 = r41
            r8.<init>((int) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.Boolean) r18, (java.lang.Boolean) r19, (java.lang.Boolean) r20, (java.lang.String) r21, (java.lang.String) r22, (java.lang.String) r23, (java.util.List) r24, (java.lang.String) r25, (java.lang.Float) r26, (java.lang.String) r27, (java.lang.Float) r28, (java.lang.Integer) r29, (java.lang.Boolean) r30, (java.lang.Long) r31, (java.lang.Long) r32, (java.lang.Long) r33, (java.lang.Long) r34, (java.util.Date) r35, (java.lang.Float) r36, (java.lang.String) r37, (java.lang.Integer) r38, (java.lang.Integer) r39, (gq0.x0) r40)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: co.hyperverge.crashguard.data.models.CrashEvent$Contexts$Device$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):co.hyperverge.crashguard.data.models.CrashEvent$Contexts$Device");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public abstract /* synthetic */ Object patch(Decoder decoder, Object obj);

    public void serialize(Encoder encoder, CrashEvent.Contexts.Device device) {
        kotlin.jvm.internal.p.j(encoder, "encoder");
        kotlin.jvm.internal.p.j(device, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        CrashEvent.Contexts.Device.I(device, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
