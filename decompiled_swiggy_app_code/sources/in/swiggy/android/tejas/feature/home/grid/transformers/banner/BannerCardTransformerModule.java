package in.swiggy.android.tejas.feature.home.grid.transformers.banner;

import com.swiggy.gandalf.widgets.v2.BannerCardInfoWithStyle;
import in.swiggy.android.tejas.feature.listing.grid.model.GridBannerSection;
import in.swiggy.android.tejas.feature.listing.grid.transformer.v1.BannerGridCardTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: BannerCardTransformerModule.kt */
public final class BannerCardTransformerModule {
    public static final BannerCardTransformerModule INSTANCE = new BannerCardTransformerModule();

    private BannerCardTransformerModule() {
    }

    public static final ITransformer<BannerCardInfoWithStyle, GridBannerSection> providesGridBannerSectionTransformer(BannerGridCardTransformer bannerGridCardTransformer) {
        p.j(bannerGridCardTransformer, "bannerGridCardTransformer");
        return bannerGridCardTransformer;
    }
}
