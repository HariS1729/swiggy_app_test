package in.swiggy.android.tejas.feature.home.grid.transformers.remotelottie;

import com.swiggy.gandalf.widgets.v2.LotteInfoLayoutCard;
import in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieEntity;
import in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class RemoteLottieSectionTransformer_Factory implements e<RemoteLottieSectionTransformer> {
    private final Provider<ITransformer<LotteInfoLayoutCard.ItemStyle, ItemStyle>> itemStyleTransformerProvider;
    private final Provider<ITransformer<LotteInfoLayoutCard.LotteCardInfo, RemoteLottieEntity>> remoteLottieEntityTransformerProvider;

    public RemoteLottieSectionTransformer_Factory(Provider<ITransformer<LotteInfoLayoutCard.LotteCardInfo, RemoteLottieEntity>> provider, Provider<ITransformer<LotteInfoLayoutCard.ItemStyle, ItemStyle>> provider2) {
        this.remoteLottieEntityTransformerProvider = provider;
        this.itemStyleTransformerProvider = provider2;
    }

    public static RemoteLottieSectionTransformer_Factory create(Provider<ITransformer<LotteInfoLayoutCard.LotteCardInfo, RemoteLottieEntity>> provider, Provider<ITransformer<LotteInfoLayoutCard.ItemStyle, ItemStyle>> provider2) {
        return new RemoteLottieSectionTransformer_Factory(provider, provider2);
    }

    public static RemoteLottieSectionTransformer newInstance(ITransformer<LotteInfoLayoutCard.LotteCardInfo, RemoteLottieEntity> iTransformer, ITransformer<LotteInfoLayoutCard.ItemStyle, ItemStyle> iTransformer2) {
        return new RemoteLottieSectionTransformer(iTransformer, iTransformer2);
    }

    public RemoteLottieSectionTransformer get() {
        return newInstance(this.remoteLottieEntityTransformerProvider.get(), this.itemStyleTransformerProvider.get());
    }
}
