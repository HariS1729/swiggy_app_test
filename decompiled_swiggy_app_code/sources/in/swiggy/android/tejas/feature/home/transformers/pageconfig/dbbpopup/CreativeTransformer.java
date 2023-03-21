package in.swiggy.android.tejas.feature.home.transformers.pageconfig.dbbpopup;

import com.swiggy.gandalf.widgets.v2.CreativeType;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.pageconfig.dbbpopup.BottomBarPopupCardType;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: CreativeTransformer.kt */
public final class CreativeTransformer implements ITransformer<CreativeType, BottomBarPopupCardType> {

    /* compiled from: CreativeTransformer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CreativeType.values().length];
            iArr[CreativeType.CREATIVE_TYPE_IMAGE.ordinal()] = 1;
            iArr[CreativeType.CREATIVE_TYPE_LOTTE.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BottomBarPopupCardType transform(CreativeType creativeType) {
        p.j(creativeType, t.V);
        int i11 = WhenMappings.$EnumSwitchMapping$0[creativeType.ordinal()];
        if (i11 == 1) {
            return BottomBarPopupCardType.IMAGE;
        }
        if (i11 != 2) {
            return BottomBarPopupCardType.INVALID;
        }
        return BottomBarPopupCardType.LOTTIE;
    }
}
