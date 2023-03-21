package mf0;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import ef0.e;
import in.swiggy.android.services.FetchUserAddressesWorker;
import in.swiggy.android.tejas.feature.address.v2.usecase.GetAllAddressUseCase;
import is.a;
import javax.inject.Provider;

/* compiled from: FetchUserAddressesWorker_AssistedFactory */
public final class l implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<e> f19720a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<GetAllAddressUseCase> f19721b;

    public l(Provider<e> provider, Provider<GetAllAddressUseCase> provider2) {
        this.f19720a = provider;
        this.f19721b = provider2;
    }

    public ListenableWorker a(Context context, WorkerParameters workerParameters) {
        return new FetchUserAddressesWorker(context, workerParameters, this.f19720a.get(), this.f19721b.get());
    }
}
