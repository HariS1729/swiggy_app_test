package in.swiggy.android.tejas.feature.home.transformers.config;

import com.google.protobuf.Message;
import com.swiggy.gandalf.home.protobuf.SuccessReponseDto;
import com.swiggy.gandalf.widgets.v2.Card;
import com.swiggy.gandalf.widgets.v2.PopUpWidget;
import com.swiggy.gandalf.widgets.v2.VideoPopup;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomePopUpWidget;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomePopup;
import in.swiggy.android.tejas.feature.home.model.pageconfig.HomeVideoPopup;
import in.swiggy.android.tejas.feature.home.transformers.config.dynamicpopup.PopUpWidgetTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: PopupConfigTransformer.kt */
public final class PopupConfigTransformer implements ITransformer<SuccessReponseDto.PageConfigs, List<? extends HomePopup>> {
    private final PopUpWidgetTransformer popUpWidgetTransformer;
    private final ITransformer<VideoPopup, HomeVideoPopup> videoTransformer;

    public PopupConfigTransformer(ITransformer<VideoPopup, HomeVideoPopup> iTransformer, PopUpWidgetTransformer popUpWidgetTransformer2) {
        p.j(iTransformer, "videoTransformer");
        p.j(popUpWidgetTransformer2, "popUpWidgetTransformer");
        this.videoTransformer = iTransformer;
        this.popUpWidgetTransformer = popUpWidgetTransformer2;
    }

    public List<HomePopup> transform(SuccessReponseDto.PageConfigs pageConfigs) {
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
        }
        return arrayList;
    }
}
