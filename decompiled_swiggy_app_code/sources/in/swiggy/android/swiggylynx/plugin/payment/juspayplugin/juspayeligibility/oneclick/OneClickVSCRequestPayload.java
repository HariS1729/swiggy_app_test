package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick;

import fq0.d;
import gq0.a1;
import gq0.x0;
import in.juspay.hyper.constants.LogCategory;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lp.b;

/* compiled from: OneClickVSCRequestPayload.kt */
public final class OneClickVSCRequestPayload extends b {
    public static final Companion Companion = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f19214a;

    /* renamed from: b  reason: collision with root package name */
    private final CardDetail f19215b;

    /* renamed from: c  reason: collision with root package name */
    private final String f19216c;

    /* compiled from: OneClickVSCRequestPayload.kt */
    public static final class CardDetail {
        public static final Companion Companion = new Companion((i) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f19217a;

        /* renamed from: b  reason: collision with root package name */
        private final String f19218b;

        /* renamed from: c  reason: collision with root package name */
        private final String f19219c;

        /* compiled from: OneClickVSCRequestPayload.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final KSerializer<CardDetail> serializer() {
                return OneClickVSCRequestPayload$CardDetail$$serializer.INSTANCE;
            }
        }

        public CardDetail() {
            this((String) null, (String) null, (String) null, 7, (i) null);
        }

        public /* synthetic */ CardDetail(int i11, String str, String str2, String str3, x0 x0Var) {
            if ((i11 & 1) == 0) {
                this.f19217a = null;
            } else {
                this.f19217a = str;
            }
            if ((i11 & 2) == 0) {
                this.f19218b = null;
            } else {
                this.f19218b = str2;
            }
            if ((i11 & 4) == 0) {
                this.f19219c = null;
            } else {
                this.f19219c = str3;
            }
        }

        public static final void d(CardDetail cardDetail, d dVar, SerialDescriptor serialDescriptor) {
            p.j(cardDetail, "self");
            p.j(dVar, "output");
            p.j(serialDescriptor, "serialDesc");
            boolean z11 = false;
            if (dVar.o(serialDescriptor, 0) || cardDetail.f19217a != null) {
                dVar.E(serialDescriptor, 0, a1.f23069b, cardDetail.f19217a);
            }
            if (dVar.o(serialDescriptor, 1) || cardDetail.f19218b != null) {
                dVar.E(serialDescriptor, 1, a1.f23069b, cardDetail.f19218b);
            }
            if (dVar.o(serialDescriptor, 2) || cardDetail.f19219c != null) {
                z11 = true;
            }
            if (z11) {
                dVar.E(serialDescriptor, 2, a1.f23069b, cardDetail.f19219c);
            }
        }

        public final String a() {
            return this.f19218b;
        }

        public final String b() {
            return this.f19217a;
        }

        public final String c() {
            return this.f19219c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardDetail)) {
                return false;
            }
            CardDetail cardDetail = (CardDetail) obj;
            return p.e(this.f19217a, cardDetail.f19217a) && p.e(this.f19218b, cardDetail.f19218b) && p.e(this.f19219c, cardDetail.f19219c);
        }

        public int hashCode() {
            String str = this.f19217a;
            int i11 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f19218b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f19219c;
            if (str3 != null) {
                i11 = str3.hashCode();
            }
            return hashCode2 + i11;
        }

        public String toString() {
            return "CardDetail(cardFingerPrint=" + this.f19217a + ", cardBin=" + this.f19218b + ", maskedCardNumber=" + this.f19219c + ')';
        }

        public CardDetail(String str, String str2, String str3) {
            this.f19217a = str;
            this.f19218b = str2;
            this.f19219c = str3;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CardDetail(String str, String str2, String str3, int i11, i iVar) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
        }
    }

    /* compiled from: OneClickVSCRequestPayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<OneClickVSCRequestPayload> serializer() {
            return OneClickVSCRequestPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OneClickVSCRequestPayload(int i11, String str, CardDetail cardDetail, String str2, x0 x0Var) {
        super(i11, x0Var);
        if ((i11 & 1) != 0) {
            this.f19214a = str;
            if ((i11 & 2) != 0) {
                this.f19215b = cardDetail;
                if ((i11 & 4) != 0) {
                    this.f19216c = str2;
                    return;
                }
                throw new MissingFieldException("juspayClientAuthToken");
            }
            throw new MissingFieldException("cardDetail");
        }
        throw new MissingFieldException(LogCategory.ACTION);
    }

    public static final void e(OneClickVSCRequestPayload oneClickVSCRequestPayload, d dVar, SerialDescriptor serialDescriptor) {
        p.j(oneClickVSCRequestPayload, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.n(serialDescriptor, 0, oneClickVSCRequestPayload.f19214a);
        dVar.v(serialDescriptor, 1, OneClickVSCRequestPayload$CardDetail$$serializer.INSTANCE, oneClickVSCRequestPayload.f19215b);
        dVar.n(serialDescriptor, 2, oneClickVSCRequestPayload.f19216c);
    }

    public final String b() {
        return this.f19214a;
    }

    public final CardDetail c() {
        return this.f19215b;
    }

    public final String d() {
        return this.f19216c;
    }
}
