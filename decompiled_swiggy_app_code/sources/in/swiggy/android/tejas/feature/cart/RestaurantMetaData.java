package in.swiggy.android.tejas.feature.cart;

import com.google.gson.annotations.SerializedName;

public class RestaurantMetaData {
    @SerializedName("corporatePasscode")
    public String corporatePasscode;
    @SerializedName("cafe")
    public boolean isCafe;
    @SerializedName("area")
    private String mArea;
    @SerializedName("coverImage")
    private String mCoverImage;
    @SerializedName("cuisineList")
    private String[] mCuisinesList;
    @SerializedName("id")
    private String mId;
    @SerializedName("isFestive")
    private boolean mIsFestive;
    @SerializedName("name")
    private String mName;

    private RestaurantMetaData() {
    }
}
