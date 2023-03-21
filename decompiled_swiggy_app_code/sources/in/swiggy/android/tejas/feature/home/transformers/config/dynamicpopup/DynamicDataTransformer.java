package in.swiggy.android.tejas.feature.home.transformers.config.dynamicpopup;

import com.swiggy.gandalf.widgets.v2.AssociatedParams;
import com.swiggy.gandalf.widgets.v2.DynamicInfo;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.DynamicData;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: DynamicDataTransformer.kt */
public final class DynamicDataTransformer implements ITransformer<List<? extends DynamicInfo>, List<? extends DynamicData>> {
    private final AssociatedParamListTransformer associatedParamListTransformer;

    public DynamicDataTransformer(AssociatedParamListTransformer associatedParamListTransformer2) {
        p.j(associatedParamListTransformer2, "associatedParamListTransformer");
        this.associatedParamListTransformer = associatedParamListTransformer2;
    }

    public List<DynamicData> transform(List<DynamicInfo> list) {
        p.j(list, t.V);
        ArrayList arrayList = new ArrayList();
        for (DynamicInfo dynamicInfo : list) {
            String id2 = dynamicInfo.getId();
            p.i(id2, "info.id");
            String value = dynamicInfo.getValue();
            p.i(value, "info.value");
            String type = dynamicInfo.getType();
            p.i(type, "info.type");
            AssociatedParamListTransformer associatedParamListTransformer2 = this.associatedParamListTransformer;
            List<AssociatedParams> associatedParamsList = dynamicInfo.getAssociatedParamsList();
            p.i(associatedParamsList, "info.associatedParamsList");
            arrayList.add(new DynamicData(id2, value, type, associatedParamListTransformer2.transform(associatedParamsList)));
        }
        return arrayList;
    }
}
