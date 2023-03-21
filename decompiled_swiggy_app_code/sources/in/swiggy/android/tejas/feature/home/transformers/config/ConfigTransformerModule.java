package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.home.protobuf.SuccessReponseDto;
import com.swiggy.gandalf.widgets.v2.CPPopupWidget;
import com.swiggy.gandalf.widgets.v2.CreativeType;
import com.swiggy.gandalf.widgets.v2.Crouton;
import com.swiggy.gandalf.widgets.v2.Cta;
import com.swiggy.gandalf.widgets.v2.FrequencyCapping;
import com.swiggy.gandalf.widgets.v2.PopUpWidget;
import com.swiggy.gandalf.widgets.v2.RichText;
import com.swiggy.gandalf.widgets.v2.TextBanner;
import com.swiggy.gandalf.widgets.v2.VideoPopup;
import com.swiggy.gandalf.widgets.v2.Videos;
import in.swiggy.android.tejas.feature.home.model.pageconfig.BannerType;
import in.swiggy.android.tejas.feature.home.model.pageconfig.CardType;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeConfig;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeCrouton;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeCroutonData;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomePopUpWidget;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomePopup;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeVideoPopup;
import in.swiggy.android.tejas.feature.home.model.pageconfig.PopUpWidgetCrossButtonPosition;
import in.swiggy.android.tejas.feature.home.model.pageconfig.PopupPosition;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.BottomBarPopup;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.BottomBarPopupCard;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.BottomBarPopupCardType;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.BusinessLineInfo;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.Frequency;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.TextLine;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.TextStyle;
import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.CTAInfo;
import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.MetaInfo;
import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.TextInfo;
import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.WidgetInfo;
import in.swiggy.android.tejas.feature.home.transformers.FrequencyCappingTransformer;
import in.swiggy.android.tejas.feature.home.transformers.config.crouton.CroutonConfigTransformer;
import in.swiggy.android.tejas.feature.home.transformers.config.crouton.CroutonMetaInfoTransformer;
import in.swiggy.android.tejas.feature.home.transformers.config.dynamicpopup.PopUpWidgetBannerTypeTransformer;
import in.swiggy.android.tejas.feature.home.transformers.config.dynamicpopup.PopUpWidgetCardTypeTransformer;
import in.swiggy.android.tejas.feature.home.transformers.config.dynamicpopup.PopUpWidgetPositionTransformer;
import in.swiggy.android.tejas.feature.home.transformers.config.dynamicpopup.PopUpWidgetTransformer;
import in.swiggy.android.tejas.feature.home.transformers.config.splash.CtaInfoTransformer;
import in.swiggy.android.tejas.feature.home.transformers.config.splash.MetaInfoTransformer;
import in.swiggy.android.tejas.feature.home.transformers.config.splash.SplashWidgetTransformer;
import in.swiggy.android.tejas.feature.home.transformers.config.splash.TextInfoTransformer;
import in.swiggy.android.tejas.feature.home.transformers.config.video.PopupPositionTransformer;
import in.swiggy.android.tejas.feature.home.transformers.config.video.VideoIdTransformer;
import in.swiggy.android.tejas.feature.home.transformers.config.video.VideoPopupConfigTransformer;
import in.swiggy.android.tejas.feature.home.transformers.config.video.VideoTransformer;
import in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup.BottomBarPopupCardTransformer;
import in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup.BottomBarPopupTransformer;
import in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup.BusinessLineInfoTransformer;
import in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup.CreativeTransformer;
import in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup.FrequencyTransformer;
import in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup.TextLineTransformer;
import in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup.TextStyleTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: ConfigTransformerModule.kt */
public final class ConfigTransformerModule {
    public static final ConfigTransformerModule INSTANCE = new ConfigTransformerModule();

    private ConfigTransformerModule() {
    }

    public static final ITransformer<CPPopupWidget.MultiTypeCreative, BottomBarPopupCard> providesBottomBarPopupCardTransformer(BottomBarPopupCardTransformer bottomBarPopupCardTransformer) {
        p.j(bottomBarPopupCardTransformer, "bottomBarPopupCardTransformer");
        return bottomBarPopupCardTransformer;
    }

    public static final ITransformer<CPPopupWidget, BottomBarPopup> providesBottomBarPopupTransformer(BottomBarPopupTransformer bottomBarPopupTransformer) {
        p.j(bottomBarPopupTransformer, "bottomBarPopupTransformer");
        return bottomBarPopupTransformer;
    }

    public static final ITransformer<CPPopupWidget.BLInfo, BusinessLineInfo> providesBusinessLineInfoTransformer(BusinessLineInfoTransformer businessLineInfoTransformer) {
        p.j(businessLineInfoTransformer, "businessLineInfoTransformer");
        return businessLineInfoTransformer;
    }

    public static final ITransformer<CreativeType, BottomBarPopupCardType> providesCreativeTransformer(CreativeTransformer creativeTransformer) {
        p.j(creativeTransformer, "creativeTransformer");
        return creativeTransformer;
    }

    public static final ITransformer<SuccessReponseDto.PageConfigs, List<HomeCrouton>> providesCroutonConfigTransformer(CroutonConfigTransformer croutonConfigTransformer) {
        p.j(croutonConfigTransformer, "croutonConfigTransformer");
        return croutonConfigTransformer;
    }

    public static final ITransformer<Crouton, HomeCroutonData> providesCroutonTransformer(CroutonMetaInfoTransformer croutonMetaInfoTransformer) {
        p.j(croutonMetaInfoTransformer, "croutonMetaInfoTransformer");
        return croutonMetaInfoTransformer;
    }

    public static final ITransformer<Cta, CTAInfo> providesCtaInfoTransformer(CtaInfoTransformer ctaInfoTransformer) {
        p.j(ctaInfoTransformer, "ctaInfoTransformer");
        return ctaInfoTransformer;
    }

    public static final ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping> providesFrequencyCappingTransformer(FrequencyCappingTransformer frequencyCappingTransformer) {
        p.j(frequencyCappingTransformer, "frequencyCappingTransformer");
        return frequencyCappingTransformer;
    }

    public static final ITransformer<CPPopupWidget.CPPopupFrequencyCapping, Frequency> providesFrequencyTransformer(FrequencyTransformer frequencyTransformer) {
        p.j(frequencyTransformer, "frequencyTransformer");
        return frequencyTransformer;
    }

    public static final ITransformer<Cta.CtaMeta, MetaInfo> providesMetaInfoTransformer(MetaInfoTransformer metaInfoTransformer) {
        p.j(metaInfoTransformer, "metaInfoTransformer");
        return metaInfoTransformer;
    }

    public static final ITransformer<PopUpWidget.BannerType, BannerType> providesPopUpWidgetBannerTransFormer(PopUpWidgetBannerTypeTransformer popUpWidgetBannerTypeTransformer) {
        p.j(popUpWidgetBannerTypeTransformer, "popUpWidgetBannerTypeTransformer");
        return popUpWidgetBannerTypeTransformer;
    }

    public static final ITransformer<PopUpWidget.CardType, CardType> providesPopUpWidgetCardTypeTransformer(PopUpWidgetCardTypeTransformer popUpWidgetCardTypeTransformer) {
        p.j(popUpWidgetCardTypeTransformer, "popUpWidgetCardTypeTransformer");
        return popUpWidgetCardTypeTransformer;
    }

    public static final ITransformer<PopUpWidget.CrossButtonPosition, PopUpWidgetCrossButtonPosition> providesPopUpWidgetPositionTransformer(PopUpWidgetPositionTransformer popUpWidgetPositionTransformer) {
        p.j(popUpWidgetPositionTransformer, "positionTransformer");
        return popUpWidgetPositionTransformer;
    }

    public static final ITransformer<PopUpWidget, HomePopUpWidget> providesPopUpWidgetTransformer(PopUpWidgetTransformer popUpWidgetTransformer) {
        p.j(popUpWidgetTransformer, "popUpWidgetTransformer");
        return popUpWidgetTransformer;
    }

    public static final ITransformer<SuccessReponseDto.PageConfigs, List<HomePopup>> providesPopupConfigCardTransformer(PopupConfigTransformer popupConfigTransformer) {
        p.j(popupConfigTransformer, "popupConfigTransformer");
        return popupConfigTransformer;
    }

    public static final ITransformer<VideoPopup.Position, PopupPosition> providesPopupPositionTransformer(PopupPositionTransformer popupPositionTransformer) {
        p.j(popupPositionTransformer, "popupPositionTransformer");
        return popupPositionTransformer;
    }

    public static final ITransformer<SuccessReponseDto.PageConfigs, List<HomeConfig>> providesSplashConfigTransformer(SplashConfigTransformer splashConfigTransformer) {
        p.j(splashConfigTransformer, "splashConfigTransformer");
        return splashConfigTransformer;
    }

    public static final ITransformer<TextBanner, WidgetInfo> providesSplashWidgetTransformer(SplashWidgetTransformer splashWidgetTransformer) {
        p.j(splashWidgetTransformer, "splashWidgetTransformer");
        return splashWidgetTransformer;
    }

    public static final ITransformer<RichText, TextInfo> providesTextInfoTransformer(TextInfoTransformer textInfoTransformer) {
        p.j(textInfoTransformer, "textInfoTransformer");
        return textInfoTransformer;
    }

    public static final ITransformer<CPPopupWidget.RenderableInfo, TextLine> providesTextLineTransformer(TextLineTransformer textLineTransformer) {
        p.j(textLineTransformer, "textLineTransformer");
        return textLineTransformer;
    }

    public static final ITransformer<CPPopupWidget.TextStyle, TextStyle> providesTextStyleTransformer(TextStyleTransformer textStyleTransformer) {
        p.j(textStyleTransformer, "textStyleTransformer");
        return textStyleTransformer;
    }

    public static final ITransformer<String, String> providesVideoIdTransformer(VideoIdTransformer videoIdTransformer) {
        p.j(videoIdTransformer, "videoIdTransformer");
        return videoIdTransformer;
    }

    public static final ITransformer<VideoPopup, HomeVideoPopup> providesVideoPopupConfigTransformer(VideoPopupConfigTransformer videoPopupConfigTransformer) {
        p.j(videoPopupConfigTransformer, "videoPopupConfigTransformer");
        return videoPopupConfigTransformer;
    }

    public static final ITransformer<Videos, HomeVideoPopup.Videos> providesVideoTransformer(VideoTransformer videoTransformer) {
        p.j(videoTransformer, "videoTransformer");
        return videoTransformer;
    }
}
