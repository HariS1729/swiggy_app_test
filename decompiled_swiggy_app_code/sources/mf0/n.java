package mf0;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import ef0.e;
import in.swiggy.android.services.FetchUserDefaultingAddressesWorker;
import in.swiggy.android.tejas.feature.address.v2.usecase.GetAllDefaultingAddressUseCase;
import is.a;
import javax.inject.Provider;

/* compiled from: FetchUserDefaultingAddressesWorker_AssistedFactory */
public final class n implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<e> f19724a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<GetAllDefaultingAddressUseCase> f19725b;

    public n(Provider<e> provider, Provider<GetAllDefaultingAddressUseCase> provider2) {
        this.f19724a = provider;
        this.f19725b = provider2;
    }

    public ListenableWorker a(Context context, WorkerParameters workerParameters) {
        return new FetchUserDefaultingAddressesWorker(context, workerParameters, this.f19724a.get(), this.f19725b.get());
    }
}
