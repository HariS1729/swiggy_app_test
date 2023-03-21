package in.swiggy.android.tejas.feature.home.transformers.config.video;

import qq.e;

public final class VideoIdTransformer_Factory implements e<VideoIdTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final VideoIdTransformer_Factory INSTANCE = new VideoIdTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static VideoIdTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static VideoIdTransformer newInstance() {
        return new VideoIdTransformer();
    }

    public VideoIdTransformer get() {
        return newInstance();
    }
}
