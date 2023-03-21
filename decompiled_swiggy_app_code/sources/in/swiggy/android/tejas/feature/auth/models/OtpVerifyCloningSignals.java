package in.swiggy.android.tejas.feature.auth.models;

import kotlin.jvm.internal.p;

/* compiled from: OtpVerifyData.kt */
public final class OtpVerifyCloningSignals {
    private final boolean appFilesDirPathInvalid;
    private final boolean developerModeEnabled;
    private final boolean deviceModelVmos;
    private final boolean emulatorStatus;
    private final String packageName;
    private final boolean workProfileEnabled;

    public OtpVerifyCloningSignals(boolean z11, boolean z12, boolean z13, boolean z14, String str, boolean z15) {
        p.j(str, "packageName");
        this.appFilesDirPathInvalid = z11;
        this.workProfileEnabled = z12;
        this.deviceModelVmos = z13;
        this.developerModeEnabled = z14;
        this.packageName = str;
        this.emulatorStatus = z15;
    }

    public static /* synthetic */ OtpVerifyCloningSignals copy$default(OtpVerifyCloningSignals otpVerifyCloningSignals, boolean z11, boolean z12, boolean z13, boolean z14, String str, boolean z15, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = otpVerifyCloningSignals.appFilesDirPathInvalid;
        }
        if ((i11 & 2) != 0) {
            z12 = otpVerifyCloningSignals.workProfileEnabled;
        }
        boolean z16 = z12;
        if ((i11 & 4) != 0) {
            z13 = otpVerifyCloningSignals.deviceModelVmos;
        }
        boolean z17 = z13;
        if ((i11 & 8) != 0) {
            z14 = otpVerifyCloningSignals.developerModeEnabled;
        }
        boolean z18 = z14;
        if ((i11 & 16) != 0) {
            str = otpVerifyCloningSignals.packageName;
        }
        String str2 = str;
        if ((i11 & 32) != 0) {
            z15 = otpVerifyCloningSignals.emulatorStatus;
        }
        return otpVerifyCloningSignals.copy(z11, z16, z17, z18, str2, z15);
    }

    public final boolean component1() {
        return this.appFilesDirPathInvalid;
    }

    public final boolean component2() {
        return this.workProfileEnabled;
    }

    public final boolean component3() {
        return this.deviceModelVmos;
    }

    public final boolean component4() {
        return this.developerModeEnabled;
    }

    public final String component5() {
        return this.packageName;
    }

    public final boolean component6() {
        return this.emulatorStatus;
    }

    public final OtpVerifyCloningSignals copy(boolean z11, boolean z12, boolean z13, boolean z14, String str, boolean z15) {
        p.j(str, "packageName");
        return new OtpVerifyCloningSignals(z11, z12, z13, z14, str, z15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtpVerifyCloningSignals)) {
            return false;
        }
        OtpVerifyCloningSignals otpVerifyCloningSignals = (OtpVerifyCloningSignals) obj;
        return this.appFilesDirPathInvalid == otpVerifyCloningSignals.appFilesDirPathInvalid && this.workProfileEnabled == otpVerifyCloningSignals.workProfileEnabled && this.deviceModelVmos == otpVerifyCloningSignals.deviceModelVmos && this.developerModeEnabled == otpVerifyCloningSignals.developerModeEnabled && p.e(this.packageName, otpVerifyCloningSignals.packageName) && this.emulatorStatus == otpVerifyCloningSignals.emulatorStatus;
    }

    public final boolean getAppFilesDirPathInvalid() {
        return this.appFilesDirPathInvalid;
    }

    public final boolean getDeveloperModeEnabled() {
        return this.developerModeEnabled;
    }

    public final boolean getDeviceModelVmos() {
        return this.deviceModelVmos;
    }

    public final boolean getEmulatorStatus() {
        return this.emulatorStatus;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final boolean getWorkProfileEnabled() {
        return this.workProfileEnabled;
    }

    public int hashCode() {
        boolean z11 = this.appFilesDirPathInvalid;
        boolean z12 = true;
        if (z11) {
            z11 = true;
        }
        int i11 = (z11 ? 1 : 0) * true;
        boolean z13 = this.workProfileEnabled;
        if (z13) {
            z13 = true;
        }
        int i12 = (i11 + (z13 ? 1 : 0)) * 31;
        boolean z14 = this.deviceModelVmos;
        if (z14) {
            z14 = true;
        }
        int i13 = (i12 + (z14 ? 1 : 0)) * 31;
        boolean z15 = this.developerModeEnabled;
        if (z15) {
            z15 = true;
        }
        int hashCode = (((i13 + (z15 ? 1 : 0)) * 31) + this.packageName.hashCode()) * 31;
        boolean z16 = this.emulatorStatus;
        if (!z16) {
            z12 = z16;
        }
        return hashCode + (z12 ? 1 : 0);
    }

    public String toString() {
        return "OtpVerifyCloningSignals(appFilesDirPathInvalid=" + this.appFilesDirPathInvalid + ", workProfileEnabled=" + this.workProfileEnabled + ", deviceModelVmos=" + this.deviceModelVmos + ", developerModeEnabled=" + this.developerModeEnabled + ", packageName=" + this.packageName + ", emulatorStatus=" + this.emulatorStatus + ')';
    }
}
