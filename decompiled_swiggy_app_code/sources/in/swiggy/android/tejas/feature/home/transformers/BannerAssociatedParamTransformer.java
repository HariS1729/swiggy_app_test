package in.swiggy.android.tejas.feature.home.transformers;

import com.swiggy.gandalf.home.protobuf.BannerCarouselDto;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.AssociatedParam;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: BannerAssociatedParamTransformer.kt */
public final class BannerAssociatedParamTransformer implements ITransformer<List<BannerCarouselDto.AssociatedParams>, List<AssociatedParam>> {
    public List<AssociatedParam> transform(List<BannerCarouselDto.AssociatedParams> list) {
        p.j(list, t.V);
        ArrayList arrayList = new ArrayList();
        for (BannerCarouselDto.AssociatedParams associatedParams : list) {
            String id2 = associatedParams.getId();
            p.i(id2, "param.id");
            String value = associatedParams.getValue();
            p.i(value, "param.value");
            arrayList.add(new AssociatedParam(id2, value));
        }
        return arrayList;
    }
}
