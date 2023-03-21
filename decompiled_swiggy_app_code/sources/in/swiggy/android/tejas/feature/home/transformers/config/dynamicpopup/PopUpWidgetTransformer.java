package in.swiggy.android.tejas.feature.home.transformers.config.dynamicpopup;

import com.swiggy.gandalf.widgets.v2.Cta;
import com.swiggy.gandalf.widgets.v2.DynamicInfo;
import com.swiggy.gandalf.widgets.v2.FrequencyCapping;
import com.swiggy.gandalf.widgets.v2.PopUpWidget;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.DynamicData;
import in.swiggy.android.tejas.feature.home.model.pageconfig.BannerType;
import in.swiggy.android.tejas.feature.home.model.pageconfig.CardType;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomePopUpWidget;
import in.swiggy.android.tejas.feature.home.model.pageconfig.PopUpWidgetCrossButtonPosition;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: PopUpWidgetTransformer.kt */
public final class PopUpWidgetTransformer implements ITransformer<PopUpWidget, HomePopUpWidget> {
    private final ITransformer<PopUpWidget.BannerType, BannerType> bannerTypeTransformer;
    private final PopUpWidgetCardTypeTransformer cardTypeTransformer;
    private final ITransformer<Cta, CTA> ctaTransformer;
    private final DynamicDataTransformer dynamicInfoTransformer;
    private final ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping> frequencyCappingTransformer;
    private final ITransformer<PopUpWidget.CrossButtonPosition, PopUpWidgetCrossButtonPosition> positionTransformer;

    public PopUpWidgetTransformer(ITransformer<PopUpWidget.CrossButtonPosition, PopUpWidgetCrossButtonPosition> iTransformer, PopUpWidgetCardTypeTransformer popUpWidgetCardTypeTransformer, ITransformer<PopUpWidget.BannerType, BannerType> iTransformer2, ITransformer<Cta, CTA> iTransformer3, DynamicDataTransformer dynamicDataTransformer, ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping> iTransformer4) {
        p.j(iTransformer, "positionTransformer");
        p.j(popUpWidgetCardTypeTransformer, "cardTypeTransformer");
        p.j(iTransformer2, "bannerTypeTransformer");
        p.j(iTransformer3, "ctaTransformer");
        p.j(dynamicDataTransformer, "dynamicInfoTransformer");
        p.j(iTransformer4, "frequencyCappingTransformer");
        this.positionTransformer = iTransformer;
        this.cardTypeTransformer = popUpWidgetCardTypeTransformer;
        this.bannerTypeTransformer = iTransformer2;
        this.ctaTransformer = iTransformer3;
        this.dynamicInfoTransformer = dynamicDataTransformer;
        this.frequencyCappingTransformer = iTransformer4;
    }

    public final ITransformer<Cta, CTA> getCtaTransformer() {
        return this.ctaTransformer;
    }

    public final ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping> getFrequencyCappingTransformer() {
        return this.frequencyCappingTransformer;
    }

    public HomePopUpWidget transform(PopUpWidget popUpWidget) {
        p.j(popUpWidget, t.V);
        ITransformer<PopUpWidget.CrossButtonPosition, PopUpWidgetCrossButtonPosition> iTransformer = this.positionTransformer;
        PopUpWidget.CrossButtonPosition position = popUpWidget.getPosition();
        p.i(position, "t.position");
        PopUpWidgetCrossButtonPosition transform = iTransformer.transform(position);
        if (transform == null) {
            transform = PopUpWidgetCrossButtonPosition.INVALID;
        }
        PopUpWidgetCrossButtonPosition popUpWidgetCrossButtonPosition = transform;
        PopUpWidgetCardTypeTransformer popUpWidgetCardTypeTransformer = this.cardTypeTransformer;
        PopUpWidget.CardType cardType = popUpWidget.getCardType();
        p.i(cardType, "t.cardType");
        CardType transform2 = popUpWidgetCardTypeTransformer.transform(cardType);
        if (transform2 == null) {
            transform2 = CardType.POPUP;
        }
        CardType cardType2 = transform2;
        ITransformer<PopUpWidget.BannerType, BannerType> iTransformer2 = this.bannerTypeTransformer;
        PopUpWidget.BannerType bannerType = popUpWidget.getBannerType();
        p.i(bannerType, "t.bannerType");
        BannerType transform3 = iTransformer2.transform(bannerType);
        if (transform3 == null) {
            transform3 = BannerType.INVALID;
        }
        boolean backgroundTransparency = popUpWidget.getBackgroundTransparency();
        int horizontalMargin = popUpWidget.getHorizontalMargin();
        float aspectRatio = popUpWidget.getAspectRatio();
        String url = popUpWidget.getUrl();
        String str = url;
        p.i(url, "url");
        int maxCount = popUpWidget.getMaxCount();
        boolean dismissible = popUpWidget.getDismissible();
        ITransformer<Cta, CTA> ctaTransformer2 = getCtaTransformer();
        Cta cta = popUpWidget.getCta();
        p.i(cta, "t.cta");
        String entityId = popUpWidget.getEntityId();
        String str2 = entityId;
        p.i(entityId, "entityId");
        String entityType = popUpWidget.getEntityType();
        String str3 = entityType;
        HomePopUpWidget homePopUpWidget = r3;
        p.i(entityType, "entityType");
        boolean isFrequencyCappingEnabled = popUpWidget.getIsFrequencyCappingEnabled();
        int autoCloseTime = popUpWidget.getAutoCloseTime();
        boolean autodismiss = popUpWidget.getAutodismiss();
        DynamicDataTransformer dynamicDataTransformer = this.dynamicInfoTransformer;
        List<DynamicInfo> dynamicInfoList = popUpWidget.getDynamicInfoList();
        p.i(dynamicInfoList, "dynamicInfoList");
        List<DynamicData> transform4 = dynamicDataTransformer.transform(dynamicInfoList);
        ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping> frequencyCappingTransformer2 = getFrequencyCappingTransformer();
        FrequencyCapping frequencyCapping = popUpWidget.getFrequencyCapping();
        p.i(frequencyCapping, "t.frequencyCapping");
        HomePopUpWidget homePopUpWidget2 = new HomePopUpWidget(backgroundTransparency, popUpWidgetCrossButtonPosition, cardType2, transform3, horizontalMargin, aspectRatio, str, maxCount, dismissible, ctaTransformer2.transform(cta), str2, str3, isFrequencyCappingEnabled, autoCloseTime, autodismiss, transform4, frequencyCappingTransformer2.transform(frequencyCapping));
        return homePopUpWidget;
    }
}
