package lg0;

import cg0.n;
import ef0.e;
import in.swiggy.android.swiggylocation.reverseGeocode.ReverseGeoCodeManager;
import in.swiggy.android.tejas.feature.address.v2.usecase.UpdateAddressUseCase;
import ir.b;
import javax.inject.Provider;
import kg0.a;
import nq.d;

/* compiled from: LynxActivityViewModel_MembersInjector */
public final class c implements d<b> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<b> f19669a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<n> f19670b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<a> f19671c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<e> f19672d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider<UpdateAddressUseCase> f19673e;

    /* renamed from: f  reason: collision with root package name */
    private final Provider<ReverseGeoCodeManager> f19674f;

    public c(Provider<b> provider, Provider<n> provider2, Provider<a> provider3, Provider<e> provider4, Provider<UpdateAddressUseCase> provider5, Provider<ReverseGeoCodeManager> provider6) {
        this.f19669a = provider;
        this.f19670b = provider2;
        this.f19671c = provider3;
        this.f19672d = provider4;
        this.f19673e = provider5;
        this.f19674f = provider6;
    }

    public static d<b> a(Provider<b> provider, Provider<n> provider2, Provider<a> provider3, Provider<e> provider4, Provider<UpdateAddressUseCase> provider5, Provider<ReverseGeoCodeManager> provider6) {
        return new c(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static void b(b bVar, n nVar) {
        bVar.f19665i = nVar;
    }

    public static void c(b bVar, a aVar) {
        bVar.j = aVar;
    }

    public static void e(b bVar, ReverseGeoCodeManager reverseGeoCodeManager) {
        bVar.f19667m = reverseGeoCodeManager;
    }

    public static void f(b bVar, b bVar2) {
        bVar.f19664h = bVar2;
    }

    public static void g(b bVar, UpdateAddressUseCase updateAddressUseCase) {
        bVar.f19666l = updateAddressUseCase;
    }

    public static void h(b bVar, e eVar) {
        bVar.k = eVar;
    }

    /* renamed from: d */
    public void injectMembers(b bVar) {
        f(bVar, this.f19669a.get());
        b(bVar, this.f19670b.get());
        c(bVar, this.f19671c.get());
        h(bVar, this.f19672d.get());
        g(bVar, this.f19673e.get());
        e(bVar, this.f19674f.get());
    }
}
