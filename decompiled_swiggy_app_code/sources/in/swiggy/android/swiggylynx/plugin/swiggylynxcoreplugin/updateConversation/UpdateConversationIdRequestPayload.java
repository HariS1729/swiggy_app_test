package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.updateConversation;

import fq0.d;
import gq0.x0;
import in.swiggy.android.tejas.feature.trackv3.responsedatatypes.NbaMetaDataType;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: UpdateConversationIdRequestPayload.kt */
public final class UpdateConversationIdRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19497a;

    /* compiled from: UpdateConversationIdRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<UpdateConversationIdRequestPayload> serializer() {
            return UpdateConversationIdRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UpdateConversationIdRequestPayload(int i11, String str, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19497a = str;
            return;
        }
        throw new MissingFieldException(NbaMetaDataType.CONVERSATION_ID);
    }

    public static final void c(UpdateConversationIdRequestPayload updateConversationIdRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(updateConversationIdRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, updateConversationIdRequestPayload.f19497a);
    }

    public final String b() {
        return this.f19497a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateConversationIdRequestPayload) && p.e(this.f19497a, ((UpdateConversationIdRequestPayload) obj).f19497a);
    }

    public int hashCode() {
        return this.f19497a.hashCode();
    }

    public String toString() {
        return "UpdateConversationIdRequestPayload(conversationId=" + this.f19497a + ')';
    }
}
