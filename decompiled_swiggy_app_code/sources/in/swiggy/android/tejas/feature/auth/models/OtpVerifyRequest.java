package in.swiggy.android.tejas.feature.auth.models;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.p;

/* compiled from: OtpVerifyData.kt */
public final class OtpVerifyRequest {
    @SerializedName("cloningSignalsData")
    private final OtpVerifyCloningSignals cloningSignals;
    private final String otp;

    public OtpVerifyRequest(String str, OtpVerifyCloningSignals otpVerifyCloningSignals) {
        p.j(str, "otp");
        p.j(otpVerifyCloningSignals, "cloningSignals");
        this.otp = str;
        this.cloningSignals = otpVerifyCloningSignals;
    }

    public static /* synthetic */ OtpVerifyRequest copy$default(OtpVerifyRequest otpVerifyRequest, String str, OtpVerifyCloningSignals otpVerifyCloningSignals, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = otpVerifyRequest.otp;
        }
        if ((i11 & 2) != 0) {
            otpVerifyCloningSignals = otpVerifyRequest.cloningSignals;
        }
        return otpVerifyRequest.copy(str, otpVerifyCloningSignals);
    }

    public final String component1() {
        return this.otp;
    }

    public final OtpVerifyCloningSignals component2() {
        return this.cloningSignals;
    }

    public final OtpVerifyRequest copy(String str, OtpVerifyCloningSignals otpVerifyCloningSignals) {
        p.j(str, "otp");
        p.j(otpVerifyCloningSignals, "cloningSignals");
        return new OtpVerifyRequest(str, otpVerifyCloningSignals);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtpVerifyRequest)) {
            return false;
        }
        OtpVerifyRequest otpVerifyRequest = (OtpVerifyRequest) obj;
        return p.e(this.otp, otpVerifyRequest.otp) && p.e(this.cloningSignals, otpVerifyRequest.cloningSignals);
    }

    public final OtpVerifyCloningSignals getCloningSignals() {
        return this.cloningSignals;
    }

    public final String getOtp() {
        return this.otp;
    }

    public int hashCode() {
        return (this.otp.hashCode() * 31) + this.cloningSignals.hashCode();
    }

    public String toString() {
        return "OtpVerifyRequest(otp=" + this.otp + ", cloningSignals=" + this.cloningSignals + ')';
    }
}
