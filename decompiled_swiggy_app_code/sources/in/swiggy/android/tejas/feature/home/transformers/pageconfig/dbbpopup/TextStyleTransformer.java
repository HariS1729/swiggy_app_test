package in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup;

import com.swiggy.gandalf.widgets.v2.CPPopupWidget;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.TextStyle;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: TextStyleTransformer.kt */
public final class TextStyleTransformer implements ITransformer<CPPopupWidget.TextStyle, TextStyle> {
    public TextStyle transform(CPPopupWidget.TextStyle textStyle) {
        p.j(textStyle, t.V);
        String textColor = textStyle.getTextColor();
        p.i(textColor, "t.textColor");
        return new TextStyle(textColor);
    }
}
