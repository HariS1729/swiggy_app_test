package in.swiggy.android.tejas.feature.listing.analytics.transformer;

import com.swiggy.presentation.food.v2.ExcludeVariantGroup;
import i20.t;
import in.swiggy.android.tejas.oldapi.models.menu.GroupVariation;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: ExcludeVariantGroupTransformer.kt */
public final class ExcludeVariantGroupTransformer implements ITransformer<ExcludeVariantGroup, GroupVariation> {
    public GroupVariation transform(ExcludeVariantGroup excludeVariantGroup) {
        p.j(excludeVariantGroup, t.V);
        GroupVariation groupVariation = new GroupVariation();
        groupVariation.mGroupId = excludeVariantGroup.getGroupId();
        groupVariation.mVariationId = excludeVariantGroup.getVariationId();
        groupVariation.mIsSelected = excludeVariantGroup.getIsSelected();
        return groupVariation;
    }
}
