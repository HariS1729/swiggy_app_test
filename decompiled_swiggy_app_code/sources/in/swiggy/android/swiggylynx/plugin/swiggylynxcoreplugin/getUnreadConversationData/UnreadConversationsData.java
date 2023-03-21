package in.swiggy.android.swiggylynx.plugin.swiggylynxcoreplugin.getUnreadConversationData;

import fq0.d;
import gq0.a1;
import gq0.f0;
import gq0.h;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: UnreadConversationsData.kt */
public final class UnreadConversationsData {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19435a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19436b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19437c;

    /* renamed from: d  reason: collision with root package name */
    private final String f19438d;

    /* renamed from: e  reason: collision with root package name */
    private final Boolean f19439e;

    /* renamed from: f  reason: collision with root package name */
    private final Long f19440f;

    /* compiled from: UnreadConversationsData.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<UnreadConversationsData> serializer() {
            return UnreadConversationsData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UnreadConversationsData(int i11, String str, String str2, String str3, String str4, Boolean bool, Long l11, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.f19435a = null;
        } else {
            this.f19435a = str;
        }
        if ((i11 & 2) == 0) {
            this.f19436b = null;
        } else {
            this.f19436b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f19437c = null;
        } else {
            this.f19437c = str3;
        }
        if ((i11 & 8) == 0) {
            this.f19438d = null;
        } else {
            this.f19438d = str4;
        }
        if ((i11 & 16) != 0) {
            this.f19439e = bool;
            if ((i11 & 32) != 0) {
                this.f19440f = l11;
                return;
            }
            throw new MissingFieldException("updateAt");
        }
        throw new MissingFieldException("read");
    }

    public static final void a(UnreadConversationsData unreadConversationsData, d dVar, SerialDescriptor serialDescriptor) {
        p.j(unreadConversationsData, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || unreadConversationsData.f19435a != null) {
            dVar.E(serialDescriptor, 0, a1.f23069b, unreadConversationsData.f19435a);
        }
        if (dVar.o(serialDescriptor, 1) || unreadConversationsData.f19436b != null) {
            dVar.E(serialDescriptor, 1, a1.f23069b, unreadConversationsData.f19436b);
        }
        if (dVar.o(serialDescriptor, 2) || unreadConversationsData.f19437c != null) {
            dVar.E(serialDescriptor, 2, a1.f23069b, unreadConversationsData.f19437c);
        }
        if (dVar.o(serialDescriptor, 3) || unreadConversationsData.f19438d != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 3, a1.f23069b, unreadConversationsData.f19438d);
        }
        dVar.E(serialDescriptor, 4, h.f23089b, unreadConversationsData.f19439e);
        dVar.E(serialDescriptor, 5, f0.f23081b, unreadConversationsData.f19440f);
    }

    public UnreadConversationsData(String str, String str2, String str3, String str4, Boolean bool, Long l11) {
        this.f19435a = str;
        this.f19436b = str2;
        this.f19437c = str3;
        this.f19438d = str4;
        this.f19439e = bool;
        this.f19440f = l11;
    }
}
