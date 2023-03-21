package ck0;

import ak0.b;
import in.swiggy.android.track.addressUpdate.usecase.DeliveryAddressUpdateEligibilityUseCase;
import javax.inject.Provider;
import qq.e;

/* compiled from: DeliveryAddressUpdateEligibilityUseCase_Factory */
public final class a implements e<DeliveryAddressUpdateEligibilityUseCase> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<ak0.a> f20088a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<b> f20089b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<os.a> f20090c;

    public a(Provider<ak0.a> provider, Provider<b> provider2, Provider<os.a> provider3) {
        this.f20088a = provider;
        this.f20089b = provider2;
        this.f20090c = provider3;
    }

    public static a a(Provider<ak0.a> provider, Provider<b> provider2, Provider<os.a> provider3) {
        return new a(provider, provider2, provider3);
    }

    public static DeliveryAddressUpdateEligibilityUseCase c(ak0.a aVar, b bVar, os.a aVar2) {
        return new DeliveryAddressUpdateEligibilityUseCase(aVar, bVar, aVar2);
    }

    /* renamed from: b */
    public DeliveryAddressUpdateEligibilityUseCase get() {
        return c(this.f20088a.get(), this.f20089b.get(), this.f20090c.get());
    }
}
