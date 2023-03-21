package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getSwiggyHeaders;

import com.newrelic.agent.android.agentdata.HexAttribute;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.q;
import in.swiggy.android.tejas.network.HttpRequest;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: GetSwiggyHeaderResponsePayload.kt */
public final class GetSwiggyHeaderResponsePayload$$serializer implements q<GetSwiggyHeaderResponsePayload> {
    public static final GetSwiggyHeaderResponsePayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        GetSwiggyHeaderResponsePayload$$serializer getSwiggyHeaderResponsePayload$$serializer = new GetSwiggyHeaderResponsePayload$$serializer();
        INSTANCE = getSwiggyHeaderResponsePayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getSwiggyHeaders.GetSwiggyHeaderResponsePayload", getSwiggyHeaderResponsePayload$$serializer, 31);
        pluginGeneratedSerialDescriptor.j(HttpRequest.TID_KEY, true);
        pluginGeneratedSerialDescriptor.j(HttpRequest.SWIGGY_HEADER_SID, true);
        pluginGeneratedSerialDescriptor.j(HttpRequest.SWIGGY_HEADER_DEVICE_ID, true);
        pluginGeneratedSerialDescriptor.j(AnalyticsAttribute.USER_ID_ATTRIBUTE, true);
        pluginGeneratedSerialDescriptor.j("currentLocation", false);
        pluginGeneratedSerialDescriptor.j("token", false);
        pluginGeneratedSerialDescriptor.j(HttpRequest.SWIGGY_HEADER_VERSION_CODE, false);
        pluginGeneratedSerialDescriptor.j(HttpRequest.SWIGGY_HEADER_UID, false);
        pluginGeneratedSerialDescriptor.j("address", false);
        pluginGeneratedSerialDescriptor.j(AnalyticsAttribute.APPLICATION_PLATFORM_ATTRIBUTE, false);
        pluginGeneratedSerialDescriptor.j("analyticsPlatform", false);
        pluginGeneratedSerialDescriptor.j(HexAttribute.HEX_ATTR_APP_VERSION, false);
        pluginGeneratedSerialDescriptor.j(AnalyticsAttribute.OS_VERSION_ATTRIBUTE, false);
        pluginGeneratedSerialDescriptor.j(AnalyticsAttribute.DEVICE_MODEL_ATTRIBUTE, false);
        pluginGeneratedSerialDescriptor.j("cartAddressId", false);
        pluginGeneratedSerialDescriptor.j("marketplaceId", false);
        pluginGeneratedSerialDescriptor.j("marketplaceCategory", false);
        pluginGeneratedSerialDescriptor.j("marketplaceBusinessLine", false);
        pluginGeneratedSerialDescriptor.j("isFromBottomBar", false);
        pluginGeneratedSerialDescriptor.j("x-web-checkout-flow", false);
        pluginGeneratedSerialDescriptor.j("payment-secret-key", false);
        pluginGeneratedSerialDescriptor.j("mainText", true);
        pluginGeneratedSerialDescriptor.j("addressId", true);
        pluginGeneratedSerialDescriptor.j("lat", true);
        pluginGeneratedSerialDescriptor.j("lng", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("mobile", true);
        pluginGeneratedSerialDescriptor.j("annotationTag", true);
        pluginGeneratedSerialDescriptor.j("isux4", true);
        pluginGeneratedSerialDescriptor.j("user-agent", true);
        pluginGeneratedSerialDescriptor.j("accessibility-enabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GetSwiggyHeaderResponsePayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a1Var, a1Var, a1Var, a1Var, a1Var, a1Var, a1Var, a1Var, a1Var, a1Var, a1Var, a1Var, a1Var, a1Var, a1Var, a1Var, a1Var, a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v3, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x038a, code lost:
        r26 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x038c, code lost:
        r2 = r49;
        r9 = r50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x03eb, code lost:
        r3 = r26;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getSwiggyHeaders.GetSwiggyHeaderResponsePayload deserialize(kotlinx.serialization.encoding.Decoder r52) {
        /*
            r51 = this;
            r0 = r52
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r51.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r11 = 11
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
            if (r2 == 0) goto L_0x012b
            gq0.a1 r2 = gq0.a1.f23069b
            java.lang.Object r8 = r0.s(r1, r8, r2, r10)
            java.lang.Object r9 = r0.s(r1, r9, r2, r10)
            java.lang.Object r7 = r0.s(r1, r7, r2, r10)
            java.lang.Object r4 = r0.s(r1, r4, r2, r10)
            java.lang.String r5 = r0.j(r1, r5)
            java.lang.String r3 = r0.j(r1, r3)
            java.lang.String r15 = r0.j(r1, r15)
            java.lang.String r14 = r0.j(r1, r14)
            java.lang.String r6 = r0.j(r1, r6)
            java.lang.String r13 = r0.j(r1, r13)
            java.lang.String r12 = r0.j(r1, r12)
            java.lang.String r11 = r0.j(r1, r11)
            r10 = 12
            java.lang.String r10 = r0.j(r1, r10)
            r23 = r3
            r3 = 13
            java.lang.String r3 = r0.j(r1, r3)
            r22 = r3
            r3 = 14
            java.lang.String r3 = r0.j(r1, r3)
            r21 = r3
            r3 = 15
            java.lang.String r3 = r0.j(r1, r3)
            r20 = r3
            r3 = 16
            java.lang.String r3 = r0.j(r1, r3)
            r19 = r3
            r3 = 17
            java.lang.String r3 = r0.j(r1, r3)
            r18 = r3
            r3 = 18
            java.lang.String r3 = r0.j(r1, r3)
            r17 = r3
            r3 = 19
            java.lang.String r3 = r0.j(r1, r3)
            r16 = r3
            r3 = 20
            java.lang.String r3 = r0.j(r1, r3)
            r52 = r3
            r3 = 21
            r25 = r8
            r8 = 0
            java.lang.Object r3 = r0.s(r1, r3, r2, r8)
            r24 = r3
            r3 = 22
            java.lang.Object r3 = r0.s(r1, r3, r2, r8)
            r26 = r3
            r3 = 23
            java.lang.Object r3 = r0.s(r1, r3, r2, r8)
            r27 = r3
            r3 = 24
            java.lang.Object r3 = r0.s(r1, r3, r2, r8)
            r28 = r3
            r3 = 25
            java.lang.Object r3 = r0.s(r1, r3, r2, r8)
            r29 = r3
            r3 = 26
            java.lang.Object r3 = r0.s(r1, r3, r2, r8)
            r30 = r3
            r3 = 27
            java.lang.Object r3 = r0.s(r1, r3, r2, r8)
            r31 = r3
            r3 = 28
            java.lang.Object r3 = r0.s(r1, r3, r2, r8)
            r32 = r3
            r3 = 29
            java.lang.Object r3 = r0.s(r1, r3, r2, r8)
            r33 = r3
            r3 = 30
            java.lang.Object r2 = r0.s(r1, r3, r2, r8)
            r3 = 2147483647(0x7fffffff, float:NaN)
            r46 = r52
            r8 = r4
            r38 = r10
            r37 = r11
            r45 = r16
            r44 = r17
            r43 = r18
            r42 = r19
            r41 = r20
            r40 = r21
            r39 = r22
            r10 = r27
            r11 = r30
            r16 = r33
            r4 = 2147483647(0x7fffffff, float:NaN)
            r17 = r5
            r20 = r6
            r6 = r9
            r22 = r12
            r21 = r13
            r19 = r14
            r18 = r15
            r9 = r26
            r15 = r28
            r14 = r29
            r13 = r31
            r12 = r32
            goto L_0x0429
        L_0x012b:
            r8 = r10
            r2 = 0
            r2 = r8
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r9 = r7
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r27 = r15
            r28 = r27
            r29 = r28
            r30 = r29
            r31 = r30
            r32 = r31
            r33 = r32
            r34 = r33
            r35 = r34
            r36 = r35
            r37 = r36
            r38 = r37
            r39 = r38
            r40 = r39
            r41 = r40
            r42 = r41
            r43 = r42
            r47 = r43
            r8 = 0
            r48 = 1
        L_0x0161:
            if (r48 == 0) goto L_0x03ef
            r49 = r2
            int r2 = r0.w(r1)
            switch(r2) {
                case -1: goto L_0x03da;
                case 0: goto L_0x03bd;
                case 1: goto L_0x03a7;
                case 2: goto L_0x0391;
                case 3: goto L_0x037b;
                case 4: goto L_0x0369;
                case 5: goto L_0x0357;
                case 6: goto L_0x0345;
                case 7: goto L_0x0333;
                case 8: goto L_0x0320;
                case 9: goto L_0x030c;
                case 10: goto L_0x02f8;
                case 11: goto L_0x02e4;
                case 12: goto L_0x02d0;
                case 13: goto L_0x02bc;
                case 14: goto L_0x02a8;
                case 15: goto L_0x0291;
                case 16: goto L_0x027b;
                case 17: goto L_0x0265;
                case 18: goto L_0x024f;
                case 19: goto L_0x0239;
                case 20: goto L_0x0227;
                case 21: goto L_0x0215;
                case 22: goto L_0x0203;
                case 23: goto L_0x01f0;
                case 24: goto L_0x01de;
                case 25: goto L_0x01cc;
                case 26: goto L_0x01ba;
                case 27: goto L_0x01a8;
                case 28: goto L_0x0196;
                case 29: goto L_0x0184;
                case 30: goto L_0x0172;
                default: goto L_0x016c;
            }
        L_0x016c:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r2)
            throw r0
        L_0x0172:
            r2 = 30
            r50 = r9
            gq0.a1 r9 = gq0.a1.f23069b
            java.lang.Object r2 = r0.s(r1, r2, r9, r10)
            r9 = 1073741824(0x40000000, float:2.0)
            r8 = r8 | r9
            bp0.k r9 = bp0.k.f22762a
            r10 = r2
            goto L_0x038a
        L_0x0184:
            r50 = r9
            r2 = 29
            gq0.a1 r9 = gq0.a1.f23069b
            java.lang.Object r2 = r0.s(r1, r2, r9, r11)
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            r8 = r8 | r9
            bp0.k r9 = bp0.k.f22762a
            r11 = r2
            goto L_0x038a
        L_0x0196:
            r50 = r9
            r2 = 28
            gq0.a1 r9 = gq0.a1.f23069b
            java.lang.Object r2 = r0.s(r1, r2, r9, r12)
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            r8 = r8 | r9
            bp0.k r9 = bp0.k.f22762a
            r12 = r2
            goto L_0x038a
        L_0x01a8:
            r50 = r9
            r2 = 27
            gq0.a1 r9 = gq0.a1.f23069b
            java.lang.Object r2 = r0.s(r1, r2, r9, r13)
            r9 = 134217728(0x8000000, float:3.85186E-34)
            r8 = r8 | r9
            bp0.k r9 = bp0.k.f22762a
            r13 = r2
            goto L_0x038a
        L_0x01ba:
            r50 = r9
            r2 = 26
            gq0.a1 r9 = gq0.a1.f23069b
            java.lang.Object r2 = r0.s(r1, r2, r9, r6)
            r6 = 67108864(0x4000000, float:1.5046328E-36)
            r8 = r8 | r6
            bp0.k r6 = bp0.k.f22762a
            r6 = r2
            goto L_0x038a
        L_0x01cc:
            r50 = r9
            r2 = 25
            gq0.a1 r9 = gq0.a1.f23069b
            java.lang.Object r2 = r0.s(r1, r2, r9, r14)
            r9 = 33554432(0x2000000, float:9.403955E-38)
            r8 = r8 | r9
            bp0.k r9 = bp0.k.f22762a
            r14 = r2
            goto L_0x038a
        L_0x01de:
            r50 = r9
            r2 = 24
            gq0.a1 r9 = gq0.a1.f23069b
            java.lang.Object r2 = r0.s(r1, r2, r9, r15)
            r9 = 16777216(0x1000000, float:2.3509887E-38)
            r8 = r8 | r9
            bp0.k r9 = bp0.k.f22762a
            r15 = r2
            goto L_0x038a
        L_0x01f0:
            r50 = r9
            r2 = 23
            gq0.a1 r9 = gq0.a1.f23069b
            java.lang.Object r2 = r0.s(r1, r2, r9, r3)
            r3 = 8388608(0x800000, float:1.17549435E-38)
            r8 = r8 | r3
            bp0.k r3 = bp0.k.f22762a
            r26 = r2
            goto L_0x038c
        L_0x0203:
            r50 = r9
            r2 = 22
            gq0.a1 r9 = gq0.a1.f23069b
            java.lang.Object r2 = r0.s(r1, r2, r9, r5)
            r5 = 4194304(0x400000, float:5.877472E-39)
            r8 = r8 | r5
            bp0.k r5 = bp0.k.f22762a
            r5 = r2
            goto L_0x038a
        L_0x0215:
            r50 = r9
            r2 = 21
            gq0.a1 r9 = gq0.a1.f23069b
            java.lang.Object r2 = r0.s(r1, r2, r9, r4)
            r4 = 2097152(0x200000, float:2.938736E-39)
            r8 = r8 | r4
            bp0.k r4 = bp0.k.f22762a
            r4 = r2
            goto L_0x038a
        L_0x0227:
            r50 = r9
            r9 = 20
            java.lang.String r2 = r0.j(r1, r9)
            r43 = 1048576(0x100000, float:1.469368E-39)
            r8 = r8 | r43
            bp0.k r43 = bp0.k.f22762a
            r43 = r2
            goto L_0x038a
        L_0x0239:
            r50 = r9
            r2 = 19
            r9 = 20
            java.lang.String r16 = r0.j(r1, r2)
            r42 = 524288(0x80000, float:7.34684E-40)
            r8 = r8 | r42
            bp0.k r42 = bp0.k.f22762a
            r26 = r3
            r42 = r16
            goto L_0x038c
        L_0x024f:
            r50 = r9
            r2 = 19
            r9 = 18
            java.lang.String r16 = r0.j(r1, r9)
            r17 = 262144(0x40000, float:3.67342E-40)
            r8 = r8 | r17
            bp0.k r17 = bp0.k.f22762a
            r26 = r3
            r41 = r16
            goto L_0x038c
        L_0x0265:
            r50 = r9
            r2 = 19
            r9 = 17
            java.lang.String r16 = r0.j(r1, r9)
            r18 = 131072(0x20000, float:1.83671E-40)
            r8 = r8 | r18
            bp0.k r18 = bp0.k.f22762a
            r26 = r3
            r40 = r16
            goto L_0x038c
        L_0x027b:
            r50 = r9
            r2 = 19
            r9 = 16
            java.lang.String r16 = r0.j(r1, r9)
            r19 = 65536(0x10000, float:9.18355E-41)
            r8 = r8 | r19
            bp0.k r19 = bp0.k.f22762a
            r26 = r3
            r39 = r16
            goto L_0x038c
        L_0x0291:
            r50 = r9
            r2 = 19
            r9 = 15
            java.lang.String r16 = r0.j(r1, r9)
            r20 = 32768(0x8000, float:4.5918E-41)
            r8 = r8 | r20
            bp0.k r20 = bp0.k.f22762a
            r26 = r3
            r38 = r16
            goto L_0x038c
        L_0x02a8:
            r50 = r9
            r2 = 19
            r9 = 14
            java.lang.String r16 = r0.j(r1, r9)
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
            bp0.k r21 = bp0.k.f22762a
            r26 = r3
            r37 = r16
            goto L_0x038c
        L_0x02bc:
            r50 = r9
            r2 = 19
            r9 = 13
            java.lang.String r16 = r0.j(r1, r9)
            r8 = r8 | 8192(0x2000, float:1.14794E-41)
            bp0.k r22 = bp0.k.f22762a
            r26 = r3
            r36 = r16
            goto L_0x038c
        L_0x02d0:
            r50 = r9
            r2 = 19
            r9 = 12
            java.lang.String r16 = r0.j(r1, r9)
            r8 = r8 | 4096(0x1000, float:5.74E-42)
            bp0.k r23 = bp0.k.f22762a
            r26 = r3
            r35 = r16
            goto L_0x038c
        L_0x02e4:
            r50 = r9
            r2 = 19
            r9 = 11
            java.lang.String r16 = r0.j(r1, r9)
            r8 = r8 | 2048(0x800, float:2.87E-42)
            bp0.k r34 = bp0.k.f22762a
            r26 = r3
            r34 = r16
            goto L_0x038c
        L_0x02f8:
            r50 = r9
            r2 = 19
            r9 = 10
            java.lang.String r16 = r0.j(r1, r9)
            r8 = r8 | 1024(0x400, float:1.435E-42)
            bp0.k r33 = bp0.k.f22762a
            r26 = r3
            r33 = r16
            goto L_0x038c
        L_0x030c:
            r50 = r9
            r2 = 19
            r9 = 9
            java.lang.String r16 = r0.j(r1, r9)
            r8 = r8 | 512(0x200, float:7.175E-43)
            bp0.k r32 = bp0.k.f22762a
            r26 = r3
            r32 = r16
            goto L_0x038c
        L_0x0320:
            r50 = r9
            r2 = 19
            r9 = 8
            java.lang.String r16 = r0.j(r1, r9)
            r8 = r8 | 256(0x100, float:3.59E-43)
            bp0.k r31 = bp0.k.f22762a
            r26 = r3
            r31 = r16
            goto L_0x038c
        L_0x0333:
            r50 = r9
            r2 = 19
            r9 = 7
            java.lang.String r16 = r0.j(r1, r9)
            r8 = r8 | 128(0x80, float:1.794E-43)
            bp0.k r30 = bp0.k.f22762a
            r26 = r3
            r30 = r16
            goto L_0x038c
        L_0x0345:
            r50 = r9
            r2 = 19
            r9 = 6
            java.lang.String r16 = r0.j(r1, r9)
            r8 = r8 | 64
            bp0.k r29 = bp0.k.f22762a
            r26 = r3
            r29 = r16
            goto L_0x038c
        L_0x0357:
            r50 = r9
            r2 = 19
            r9 = 5
            java.lang.String r16 = r0.j(r1, r9)
            r8 = r8 | 32
            bp0.k r28 = bp0.k.f22762a
            r26 = r3
            r28 = r16
            goto L_0x038c
        L_0x0369:
            r50 = r9
            r2 = 19
            r9 = 4
            java.lang.String r16 = r0.j(r1, r9)
            r8 = r8 | 16
            bp0.k r27 = bp0.k.f22762a
            r26 = r3
            r27 = r16
            goto L_0x038c
        L_0x037b:
            r50 = r9
            r9 = 4
            gq0.a1 r2 = gq0.a1.f23069b
            r9 = 3
            java.lang.Object r2 = r0.s(r1, r9, r2, r7)
            r8 = r8 | 8
            bp0.k r7 = bp0.k.f22762a
            r7 = r2
        L_0x038a:
            r26 = r3
        L_0x038c:
            r2 = r49
            r9 = r50
            goto L_0x03bb
        L_0x0391:
            r50 = r9
            r9 = 3
            gq0.a1 r2 = gq0.a1.f23069b
            r26 = r3
            r9 = r50
            r3 = 2
            java.lang.Object r2 = r0.s(r1, r3, r2, r9)
            r8 = r8 | 4
            bp0.k r9 = bp0.k.f22762a
            r9 = r2
            r2 = r49
            goto L_0x03bb
        L_0x03a7:
            r26 = r3
            r3 = 2
            gq0.a1 r2 = gq0.a1.f23069b
            r25 = r4
            r3 = r49
            r4 = 1
            java.lang.Object r2 = r0.s(r1, r4, r2, r3)
            r8 = r8 | 2
            bp0.k r3 = bp0.k.f22762a
            r4 = r25
        L_0x03bb:
            r3 = 0
            goto L_0x03eb
        L_0x03bd:
            r26 = r3
            r25 = r4
            r3 = r49
            r4 = 1
            gq0.a1 r2 = gq0.a1.f23069b
            r24 = r3
            r4 = r47
            r3 = 0
            java.lang.Object r2 = r0.s(r1, r3, r2, r4)
            r8 = r8 | 1
            bp0.k r4 = bp0.k.f22762a
            r47 = r2
            r2 = r24
            r4 = r25
            goto L_0x03eb
        L_0x03da:
            r26 = r3
            r25 = r4
            r4 = r47
            r24 = r49
            r3 = 0
            bp0.k r2 = bp0.k.f22762a
            r2 = r24
            r4 = r25
            r48 = 0
        L_0x03eb:
            r3 = r26
            goto L_0x0161
        L_0x03ef:
            r24 = r2
            r26 = r3
            r25 = r4
            r4 = r47
            r2 = r10
            r16 = r11
            r10 = r26
            r17 = r27
            r23 = r28
            r18 = r29
            r19 = r30
            r20 = r31
            r21 = r32
            r22 = r33
            r44 = r41
            r45 = r42
            r46 = r43
            r11 = r6
            r6 = r24
            r24 = r25
            r41 = r38
            r42 = r39
            r43 = r40
            r25 = r4
            r4 = r8
            r38 = r35
            r39 = r36
            r40 = r37
            r8 = r7
            r7 = r9
            r37 = r34
            r9 = r5
        L_0x0429:
            r0.c(r1)
            in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getSwiggyHeaders.GetSwiggyHeaderResponsePayload r0 = new in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getSwiggyHeaders.GetSwiggyHeaderResponsePayload
            r3 = r0
            r5 = r25
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = (java.lang.String) r8
            r26 = r24
            java.lang.String r26 = (java.lang.String) r26
            r27 = r9
            java.lang.String r27 = (java.lang.String) r27
            r28 = r10
            java.lang.String r28 = (java.lang.String) r28
            r29 = r15
            java.lang.String r29 = (java.lang.String) r29
            r30 = r14
            java.lang.String r30 = (java.lang.String) r30
            r31 = r11
            java.lang.String r31 = (java.lang.String) r31
            r32 = r13
            java.lang.String r32 = (java.lang.String) r32
            r33 = r12
            java.lang.String r33 = (java.lang.String) r33
            r34 = r16
            java.lang.String r34 = (java.lang.String) r34
            r35 = r2
            java.lang.String r35 = (java.lang.String) r35
            r36 = 0
            r9 = r17
            r10 = r23
            r11 = r18
            r12 = r19
            r13 = r20
            r14 = r21
            r15 = r22
            r16 = r37
            r17 = r38
            r18 = r39
            r19 = r40
            r20 = r41
            r21 = r42
            r22 = r43
            r23 = r44
            r24 = r45
            r25 = r46
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getSwiggyHeaders.GetSwiggyHeaderResponsePayload$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getSwiggyHeaders.GetSwiggyHeaderResponsePayload");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public GetSwiggyHeaderResponsePayload patch(Decoder decoder, GetSwiggyHeaderResponsePayload getSwiggyHeaderResponsePayload) {
        return (GetSwiggyHeaderResponsePayload) q.a.a(this, decoder, getSwiggyHeaderResponsePayload);
    }

    public void serialize(Encoder encoder, GetSwiggyHeaderResponsePayload getSwiggyHeaderResponsePayload) {
        p.j(encoder, "encoder");
        p.j(getSwiggyHeaderResponsePayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        GetSwiggyHeaderResponsePayload.d(getSwiggyHeaderResponsePayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
