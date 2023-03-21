package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.widgets.v2.Analytics;
import com.swiggy.gandalf.widgets.v2.Card;
import com.swiggy.gandalf.widgets.v2.Cta;
import com.swiggy.gandalf.widgets.v2.Layout;
import com.swiggy.gandalf.widgets.v2.SuccessResponse;
import com.swiggy.gandalf.widgets.v2.ThemeDropWidget;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.pageconfig.ThemeDrop;
import in.swiggy.android.tejas.feature.listing.accessibility.models.AccessibilityData;
import in.swiggy.android.tejas.feature.listing.grid.model.PopupInfo;
import in.swiggy.android.tejas.feature.listing.grid.model.WidgetTheme;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: ThemeDropConfigTransformer.kt */
public final class ThemeDropConfigTransformer implements ITransformer<SuccessResponse.PageConfigs, List<? extends ThemeDrop>> {
    private final ITransformer<Layout.Theme, WidgetTheme> gridThemeTransformer;

    public ThemeDropConfigTransformer(ITransformer<Layout.Theme, WidgetTheme> iTransformer) {
        p.j(iTransformer, "gridThemeTransformer");
        this.gridThemeTransformer = iTransformer;
    }

    public List<ThemeDrop> transform(SuccessResponse.PageConfigs pageConfigs) {
        ThemeDropWidget themeDropWidget;
        p.j(pageConfigs, t.V);
        ArrayList arrayList = new ArrayList();
        List<Card> configInfoList = pageConfigs.getConfigInfoList();
        p.i(configInfoList, "configInfoList");
        for (Card card : configInfoList) {
            if (card.getCard().is(ThemeDropWidget.class) && (themeDropWidget = (ThemeDropWidget) card.getCard().unpack(ThemeDropWidget.class)) != null) {
                String accountIcon = themeDropWidget.getAccountIcon();
                String backgroundImage = themeDropWidget.getBackgroundImage();
                String footerImage = themeDropWidget.getFooterImage();
                String themeId = themeDropWidget.getThemeId();
                ITransformer<Layout.Theme, WidgetTheme> iTransformer = this.gridThemeTransformer;
                Layout.Theme widgetTheme = themeDropWidget.getWidgetTheme();
                p.i(widgetTheme, "widgetTheme");
                Analytics analytics = themeDropWidget.getAnalytics();
                String title = themeDropWidget.getPopupInfo().getTitle();
                String subTitle = themeDropWidget.getPopupInfo().getSubTitle();
                Cta cta = themeDropWidget.getPopupInfo().getCta();
                String imageId = themeDropWidget.getPopupInfo().getImageId();
                p.i(cta, "cta");
                arrayList.add(new ThemeDrop((AccessibilityData) null, accountIcon, analytics, true, backgroundImage, footerImage, themeId, iTransformer.transform(widgetTheme), new PopupInfo(title, imageId, subTitle, cta), 1, (i) null));
            }
        }
        return arrayList;
    }
}
