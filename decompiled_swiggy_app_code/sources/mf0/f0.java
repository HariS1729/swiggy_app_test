package mf0;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.gson.Gson;
import in.swiggy.android.services.SendFeedBackWorker;
import in.swiggy.android.tejas.network.IApiGeneratedService;
import is.a;
import javax.inject.Provider;

/* compiled from: SendFeedBackWorker_AssistedFactory */
public final class f0 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Gson> f19701a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<IApiGeneratedService> f19702b;

    public f0(Provider<Gson> provider, Provider<IApiGeneratedService> provider2) {
        this.f19701a = provider;
        this.f19702b = provider2;
    }

    public ListenableWorker a(Context context, WorkerParameters workerParameters) {
        return new SendFeedBackWorker(context, workerParameters, this.f19701a.get(), this.f19702b.get());
    }
}
