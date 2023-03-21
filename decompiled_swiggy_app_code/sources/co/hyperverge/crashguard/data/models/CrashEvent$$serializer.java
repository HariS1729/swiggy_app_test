package co.hyperverge.crashguard.data.models;

import com.newrelic.agent.android.agentdata.HexAttribute;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.n;
import gq0.q;
import gq0.s;
import in.juspay.hyper.constants.LogSubCategory;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: CrashEvent.kt */
public final class CrashEvent$$serializer implements q<CrashEvent> {
    public static final CrashEvent$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CrashEvent$$serializer crashEvent$$serializer = new CrashEvent$$serializer();
        INSTANCE = crashEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("co.hyperverge.crashguard.data.models.CrashEvent", crashEvent$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("culprit", true);
        pluginGeneratedSerialDescriptor.j(AnalyticsAttribute.APPLICATION_PLATFORM_ATTRIBUTE, true);
        pluginGeneratedSerialDescriptor.j("timestamp", true);
        pluginGeneratedSerialDescriptor.j(HexAttribute.HEX_ATTR_MESSAGE, true);
        pluginGeneratedSerialDescriptor.j("contexts", true);
        pluginGeneratedSerialDescriptor.j("exception", true);
        pluginGeneratedSerialDescriptor.j("tags", true);
        pluginGeneratedSerialDescriptor.j(LogSubCategory.Action.USER, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CrashEvent$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a.p(a1Var), a.p(a1Var), a.p(n.f23109b), a.p(a1Var), CrashEvent$Contexts$$serializer.INSTANCE, a.p(CrashEvent$Exception$$serializer.INSTANCE), new s(a1Var, a1Var), CrashEvent$User$$serializer.INSTANCE};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0096, code lost:
        r3 = 7;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c6, code lost:
        r3 = 7;
        r4 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        r9 = r9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public co.hyperverge.crashguard.data.models.CrashEvent deserialize(kotlinx.serialization.encoding.Decoder r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r17.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r3 = 7
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 4
            r8 = 2
            r9 = 0
            r10 = 1
            r11 = 0
            if (r2 == 0) goto L_0x0055
            gq0.a1 r2 = gq0.a1.f23069b
            java.lang.Object r9 = r0.s(r1, r9, r2, r11)
            java.lang.Object r10 = r0.s(r1, r10, r2, r11)
            gq0.n r12 = gq0.n.f23109b
            java.lang.Object r8 = r0.s(r1, r8, r12, r11)
            java.lang.Object r6 = r0.s(r1, r6, r2, r11)
            co.hyperverge.crashguard.data.models.CrashEvent$Contexts$$serializer r12 = co.hyperverge.crashguard.data.models.CrashEvent$Contexts$$serializer.INSTANCE
            java.lang.Object r7 = r0.o(r1, r7, r12, r11)
            co.hyperverge.crashguard.data.models.CrashEvent$Exception$$serializer r12 = co.hyperverge.crashguard.data.models.CrashEvent$Exception$$serializer.INSTANCE
            java.lang.Object r5 = r0.s(r1, r5, r12, r11)
            gq0.s r12 = new gq0.s
            r12.<init>(r2, r2)
            java.lang.Object r2 = r0.o(r1, r4, r12, r11)
            co.hyperverge.crashguard.data.models.CrashEvent$User$$serializer r4 = co.hyperverge.crashguard.data.models.CrashEvent$User$$serializer.INSTANCE
            java.lang.Object r3 = r0.o(r1, r3, r4, r11)
            r4 = 255(0xff, float:3.57E-43)
            r11 = r9
            r9 = r5
            r5 = 255(0xff, float:3.57E-43)
            goto L_0x00d6
        L_0x0055:
            r8 = r11
            r9 = r8
            r10 = r9
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
            r2 = 0
            r16 = 1
        L_0x005f:
            if (r16 == 0) goto L_0x00cf
            int r6 = r0.w(r1)
            switch(r6) {
                case -1: goto L_0x00c9;
                case 0: goto L_0x00bb;
                case 1: goto L_0x00af;
                case 2: goto L_0x00a4;
                case 3: goto L_0x0099;
                case 4: goto L_0x008e;
                case 5: goto L_0x0085;
                case 6: goto L_0x0077;
                case 7: goto L_0x006e;
                default: goto L_0x0068;
            }
        L_0x0068:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r6)
            throw r0
        L_0x006e:
            co.hyperverge.crashguard.data.models.CrashEvent$User$$serializer r6 = co.hyperverge.crashguard.data.models.CrashEvent$User$$serializer.INSTANCE
            java.lang.Object r8 = r0.o(r1, r3, r6, r8)
            r2 = r2 | 128(0x80, float:1.794E-43)
            goto L_0x0097
        L_0x0077:
            gq0.s r6 = new gq0.s
            gq0.a1 r3 = gq0.a1.f23069b
            r6.<init>(r3, r3)
            java.lang.Object r10 = r0.o(r1, r4, r6, r10)
            r2 = r2 | 64
            goto L_0x0096
        L_0x0085:
            co.hyperverge.crashguard.data.models.CrashEvent$Exception$$serializer r3 = co.hyperverge.crashguard.data.models.CrashEvent$Exception$$serializer.INSTANCE
            java.lang.Object r9 = r0.s(r1, r5, r3, r9)
            r2 = r2 | 32
            goto L_0x0096
        L_0x008e:
            co.hyperverge.crashguard.data.models.CrashEvent$Contexts$$serializer r3 = co.hyperverge.crashguard.data.models.CrashEvent$Contexts$$serializer.INSTANCE
            java.lang.Object r15 = r0.o(r1, r7, r3, r15)
            r2 = r2 | 16
        L_0x0096:
            r3 = 7
        L_0x0097:
            r6 = 3
            goto L_0x005f
        L_0x0099:
            gq0.a1 r3 = gq0.a1.f23069b
            r6 = 3
            java.lang.Object r14 = r0.s(r1, r6, r3, r14)
            r2 = r2 | 8
            r3 = 7
            goto L_0x005f
        L_0x00a4:
            r6 = 3
            gq0.n r3 = gq0.n.f23109b
            r4 = 2
            java.lang.Object r13 = r0.s(r1, r4, r3, r13)
            r2 = r2 | 4
            goto L_0x00c6
        L_0x00af:
            r4 = 2
            r6 = 3
            gq0.a1 r3 = gq0.a1.f23069b
            r4 = 1
            java.lang.Object r12 = r0.s(r1, r4, r3, r12)
            r2 = r2 | 2
            goto L_0x00c6
        L_0x00bb:
            r4 = 1
            r6 = 3
            gq0.a1 r3 = gq0.a1.f23069b
            r4 = 0
            java.lang.Object r11 = r0.s(r1, r4, r3, r11)
            r2 = r2 | 1
        L_0x00c6:
            r3 = 7
            r4 = 6
            goto L_0x005f
        L_0x00c9:
            r4 = 0
            r6 = 3
            r4 = 6
            r16 = 0
            goto L_0x005f
        L_0x00cf:
            r5 = r2
            r3 = r8
            r2 = r10
            r10 = r12
            r8 = r13
            r6 = r14
            r7 = r15
        L_0x00d6:
            r0.c(r1)
            co.hyperverge.crashguard.data.models.CrashEvent r0 = new co.hyperverge.crashguard.data.models.CrashEvent
            r1 = r11
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Double r8 = (java.lang.Double) r8
            r11 = r6
            java.lang.String r11 = (java.lang.String) r11
            r12 = r7
            co.hyperverge.crashguard.data.models.CrashEvent$Contexts r12 = (co.hyperverge.crashguard.data.models.CrashEvent.Contexts) r12
            r13 = r9
            co.hyperverge.crashguard.data.models.CrashEvent$Exception r13 = (co.hyperverge.crashguard.data.models.CrashEvent.Exception) r13
            java.util.HashMap r2 = (java.util.HashMap) r2
            co.hyperverge.crashguard.data.models.CrashEvent$User r3 = (co.hyperverge.crashguard.data.models.CrashEvent.User) r3
            r14 = 0
            r4 = r0
            r6 = r1
            r7 = r10
            r9 = r11
            r10 = r12
            r11 = r13
            r12 = r2
            r13 = r3
            r4.<init>((int) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.Double) r8, (java.lang.String) r9, (co.hyperverge.crashguard.data.models.CrashEvent.Contexts) r10, (co.hyperverge.crashguard.data.models.CrashEvent.Exception) r11, (java.util.HashMap) r12, (co.hyperverge.crashguard.data.models.CrashEvent.User) r13, (gq0.x0) r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: co.hyperverge.crashguard.data.models.CrashEvent$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):co.hyperverge.crashguard.data.models.CrashEvent");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public abstract /* synthetic */ Object patch(Decoder decoder, Object obj);

    public void serialize(Encoder encoder, CrashEvent crashEvent) {
        p.j(encoder, "encoder");
        p.j(crashEvent, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        CrashEvent.e(crashEvent, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
