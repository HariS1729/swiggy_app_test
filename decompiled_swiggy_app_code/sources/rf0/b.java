package rf0;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import in.swiggy.android.services.precache.AssetPreCacheWorker;
import is.a;
import javax.inject.Provider;

/* compiled from: AssetPreCacheWorker_AssistedFactory */
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<jr.a> f19864a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<tf0.b> f19865b;

    public b(Provider<jr.a> provider, Provider<tf0.b> provider2) {
        this.f19864a = provider;
        this.f19865b = provider2;
    }

    public ListenableWorker a(Context context, WorkerParameters workerParameters) {
        return new AssetPreCacheWorker(context, workerParameters, this.f19864a.get(), this.f19865b.get());
    }
}
