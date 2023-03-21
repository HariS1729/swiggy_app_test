package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getUnreadConversationData;

import fq0.d;
import gq0.f;
import gq0.x0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: GetUnreadConversationsPayloadData.kt */
public final class GetUnreadConversationsPayloadData {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final List<UnreadConversationsData> f19434a;

    /* compiled from: GetUnreadConversationsPayloadData.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<GetUnreadConversationsPayloadData> serializer() {
            return GetUnreadConversationsPayloadData$$serializer.INSTANCE;
        }
    }

    public GetUnreadConversationsPayloadData() {
        this((List) null, 1, (i) null);
    }

    public /* synthetic */ GetUnreadConversationsPayloadData(int i11, List list, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.f19434a = new ArrayList();
        } else {
            this.f19434a = list;
        }
    }

    public static final void a(GetUnreadConversationsPayloadData getUnreadConversationsPayloadData, d dVar, SerialDescriptor serialDescriptor) {
        p.j(getUnreadConversationsPayloadData, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = true;
        if (!dVar.o(serialDescriptor, 0) && p.e(getUnreadConversationsPayloadData.f19434a, new ArrayList())) {
            z11 = false;
        }
        if (z11) {
            dVar.E(serialDescriptor, 0, new f(UnreadConversationsData$$serializer.INSTANCE), getUnreadConversationsPayloadData.f19434a);
        }
    }

    public GetUnreadConversationsPayloadData(List<UnreadConversationsData> list) {
        this.f19434a = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetUnreadConversationsPayloadData(List list, int i11, i iVar) {
        this((i11 & 1) != 0 ? new ArrayList() : list);
    }
}
