package in.swiggy.android.tejas.feature.google.signers;

import qq.e;

public final class GoogleAPIUrlSigner_Factory implements e<GoogleAPIUrlSigner> {

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final GoogleAPIUrlSigner_Factory INSTANCE = new GoogleAPIUrlSigner_Factory();

        private InstanceHolder() {
        }
    }

    public static GoogleAPIUrlSigner_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static GoogleAPIUrlSigner newInstance() {
        return new GoogleAPIUrlSigner();
    }

    public GoogleAPIUrlSigner get() {
        return newInstance();
    }
}
