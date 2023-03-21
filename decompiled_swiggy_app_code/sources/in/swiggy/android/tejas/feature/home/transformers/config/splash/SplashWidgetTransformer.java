package in.swiggy.android.tejas.feature.home.transformers.config.splash;

import com.swiggy.gandalf.widgets.v2.Cta;
import com.swiggy.gandalf.widgets.v2.RichText;
import com.swiggy.gandalf.widgets.v2.TextBanner;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.CTAInfo;
import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.TextInfo;
import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.WidgetInfo;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: SplashWidgetTransformer.kt */
public final class SplashWidgetTransformer implements ITransformer<TextBanner, WidgetInfo> {
    private final ITransformer<Cta, CTAInfo> ctaInfoTransformer;
    private final ITransformer<RichText, TextInfo> textInfoTransformer;

    public SplashWidgetTransformer(ITransformer<RichText, TextInfo> iTransformer, ITransformer<Cta, CTAInfo> iTransformer2) {
        p.j(iTransformer, "textInfoTransformer");
        p.j(iTransformer2, "ctaInfoTransformer");
        this.textInfoTransformer = iTransformer;
        this.ctaInfoTransformer = iTransformer2;
    }

    public WidgetInfo transform(TextBanner textBanner) {
        p.j(textBanner, t.V);
        ITransformer<RichText, TextInfo> iTransformer = this.textInfoTransformer;
        RichText text = textBanner.getText();
        p.i(text, "t.text");
        ITransformer<Cta, CTAInfo> iTransformer2 = this.ctaInfoTransformer;
        Cta action = textBanner.getAction();
        p.i(action, "t.action");
        return new WidgetInfo(iTransformer.transform(text), iTransformer2.transform(action));
    }
}
