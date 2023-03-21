package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getUnreadConversationData;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import dq0.a;
import fq0.d;
import gq0.a1;
import gq0.f0;
import gq0.h;
import gq0.q;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: UnreadConversationsData.kt */
public final class UnreadConversationsData$$serializer implements q<UnreadConversationsData> {
    public static final UnreadConversationsData$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        UnreadConversationsData$$serializer unreadConversationsData$$serializer = new UnreadConversationsData$$serializer();
        INSTANCE = unreadConversationsData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getUnreadConversationData.UnreadConversationsData", unreadConversationsData$$serializer, 6);
        pluginGeneratedSerialDescriptor.j(DistributedTracing.NR_ID_ATTRIBUTE, true);
        pluginGeneratedSerialDescriptor.j("avatarUrl", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("read", false);
        pluginGeneratedSerialDescriptor.j("updateAt", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UnreadConversationsData$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        a1 a1Var = a1.f23069b;
        return new KSerializer[]{a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(a1Var), a.p(h.f23089b), a.p(f0.f23081b)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getUnreadConversationData.UnreadConversationsData deserialize(kotlinx.serialization.encoding.Decoder r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.p.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r16.getDescriptor()
            fq0.c r0 = r0.b(r1)
            boolean r2 = r0.k()
            r3 = 5
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 0
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L_0x0041
            gq0.a1 r2 = gq0.a1.f23069b
            java.lang.Object r7 = r0.s(r1, r7, r2, r9)
            java.lang.Object r8 = r0.s(r1, r8, r2, r9)
            java.lang.Object r6 = r0.s(r1, r6, r2, r9)
            java.lang.Object r2 = r0.s(r1, r4, r2, r9)
            gq0.h r4 = gq0.h.f23089b
            java.lang.Object r4 = r0.s(r1, r5, r4, r9)
            gq0.f0 r5 = gq0.f0.f23081b
            java.lang.Object r3 = r0.s(r1, r3, r5, r9)
            r5 = 63
            r11 = r6
            r6 = 63
            goto L_0x009b
        L_0x0041:
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r2 = 0
            r15 = 1
        L_0x0048:
            if (r15 == 0) goto L_0x0095
            int r7 = r0.w(r1)
            switch(r7) {
                case -1: goto L_0x0090;
                case 0: goto L_0x0084;
                case 1: goto L_0x007b;
                case 2: goto L_0x0072;
                case 3: goto L_0x0069;
                case 4: goto L_0x0060;
                case 5: goto L_0x0057;
                default: goto L_0x0051;
            }
        L_0x0051:
            kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
            r0.<init>(r7)
            throw r0
        L_0x0057:
            gq0.f0 r7 = gq0.f0.f23081b
            java.lang.Object r14 = r0.s(r1, r3, r7, r14)
            r2 = r2 | 32
            goto L_0x008e
        L_0x0060:
            gq0.h r7 = gq0.h.f23089b
            java.lang.Object r13 = r0.s(r1, r5, r7, r13)
            r2 = r2 | 16
            goto L_0x008e
        L_0x0069:
            gq0.a1 r7 = gq0.a1.f23069b
            java.lang.Object r12 = r0.s(r1, r4, r7, r12)
            r2 = r2 | 8
            goto L_0x008e
        L_0x0072:
            gq0.a1 r7 = gq0.a1.f23069b
            java.lang.Object r11 = r0.s(r1, r6, r7, r11)
            r2 = r2 | 4
            goto L_0x008e
        L_0x007b:
            gq0.a1 r7 = gq0.a1.f23069b
            java.lang.Object r10 = r0.s(r1, r8, r7, r10)
            r2 = r2 | 2
            goto L_0x008e
        L_0x0084:
            gq0.a1 r7 = gq0.a1.f23069b
            r3 = 0
            java.lang.Object r9 = r0.s(r1, r3, r7, r9)
            r2 = r2 | 1
            r3 = 5
        L_0x008e:
            r7 = 0
            goto L_0x0048
        L_0x0090:
            r3 = 0
            r3 = 5
            r7 = 0
            r15 = 0
            goto L_0x0048
        L_0x0095:
            r6 = r2
            r7 = r9
            r8 = r10
            r2 = r12
            r4 = r13
            r3 = r14
        L_0x009b:
            r0.c(r1)
            in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getUnreadConversationData.UnreadConversationsData r0 = new in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getUnreadConversationData.UnreadConversationsData
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = (java.lang.String) r8
            r9 = r11
            java.lang.String r9 = (java.lang.String) r9
            r10 = r2
            java.lang.String r10 = (java.lang.String) r10
            r11 = r4
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            r12 = r3
            java.lang.Long r12 = (java.lang.Long) r12
            r13 = 0
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getUnreadConversationData.UnreadConversationsData$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getUnreadConversationData.UnreadConversationsData");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public UnreadConversationsData patch(Decoder decoder, UnreadConversationsData unreadConversationsData) {
        return (UnreadConversationsData) q.a.a(this, decoder, unreadConversationsData);
    }

    public void serialize(Encoder encoder, UnreadConversationsData unreadConversationsData) {
        p.j(encoder, "encoder");
        p.j(unreadConversationsData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        UnreadConversationsData.a(unreadConversationsData, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
