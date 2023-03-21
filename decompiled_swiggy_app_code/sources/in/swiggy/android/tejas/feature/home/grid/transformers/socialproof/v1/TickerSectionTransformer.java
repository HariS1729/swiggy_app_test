package in.swiggy.android.tejas.feature.home.grid.transformers.socialproof.v1;

import com.swiggy.gandalf.home.protobuf.TickerLayoutCard;
import i20.t;
import in.swiggy.android.tejas.feature.home.grid.model.socialproof.GridTickerSection;
import in.swiggy.android.tejas.feature.home.grid.model.socialproof.ItemTicker;
import in.swiggy.android.tejas.feature.home.grid.model.socialproof.TickerEntity;
import in.swiggy.android.tejas.feature.home.grid.model.socialproof.TickerStyle;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: TickerSectionTransformer.kt */
public final class TickerSectionTransformer implements ITransformer<TickerLayoutCard, GridTickerSection> {
    private final ITransformer<TickerLayoutCard.TickerCardInfo, ItemTicker> itemTransformer;
    private final ITransformer<TickerLayoutCard.ItemStyle, TickerStyle> styleTransformer;

    public TickerSectionTransformer(ITransformer<TickerLayoutCard.TickerCardInfo, ItemTicker> iTransformer, ITransformer<TickerLayoutCard.ItemStyle, TickerStyle> iTransformer2) {
        p.j(iTransformer, "itemTransformer");
        p.j(iTransformer2, "styleTransformer");
        this.itemTransformer = iTransformer;
        this.styleTransformer = iTransformer2;
    }

    public GridTickerSection transform(TickerLayoutCard tickerLayoutCard) {
        p.j(tickerLayoutCard, t.V);
        ITransformer<TickerLayoutCard.ItemStyle, TickerStyle> iTransformer = this.styleTransformer;
        TickerLayoutCard.ItemStyle style = tickerLayoutCard.getStyle();
        p.i(style, "t.style");
        TickerStyle transform = iTransformer.transform(style);
        if (transform == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<TickerLayoutCard.TickerCardInfo> infoList = tickerLayoutCard.getInfoList();
        p.i(infoList, "t.infoList");
        for (TickerLayoutCard.TickerCardInfo tickerCardInfo : infoList) {
            ITransformer<TickerLayoutCard.TickerCardInfo, ItemTicker> iTransformer2 = this.itemTransformer;
            p.i(tickerCardInfo, "it");
            ItemTicker transform2 = iTransformer2.transform(tickerCardInfo);
            if (transform2 != null) {
                arrayList.add(new TickerEntity(transform2, transform.getNoOfLines()));
            }
        }
        return new GridTickerSection(arrayList, transform);
    }
}
