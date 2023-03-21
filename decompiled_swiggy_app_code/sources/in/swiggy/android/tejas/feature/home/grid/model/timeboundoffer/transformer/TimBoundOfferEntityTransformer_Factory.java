package in.swiggy.android.tejas.feature.home.grid.model.timeboundoffer.transformer;

import qq.e;

public final class TimBoundOfferEntityTransformer_Factory implements e<TimBoundOfferEntityTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final TimBoundOfferEntityTransformer_Factory INSTANCE = new TimBoundOfferEntityTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static TimBoundOfferEntityTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static TimBoundOfferEntityTransformer newInstance() {
        return new TimBoundOfferEntityTransformer();
    }

    public TimBoundOfferEntityTransformer get() {
        return newInstance();
    }
}
