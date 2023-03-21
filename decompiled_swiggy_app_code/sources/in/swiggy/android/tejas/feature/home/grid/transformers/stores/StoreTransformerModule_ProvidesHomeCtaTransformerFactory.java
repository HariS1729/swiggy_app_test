package in.swiggy.android.tejas.feature.home.grid.transformers.stores;

import com.swiggy.gandalf.home.protobuf.Cta;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class StoreTransformerModule_ProvidesHomeCtaTransformerFactory implements e<ITransformer<Cta, CTA>> {
    private final Provider<HomeCtaTransformer> homeCtaTransformerProvider;

    public StoreTransformerModule_ProvidesHomeCtaTransformerFactory(Provider<HomeCtaTransformer> provider) {
        this.homeCtaTransformerProvider = provider;
    }

    public static StoreTransformerModule_ProvidesHomeCtaTransformerFactory create(Provider<HomeCtaTransformer> provider) {
        return new StoreTransformerModule_ProvidesHomeCtaTransformerFactory(provider);
    }

    public static ITransformer<Cta, CTA> providesHomeCtaTransformer(HomeCtaTransformer homeCtaTransformer) {
        return (ITransformer) i.e(StoreTransformerModule.providesHomeCtaTransformer(homeCtaTransformer));
    }

    public ITransformer<Cta, CTA> get() {
        return providesHomeCtaTransformer(this.homeCtaTransformerProvider.get());
    }
}
