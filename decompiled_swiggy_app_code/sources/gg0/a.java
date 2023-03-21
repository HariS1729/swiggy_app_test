package gg0;

import cg0.n;
import in.swiggy.android.swiggylocation.reverseGeocode.ReverseGeoCodeManager;
import in.swiggy.android.tejas.feature.recommends.RecommendsApiManager;
import in.swiggy.android.tejas.feature.swiggygoogle.googlePlacesSdk.GoogleSdkManager;
import javax.inject.Provider;
import qq.e;

/* compiled from: ReverseGeoCodeManager_Factory */
public final class a implements e<ReverseGeoCodeManager> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<RecommendsApiManager> f18333a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<n> f18334b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<GoogleSdkManager> f18335c;

    public a(Provider<RecommendsApiManager> provider, Provider<n> provider2, Provider<GoogleSdkManager> provider3) {
        this.f18333a = provider;
        this.f18334b = provider2;
        this.f18335c = provider3;
    }

    public static a a(Provider<RecommendsApiManager> provider, Provider<n> provider2, Provider<GoogleSdkManager> provider3) {
        return new a(provider, provider2, provider3);
    }

    public static ReverseGeoCodeManager c(RecommendsApiManager recommendsApiManager, n nVar, GoogleSdkManager googleSdkManager) {
        return new ReverseGeoCodeManager(recommendsApiManager, nVar, googleSdkManager);
    }

    /* renamed from: b */
    public ReverseGeoCodeManager get() {
        return c(this.f18333a.get(), this.f18334b.get(), this.f18335c.get());
    }
}
