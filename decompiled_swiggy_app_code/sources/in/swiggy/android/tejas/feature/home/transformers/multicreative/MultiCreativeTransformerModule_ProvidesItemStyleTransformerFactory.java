package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.widgets.v2.ImageInfoLayoutCard;
import in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class MultiCreativeTransformerModule_ProvidesItemStyleTransformerFactory implements e<ITransformer<ImageInfoLayoutCard.ItemStyle, ItemStyle>> {
    private final Provider<ItemStyleTransformer> itemStyleTransformerProvider;

    public MultiCreativeTransformerModule_ProvidesItemStyleTransformerFactory(Provider<ItemStyleTransformer> provider) {
        this.itemStyleTransformerProvider = provider;
    }

    public static MultiCreativeTransformerModule_ProvidesItemStyleTransformerFactory create(Provider<ItemStyleTransformer> provider) {
        return new MultiCreativeTransformerModule_ProvidesItemStyleTransformerFactory(provider);
    }

    public static ITransformer<ImageInfoLayoutCard.ItemStyle, ItemStyle> providesItemStyleTransformer(ItemStyleTransformer itemStyleTransformer) {
        return (ITransformer) i.e(MultiCreativeTransformerModule.providesItemStyleTransformer(itemStyleTransformer));
    }

    public ITransformer<ImageInfoLayoutCard.ItemStyle, ItemStyle> get() {
        return providesItemStyleTransformer(this.itemStyleTransformerProvider.get());
    }
}
