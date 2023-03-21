package co.hyperverge.crashguard.data.models;

import co.hyperverge.crashguard.data.models.CrashEvent;
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

/* compiled from: CrashEvent.kt */
public final class CrashEvent$Exception$Value$$serializer implements q<CrashEvent.Exception.Value> {
    public static final CrashEvent$Exception$Value$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CrashEvent$Exception$Value$$serializer crashEvent$Exception$Value$$serializer = new CrashEvent$Exception$Value$$serializer();
        INSTANCE = crashEvent$Exception$Value$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("co.hyperverge.crashguard.data.models.CrashEvent.Exception.Value", crashEvent$Exception$Value$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("value", true);
        pluginGeneratedSerialDescriptor.j("module", true);
        pluginGeneratedSerialDescriptor.j("stacktrace", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CrashEvent$Exception$Value$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(CrashEvent$Exception$Value$StackTrace$$serializer.INSTANCE)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public co.hyperverge.crashguard.data.models.CrashEvent.Exception.Value deserialize(kotlinx.serialization.encoding.Decoder r14) {
        /*
            r13 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.p.j(r14, r0)
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r13.getDescriptor()
            fq0.c r14 = r14.b(r0)
            boolean r1 = r14.k()
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L_0x0031
            gq0.a1 r1 = gq0.a1.f23069b
            java.lang.Object r5 = r14.s(r0, r5, r1, r4)
            java.lang.Object r6 = r14.s(r0, r6, r1, r4)
            java.lang.Object r1 = r14.s(r0, r3, r1, r4)
            co.hyperverge.crashguard.data.models.CrashEvent$Exception$Value$StackTrace$$serializer r3 = co.hyperverge.crashguard.data.models.CrashEvent$Exception$Value$StackTrace$$serializer.INSTANCE
            java.lang.Object r2 = r14.s(r0, r2, r3, r4)
            r3 = 15
            r4 = 15
            goto L_0x0078
        L_0x0031:
            r7 = r4
            r8 = r7
            r9 = r8
            r1 = 0
            r10 = 1
        L_0x0036:
            if (r10 == 0) goto L_0x0073
            int r11 = r14.w(r0)
            r12 = -1
            if (r11 == r12) goto L_0x0071
            if (r11 == 0) goto L_0x0068
            if (r11 == r6) goto L_0x005f
            if (r11 == r3) goto L_0x0056
            if (r11 != r2) goto L_0x0050
            co.hyperverge.crashguard.data.models.CrashEvent$Exception$Value$StackTrace$$serializer r11 = co.hyperverge.crashguard.data.models.CrashEvent$Exception$Value$StackTrace$$serializer.INSTANCE
            java.lang.Object r9 = r14.s(r0, r2, r11, r9)
            r1 = r1 | 8
            goto L_0x0036
        L_0x0050:
            kotlinx.serialization.UnknownFieldException r14 = new kotlinx.serialization.UnknownFieldException
            r14.<init>(r11)
            throw r14
        L_0x0056:
            gq0.a1 r11 = gq0.a1.f23069b
            java.lang.Object r8 = r14.s(r0, r3, r11, r8)
            r1 = r1 | 4
            goto L_0x0036
        L_0x005f:
            gq0.a1 r11 = gq0.a1.f23069b
            java.lang.Object r7 = r14.s(r0, r6, r11, r7)
            r1 = r1 | 2
            goto L_0x0036
        L_0x0068:
            gq0.a1 r11 = gq0.a1.f23069b
            java.lang.Object r4 = r14.s(r0, r5, r11, r4)
            r1 = r1 | 1
            goto L_0x0036
        L_0x0071:
            r10 = 0
            goto L_0x0036
        L_0x0073:
            r5 = r4
            r6 = r7
            r2 = r9
            r4 = r1
            r1 = r8
        L_0x0078:
            r14.c(r0)
            co.hyperverge.crashguard.data.models.CrashEvent$Exception$Value r14 = new co.hyperverge.crashguard.data.models.CrashEvent$Exception$Value
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = (java.lang.String) r6
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            r8 = r2
            co.hyperverge.crashguard.data.models.CrashEvent$Exception$Value$StackTrace r8 = (co.hyperverge.crashguard.data.models.CrashEvent.Exception.Value.StackTrace) r8
            r9 = 0
            r3 = r14
            r3.<init>((int) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (co.hyperverge.crashguard.data.models.CrashEvent.Exception.Value.StackTrace) r8, (gq0.x0) r9)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: co.hyperverge.crashguard.data.models.CrashEvent$Exception$Value$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):co.hyperverge.crashguard.data.models.CrashEvent$Exception$Value");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public abstract /* synthetic */ Object patch(Decoder decoder, Object obj);

    public void serialize(Encoder encoder, CrashEvent.Exception.Value value) {
        p.j(encoder, "encoder");
        p.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        CrashEvent.Exception.Value.a(value, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
