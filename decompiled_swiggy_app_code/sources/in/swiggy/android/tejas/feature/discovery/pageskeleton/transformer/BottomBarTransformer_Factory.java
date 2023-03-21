package in.swiggy.android.tejas.feature.discovery.pageskeleton.transformer;

import com.swiggy.gandalf.widgets.v2.ImageInfoLayoutCard;
import in.swiggy.android.tejas.feature.listing.accessibility.models.AccessibilityData;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;

public final class BottomBarTransformer_Factory implements e<BottomBarTransformer> {
    private final Provider<ITransformer<ImageInfoLayoutCard.Accessibility, AccessibilityData>> accessibilityTransformerProvider;

    public BottomBarTransformer_Factory(Provider<ITransformer<ImageInfoLayoutCard.Accessibility, AccessibilityData>> provider) {
        this.accessibilityTransformerProvider = provider;
    }

    public static BottomBarTransformer_Factory create(Provider<ITransformer<ImageInfoLayoutCard.Accessibility, AccessibilityData>> provider) {
        return new BottomBarTransformer_Factory(provider);
    }

    public static BottomBarTransformer newInstance(ITransformer<ImageInfoLayoutCard.Accessibility, AccessibilityData> iTransformer) {
        return new BottomBarTransformer(iTransformer);
    }

    public BottomBarTransformer get() {
        return newInstance(this.accessibilityTransformerProvider.get());
    }
}
