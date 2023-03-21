package in.swiggy.android.tejas.feature.home.transformers.config;

import com.swiggy.gandalf.widgets.v2.CPPopupWidget;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.Frequency;
import in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup.FrequencyTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ConfigTransformerModule_ProvidesFrequencyTransformerFactory implements e<ITransformer<CPPopupWidget.CPPopupFrequencyCapping, Frequency>> {
    private final Provider<FrequencyTransformer> frequencyTransformerProvider;

    public ConfigTransformerModule_ProvidesFrequencyTransformerFactory(Provider<FrequencyTransformer> provider) {
        this.frequencyTransformerProvider = provider;
    }

    public static ConfigTransformerModule_ProvidesFrequencyTransformerFactory create(Provider<FrequencyTransformer> provider) {
        return new ConfigTransformerModule_ProvidesFrequencyTransformerFactory(provider);
    }

    public static ITransformer<CPPopupWidget.CPPopupFrequencyCapping, Frequency> providesFrequencyTransformer(FrequencyTransformer frequencyTransformer) {
        return (ITransformer) i.e(ConfigTransformerModule.providesFrequencyTransformer(frequencyTransformer));
    }

    public ITransformer<CPPopupWidget.CPPopupFrequencyCapping, Frequency> get() {
        return providesFrequencyTransformer(this.frequencyTransformerProvider.get());
    }
}
