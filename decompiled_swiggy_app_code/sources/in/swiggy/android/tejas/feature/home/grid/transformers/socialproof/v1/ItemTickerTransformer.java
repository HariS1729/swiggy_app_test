package in.swiggy.android.tejas.feature.home.grid.transformers.socialproof.v1;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import com.swiggy.gandalf.home.protobuf.Cta;
import com.swiggy.gandalf.home.protobuf.TickerLayoutCard;
import i20.t;
import in.swiggy.android.tejas.feature.home.grid.model.socialproof.ItemTicker;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: ItemTickerTransformer.kt */
public final class ItemTickerTransformer implements ITransformer<TickerLayoutCard.TickerCardInfo, ItemTicker> {
    private final ITransformer<Cta, CTA> ctaTransformer;

    public ItemTickerTransformer(ITransformer<Cta, CTA> iTransformer) {
        p.j(iTransformer, "ctaTransformer");
        this.ctaTransformer = iTransformer;
    }

    public ItemTicker transform(TickerLayoutCard.TickerCardInfo tickerCardInfo) {
        p.j(tickerCardInfo, t.V);
        ITransformer<Cta, CTA> iTransformer = this.ctaTransformer;
        Cta action = tickerCardInfo.getAction();
        p.i(action, "t.action");
        CTA transform = iTransformer.transform(action);
        String text = tickerCardInfo.getText();
        p.i(text, "t.text");
        if (!(!o.A(text))) {
            return null;
        }
        String id2 = tickerCardInfo.getId();
        String imageId = tickerCardInfo.getImageId();
        String text2 = tickerCardInfo.getText();
        p.i(id2, DistributedTracing.NR_ID_ATTRIBUTE);
        p.i(text2, "text");
        p.i(imageId, "imageId");
        return new ItemTicker(id2, text2, imageId, transform);
    }
}
