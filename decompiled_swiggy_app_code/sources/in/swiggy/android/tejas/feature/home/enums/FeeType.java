package in.swiggy.android.tejas.feature.home.enums;

import in.swiggy.android.tejas.oldapi.models.FeeDetail;

/* compiled from: FeeType.kt */
public enum FeeType {
    FEE_TYPE_SURGE("special"),
    FEE_TYPE_DISTANCE(FeeDetail.FEE_TYPE_LONG_DISTANCE),
    FEE_TYPE_TIME("time"),
    FEE_TYPE_FIX("fix");
    
    private final String type;

    private FeeType(String str) {
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }
}
