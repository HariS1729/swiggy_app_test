package in.swiggy.android.tejas.feature.home.transformers;

import com.swiggy.gandalf.home.protobuf.RibbonDto;
import i20.t;
import in.swiggy.android.tejas.oldapi.models.restaurant.RibbonData;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: RibbonDataTransformer.kt */
public final class RibbonDataTransformer implements ITransformer<RibbonDto, RibbonData> {
    public RibbonData transform(RibbonDto ribbonDto) {
        p.j(ribbonDto, t.V);
        RibbonData ribbonData = new RibbonData();
        ribbonData.mText = ribbonDto.getText();
        ribbonData.mTextColorHex = ribbonDto.getTextColor();
        ribbonData.mImageId = ribbonDto.getImageId();
        ribbonData.mBackgroundColor = ribbonDto.getTopBackgroundColor();
        ribbonData.mTailBackgroundColor = ribbonDto.getBottomBackgroundColor();
        return ribbonData;
    }
}
