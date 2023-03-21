package in.swiggy.android.tejas.feature.home.grid.transformers.remotelottie;

import com.swiggy.gandalf.widgets.v2.LotteInfoLayoutCard;
import in.swiggy.android.tejas.feature.home.grid.model.remotelottie.GridRemoteLottieSection;
import in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieEntity;
import in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: RemoteLottieTransformerModule.kt */
public final class RemoteLottieTransformerModule {
    public static final RemoteLottieTransformerModule INSTANCE = new RemoteLottieTransformerModule();

    private RemoteLottieTransformerModule() {
    }

    public static final ITransformer<LotteInfoLayoutCard.ItemStyle, ItemStyle> providesRemoteLottieSectionItemStyleTransformer(RemoteLottieItemStyleTransformer remoteLottieItemStyleTransformer) {
        p.j(remoteLottieItemStyleTransformer, "remoteLottieItemStyleTransformer");
        return remoteLottieItemStyleTransformer;
    }

    public static final ITransformer<LotteInfoLayoutCard.LotteCardInfo, RemoteLottieEntity> providesRemoteLottieSectionItemTransformer(RemoteLottieItemTransformer remoteLottieItemTransformer) {
        p.j(remoteLottieItemTransformer, "remoteLottieItemTransformer");
        return remoteLottieItemTransformer;
    }

    public static final ITransformer<LotteInfoLayoutCard, GridRemoteLottieSection> providesRemoteLottieSectionTransformer(RemoteLottieSectionTransformer remoteLottieSectionTransformer) {
        p.j(remoteLottieSectionTransformer, "remoteLottieSectionTransformer");
        return remoteLottieSectionTransformer;
    }
}
