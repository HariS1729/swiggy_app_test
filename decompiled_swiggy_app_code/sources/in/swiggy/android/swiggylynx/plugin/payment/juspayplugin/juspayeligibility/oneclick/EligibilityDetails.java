package in.swiggy.android.swiggylynx.plugin.payment.juspayplugin.juspayeligibility.oneclick;

import com.google.gson.annotations.SerializedName;
import fq0.d;
import gq0.a1;
import gq0.h;
import gq0.x0;
import in.swiggy.android.tejas.payment.model.juspay.request.JuspayActionTypesKt;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: OneClickEligibilityResponsePayload.kt */
public final class EligibilityDetails {
    public static final Companion Companion = new Companion((i) null);
    @SerializedName("checkType")

    /* renamed from: a  reason: collision with root package name */
    private final CheckType f19203a;
    @SerializedName("cardBin")

    /* renamed from: b  reason: collision with root package name */
    private final String f19204b;
    @SerializedName("CardFingerPrint")

    /* renamed from: c  reason: collision with root package name */
    private final String f19205c;

    /* compiled from: OneClickEligibilityResponsePayload.kt */
    public static final class CheckType {
        public static final Companion Companion = new Companion((i) null);
        @SerializedName("vies")

        /* renamed from: a  reason: collision with root package name */
        private final ViesCheckType f19206a;

        /* compiled from: OneClickEligibilityResponsePayload.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final KSerializer<CheckType> serializer() {
                return EligibilityDetails$CheckType$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ CheckType(int i11, ViesCheckType viesCheckType, x0 x0Var) {
            if ((i11 & 1) != 0) {
                this.f19206a = viesCheckType;
                return;
            }
            throw new MissingFieldException("vies");
        }

        public static final void a(CheckType checkType, d dVar, SerialDescriptor serialDescriptor) {
            p.j(checkType, "self");
            p.j(dVar, "output");
            p.j(serialDescriptor, "serialDesc");
            dVar.E(serialDescriptor, 0, EligibilityDetails$ViesCheckType$$serializer.INSTANCE, checkType.f19206a);
        }

        public CheckType(ViesCheckType viesCheckType) {
            this.f19206a = viesCheckType;
        }
    }

    /* compiled from: OneClickEligibilityResponsePayload.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final KSerializer<EligibilityDetails> serializer() {
            return EligibilityDetails$$serializer.INSTANCE;
        }
    }

    /* compiled from: OneClickEligibilityResponsePayload.kt */
    public static final class ViesCheckType {
        public static final Companion Companion = new Companion((i) null);
        @SerializedName("responseMsg")

        /* renamed from: a  reason: collision with root package name */
        private final String f19207a;
        @SerializedName("expired")

        /* renamed from: b  reason: collision with root package name */
        private final Boolean f19208b;
        @SerializedName("enrolled")

        /* renamed from: c  reason: collision with root package name */
        private final Boolean f19209c;
        @SerializedName("eligibility")

        /* renamed from: d  reason: collision with root package name */
        private final Boolean f19210d;

        /* compiled from: OneClickEligibilityResponsePayload.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final KSerializer<ViesCheckType> serializer() {
                return EligibilityDetails$ViesCheckType$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ViesCheckType(int i11, String str, Boolean bool, Boolean bool2, Boolean bool3, x0 x0Var) {
            if ((i11 & 1) != 0) {
                this.f19207a = str;
                if ((i11 & 2) != 0) {
                    this.f19208b = bool;
                    if ((i11 & 4) != 0) {
                        this.f19209c = bool2;
                        if ((i11 & 8) != 0) {
                            this.f19210d = bool3;
                            return;
                        }
                        throw new MissingFieldException(JuspayActionTypesKt.ELIGIBILITY);
                    }
                    throw new MissingFieldException("enrolled");
                }
                throw new MissingFieldException("expired");
            }
            throw new MissingFieldException("responseMsg");
        }

        public static final void a(ViesCheckType viesCheckType, d dVar, SerialDescriptor serialDescriptor) {
            p.j(viesCheckType, "self");
            p.j(dVar, "output");
            p.j(serialDescriptor, "serialDesc");
            dVar.E(serialDescriptor, 0, a1.f23069b, viesCheckType.f19207a);
            h hVar = h.f23089b;
            dVar.E(serialDescriptor, 1, hVar, viesCheckType.f19208b);
            dVar.E(serialDescriptor, 2, hVar, viesCheckType.f19209c);
            dVar.E(serialDescriptor, 3, hVar, viesCheckType.f19210d);
        }

        public ViesCheckType(String str, Boolean bool, Boolean bool2, Boolean bool3) {
            this.f19207a = str;
            this.f19208b = bool;
            this.f19209c = bool2;
            this.f19210d = bool3;
        }
    }

    public /* synthetic */ EligibilityDetails(int i11, CheckType checkType, String str, String str2, x0 x0Var) {
        if ((i11 & 1) != 0) {
            this.f19203a = checkType;
            if ((i11 & 2) != 0) {
                this.f19204b = str;
                if ((i11 & 4) != 0) {
                    this.f19205c = str2;
                    return;
                }
                throw new MissingFieldException("cardAlias");
            }
            throw new MissingFieldException("cardBin");
        }
        throw new MissingFieldException("checkType");
    }

    public static final void a(EligibilityDetails eligibilityDetails, d dVar, SerialDescriptor serialDescriptor) {
        p.j(eligibilityDetails, "self");
        p.j(dVar, "output");
        p.j(serialDescriptor, "serialDesc");
        dVar.v(serialDescriptor, 0, EligibilityDetails$CheckType$$serializer.INSTANCE, eligibilityDetails.f19203a);
        a1 a1Var = a1.f23069b;
        dVar.E(serialDescriptor, 1, a1Var, eligibilityDetails.f19204b);
        dVar.E(serialDescriptor, 2, a1Var, eligibilityDetails.f19205c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EligibilityDetails)) {
            return false;
        }
        EligibilityDetails eligibilityDetails = (EligibilityDetails) obj;
        return p.e(this.f19203a, eligibilityDetails.f19203a) && p.e(this.f19204b, eligibilityDetails.f19204b) && p.e(this.f19205c, eligibilityDetails.f19205c);
    }

    public int hashCode() {
        int hashCode = this.f19203a.hashCode() * 31;
        String str = this.f19204b;
        int i11 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19205c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return hashCode2 + i11;
    }

    public String toString() {
        return "EligibilityDetails(checkType=" + this.f19203a + ", cardBin=" + this.f19204b + ", cardAlias=" + this.f19205c + ')';
    }

    public EligibilityDetails(CheckType checkType, String str, String str2) {
        p.j(checkType, "checkType");
        this.f19203a = checkType;
        this.f19204b = str;
        this.f19205c = str2;
    }
}
