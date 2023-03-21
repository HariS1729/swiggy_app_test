package p10;

import in.swiggy.android.fragments.AccountFragment;
import in.swiggy.android.tejas.generated.ISwiggyNetworkWrapper;
import in.swiggy.android.tejas.network.IApiGeneratedService;
import javax.inject.Provider;
import qq.e;
import qq.i;

/* compiled from: AccountFragmentModule_ProvideNetworkWrapperFactory */
public final class f implements e<ISwiggyNetworkWrapper> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<AccountFragment> f16206a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<IApiGeneratedService> f16207b;

    public f(Provider<AccountFragment> provider, Provider<IApiGeneratedService> provider2) {
        this.f16206a = provider;
        this.f16207b = provider2;
    }

    public static f a(Provider<AccountFragment> provider, Provider<IApiGeneratedService> provider2) {
        return new f(provider, provider2);
    }

    public static ISwiggyNetworkWrapper c(AccountFragment accountFragment, IApiGeneratedService iApiGeneratedService) {
        return (ISwiggyNetworkWrapper) i.e(d.f16203a.b(accountFragment, iApiGeneratedService));
    }

    /* renamed from: b */
    public ISwiggyNetworkWrapper get() {
        return c(this.f16206a.get(), this.f16207b.get());
    }
}
