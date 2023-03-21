package in.swiggy.android.tejas.feature.home.transformers.config.dynamicpopup;

import com.swiggy.gandalf.widgets.v2.PopUpWidget;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.pageconfig.PopUpWidgetCrossButtonPosition;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: PopUpWidgetPositionTransformer.kt */
public final class PopUpWidgetPositionTransformer implements ITransformer<PopUpWidget.CrossButtonPosition, PopUpWidgetCrossButtonPosition> {

    /* compiled from: PopUpWidgetPositionTransformer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PopUpWidget.CrossButtonPosition.values().length];
            iArr[PopUpWidget.CrossButtonPosition.CROSS_BUTTON_POSITION_TOP_LEFT.ordinal()] = 1;
            iArr[PopUpWidget.CrossButtonPosition.CROSS_BUTTON_POSITION_TOP_RIGHT.ordinal()] = 2;
            iArr[PopUpWidget.CrossButtonPosition.CROSS_BUTTON_POSITION_NONE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PopUpWidgetCrossButtonPosition transform(PopUpWidget.CrossButtonPosition crossButtonPosition) {
        p.j(crossButtonPosition, t.V);
        int i11 = WhenMappings.$EnumSwitchMapping$0[crossButtonPosition.ordinal()];
        if (i11 == 1) {
            return PopUpWidgetCrossButtonPosition.TOP_LEFT;
        }
        if (i11 == 2) {
            return PopUpWidgetCrossButtonPosition.TOP_RIGHT;
        }
        if (i11 != 3) {
            return PopUpWidgetCrossButtonPosition.INVALID;
        }
        return PopUpWidgetCrossButtonPosition.NONE;
    }
}
