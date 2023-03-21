package in.swiggy.android.tejas.feature.discovery.pageskeleton.transformer;

import qq.e;

public final class PageSkeletonExceptionTransformer_Factory<M> implements e<PageSkeletonExceptionTransformer<M>> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final PageSkeletonExceptionTransformer_Factory INSTANCE = new PageSkeletonExceptionTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static <M> PageSkeletonExceptionTransformer_Factory<M> create() {
        return InstanceHolder.INSTANCE;
    }

    public static <M> PageSkeletonExceptionTransformer<M> newInstance() {
        return new PageSkeletonExceptionTransformer<>();
    }

    public PageSkeletonExceptionTransformer<M> get() {
        return newInstance();
    }
}
