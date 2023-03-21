package mf0;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import in.swiggy.android.services.WebAssetBackupWorker;
import in.swiggy.android.web.utility.WebAssetsBackupUtility;
import is.a;
import javax.inject.Provider;

/* compiled from: WebAssetBackupWorker_AssistedFactory */
public final class w0 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<WebAssetsBackupUtility> f19748a;

    public w0(Provider<WebAssetsBackupUtility> provider) {
        this.f19748a = provider;
    }

    public ListenableWorker a(Context context, WorkerParameters workerParameters) {
        return new WebAssetBackupWorker(context, workerParameters, this.f19748a.get());
    }
}
