package bk0;

import in.swiggy.android.track.addressUpdate.handlers.AddressChangeDeclineBottomViewModel;
import javax.inject.Provider;
import mb0.r0;
import qq.e;

/* compiled from: AddressChangeDeclineBottomViewModel_Factory */
public final class b implements e<AddressChangeDeclineBottomViewModel> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<ir.b> f20081a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<r0> f20082b;

    public b(Provider<ir.b> provider, Provider<r0> provider2) {
        this.f20081a = provider;
        this.f20082b = provider2;
    }

    public static b a(Provider<ir.b> provider, Provider<r0> provider2) {
        return new b(provider, provider2);
    }

    public static AddressChangeDeclineBottomViewModel c(ir.b bVar, r0 r0Var) {
        return new AddressChangeDeclineBottomViewModel(bVar, r0Var);
    }

    /* renamed from: b */
    public AddressChangeDeclineBottomViewModel get() {
        return c(this.f20081a.get(), this.f20082b.get());
    }
}
