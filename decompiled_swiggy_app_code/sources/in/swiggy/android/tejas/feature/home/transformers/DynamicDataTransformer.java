package in.swiggy.android.tejas.feature.home.transformers;

import com.swiggy.gandalf.home.protobuf.BannerCarouselDto;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.AssociatedParam;
import in.swiggy.android.tejas.feature.home.model.DynamicData;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: DynamicDataTransformer.kt */
public final class DynamicDataTransformer implements ITransformer<List<BannerCarouselDto.DynamicData>, List<DynamicData>> {
    private final BannerAssociatedParamTransformer paramsTransformer;

    public DynamicDataTransformer(BannerAssociatedParamTransformer bannerAssociatedParamTransformer) {
        p.j(bannerAssociatedParamTransformer, "paramsTransformer");
        this.paramsTransformer = bannerAssociatedParamTransformer;
    }

    public List<DynamicData> transform(List<BannerCarouselDto.DynamicData> list) {
        p.j(list, t.V);
        ArrayList arrayList = new ArrayList();
        for (BannerCarouselDto.DynamicData dynamicData : list) {
            BannerAssociatedParamTransformer bannerAssociatedParamTransformer = this.paramsTransformer;
            List<BannerCarouselDto.AssociatedParams> associatedParamsList = dynamicData.getAssociatedParamsList();
            p.i(associatedParamsList, "param.associatedParamsList");
            List<AssociatedParam> transform = bannerAssociatedParamTransformer.transform(associatedParamsList);
            String id2 = dynamicData.getId();
            p.i(id2, "param.id");
            String value = dynamicData.getValue();
            p.i(value, "param.value");
            String type = dynamicData.getType();
            p.i(type, "param.type");
            arrayList.add(new DynamicData(id2, value, type, transform));
        }
        return arrayList;
    }
}
