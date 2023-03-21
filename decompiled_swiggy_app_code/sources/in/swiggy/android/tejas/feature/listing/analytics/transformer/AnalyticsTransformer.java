package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.gandalf.widgets.v2.Analytics;
import i20.t;
import in.swiggy.android.tejas.feature.listing.analytics.model.AnalyticsData;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: AnalyticsTransformer.kt */
public final class AnalyticsTransformer implements ITransformer<Analytics, AnalyticsData> {
    public final String nullifyBlankField(String str) {
        p.j(str, "value");
        if (!o.A(str)) {
            return str;
        }
        return null;
    }

    public AnalyticsData transform(Analytics analytics) {
        p.j(analytics, t.V);
        String screenName = analytics.getScreenName();
        p.i(screenName, "t.screenName");
        if (!(!o.A(screenName))) {
            return null;
        }
        String screenName2 = analytics.getScreenName();
        p.i(screenName2, "t.screenName");
        String objectValue = analytics.getObjectValue();
        p.i(objectValue, "t.objectValue");
        String nullifyBlankField = nullifyBlankField(objectValue);
        String context = analytics.getContext();
        p.i(context, "t.context");
        String nullifyBlankField2 = nullifyBlankField(context);
        String impressionObjectName = analytics.getImpressionObjectName();
        p.i(impressionObjectName, "t.impressionObjectName");
        String nullifyBlankField3 = nullifyBlankField(impressionObjectName);
        String clickObjectName = analytics.getClickObjectName();
        p.i(clickObjectName, "t.clickObjectName");
        String nullifyBlankField4 = nullifyBlankField(clickObjectName);
        String attributionContext = analytics.getAttributionContext();
        p.i(attributionContext, "t.attributionContext");
        return new AnalyticsData(screenName2, nullifyBlankField, nullifyBlankField2, nullifyBlankField3, nullifyBlankField4, (Integer) null, nullifyBlankField(attributionContext), 32, (i) null);
    }
}
