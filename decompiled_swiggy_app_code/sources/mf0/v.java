package mf0;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import ef0.e;
import in.swiggy.android.services.KabootarDismissNotification;
import in.swiggy.android.tejas.network.IApiGeneratedService;
import is.a;
import javax.inject.Provider;

/* compiled from: KabootarDismissNotification_AssistedFactory */
public final class v implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<e> f19743a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<IApiGeneratedService> f19744b;

    public v(Provider<e> provider, Provider<IApiGeneratedService> provider2) {
        this.f19743a = provider;
        this.f19744b = provider2;
    }

    public ListenableWorker a(Context context, WorkerParameters workerParameters) {
        return new KabootarDismissNotification(context, workerParameters, this.f19743a.get(), this.f19744b.get());
    }
}
