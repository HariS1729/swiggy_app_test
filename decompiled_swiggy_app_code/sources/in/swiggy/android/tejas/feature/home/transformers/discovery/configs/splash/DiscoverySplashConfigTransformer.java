package in.swiggy.android.tejas.feature.home.transformers.discovery.configs.splash;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import com.swiggy.gandalf.widgets.v2.Card;
import com.swiggy.gandalf.widgets.v2.FrequencyCapping;
import com.swiggy.gandalf.widgets.v2.SplashScreen;
import com.swiggy.gandalf.widgets.v2.SuccessResponse;
import com.swiggy.gandalf.widgets.v2.TextBanner;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeConfig;
import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.SplashConfig;
import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.WidgetInfo;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: DiscoverySplashConfigTransformer.kt */
public final class DiscoverySplashConfigTransformer implements ITransformer<SuccessResponse.PageConfigs, List<? extends HomeConfig>> {
    private final ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping> frequencyCappingTransformer;
    private final ITransformer<TextBanner, WidgetInfo> splashWidgetTransformer;

    public DiscoverySplashConfigTransformer(ITransformer<TextBanner, WidgetInfo> iTransformer, ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping> iTransformer2) {
        p.j(iTransformer, "splashWidgetTransformer");
        p.j(iTransformer2, "frequencyCappingTransformer");
        this.splashWidgetTransformer = iTransformer;
        this.frequencyCappingTransformer = iTransformer2;
    }

    public List<HomeConfig> transform(SuccessResponse.PageConfigs pageConfigs) {
        SplashScreen splashScreen;
        p.j(pageConfigs, t.V);
        ArrayList arrayList = new ArrayList();
        List<Card> configInfoList = pageConfigs.getConfigInfoList();
        p.i(configInfoList, "configInfoList");
        for (Card card : configInfoList) {
            if (card.getCard().is(SplashScreen.class) && (splashScreen = (SplashScreen) card.getCard().unpack(SplashScreen.class)) != null) {
                String id2 = splashScreen.getId();
                p.i(id2, DistributedTracing.NR_ID_ATTRIBUTE);
                ITransformer<TextBanner, WidgetInfo> iTransformer = this.splashWidgetTransformer;
                TextBanner textInfo = splashScreen.getTextInfo();
                p.i(textInfo, "textInfo");
                int screenHoldTime = splashScreen.getScreenHoldTime();
                int maxViews = splashScreen.getMaxViews();
                String entityType = splashScreen.getEntityType();
                ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping> iTransformer2 = this.frequencyCappingTransformer;
                FrequencyCapping frequencyCapping = splashScreen.getFrequencyCapping();
                p.i(frequencyCapping, "frequencyCapping");
                arrayList.add(new SplashConfig(id2, iTransformer.transform(textInfo), screenHoldTime, maxViews, entityType, iTransformer2.transform(frequencyCapping)));
            }
        }
        return arrayList;
    }
}
