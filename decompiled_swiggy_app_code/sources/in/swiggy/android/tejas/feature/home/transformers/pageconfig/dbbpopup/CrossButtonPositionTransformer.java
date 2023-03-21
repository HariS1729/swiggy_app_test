package in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup;

import com.swiggy.gandalf.widgets.v2.PopUpWidget;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.pageconfig.PopUpWidgetCrossButtonPosition;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;

/* compiled from: CrossButtonPositionTransformer.kt */
public final class CrossButtonPositionTransformer implements ITransformer<PopUpWidget.CrossButtonPosition, PopUpWidgetCrossButtonPosition> {

    /* compiled from: CrossButtonPositionTransformer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PopUpWidget.CrossButtonPosition.values().length];
            iArr[PopUpWidget.CrossButtonPosition.CROSS_BUTTON_POSITION_NONE.ordinal()] = 1;
            iArr[PopUpWidget.CrossButtonPosition.CROSS_BUTTON_POSITION_TOP_LEFT.ordinal()] = 2;
            iArr[PopUpWidget.CrossButtonPosition.CROSS_BUTTON_POSITION_TOP_RIGHT.ordinal()] = 3;
            iArr[PopUpWidget.CrossButtonPosition.UNRECOGNIZED.ordinal()] = 4;
            iArr[PopUpWidget.CrossButtonPosition.CROSS_BUTTON_POSITION_INVALID.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PopUpWidgetCrossButtonPosition transform(PopUpWidget.CrossButtonPosition crossButtonPosition) {
        p.j(crossButtonPosition, t.V);
        int i11 = WhenMappings.$EnumSwitchMapping$0[crossButtonPosition.ordinal()];
        if (i11 == 1) {
            return PopUpWidgetCrossButtonPosition.NONE;
        }
        if (i11 == 2) {
            return PopUpWidgetCrossButtonPosition.TOP_LEFT;
        }
        if (i11 == 3) {
            return PopUpWidgetCrossButtonPosition.TOP_RIGHT;
        }
        if (i11 == 4 || i11 == 5) {
            return PopUpWidgetCrossButtonPosition.INVALID;
        }
        throw new NoWhenBranchMatchedException();
    }
}
