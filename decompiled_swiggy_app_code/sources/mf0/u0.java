package mf0;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import in.swiggy.android.services.UserLogoutWorker;
import in.swiggy.android.tejas.network.IApiGeneratedService;
import is.a;
import javax.inject.Provider;

/* compiled from: UserLogoutWorker_AssistedFactory */
public final class u0 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<IApiGeneratedService> f19742a;

    public u0(Provider<IApiGeneratedService> provider) {
        this.f19742a = provider;
    }

    public ListenableWorker a(Context context, WorkerParameters workerParameters) {
        return new UserLogoutWorker(context, workerParameters, this.f19742a.get());
    }
}
