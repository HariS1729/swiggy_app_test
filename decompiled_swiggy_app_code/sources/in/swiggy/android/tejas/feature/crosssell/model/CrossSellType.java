package in.swiggy.android.tejas.feature.crosssell.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: CrossSellType.kt */
public final class CrossSellType {
    public static final String CROSS_SELL = "CROSS_SELL";
    public static final String CROSS_SELL_HEALTHY = "CROSS_SELL_HEALTHY";
    public static final CrossSellType INSTANCE = new CrossSellType();

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: CrossSellType.kt */
    public @interface CrossSellThemeType {
    }

    private CrossSellType() {
    }
}
