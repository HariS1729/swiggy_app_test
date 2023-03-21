package co.hyperverge.crashguard.data.models;

import co.hyperverge.crashguard.data.models.CrashEvent;
import com.xiaomi.mipush.sdk.Constants;
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

/* compiled from: CrashEvent.kt */
public final class CrashEvent$Contexts$OS$$serializer implements q<CrashEvent.Contexts.OS> {
    public static final CrashEvent$Contexts$OS$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CrashEvent$Contexts$OS$$serializer crashEvent$Contexts$OS$$serializer = new CrashEvent$Contexts$OS$$serializer();
        INSTANCE = crashEvent$Contexts$OS$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("co.hyperverge.crashguard.data.models.CrashEvent.Contexts.OS", crashEvent$Contexts$OS$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j(Constants.VERSION, true);
        pluginGeneratedSerialDescriptor.j("build", true);
        pluginGeneratedSerialDescriptor.j("kernel_version", true);
        pluginGeneratedSerialDescriptor.j("rooted", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CrashEvent$Contexts$OS$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a1Var, a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(h.f23089b)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public co.hyperverge.crashguard.data.models.CrashEvent.Contexts.OS deserialize(kotlinx.serialization.encoding.Decoder r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r17.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r3 = 5
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 0
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L_0x003f
            java.lang.String r2 = r0.j(r1, r7)
            gq0.a1 r7 = gq0.a1.f23069b
            java.lang.Object r8 = r0.s(r1, r8, r7, r9)
            java.lang.Object r6 = r0.s(r1, r6, r7, r9)
            java.lang.Object r4 = r0.s(r1, r4, r7, r9)
            java.lang.Object r5 = r0.s(r1, r5, r7, r9)
            gq0.h r7 = gq0.h.f23089b
            java.lang.Object r3 = r0.s(r1, r3, r7, r9)
            r7 = 63
            r10 = r2
            r9 = 63
            goto L_0x0095
        L_0x003f:
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r2 = 0
            r15 = 1
        L_0x0046:
            if (r15 == 0) goto L_0x008e
            int r7 = r0.w(r1)
            switch(r7) {
                case -1: goto L_0x008b;
                case 0: goto L_0x0083;
                case 1: goto L_0x0079;
                case 2: goto L_0x0070;
                case 3: goto L_0x0067;
                case 4: goto L_0x005e;
                case 5: goto L_0x0055;
                default: goto L_0x004f;
            }
        L_0x004f:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r7)
            throw r0
        L_0x0055:
            gq0.h r7 = gq0.h.f23089b
            java.lang.Object r14 = r0.s(r1, r3, r7, r14)
            r2 = r2 | 32
            goto L_0x0081
        L_0x005e:
            gq0.a1 r7 = gq0.a1.f23069b
            java.lang.Object r13 = r0.s(r1, r5, r7, r13)
            r2 = r2 | 16
            goto L_0x0081
        L_0x0067:
            gq0.a1 r7 = gq0.a1.f23069b
            java.lang.Object r12 = r0.s(r1, r4, r7, r12)
            r2 = r2 | 8
            goto L_0x0081
        L_0x0070:
            gq0.a1 r7 = gq0.a1.f23069b
            java.lang.Object r11 = r0.s(r1, r6, r7, r11)
            r2 = r2 | 4
            goto L_0x0081
        L_0x0079:
            gq0.a1 r7 = gq0.a1.f23069b
            java.lang.Object r10 = r0.s(r1, r8, r7, r10)
            r2 = r2 | 2
        L_0x0081:
            r7 = 0
            goto L_0x0046
        L_0x0083:
            r7 = 0
            java.lang.String r9 = r0.j(r1, r7)
            r2 = r2 | 1
            goto L_0x0046
        L_0x008b:
            r7 = 0
            r15 = 0
            goto L_0x0046
        L_0x008e:
            r8 = r10
            r6 = r11
            r4 = r12
            r5 = r13
            r3 = r14
            r10 = r9
            r9 = r2
        L_0x0095:
            r0.c(r1)
            co.hyperverge.crashguard.data.models.CrashEvent$Contexts$OS r0 = new co.hyperverge.crashguard.data.models.CrashEvent$Contexts$OS
            r11 = r8
            java.lang.String r11 = (java.lang.String) r11
            r12 = r6
            java.lang.String r12 = (java.lang.String) r12
            r13 = r4
            java.lang.String r13 = (java.lang.String) r13
            r14 = r5
            java.lang.String r14 = (java.lang.String) r14
            r15 = r3
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            r16 = 0
            r8 = r0
            r8.<init>((int) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.Boolean) r15, (gq0.x0) r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: co.hyperverge.crashguard.data.models.CrashEvent$Contexts$OS$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):co.hyperverge.crashguard.data.models.CrashEvent$Contexts$OS");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public abstract /* synthetic */ Object patch(Decoder decoder, Object obj);

    public void serialize(Encoder encoder, CrashEvent.Contexts.OS os2) {
        p.j(encoder, "encoder");
        p.j(os2, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        CrashEvent.Contexts.OS.f(os2, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
