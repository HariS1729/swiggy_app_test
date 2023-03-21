package co.hyperverge.hypersnapsdk.objects;

import android.util.Log;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import w5.n;

@Instrumented
public class HVFaceConfig extends HVBaseConfig {
    private static final String TAG = HVFaceConfig.class.getCanonicalName();
    static HVFaceConfig faceConfigInstance;
    private double bitrateM = 1.0d;
    float bottomPadding = 0.0f;
    String clientID = "";
    private int cropImageWaterMarkTextSizePx = 20;
    String customLoaderClass = null;
    String customUIStrings;
    boolean dataLogging = true;
    String faceCaptureSubtitle;
    String faceCaptureTitle;
    private int fps = 30;
    private int fullImageWaterMarkTextSizePx = 45;
    public String headers;
    float leftPadding = 0.0f;
    String livenessEndpoint;
    LivenessMode mode = LivenessMode.TEXTURELIVENESS;
    private int numberOfFrames = 50;
    String params;
    float rightPadding = 0.0f;
    private boolean shouldAddWaterMark = false;
    boolean shouldHandleRetries = true;
    private boolean shouldRecordVideo = false;
    boolean shouldReturnFullImageUrl = false;
    boolean shouldSetPadding = false;
    boolean shouldShowInstructionPage = false;
    boolean shouldUseBackCamera = false;
    boolean shouldUseEnhancedCameraFeatures = false;
    boolean shouldUseFlip = false;
    boolean shouldUseZoom = false;
    private int statusTypeFace;
    private int subtitleTypeface;
    private int titleTypeface;
    float topPadding = 0.0f;
    boolean useBothImagesSignature = false;
    boolean useFlash = false;
    private int waterMarkColor = -65536;

    public enum LivenessMode {
        NONE,
        TEXTURELIVENESS
    }

    public static HVFaceConfig getFaceConfigInstance() {
        return faceConfigInstance;
    }

    public static void setFaceConfigInstance(HVFaceConfig hVFaceConfig) {
        faceConfigInstance = hVFaceConfig;
    }

    public double getBitrateM() {
        return this.bitrateM;
    }

    public float getBottomPadding() {
        return this.bottomPadding;
    }

    public String getClientID() {
        return this.clientID;
    }

    public int getCropImageWaterMarkTextSizePx() {
        return this.cropImageWaterMarkTextSizePx;
    }

    public String getCustomLoaderClass() {
        return this.customLoaderClass;
    }

    public JSONObject getCustomUIStrings() {
        JSONObject jSONObject = new JSONObject();
        if (this.customUIStrings == null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.customUIStrings);
        } catch (JSONException e11) {
            Log.e(TAG, e11.getMessage());
            if (n.w().s() == null) {
                return jSONObject;
            }
            n.w().s().a(e11);
            return jSONObject;
        }
    }

    public String getFaceCaptureSubtitle() {
        return this.faceCaptureSubtitle;
    }

    public String getFaceCaptureTitle() {
        return this.faceCaptureTitle;
    }

    public int getFps() {
        return this.fps;
    }

    public int getFullImageWaterMarkTextSizePx() {
        return this.fullImageWaterMarkTextSizePx;
    }

    public JSONObject getHeaders() {
        JSONObject jSONObject = new JSONObject();
        if (this.headers == null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.headers);
        } catch (JSONException e11) {
            Log.e(TAG, e11.getMessage());
            if (n.w().s() == null) {
                return jSONObject;
            }
            n.w().s().a(e11);
            return jSONObject;
        }
    }

    public float getLeftPadding() {
        return this.leftPadding;
    }

    public String getLivenessEndpoint() {
        String str = this.livenessEndpoint;
        if (str != null && !str.trim().isEmpty()) {
            return this.livenessEndpoint;
        }
        return n.w().t() + n.w().x();
    }

    public JSONObject getLivenessParams() {
        JSONObject jSONObject = new JSONObject();
        if (this.params == null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.params);
        } catch (JSONException e11) {
            Log.e(TAG, e11.getMessage());
            if (n.w().s() == null) {
                return jSONObject;
            }
            n.w().s().a(e11);
            return jSONObject;
        }
    }

    public LivenessMode getMode() {
        return this.mode;
    }

    public int getNumberOfFrames() {
        return this.numberOfFrames;
    }

    public float getRightPadding() {
        return this.rightPadding;
    }

    public boolean getShouldUseBackCamera() {
        return this.shouldUseBackCamera;
    }

    public int getStatusTypeFace() {
        return this.statusTypeFace;
    }

    public String getStringMode() {
        LivenessMode livenessMode = this.mode;
        if (livenessMode == LivenessMode.NONE) {
            return "NONE";
        }
        return livenessMode == LivenessMode.TEXTURELIVENESS ? "TEXTURELIVENESS" : "";
    }

    public int getSubtitleTypeface() {
        return this.subtitleTypeface;
    }

    public int getTitleTypeface() {
        return this.titleTypeface;
    }

    public float getTopPadding() {
        return this.topPadding;
    }

    public int getWaterMarkColor() {
        return this.waterMarkColor;
    }

    @Deprecated
    public boolean isDataLogging() {
        return true;
    }

    public boolean isShouldAddWaterMark() {
        return this.shouldAddWaterMark;
    }

    public boolean isShouldHandleRetries() {
        return this.shouldHandleRetries;
    }

    public boolean isShouldRecordVideo() {
        Map<String, Boolean> u11;
        if (this.shouldRecordVideo && (u11 = n.w().u()) != null && u11.containsKey("video-recording")) {
            this.shouldRecordVideo = u11.get("video-recording").booleanValue();
        }
        return this.shouldRecordVideo;
    }

    public boolean isShouldReturnFullImageUrl() {
        return this.shouldReturnFullImageUrl;
    }

    public boolean isShouldSetPadding() {
        return this.shouldSetPadding;
    }

    public boolean isShouldShowInstructionPage() {
        return this.shouldShowInstructionPage;
    }

    public boolean isShouldUseEnhancedCameraFeatures() {
        return this.shouldUseEnhancedCameraFeatures;
    }

    public boolean isShouldUseFlip() {
        return this.shouldUseFlip;
    }

    public boolean isShouldUseZoom() {
        return this.shouldUseZoom;
    }

    public boolean isUseBothImagesSignature() {
        return this.useBothImagesSignature;
    }

    public boolean isUseFlash() {
        return this.useFlash;
    }

    public void setBitrateM(double d11) {
        this.bitrateM = d11;
    }

    public void setClientID(String str) {
        this.clientID = str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PaymentConstants.CLIENT_ID_CAMEL, this.clientID);
            setLivenessAPIParameters(jSONObject);
        } catch (JSONException e11) {
            Log.e(TAG, e11.getMessage());
            if (n.w().s() != null) {
                n.w().s().a(e11);
            }
        }
    }

    public void setCropImageWaterMarkTextSizePx(int i11) {
        this.cropImageWaterMarkTextSizePx = i11;
    }

    public void setCustomLoadingScreen(String str) {
        this.customLoaderClass = str;
    }

    public void setCustomUIStrings(JSONObject jSONObject) {
        this.customUIStrings = !(jSONObject instanceof JSONObject) ? jSONObject.toString() : JSONObjectInstrumentation.toString(jSONObject);
    }

    public void setFaceCaptureSubtitle(String str) {
        this.faceCaptureSubtitle = str;
    }

    public void setFaceCaptureTitle(String str) {
        this.faceCaptureTitle = str;
    }

    public void setFps(int i11) {
        this.fps = i11;
    }

    public void setFullImageWaterMarkTextSizePx(int i11) {
        this.fullImageWaterMarkTextSizePx = i11;
    }

    public void setLivenessAPIHeaders(JSONObject jSONObject) {
        this.headers = !(jSONObject instanceof JSONObject) ? jSONObject.toString() : JSONObjectInstrumentation.toString(jSONObject);
    }

    public void setLivenessAPIParameters(JSONObject jSONObject) {
        this.params = !(jSONObject instanceof JSONObject) ? jSONObject.toString() : JSONObjectInstrumentation.toString(jSONObject);
    }

    public void setLivenessEndpoint(String str) {
        this.livenessEndpoint = str;
    }

    public void setLivenessMode(LivenessMode livenessMode) {
        this.mode = livenessMode;
    }

    public void setNumberOfFrames(int i11) {
        this.numberOfFrames = i11;
    }

    public void setPadding(float f11, float f12, float f13, float f14) {
        this.leftPadding = f11;
        this.rightPadding = f12;
        this.topPadding = f13;
        this.bottomPadding = f14;
    }

    public void setShouldAddWaterMark(boolean z11) {
        this.shouldAddWaterMark = z11;
    }

    @Deprecated
    public void setShouldEnableDataLogging(boolean z11) {
    }

    public void setShouldEnablePadding(boolean z11) {
        this.shouldSetPadding = z11;
        if (z11) {
            setPadding(0.2f, 0.2f, 0.3f, 0.1f);
        }
    }

    public void setShouldHandleRetries(boolean z11) {
        this.shouldHandleRetries = z11;
    }

    public void setShouldRecordVideo(boolean z11) {
        this.shouldRecordVideo = z11;
    }

    public void setShouldReturnFullImageUrl(boolean z11) {
        this.shouldReturnFullImageUrl = z11;
    }

    public void setShouldShowCameraSwitchButton(boolean z11) {
        this.shouldUseFlip = z11;
    }

    public void setShouldShowInstructionPage(boolean z11) {
        this.shouldShowInstructionPage = z11;
    }

    public void setShouldUseBackCamera(boolean z11) {
        this.shouldUseBackCamera = z11;
    }

    public void setShouldUseEnhancedCameraFeatures(boolean z11) {
        this.shouldUseEnhancedCameraFeatures = z11;
    }

    public void setShouldUseZoom(boolean z11) {
        this.shouldUseZoom = z11;
    }

    public void setStatusTypeFace(int i11) {
        this.statusTypeFace = i11;
    }

    public void setSubtitleTypeface(int i11) {
        this.subtitleTypeface = i11;
    }

    public void setTitleTypeface(int i11) {
        this.titleTypeface = i11;
    }

    public void setUseBothImagesSignatureCalc(boolean z11) {
        this.useBothImagesSignature = z11;
    }

    public void setWaterMarkColor(int i11) {
        this.waterMarkColor = i11;
    }
}
