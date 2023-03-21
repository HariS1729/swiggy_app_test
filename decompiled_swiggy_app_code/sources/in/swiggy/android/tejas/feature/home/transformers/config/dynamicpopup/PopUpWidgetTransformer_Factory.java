package in.swiggy.android.tejas.feature.home.transformers.config.dynamicpopup;

import com.swiggy.gandalf.widgets.v2.Cta;
import com.swiggy.gandalf.widgets.v2.FrequencyCapping;
import com.swiggy.gandalf.widgets.v2.PopUpWidget;
import in.swiggy.android.tejas.feature.home.model.pageconfig.BannerType;
import in.swiggy.android.tejas.feature.home.model.pageconfig.PopUpWidgetCrossButtonPosition;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class PopUpWidgetTransformer_Factory implements e<PopUpWidgetTransformer> {
    private final Provider<ITransformer<PopUpWidget.BannerType, BannerType>> bannerTypeTransformerProvider;
    private final Provider<PopUpWidgetCardTypeTransformer> cardTypeTransformerProvider;
    private final Provider<ITransformer<Cta, CTA>> ctaTransformerProvider;
    private final Provider<DynamicDataTransformer> dynamicInfoTransformerProvider;
    private final Provider<ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping>> frequencyCappingTransformerProvider;
    private final Provider<ITransformer<PopUpWidget.CrossButtonPosition, PopUpWidgetCrossButtonPosition>> positionTransformerProvider;

    public PopUpWidgetTransformer_Factory(Provider<ITransformer<PopUpWidget.CrossButtonPosition, PopUpWidgetCrossButtonPosition>> provider, Provider<PopUpWidgetCardTypeTransformer> provider2, Provider<ITransformer<PopUpWidget.BannerType, BannerType>> provider3, Provider<ITransformer<Cta, CTA>> provider4, Provider<DynamicDataTransformer> provider5, Provider<ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping>> provider6) {
        this.positionTransformerProvider = provider;
        this.cardTypeTransformerProvider = provider2;
        this.bannerTypeTransformerProvider = provider3;
        this.ctaTransformerProvider = provider4;
        this.dynamicInfoTransformerProvider = provider5;
        this.frequencyCappingTransformerProvider = provider6;
    }

    public static PopUpWidgetTransformer_Factory create(Provider<ITransformer<PopUpWidget.CrossButtonPosition, PopUpWidgetCrossButtonPosition>> provider, Provider<PopUpWidgetCardTypeTransformer> provider2, Provider<ITransformer<PopUpWidget.BannerType, BannerType>> provider3, Provider<ITransformer<Cta, CTA>> provider4, Provider<DynamicDataTransformer> provider5, Provider<ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping>> provider6) {
        return new PopUpWidgetTransformer_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static PopUpWidgetTransformer newInstance(ITransformer<PopUpWidget.CrossButtonPosition, PopUpWidgetCrossButtonPosition> iTransformer, PopUpWidgetCardTypeTransformer popUpWidgetCardTypeTransformer, ITransformer<PopUpWidget.BannerType, BannerType> iTransformer2, ITransformer<Cta, CTA> iTransformer3, DynamicDataTransformer dynamicDataTransformer, ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping> iTransformer4) {
        return new PopUpWidgetTransformer(iTransformer, popUpWidgetCardTypeTransformer, iTransformer2, iTransformer3, dynamicDataTransformer, iTransformer4);
    }

    public PopUpWidgetTransformer get() {
        return newInstance(this.positionTransformerProvider.get(), this.cardTypeTransformerProvider.get(), this.bannerTypeTransformerProvider.get(), this.ctaTransformerProvider.get(), this.dynamicInfoTransformerProvider.get(), this.frequencyCappingTransformerProvider.get());
    }
}
