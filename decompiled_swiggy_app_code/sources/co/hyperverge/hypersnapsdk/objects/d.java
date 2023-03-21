package co.hyperverge.hypersnapsdk.objects;

/* compiled from: HyperSnapSDKConfig */
public class d {
    private String accessToken;
    private String appId;
    private String appKey;
    private int connectTimeOut = 120;
    private c hyperKYCConfigs;
    private HyperSnapParams$Product hyperSnapProduct;
    private HyperSnapParams$Region hyperSnapRegion;
    private String mixpanelToken;
    private int readTimeOut = 120;
    private boolean shouldActivateDeviceBlocklist = true;
    private boolean shouldEnableSSLPinning;
    private boolean shouldLogOnlyErrors;
    private boolean shouldReturnRawResponse;
    private boolean shouldUseLocation;
    private boolean shouldUseRemoteConfig = true;
    private boolean shouldUseSignature;
    private int writeTimeOut = 120;

    public d() {
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!dVar.canEqual(this) || isShouldEnableSSLPinning() != dVar.isShouldEnableSSLPinning() || isShouldUseSignature() != dVar.isShouldUseSignature() || isShouldLogOnlyErrors() != dVar.isShouldLogOnlyErrors() || isShouldReturnRawResponse() != dVar.isShouldReturnRawResponse() || isShouldActivateDeviceBlocklist() != dVar.isShouldActivateDeviceBlocklist() || getConnectTimeOut() != dVar.getConnectTimeOut() || getReadTimeOut() != dVar.getReadTimeOut() || getWriteTimeOut() != dVar.getWriteTimeOut() || isShouldUseRemoteConfig() != dVar.isShouldUseRemoteConfig() || isShouldUseLocation() != dVar.isShouldUseLocation()) {
            return false;
        }
        String appId2 = getAppId();
        String appId3 = dVar.getAppId();
        if (appId2 != null ? !appId2.equals(appId3) : appId3 != null) {
            return false;
        }
        String appKey2 = getAppKey();
        String appKey3 = dVar.getAppKey();
        if (appKey2 != null ? !appKey2.equals(appKey3) : appKey3 != null) {
            return false;
        }
        String accessToken2 = getAccessToken();
        String accessToken3 = dVar.getAccessToken();
        if (accessToken2 != null ? !accessToken2.equals(accessToken3) : accessToken3 != null) {
            return false;
        }
        HyperSnapParams$Region hyperSnapRegion2 = getHyperSnapRegion();
        HyperSnapParams$Region hyperSnapRegion3 = dVar.getHyperSnapRegion();
        if (hyperSnapRegion2 != null ? !hyperSnapRegion2.equals(hyperSnapRegion3) : hyperSnapRegion3 != null) {
            return false;
        }
        HyperSnapParams$Product hyperSnapProduct2 = getHyperSnapProduct();
        HyperSnapParams$Product hyperSnapProduct3 = dVar.getHyperSnapProduct();
        if (hyperSnapProduct2 != null ? !hyperSnapProduct2.equals(hyperSnapProduct3) : hyperSnapProduct3 != null) {
            return false;
        }
        String mixpanelToken2 = getMixpanelToken();
        String mixpanelToken3 = dVar.getMixpanelToken();
        if (mixpanelToken2 != null ? !mixpanelToken2.equals(mixpanelToken3) : mixpanelToken3 != null) {
            return false;
        }
        c hyperKYCConfigs2 = getHyperKYCConfigs();
        c hyperKYCConfigs3 = dVar.getHyperKYCConfigs();
        return hyperKYCConfigs2 != null ? hyperKYCConfigs2.equals(hyperKYCConfigs3) : hyperKYCConfigs3 == null;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public int getConnectTimeOut() {
        return this.connectTimeOut;
    }

    public c getHyperKYCConfigs() {
        return this.hyperKYCConfigs;
    }

    public HyperSnapParams$Product getHyperSnapProduct() {
        return this.hyperSnapProduct;
    }

    public HyperSnapParams$Region getHyperSnapRegion() {
        return this.hyperSnapRegion;
    }

    public String getMixpanelToken() {
        return this.mixpanelToken;
    }

    public int getReadTimeOut() {
        return this.readTimeOut;
    }

    public int getWriteTimeOut() {
        return this.writeTimeOut;
    }

    public int hashCode() {
        int i11 = 79;
        int connectTimeOut2 = ((((((((((((((((((isShouldEnableSSLPinning() ? 79 : 97) + 59) * 59) + (isShouldUseSignature() ? 79 : 97)) * 59) + (isShouldLogOnlyErrors() ? 79 : 97)) * 59) + (isShouldReturnRawResponse() ? 79 : 97)) * 59) + (isShouldActivateDeviceBlocklist() ? 79 : 97)) * 59) + getConnectTimeOut()) * 59) + getReadTimeOut()) * 59) + getWriteTimeOut()) * 59) + (isShouldUseRemoteConfig() ? 79 : 97)) * 59;
        if (!isShouldUseLocation()) {
            i11 = 97;
        }
        int i12 = connectTimeOut2 + i11;
        String appId2 = getAppId();
        int i13 = 43;
        int hashCode = (i12 * 59) + (appId2 == null ? 43 : appId2.hashCode());
        String appKey2 = getAppKey();
        int hashCode2 = (hashCode * 59) + (appKey2 == null ? 43 : appKey2.hashCode());
        String accessToken2 = getAccessToken();
        int hashCode3 = (hashCode2 * 59) + (accessToken2 == null ? 43 : accessToken2.hashCode());
        HyperSnapParams$Region hyperSnapRegion2 = getHyperSnapRegion();
        int hashCode4 = (hashCode3 * 59) + (hyperSnapRegion2 == null ? 43 : hyperSnapRegion2.hashCode());
        HyperSnapParams$Product hyperSnapProduct2 = getHyperSnapProduct();
        int hashCode5 = (hashCode4 * 59) + (hyperSnapProduct2 == null ? 43 : hyperSnapProduct2.hashCode());
        String mixpanelToken2 = getMixpanelToken();
        int hashCode6 = (hashCode5 * 59) + (mixpanelToken2 == null ? 43 : mixpanelToken2.hashCode());
        c hyperKYCConfigs2 = getHyperKYCConfigs();
        int i14 = hashCode6 * 59;
        if (hyperKYCConfigs2 != null) {
            i13 = hyperKYCConfigs2.hashCode();
        }
        return i14 + i13;
    }

    public boolean isShouldActivateDeviceBlocklist() {
        return this.shouldActivateDeviceBlocklist;
    }

    public boolean isShouldEnableSSLPinning() {
        return this.shouldEnableSSLPinning;
    }

    public boolean isShouldLogOnlyErrors() {
        return this.shouldLogOnlyErrors;
    }

    public boolean isShouldReturnRawResponse() {
        return this.shouldReturnRawResponse;
    }

    public boolean isShouldUseLocation() {
        return this.shouldUseLocation;
    }

    public boolean isShouldUseRemoteConfig() {
        return this.shouldUseRemoteConfig;
    }

    public boolean isShouldUseSignature() {
        return this.shouldUseSignature;
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppKey(String str) {
        this.appKey = str;
    }

    public void setConnectTimeOut(int i11) {
        this.connectTimeOut = i11;
    }

    public void setHttpTimeoutValues(int i11, int i12, int i13) {
        this.connectTimeOut = i11;
        this.readTimeOut = i12;
        this.writeTimeOut = i13;
    }

    public void setHyperKYCConfigs(c cVar) {
        this.hyperKYCConfigs = cVar;
    }

    public void setHyperSnapProduct(HyperSnapParams$Product hyperSnapParams$Product) {
        this.hyperSnapProduct = hyperSnapParams$Product;
    }

    public void setHyperSnapRegion(HyperSnapParams$Region hyperSnapParams$Region) {
        this.hyperSnapRegion = hyperSnapParams$Region;
    }

    public void setMixpanelToken(String str) {
        this.mixpanelToken = str;
    }

    public void setReadTimeOut(int i11) {
        this.readTimeOut = i11;
    }

    public void setShouldActivateDeviceBlocklist(boolean z11) {
        this.shouldActivateDeviceBlocklist = z11;
    }

    public void setShouldEnableSSLPinning(boolean z11) {
        this.shouldEnableSSLPinning = z11;
    }

    public void setShouldLogOnlyErrors(boolean z11) {
        this.shouldLogOnlyErrors = z11;
    }

    public void setShouldReturnRawResponse(boolean z11) {
        this.shouldReturnRawResponse = z11;
    }

    public void setShouldUseLocation(boolean z11) {
        this.shouldUseLocation = z11;
    }

    public void setShouldUseRemoteConfig(boolean z11) {
        this.shouldUseRemoteConfig = z11;
    }

    public void setShouldUseSignature(boolean z11) {
        this.shouldUseSignature = z11;
    }

    public void setWriteTimeOut(int i11) {
        this.writeTimeOut = i11;
    }

    public String toString() {
        return "HyperSnapSDKConfig(appId=" + getAppId() + ", appKey=" + getAppKey() + ", accessToken=" + getAccessToken() + ", hyperSnapRegion=" + getHyperSnapRegion() + ", hyperSnapProduct=" + getHyperSnapProduct() + ", shouldEnableSSLPinning=" + isShouldEnableSSLPinning() + ", shouldUseSignature=" + isShouldUseSignature() + ", shouldLogOnlyErrors=" + isShouldLogOnlyErrors() + ", mixpanelToken=" + getMixpanelToken() + ", shouldReturnRawResponse=" + isShouldReturnRawResponse() + ", shouldActivateDeviceBlocklist=" + isShouldActivateDeviceBlocklist() + ", connectTimeOut=" + getConnectTimeOut() + ", readTimeOut=" + getReadTimeOut() + ", writeTimeOut=" + getWriteTimeOut() + ", hyperKYCConfigs=" + getHyperKYCConfigs() + ", shouldUseRemoteConfig=" + isShouldUseRemoteConfig() + ", shouldUseLocation=" + isShouldUseLocation() + ")";
    }

    public d(String str, String str2, HyperSnapParams$Region hyperSnapParams$Region) {
        this.appId = str;
        this.appKey = str2;
        this.hyperSnapRegion = hyperSnapParams$Region;
        this.hyperSnapProduct = HyperSnapParams$Product.FACEID;
    }
}
