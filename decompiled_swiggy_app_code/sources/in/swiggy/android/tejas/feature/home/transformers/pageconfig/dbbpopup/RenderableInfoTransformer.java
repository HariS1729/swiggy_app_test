package in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup;

import com.swiggy.gandalf.widgets.v2.CPPopupWidget;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.TextLine;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.TextStyle;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: RenderableInfoTransformer.kt */
public final class RenderableInfoTransformer implements ITransformer<CPPopupWidget.RenderableInfo, TextLine> {
    private final ITransformer<CPPopupWidget.TextStyle, TextStyle> textStyleTransformer;

    public RenderableInfoTransformer(ITransformer<CPPopupWidget.TextStyle, TextStyle> iTransformer) {
        p.j(iTransformer, "textStyleTransformer");
        this.textStyleTransformer = iTransformer;
    }

    public TextLine transform(CPPopupWidget.RenderableInfo renderableInfo) {
        p.j(renderableInfo, t.V);
        ITransformer<CPPopupWidget.TextStyle, TextStyle> iTransformer = this.textStyleTransformer;
        CPPopupWidget.TextStyle textStyle = renderableInfo.getTextStyle();
        p.i(textStyle, "t.textStyle");
        TextStyle transform = iTransformer.transform(textStyle);
        if (transform == null) {
            return null;
        }
        String text = renderableInfo.getText();
        p.i(text, "t.text");
        return new TextLine(text, transform);
    }
}
