package in.swiggy.android.swiggylynx.plugin.tns;

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

/* compiled from: TnsInjestionPayload.kt */
public final class TnsIngestionPayload$$serializer implements q<TnsIngestionPayload> {
    public static final TnsIngestionPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        TnsIngestionPayload$$serializer tnsIngestionPayload$$serializer = new TnsIngestionPayload$$serializer();
        INSTANCE = tnsIngestionPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.tns.TnsIngestionPayload", tnsIngestionPayload$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("googlePlayIntegrity", false);
        pluginGeneratedSerialDescriptor.j("isDxAppInstalled", false);
        pluginGeneratedSerialDescriptor.j("currentAppVersion", false);
        pluginGeneratedSerialDescriptor.j("location", false);
        pluginGeneratedSerialDescriptor.j("ipAddress", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TnsIngestionPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.tns.TnsIngestionPayload deserialize(kotlinx.serialization.encoding.Decoder r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r16.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r3 = 3
            r4 = 4
            r5 = 2
            r6 = 0
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L_0x0037
            gq0.a1 r2 = gq0.a1.f23069b
            java.lang.Object r6 = r0.s(r1, r6, r2, r7)
            java.lang.Object r8 = r0.s(r1, r8, r2, r7)
            java.lang.Object r5 = r0.s(r1, r5, r2, r7)
            java.lang.Object r3 = r0.s(r1, r3, r2, r7)
            java.lang.Object r2 = r0.s(r1, r4, r2, r7)
            r4 = 31
            r10 = r5
            r5 = 31
            goto L_0x008a
        L_0x0037:
            r9 = r7
            r10 = r9
            r11 = r10
            r12 = r11
            r2 = 0
            r13 = 1
        L_0x003d:
            if (r13 == 0) goto L_0x0085
            int r14 = r0.w(r1)
            r15 = -1
            if (r14 == r15) goto L_0x0083
            if (r14 == 0) goto L_0x007a
            if (r14 == r8) goto L_0x0071
            if (r14 == r5) goto L_0x0068
            if (r14 == r3) goto L_0x005f
            if (r14 != r4) goto L_0x0059
            gq0.a1 r14 = gq0.a1.f23069b
            java.lang.Object r12 = r0.s(r1, r4, r14, r12)
            r2 = r2 | 16
            goto L_0x003d
        L_0x0059:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r14)
            throw r0
        L_0x005f:
            gq0.a1 r14 = gq0.a1.f23069b
            java.lang.Object r11 = r0.s(r1, r3, r14, r11)
            r2 = r2 | 8
            goto L_0x003d
        L_0x0068:
            gq0.a1 r14 = gq0.a1.f23069b
            java.lang.Object r10 = r0.s(r1, r5, r14, r10)
            r2 = r2 | 4
            goto L_0x003d
        L_0x0071:
            gq0.a1 r14 = gq0.a1.f23069b
            java.lang.Object r9 = r0.s(r1, r8, r14, r9)
            r2 = r2 | 2
            goto L_0x003d
        L_0x007a:
            gq0.a1 r14 = gq0.a1.f23069b
            java.lang.Object r7 = r0.s(r1, r6, r14, r7)
            r2 = r2 | 1
            goto L_0x003d
        L_0x0083:
            r13 = 0
            goto L_0x003d
        L_0x0085:
            r5 = r2
            r6 = r7
            r8 = r9
            r3 = r11
            r2 = r12
        L_0x008a:
            r0.c(r1)
            in.swiggy.android.swiggylynx.plugin.tns.TnsIngestionPayload r0 = new in.swiggy.android.swiggylynx.plugin.tns.TnsIngestionPayload
            java.lang.String r6 = (java.lang.String) r6
            r7 = r8
            java.lang.String r7 = (java.lang.String) r7
            r8 = r10
            java.lang.String r8 = (java.lang.String) r8
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            r10 = r2
            java.lang.String r10 = (java.lang.String) r10
            r11 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.tns.TnsIngestionPayload$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.tns.TnsIngestionPayload");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public TnsIngestionPayload patch(Decoder decoder, TnsIngestionPayload tnsIngestionPayload) {
        return (TnsIngestionPayload) q.a.a(this, decoder, tnsIngestionPayload);
    }

    public void serialize(Encoder encoder, TnsIngestionPayload tnsIngestionPayload) {
        p.j(encoder, "encoder");
        p.j(tnsIngestionPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        TnsIngestionPayload.b(tnsIngestionPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
