package in.swiggy.android.tejas.feature.cart;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import os.g0;

@Instrumented
public class ReviewCartMetaInfo {
    public static final String DATA_TYPE_STRING = "string";
    public static final String FONT_WEIGHT_BOLD = "bold";
    public static final String FONT_WEIGHT_LIGHT = "light";
    public static final String FONT_WEIGHT_NORMAL = "normal";
    public static final String WIDTH_LARGE = "L";
    public static final String WIDTH_XL = "XL";
    public static final String WIDTH_XXL = "XXL";
    @SerializedName("infoTextColor")
    public String infoTextColor;
    @SerializedName("intermediateTextColor")
    public String intermediateTextColor;
    @SerializedName("intermediateTextStriked")
    public boolean intermediateTextStriked;
    @SerializedName("align")
    public String mAlign;
    @SerializedName("bold")
    public boolean mBold;
    @SerializedName("color")
    public String mColor;
    @SerializedName("dataType")
    public String mDataType;
    @SerializedName("fontweight")
    public String mFontWeight;
    @SerializedName("valueTextColor")
    public String valueTextColor;
    @SerializedName("valueTextStriked")
    public boolean valueTextStriked;
    @SerializedName("windowWidth")
    public String windowWidth;

    public String toString() {
        Gson i11 = g0.i();
        return !(i11 instanceof Gson) ? i11.toJson((Object) this) : GsonInstrumentation.toJson(i11, (Object) this);
    }
}
