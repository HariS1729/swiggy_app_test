package mf0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import ef0.f;
import in.swiggy.android.services.SyncSettingsWorker;
import in.swiggy.android.tejas.network.IApiGeneratedService;
import is.a;
import javax.inject.Provider;

/* compiled from: SyncSettingsWorker_AssistedFactory */
public final class n0 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<SharedPreferences> f19726a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<f> f19727b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<IApiGeneratedService> f19728c;

    public n0(Provider<SharedPreferences> provider, Provider<f> provider2, Provider<IApiGeneratedService> provider3) {
        this.f19726a = provider;
        this.f19727b = provider2;
        this.f19728c = provider3;
    }

    public ListenableWorker a(Context context, WorkerParameters workerParameters) {
        return new SyncSettingsWorker(context, workerParameters, this.f19726a.get(), this.f19727b.get(), this.f19728c.get());
    }
}
