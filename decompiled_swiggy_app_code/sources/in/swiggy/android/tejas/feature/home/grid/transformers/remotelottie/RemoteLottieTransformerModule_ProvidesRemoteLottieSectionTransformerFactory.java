package in.swiggy.android.tejas.feature.home.grid.transformers.remotelottie;

import com.swiggy.gandalf.widgets.v2.LotteInfoLayoutCard;
import in.swiggy.android.tejas.feature.home.grid.model.remotelottie.GridRemoteLottieSection;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class RemoteLottieTransformerModule_ProvidesRemoteLottieSectionTransformerFactory implements e<ITransformer<LotteInfoLayoutCard, GridRemoteLottieSection>> {
    private final Provider<RemoteLottieSectionTransformer> remoteLottieSectionTransformerProvider;

    public RemoteLottieTransformerModule_ProvidesRemoteLottieSectionTransformerFactory(Provider<RemoteLottieSectionTransformer> provider) {
        this.remoteLottieSectionTransformerProvider = provider;
    }

    public static RemoteLottieTransformerModule_ProvidesRemoteLottieSectionTransformerFactory create(Provider<RemoteLottieSectionTransformer> provider) {
        return new RemoteLottieTransformerModule_ProvidesRemoteLottieSectionTransformerFactory(provider);
    }

    public static ITransformer<LotteInfoLayoutCard, GridRemoteLottieSection> providesRemoteLottieSectionTransformer(RemoteLottieSectionTransformer remoteLottieSectionTransformer) {
        return (ITransformer) i.e(RemoteLottieTransformerModule.providesRemoteLottieSectionTransformer(remoteLottieSectionTransformer));
    }

    public ITransformer<LotteInfoLayoutCard, GridRemoteLottieSection> get() {
        return providesRemoteLottieSectionTransformer(this.remoteLottieSectionTransformerProvider.get());
    }
}
