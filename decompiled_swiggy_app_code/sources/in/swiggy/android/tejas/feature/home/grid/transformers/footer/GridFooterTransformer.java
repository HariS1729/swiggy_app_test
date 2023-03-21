package in.swiggy.android.tejas.feature.home.grid.transformers.footer;

import com.google.protobuf.Message;
import com.swiggy.gandalf.home.protobuf.Footer;
import com.swiggy.gandalf.widgets.v2.Label;
import i20.t;
import in.swiggy.android.tejas.feature.home.grid.model.footer.FooterEntity;
import in.swiggy.android.tejas.feature.listing.label.model.LabelEntity;
import in.swiggy.android.tejas.feature.listing.label.transformer.LabelTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: GridFooterTransformer.kt */
public final class GridFooterTransformer implements ITransformer<Footer, FooterEntity> {
    private final LabelTransformer labelTransformer;

    public GridFooterTransformer(LabelTransformer labelTransformer2) {
        p.j(labelTransformer2, "labelTransformer");
        this.labelTransformer = labelTransformer2;
    }

    public final LabelTransformer getLabelTransformer() {
        return this.labelTransformer;
    }

    public FooterEntity transform(Footer footer) {
        p.j(footer, t.V);
        if (!footer.getLabelWrapper().is(Label.class)) {
            return null;
        }
        LabelTransformer labelTransformer2 = this.labelTransformer;
        Message unpack = footer.getLabelWrapper().unpack(Label.class);
        p.i(unpack, "t.labelWrapper.unpack(Label::class.java)");
        LabelEntity transform = labelTransformer2.transform((Label) unpack);
        if (transform == null || !(!o.A(transform.getData().getText()))) {
            return null;
        }
        return new FooterEntity(transform);
    }
}
