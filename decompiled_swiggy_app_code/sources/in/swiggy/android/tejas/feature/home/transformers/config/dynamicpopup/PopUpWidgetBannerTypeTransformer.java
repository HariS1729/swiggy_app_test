package in.swiggy.android.tejas.feature.home.transformers.config.dynamicpopup;

import com.swiggy.gandalf.widgets.v2.PopUpWidget;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.pageconfig.BannerType;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;

/* compiled from: PopUpWidgetBannerTypeTransformer.kt */
public final class PopUpWidgetBannerTypeTransformer implements ITransformer<PopUpWidget.BannerType, BannerType> {

    /* compiled from: PopUpWidgetBannerTypeTransformer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PopUpWidget.BannerType.values().length];
            iArr[PopUpWidget.BannerType.BANNER_TYPE_INVALID.ordinal()] = 1;
            iArr[PopUpWidget.BannerType.BANNER_TYPE_WEBVIEW.ordinal()] = 2;
            iArr[PopUpWidget.BannerType.BANNER_TYPE_IMAGE.ordinal()] = 3;
            iArr[PopUpWidget.BannerType.BANNER_TYPE_VIDEO.ordinal()] = 4;
            iArr[PopUpWidget.BannerType.BANNER_TYPE_LOTTIE.ordinal()] = 5;
            iArr[PopUpWidget.BannerType.UNRECOGNIZED.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BannerType transform(PopUpWidget.BannerType bannerType) {
        p.j(bannerType, t.V);
        switch (WhenMappings.$EnumSwitchMapping$0[bannerType.ordinal()]) {
            case 1:
                return BannerType.INVALID;
            case 2:
                return BannerType.WEBVIEW;
            case 3:
                return BannerType.IMAGE;
            case 4:
                return BannerType.VIDEO;
            case 5:
                return BannerType.LOTTIE;
            case 6:
                return BannerType.INVALID;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
