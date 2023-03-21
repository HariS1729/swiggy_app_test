package in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup;

import com.swiggy.gandalf.widgets.v2.CPPopupWidget;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.BusinessLineInfo;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: BusinessLineInfoTransformer.kt */
public final class BusinessLineInfoTransformer implements ITransformer<CPPopupWidget.BLInfo, BusinessLineInfo> {
    public BusinessLineInfo transform(CPPopupWidget.BLInfo bLInfo) {
        p.j(bLInfo, t.V);
        String blId = bLInfo.getBlId();
        p.i(blId, "t.blId");
        String iconId = bLInfo.getIconId();
        p.i(iconId, "t.iconId");
        return new BusinessLineInfo(blId, iconId);
    }
}
