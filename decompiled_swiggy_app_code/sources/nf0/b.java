package nf0;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import in.swiggy.android.services.network.NetworkPreHeatWorker;
import is.a;
import javax.inject.Provider;

/* compiled from: NetworkPreHeatWorker_AssistedFactory */
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<jr.a> f19780a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<pf0.a> f19781b;

    public b(Provider<jr.a> provider, Provider<pf0.a> provider2) {
        this.f19780a = provider;
        this.f19781b = provider2;
    }

    public ListenableWorker a(Context context, WorkerParameters workerParameters) {
        return new NetworkPreHeatWorker(context, workerParameters, this.f19780a.get(), this.f19781b.get());
    }
}
