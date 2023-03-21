package in.swiggy.android.tejas.feature.home.grid.transformers.fliptext;

import com.swiggy.gandalf.widgets.v2.ItemStyle;
import com.swiggy.gandalf.widgets.v2.LotteCardInfo;
import com.swiggy.gandalf.widgets.v2.MxNFlipTextCardInfo;
import in.swiggy.android.tejas.feature.home.grid.model.fliptext.DynamicFlipTextEntity;
import in.swiggy.android.tejas.feature.home.grid.model.fliptext.DynamicFlipTextSection;
import in.swiggy.android.tejas.feature.home.grid.model.remotelottie.RemoteLottieItem;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: DynamicFlipTextTransformerModule.kt */
public final class DynamicFlipTextTransformerModule {
    public static final DynamicFlipTextTransformerModule INSTANCE = new DynamicFlipTextTransformerModule();

    private DynamicFlipTextTransformerModule() {
    }

    public static final ITransformer<MxNFlipTextCardInfo.FlipTextCardInfo, DynamicFlipTextEntity> providesDynamicFlipTextItemTransformer(DynamicFlipTextItemTransformer dynamicFlipTextItemTransformer) {
        p.j(dynamicFlipTextItemTransformer, "dynamicFlipTextItemTransformer");
        return dynamicFlipTextItemTransformer;
    }

    public static final ITransformer<LotteCardInfo, RemoteLottieItem> providesDynamicFlipTextLottieTransformer(DynamicFlipTextLottieTransformer dynamicFlipTextLottieTransformer) {
        p.j(dynamicFlipTextLottieTransformer, "dynamicFlipTextLottieTransformer");
        return dynamicFlipTextLottieTransformer;
    }

    public static final ITransformer<MxNFlipTextCardInfo, DynamicFlipTextSection> providesDynamicFlipTextSectionTransformer(DynamicFlipTextSectionTransformer dynamicFlipTextSectionTransformer) {
        p.j(dynamicFlipTextSectionTransformer, "dynamicFlipTextSectionTransformer");
        return dynamicFlipTextSectionTransformer;
    }

    public static final ITransformer<ItemStyle, in.swiggy.android.tejas.feature.listing.grid.model.ItemStyle> providesDynamicFliptextItemStyleTransformer(DynamicFliptextItemStyleTransformer dynamicFliptextItemStyleTransformer) {
        p.j(dynamicFliptextItemStyleTransformer, "dynamicFliptextItemStyleTransformer");
        return dynamicFliptextItemStyleTransformer;
    }
}
