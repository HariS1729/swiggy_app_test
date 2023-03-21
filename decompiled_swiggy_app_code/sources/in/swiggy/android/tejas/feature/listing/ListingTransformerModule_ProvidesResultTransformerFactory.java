package in.swiggy.android.tejas.feature.listing;

import com.swiggy.gandalf.widgets.v2.Response;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class ListingTransformerModule_ProvidesResultTransformerFactory implements e<ITransformer<Response, ListingResponse>> {
    private final Provider<ListingTransformer> listingTransformerProvider;

    public ListingTransformerModule_ProvidesResultTransformerFactory(Provider<ListingTransformer> provider) {
        this.listingTransformerProvider = provider;
    }

    public static ListingTransformerModule_ProvidesResultTransformerFactory create(Provider<ListingTransformer> provider) {
        return new ListingTransformerModule_ProvidesResultTransformerFactory(provider);
    }

    public static ITransformer<Response, ListingResponse> providesResultTransformer(ListingTransformer listingTransformer) {
        return (ITransformer) i.e(ListingTransformerModule.providesResultTransformer(listingTransformer));
    }

    public ITransformer<Response, ListingResponse> get() {
        return providesResultTransformer(this.listingTransformerProvider.get());
    }
}
