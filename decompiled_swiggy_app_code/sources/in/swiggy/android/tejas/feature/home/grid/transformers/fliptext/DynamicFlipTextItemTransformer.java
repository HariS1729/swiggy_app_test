package in.swiggy.android.tejas.feature.home.grid.transformers.fliptext;

import com.swiggy.gandalf.widgets.v2.Cta;
import com.swiggy.gandalf.widgets.v2.LotteCardInfo;
import com.swiggy.gandalf.widgets.v2.MxNFlipTextCardInfo;
import i20.t;
import in.swiggy.android.tejas.feature.home.grid.model.fliptext.DynamicFlipTextEntity;
import in.swiggy.android.tejas.feature.home.grid.model.fliptext.DynamicFlipTextItem;
import in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieItem;
import in.swiggy.android.tejas.feature.listing.cta.model.CTA;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: DynamicFlipTextItemTransformer.kt */
public final class DynamicFlipTextItemTransformer implements ITransformer<MxNFlipTextCardInfo.FlipTextCardInfo, DynamicFlipTextEntity> {
    private final ITransformer<Cta, CTA> ctaTransformer;
    private final ITransformer<LotteCardInfo, RemoteLottieItem> dynamicFlipTextLottieTransformer;

    public DynamicFlipTextItemTransformer(ITransformer<LotteCardInfo, RemoteLottieItem> iTransformer, ITransformer<Cta, CTA> iTransformer2) {
        p.j(iTransformer, "dynamicFlipTextLottieTransformer");
        p.j(iTransformer2, "ctaTransformer");
        this.dynamicFlipTextLottieTransformer = iTransformer;
        this.ctaTransformer = iTransformer2;
    }

    public final ITransformer<Cta, CTA> getCtaTransformer() {
        return this.ctaTransformer;
    }

    public final ITransformer<LotteCardInfo, RemoteLottieItem> getDynamicFlipTextLottieTransformer() {
        return this.dynamicFlipTextLottieTransformer;
    }

    public DynamicFlipTextEntity transform(MxNFlipTextCardInfo.FlipTextCardInfo flipTextCardInfo) {
        p.j(flipTextCardInfo, t.V);
        if (p.e(flipTextCardInfo, MxNFlipTextCardInfo.FlipTextCardInfo.getDefaultInstance())) {
            return null;
        }
        ITransformer<LotteCardInfo, RemoteLottieItem> iTransformer = this.dynamicFlipTextLottieTransformer;
        LotteCardInfo logoLottie = flipTextCardInfo.getLogoLottie();
        p.i(logoLottie, "t.logoLottie");
        ITransformer<LotteCardInfo, RemoteLottieItem> iTransformer2 = this.dynamicFlipTextLottieTransformer;
        LotteCardInfo secondaryLogoLottie = flipTextCardInfo.getSecondaryLogoLottie();
        p.i(secondaryLogoLottie, "t.secondaryLogoLottie");
        ITransformer<Cta, CTA> iTransformer3 = this.ctaTransformer;
        Cta cta = flipTextCardInfo.getCta();
        p.i(cta, "t.cta");
        return new DynamicFlipTextEntity(new DynamicFlipTextItem(flipTextCardInfo.getBannerId(), iTransformer.transform(logoLottie), flipTextCardInfo.getLogoImage(), iTransformer2.transform(secondaryLogoLottie), flipTextCardInfo.getSecondaryLogoImage(), flipTextCardInfo.getBgImage(), flipTextCardInfo.getText(), flipTextCardInfo.getTextColor(), iTransformer3.transform(cta)));
    }
}
