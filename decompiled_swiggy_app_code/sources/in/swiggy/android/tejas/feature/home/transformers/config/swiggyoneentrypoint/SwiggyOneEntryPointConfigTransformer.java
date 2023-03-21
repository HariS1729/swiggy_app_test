package in.swiggy.android.tejas.feature.home.transformers.config.swiggyoneentrypoint;

import com.swiggy.gandalf.widgets.v2.Card;
import com.swiggy.gandalf.widgets.v2.Cta;
import com.swiggy.gandalf.widgets.v2.OneTapSwiggyOneEntryPoint;
import com.swiggy.gandalf.widgets.v2.SuccessResponse;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.pageconfig.SwiggyOneEntryPoint;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: SwiggyOneEntryPointConfigTransformer.kt */
public final class SwiggyOneEntryPointConfigTransformer implements ITransformer<SuccessResponse.PageConfigs, List<? extends SwiggyOneEntryPoint>> {
    public List<SwiggyOneEntryPoint> transform(SuccessResponse.PageConfigs pageConfigs) {
        OneTapSwiggyOneEntryPoint oneTapSwiggyOneEntryPoint;
        p.j(pageConfigs, t.V);
        ArrayList arrayList = new ArrayList();
        List<Card> configInfoList = pageConfigs.getConfigInfoList();
        p.i(configInfoList, "configInfoList");
        for (Card card : configInfoList) {
            if (card.getCard().is(OneTapSwiggyOneEntryPoint.class) && (oneTapSwiggyOneEntryPoint = (OneTapSwiggyOneEntryPoint) card.getCard().unpack(OneTapSwiggyOneEntryPoint.class)) != null) {
                String iconImage = oneTapSwiggyOneEntryPoint.getIconImage();
                String bgImage = oneTapSwiggyOneEntryPoint.getBgImage();
                String text = oneTapSwiggyOneEntryPoint.getText();
                String textColor = oneTapSwiggyOneEntryPoint.getTextColor();
                Cta cta = oneTapSwiggyOneEntryPoint.getCta();
                p.i(cta, "cta");
                arrayList.add(new SwiggyOneEntryPoint(iconImage, bgImage, text, textColor, cta));
            }
        }
        return arrayList;
    }
}
