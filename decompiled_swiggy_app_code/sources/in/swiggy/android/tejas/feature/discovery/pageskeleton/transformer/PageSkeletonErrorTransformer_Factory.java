package in.swiggy.android.tejas.feature.discovery.pageskeleton.transformer;

import qq.e;

public final class PageSkeletonErrorTransformer_Factory implements e<PageSkeletonErrorTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final PageSkeletonErrorTransformer_Factory INSTANCE = new PageSkeletonErrorTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static PageSkeletonErrorTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static PageSkeletonErrorTransformer newInstance() {
        return new PageSkeletonErrorTransformer();
    }

    public PageSkeletonErrorTransformer get() {
        return newInstance();
    }
}
