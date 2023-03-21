package in.swiggy.android.tejas.feature.home.transformers.config.crouton;

import com.swiggy.gandalf.widgets.v2.Crouton;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeCroutonData;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class CroutonConfigTransformer_Factory implements e<CroutonConfigTransformer> {
    private final Provider<ITransformer<Crouton, HomeCroutonData>> croutonConfigTransformerProvider;

    public CroutonConfigTransformer_Factory(Provider<ITransformer<Crouton, HomeCroutonData>> provider) {
        this.croutonConfigTransformerProvider = provider;
    }

    public static CroutonConfigTransformer_Factory create(Provider<ITransformer<Crouton, HomeCroutonData>> provider) {
        return new CroutonConfigTransformer_Factory(provider);
    }

    public static CroutonConfigTransformer newInstance(ITransformer<Crouton, HomeCroutonData> iTransformer) {
        return new CroutonConfigTransformer(iTransformer);
    }

    public CroutonConfigTransformer get() {
        return newInstance(this.croutonConfigTransformerProvider.get());
    }
}
