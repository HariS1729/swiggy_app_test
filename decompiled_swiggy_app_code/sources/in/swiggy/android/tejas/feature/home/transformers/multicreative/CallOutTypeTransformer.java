package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.widgets.v2.MultiTypeCreativeInfoWithStyle;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.multicreative.CallOutType;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;

/* compiled from: CallOutTypeTransformer.kt */
public final class CallOutTypeTransformer implements ITransformer<MultiTypeCreativeInfoWithStyle.CalloutType, CallOutType> {

    /* compiled from: CallOutTypeTransformer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MultiTypeCreativeInfoWithStyle.CalloutType.values().length];
            iArr[MultiTypeCreativeInfoWithStyle.CalloutType.UNRECOGNIZED.ordinal()] = 1;
            iArr[MultiTypeCreativeInfoWithStyle.CalloutType.CALLOUT_TYPE_INVALID.ordinal()] = 2;
            iArr[MultiTypeCreativeInfoWithStyle.CalloutType.CALLOUT_TYPE_DISH.ordinal()] = 3;
            iArr[MultiTypeCreativeInfoWithStyle.CalloutType.CALLOUT_TYPE_OUTLET.ordinal()] = 4;
            iArr[MultiTypeCreativeInfoWithStyle.CalloutType.CALLOUT_TYPE_RESTAURANT.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CallOutType transform(MultiTypeCreativeInfoWithStyle.CalloutType calloutType) {
        p.j(calloutType, t.V);
        int i11 = WhenMappings.$EnumSwitchMapping$0[calloutType.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return CallOutType.CALLOUT_TYPE_INVALID;
        }
        if (i11 == 3) {
            return CallOutType.CALLOUT_TYPE_DISH;
        }
        if (i11 == 4) {
            return CallOutType.CALLOUT_TYPE_OUTLET;
        }
        if (i11 == 5) {
            return CallOutType.CALLOUT_TYPE_RESTAURANT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
