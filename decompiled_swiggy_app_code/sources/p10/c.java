package p10;

import fb0.i;
import in.swiggy.android.activities.AccountContainerActivity;
import javax.inject.Provider;
import qq.e;

/* compiled from: AccountContainerActivityModule_Dependencies_ProvidesUiComponentFactory */
public final class c implements e<i> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<AccountContainerActivity> f16202a;

    public c(Provider<AccountContainerActivity> provider) {
        this.f16202a = provider;
    }

    public static c a(Provider<AccountContainerActivity> provider) {
        return new c(provider);
    }

    public static i c(AccountContainerActivity accountContainerActivity) {
        return (i) qq.i.e(a.f16201a.a(accountContainerActivity));
    }

    /* renamed from: b */
    public i get() {
        return c(this.f16202a.get());
    }
}
