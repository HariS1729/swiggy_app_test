package cl0;

import android.content.SharedPreferences;
import android.location.LocationManager;
import cg0.n;
import hg0.a;
import in.swiggy.android.tejas.api.ApiBaseUrl;
import in.swiggy.android.track.fragments.TrackOrderFragmentV3;
import in.swiggy.android.track.services.v3.TrackOrderFragmentV3Service;
import ir.b;
import javax.inject.Provider;
import mb0.r0;
import qq.e;
import ru.c;
import us.f;

/* compiled from: TrackOrderFragmentV3Service_Factory */
public final class g implements e<TrackOrderFragmentV3Service> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<TrackOrderFragmentV3> f20091a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<a> f20092b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<SharedPreferences> f20093c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<LocationManager> f20094d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider<n> f20095e;

    /* renamed from: f  reason: collision with root package name */
    private final Provider<al0.a> f20096f;

    /* renamed from: g  reason: collision with root package name */
    private final Provider<f> f20097g;

    /* renamed from: h  reason: collision with root package name */
    private final Provider<ApiBaseUrl> f20098h;

    /* renamed from: i  reason: collision with root package name */
    private final Provider<r0> f20099i;
    private final Provider<c> j;
    private final Provider<jz.c> k;

    /* renamed from: l  reason: collision with root package name */
    private final Provider<bl0.a> f20100l;

    /* renamed from: m  reason: collision with root package name */
    private final Provider<b> f20101m;
    private final Provider<jr.a> n;

    public g(Provider<TrackOrderFragmentV3> provider, Provider<a> provider2, Provider<SharedPreferences> provider3, Provider<LocationManager> provider4, Provider<n> provider5, Provider<al0.a> provider6, Provider<f> provider7, Provider<ApiBaseUrl> provider8, Provider<r0> provider9, Provider<c> provider10, Provider<jz.c> provider11, Provider<bl0.a> provider12, Provider<b> provider13, Provider<jr.a> provider14) {
        this.f20091a = provider;
        this.f20092b = provider2;
        this.f20093c = provider3;
        this.f20094d = provider4;
        this.f20095e = provider5;
        this.f20096f = provider6;
        this.f20097g = provider7;
        this.f20098h = provider8;
        this.f20099i = provider9;
        this.j = provider10;
        this.k = provider11;
        this.f20100l = provider12;
        this.f20101m = provider13;
        this.n = provider14;
    }

    public static g a(Provider<TrackOrderFragmentV3> provider, Provider<a> provider2, Provider<SharedPreferences> provider3, Provider<LocationManager> provider4, Provider<n> provider5, Provider<al0.a> provider6, Provider<f> provider7, Provider<ApiBaseUrl> provider8, Provider<r0> provider9, Provider<c> provider10, Provider<jz.c> provider11, Provider<bl0.a> provider12, Provider<b> provider13, Provider<jr.a> provider14) {
        return new g(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    public static TrackOrderFragmentV3Service c(TrackOrderFragmentV3 trackOrderFragmentV3, a aVar, SharedPreferences sharedPreferences, LocationManager locationManager, n nVar, al0.a aVar2, f fVar) {
        return new TrackOrderFragmentV3Service(trackOrderFragmentV3, aVar, sharedPreferences, locationManager, nVar, aVar2, fVar);
    }

    /* renamed from: b */
    public TrackOrderFragmentV3Service get() {
        TrackOrderFragmentV3Service c11 = c(this.f20091a.get(), this.f20092b.get(), this.f20093c.get(), this.f20094d.get(), this.f20095e.get(), this.f20096f.get(), this.f20097g.get());
        h.a(c11, this.f20098h.get());
        h.f(c11, this.f20099i.get());
        h.c(c11, this.j.get());
        h.b(c11, this.k.get());
        h.d(c11, this.f20100l.get());
        h.g(c11, this.f20101m.get());
        h.e(c11, this.n.get());
        return c11;
    }
}
