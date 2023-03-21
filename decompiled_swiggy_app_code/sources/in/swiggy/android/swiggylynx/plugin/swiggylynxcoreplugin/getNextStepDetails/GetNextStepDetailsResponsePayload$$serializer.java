package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getNextStepDetails;

import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.q;
import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: GetNextStepDetailsResponsePayload.kt */
public final class GetNextStepDetailsResponsePayload$$serializer implements q<GetNextStepDetailsResponsePayload> {
    public static final GetNextStepDetailsResponsePayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        GetNextStepDetailsResponsePayload$$serializer getNextStepDetailsResponsePayload$$serializer = new GetNextStepDetailsResponsePayload$$serializer();
        INSTANCE = getNextStepDetailsResponsePayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getNextStepDetails.GetNextStepDetailsResponsePayload", getNextStepDetailsResponsePayload$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("callback", true);
        pluginGeneratedSerialDescriptor.j(CardTypeAdapterFactory.DATA, true);
        pluginGeneratedSerialDescriptor.j("params", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GetNextStepDetailsResponsePayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getNextStepDetails.GetNextStepDetailsResponsePayload deserialize(kotlinx.serialization.encoding.Decoder r14) {
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
            if (r1 == 0) goto L_0x0030
            gq0.a1 r1 = gq0.a1.f23069b
            java.lang.Object r5 = r14.s(r0, r5, r1, r4)
            java.lang.Object r6 = r14.s(r0, r6, r1, r4)
            java.lang.Object r3 = r14.s(r0, r3, r1, r4)
            java.lang.Object r1 = r14.s(r0, r2, r1, r4)
            r2 = 15
            r8 = r3
            r3 = 15
            goto L_0x0076
        L_0x0030:
            r7 = r4
            r8 = r7
            r9 = r8
            r1 = 0
            r10 = 1
        L_0x0035:
            if (r10 == 0) goto L_0x0072
            int r11 = r14.w(r0)
            r12 = -1
            if (r11 == r12) goto L_0x0070
            if (r11 == 0) goto L_0x0067
            if (r11 == r6) goto L_0x005e
            if (r11 == r3) goto L_0x0055
            if (r11 != r2) goto L_0x004f
            gq0.a1 r11 = gq0.a1.f23069b
            java.lang.Object r9 = r14.s(r0, r2, r11, r9)
            r1 = r1 | 8
            goto L_0x0035
        L_0x004f:
            kotlinx.serialization.UnknownFieldException r14 = new kotlinx.serialization.UnknownFieldException
            r14.<init>(r11)
            throw r14
        L_0x0055:
            gq0.a1 r11 = gq0.a1.f23069b
            java.lang.Object r8 = r14.s(r0, r3, r11, r8)
            r1 = r1 | 4
            goto L_0x0035
        L_0x005e:
            gq0.a1 r11 = gq0.a1.f23069b
            java.lang.Object r7 = r14.s(r0, r6, r11, r7)
            r1 = r1 | 2
            goto L_0x0035
        L_0x0067:
            gq0.a1 r11 = gq0.a1.f23069b
            java.lang.Object r4 = r14.s(r0, r5, r11, r4)
            r1 = r1 | 1
            goto L_0x0035
        L_0x0070:
            r10 = 0
            goto L_0x0035
        L_0x0072:
            r3 = r1
            r5 = r4
            r6 = r7
            r1 = r9
        L_0x0076:
            r14.c(r0)
            in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getNextStepDetails.GetNextStepDetailsResponsePayload r14 = new in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getNextStepDetails.GetNextStepDetailsResponsePayload
            r4 = r5
            java.lang.String r4 = (java.lang.String) r4
            r5 = r6
            java.lang.String r5 = (java.lang.String) r5
            r6 = r8
            java.lang.String r6 = (java.lang.String) r6
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            r8 = 0
            r2 = r14
            r2.<init>((int) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (gq0.x0) r8)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getNextStepDetails.GetNextStepDetailsResponsePayload$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getNextStepDetails.GetNextStepDetailsResponsePayload");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public GetNextStepDetailsResponsePayload patch(Decoder decoder, GetNextStepDetailsResponsePayload getNextStepDetailsResponsePayload) {
        return (GetNextStepDetailsResponsePayload) q.a.a(this, decoder, getNextStepDetailsResponsePayload);
    }

    public void serialize(Encoder encoder, GetNextStepDetailsResponsePayload getNextStepDetailsResponsePayload) {
        p.j(encoder, "encoder");
        p.j(getNextStepDetailsResponsePayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        GetNextStepDetailsResponsePayload.a(getNextStepDetailsResponsePayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
