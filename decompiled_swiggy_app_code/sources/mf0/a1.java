package mf0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import in.swiggy.android.services.WebContentDownloadService;
import in.swiggy.android.tejas.network.IApiGeneratedService;
import is.a;
import javax.inject.Provider;

/* compiled from: WebContentDownloadService_AssistedFactory */
public final class a1 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<SharedPreferences> f19680a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<IApiGeneratedService> f19681b;

    public a1(Provider<SharedPreferences> provider, Provider<IApiGeneratedService> provider2) {
        this.f19680a = provider;
        this.f19681b = provider2;
    }

    public ListenableWorker a(Context context, WorkerParameters workerParameters) {
        return new WebContentDownloadService(context, workerParameters, this.f19680a.get(), this.f19681b.get());
    }
}
