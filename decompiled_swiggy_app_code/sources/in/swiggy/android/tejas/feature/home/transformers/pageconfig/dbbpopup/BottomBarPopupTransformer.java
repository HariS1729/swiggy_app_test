package in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup;

import com.newrelic.agent.android.distributedtracing.DistributedTracing;
import com.swiggy.gandalf.widgets.v2.CPPopupWidget;
import com.swiggy.gandalf.widgets.v2.Layout;
import com.swiggy.gandalf.widgets.v2.PopUpWidget;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.AutoscrollConfig;
import in.swiggy.android.tejas.feature.home.model.pageconfig.PopUpWidgetCrossButtonPosition;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.BottomBarPopup;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.BottomBarPopupCard;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.BusinessLineInfo;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.Frequency;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.p;

/* compiled from: BottomBarPopupTransformer.kt */
public final class BottomBarPopupTransformer implements ITransformer<CPPopupWidget, BottomBarPopup> {
    private final ITransformer<Layout.AutoScrollConfig, AutoscrollConfig> autoscrollTransformer;
    private final ITransformer<CPPopupWidget.MultiTypeCreative, BottomBarPopupCard> bottomBarPopupCardTransformer;
    private final ITransformer<CPPopupWidget.BLInfo, BusinessLineInfo> businessLineInfoTransformer;
    private final ITransformer<PopUpWidget.CrossButtonPosition, PopUpWidgetCrossButtonPosition> crossButtonPositionTransformer;
    private final ITransformer<CPPopupWidget.CPPopupFrequencyCapping, Frequency> frequencyTransformer;

    public BottomBarPopupTransformer(ITransformer<PopUpWidget.CrossButtonPosition, PopUpWidgetCrossButtonPosition> iTransformer, ITransformer<Layout.AutoScrollConfig, AutoscrollConfig> iTransformer2, ITransformer<CPPopupWidget.MultiTypeCreative, BottomBarPopupCard> iTransformer3, ITransformer<CPPopupWidget.CPPopupFrequencyCapping, Frequency> iTransformer4, ITransformer<CPPopupWidget.BLInfo, BusinessLineInfo> iTransformer5) {
        p.j(iTransformer, "crossButtonPositionTransformer");
        p.j(iTransformer2, "autoscrollTransformer");
        p.j(iTransformer3, "bottomBarPopupCardTransformer");
        p.j(iTransformer4, "frequencyTransformer");
        p.j(iTransformer5, "businessLineInfoTransformer");
        this.crossButtonPositionTransformer = iTransformer;
        this.autoscrollTransformer = iTransformer2;
        this.bottomBarPopupCardTransformer = iTransformer3;
        this.frequencyTransformer = iTransformer4;
        this.businessLineInfoTransformer = iTransformer5;
    }

    public BottomBarPopup transform(CPPopupWidget cPPopupWidget) {
        p.j(cPPopupWidget, t.V);
        String id2 = cPPopupWidget.getId();
        p.i(id2, DistributedTracing.NR_ID_ATTRIBUTE);
        ITransformer<PopUpWidget.CrossButtonPosition, PopUpWidgetCrossButtonPosition> iTransformer = this.crossButtonPositionTransformer;
        PopUpWidget.CrossButtonPosition position = cPPopupWidget.getPosition();
        p.i(position, "position");
        PopUpWidgetCrossButtonPosition transform = iTransformer.transform(position);
        Objects.requireNonNull(transform, "null cannot be cast to non-null type in.swiggy.android.tejas.feature.home.model.pageconfig.PopUpWidgetCrossButtonPosition");
        PopUpWidgetCrossButtonPosition popUpWidgetCrossButtonPosition = transform;
        ITransformer<Layout.AutoScrollConfig, AutoscrollConfig> iTransformer2 = this.autoscrollTransformer;
        Layout.AutoScrollConfig scrollConfig = cPPopupWidget.getScrollConfig();
        p.i(scrollConfig, "scrollConfig");
        AutoscrollConfig transform2 = iTransformer2.transform(scrollConfig);
        Objects.requireNonNull(transform2, "null cannot be cast to non-null type in.swiggy.android.tejas.feature.home.model.AutoscrollConfig");
        AutoscrollConfig autoscrollConfig = transform2;
        List<CPPopupWidget.MultiTypeCreative> infoList = cPPopupWidget.getInfoList();
        p.i(infoList, "infoList");
        ArrayList arrayList = new ArrayList();
        for (CPPopupWidget.MultiTypeCreative multiTypeCreative : infoList) {
            ITransformer<CPPopupWidget.MultiTypeCreative, BottomBarPopupCard> iTransformer3 = this.bottomBarPopupCardTransformer;
            p.i(multiTypeCreative, "creative");
            BottomBarPopupCard transform3 = iTransformer3.transform(multiTypeCreative);
            if (transform3 != null) {
                arrayList.add(transform3);
            }
        }
        ITransformer<CPPopupWidget.CPPopupFrequencyCapping, Frequency> iTransformer4 = this.frequencyTransformer;
        CPPopupWidget.CPPopupFrequencyCapping cpPopupFrequencyCapping = cPPopupWidget.getCpPopupFrequencyCapping();
        p.i(cpPopupFrequencyCapping, "cpPopupFrequencyCapping");
        Frequency transform4 = iTransformer4.transform(cpPopupFrequencyCapping);
        Objects.requireNonNull(transform4, "null cannot be cast to non-null type in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.Frequency");
        String backgroundColour = cPPopupWidget.getBackgroundColour();
        p.i(backgroundColour, "backgroundColour");
        int autoCloseTime = cPPopupWidget.getAutoCloseTime();
        ITransformer<CPPopupWidget.BLInfo, BusinessLineInfo> iTransformer5 = this.businessLineInfoTransformer;
        CPPopupWidget.BLInfo blInfo = cPPopupWidget.getBlInfo();
        p.i(blInfo, "blInfo");
        BusinessLineInfo transform5 = iTransformer5.transform(blInfo);
        Objects.requireNonNull(transform5, "null cannot be cast to non-null type in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.BusinessLineInfo");
        return new BottomBarPopup(id2, popUpWidgetCrossButtonPosition, autoscrollConfig, arrayList, transform4, backgroundColour, autoCloseTime, transform5);
    }
}
