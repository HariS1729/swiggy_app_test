package in.swiggy.android.tejas.feature.genericImage;

import qq.e;

public final class ImageDialogTransformer_Factory implements e<ImageDialogTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final ImageDialogTransformer_Factory INSTANCE = new ImageDialogTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static ImageDialogTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ImageDialogTransformer newInstance() {
        return new ImageDialogTransformer();
    }

    public ImageDialogTransformer get() {
        return newInstance();
    }
}
