package in.swiggy.android.tejas.feature.fingerprint;

import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.agentdata.HexAttribute;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import com.truecaller.android.sdk.TruecallerSdkScope;
import in.juspay.hypersdk.core.PaymentConstants;
import in.swiggy.android.tejas.feature.dataplatform.model.MessageEvent;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import okhttp3.internal.http2.Http2Connection;
import org.apache.pdfbox.pdmodel.interactive.form.PDButton;
import org.apache.pdfbox.pdmodel.interactive.form.PDChoice;

/* compiled from: PostableDeviceFingerprint.kt */
public final class PostableDeviceFingerprint extends MessageEvent {
    @SerializedName("android_id")
    private final String androidId;
    @SerializedName("android_version")
    private final String androidVersion;
    @SerializedName("app_files_dir_path")
    private final String appFilesDirPath;
    @SerializedName("app_files_dir_path_invalid")
    private final boolean appFilesDirPathInvalid;
    @SerializedName("app_version")
    private final String appVersion;
    @SerializedName("build_display_id")
    private final String buildDisplayId;
    @SerializedName("build_fingerprint")
    private final String buildFingerprint;
    @SerializedName("cpu_hardware")
    private final String cpuHardware;
    @SerializedName("cpu_processor")
    private final String cpuProcessor;
    @SerializedName("de_app_installed")
    private final boolean deAppInstalled;
    @SerializedName("developer_mode_enabled")
    private final boolean developerModeEnabled;
    @SerializedName("device_model_vmos")
    private final boolean deviceModelVmos;
    @SerializedName("google_advertiser_id")
    private final String googleAdvertiserId;
    @SerializedName("play_integrity_api_error_code")
    private final String integrityApiError;
    @SerializedName("play_integrity_api_response")
    private final String integrityApiResponse;
    @SerializedName("internal_storage")
    private final String internalStorage;
    @SerializedName("ip_address")
    private final String ipAddress;
    @SerializedName("emulator_status")
    private final boolean isEmulator;
    @SerializedName("kernel_architecture")
    private final String kernelArchitecture;
    @SerializedName("kernel_name")
    private final String kernelName;
    @SerializedName("kernel_version")
    private final String kernelVersion;
    @SerializedName("local_language")
    private final String localLanguage;
    @SerializedName("local_timezone")
    private final String localTimezone;
    @SerializedName("manufacturer_name")
    private final String manufacturerName;
    @SerializedName("memory_information")
    private final String memoryInformation;
    @SerializedName("model_name")
    private final String modelName;
    @SerializedName("package_name")
    private final String packageName;
    @SerializedName("permission_location")
    private final boolean permissionLocation;
    @SerializedName("primary_carrier")
    private final String primaryCarrier;
    @SerializedName("profiles")
    private final String profiles;
    @SerializedName("root_status")
    private final boolean rootStatus;
    @SerializedName("screen_density")
    private final int screenDensity;
    @SerializedName("screen_resolution_height")
    private final int screenResolutionHeight;
    @SerializedName("screen_resolution_width")
    private final int screenResolutionWidth;
    @SerializedName("session_id")
    private final String sessionId;
    @SerializedName("signature")
    private final String signature;
    @SerializedName("user_id")
    private final String userId;
    @SerializedName("wifi_mac_address")
    private final String wifiMacAddress;
    @SerializedName("wifi_ssid")
    private final String wifiSSID;
    @SerializedName("work_profile_enabled")
    private final boolean workProfileEnabled;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PostableDeviceFingerprint(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z11, String str9, String str10, String str11, String str12, boolean z12, String str13, String str14, String str15, String str16, String str17, int i11, int i12, int i13, String str18, String str19, boolean z13, String str20, String str21, String str22, String str23, boolean z14, String str24, String str25, boolean z15, boolean z16, boolean z17, String str26, String str27, boolean z18, String str28, String str29, int i14, int i15, i iVar) {
        this(str, str2, str3, str4, str5, (i14 & 32) != 0 ? null : str6, str7, str8, z11, str9, str10, str11, str12, z12, str13, str14, str15, str16, str17, i11, i12, i13, str18, str19, z13, (i14 & PDButton.FLAG_RADIOS_IN_UNISON) != 0 ? null : str20, (i14 & 67108864) != 0 ? null : str21, (i14 & 134217728) != 0 ? null : str22, (i14 & 268435456) != 0 ? null : str23, z14, str24, str25, z15, z16, z17, str26, str27, z18, str28, str29);
    }

    public static /* synthetic */ PostableDeviceFingerprint copy$default(PostableDeviceFingerprint postableDeviceFingerprint, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z11, String str9, String str10, String str11, String str12, boolean z12, String str13, String str14, String str15, String str16, String str17, int i11, int i12, int i13, String str18, String str19, boolean z13, String str20, String str21, String str22, String str23, boolean z14, String str24, String str25, boolean z15, boolean z16, boolean z17, String str26, String str27, boolean z18, String str28, String str29, int i14, int i15, Object obj) {
        PostableDeviceFingerprint postableDeviceFingerprint2 = postableDeviceFingerprint;
        int i16 = i14;
        int i17 = i15;
        return postableDeviceFingerprint.copy((i16 & 1) != 0 ? postableDeviceFingerprint2.androidId : str, (i16 & 2) != 0 ? postableDeviceFingerprint2.androidVersion : str2, (i16 & 4) != 0 ? postableDeviceFingerprint2.appVersion : str3, (i16 & 8) != 0 ? postableDeviceFingerprint2.buildDisplayId : str4, (i16 & 16) != 0 ? postableDeviceFingerprint2.buildFingerprint : str5, (i16 & 32) != 0 ? postableDeviceFingerprint2.primaryCarrier : str6, (i16 & 64) != 0 ? postableDeviceFingerprint2.cpuProcessor : str7, (i16 & 128) != 0 ? postableDeviceFingerprint2.cpuHardware : str8, (i16 & 256) != 0 ? postableDeviceFingerprint2.deAppInstalled : z11, (i16 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? postableDeviceFingerprint2.manufacturerName : str9, (i16 & 1024) != 0 ? postableDeviceFingerprint2.modelName : str10, (i16 & 2048) != 0 ? postableDeviceFingerprint2.internalStorage : str11, (i16 & 4096) != 0 ? postableDeviceFingerprint2.memoryInformation : str12, (i16 & 8192) != 0 ? postableDeviceFingerprint2.rootStatus : z12, (i16 & 16384) != 0 ? postableDeviceFingerprint2.kernelName : str13, (i16 & 32768) != 0 ? postableDeviceFingerprint2.kernelVersion : str14, (i16 & PDButton.FLAG_PUSHBUTTON) != 0 ? postableDeviceFingerprint2.kernelArchitecture : str15, (i16 & PDChoice.FLAG_COMBO) != 0 ? postableDeviceFingerprint2.localLanguage : str16, (i16 & 262144) != 0 ? postableDeviceFingerprint2.localTimezone : str17, (i16 & 524288) != 0 ? postableDeviceFingerprint2.screenResolutionHeight : i11, (i16 & 1048576) != 0 ? postableDeviceFingerprint2.screenResolutionWidth : i12, (i16 & 2097152) != 0 ? postableDeviceFingerprint2.screenDensity : i13, (i16 & 4194304) != 0 ? postableDeviceFingerprint2.packageName : str18, (i16 & 8388608) != 0 ? postableDeviceFingerprint2.signature : str19, (i16 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? postableDeviceFingerprint2.permissionLocation : z13, (i16 & PDButton.FLAG_RADIOS_IN_UNISON) != 0 ? postableDeviceFingerprint2.wifiSSID : str20, (i16 & 67108864) != 0 ? postableDeviceFingerprint2.wifiMacAddress : str21, (i16 & 134217728) != 0 ? postableDeviceFingerprint2.ipAddress : str22, (i16 & 268435456) != 0 ? postableDeviceFingerprint2.googleAdvertiserId : str23, (i16 & 536870912) != 0 ? postableDeviceFingerprint2.isEmulator : z14, (i16 & 1073741824) != 0 ? postableDeviceFingerprint2.sessionId : str24, (i16 & Integer.MIN_VALUE) != 0 ? postableDeviceFingerprint2.userId : str25, (i17 & 1) != 0 ? postableDeviceFingerprint2.workProfileEnabled : z15, (i17 & 2) != 0 ? postableDeviceFingerprint2.appFilesDirPathInvalid : z16, (i17 & 4) != 0 ? postableDeviceFingerprint2.deviceModelVmos : z17, (i17 & 8) != 0 ? postableDeviceFingerprint2.appFilesDirPath : str26, (i17 & 16) != 0 ? postableDeviceFingerprint2.profiles : str27, (i17 & 32) != 0 ? postableDeviceFingerprint2.developerModeEnabled : z18, (i17 & 64) != 0 ? postableDeviceFingerprint2.integrityApiResponse : str28, (i17 & 128) != 0 ? postableDeviceFingerprint2.integrityApiError : str29);
    }

    public final String component1() {
        return this.androidId;
    }

    public final String component10() {
        return this.manufacturerName;
    }

    public final String component11() {
        return this.modelName;
    }

    public final String component12() {
        return this.internalStorage;
    }

    public final String component13() {
        return this.memoryInformation;
    }

    public final boolean component14() {
        return this.rootStatus;
    }

    public final String component15() {
        return this.kernelName;
    }

    public final String component16() {
        return this.kernelVersion;
    }

    public final String component17() {
        return this.kernelArchitecture;
    }

    public final String component18() {
        return this.localLanguage;
    }

    public final String component19() {
        return this.localTimezone;
    }

    public final String component2() {
        return this.androidVersion;
    }

    public final int component20() {
        return this.screenResolutionHeight;
    }

    public final int component21() {
        return this.screenResolutionWidth;
    }

    public final int component22() {
        return this.screenDensity;
    }

    public final String component23() {
        return this.packageName;
    }

    public final String component24() {
        return this.signature;
    }

    public final boolean component25() {
        return this.permissionLocation;
    }

    public final String component26() {
        return this.wifiSSID;
    }

    public final String component27() {
        return this.wifiMacAddress;
    }

    public final String component28() {
        return this.ipAddress;
    }

    public final String component29() {
        return this.googleAdvertiserId;
    }

    public final String component3() {
        return this.appVersion;
    }

    public final boolean component30() {
        return this.isEmulator;
    }

    public final String component31() {
        return this.sessionId;
    }

    public final String component32() {
        return this.userId;
    }

    public final boolean component33() {
        return this.workProfileEnabled;
    }

    public final boolean component34() {
        return this.appFilesDirPathInvalid;
    }

    public final boolean component35() {
        return this.deviceModelVmos;
    }

    public final String component36() {
        return this.appFilesDirPath;
    }

    public final String component37() {
        return this.profiles;
    }

    public final boolean component38() {
        return this.developerModeEnabled;
    }

    public final String component39() {
        return this.integrityApiResponse;
    }

    public final String component4() {
        return this.buildDisplayId;
    }

    public final String component40() {
        return this.integrityApiError;
    }

    public final String component5() {
        return this.buildFingerprint;
    }

    public final String component6() {
        return this.primaryCarrier;
    }

    public final String component7() {
        return this.cpuProcessor;
    }

    public final String component8() {
        return this.cpuHardware;
    }

    public final boolean component9() {
        return this.deAppInstalled;
    }

    public final PostableDeviceFingerprint copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z11, String str9, String str10, String str11, String str12, boolean z12, String str13, String str14, String str15, String str16, String str17, int i11, int i12, int i13, String str18, String str19, boolean z13, String str20, String str21, String str22, String str23, boolean z14, String str24, String str25, boolean z15, boolean z16, boolean z17, String str26, String str27, boolean z18, String str28, String str29) {
        String str30 = str;
        p.j(str30, "androidId");
        p.j(str2, "androidVersion");
        p.j(str3, HexAttribute.HEX_ATTR_APP_VERSION);
        p.j(str4, "buildDisplayId");
        p.j(str5, "buildFingerprint");
        p.j(str7, "cpuProcessor");
        p.j(str8, "cpuHardware");
        p.j(str9, "manufacturerName");
        p.j(str10, "modelName");
        p.j(str11, "internalStorage");
        p.j(str12, "memoryInformation");
        p.j(str13, "kernelName");
        p.j(str14, "kernelVersion");
        p.j(str15, "kernelArchitecture");
        p.j(str16, "localLanguage");
        p.j(str17, "localTimezone");
        p.j(str18, "packageName");
        p.j(str19, PaymentConstants.SIGNATURE);
        p.j(str24, "sessionId");
        p.j(str25, AnalyticsAttribute.USER_ID_ATTRIBUTE);
        p.j(str26, "appFilesDirPath");
        p.j(str27, "profiles");
        p.j(str28, "integrityApiResponse");
        p.j(str29, "integrityApiError");
        return new PostableDeviceFingerprint(str30, str2, str3, str4, str5, str6, str7, str8, z11, str9, str10, str11, str12, z12, str13, str14, str15, str16, str17, i11, i12, i13, str18, str19, z13, str20, str21, str22, str23, z14, str24, str25, z15, z16, z17, str26, str27, z18, str28, str29);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostableDeviceFingerprint)) {
            return false;
        }
        PostableDeviceFingerprint postableDeviceFingerprint = (PostableDeviceFingerprint) obj;
        return p.e(this.androidId, postableDeviceFingerprint.androidId) && p.e(this.androidVersion, postableDeviceFingerprint.androidVersion) && p.e(this.appVersion, postableDeviceFingerprint.appVersion) && p.e(this.buildDisplayId, postableDeviceFingerprint.buildDisplayId) && p.e(this.buildFingerprint, postableDeviceFingerprint.buildFingerprint) && p.e(this.primaryCarrier, postableDeviceFingerprint.primaryCarrier) && p.e(this.cpuProcessor, postableDeviceFingerprint.cpuProcessor) && p.e(this.cpuHardware, postableDeviceFingerprint.cpuHardware) && this.deAppInstalled == postableDeviceFingerprint.deAppInstalled && p.e(this.manufacturerName, postableDeviceFingerprint.manufacturerName) && p.e(this.modelName, postableDeviceFingerprint.modelName) && p.e(this.internalStorage, postableDeviceFingerprint.internalStorage) && p.e(this.memoryInformation, postableDeviceFingerprint.memoryInformation) && this.rootStatus == postableDeviceFingerprint.rootStatus && p.e(this.kernelName, postableDeviceFingerprint.kernelName) && p.e(this.kernelVersion, postableDeviceFingerprint.kernelVersion) && p.e(this.kernelArchitecture, postableDeviceFingerprint.kernelArchitecture) && p.e(this.localLanguage, postableDeviceFingerprint.localLanguage) && p.e(this.localTimezone, postableDeviceFingerprint.localTimezone) && this.screenResolutionHeight == postableDeviceFingerprint.screenResolutionHeight && this.screenResolutionWidth == postableDeviceFingerprint.screenResolutionWidth && this.screenDensity == postableDeviceFingerprint.screenDensity && p.e(this.packageName, postableDeviceFingerprint.packageName) && p.e(this.signature, postableDeviceFingerprint.signature) && this.permissionLocation == postableDeviceFingerprint.permissionLocation && p.e(this.wifiSSID, postableDeviceFingerprint.wifiSSID) && p.e(this.wifiMacAddress, postableDeviceFingerprint.wifiMacAddress) && p.e(this.ipAddress, postableDeviceFingerprint.ipAddress) && p.e(this.googleAdvertiserId, postableDeviceFingerprint.googleAdvertiserId) && this.isEmulator == postableDeviceFingerprint.isEmulator && p.e(this.sessionId, postableDeviceFingerprint.sessionId) && p.e(this.userId, postableDeviceFingerprint.userId) && this.workProfileEnabled == postableDeviceFingerprint.workProfileEnabled && this.appFilesDirPathInvalid == postableDeviceFingerprint.appFilesDirPathInvalid && this.deviceModelVmos == postableDeviceFingerprint.deviceModelVmos && p.e(this.appFilesDirPath, postableDeviceFingerprint.appFilesDirPath) && p.e(this.profiles, postableDeviceFingerprint.profiles) && this.developerModeEnabled == postableDeviceFingerprint.developerModeEnabled && p.e(this.integrityApiResponse, postableDeviceFingerprint.integrityApiResponse) && p.e(this.integrityApiError, postableDeviceFingerprint.integrityApiError);
    }

    public final String getAndroidId() {
        return this.androidId;
    }

    public final String getAndroidVersion() {
        return this.androidVersion;
    }

    public final String getAppFilesDirPath() {
        return this.appFilesDirPath;
    }

    public final boolean getAppFilesDirPathInvalid() {
        return this.appFilesDirPathInvalid;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getBuildDisplayId() {
        return this.buildDisplayId;
    }

    public final String getBuildFingerprint() {
        return this.buildFingerprint;
    }

    public final String getCpuHardware() {
        return this.cpuHardware;
    }

    public final String getCpuProcessor() {
        return this.cpuProcessor;
    }

    public final boolean getDeAppInstalled() {
        return this.deAppInstalled;
    }

    public final boolean getDeveloperModeEnabled() {
        return this.developerModeEnabled;
    }

    public final boolean getDeviceModelVmos() {
        return this.deviceModelVmos;
    }

    public final String getGoogleAdvertiserId() {
        return this.googleAdvertiserId;
    }

    public final String getIntegrityApiError() {
        return this.integrityApiError;
    }

    public final String getIntegrityApiResponse() {
        return this.integrityApiResponse;
    }

    public final String getInternalStorage() {
        return this.internalStorage;
    }

    public final String getIpAddress() {
        return this.ipAddress;
    }

    public final String getKernelArchitecture() {
        return this.kernelArchitecture;
    }

    public final String getKernelName() {
        return this.kernelName;
    }

    public final String getKernelVersion() {
        return this.kernelVersion;
    }

    public final String getLocalLanguage() {
        return this.localLanguage;
    }

    public final String getLocalTimezone() {
        return this.localTimezone;
    }

    public final String getManufacturerName() {
        return this.manufacturerName;
    }

    public final String getMemoryInformation() {
        return this.memoryInformation;
    }

    public final String getModelName() {
        return this.modelName;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final boolean getPermissionLocation() {
        return this.permissionLocation;
    }

    public final String getPrimaryCarrier() {
        return this.primaryCarrier;
    }

    public final String getProfiles() {
        return this.profiles;
    }

    public final boolean getRootStatus() {
        return this.rootStatus;
    }

    public final int getScreenDensity() {
        return this.screenDensity;
    }

    public final int getScreenResolutionHeight() {
        return this.screenResolutionHeight;
    }

    public final int getScreenResolutionWidth() {
        return this.screenResolutionWidth;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getWifiMacAddress() {
        return this.wifiMacAddress;
    }

    public final String getWifiSSID() {
        return this.wifiSSID;
    }

    public final boolean getWorkProfileEnabled() {
        return this.workProfileEnabled;
    }

    public int hashCode() {
        int hashCode = ((((((((this.androidId.hashCode() * 31) + this.androidVersion.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + this.buildDisplayId.hashCode()) * 31) + this.buildFingerprint.hashCode()) * 31;
        String str = this.primaryCarrier;
        int i11 = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.cpuProcessor.hashCode()) * 31) + this.cpuHardware.hashCode()) * 31;
        boolean z11 = this.deAppInstalled;
        boolean z12 = true;
        if (z11) {
            z11 = true;
        }
        int hashCode3 = (((((((((hashCode2 + (z11 ? 1 : 0)) * 31) + this.manufacturerName.hashCode()) * 31) + this.modelName.hashCode()) * 31) + this.internalStorage.hashCode()) * 31) + this.memoryInformation.hashCode()) * 31;
        boolean z13 = this.rootStatus;
        if (z13) {
            z13 = true;
        }
        int hashCode4 = (((((((((((((((((((((hashCode3 + (z13 ? 1 : 0)) * 31) + this.kernelName.hashCode()) * 31) + this.kernelVersion.hashCode()) * 31) + this.kernelArchitecture.hashCode()) * 31) + this.localLanguage.hashCode()) * 31) + this.localTimezone.hashCode()) * 31) + this.screenResolutionHeight) * 31) + this.screenResolutionWidth) * 31) + this.screenDensity) * 31) + this.packageName.hashCode()) * 31) + this.signature.hashCode()) * 31;
        boolean z14 = this.permissionLocation;
        if (z14) {
            z14 = true;
        }
        int i12 = (hashCode4 + (z14 ? 1 : 0)) * 31;
        String str2 = this.wifiSSID;
        int hashCode5 = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.wifiMacAddress;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ipAddress;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.googleAdvertiserId;
        if (str5 != null) {
            i11 = str5.hashCode();
        }
        int i13 = (hashCode7 + i11) * 31;
        boolean z15 = this.isEmulator;
        if (z15) {
            z15 = true;
        }
        int hashCode8 = (((((i13 + (z15 ? 1 : 0)) * 31) + this.sessionId.hashCode()) * 31) + this.userId.hashCode()) * 31;
        boolean z16 = this.workProfileEnabled;
        if (z16) {
            z16 = true;
        }
        int i14 = (hashCode8 + (z16 ? 1 : 0)) * 31;
        boolean z17 = this.appFilesDirPathInvalid;
        if (z17) {
            z17 = true;
        }
        int i15 = (i14 + (z17 ? 1 : 0)) * 31;
        boolean z18 = this.deviceModelVmos;
        if (z18) {
            z18 = true;
        }
        int hashCode9 = (((((i15 + (z18 ? 1 : 0)) * 31) + this.appFilesDirPath.hashCode()) * 31) + this.profiles.hashCode()) * 31;
        boolean z19 = this.developerModeEnabled;
        if (!z19) {
            z12 = z19;
        }
        return ((((hashCode9 + (z12 ? 1 : 0)) * 31) + this.integrityApiResponse.hashCode()) * 31) + this.integrityApiError.hashCode();
    }

    public final boolean isEmulator() {
        return this.isEmulator;
    }

    public String toString() {
        return "PostableDeviceFingerprint(androidId=" + this.androidId + ", androidVersion=" + this.androidVersion + ", appVersion=" + this.appVersion + ", buildDisplayId=" + this.buildDisplayId + ", buildFingerprint=" + this.buildFingerprint + ", primaryCarrier=" + this.primaryCarrier + ", cpuProcessor=" + this.cpuProcessor + ", cpuHardware=" + this.cpuHardware + ", deAppInstalled=" + this.deAppInstalled + ", manufacturerName=" + this.manufacturerName + ", modelName=" + this.modelName + ", internalStorage=" + this.internalStorage + ", memoryInformation=" + this.memoryInformation + ", rootStatus=" + this.rootStatus + ", kernelName=" + this.kernelName + ", kernelVersion=" + this.kernelVersion + ", kernelArchitecture=" + this.kernelArchitecture + ", localLanguage=" + this.localLanguage + ", localTimezone=" + this.localTimezone + ", screenResolutionHeight=" + this.screenResolutionHeight + ", screenResolutionWidth=" + this.screenResolutionWidth + ", screenDensity=" + this.screenDensity + ", packageName=" + this.packageName + ", signature=" + this.signature + ", permissionLocation=" + this.permissionLocation + ", wifiSSID=" + this.wifiSSID + ", wifiMacAddress=" + this.wifiMacAddress + ", ipAddress=" + this.ipAddress + ", googleAdvertiserId=" + this.googleAdvertiserId + ", isEmulator=" + this.isEmulator + ", sessionId=" + this.sessionId + ", userId=" + this.userId + ", workProfileEnabled=" + this.workProfileEnabled + ", appFilesDirPathInvalid=" + this.appFilesDirPathInvalid + ", deviceModelVmos=" + this.deviceModelVmos + ", appFilesDirPath=" + this.appFilesDirPath + ", profiles=" + this.profiles + ", developerModeEnabled=" + this.developerModeEnabled + ", integrityApiResponse=" + this.integrityApiResponse + ", integrityApiError=" + this.integrityApiError + ')';
    }

    public PostableDeviceFingerprint(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z11, String str9, String str10, String str11, String str12, boolean z12, String str13, String str14, String str15, String str16, String str17, int i11, int i12, int i13, String str18, String str19, boolean z13, String str20, String str21, String str22, String str23, boolean z14, String str24, String str25, boolean z15, boolean z16, boolean z17, String str26, String str27, boolean z18, String str28, String str29) {
        String str30 = str;
        String str31 = str2;
        String str32 = str3;
        String str33 = str4;
        String str34 = str5;
        String str35 = str7;
        String str36 = str8;
        String str37 = str9;
        String str38 = str10;
        String str39 = str11;
        String str40 = str12;
        String str41 = str13;
        String str42 = str14;
        String str43 = str15;
        String str44 = str17;
        p.j(str30, "androidId");
        p.j(str31, "androidVersion");
        p.j(str32, HexAttribute.HEX_ATTR_APP_VERSION);
        p.j(str33, "buildDisplayId");
        p.j(str34, "buildFingerprint");
        p.j(str35, "cpuProcessor");
        p.j(str36, "cpuHardware");
        p.j(str37, "manufacturerName");
        p.j(str38, "modelName");
        p.j(str39, "internalStorage");
        p.j(str40, "memoryInformation");
        p.j(str41, "kernelName");
        p.j(str42, "kernelVersion");
        p.j(str43, "kernelArchitecture");
        p.j(str16, "localLanguage");
        p.j(str17, "localTimezone");
        p.j(str18, "packageName");
        p.j(str19, PaymentConstants.SIGNATURE);
        p.j(str24, "sessionId");
        p.j(str25, AnalyticsAttribute.USER_ID_ATTRIBUTE);
        p.j(str26, "appFilesDirPath");
        p.j(str27, "profiles");
        p.j(str28, "integrityApiResponse");
        p.j(str29, "integrityApiError");
        this.androidId = str30;
        this.androidVersion = str31;
        this.appVersion = str32;
        this.buildDisplayId = str33;
        this.buildFingerprint = str34;
        this.primaryCarrier = str6;
        this.cpuProcessor = str35;
        this.cpuHardware = str36;
        this.deAppInstalled = z11;
        this.manufacturerName = str37;
        this.modelName = str38;
        this.internalStorage = str39;
        this.memoryInformation = str40;
        this.rootStatus = z12;
        this.kernelName = str41;
        this.kernelVersion = str42;
        this.kernelArchitecture = str43;
        this.localLanguage = str16;
        this.localTimezone = str17;
        this.screenResolutionHeight = i11;
        this.screenResolutionWidth = i12;
        this.screenDensity = i13;
        this.packageName = str18;
        this.signature = str19;
        this.permissionLocation = z13;
        this.wifiSSID = str20;
        this.wifiMacAddress = str21;
        this.ipAddress = str22;
        this.googleAdvertiserId = str23;
        this.isEmulator = z14;
        this.sessionId = str24;
        this.userId = str25;
        this.workProfileEnabled = z15;
        this.appFilesDirPathInvalid = z16;
        this.deviceModelVmos = z17;
        this.appFilesDirPath = str26;
        this.profiles = str27;
        this.developerModeEnabled = z18;
        this.integrityApiResponse = str28;
        this.integrityApiError = str29;
    }
}
