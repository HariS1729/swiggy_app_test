package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.navigatetoscreen;

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

/* compiled from: NavigateToScreenRequestPayload.kt */
public final class NavigateToScreenRequestPayload$$serializer implements q<NavigateToScreenRequestPayload> {
    public static final NavigateToScreenRequestPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        NavigateToScreenRequestPayload$$serializer navigateToScreenRequestPayload$$serializer = new NavigateToScreenRequestPayload$$serializer();
        INSTANCE = navigateToScreenRequestPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.navigatetoscreen.NavigateToScreenRequestPayload", navigateToScreenRequestPayload$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("link", false);
        pluginGeneratedSerialDescriptor.j("params", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NavigateToScreenRequestPayload$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a1Var, a1Var, JsonElementSerializer.f26449b};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.navigatetoscreen.NavigateToScreenRequestPayload deserialize(kotlinx.serialization.encoding.Decoder r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r16.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r3 = 0
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x002c
            java.lang.String r2 = r0.j(r1, r5)
            java.lang.String r5 = r0.j(r1, r6)
            kotlinx.serialization.json.JsonElementSerializer r6 = kotlinx.serialization.json.JsonElementSerializer.f26449b
            java.lang.Object r3 = r0.o(r1, r4, r6, r3)
            r4 = 7
            r12 = r2
            r13 = r5
            r11 = 7
            goto L_0x0062
        L_0x002c:
            r2 = r3
            r7 = r2
            r8 = 0
            r9 = 1
        L_0x0030:
            if (r9 == 0) goto L_0x005e
            int r10 = r0.w(r1)
            r11 = -1
            if (r10 == r11) goto L_0x005c
            if (r10 == 0) goto L_0x0055
            if (r10 == r6) goto L_0x004e
            if (r10 != r4) goto L_0x0048
            kotlinx.serialization.json.JsonElementSerializer r10 = kotlinx.serialization.json.JsonElementSerializer.f26449b
            java.lang.Object r7 = r0.o(r1, r4, r10, r7)
            r8 = r8 | 4
            goto L_0x0030
        L_0x0048:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r10)
            throw r0
        L_0x004e:
            java.lang.String r2 = r0.j(r1, r6)
            r8 = r8 | 2
            goto L_0x0030
        L_0x0055:
            java.lang.String r3 = r0.j(r1, r5)
            r8 = r8 | 1
            goto L_0x0030
        L_0x005c:
            r9 = 0
            goto L_0x0030
        L_0x005e:
            r13 = r2
            r12 = r3
            r3 = r7
            r11 = r8
        L_0x0062:
            r0.c(r1)
            in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.navigatetoscreen.NavigateToScreenRequestPayload r0 = new in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.navigatetoscreen.NavigateToScreenRequestPayload
            r14 = r3
            kotlinx.serialization.json.JsonElement r14 = (kotlinx.serialization.json.JsonElement) r14
            r15 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.navigatetoscreen.NavigateToScreenRequestPayload$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.navigatetoscreen.NavigateToScreenRequestPayload");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public NavigateToScreenRequestPayload patch(Decoder decoder, NavigateToScreenRequestPayload navigateToScreenRequestPayload) {
        return (NavigateToScreenRequestPayload) q.a.a(this, decoder, navigateToScreenRequestPayload);
    }

    public void serialize(Encoder encoder, NavigateToScreenRequestPayload navigateToScreenRequestPayload) {
        p.j(encoder, "encoder");
        p.j(navigateToScreenRequestPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        NavigateToScreenRequestPayload.e(navigateToScreenRequestPayload, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
