package in.swiggy.android.swiggylynx.model;

import com.newrelic.agent.android.agentdata.HexAttribute;
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
import kotlinx.serialization.json.JsonElementSerializer;

/* compiled from: WebViewLastState.kt */
public final class WebViewLastState$$serializer implements q<WebViewLastState> {
    public static final WebViewLastState$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        WebViewLastState$$serializer webViewLastState$$serializer = new WebViewLastState$$serializer();
        INSTANCE = webViewLastState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.model.WebViewLastState", webViewLastState$$serializer, 4);
        pluginGeneratedSerialDescriptor.j(HexAttribute.HEX_ATTR_THREAD_STATE, true);
        pluginGeneratedSerialDescriptor.j("infoObject", true);
        pluginGeneratedSerialDescriptor.j("amazonPayTransactionId", true);
        pluginGeneratedSerialDescriptor.j("paymentCode", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WebViewLastState$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.f26449b;
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a.p(jsonElementSerializer), a.p(jsonElementSerializer), a.p(a1Var), a.p(a1Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.model.WebViewLastState deserialize(kotlinx.serialization.encoding.Decoder r14) {
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
            if (r1 == 0) goto L_0x0032
            kotlinx.serialization.json.JsonElementSerializer r1 = kotlinx.serialization.json.JsonElementSerializer.f26449b
            java.lang.Object r5 = r14.s(r0, r5, r1, r4)
            java.lang.Object r1 = r14.s(r0, r6, r1, r4)
            gq0.a1 r6 = gq0.a1.f23069b
            java.lang.Object r3 = r14.s(r0, r3, r6, r4)
            java.lang.Object r2 = r14.s(r0, r2, r6, r4)
            r4 = 15
            r4 = r5
            r5 = 15
            goto L_0x007a
        L_0x0032:
            r1 = r4
            r7 = r1
            r8 = r7
            r9 = r8
            r4 = 0
            r10 = 1
        L_0x0038:
            if (r10 == 0) goto L_0x0075
            int r11 = r14.w(r0)
            r12 = -1
            if (r11 == r12) goto L_0x0073
            if (r11 == 0) goto L_0x006a
            if (r11 == r6) goto L_0x0061
            if (r11 == r3) goto L_0x0058
            if (r11 != r2) goto L_0x0052
            gq0.a1 r11 = gq0.a1.f23069b
            java.lang.Object r9 = r14.s(r0, r2, r11, r9)
            r4 = r4 | 8
            goto L_0x0038
        L_0x0052:
            kotlinx.serialization.UnknownFieldException r14 = new kotlinx.serialization.UnknownFieldException
            r14.<init>(r11)
            throw r14
        L_0x0058:
            gq0.a1 r11 = gq0.a1.f23069b
            java.lang.Object r8 = r14.s(r0, r3, r11, r8)
            r4 = r4 | 4
            goto L_0x0038
        L_0x0061:
            kotlinx.serialization.json.JsonElementSerializer r11 = kotlinx.serialization.json.JsonElementSerializer.f26449b
            java.lang.Object r7 = r14.s(r0, r6, r11, r7)
            r4 = r4 | 2
            goto L_0x0038
        L_0x006a:
            kotlinx.serialization.json.JsonElementSerializer r11 = kotlinx.serialization.json.JsonElementSerializer.f26449b
            java.lang.Object r1 = r14.s(r0, r5, r11, r1)
            r4 = r4 | 1
            goto L_0x0038
        L_0x0073:
            r10 = 0
            goto L_0x0038
        L_0x0075:
            r5 = r4
            r3 = r8
            r2 = r9
            r4 = r1
            r1 = r7
        L_0x007a:
            r14.c(r0)
            in.swiggy.android.swiggylynx.model.WebViewLastState r14 = new in.swiggy.android.swiggylynx.model.WebViewLastState
            r6 = r4
            kotlinx.serialization.json.JsonElement r6 = (kotlinx.serialization.json.JsonElement) r6
            r7 = r1
            kotlinx.serialization.json.JsonElement r7 = (kotlinx.serialization.json.JsonElement) r7
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            r10 = 0
            r4 = r14
            r4.<init>((int) r5, (kotlinx.serialization.json.JsonElement) r6, (kotlinx.serialization.json.JsonElement) r7, (java.lang.String) r8, (java.lang.String) r9, (gq0.x0) r10)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.model.WebViewLastState$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.model.WebViewLastState");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public WebViewLastState patch(Decoder decoder, WebViewLastState webViewLastState) {
        return (WebViewLastState) q.a.a(this, decoder, webViewLastState);
    }

    public void serialize(Encoder encoder, WebViewLastState webViewLastState) {
        p.j(encoder, "encoder");
        p.j(webViewLastState, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        WebViewLastState.f(webViewLastState, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
