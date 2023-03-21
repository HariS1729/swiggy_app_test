package in.swiggy.android.tejas.feature.home.transformers.config.video;

import com.swiggy.gandalf.widgets.v2.Cta;
import com.swiggy.gandalf.widgets.v2.FrequencyCapping;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class VideoTransformer_Factory implements e<VideoTransformer> {
    private final Provider<ITransformer<Cta, CTA>> ctaTransformerProvider;
    private final Provider<ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping>> frequencyCappingTransformerProvider;
    private final Provider<ITransformer<String, String>> videoIdTransformerProvider;

    public VideoTransformer_Factory(Provider<ITransformer<Cta, CTA>> provider, Provider<ITransformer<String, String>> provider2, Provider<ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping>> provider3) {
        this.ctaTransformerProvider = provider;
        this.videoIdTransformerProvider = provider2;
        this.frequencyCappingTransformerProvider = provider3;
    }

    public static VideoTransformer_Factory create(Provider<ITransformer<Cta, CTA>> provider, Provider<ITransformer<String, String>> provider2, Provider<ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping>> provider3) {
        return new VideoTransformer_Factory(provider, provider2, provider3);
    }

    public static VideoTransformer newInstance(ITransformer<Cta, CTA> iTransformer, ITransformer<String, String> iTransformer2, ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping> iTransformer3) {
        return new VideoTransformer(iTransformer, iTransformer2, iTransformer3);
    }

    public VideoTransformer get() {
        return newInstance(this.ctaTransformerProvider.get(), this.videoIdTransformerProvider.get(), this.frequencyCappingTransformerProvider.get());
    }
}
