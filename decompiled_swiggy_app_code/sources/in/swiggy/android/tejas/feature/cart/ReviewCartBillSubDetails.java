package in.swiggy.android.tejas.feature.cart;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import java.util.ArrayList;
import java.util.List;
import os.g0;

@Instrumented
public class ReviewCartBillSubDetails {
    @SerializedName("sub_details")
    public List<ReviewCartBillSubDetailsSecondHierarchy> mBillRendering = new ArrayList(1);
    @SerializedName("display_text")
    public String mDisplayText;
    @SerializedName("hierarchy")
    public String mHierarchy;
    @SerializedName("info_text")
    public String mInfoText;
    @SerializedName("is_collapsible")
    public String mIsCollapsible;
    @SerializedName("is_negative")
    public boolean mIsNegative;
    @SerializedName("key")
    public String mKey;
    @SerializedName("meta")
    public ReviewCartMetaInfo mMeta;
    @SerializedName("type")
    public String mType;
    @SerializedName("value")
    public String mValue;

    public String toString() {
        Gson i11 = g0.i();
        return !(i11 instanceof Gson) ? i11.toJson((Object) this) : GsonInstrumentation.toJson(i11, (Object) this);
    }
}
