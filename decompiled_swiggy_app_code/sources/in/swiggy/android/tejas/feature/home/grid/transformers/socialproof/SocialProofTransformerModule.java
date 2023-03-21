package in.swiggy.android.tejas.feature.home.grid.transformers.socialproof;

import com.swiggy.gandalf.home.protobuf.TickerLayoutCard;
import com.swiggy.gandalf.widgets.v2.TickerLayoutCard;
import in.swiggy.android.tejas.feature.home.grid.model.socialproof.GridTickerSection;
import in.swiggy.android.tejas.feature.home.grid.model.socialproof.ItemTicker;
import in.swiggy.android.tejas.feature.home.grid.model.socialproof.TickerStyle;
import in.swiggy.android.tejas.feature.home.grid.transformers.socialproof.v2.ItemTickerTransformer;
import in.swiggy.android.tejas.feature.home.grid.transformers.socialproof.v2.TickerSectionTransformer;
import in.swiggy.android.tejas.feature.home.grid.transformers.socialproof.v2.TickerStyleTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: SocialProofTransformerModule.kt */
public final class SocialProofTransformerModule {
    public static final SocialProofTransformerModule INSTANCE = new SocialProofTransformerModule();

    private SocialProofTransformerModule() {
    }

    public static final ITransformer<TickerLayoutCard.TickerCardInfo, ItemTicker> providesItemTickerTransformer(ItemTickerTransformer itemTickerTransformer) {
        p.j(itemTickerTransformer, "itemTickerTransformer");
        return itemTickerTransformer;
    }

    public static final ITransformer<TickerLayoutCard.TickerCardInfo, ItemTicker> providesItemTickerTransformerOld(in.swiggy.android.tejas.feature.home.grid.transformers.socialproof.v1.ItemTickerTransformer itemTickerTransformer) {
        p.j(itemTickerTransformer, "itemTickerTransformer");
        return itemTickerTransformer;
    }

    public static final ITransformer<com.swiggy.gandalf.widgets.v2.TickerLayoutCard, GridTickerSection> providesTickerSectionTransformer(TickerSectionTransformer tickerSectionTransformer) {
        p.j(tickerSectionTransformer, "tickerSectionTransformer");
        return tickerSectionTransformer;
    }

    public static final ITransformer<com.swiggy.gandalf.home.protobuf.TickerLayoutCard, GridTickerSection> providesTickerSectionTransformerOld(in.swiggy.android.tejas.feature.home.grid.transformers.socialproof.v1.TickerSectionTransformer tickerSectionTransformer) {
        p.j(tickerSectionTransformer, "tickerSectionTransformer");
        return tickerSectionTransformer;
    }

    public static final ITransformer<TickerLayoutCard.ItemStyle, TickerStyle> providesTickerStyleTransformer(TickerStyleTransformer tickerStyleTransformer) {
        p.j(tickerStyleTransformer, "tickerStyleTransformer");
        return tickerStyleTransformer;
    }

    public static final ITransformer<TickerLayoutCard.ItemStyle, TickerStyle> providesTickerStyleTransformerOld(in.swiggy.android.tejas.feature.home.grid.transformers.socialproof.v1.TickerStyleTransformer tickerStyleTransformer) {
        p.j(tickerStyleTransformer, "tickerStyleTransformer");
        return tickerStyleTransformer;
    }
}
