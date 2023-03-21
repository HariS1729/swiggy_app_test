package in.swiggy.android.tejas.feature.home.transformers.discovery.configs.video;

import com.google.protobuf.Message;
import com.swiggy.gandalf.widgets.v2.CPPopupWidget;
import com.swiggy.gandalf.widgets.v2.Card;
import com.swiggy.gandalf.widgets.v2.PopUpWidget;
import com.swiggy.gandalf.widgets.v2.SuccessResponse;
import com.swiggy.gandalf.widgets.v2.VideoPopup;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomePopUpWidget;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomePopup;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeVideoPopup;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.BottomBarPopup;
import in.swiggy.android.tejas.feature.home.transformers.config.dynamicpopup.PopUpWidgetTransformer;
import in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup.BottomBarPopupTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: DiscoveryPopupConfigTransformer.kt */
public final class DiscoveryPopupConfigTransformer implements ITransformer<SuccessResponse.PageConfigs, List<? extends HomePopup>> {
    private final BottomBarPopupTransformer bottomBarPopupTransformer;
    private final PopUpWidgetTransformer popUpWidgetTransformer;
    private final ITransformer<VideoPopup, HomeVideoPopup> videoTransformer;

    public DiscoveryPopupConfigTransformer(ITransformer<VideoPopup, HomeVideoPopup> iTransformer, PopUpWidgetTransformer popUpWidgetTransformer2, BottomBarPopupTransformer bottomBarPopupTransformer2) {
        p.j(iTransformer, "videoTransformer");
        p.j(popUpWidgetTransformer2, "popUpWidgetTransformer");
        p.j(bottomBarPopupTransformer2, "bottomBarPopupTransformer");
        this.videoTransformer = iTransformer;
        this.popUpWidgetTransformer = popUpWidgetTransformer2;
        this.bottomBarPopupTransformer = bottomBarPopupTransformer2;
    }

    public List<HomePopup> transform(SuccessResponse.PageConfigs pageConfigs) {
        p.j(pageConfigs, t.V);
        List<Card> configInfoList = pageConfigs.getConfigInfoList();
        ArrayList arrayList = new ArrayList();
        p.i(configInfoList, "list");
        for (Card card : configInfoList) {
            if (card.getCard().is(VideoPopup.class)) {
                ITransformer<VideoPopup, HomeVideoPopup> iTransformer = this.videoTransformer;
                Message unpack = card.getCard().unpack(VideoPopup.class);
                p.i(unpack, "it.card.unpack(VideoPopup::class.java)");
                HomeVideoPopup transform = iTransformer.transform(unpack);
                if (transform != null) {
                    arrayList.add(transform);
                }
            }
            if (card.getCard().is(PopUpWidget.class)) {
                PopUpWidgetTransformer popUpWidgetTransformer2 = this.popUpWidgetTransformer;
                Message unpack2 = card.getCard().unpack(PopUpWidget.class);
                p.i(unpack2, "it.card.unpack(PopUpWidget::class.java)");
                HomePopUpWidget transform2 = popUpWidgetTransformer2.transform((PopUpWidget) unpack2);
                if (transform2 != null) {
                    arrayList.add(transform2);
                }
            }
            if (card.getCard().is(CPPopupWidget.class)) {
                BottomBarPopupTransformer bottomBarPopupTransformer2 = this.bottomBarPopupTransformer;
                Message unpack3 = card.getCard().unpack(CPPopupWidget.class);
                p.i(unpack3, "it.card.unpack(CPPopupWidget::class.java)");
                BottomBarPopup transform3 = bottomBarPopupTransformer2.transform((CPPopupWidget) unpack3);
                if (transform3 != null) {
                    arrayList.add(transform3);
                }
            }
        }
        return arrayList;
    }
}
