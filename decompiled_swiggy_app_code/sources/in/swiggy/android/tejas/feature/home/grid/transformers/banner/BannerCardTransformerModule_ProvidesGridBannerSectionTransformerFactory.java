package in.swiggy.android.tejas.feature.home.grid.transformers.banner;

import com.swiggy.gandalf.widgets.v2.BannerCardInfoWithStyle;
import in.swiggy.android.tejas.feature.listing.grid.model.GridBannerSection;
import in.swiggy.android.tejas.feature.listing.grid.transformer.v1.BannerGridCardTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class BannerCardTransformerModule_ProvidesGridBannerSectionTransformerFactory implements e<ITransformer<BannerCardInfoWithStyle, GridBannerSection>> {
    private final Provider<BannerGridCardTransformer> bannerGridCardTransformerProvider;

    public BannerCardTransformerModule_ProvidesGridBannerSectionTransformerFactory(Provider<BannerGridCardTransformer> provider) {
        this.bannerGridCardTransformerProvider = provider;
    }

    public static BannerCardTransformerModule_ProvidesGridBannerSectionTransformerFactory create(Provider<BannerGridCardTransformer> provider) {
        return new BannerCardTransformerModule_ProvidesGridBannerSectionTransformerFactory(provider);
    }

    public static ITransformer<BannerCardInfoWithStyle, GridBannerSection> providesGridBannerSectionTransformer(BannerGridCardTransformer bannerGridCardTransformer) {
        return (ITransformer) i.e(BannerCardTransformerModule.providesGridBannerSectionTransformer(bannerGridCardTransformer));
    }

    public ITransformer<BannerCardInfoWithStyle, GridBannerSection> get() {
        return providesGridBannerSectionTransformer(this.bannerGridCardTransformerProvider.get());
    }
}
