package in.swiggy.android.tejas.feature.home.transformers.config.video;

import com.swiggy.gandalf.widgets.v2.VideoPopup;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.pageconfig.PopupPosition;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;

/* compiled from: PopupPositionTransformer.kt */
public final class PopupPositionTransformer implements ITransformer<VideoPopup.Position, PopupPosition> {

    /* compiled from: PopupPositionTransformer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoPopup.Position.values().length];
            iArr[VideoPopup.Position.UNRECOGNIZED.ordinal()] = 1;
            iArr[VideoPopup.Position.POSITION_INVALID.ordinal()] = 2;
            iArr[VideoPopup.Position.POSITION_BOTTOM_LEFT.ordinal()] = 3;
            iArr[VideoPopup.Position.POSITION_TOP_LEFT.ordinal()] = 4;
            iArr[VideoPopup.Position.POSITION_TOP_RIGHT.ordinal()] = 5;
            iArr[VideoPopup.Position.POSITION_BOTTOM_RIGHT.ordinal()] = 6;
            iArr[VideoPopup.Position.POSITION_FULL_SCREEN.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PopupPosition transform(VideoPopup.Position position) {
        p.j(position, t.V);
        switch (WhenMappings.$EnumSwitchMapping$0[position.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return PopupPosition.BOTTOM_LEFT;
            case 4:
                return PopupPosition.TOP_LEFT;
            case 5:
                return PopupPosition.TOP_RIGHT;
            case 6:
                return PopupPosition.BOTTOM_RIGHT;
            case 7:
                return PopupPosition.FULL_SCREEN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
