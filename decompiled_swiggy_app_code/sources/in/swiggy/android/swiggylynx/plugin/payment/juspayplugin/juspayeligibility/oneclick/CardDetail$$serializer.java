package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick;

import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.q;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: OneClickEligibilityRequestPayload.kt */
public final class CardDetail$$serializer implements q<CardDetail> {
    public static final CardDetail$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CardDetail$$serializer cardDetail$$serializer = new CardDetail$$serializer();
        INSTANCE = cardDetail$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.CardDetail", cardDetail$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("cardFingerPrint", true);
        pluginGeneratedSerialDescriptor.j("cardBin", true);
        pluginGeneratedSerialDescriptor.j("checkType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CardDetail$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a.p(a1Var), a.p(a1Var), a.p(new f(a1Var))};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.CardDetail deserialize(kotlinx.serialization.encoding.Decoder r12) {
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
            gq0.a1 r1 = gq0.a1.f23069b
            java.lang.Object r4 = r12.s(r0, r4, r1, r2)
            java.lang.Object r5 = r12.s(r0, r5, r1, r2)
            gq0.f r6 = new gq0.f
            r6.<init>(r1)
            java.lang.Object r1 = r12.s(r0, r3, r6, r2)
            r2 = 7
            r3 = 7
            goto L_0x006d
        L_0x002d:
            r1 = r2
            r6 = r1
            r7 = r6
            r2 = 0
            r8 = 1
        L_0x0032:
            if (r8 == 0) goto L_0x0069
            int r9 = r12.w(r0)
            r10 = -1
            if (r9 == r10) goto L_0x0067
            if (r9 == 0) goto L_0x005e
            if (r9 == r5) goto L_0x0055
            if (r9 != r3) goto L_0x004f
            gq0.f r9 = new gq0.f
            gq0.a1 r10 = gq0.a1.f23069b
            r9.<init>(r10)
            java.lang.Object r7 = r12.s(r0, r3, r9, r7)
            r2 = r2 | 4
            goto L_0x0032
        L_0x004f:
            kotlinx.serialization.UnknownFieldException r12 = new kotlinx.serialization.UnknownFieldException
            r12.<init>(r9)
            throw r12
        L_0x0055:
            gq0.a1 r9 = gq0.a1.f23069b
            java.lang.Object r6 = r12.s(r0, r5, r9, r6)
            r2 = r2 | 2
            goto L_0x0032
        L_0x005e:
            gq0.a1 r9 = gq0.a1.f23069b
            java.lang.Object r1 = r12.s(r0, r4, r9, r1)
            r2 = r2 | 1
            goto L_0x0032
        L_0x0067:
            r8 = 0
            goto L_0x0032
        L_0x0069:
            r4 = r1
            r3 = r2
            r5 = r6
            r1 = r7
        L_0x006d:
            r12.c(r0)
            in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.CardDetail r12 = new in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.CardDetail
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = (java.lang.String) r5
            r6 = r1
            java.util.List r6 = (java.util.List) r6
            r7 = 0
            r2 = r12
            r2.<init>((int) r3, (java.lang.String) r4, (java.lang.String) r5, (java.util.List) r6, (gq0.x0) r7)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.CardDetail$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick.CardDetail");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public CardDetail patch(Decoder decoder, CardDetail cardDetail) {
        return (CardDetail) q.a.a(this, decoder, cardDetail);
    }

    public void serialize(Encoder encoder, CardDetail cardDetail) {
        p.j(encoder, "encoder");
        p.j(cardDetail, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        CardDetail.d(cardDetail, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
