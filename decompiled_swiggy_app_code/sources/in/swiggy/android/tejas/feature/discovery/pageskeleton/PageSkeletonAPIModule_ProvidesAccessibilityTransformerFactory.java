package in.swiggy.android.tejas.feature.discovery.pageskeleton;

import com.swiggy.gandalf.widgets.v2.ImageInfoLayoutCard;
import in.swiggy.android.tejas.feature.listing.accessibility.models.AccessibilityData;
import in.swiggy.android.tejas.feature.listing.accessibility.transformers.AccessibilityTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class PageSkeletonAPIModule_ProvidesAccessibilityTransformerFactory implements e<ITransformer<ImageInfoLayoutCard.Accessibility, AccessibilityData>> {
    private final Provider<AccessibilityTransformer> accessibilityTransformerProvider;

    public PageSkeletonAPIModule_ProvidesAccessibilityTransformerFactory(Provider<AccessibilityTransformer> provider) {
        this.accessibilityTransformerProvider = provider;
    }

    public static PageSkeletonAPIModule_ProvidesAccessibilityTransformerFactory create(Provider<AccessibilityTransformer> provider) {
        return new PageSkeletonAPIModule_ProvidesAccessibilityTransformerFactory(provider);
    }

    public static ITransformer<ImageInfoLayoutCard.Accessibility, AccessibilityData> providesAccessibilityTransformer(AccessibilityTransformer accessibilityTransformer) {
        return (ITransformer) i.e(PageSkeletonAPIModule.INSTANCE.providesAccessibilityTransformer(accessibilityTransformer));
    }

    public ITransformer<ImageInfoLayoutCard.Accessibility, AccessibilityData> get() {
        return providesAccessibilityTransformer(this.accessibilityTransformerProvider.get());
    }
}
