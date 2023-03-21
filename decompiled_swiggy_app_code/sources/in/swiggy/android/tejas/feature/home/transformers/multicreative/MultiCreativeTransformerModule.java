package in.swiggy.android.tejas.feature.home.transformers.multicreative;

import com.swiggy.gandalf.widgets.v2.ImageInfoLayoutCard;
import com.swiggy.gandalf.widgets.v2.LeftToRightLinearGradient;
import com.swiggy.gandalf.widgets.v2.LotteInfoLayoutCard;
import com.swiggy.gandalf.widgets.v2.MultiTypeCreativeInfoWithStyle;
import com.swiggy.gandalf.widgets.v2.MultiTypeCreativeWidget;
import com.swiggy.gandalf.widgets.v2.VideoCardInfo;
import in.swiggy.android.tejas.feature.home.model.multicreative.CallOut;
import in.swiggy.android.tejas.feature.home.model.multicreative.CallOutType;
import in.swiggy.android.tejas.feature.home.model.multicreative.ImageCard;
import in.swiggy.android.tejas.feature.home.model.multicreative.LottieCard;
import in.swiggy.android.tejas.feature.home.model.multicreative.MultiCreativeEntity;
import in.swiggy.android.tejas.feature.home.model.multicreative.MulticreativeInfo;
import in.swiggy.android.tejas.feature.home.model.multicreative.VideoCard;
import in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: MultiCreativeTransformerModule.kt */
public final class MultiCreativeTransformerModule {
    public static final MultiCreativeTransformerModule INSTANCE = new MultiCreativeTransformerModule();

    private MultiCreativeTransformerModule() {
    }

    public static final ITransformer<MultiTypeCreativeInfoWithStyle.Callout, CallOut> provideCallOutTransformer(CallOutTransformer callOutTransformer) {
        p.j(callOutTransformer, "callOutTransformer");
        return callOutTransformer;
    }

    public static final ITransformer<MultiTypeCreativeInfoWithStyle.CalloutType, CallOutType> provideCallOutTypeTransformer(CallOutTypeTransformer callOutTypeTransformer) {
        p.j(callOutTypeTransformer, "callOutTypeTransformer");
        return callOutTypeTransformer;
    }

    public static final ITransformer<LeftToRightLinearGradient, in.swiggy.android.tejas.feature.home.model.multicreative.LeftToRightLinearGradient> provideGradientTransformer(LeftToRightLinearGradientTransformer leftToRightLinearGradientTransformer) {
        p.j(leftToRightLinearGradientTransformer, "gradientTransformer");
        return leftToRightLinearGradientTransformer;
    }

    public static final ITransformer<ImageInfoLayoutCard.ImageCardInfo, ImageCard> providesImageCardTransformer(ImageCardTransformer imageCardTransformer) {
        p.j(imageCardTransformer, "imageCardTransformer");
        return imageCardTransformer;
    }

    public static final ITransformer<ImageInfoLayoutCard.ItemStyle, ItemStyle> providesItemStyleTransformer(ItemStyleTransformer itemStyleTransformer) {
        p.j(itemStyleTransformer, "itemStyleTransformer");
        return itemStyleTransformer;
    }

    public static final ITransformer<LotteInfoLayoutCard.LotteCardInfo, LottieCard> providesLottieCardTransformer(LottieCardTransformer lottieCardTransformer) {
        p.j(lottieCardTransformer, "lottieCardTransformer");
        return lottieCardTransformer;
    }

    public static final ITransformer<MultiTypeCreativeWidget, MultiCreativeEntity> providesMultiCreativeEntityTransformer(MultiCreativeEntityTransformer multiCreativeEntityTransformer) {
        p.j(multiCreativeEntityTransformer, "multiCreativeEntityTransformer");
        return multiCreativeEntityTransformer;
    }

    public static final ITransformer<MultiTypeCreativeInfoWithStyle, MulticreativeInfo> providesMultiCreativeWidgetTransformer(MultiCreativeWidgetTransformer multiCreativeWidgetTransformer) {
        p.j(multiCreativeWidgetTransformer, "multiCreativeWidgetTransformer");
        return multiCreativeWidgetTransformer;
    }

    public static final ITransformer<VideoCardInfo, VideoCard> providesVideoCardTransformer(VideoCardTransformer videoCardTransformer) {
        p.j(videoCardTransformer, "videoCardTransformer");
        return videoCardTransformer;
    }
}
