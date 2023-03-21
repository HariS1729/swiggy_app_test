package in.swiggy.android.tejas.feature.cart;

import com.google.gson.annotations.SerializedName;

public class CartConfiguration {
    @SerializedName("address_change_not_allowed")
    private boolean mAddressChangeNotAllowed;
    @SerializedName("only_cod")
    private boolean mOnlyCod;
    @SerializedName("user_comments_not_allowed")
    private boolean mUserCommentsNotAllowed;
    @SerializedName("show_cutlery_instruction")
    private Boolean showCutleryInstruction;

    public Boolean getShowCutleryInstruction() {
        return this.showCutleryInstruction;
    }

    public boolean isAddressChangeNotAllowed() {
        return this.mAddressChangeNotAllowed;
    }

    public boolean isOnlyCod() {
        return this.mOnlyCod;
    }

    public boolean isUserCommentsNotAllowed() {
        return this.mUserCommentsNotAllowed;
    }

    public void setAddressChangeNotAllowed(boolean z11) {
        this.mAddressChangeNotAllowed = z11;
    }

    public void setOnlyCod(boolean z11) {
        this.mOnlyCod = z11;
    }

    public void setShowCutleryInstruction(Boolean bool) {
        this.showCutleryInstruction = bool;
    }

    public void setUserCommentsNotAllowed(boolean z11) {
        this.mUserCommentsNotAllowed = z11;
    }
}
