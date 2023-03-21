package p10;

import ba0.c;
import in.swiggy.android.fragments.AccountFragment;
import javax.inject.Provider;
import pl0.d2;
import qq.i;

/* compiled from: AccountFragmentModule_ProvideAccountFragmentServiceFactory */
public final class e implements qq.e<c> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<AccountFragment> f16204a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<d2> f16205b;

    public e(Provider<AccountFragment> provider, Provider<d2> provider2) {
        this.f16204a = provider;
        this.f16205b = provider2;
    }

    public static e a(Provider<AccountFragment> provider, Provider<d2> provider2) {
        return new e(provider, provider2);
    }

    public static c c(AccountFragment accountFragment, d2 d2Var) {
        return (c) i.e(d.f16203a.a(accountFragment, d2Var));
    }

    /* renamed from: b */
    public c get() {
        return c(this.f16204a.get(), this.f16205b.get());
    }
}
