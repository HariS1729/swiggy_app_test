package in.swiggy.android.tejas.feature.home.grid.transformers.remotelottie;

import com.swiggy.gandalf.widgets.v2.LotteInfoLayoutCard;
import in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieEntity;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class RemoteLottieTransformerModule_ProvidesRemoteLottieSectionItemTransformerFactory implements e<ITransformer<LotteInfoLayoutCard.LotteCardInfo, RemoteLottieEntity>> {
    private final Provider<RemoteLottieItemTransformer> remoteLottieItemTransformerProvider;

    public RemoteLottieTransformerModule_ProvidesRemoteLottieSectionItemTransformerFactory(Provider<RemoteLottieItemTransformer> provider) {
        this.remoteLottieItemTransformerProvider = provider;
    }

    public static RemoteLottieTransformerModule_ProvidesRemoteLottieSectionItemTransformerFactory create(Provider<RemoteLottieItemTransformer> provider) {
        return new RemoteLottieTransformerModule_ProvidesRemoteLottieSectionItemTransformerFactory(provider);
    }

    public static ITransformer<LotteInfoLayoutCard.LotteCardInfo, RemoteLottieEntity> providesRemoteLottieSectionItemTransformer(RemoteLottieItemTransformer remoteLottieItemTransformer) {
        return (ITransformer) i.e(RemoteLottieTransformerModule.providesRemoteLottieSectionItemTransformer(remoteLottieItemTransformer));
    }

    public ITransformer<LotteInfoLayoutCard.LotteCardInfo, RemoteLottieEntity> get() {
        return providesRemoteLottieSectionItemTransformer(this.remoteLottieItemTransformerProvider.get());
    }
}
