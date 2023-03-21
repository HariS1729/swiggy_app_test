package in.swiggy.android.tejas.feature.home.grid.transformers.fliptext;

import com.swiggy.gandalf.widgets.v2.ItemStyle;
import com.swiggy.gandalf.widgets.v2.MxNFlipTextCardInfo;
import in.swiggy.android.tejas.feature.home.grid.model.fliptext.DynamicFlipTextEntity;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class DynamicFlipTextSectionTransformer_Factory implements e<DynamicFlipTextSectionTransformer> {
    private final Provider<ITransformer<MxNFlipTextCardInfo.FlipTextCardInfo, DynamicFlipTextEntity>> dynamicFlipTextItemTransformerProvider;
    private final Provider<ITransformer<ItemStyle, in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle>> itemStyleTransformerProvider;

    public DynamicFlipTextSectionTransformer_Factory(Provider<ITransformer<MxNFlipTextCardInfo.FlipTextCardInfo, DynamicFlipTextEntity>> provider, Provider<ITransformer<ItemStyle, in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle>> provider2) {
        this.dynamicFlipTextItemTransformerProvider = provider;
        this.itemStyleTransformerProvider = provider2;
    }

    public static DynamicFlipTextSectionTransformer_Factory create(Provider<ITransformer<MxNFlipTextCardInfo.FlipTextCardInfo, DynamicFlipTextEntity>> provider, Provider<ITransformer<ItemStyle, in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle>> provider2) {
        return new DynamicFlipTextSectionTransformer_Factory(provider, provider2);
    }

    public static DynamicFlipTextSectionTransformer newInstance(ITransformer<MxNFlipTextCardInfo.FlipTextCardInfo, DynamicFlipTextEntity> iTransformer, ITransformer<ItemStyle, in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle> iTransformer2) {
        return new DynamicFlipTextSectionTransformer(iTransformer, iTransformer2);
    }

    public DynamicFlipTextSectionTransformer get() {
        return newInstance(this.dynamicFlipTextItemTransformerProvider.get(), this.itemStyleTransformerProvider.get());
    }
}
