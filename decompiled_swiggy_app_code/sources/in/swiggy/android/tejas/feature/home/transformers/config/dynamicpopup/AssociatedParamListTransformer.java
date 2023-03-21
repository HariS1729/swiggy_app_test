package in.swiggy.android.tejas.feature.home.transformers.config.dynamicpopup;

import com.swiggy.gandalf.widgets.v2.AssociatedParams;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.AssociatedParam;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: AssociatedParamListTransformer.kt */
public final class AssociatedParamListTransformer implements ITransformer<List<? extends AssociatedParams>, List<? extends AssociatedParam>> {
    public List<AssociatedParam> transform(List<AssociatedParams> list) {
        p.j(list, t.V);
        ArrayList arrayList = new ArrayList();
        for (AssociatedParams associatedParams : list) {
            String id2 = associatedParams.getId();
            p.i(id2, "params.id");
            String value = associatedParams.getValue();
            p.i(value, "params.value");
            arrayList.add(new AssociatedParam(id2, value));
        }
        return arrayList;
    }
}
