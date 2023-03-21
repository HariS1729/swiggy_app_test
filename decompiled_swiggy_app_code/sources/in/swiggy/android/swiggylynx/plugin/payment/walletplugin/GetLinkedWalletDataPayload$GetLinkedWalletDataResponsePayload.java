package in.swiggy.android.swiggylynx.plugin.payment.walletplugin;

import fq0.d;
import gq0.a1;
import gq0.x0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: GetLinkedWalletDataPayload.kt */
public final class GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19343a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19344b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19345c;

    /* renamed from: d  reason: collision with root package name */
    private final String f19346d;

    /* compiled from: GetLinkedWalletDataPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload> serializer() {
            return GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload(int i11, String str, String str2, String str3, String str4, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19343a = str;
            if ((i11 & 2) != 0) {
                this.f19344b = str2;
                if ((i11 & 4) != 0) {
                    this.f19345c = str3;
                    if ((i11 & 8) == 0) {
                        this.f19346d = "";
                    } else {
                        this.f19346d = str4;
                    }
                } else {
                    throw new MissingFieldException("mobileNumber");
                }
            } else {
                throw new MissingFieldException("balance");
            }
        } else {
            throw new MissingFieldException("displayName");
        }
    }

    public static final void b(GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload getLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(getLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        dVar.n(serialDescriptor, 0, getLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload.f19343a);
        dVar.n(serialDescriptor, 1, getLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload.f19344b);
        dVar.n(serialDescriptor, 2, getLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload.f19345c);
        if (dVar.o(serialDescriptor, 3) || !p.e(getLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload.f19346d, "")) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 3, a1.f23069b, getLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload.f19346d);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload)) {
            return false;
        }
        GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload getLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload = (GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload) obj;
        return p.e(this.f19343a, getLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload.f19343a) && p.e(this.f19344b, getLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload.f19344b) && p.e(this.f19345c, getLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload.f19345c) && p.e(this.f19346d, getLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload.f19346d);
    }

    public int hashCode() {
        int hashCode = ((((this.f19343a.hashCode() * 31) + this.f19344b.hashCode()) * 31) + this.f19345c.hashCode()) * 31;
        String str = this.f19346d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "GetLinkedWalletDataResponsePayload(displayName=" + this.f19343a + ", balance=" + this.f19344b + ", mobileNumber=" + this.f19345c + ", iconUrl=" + this.f19346d + ')';
    }

    public GetLinkedWalletDataPayload$GetLinkedWalletDataResponsePayload(String str, String str2, String str3, String str4) {
        p.j(str, "displayName");
        p.j(str2, "balance");
        p.j(str3, "mobileNumber");
        this.f19343a = str;
        this.f19344b = str2;
        this.f19345c = str3;
        this.f19346d = str4;
    }
}
