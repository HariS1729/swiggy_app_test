package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.widgets.v2.Header;
import com.swiggy.gandalf.widgets.v2.MultiTypeCreativeWidget;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.multicreative.MultiCreativeEntity;
import in.swiggy.android.tejas.feature.home.model.multicreative.MultiCreativeWidget;
import in.swiggy.android.tejas.feature.home.model.multicreative.MulticreativeInfo;
import in.swiggy.android.tejas.feature.listing.grid.model.GridHeaderData;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: MultiCreativeEntityTransformer.kt */
public final class MultiCreativeEntityTransformer implements ITransformer<MultiTypeCreativeWidget, MultiCreativeEntity> {
    private MultiCreativeWidgetFactory factory;
    private final ITransformer<Header, GridHeaderData> gridHeaderTransformer;

    public MultiCreativeEntityTransformer(ITransformer<Header, GridHeaderData> iTransformer, MultiCreativeWidgetFactory multiCreativeWidgetFactory) {
        p.j(iTransformer, "gridHeaderTransformer");
        p.j(multiCreativeWidgetFactory, "factory");
        this.gridHeaderTransformer = iTransformer;
        this.factory = multiCreativeWidgetFactory;
    }

    public MultiCreativeEntity transform(MultiTypeCreativeWidget multiTypeCreativeWidget) {
        p.j(multiTypeCreativeWidget, t.V);
        ITransformer<Header, GridHeaderData> iTransformer = this.gridHeaderTransformer;
        Header header = multiTypeCreativeWidget.getHeader();
        p.i(header, "t.header");
        GridHeaderData transform = iTransformer.transform(header);
        MulticreativeInfo card = this.factory.getCard(multiTypeCreativeWidget);
        if (card == null) {
            return null;
        }
        return new MultiCreativeEntity(new MultiCreativeWidget(transform, card));
    }
}
