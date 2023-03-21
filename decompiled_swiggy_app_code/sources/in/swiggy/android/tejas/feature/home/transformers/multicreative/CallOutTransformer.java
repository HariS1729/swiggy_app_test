package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.widgets.v2.LeftToRightLinearGradient;
import com.swiggy.gandalf.widgets.v2.MultiTypeCreativeInfoWithStyle;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.multicreative.CallOut;
import in.swiggy.android.tejas.feature.home.model.multicreative.CallOutType;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: CallOutTransformer.kt */
public final class CallOutTransformer implements ITransformer<MultiTypeCreativeInfoWithStyle.Callout, CallOut> {
    private final CallOutTypeTransformer callOutTypeTransformer;
    private final LeftToRightLinearGradientTransformer gradientTransformer;

    public CallOutTransformer(CallOutTypeTransformer callOutTypeTransformer2, LeftToRightLinearGradientTransformer leftToRightLinearGradientTransformer) {
        p.j(callOutTypeTransformer2, "callOutTypeTransformer");
        p.j(leftToRightLinearGradientTransformer, "gradientTransformer");
        this.callOutTypeTransformer = callOutTypeTransformer2;
        this.gradientTransformer = leftToRightLinearGradientTransformer;
    }

    public CallOut transform(MultiTypeCreativeInfoWithStyle.Callout callout) {
        p.j(callout, t.V);
        String text = callout.getText();
        p.i(text, "t.text");
        String textColor = callout.getTextColor();
        p.i(textColor, "t.textColor");
        CallOutTypeTransformer callOutTypeTransformer2 = this.callOutTypeTransformer;
        MultiTypeCreativeInfoWithStyle.CalloutType type = callout.getType();
        p.i(type, "t.type");
        CallOutType transform = callOutTypeTransformer2.transform(type);
        LeftToRightLinearGradientTransformer leftToRightLinearGradientTransformer = this.gradientTransformer;
        LeftToRightLinearGradient backgroundGradient = callout.getBackgroundGradient();
        p.i(backgroundGradient, "t.backgroundGradient");
        return new CallOut(text, textColor, transform, leftToRightLinearGradientTransformer.transform(backgroundGradient));
    }
}
