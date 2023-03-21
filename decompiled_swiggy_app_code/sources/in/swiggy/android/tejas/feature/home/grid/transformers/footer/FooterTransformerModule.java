package in.swiggy.android.tejas.feature.home.grid.transformers.footer;

import com.swiggy.gandalf.home.protobuf.Footer;
import in.swiggy.android.tejas.feature.home.grid.model.footer.FooterEntity;
import in.swiggy.android.tejas.feature.listing.grid.transformer.v2.footer.GridFooterTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: FooterTransformerModule.kt */
public final class FooterTransformerModule {
    public static final FooterTransformerModule INSTANCE = new FooterTransformerModule();

    private FooterTransformerModule() {
    }

    public static final ITransformer<Footer, FooterEntity> providesFooterTransformer(GridFooterTransformer gridFooterTransformer) {
        p.j(gridFooterTransformer, "gridFooterTransformer");
        return gridFooterTransformer;
    }

    public static final ITransformer<com.swiggy.gandalf.widgets.v2.Footer, FooterEntity> providesFooterTransformerV2(GridFooterTransformer gridFooterTransformer) {
        p.j(gridFooterTransformer, "gridFooterTransformer");
        return gridFooterTransformer;
    }
}
