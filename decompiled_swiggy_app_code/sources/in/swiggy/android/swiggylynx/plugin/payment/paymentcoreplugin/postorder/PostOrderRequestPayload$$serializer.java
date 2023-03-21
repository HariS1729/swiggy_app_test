package in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.postorder;

import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.h;
import gq0.q;
import hq0.o;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: PostOrderRequestPayload.kt */
public final class PostOrderRequestPayload$$serializer implements q<PostOrderRequestPayload> {
    public static final PostOrderRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        PostOrderRequestPayload$$serializer postOrderRequestPayload$$serializer = new PostOrderRequestPayload$$serializer();
        INSTANCE = postOrderRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.postorder.PostOrderRequestPayload", postOrderRequestPayload$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("orderData", false);
        pluginGeneratedSerialDescriptor.j("businessLine", true);
        pluginGeneratedSerialDescriptor.j("showTrack", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PostOrderRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{o.f23170b, a.p(a1.f23069b), a.p(h.f23089b)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.postorder.PostOrderRequestPayload deserialize(kotlinx.serialization.encoding.Decoder r12) {
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
            hq0.o r1 = hq0.o.f23170b
            java.lang.Object r1 = r12.o(r0, r4, r1, r2)
            gq0.a1 r4 = gq0.a1.f23069b
            java.lang.Object r4 = r12.s(r0, r5, r4, r2)
            gq0.h r5 = gq0.h.f23089b
            java.lang.Object r2 = r12.s(r0, r3, r5, r2)
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
            gq0.h r9 = gq0.h.f23089b
            java.lang.Object r6 = r12.s(r0, r3, r9, r6)
            r7 = r7 | 4
            goto L_0x0031
        L_0x0049:
            kotlinx.serialization.UnknownFieldException r12 = new kotlinx.serialization.UnknownFieldException
            r12.<init>(r9)
            throw r12
        L_0x004f:
            gq0.a1 r9 = gq0.a1.f23069b
            java.lang.Object r1 = r12.s(r0, r5, r9, r1)
            r7 = r7 | 2
            goto L_0x0031
        L_0x0058:
            hq0.o r9 = hq0.o.f23170b
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
            in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.postorder.PostOrderRequestPayload r12 = new in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.postorder.PostOrderRequestPayload
            r5 = r1
            kotlinx.serialization.json.JsonObject r5 = (kotlinx.serialization.json.JsonObject) r5
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            r7 = r2
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r8 = 0
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.postorder.PostOrderRequestPayload$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.payment.paymentcoreplugin.postorder.PostOrderRequestPayload");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public PostOrderRequestPayload patch(Decoder decoder, PostOrderRequestPayload postOrderRequestPayload) {
        return (PostOrderRequestPayload) q.a.a(this, decoder, postOrderRequestPayload);
    }

    public void serialize(Encoder encoder, PostOrderRequestPayload postOrderRequestPayload) {
        p.j(encoder, "encoder");
        p.j(postOrderRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        PostOrderRequestPayload.e(postOrderRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
