package in.swiggy.android.tejas.feature.discovery.pageskeleton;

import com.swiggy.gandalf.widgets.v2.BottomBar;
import com.swiggy.gandalf.widgets.v2.ImageInfoLayoutCard;
import in.swiggy.android.tejas.feature.discovery.pageskeleton.model.BottomBarEntity;
import in.swiggy.android.tejas.feature.discovery.pageskeleton.transformer.BottomBarTransformer;
import in.swiggy.android.tejas.feature.listing.accessibility.models.AccessibilityData;
import in.swiggy.android.tejas.feature.listing.accessibility.transformers.AccessibilityTransformer;
import in.swiggy.android.tejas.qualifiers.retrofit.RetrofitProtobufApi;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.List;
import kotlin.jvm.internal.p;
import retrofit2.Retrofit;

/* compiled from: PageSkeletonAPIModule.kt */
public final class PageSkeletonAPIModule {
    public static final PageSkeletonAPIModule INSTANCE = new PageSkeletonAPIModule();

    private PageSkeletonAPIModule() {
    }

    public final IPageSkeletonAPI providePageSkeletonAPI(@RetrofitProtobufApi Retrofit retrofit) {
        p.j(retrofit, "retrofit");
        Object create = retrofit.create(IPageSkeletonAPI.class);
        p.i(create, "retrofit.create(IPageSkeletonAPI::class.java)");
        return (IPageSkeletonAPI) create;
    }

    public final ITransformer<ImageInfoLayoutCard.Accessibility, AccessibilityData> providesAccessibilityTransformer(AccessibilityTransformer accessibilityTransformer) {
        p.j(accessibilityTransformer, "accessibilityTransformer");
        return accessibilityTransformer;
    }

    public final ITransformer<BottomBar, List<BottomBarEntity>> providesBottomBarTransformer(BottomBarTransformer bottomBarTransformer) {
        p.j(bottomBarTransformer, "bottomBarTransformer");
        return bottomBarTransformer;
    }

    public final IPageSkeletonResultAPI providesPageSkeletonResultAPI(PageSkeletonResultAPI pageSkeletonResultAPI) {
        p.j(pageSkeletonResultAPI, "pageSkeletonResultAPI");
        return pageSkeletonResultAPI;
    }
}
