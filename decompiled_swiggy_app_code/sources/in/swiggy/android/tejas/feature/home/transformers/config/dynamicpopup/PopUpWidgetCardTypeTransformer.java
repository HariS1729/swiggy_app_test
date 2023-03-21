package in.swiggy.android.tejas.feature.home.transformers.config.dynamicpopup;

import com.swiggy.gandalf.widgets.v2.PopUpWidget;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.pageconfig.CardType;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: PopUpWidgetCardTypeTransformer.kt */
public final class PopUpWidgetCardTypeTransformer implements ITransformer<PopUpWidget.CardType, CardType> {

    /* compiled from: PopUpWidgetCardTypeTransformer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PopUpWidget.CardType.values().length];
            iArr[PopUpWidget.CardType.CARD_TYPE_HALF_CARD.ordinal()] = 1;
            iArr[PopUpWidget.CardType.CARD_TYPE_POPUP.ordinal()] = 2;
            iArr[PopUpWidget.CardType.CARD_TYPE_FULL_SCREEN.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CardType transform(PopUpWidget.CardType cardType) {
        p.j(cardType, t.V);
        int i11 = WhenMappings.$EnumSwitchMapping$0[cardType.ordinal()];
        if (i11 == 1) {
            return CardType.HALF_CARD;
        }
        if (i11 == 2) {
            return CardType.POPUP;
        }
        if (i11 != 3) {
            return CardType.POPUP;
        }
        return CardType.FULL_SCREEN;
    }
}
