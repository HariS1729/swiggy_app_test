package in.swiggy.android.tejas.feature.address.model;

import com.google.gson.annotations.SerializedName;

/* compiled from: AddressNudge.kt */
public final class AddressNudge {
    @SerializedName("cta_address_edit_text")
    private String nudgeCtaAddressEditText;
    @SerializedName("cta_info")
    private String nudgeCtaInfo;
    @SerializedName("cta_text")
    private String nudgeCtaText;

    public final String getNudgeCtaAddressEditText() {
        return this.nudgeCtaAddressEditText;
    }

    public final String getNudgeCtaInfo() {
        return this.nudgeCtaInfo;
    }

    public final String getNudgeCtaText() {
        return this.nudgeCtaText;
    }

    public final void setNudgeCtaAddressEditText(String str) {
        this.nudgeCtaAddressEditText = str;
    }

    public final void setNudgeCtaInfo(String str) {
        this.nudgeCtaInfo = str;
    }

    public final void setNudgeCtaText(String str) {
        this.nudgeCtaText = str;
    }
}
