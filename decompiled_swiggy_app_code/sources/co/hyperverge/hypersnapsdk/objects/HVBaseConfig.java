package co.hyperverge.hypersnapsdk.objects;

import java.io.Serializable;

public class HVBaseConfig implements Serializable {
    private String closeAlertDialogDesc;
    private String closeAlertDialogTitle;
    private String errorReviewRetakeButton;
    private int errorReviewScreenDescTypeface;
    private int errorReviewScreenRetakeButtonTypeface;
    private int errorReviewScreenTitleTypeface;
    private String errorReviewTitle;
    private boolean shouldShowCloseAlert = false;
    private boolean showTrustLogos = false;

    public String getCloseAlertDialogDesc() {
        return this.closeAlertDialogDesc;
    }

    public String getCloseAlertDialogTitle() {
        return this.closeAlertDialogTitle;
    }

    public int getErroReviewScreenRetakeButtonTypeface() {
        return this.errorReviewScreenRetakeButtonTypeface;
    }

    public String getErrorReviewRetakeButton() {
        return this.errorReviewRetakeButton;
    }

    public int getErrorReviewScreenDescTypeface() {
        return this.errorReviewScreenDescTypeface;
    }

    public int getErrorReviewScreenTitleTypeface() {
        return this.errorReviewScreenTitleTypeface;
    }

    public String getErrorReviewTitle() {
        return this.errorReviewTitle;
    }

    public void setCloseAlertDialogDesc(String str) {
        this.closeAlertDialogDesc = str;
    }

    public void setCloseAlertDialogTitle(String str) {
        this.closeAlertDialogTitle = str;
    }

    public void setErroReviewScreenRetakeButtonTypeface(int i11) {
        this.errorReviewScreenRetakeButtonTypeface = i11;
    }

    public void setErrorReviewRetakeButton(String str) {
        this.errorReviewRetakeButton = str;
    }

    public void setErrorReviewScreenDescTypeface(int i11) {
        this.errorReviewScreenDescTypeface = i11;
    }

    public void setErrorReviewScreenTitleTypeface(int i11) {
        this.errorReviewScreenTitleTypeface = i11;
    }

    public void setErrorReviewTitle(String str) {
        this.errorReviewTitle = str;
    }

    public void setShouldShowCloseAlert(boolean z11) {
        this.shouldShowCloseAlert = z11;
    }

    public void setShowTrustLogos(boolean z11) {
        this.showTrustLogos = z11;
    }

    public boolean shouldShowCloseAlert() {
        return this.shouldShowCloseAlert;
    }

    public boolean shouldShowTrustLogos() {
        return this.showTrustLogos;
    }
}
