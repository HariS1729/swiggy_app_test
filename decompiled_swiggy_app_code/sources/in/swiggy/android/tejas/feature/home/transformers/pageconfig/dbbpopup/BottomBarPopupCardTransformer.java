package in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup;

import com.swiggy.gandalf.widgets.v2.CPPopupWidget;
import com.swiggy.gandalf.widgets.v2.CreativeType;
import com.swiggy.gandalf.widgets.v2.Cta;
import i20.t;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.BottomBarPopupCard;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.BottomBarPopupCardType;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.TextLine;
import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.CTAInfo;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.p;

/* compiled from: BottomBarPopupCardTransformer.kt */
public final class BottomBarPopupCardTransformer implements ITransformer<CPPopupWidget.MultiTypeCreative, BottomBarPopupCard> {
    private final ITransformer<CreativeType, BottomBarPopupCardType> creativeTransformer;
    private final ITransformer<Cta, CTAInfo> ctaTransformer;
    private final ITransformer<CPPopupWidget.RenderableInfo, TextLine> textLineTransformer;

    public BottomBarPopupCardTransformer(ITransformer<CPPopupWidget.RenderableInfo, TextLine> iTransformer, ITransformer<Cta, CTAInfo> iTransformer2, ITransformer<CreativeType, BottomBarPopupCardType> iTransformer3) {
        p.j(iTransformer, "textLineTransformer");
        p.j(iTransformer2, "ctaTransformer");
        p.j(iTransformer3, "creativeTransformer");
        this.textLineTransformer = iTransformer;
        this.ctaTransformer = iTransformer2;
        this.creativeTransformer = iTransformer3;
    }

    public BottomBarPopupCard transform(CPPopupWidget.MultiTypeCreative multiTypeCreative) {
        p.j(multiTypeCreative, t.V);
        String creativeId = multiTypeCreative.getCreativeId();
        p.i(creativeId, "creativeId");
        String creativeId2 = multiTypeCreative.getCreativeId();
        p.i(creativeId2, "creativeId");
        ITransformer<CPPopupWidget.RenderableInfo, TextLine> iTransformer = this.textLineTransformer;
        CPPopupWidget.RenderableInfo greetingText = multiTypeCreative.getGreetingText();
        p.i(greetingText, "greetingText");
        TextLine transform = iTransformer.transform(greetingText);
        Objects.requireNonNull(transform, "null cannot be cast to non-null type in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.TextLine");
        TextLine textLine = transform;
        ITransformer<Cta, CTAInfo> iTransformer2 = this.ctaTransformer;
        Cta action = multiTypeCreative.getAction();
        p.i(action, LogCategory.ACTION);
        CTAInfo transform2 = iTransformer2.transform(action);
        Objects.requireNonNull(transform2, "null cannot be cast to non-null type in.swiggy.android.tejas.feature.home.model.pageconfig.splash.CTAInfo");
        CTAInfo cTAInfo = transform2;
        List<CPPopupWidget.RenderableInfo> renderableInfoList = multiTypeCreative.getRenderableInfoList();
        p.i(renderableInfoList, "renderableInfoList");
        ArrayList arrayList = new ArrayList();
        for (CPPopupWidget.RenderableInfo renderableInfo : renderableInfoList) {
            ITransformer<CPPopupWidget.RenderableInfo, TextLine> iTransformer3 = this.textLineTransformer;
            p.i(renderableInfo, "info");
            TextLine transform3 = iTransformer3.transform(renderableInfo);
            if (transform3 != null) {
                arrayList.add(transform3);
            }
        }
        ITransformer<CreativeType, BottomBarPopupCardType> iTransformer4 = this.creativeTransformer;
        CreativeType creativeType = multiTypeCreative.getCreativeType();
        p.i(creativeType, "creativeType");
        BottomBarPopupCardType transform4 = iTransformer4.transform(creativeType);
        Objects.requireNonNull(transform4, "null cannot be cast to non-null type in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.BottomBarPopupCardType");
        return new BottomBarPopupCard(creativeId, creativeId2, textLine, cTAInfo, arrayList, transform4);
    }
}
