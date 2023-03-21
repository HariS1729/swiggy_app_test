package in.swiggy.android.swiggylynx.plugin.payment.walletplugin;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: GetLinkWalletDataPayload.kt */
public final class GetLinkWalletDataPayload$GetLinkWalletDataRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19337a;

    /* compiled from: GetLinkWalletDataPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<GetLinkWalletDataPayload$GetLinkWalletDataRequestPayload> serializer() {
            return GetLinkWalletDataPayload$GetLinkWalletDataRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetLinkWalletDataPayload$GetLinkWalletDataRequestPayload(int i11, String str, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19337a = str;
            return;
        }
        throw new MissingFieldException("walletCode");
    }

    public static final void c(GetLinkWalletDataPayload$GetLinkWalletDataRequestPayload getLinkWalletDataPayload$GetLinkWalletDataRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(getLinkWalletDataPayload$GetLinkWalletDataRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, getLinkWalletDataPayload$GetLinkWalletDataRequestPayload.f19337a);
    }

    public final String b() {
        return this.f19337a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetLinkWalletDataPayload$GetLinkWalletDataRequestPayload) && p.e(this.f19337a, ((GetLinkWalletDataPayload$GetLinkWalletDataRequestPayload) obj).f19337a);
    }

    public int hashCode() {
        return this.f19337a.hashCode();
    }

    public String toString() {
        return "GetLinkWalletDataRequestPayload(code=" + this.f19337a + ')';
    }
}
