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

/* compiled from: GetLinkWalletDataPayload.kt */
public final class GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19338a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19339b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19340c;

    /* renamed from: d  reason: collision with root package name */
    private final String f19341d;

    /* compiled from: GetLinkWalletDataPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload> serializer() {
            return GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload(int i11, String str, String str2, String str3, String str4, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19338a = str;
            if ((i11 & 2) != 0) {
                this.f19339b = str2;
                if ((i11 & 4) != 0) {
                    this.f19340c = str3;
                    if ((i11 & 8) != 0) {
                        this.f19341d = str4;
                        return;
                    }
                    throw new MissingFieldException("displayName");
                }
                throw new MissingFieldException("iconUrl");
            }
            throw new MissingFieldException("defaultMobileNumber");
        }
        throw new MissingFieldException("walletCode");
    }

    public static final void b(GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload getLinkWalletDataPayload$GetLinkWalletDataResponsePayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(getLinkWalletDataPayload$GetLinkWalletDataResponsePayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, getLinkWalletDataPayload$GetLinkWalletDataResponsePayload.f19338a);
        dVar.n(serialDescriptor, 1, getLinkWalletDataPayload$GetLinkWalletDataResponsePayload.f19339b);
        dVar.E(serialDescriptor, 2, a1.f23069b, getLinkWalletDataPayload$GetLinkWalletDataResponsePayload.f19340c);
        dVar.n(serialDescriptor, 3, getLinkWalletDataPayload$GetLinkWalletDataResponsePayload.f19341d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload)) {
            return false;
        }
        GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload getLinkWalletDataPayload$GetLinkWalletDataResponsePayload = (GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload) obj;
        return p.e(this.f19338a, getLinkWalletDataPayload$GetLinkWalletDataResponsePayload.f19338a) && p.e(this.f19339b, getLinkWalletDataPayload$GetLinkWalletDataResponsePayload.f19339b) && p.e(this.f19340c, getLinkWalletDataPayload$GetLinkWalletDataResponsePayload.f19340c) && p.e(this.f19341d, getLinkWalletDataPayload$GetLinkWalletDataResponsePayload.f19341d);
    }

    public int hashCode() {
        int hashCode = ((this.f19338a.hashCode() * 31) + this.f19339b.hashCode()) * 31;
        String str = this.f19340c;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f19341d.hashCode();
    }

    public String toString() {
        return "GetLinkWalletDataResponsePayload(code=" + this.f19338a + ", defaultNumber=" + this.f19339b + ", iconUrl=" + this.f19340c + ", displayName=" + this.f19341d + ')';
    }

    public GetLinkWalletDataPayload$GetLinkWalletDataResponsePayload(String str, String str2, String str3, String str4) {
        p.j(str, "code");
        p.j(str2, "defaultNumber");
        p.j(str4, "displayName");
        this.f19338a = str;
        this.f19339b = str2;
        this.f19340c = str3;
        this.f19341d = str4;
    }
}
