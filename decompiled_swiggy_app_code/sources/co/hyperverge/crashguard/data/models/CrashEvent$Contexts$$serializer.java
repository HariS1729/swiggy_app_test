package co.hyperverge.crashguard.data.models;

import co.hyperverge.crashguard.data.models.CrashEvent;
import fq0.d;
import gq0.q;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: CrashEvent.kt */
public final class CrashEvent$Contexts$$serializer implements q<CrashEvent.Contexts> {
    public static final CrashEvent$Contexts$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CrashEvent$Contexts$$serializer crashEvent$Contexts$$serializer = new CrashEvent$Contexts$$serializer();
        INSTANCE = crashEvent$Contexts$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("co.hyperverge.crashguard.data.models.CrashEvent.Contexts", crashEvent$Contexts$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("app", true);
        pluginGeneratedSerialDescriptor.j("device", true);
        pluginGeneratedSerialDescriptor.j("os", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CrashEvent$Contexts$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{CrashEvent$Contexts$App$$serializer.INSTANCE, CrashEvent$Contexts$Device$$serializer.INSTANCE, CrashEvent$Contexts$OS$$serializer.INSTANCE};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public co.hyperverge.crashguard.data.models.CrashEvent.Contexts deserialize(kotlinx.serialization.encoding.Decoder r12) {
        /*
            r11 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.p.j(r12, r0)
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r11.getDescriptor()
            fq0.c r12 = r12.b(r0)
            boolean r1 = r12.k()
            r2 = 0
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x002d
            co.hyperverge.crashguard.data.models.CrashEvent$Contexts$App$$serializer r1 = co.hyperverge.crashguard.data.models.CrashEvent$Contexts$App$$serializer.INSTANCE
            java.lang.Object r1 = r12.o(r0, r4, r1, r2)
            co.hyperverge.crashguard.data.models.CrashEvent$Contexts$Device$$serializer r4 = co.hyperverge.crashguard.data.models.CrashEvent$Contexts$Device$$serializer.INSTANCE
            java.lang.Object r4 = r12.o(r0, r5, r4, r2)
            co.hyperverge.crashguard.data.models.CrashEvent$Contexts$OS$$serializer r5 = co.hyperverge.crashguard.data.models.CrashEvent$Contexts$OS$$serializer.INSTANCE
            java.lang.Object r2 = r12.o(r0, r3, r5, r2)
            r3 = 7
            r3 = r4
            r4 = 7
            goto L_0x0067
        L_0x002d:
            r1 = r2
            r6 = r1
            r7 = 0
            r8 = 1
        L_0x0031:
            if (r8 == 0) goto L_0x0063
            int r9 = r12.w(r0)
            r10 = -1
            if (r9 == r10) goto L_0x0061
            if (r9 == 0) goto L_0x0058
            if (r9 == r5) goto L_0x004f
            if (r9 != r3) goto L_0x0049
            co.hyperverge.crashguard.data.models.CrashEvent$Contexts$OS$$serializer r9 = co.hyperverge.crashguard.data.models.CrashEvent$Contexts$OS$$serializer.INSTANCE
            java.lang.Object r6 = r12.o(r0, r3, r9, r6)
            r7 = r7 | 4
            goto L_0x0031
        L_0x0049:
            kotlinx.serialization.UnknownFieldException r12 = new kotlinx.serialization.UnknownFieldException
            r12.<init>(r9)
            throw r12
        L_0x004f:
            co.hyperverge.crashguard.data.models.CrashEvent$Contexts$Device$$serializer r9 = co.hyperverge.crashguard.data.models.CrashEvent$Contexts$Device$$serializer.INSTANCE
            java.lang.Object r1 = r12.o(r0, r5, r9, r1)
            r7 = r7 | 2
            goto L_0x0031
        L_0x0058:
            co.hyperverge.crashguard.data.models.CrashEvent$Contexts$App$$serializer r9 = co.hyperverge.crashguard.data.models.CrashEvent$Contexts$App$$serializer.INSTANCE
            java.lang.Object r2 = r12.o(r0, r4, r9, r2)
            r7 = r7 | 1
            goto L_0x0031
        L_0x0061:
            r8 = 0
            goto L_0x0031
        L_0x0063:
            r3 = r1
            r1 = r2
            r2 = r6
            r4 = r7
        L_0x0067:
            r12.c(r0)
            co.hyperverge.crashguard.data.models.CrashEvent$Contexts r12 = new co.hyperverge.crashguard.data.models.CrashEvent$Contexts
            r5 = r1
            co.hyperverge.crashguard.data.models.CrashEvent$Contexts$App r5 = (co.hyperverge.crashguard.data.models.CrashEvent.Contexts.App) r5
            r6 = r3
            co.hyperverge.crashguard.data.models.CrashEvent$Contexts$Device r6 = (co.hyperverge.crashguard.data.models.CrashEvent.Contexts.Device) r6
            r7 = r2
            co.hyperverge.crashguard.data.models.CrashEvent$Contexts$OS r7 = (co.hyperverge.crashguard.data.models.CrashEvent.Contexts.OS) r7
            r8 = 0
            r3 = r12
            r3.<init>((int) r4, (co.hyperverge.crashguard.data.models.CrashEvent.Contexts.App) r5, (co.hyperverge.crashguard.data.models.CrashEvent.Contexts.Device) r6, (co.hyperverge.crashguard.data.models.CrashEvent.Contexts.OS) r7, (gq0.x0) r8)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: co.hyperverge.crashguard.data.models.CrashEvent$Contexts$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):co.hyperverge.crashguard.data.models.CrashEvent$Contexts");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public abstract /* synthetic */ Object patch(Decoder decoder, Object obj);

    public void serialize(Encoder encoder, CrashEvent.Contexts contexts) {
        p.j(encoder, "encoder");
        p.j(contexts, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        CrashEvent.Contexts.d(contexts, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
