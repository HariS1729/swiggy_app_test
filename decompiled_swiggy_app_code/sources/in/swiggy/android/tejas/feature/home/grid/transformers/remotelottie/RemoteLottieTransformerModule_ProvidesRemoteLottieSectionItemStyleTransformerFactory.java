package in.swiggy.android.tejas.feature.home.grid.transformers.remotelottie;

import com.swiggy.gandalf.widgets.v2.LotteInfoLayoutCard;
import in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class RemoteLottieTransformerModule_ProvidesRemoteLottieSectionItemStyleTransformerFactory implements e<ITransformer<LotteInfoLayoutCard.ItemStyle, ItemStyle>> {
    private final Provider<RemoteLottieItemStyleTransformer> remoteLottieItemStyleTransformerProvider;

    public RemoteLottieTransformerModule_ProvidesRemoteLottieSectionItemStyleTransformerFactory(Provider<RemoteLottieItemStyleTransformer> provider) {
        this.remoteLottieItemStyleTransformerProvider = provider;
    }

    public static RemoteLottieTransformerModule_ProvidesRemoteLottieSectionItemStyleTransformerFactory create(Provider<RemoteLottieItemStyleTransformer> provider) {
        return new RemoteLottieTransformerModule_ProvidesRemoteLottieSectionItemStyleTransformerFactory(provider);
    }

    public static ITransformer<LotteInfoLayoutCard.ItemStyle, ItemStyle> providesRemoteLottieSectionItemStyleTransformer(RemoteLottieItemStyleTransformer remoteLottieItemStyleTransformer) {
        return (ITransformer) i.e(RemoteLottieTransformerModule.providesRemoteLottieSectionItemStyleTransformer(remoteLottieItemStyleTransformer));
    }

    public ITransformer<LotteInfoLayoutCard.ItemStyle, ItemStyle> get() {
        return providesRemoteLottieSectionItemStyleTransformer(this.remoteLottieItemStyleTransformerProvider.get());
    }
}
