package in.swiggy.android.tejas.feature.cart;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class CartItem {
    @SerializedName("addons")
    public ArrayList mAddonChoices = new ArrayList(1);
    @SerializedName("variants")
    public ArrayList mGroupVariations = new ArrayList(1);
    @SerializedName("menu_item_id")
    public String mMenuItemId;
    @SerializedName("quantity")
    public int mQuantity;
    @SerializedName("rewardType")
    public String mRewardType;
    @SerializedName("skuId")
    public String mSkuId;
}
