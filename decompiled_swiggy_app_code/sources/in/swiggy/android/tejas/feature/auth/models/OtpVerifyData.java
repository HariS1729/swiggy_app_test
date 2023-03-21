package in.swiggy.android.tejas.feature.auth.models;

import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import com.swiggy.tns.duplix.v1.CloningSignalsProto;
import kotlin.jvm.internal.p;

/* compiled from: OtpVerifyData.kt */
public final class OtpVerifyData {
    private final CloningSignalsProto.CloningSignals cloningSignals;
    private final String deviceManufacturer;
    private final String deviceModelName;
    private final String otp;
    private final String otpSource;

    public OtpVerifyData(CloningSignalsProto.CloningSignals cloningSignals2, String str, String str2, String str3, String str4) {
        p.j(cloningSignals2, "cloningSignals");
        p.j(str, "otp");
        p.j(str2, "otpSource");
        p.j(str3, AnalyticsAttribute.DEVICE_MANUFACTURER_ATTRIBUTE);
        p.j(str4, "deviceModelName");
        this.cloningSignals = cloningSignals2;
        this.otp = str;
        this.otpSource = str2;
        this.deviceManufacturer = str3;
        this.deviceModelName = str4;
    }

    public static /* synthetic */ OtpVerifyData copy$default(OtpVerifyData otpVerifyData, CloningSignalsProto.CloningSignals cloningSignals2, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cloningSignals2 = otpVerifyData.cloningSignals;
        }
        if ((i11 & 2) != 0) {
            str = otpVerifyData.otp;
        }
        String str5 = str;
        if ((i11 & 4) != 0) {
            str2 = otpVerifyData.otpSource;
        }
        String str6 = str2;
        if ((i11 & 8) != 0) {
            str3 = otpVerifyData.deviceManufacturer;
        }
        String str7 = str3;
        if ((i11 & 16) != 0) {
            str4 = otpVerifyData.deviceModelName;
        }
        return otpVerifyData.copy(cloningSignals2, str5, str6, str7, str4);
    }

    public final CloningSignalsProto.CloningSignals component1() {
        return this.cloningSignals;
    }

    public final String component2() {
        return this.otp;
    }

    public final String component3() {
        return this.otpSource;
    }

    public final String component4() {
        return this.deviceManufacturer;
    }

    public final String component5() {
        return this.deviceModelName;
    }

    public final OtpVerifyData copy(CloningSignalsProto.CloningSignals cloningSignals2, String str, String str2, String str3, String str4) {
        p.j(cloningSignals2, "cloningSignals");
        p.j(str, "otp");
        p.j(str2, "otpSource");
        p.j(str3, AnalyticsAttribute.DEVICE_MANUFACTURER_ATTRIBUTE);
        p.j(str4, "deviceModelName");
        return new OtpVerifyData(cloningSignals2, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtpVerifyData)) {
            return false;
        }
        OtpVerifyData otpVerifyData = (OtpVerifyData) obj;
        return p.e(this.cloningSignals, otpVerifyData.cloningSignals) && p.e(this.otp, otpVerifyData.otp) && p.e(this.otpSource, otpVerifyData.otpSource) && p.e(this.deviceManufacturer, otpVerifyData.deviceManufacturer) && p.e(this.deviceModelName, otpVerifyData.deviceModelName);
    }

    public final CloningSignalsProto.CloningSignals getCloningSignals() {
        return this.cloningSignals;
    }

    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    public final String getDeviceModelName() {
        return this.deviceModelName;
    }

    public final String getOtp() {
        return this.otp;
    }

    public final String getOtpSource() {
        return this.otpSource;
    }

    public int hashCode() {
        return (((((((this.cloningSignals.hashCode() * 31) + this.otp.hashCode()) * 31) + this.otpSource.hashCode()) * 31) + this.deviceManufacturer.hashCode()) * 31) + this.deviceModelName.hashCode();
    }

    public String toString() {
        return "OtpVerifyData(cloningSignals=" + this.cloningSignals + ", otp=" + this.otp + ", otpSource=" + this.otpSource + ", deviceManufacturer=" + this.deviceManufacturer + ", deviceModelName=" + this.deviceModelName + ')';
    }
}
