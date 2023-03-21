package in.swiggy.android.tejas.feature.home.transformers;

import com.swiggy.gandalf.home.protobuf.BannerCarouselDto;
import i20.t;
import in.swiggy.android.tejas.feature.home.model.AutoscrollConfig;
import in.swiggy.android.tejas.transformer.ITransformer;
import kotlin.jvm.internal.p;

/* compiled from: AutoScrollTransformer.kt */
public final class AutoScrollTransformer implements ITransformer<BannerCarouselDto, AutoscrollConfig> {
    public AutoscrollConfig transform(BannerCarouselDto bannerCarouselDto) {
        p.j(bannerCarouselDto, t.V);
        if (bannerCarouselDto.getAutoScrollDuration() <= 0 || bannerCarouselDto.getAutoScrollResetDuration() <= 0) {
            return null;
        }
        return new AutoscrollConfig(bannerCarouselDto.getIsScrollEnabled(), bannerCarouselDto.getAutoScrollDuration(), bannerCarouselDto.getAutoScrollResetDuration());
    }
}
