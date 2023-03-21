package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.widgets.v2.LeftToRightLinearGradient;
import i20.t;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: LeftToRightLinearGradientTransformer.kt */
public final class LeftToRightLinearGradientTransformer implements ITransformer<LeftToRightLinearGradient, in.swiggy.android.tejas.feature.home.model.multicreative.LeftToRightLinearGradient> {
    public in.swiggy.android.tejas.feature.home.model.multicreative.LeftToRightLinearGradient transform(LeftToRightLinearGradient leftToRightLinearGradient) {
        p.j(leftToRightLinearGradient, t.V);
        String startColorHexcode = leftToRightLinearGradient.getStartColorHexcode();
        p.i(startColorHexcode, "t.startColorHexcode");
        String endColorHexcode = leftToRightLinearGradient.getEndColorHexcode();
        p.i(endColorHexcode, "t.endColorHexcode");
        return new in.swiggy.android.tejas.feature.home.model.multicreative.LeftToRightLinearGradient(startColorHexcode, endColorHexcode);
    }
}
