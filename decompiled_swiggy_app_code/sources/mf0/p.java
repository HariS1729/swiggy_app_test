package mf0;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import ef0.e;
import in.swiggy.android.feature.logout.LogoutUseCase;
import in.swiggy.android.services.FetchUserProfileWorker;
import in.swiggy.android.tejas.feature.user.RefreshProfileUseCase;
import is.a;
import javax.inject.Provider;

/* compiled from: FetchUserProfileWorker_AssistedFactory */
public final class p implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<e> f19734a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<RefreshProfileUseCase> f19735b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<LogoutUseCase> f19736c;

    public p(Provider<e> provider, Provider<RefreshProfileUseCase> provider2, Provider<LogoutUseCase> provider3) {
        this.f19734a = provider;
        this.f19735b = provider2;
        this.f19736c = provider3;
    }

    public ListenableWorker a(Context context, WorkerParameters workerParameters) {
        return new FetchUserProfileWorker(context, workerParameters, this.f19734a.get(), this.f19735b.get(), this.f19736c.get());
    }
}
