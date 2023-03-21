package in.swiggy.android.tejas.feature.home.transformers;

import qq.e;

public final class CardFYISmallTransformer_Factory implements e<CardFYISmallTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final CardFYISmallTransformer_Factory INSTANCE = new CardFYISmallTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static CardFYISmallTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CardFYISmallTransformer newInstance() {
        return new CardFYISmallTransformer();
    }

    public CardFYISmallTransformer get() {
        return newInstance();
    }
}
