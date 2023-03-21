package mf0;

import in.swiggy.android.web.utility.WebAssetsBackupUtility;
import javax.inject.Provider;
import qq.e;

/* compiled from: WebAssetBackupWorker_AssistedFactory_Factory */
public final class x0 implements e<w0> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<WebAssetsBackupUtility> f19749a;

    public x0(Provider<WebAssetsBackupUtility> provider) {
        this.f19749a = provider;
    }

    public static x0 a(Provider<WebAssetsBackupUtility> provider) {
        return new x0(provider);
    }

    public static w0 c(Provider<WebAssetsBackupUtility> provider) {
        return new w0(provider);
    }

    /* renamed from: b */
    public w0 get() {
        return c(this.f19749a);
    }
}
