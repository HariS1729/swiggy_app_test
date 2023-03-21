package in.swiggy.android.tejas.feature.home.grid.transformers.footer;

import com.swiggy.gandalf.widgets.v2.Footer;
import in.swiggy.android.tejas.feature.home.grid.model.footer.FooterEntity;
import in.swiggy.android.tejas.feature.listing.grid.transformer.v2.footer.GridFooterTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class FooterTransformerModule_ProvidesFooterTransformerV2Factory implements e<ITransformer<Footer, FooterEntity>> {
    private final Provider<GridFooterTransformer> gridFooterTransformerProvider;

    public FooterTransformerModule_ProvidesFooterTransformerV2Factory(Provider<GridFooterTransformer> provider) {
        this.gridFooterTransformerProvider = provider;
    }

    public static FooterTransformerModule_ProvidesFooterTransformerV2Factory create(Provider<GridFooterTransformer> provider) {
        return new FooterTransformerModule_ProvidesFooterTransformerV2Factory(provider);
    }

    public static ITransformer<Footer, FooterEntity> providesFooterTransformerV2(GridFooterTransformer gridFooterTransformer) {
        return (ITransformer) i.e(FooterTransformerModule.providesFooterTransformerV2(gridFooterTransformer));
    }

    public ITransformer<Footer, FooterEntity> get() {
        return providesFooterTransformerV2(this.gridFooterTransformerProvider.get());
    }
}
