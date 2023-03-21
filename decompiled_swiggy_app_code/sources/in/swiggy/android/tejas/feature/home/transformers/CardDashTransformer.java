package in.swiggy.android.tejas.feature.home.transformers;

import com.swiggy.gandalf.home.protobuf.DashCardGroupDto;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.CardDash;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.feature.listing.cta.model.CtaMetaInfo;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: CardDashTransformer.kt */
public final class CardDashTransformer implements ITransformer<DashCardGroupDto.DashCardItemData, CardDash> {
    public CardDash transform(DashCardGroupDto.DashCardItemData dashCardItemData) {
        p.j(dashCardItemData, t.V);
        String id2 = dashCardItemData.getId();
        p.i(id2, "t.id");
        String title = dashCardItemData.getData().getTitle();
        p.i(title, "t.data.title");
        String subtitle = dashCardItemData.getData().getSubtitle();
        p.i(subtitle, "t.data.subtitle");
        String imageId = dashCardItemData.getData().getImageId();
        p.i(imageId, "t.data.imageId");
        String link = dashCardItemData.getAction().getLink();
        String text = dashCardItemData.getAction().getText();
        String type = dashCardItemData.getAction().getType();
        p.i(type, "t.action.type");
        return new CardDash(id2, title, subtitle, imageId, new CTA(link, text, type, (CtaMetaInfo) null, 8, (i) null));
    }
}
