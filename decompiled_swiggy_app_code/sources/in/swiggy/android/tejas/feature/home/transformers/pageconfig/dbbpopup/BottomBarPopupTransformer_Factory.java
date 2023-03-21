package in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup;

import com.swiggy.gandalf.widgets.v2.CPPopupWidget;
import com.swiggy.gandalf.widgets.v2.Layout;
import com.swiggy.gandalf.widgets.v2.PopUpWidget;
import in.swiggy.android.tejas.feature.home.model.AutoscrollConfig;
import in.swiggy.android.tejas.feature.home.model.pageconfig.PopUpWidgetCrossButtonPosition;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.BottomBarPopupCard;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.BusinessLineInfo;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.Frequency;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class BottomBarPopupTransformer_Factory implements e<BottomBarPopupTransformer> {
    private final Provider<ITransformer<Layout.AutoScrollConfig, AutoscrollConfig>> autoscrollTransformerProvider;
    private final Provider<ITransformer<CPPopupWidget.MultiTypeCreative, BottomBarPopupCard>> bottomBarPopupCardTransformerProvider;
    private final Provider<ITransformer<CPPopupWidget.BLInfo, BusinessLineInfo>> businessLineInfoTransformerProvider;
    private final Provider<ITransformer<PopUpWidget.CrossButtonPosition, PopUpWidgetCrossButtonPosition>> crossButtonPositionTransformerProvider;
    private final Provider<ITransformer<CPPopupWidget.CPPopupFrequencyCapping, Frequency>> frequencyTransformerProvider;

    public BottomBarPopupTransformer_Factory(Provider<ITransformer<PopUpWidget.CrossButtonPosition, PopUpWidgetCrossButtonPosition>> provider, Provider<ITransformer<Layout.AutoScrollConfig, AutoscrollConfig>> provider2, Provider<ITransformer<CPPopupWidget.MultiTypeCreative, BottomBarPopupCard>> provider3, Provider<ITransformer<CPPopupWidget.CPPopupFrequencyCapping, Frequency>> provider4, Provider<ITransformer<CPPopupWidget.BLInfo, BusinessLineInfo>> provider5) {
        this.crossButtonPositionTransformerProvider = provider;
        this.autoscrollTransformerProvider = provider2;
        this.bottomBarPopupCardTransformerProvider = provider3;
        this.frequencyTransformerProvider = provider4;
        this.businessLineInfoTransformerProvider = provider5;
    }

    public static BottomBarPopupTransformer_Factory create(Provider<ITransformer<PopUpWidget.CrossButtonPosition, PopUpWidgetCrossButtonPosition>> provider, Provider<ITransformer<Layout.AutoScrollConfig, AutoscrollConfig>> provider2, Provider<ITransformer<CPPopupWidget.MultiTypeCreative, BottomBarPopupCard>> provider3, Provider<ITransformer<CPPopupWidget.CPPopupFrequencyCapping, Frequency>> provider4, Provider<ITransformer<CPPopupWidget.BLInfo, BusinessLineInfo>> provider5) {
        return new BottomBarPopupTransformer_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static BottomBarPopupTransformer newInstance(ITransformer<PopUpWidget.CrossButtonPosition, PopUpWidgetCrossButtonPosition> iTransformer, ITransformer<Layout.AutoScrollConfig, AutoscrollConfig> iTransformer2, ITransformer<CPPopupWidget.MultiTypeCreative, BottomBarPopupCard> iTransformer3, ITransformer<CPPopupWidget.CPPopupFrequencyCapping, Frequency> iTransformer4, ITransformer<CPPopupWidget.BLInfo, BusinessLineInfo> iTransformer5) {
        return new BottomBarPopupTransformer(iTransformer, iTransformer2, iTransformer3, iTransformer4, iTransformer5);
    }

    public BottomBarPopupTransformer get() {
        return newInstance(this.crossButtonPositionTransformerProvider.get(), this.autoscrollTransformerProvider.get(), this.bottomBarPopupCardTransformerProvider.get(), this.frequencyTransformerProvider.get(), this.businessLineInfoTransformerProvider.get());
    }
}
