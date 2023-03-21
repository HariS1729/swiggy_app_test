package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.widgets.v2.ImageInfoLayoutCard;
import com.swiggy.gandalf.widgets.v2.Layout;
import in.swiggy.android.tejas.feature.home.model.AutoscrollConfig;
import in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle;
import in.swiggy.android.tejas.feature.listing.grid.transformer.v2.GridPaddingTransformer;
import in.swiggy.android.tejas.feature.listing.navigation.transformers.TabEntityTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class MultiCreativeWidgetTransformer_Factory implements e<MultiCreativeWidgetTransformer> {
    private final Provider<ITransformer<Layout.AutoScrollConfig, AutoscrollConfig>> autoscrollTransformerProvider;
    private final Provider<MultiCreativeCardFactory> factoryProvider;
    private final Provider<GridPaddingTransformer> gridPaddingTransformerProvider;
    private final Provider<ITransformer<ImageInfoLayoutCard.ItemStyle, ItemStyle>> itemStyleTransformerProvider;
    private final Provider<TabEntityTransformer> tabEntityTransformerProvider;

    public MultiCreativeWidgetTransformer_Factory(Provider<ITransformer<ImageInfoLayoutCard.ItemStyle, ItemStyle>> provider, Provider<MultiCreativeCardFactory> provider2, Provider<TabEntityTransformer> provider3, Provider<ITransformer<Layout.AutoScrollConfig, AutoscrollConfig>> provider4, Provider<GridPaddingTransformer> provider5) {
        this.itemStyleTransformerProvider = provider;
        this.factoryProvider = provider2;
        this.tabEntityTransformerProvider = provider3;
        this.autoscrollTransformerProvider = provider4;
        this.gridPaddingTransformerProvider = provider5;
    }

    public static MultiCreativeWidgetTransformer_Factory create(Provider<ITransformer<ImageInfoLayoutCard.ItemStyle, ItemStyle>> provider, Provider<MultiCreativeCardFactory> provider2, Provider<TabEntityTransformer> provider3, Provider<ITransformer<Layout.AutoScrollConfig, AutoscrollConfig>> provider4, Provider<GridPaddingTransformer> provider5) {
        return new MultiCreativeWidgetTransformer_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static MultiCreativeWidgetTransformer newInstance(ITransformer<ImageInfoLayoutCard.ItemStyle, ItemStyle> iTransformer, MultiCreativeCardFactory multiCreativeCardFactory, TabEntityTransformer tabEntityTransformer, ITransformer<Layout.AutoScrollConfig, AutoscrollConfig> iTransformer2, GridPaddingTransformer gridPaddingTransformer) {
        return new MultiCreativeWidgetTransformer(iTransformer, multiCreativeCardFactory, tabEntityTransformer, iTransformer2, gridPaddingTransformer);
    }

    public MultiCreativeWidgetTransformer get() {
        return newInstance(this.itemStyleTransformerProvider.get(), this.factoryProvider.get(), this.tabEntityTransformerProvider.get(), this.autoscrollTransformerProvider.get(), this.gridPaddingTransformerProvider.get());
    }
}
