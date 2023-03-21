package in.swiggy.android.tejas.feature.crosssell;

import com.swiggy.gandalf.widgets.v2.Response;
import com.swiggy.presentation.food.v2.MenuItem;
import in.swiggy.android.tejas.feature.crosssell.model.CrossSellResponse;
import in.swiggy.android.tejas.feature.crosssell.transformers.CrossSellTransformer;
import in.swiggy.android.tejas.feature.menu.health.model.CrossSellMenuItemEntity;
import in.swiggy.android.tejas.feature.menu.health.transformer.CrossSellItemTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: CrossSellTransformerModule.kt */
public final class CrossSellTransformerModule {
    public static final CrossSellTransformerModule INSTANCE = new CrossSellTransformerModule();

    private CrossSellTransformerModule() {
    }

    public static final ITransformer<MenuItem, CrossSellMenuItemEntity> providesCrossSellItemTransformer(CrossSellItemTransformer crossSellItemTransformer) {
        p.j(crossSellItemTransformer, "crossSellItemTransformer");
        return crossSellItemTransformer;
    }

    public static final ITransformer<Response, CrossSellResponse> providesCrossSellTransformer(CrossSellTransformer crossSellTransformer) {
        p.j(crossSellTransformer, "crossSellTransformer");
        return crossSellTransformer;
    }
}
