package in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup;

import com.swiggy.gandalf.widgets.v2.CPPopupWidget;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.Frequency;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: FrequencyTransformer.kt */
public final class FrequencyTransformer implements ITransformer<CPPopupWidget.CPPopupFrequencyCapping, Frequency> {
    public Frequency transform(CPPopupWidget.CPPopupFrequencyCapping cPPopupFrequencyCapping) {
        p.j(cPPopupFrequencyCapping, t.V);
        return new Frequency(cPPopupFrequencyCapping.getFrequency(), cPPopupFrequencyCapping.getDurationDays());
    }
}
