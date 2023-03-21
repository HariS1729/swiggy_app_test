package in.swiggy.android.tejas.feature.home.grid.transformers.footer;

import com.swiggy.gandalf.home.protobuf.Footer;
import in.swiggy.android.tejas.feature.home.grid.model.footer.FooterEntity;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class FooterTransformerModule_ProvidesFooterTransformerFactory implements e<ITransformer<Footer, FooterEntity>> {
    private final Provider<GridFooterTransformer> gridFooterTransformerProvider;

    public FooterTransformerModule_ProvidesFooterTransformerFactory(Provider<GridFooterTransformer> provider) {
        this.gridFooterTransformerProvider = provider;
    }

    public static FooterTransformerModule_ProvidesFooterTransformerFactory create(Provider<GridFooterTransformer> provider) {
        return new FooterTransformerModule_ProvidesFooterTransformerFactory(provider);
    }

    public static ITransformer<Footer, FooterEntity> providesFooterTransformer(GridFooterTransformer gridFooterTransformer) {
        return (ITransformer) i.e(FooterTransformerModule.providesFooterTransformer(gridFooterTransformer));
    }

    public ITransformer<Footer, FooterEntity> get() {
        return providesFooterTransformer(this.gridFooterTransformerProvider.get());
    }
}
