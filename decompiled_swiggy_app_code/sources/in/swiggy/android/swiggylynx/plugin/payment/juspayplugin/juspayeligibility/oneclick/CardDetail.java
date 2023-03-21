package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick;

import fq0.d;
import gq0.a1;
import gq0.f;
import gq0.x0;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: OneClickEligibilityRequestPayload.kt */
public final class CardDetail {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19200a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19201b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f19202c;

    /* compiled from: OneClickEligibilityRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<CardDetail> serializer() {
            return CardDetail$$serializer.INSTANCE;
        }
    }

    public CardDetail() {
        this((String) null, (String) null, (List) null, 7, (i) null);
    }

    public /* synthetic */ CardDetail(int i11, String str, String str2, List list, x0 x0Var) {
        if ((i11 & 1) == 0) {
            this.f19200a = null;
        } else {
            this.f19200a = str;
        }
        if ((i11 & 2) == 0) {
            this.f19201b = null;
        } else {
            this.f19201b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f19202c = null;
        } else {
            this.f19202c = list;
        }
    }

    public static final void d(CardDetail cardDetail, d dVar, SerialDescriptor serialDescriptor) {
        p.j(cardDetail, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        boolean z11 = false;
        if (dVar.o(serialDescriptor, 0) || cardDetail.f19200a != null) {
            dVar.E(serialDescriptor, 0, a1.f23069b, cardDetail.f19200a);
        }
        if (dVar.o(serialDescriptor, 1) || cardDetail.f19201b != null) {
            dVar.E(serialDescriptor, 1, a1.f23069b, cardDetail.f19201b);
        }
        if (dVar.o(serialDescriptor, 2) || cardDetail.f19202c != null) {
            z11 = true;
        }
        if (z11) {
            dVar.E(serialDescriptor, 2, new f(a1.f23069b), cardDetail.f19202c);
        }
    }

    public final String a() {
        return this.f19200a;
    }

    public final String b() {
        return this.f19201b;
    }

    public final List<String> c() {
        return this.f19202c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardDetail)) {
            return false;
        }
        CardDetail cardDetail = (CardDetail) obj;
        return p.e(this.f19200a, cardDetail.f19200a) && p.e(this.f19201b, cardDetail.f19201b) && p.e(this.f19202c, cardDetail.f19202c);
    }

    public int hashCode() {
        String str = this.f19200a;
        int i11 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19201b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.f19202c;
        if (list != null) {
            i11 = list.hashCode();
        }
        return hashCode2 + i11;
    }

    public String toString() {
        return "CardDetail(cardAlias=" + this.f19200a + ", cardBin=" + this.f19201b + ", checkType=" + this.f19202c + ')';
    }

    public CardDetail(String str, String str2, List<String> list) {
        this.f19200a = str;
        this.f19201b = str2;
        this.f19202c = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardDetail(String str, String str2, List list, int i11, i iVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : list);
    }
}
