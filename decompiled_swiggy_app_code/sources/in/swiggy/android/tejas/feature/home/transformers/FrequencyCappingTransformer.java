package in.swiggy.android.tejas.feature.home.transformers;

import com.swiggy.gandalf.widgets.v2.FrequencyCapping;
import i20.t;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: FrequencyCappingTransformer.kt */
public final class FrequencyCappingTransformer implements ITransformer<FrequencyCapping, in.swiggy.android.tejas.feature.home.model.FrequencyCapping> {
    public in.swiggy.android.tejas.feature.home.model.FrequencyCapping transform(FrequencyCapping frequencyCapping) {
        p.j(frequencyCapping, t.V);
        if (!frequencyCapping.getCappingEnabled()) {
            return null;
        }
        String cappingMode = frequencyCapping.getCappingMode();
        if (cappingMode == null || cappingMode.length() == 0) {
            return null;
        }
        boolean cappingEnabled = frequencyCapping.getCappingEnabled();
        String cappingMode2 = frequencyCapping.getCappingMode();
        p.i(cappingMode2, "t.cappingMode");
        return new in.swiggy.android.tejas.feature.home.model.FrequencyCapping(cappingEnabled, cappingMode2);
    }
}
