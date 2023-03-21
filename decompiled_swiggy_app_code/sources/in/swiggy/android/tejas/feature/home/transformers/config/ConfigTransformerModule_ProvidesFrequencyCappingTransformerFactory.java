package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.widgets.v2.FrequencyCapping;
import in.swiggy.android.tejas.feature.home.transformers.FrequencyCappingTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ConfigTransformerModule_ProvidesFrequencyCappingTransformerFactory implements e<ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping>> {
    private final Provider<FrequencyCappingTransformer> frequencyCappingTransformerProvider;

    public ConfigTransformerModule_ProvidesFrequencyCappingTransformerFactory(Provider<FrequencyCappingTransformer> provider) {
        this.frequencyCappingTransformerProvider = provider;
    }

    public static ConfigTransformerModule_ProvidesFrequencyCappingTransformerFactory create(Provider<FrequencyCappingTransformer> provider) {
        return new ConfigTransformerModule_ProvidesFrequencyCappingTransformerFactory(provider);
    }

    public static ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping> providesFrequencyCappingTransformer(FrequencyCappingTransformer frequencyCappingTransformer) {
        return (ITransformer) i.e(ConfigTransformerModule.providesFrequencyCappingTransformer(frequencyCappingTransformer));
    }

    public ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping> get() {
        return providesFrequencyCappingTransformer(this.frequencyCappingTransformerProvider.get());
    }
}
