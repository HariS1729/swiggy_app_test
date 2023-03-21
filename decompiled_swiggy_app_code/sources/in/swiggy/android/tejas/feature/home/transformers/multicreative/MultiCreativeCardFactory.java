package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.google.protobuf.Any;
import com.google.protobuf.Message;
import com.swiggy.gandalf.widgets.v2.Cta;
import com.swiggy.gandalf.widgets.v2.ImageInfoLayoutCard;
import com.swiggy.gandalf.widgets.v2.LotteInfoLayoutCard;
import com.swiggy.gandalf.widgets.v2.MultiTypeCreativeInfoWithStyle;
import com.swiggy.gandalf.widgets.v2.VideoCardInfo;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.multicreative.CallOut;
import in.swiggy.android.tejas.feature.home.model.multicreative.ImageCard;
import in.swiggy.android.tejas.feature.home.model.multicreative.LottieCard;
import in.swiggy.android.tejas.feature.home.model.multicreative.MultiCreativeCard;
import in.swiggy.android.tejas.feature.home.model.multicreative.VideoCard;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: MultiCreativeCardFactory.kt */
public final class MultiCreativeCardFactory {
    private final ITransformer<MultiTypeCreativeInfoWithStyle.Callout, CallOut> callOutTransformer;
    private final ITransformer<Cta, CTA> ctaTransformer;
    private final ITransformer<ImageInfoLayoutCard.ImageCardInfo, ImageCard> imageCardTransformer;
    private final ITransformer<LotteInfoLayoutCard.LotteCardInfo, LottieCard> lottieCardTransformer;
    private final ITransformer<VideoCardInfo, VideoCard> videoCardTransformer;

    public MultiCreativeCardFactory(ITransformer<ImageInfoLayoutCard.ImageCardInfo, ImageCard> iTransformer, ITransformer<LotteInfoLayoutCard.LotteCardInfo, LottieCard> iTransformer2, ITransformer<VideoCardInfo, VideoCard> iTransformer3, ITransformer<Cta, CTA> iTransformer4, ITransformer<MultiTypeCreativeInfoWithStyle.Callout, CallOut> iTransformer5) {
        p.j(iTransformer, "imageCardTransformer");
        p.j(iTransformer2, "lottieCardTransformer");
        p.j(iTransformer3, "videoCardTransformer");
        p.j(iTransformer4, "ctaTransformer");
        p.j(iTransformer5, "callOutTransformer");
        this.imageCardTransformer = iTransformer;
        this.lottieCardTransformer = iTransformer2;
        this.videoCardTransformer = iTransformer3;
        this.ctaTransformer = iTransformer4;
        this.callOutTransformer = iTransformer5;
    }

    public final MultiCreativeCard getCard(MultiTypeCreativeInfoWithStyle.MultiTypeCreative multiTypeCreative) {
        MultiCreativeCard multiCreativeCard;
        p.j(multiTypeCreative, t.V);
        Any cardInfo = multiTypeCreative.getCardInfo();
        if (cardInfo.is(ImageInfoLayoutCard.ImageCardInfo.class)) {
            ITransformer<ImageInfoLayoutCard.ImageCardInfo, ImageCard> iTransformer = this.imageCardTransformer;
            Message unpack = cardInfo.unpack(ImageInfoLayoutCard.ImageCardInfo.class);
            p.i(unpack, "card.unpack(ImageInfoLay…mageCardInfo::class.java)");
            multiCreativeCard = iTransformer.transform(unpack);
        } else if (cardInfo.is(LotteInfoLayoutCard.LotteCardInfo.class)) {
            ITransformer<LotteInfoLayoutCard.LotteCardInfo, LottieCard> iTransformer2 = this.lottieCardTransformer;
            Message unpack2 = cardInfo.unpack(LotteInfoLayoutCard.LotteCardInfo.class);
            p.i(unpack2, "card.unpack(LotteInfoLay…otteCardInfo::class.java)");
            multiCreativeCard = iTransformer2.transform(unpack2);
        } else if (cardInfo.is(VideoCardInfo.class)) {
            ITransformer<VideoCardInfo, VideoCard> iTransformer3 = this.videoCardTransformer;
            Message unpack3 = cardInfo.unpack(VideoCardInfo.class);
            p.i(unpack3, "card.unpack(VideoCardInfo::class.java)");
            multiCreativeCard = iTransformer3.transform(unpack3);
        } else {
            multiCreativeCard = null;
        }
        if (multiCreativeCard == null) {
            return null;
        }
        multiCreativeCard.setTitle(multiTypeCreative.getRenderableInfo().getTitle());
        multiCreativeCard.setSubTitle(multiTypeCreative.getRenderableInfo().getSubtitle());
        ITransformer<Cta, CTA> iTransformer4 = this.ctaTransformer;
        Cta action = multiTypeCreative.getRenderableInfo().getAction();
        p.i(action, "t.renderableInfo.action");
        multiCreativeCard.setCta(iTransformer4.transform(action));
        ITransformer<MultiTypeCreativeInfoWithStyle.Callout, CallOut> iTransformer5 = this.callOutTransformer;
        MultiTypeCreativeInfoWithStyle.Callout callout = multiTypeCreative.getRenderableInfo().getCallout();
        p.i(callout, "t.renderableInfo.callout");
        multiCreativeCard.setCallOut(iTransformer5.transform(callout));
        return multiCreativeCard;
    }
}
