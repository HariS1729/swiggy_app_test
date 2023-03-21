package in.swiggy.android.tejas.feature.home.transformers;

import qq.e;

public final class CardDashTransformer_Factory implements e<CardDashTransformer> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final CardDashTransformer_Factory INSTANCE = new CardDashTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static CardDashTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CardDashTransformer newInstance() {
        return new CardDashTransformer();
    }

    public CardDashTransformer get() {
        return newInstance();
    }
}
