package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.google.protobuf.Message;
import com.swiggy.gandalf.widgets.v2.MultiTypeCreativeInfoWithStyle;
import com.swiggy.gandalf.widgets.v2.MultiTypeCreativeWidget;
import in.swiggy.android.tejas.feature.home.model.multicreative.MulticreativeInfo;
import in.swiggy.android.tejas.payment.model.payment.models.PaymentType;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: MultiCreativeWidgetFactory.kt */
public final class MultiCreativeWidgetFactory {
    private final ITransformer<MultiTypeCreativeInfoWithStyle, MulticreativeInfo> multiCreativeWidgetTransformer;

    public MultiCreativeWidgetFactory(ITransformer<MultiTypeCreativeInfoWithStyle, MulticreativeInfo> iTransformer) {
        p.j(iTransformer, "multiCreativeWidgetTransformer");
        this.multiCreativeWidgetTransformer = iTransformer;
    }

    public final MulticreativeInfo getCard(MultiTypeCreativeWidget multiTypeCreativeWidget) {
        p.j(multiTypeCreativeWidget, PaymentType.CARD_GROUP);
        if (!multiTypeCreativeWidget.getWidgetInfo().is(MultiTypeCreativeInfoWithStyle.class)) {
            return null;
        }
        ITransformer<MultiTypeCreativeInfoWithStyle, MulticreativeInfo> iTransformer = this.multiCreativeWidgetTransformer;
        Message unpack = multiTypeCreativeWidget.getWidgetInfo().unpack(MultiTypeCreativeInfoWithStyle.class);
        p.i(unpack, "card.widgetInfo.unpack(M…nfoWithStyle::class.java)");
        return iTransformer.transform(unpack);
    }
}
