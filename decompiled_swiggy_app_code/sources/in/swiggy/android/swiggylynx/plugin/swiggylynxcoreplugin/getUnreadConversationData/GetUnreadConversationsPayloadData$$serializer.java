package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getUnreadConversationData;

import dq0.a;
import fq0.c;
import fq0.d;
import gq0.f;
import gq0.q;
import gq0.x0;
import java.util.List;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: GetUnreadConversationsPayloadData.kt */
public final class GetUnreadConversationsPayloadData$$serializer implements q<GetUnreadConversationsPayloadData> {
    public static final GetUnreadConversationsPayloadData$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        GetUnreadConversationsPayloadData$$serializer getUnreadConversationsPayloadData$$serializer = new GetUnreadConversationsPayloadData$$serializer();
        INSTANCE = getUnreadConversationsPayloadData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getUnreadConversationData.GetUnreadConversationsPayloadData", getUnreadConversationsPayloadData$$serializer, 1);
        pluginGeneratedSerialDescriptor.j("conversations", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GetUnreadConversationsPayloadData$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.p(new f(UnreadConversationsData$$serializer.INSTANCE))};
    }

    public GetUnreadConversationsPayloadData deserialize(Decoder decoder) {
        Object obj;
        p.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.k()) {
            obj = b11.s(descriptor2, 0, new f(UnreadConversationsData$$serializer.INSTANCE), null);
        } else {
            obj = null;
            int i12 = 0;
            while (i11 != 0) {
                int w11 = b11.w(descriptor2);
                if (w11 == -1) {
                    i11 = 0;
                } else if (w11 == 0) {
                    obj = b11.s(descriptor2, 0, new f(UnreadConversationsData$$serializer.INSTANCE), obj);
                    i12 |= 1;
                } else {
                    throw new UnknownFieldException(w11);
                }
            }
            i11 = i12;
        }
        b11.c(descriptor2);
        return new GetUnreadConversationsPayloadData(i11, (List) obj, (x0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public GetUnreadConversationsPayloadData patch(Decoder decoder, GetUnreadConversationsPayloadData getUnreadConversationsPayloadData) {
        return (GetUnreadConversationsPayloadData) q.a.a(this, decoder, getUnreadConversationsPayloadData);
    }

    public void serialize(Encoder encoder, GetUnreadConversationsPayloadData getUnreadConversationsPayloadData) {
        p.j(encoder, "encoder");
        p.j(getUnreadConversationsPayloadData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        GetUnreadConversationsPayloadData.a(getUnreadConversationsPayloadData, b11, descriptor2);
        b11.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return q.a.b(this);
    }
}
