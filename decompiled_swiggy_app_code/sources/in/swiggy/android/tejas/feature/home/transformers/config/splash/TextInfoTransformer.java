package in.swiggy.android.tejas.feature.home.transformers.config.splash;

import com.swiggy.gandalf.widgets.v2.RichText;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.pageconfig.splash.TextInfo;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: TextInfoTransformer.kt */
public final class TextInfoTransformer implements ITransformer<RichText, TextInfo> {
    public TextInfo transform(RichText richText) {
        p.j(richText, t.V);
        return new TextInfo(richText.getTitle(), richText.getSubtitle(), richText.getTitleColor(), richText.getSubtitleColor());
    }
}
