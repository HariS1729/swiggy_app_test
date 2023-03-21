package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.widgets.v2.Header;
import in.swiggy.android.tejas.feature.listing.grid.model.GridHeaderData;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class MultiCreativeEntityTransformer_Factory implements e<MultiCreativeEntityTransformer> {
    private final Provider<MultiCreativeWidgetFactory> factoryProvider;
    private final Provider<ITransformer<Header, GridHeaderData>> gridHeaderTransformerProvider;

    public MultiCreativeEntityTransformer_Factory(Provider<ITransformer<Header, GridHeaderData>> provider, Provider<MultiCreativeWidgetFactory> provider2) {
        this.gridHeaderTransformerProvider = provider;
        this.factoryProvider = provider2;
    }

    public static MultiCreativeEntityTransformer_Factory create(Provider<ITransformer<Header, GridHeaderData>> provider, Provider<MultiCreativeWidgetFactory> provider2) {
        return new MultiCreativeEntityTransformer_Factory(provider, provider2);
    }

    public static MultiCreativeEntityTransformer newInstance(ITransformer<Header, GridHeaderData> iTransformer, MultiCreativeWidgetFactory multiCreativeWidgetFactory) {
        return new MultiCreativeEntityTransformer(iTransformer, multiCreativeWidgetFactory);
    }

    public MultiCreativeEntityTransformer get() {
        return newInstance(this.gridHeaderTransformerProvider.get(), this.factoryProvider.get());
    }
}
