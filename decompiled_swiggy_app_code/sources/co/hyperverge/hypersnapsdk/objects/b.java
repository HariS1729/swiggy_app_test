package co.hyperverge.hypersnapsdk.objects;

import org.json.JSONObject;
import z5.e;

/* compiled from: HVResponse */
public class b {
    private String action;
    private JSONObject apiHeaders;
    private JSONObject apiResult;
    private int attemptsCount;
    private String fullImageURI;
    private String imageURI;
    private String retakeMessage;
    private String videoUri;
    private String waterMarkCroppedImageUri;
    private String waterMarkFullImageUri;

    public b() {
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!bVar.canEqual(this) || getAttemptsCount() != bVar.getAttemptsCount()) {
            return false;
        }
        String imageURI2 = getImageURI();
        String imageURI3 = bVar.getImageURI();
        if (imageURI2 != null ? !imageURI2.equals(imageURI3) : imageURI3 != null) {
            return false;
        }
        String fullImageURI2 = getFullImageURI();
        String fullImageURI3 = bVar.getFullImageURI();
        if (fullImageURI2 != null ? !fullImageURI2.equals(fullImageURI3) : fullImageURI3 != null) {
            return false;
        }
        String retakeMessage2 = getRetakeMessage();
        String retakeMessage3 = bVar.getRetakeMessage();
        if (retakeMessage2 != null ? !retakeMessage2.equals(retakeMessage3) : retakeMessage3 != null) {
            return false;
        }
        String waterMarkFullImageUri2 = getWaterMarkFullImageUri();
        String waterMarkFullImageUri3 = bVar.getWaterMarkFullImageUri();
        if (waterMarkFullImageUri2 != null ? !waterMarkFullImageUri2.equals(waterMarkFullImageUri3) : waterMarkFullImageUri3 != null) {
            return false;
        }
        String waterMarkCroppedImageUri2 = getWaterMarkCroppedImageUri();
        String waterMarkCroppedImageUri3 = bVar.getWaterMarkCroppedImageUri();
        if (waterMarkCroppedImageUri2 != null ? !waterMarkCroppedImageUri2.equals(waterMarkCroppedImageUri3) : waterMarkCroppedImageUri3 != null) {
            return false;
        }
        String action2 = getAction();
        String action3 = bVar.getAction();
        if (action2 != null ? !action2.equals(action3) : action3 != null) {
            return false;
        }
        JSONObject apiResult2 = getApiResult();
        JSONObject apiResult3 = bVar.getApiResult();
        if (apiResult2 != null ? !apiResult2.equals(apiResult3) : apiResult3 != null) {
            return false;
        }
        JSONObject apiHeaders2 = getApiHeaders();
        JSONObject apiHeaders3 = bVar.getApiHeaders();
        if (apiHeaders2 != null ? !apiHeaders2.equals(apiHeaders3) : apiHeaders3 != null) {
            return false;
        }
        String videoUri2 = getVideoUri();
        String videoUri3 = bVar.getVideoUri();
        return videoUri2 != null ? videoUri2.equals(videoUri3) : videoUri3 == null;
    }

    public String getAction() {
        return this.action;
    }

    public JSONObject getApiHeaders() {
        return this.apiHeaders;
    }

    public JSONObject getApiResult() {
        return this.apiResult;
    }

    public int getAttemptsCount() {
        return this.attemptsCount;
    }

    public String getFullImageURI() {
        return this.fullImageURI;
    }

    public String getImageURI() {
        return this.imageURI;
    }

    public String getRetakeMessage() {
        return this.retakeMessage;
    }

    public String getVideoUri() {
        return this.videoUri;
    }

    public String getWaterMarkCroppedImageUri() {
        return this.waterMarkCroppedImageUri;
    }

    public String getWaterMarkFullImageUri() {
        return this.waterMarkFullImageUri;
    }

    public int hashCode() {
        String imageURI2 = getImageURI();
        int i11 = 43;
        int attemptsCount2 = ((getAttemptsCount() + 59) * 59) + (imageURI2 == null ? 43 : imageURI2.hashCode());
        String fullImageURI2 = getFullImageURI();
        int hashCode = (attemptsCount2 * 59) + (fullImageURI2 == null ? 43 : fullImageURI2.hashCode());
        String retakeMessage2 = getRetakeMessage();
        int hashCode2 = (hashCode * 59) + (retakeMessage2 == null ? 43 : retakeMessage2.hashCode());
        String waterMarkFullImageUri2 = getWaterMarkFullImageUri();
        int hashCode3 = (hashCode2 * 59) + (waterMarkFullImageUri2 == null ? 43 : waterMarkFullImageUri2.hashCode());
        String waterMarkCroppedImageUri2 = getWaterMarkCroppedImageUri();
        int hashCode4 = (hashCode3 * 59) + (waterMarkCroppedImageUri2 == null ? 43 : waterMarkCroppedImageUri2.hashCode());
        String action2 = getAction();
        int hashCode5 = (hashCode4 * 59) + (action2 == null ? 43 : action2.hashCode());
        JSONObject apiResult2 = getApiResult();
        int hashCode6 = (hashCode5 * 59) + (apiResult2 == null ? 43 : apiResult2.hashCode());
        JSONObject apiHeaders2 = getApiHeaders();
        int hashCode7 = (hashCode6 * 59) + (apiHeaders2 == null ? 43 : apiHeaders2.hashCode());
        String videoUri2 = getVideoUri();
        int i12 = hashCode7 * 59;
        if (videoUri2 != null) {
            i11 = videoUri2.hashCode();
        }
        return i12 + i11;
    }

    public boolean isVideoRecorded() {
        return !e.a(this.videoUri);
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setApiHeaders(JSONObject jSONObject) {
        this.apiHeaders = jSONObject;
    }

    public void setApiResult(JSONObject jSONObject) {
        this.apiResult = jSONObject;
    }

    public void setAttemptsCount(int i11) {
        this.attemptsCount = i11;
    }

    public void setFullImageURI(String str) {
        this.fullImageURI = str;
    }

    public void setImageURI(String str) {
        this.imageURI = str;
    }

    public void setRetakeMessage(String str) {
        this.retakeMessage = str;
    }

    public void setVideoUri(String str) {
        this.videoUri = str;
    }

    public void setWaterMarkCroppedImageUri(String str) {
        this.waterMarkCroppedImageUri = str;
    }

    public void setWaterMarkFullImageUri(String str) {
        this.waterMarkFullImageUri = str;
    }

    public String toString() {
        return "HVResponse(imageURI=" + getImageURI() + ", attemptsCount=" + getAttemptsCount() + ", fullImageURI=" + getFullImageURI() + ", retakeMessage=" + getRetakeMessage() + ", waterMarkFullImageUri=" + getWaterMarkFullImageUri() + ", waterMarkCroppedImageUri=" + getWaterMarkCroppedImageUri() + ", action=" + getAction() + ", apiResult=" + getApiResult() + ", apiHeaders=" + getApiHeaders() + ", videoUri=" + getVideoUri() + ")";
    }

    public b(JSONObject jSONObject, JSONObject jSONObject2, String str, String str2) {
        this.apiResult = jSONObject;
        this.apiHeaders = jSONObject2;
        this.imageURI = str;
        this.action = str2;
        this.attemptsCount = 0;
    }
}
