package in.swiggy.android.tejas.feature.discovery.pageskeleton.usecase;

import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.coroutineUtils.FlowUseCase;
import in.swiggy.android.tejas.feature.discovery.pageskeleton.PageSkeletonRepository;
import in.swiggy.android.tejas.feature.discovery.pageskeleton.model.PageSkeletonParams;
import in.swiggy.android.tejas.feature.discovery.pageskeleton.model.PageSkeletonResponse;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.d;

/* compiled from: PageSkeletonUseCase.kt */
public final class PageSkeletonUseCase extends FlowUseCase<PageSkeletonParams, PageSkeletonResponse> {
    private final PageSkeletonRepository repository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageSkeletonUseCase(PageSkeletonRepository pageSkeletonRepository) {
        super((CoroutineDispatcher) null, 1, (i) null);
        p.j(pageSkeletonRepository, "repository");
        this.repository = pageSkeletonRepository;
    }

    /* access modifiers changed from: protected */
    public d<Response<PageSkeletonResponse>> execute(PageSkeletonParams pageSkeletonParams) {
        p.j(pageSkeletonParams, "parameters");
        return this.repository.getPageSkeletonData(pageSkeletonParams.getLatitude(), pageSkeletonParams.getLongitude());
    }
}
