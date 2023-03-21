package in.swiggy.android.tejas.feature.home.model.multicreative;

/* compiled from: CallOutType.kt */
public enum CallOutType {
    CALLOUT_TYPE_INVALID("INVALID"),
    CALLOUT_TYPE_DISH("DISH"),
    CALLOUT_TYPE_OUTLET("OUTLET"),
    CALLOUT_TYPE_RESTAURANT("RESTAURANT");
    
    private final String type;

    private CallOutType(String str) {
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }
}
