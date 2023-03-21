package in.swiggy.android.tejas.feature.discovery.pageskeleton;

import com.swiggy.gandalf.widgets.v2.BottomBar;
import in.swiggy.android.tejas.feature.discovery.pageskeleton.model.BottomBarEntity;
import in.swiggy.android.tejas.feature.discovery.pageskeleton.transformer.BottomBarTransformer;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import javax.inject.Provider;
import qq.e;
import qq.i;

public final class PageSkeletonAPIModule_ProvidesBottomBarTransformerFactory implements e<ITransformer<BottomBar, List<BottomBarEntity>>> {
    private final Provider<BottomBarTransformer> bottomBarTransformerProvider;

    public PageSkeletonAPIModule_ProvidesBottomBarTransformerFactory(Provider<BottomBarTransformer> provider) {
        this.bottomBarTransformerProvider = provider;
    }

    public static PageSkeletonAPIModule_ProvidesBottomBarTransformerFactory create(Provider<BottomBarTransformer> provider) {
        return new PageSkeletonAPIModule_ProvidesBottomBarTransformerFactory(provider);
    }

    public static ITransformer<BottomBar, List<BottomBarEntity>> providesBottomBarTransformer(BottomBarTransformer bottomBarTransformer) {
        return (ITransformer) i.e(PageSkeletonAPIModule.INSTANCE.providesBottomBarTransformer(bottomBarTransformer));
    }

    public ITransformer<BottomBar, List<BottomBarEntity>> get() {
        return providesBottomBarTransformer(this.bottomBarTransformerProvider.get());
    }
}
