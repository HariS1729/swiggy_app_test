package in.swiggy.android.tejas.feature.listing;

import com.swiggy.gandalf.widgets.v2.Response;
import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.Map;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ListingTransformerModule_ProvidesListingTransformersFactory implements e<Map<String, ITransformer<?, ?>>> {
    private final Provider<ITransformer<Response, Error>> errorTransformerProvider;
    private final Provider<ITransformer<Throwable, Error>> exceptionTransformerProvider;
    private final Provider<ITransformer<Response, ListingResponse>> listingResponseTransformerProvider;

    public ListingTransformerModule_ProvidesListingTransformersFactory(Provider<ITransformer<Response, ListingResponse>> provider, Provider<ITransformer<Response, Error>> provider2, Provider<ITransformer<Throwable, Error>> provider3) {
        this.listingResponseTransformerProvider = provider;
        this.errorTransformerProvider = provider2;
        this.exceptionTransformerProvider = provider3;
    }

    public static ListingTransformerModule_ProvidesListingTransformersFactory create(Provider<ITransformer<Response, ListingResponse>> provider, Provider<ITransformer<Response, Error>> provider2, Provider<ITransformer<Throwable, Error>> provider3) {
        return new ListingTransformerModule_ProvidesListingTransformersFactory(provider, provider2, provider3);
    }

    public static Map<String, ITransformer<?, ?>> providesListingTransformers(ITransformer<Response, ListingResponse> iTransformer, ITransformer<Response, Error> iTransformer2, ITransformer<Throwable, Error> iTransformer3) {
        return (Map) i.e(ListingTransformerModule.INSTANCE.providesListingTransformers(iTransformer, iTransformer2, iTransformer3));
    }

    public Map<String, ITransformer<?, ?>> get() {
        return providesListingTransformers(this.listingResponseTransformerProvider.get(), this.errorTransformerProvider.get(), this.exceptionTransformerProvider.get());
    }
}
