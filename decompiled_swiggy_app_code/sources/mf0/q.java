package mf0;

import in.swiggy.android.feature.logout.LogoutUseCase;
import in.swiggy.android.tejas.feature.user.RefreshProfileUseCase;
import javax.inject.Provider;
import qq.e;

/* compiled from: FetchUserProfileWorker_AssistedFactory_Factory */
public final class q implements e<p> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<ef0.e> f19737a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<RefreshProfileUseCase> f19738b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<LogoutUseCase> f19739c;

    public q(Provider<ef0.e> provider, Provider<RefreshProfileUseCase> provider2, Provider<LogoutUseCase> provider3) {
        this.f19737a = provider;
        this.f19738b = provider2;
        this.f19739c = provider3;
    }

    public static q a(Provider<ef0.e> provider, Provider<RefreshProfileUseCase> provider2, Provider<LogoutUseCase> provider3) {
        return new q(provider, provider2, provider3);
    }

    public static p c(Provider<ef0.e> provider, Provider<RefreshProfileUseCase> provider2, Provider<LogoutUseCase> provider3) {
        return new p(provider, provider2, provider3);
    }

    /* renamed from: b */
    public p get() {
        return c(this.f19737a, this.f19738b, this.f19739c);
    }
}
