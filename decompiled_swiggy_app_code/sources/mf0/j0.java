package mf0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import in.swiggy.android.services.SuperContentDownloadService;
import in.swiggy.android.tejas.network.IApiGeneratedService;
import is.a;
import javax.inject.Provider;

/* compiled from: SuperContentDownloadService_AssistedFactory */
public final class j0 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<SharedPreferences> f19714a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<IApiGeneratedService> f19715b;

    public j0(Provider<SharedPreferences> provider, Provider<IApiGeneratedService> provider2) {
        this.f19714a = provider;
        this.f19715b = provider2;
    }

    public ListenableWorker a(Context context, WorkerParameters workerParameters) {
        return new SuperContentDownloadService(context, workerParameters, this.f19714a.get(), this.f19715b.get());
    }
}
