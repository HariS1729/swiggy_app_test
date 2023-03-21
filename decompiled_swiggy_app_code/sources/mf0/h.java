package mf0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import in.swiggy.android.services.ClearCachePeriodicWorker;
import is.a;
import javax.inject.Provider;

/* compiled from: ClearCachePeriodicWorker_AssistedFactory */
public final class h implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<jr.a> f19708a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<SharedPreferences> f19709b;

    public h(Provider<jr.a> provider, Provider<SharedPreferences> provider2) {
        this.f19708a = provider;
        this.f19709b = provider2;
    }

    public ListenableWorker a(Context context, WorkerParameters workerParameters) {
        return new ClearCachePeriodicWorker(context, workerParameters, this.f19708a.get(), this.f19709b.get());
    }
}
