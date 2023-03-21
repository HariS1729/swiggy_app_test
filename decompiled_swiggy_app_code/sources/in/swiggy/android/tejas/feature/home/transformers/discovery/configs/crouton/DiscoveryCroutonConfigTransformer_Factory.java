package in.swiggy.android.tejas.feature.home.transformers.discovery.configs.crouton;

import com.swiggy.gandalf.widgets.v2.Crouton;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeCroutonData;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class DiscoveryCroutonConfigTransformer_Factory implements e<DiscoveryCroutonConfigTransformer> {
    private final Provider<ITransformer<Crouton, HomeCroutonData>> croutonConfigTransformerProvider;

    public DiscoveryCroutonConfigTransformer_Factory(Provider<ITransformer<Crouton, HomeCroutonData>> provider) {
        this.croutonConfigTransformerProvider = provider;
    }

    public static DiscoveryCroutonConfigTransformer_Factory create(Provider<ITransformer<Crouton, HomeCroutonData>> provider) {
        return new DiscoveryCroutonConfigTransformer_Factory(provider);
    }

    public static DiscoveryCroutonConfigTransformer newInstance(ITransformer<Crouton, HomeCroutonData> iTransformer) {
        return new DiscoveryCroutonConfigTransformer(iTransformer);
    }

    public DiscoveryCroutonConfigTransformer get() {
        return newInstance(this.croutonConfigTransformerProvider.get());
    }
}
