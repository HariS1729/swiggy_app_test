package in.swiggy.android.swiggylynx.plugin.payment.walletplugin;

import fq0.d;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: GetLinkedWalletDataPayload.kt */
public final class GetLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19342a;

    /* compiled from: GetLinkedWalletDataPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<GetLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload> serializer() {
            return GetLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload(int i11, String str, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19342a = str;
            return;
        }
        throw new MissingFieldException("walletCode");
    }

    public static final void c(GetLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload getLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(getLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, getLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload.f19342a);
    }

    public final String b() {
        return this.f19342a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload) && p.e(this.f19342a, ((GetLinkedWalletDataPayload$GetLinkedWalletDataRequestPayload) obj).f19342a);
    }

    public int hashCode() {
        return this.f19342a.hashCode();
    }

    public String toString() {
        return "GetLinkedWalletDataRequestPayload(walletCode=" + this.f19342a + ')';
    }
}
