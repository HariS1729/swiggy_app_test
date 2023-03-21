package co.hyperverge.hypersnapsdk.objects;

import android.util.Log;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import org.json.JSONException;
import org.json.JSONObject;
import w5.n;

@Instrumented
public class HVDocConfig extends HVBaseConfig {
    public static final String KEY = "hvDocConfig";
    private static final String TAG = HVDocConfig.class.getCanonicalName();
    int allowedTiltPitch = 10;
    int allowedTiltRoll = 10;
    String customUIStrings;
    private int descTypeface;
    String docCaptureDescription;
    String docCaptureSubText;
    String docCaptureSubtitle;
    String docCaptureTitle;
    String docReviewDescription;
    String docReviewSubtitle;
    String docReviewTitle;
    Document document = Document.CARD;
    DocumentSide documentSide = DocumentSide.FRONT;
    boolean enableDocumentUpload = false;
    private int hintTypeface;
    public String ocrEndpoint;
    public String ocrHeaders;
    public String ocrParams;
    public float padding = 0.0f;
    private int reviewScreenConfirmButtonTypeface;
    private int reviewScreenDescTypeface;
    private int reviewScreenRetakeButtonTypeface;
    private int reviewScreenSubtitleTypeface;
    private int reviewScreenTitleTypeface;
    boolean shouldAllowPhoneTilt = true;
    boolean shouldDoIpToGeo = false;
    boolean shouldDoOCR = false;
    boolean shouldEnableRetries;
    boolean shouldExportPDF = false;
    boolean shouldReadQR = false;
    boolean shouldSetPadding = true;
    boolean shouldShowFlashIcon = false;
    boolean shouldShowInstructionPage = false;
    boolean shouldShowReviewScreen = false;
    private int subtitleTypeface;
    private int titleTypeface;

    public enum Document {
        CARD(0.625f) {
            public void setAspectRatio(float f11) {
            }
        },
        A4(1.5f) {
            public void setAspectRatio(float f11) {
            }
        },
        PASSPORT(0.6666667f) {
            public void setAspectRatio(float f11) {
            }
        },
        OTHER(0.5f) {
            public void setAspectRatio(float f11) {
                this.aspectRatio = f11;
            }
        };
        
        float aspectRatio;

        public float getAspectRatio() {
            return this.aspectRatio;
        }

        public abstract void setAspectRatio(float f11);

        private Document(float f11) {
            this.aspectRatio = f11;
        }
    }

    public enum DocumentSide {
        FRONT,
        BACK
    }

    public int getAllowedTiltPitch() {
        return this.allowedTiltPitch;
    }

    public int getAllowedTiltRoll() {
        return this.allowedTiltRoll;
    }

    public String getCapturePageSubtitleText() {
        return this.docCaptureSubtitle;
    }

    public String getCapturePageTitleText() {
        return this.docCaptureTitle;
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

    public int getDescTypeface() {
        return this.descTypeface;
    }

    public String getDocCaptureDescription() {
        return this.docCaptureDescription;
    }

    public String getDocCaptureSubText() {
        return this.docCaptureSubText;
    }

    public String getDocReviewDescription() {
        return this.docReviewDescription;
    }

    public String getDocReviewSubtitle() {
        return this.docReviewSubtitle;
    }

    public String getDocReviewTitle() {
        return this.docReviewTitle;
    }

    public Document getDocument() {
        return this.document;
    }

    public int getHintTypeface() {
        return this.hintTypeface;
    }

    public JSONObject getOcrHeaders() {
        try {
            if (this.ocrHeaders != null) {
                return new JSONObject(this.ocrHeaders);
            }
            return new JSONObject();
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public JSONObject getOcrParams() {
        try {
            if (this.ocrParams != null) {
                return new JSONObject(this.ocrParams);
            }
            return new JSONObject();
        } catch (Exception e11) {
            String str = TAG;
            Log.e(str, "getOcrParams: " + e11.getMessage());
            return new JSONObject();
        }
    }

    public int getReviewScreenConfirmButtonTypeface() {
        return this.reviewScreenConfirmButtonTypeface;
    }

    public int getReviewScreenDescTypeface() {
        return this.reviewScreenDescTypeface;
    }

    public int getReviewScreenRetakeButtonTypeface() {
        return this.reviewScreenRetakeButtonTypeface;
    }

    public int getReviewScreenSubtitleTypeface() {
        return this.reviewScreenSubtitleTypeface;
    }

    public int getReviewScreenTitleTypeface() {
        return this.reviewScreenTitleTypeface;
    }

    public int getSubtitleTypeface() {
        return this.subtitleTypeface;
    }

    public String getSuffixForDocument() {
        return this.documentSide == DocumentSide.FRONT ? "front" : "back";
    }

    public int getTitleTypeface() {
        return this.titleTypeface;
    }

    public boolean isDocumentUploadEnabled() {
        return this.enableDocumentUpload;
    }

    public boolean isShouldAllowPhoneTilt() {
        return this.shouldAllowPhoneTilt;
    }

    public boolean isShouldDoIpToGeo() {
        return this.shouldDoIpToGeo;
    }

    public boolean isShouldDoOCR() {
        return this.shouldDoOCR;
    }

    public boolean isShouldEnableRetries() {
        return this.shouldEnableRetries;
    }

    public boolean isShouldExportPDF() {
        return this.shouldExportPDF;
    }

    public boolean isShouldReadQR() {
        return this.shouldReadQR;
    }

    public boolean isShouldSetPadding() {
        return this.shouldSetPadding;
    }

    public boolean isShouldShowFlashIcon() {
        return this.shouldShowFlashIcon;
    }

    public boolean isShouldShowInstructionPage() {
        return this.shouldShowInstructionPage;
    }

    public void setCustomUIStrings(JSONObject jSONObject) {
        this.customUIStrings = !(jSONObject instanceof JSONObject) ? jSONObject.toString() : JSONObjectInstrumentation.toString(jSONObject);
    }

    public void setDescTypeFace(int i11) {
        this.descTypeface = i11;
    }

    public void setDocCaptureDescription(String str) {
        this.docCaptureDescription = str;
    }

    public void setDocCaptureSubText(String str) {
        this.docCaptureSubText = str;
    }

    public void setDocCaptureSubtitle(String str) {
        this.docCaptureSubtitle = str;
    }

    public void setDocCaptureTitle(String str) {
        this.docCaptureTitle = str;
    }

    public void setDocReviewDescription(String str) {
        this.docReviewDescription = str;
    }

    public void setDocReviewSubtitle(String str) {
        this.docReviewSubtitle = str;
    }

    public void setDocReviewTitle(String str) {
        this.docReviewTitle = str;
    }

    public void setDocumentType(Document document2) {
        this.document = document2;
    }

    public void setEnableDocumentUpload(boolean z11) {
        this.enableDocumentUpload = z11;
    }

    public void setHintTypeface(int i11) {
        this.hintTypeface = i11;
    }

    public void setOCRDetails(String str, DocumentSide documentSide2, String str2, String str3) {
        this.ocrEndpoint = str;
        this.ocrParams = str2;
        this.ocrHeaders = str3;
        this.documentSide = documentSide2;
        this.shouldEnableRetries = true;
        this.shouldDoOCR = true;
    }

    public void setPadding(float f11) {
        this.shouldSetPadding = true;
        this.padding = f11;
    }

    public void setPhoneTiltConstraints(int i11, int i12) {
        this.allowedTiltRoll = i11;
        this.allowedTiltPitch = i12;
    }

    public void setReviewScreenConfirmButtonTypeface(int i11) {
        this.reviewScreenConfirmButtonTypeface = i11;
    }

    public void setReviewScreenDescTypeface(int i11) {
        this.reviewScreenDescTypeface = i11;
    }

    public void setReviewScreenRetakeButtonTypeface(int i11) {
        this.reviewScreenRetakeButtonTypeface = i11;
    }

    public void setReviewScreenSubtitleTypeface(int i11) {
        this.reviewScreenSubtitleTypeface = i11;
    }

    public void setReviewScreenTitleTypeface(int i11) {
        this.reviewScreenTitleTypeface = i11;
    }

    public void setShouldAddPadding(boolean z11) {
        this.shouldSetPadding = z11;
        if (z11) {
            setPadding(0.2f);
        }
    }

    public void setShouldAllowPhoneTilt(boolean z11) {
        this.shouldAllowPhoneTilt = z11;
    }

    public void setShouldEnableRetries(boolean z11) {
        this.shouldEnableRetries = z11;
    }

    public void setShouldExportPDF(boolean z11) {
        this.shouldExportPDF = z11;
    }

    public void setShouldReadQR(boolean z11) {
        this.shouldReadQR = z11;
    }

    public void setShouldShowFlashIcon(boolean z11) {
        this.shouldShowFlashIcon = z11;
    }

    public void setShouldShowInstructionPage(boolean z11) {
        this.shouldShowInstructionPage = z11;
    }

    public void setShouldShowReviewScreen(boolean z11) {
        this.shouldShowReviewScreen = z11;
    }

    public void setSubtitleTypeFace(int i11) {
        this.subtitleTypeface = i11;
    }

    public void setTitleTypeFace(int i11) {
        this.titleTypeface = i11;
    }

    public boolean shouldShowReviewScreen() {
        return this.shouldShowReviewScreen;
    }
}
