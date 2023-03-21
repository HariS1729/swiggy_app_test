package in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup;

import com.swiggy.gandalf.widgets.v2.CPPopupWidget;
import com.swiggy.gandalf.widgets.v2.CreativeType;
import com.swiggy.gandalf.widgets.v2.Cta;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.BottomBarPopupCardType;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.TextLine;
import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.CTAInfo;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class BottomBarPopupCardTransformer_Factory implements e<BottomBarPopupCardTransformer> {
    private final Provider<ITransformer<CreativeType, BottomBarPopupCardType>> creativeTransformerProvider;
    private final Provider<ITransformer<Cta, CTAInfo>> ctaTransformerProvider;
    private final Provider<ITransformer<CPPopupWidget.RenderableInfo, TextLine>> textLineTransformerProvider;

    public BottomBarPopupCardTransformer_Factory(Provider<ITransformer<CPPopupWidget.RenderableInfo, TextLine>> provider, Provider<ITransformer<Cta, CTAInfo>> provider2, Provider<ITransformer<CreativeType, BottomBarPopupCardType>> provider3) {
        this.textLineTransformerProvider = provider;
        this.ctaTransformerProvider = provider2;
        this.creativeTransformerProvider = provider3;
    }

    public static BottomBarPopupCardTransformer_Factory create(Provider<ITransformer<CPPopupWidget.RenderableInfo, TextLine>> provider, Provider<ITransformer<Cta, CTAInfo>> provider2, Provider<ITransformer<CreativeType, BottomBarPopupCardType>> provider3) {
        return new BottomBarPopupCardTransformer_Factory(provider, provider2, provider3);
    }

    public static BottomBarPopupCardTransformer newInstance(ITransformer<CPPopupWidget.RenderableInfo, TextLine> iTransformer, ITransformer<Cta, CTAInfo> iTransformer2, ITransformer<CreativeType, BottomBarPopupCardType> iTransformer3) {
        return new BottomBarPopupCardTransformer(iTransformer, iTransformer2, iTransformer3);
    }

    public BottomBarPopupCardTransformer get() {
        return newInstance(this.textLineTransformerProvider.get(), this.ctaTransformerProvider.get(), this.creativeTransformerProvider.get());
    }
}
