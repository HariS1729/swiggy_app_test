package gl0;

import in.swiggy.android.tejas.feature.cancellation.CancelOnlyManager;
import in.swiggy.android.tejas.feature.detipping.DeTipPostOrderManager;
import in.swiggy.android.tejas.feature.google.directionscache.repository.DirectionsUseCase;
import in.swiggy.android.tejas.feature.trackv3.TrackV3Manager;
import in.swiggy.android.tejas.flush.SharedPrefFlushManager;
import in.swiggy.android.track.addressUpdate.usecase.DeliveryAddressUpdateEligibilityUseCase;
import in.swiggy.android.track.v3polling.TrackDEPollingUseCase;
import in.swiggy.android.track.v3polling.TrackV3PollingViewModel;
import in.swiggy.android.track.viewmodels.v3.TrackCancellationResponseHandler;
import in.swiggy.android.track.viewmodels.v3.TrackOrderDeliveryStatesViewModel;
import in.swiggy.android.track.viewmodels.v3.TrackOrderFragmentV3ViewModel;
import javax.inject.Provider;
import nq.d;
import qq.e;
import qt.a;
import wr.c;

/* compiled from: TrackOrderFragmentV3ViewModel_Factory */
public final class i implements e<TrackOrderFragmentV3ViewModel> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<us.e> f20146a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<a> f20147b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<cl0.a> f20148c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<al0.a> f20149d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider<TrackDEPollingUseCase> f20150e;

    /* renamed from: f  reason: collision with root package name */
    private final Provider<TrackV3PollingViewModel> f20151f;

    /* renamed from: g  reason: collision with root package name */
    private final Provider<p> f20152g;

    /* renamed from: h  reason: collision with root package name */
    private final Provider<DirectionsUseCase> f20153h;

    /* renamed from: i  reason: collision with root package name */
    private final Provider<SharedPrefFlushManager> f20154i;
    private final Provider<DeliveryAddressUpdateEligibilityUseCase> j;
    private final Provider<hf0.a> k;

    /* renamed from: l  reason: collision with root package name */
    private final Provider<ll0.a> f20155l;

    /* renamed from: m  reason: collision with root package name */
    private final Provider<CancelOnlyManager> f20156m;
    private final Provider<TrackV3Manager> n;

    /* renamed from: o  reason: collision with root package name */
    private final Provider<DeTipPostOrderManager> f20157o;

    /* renamed from: p  reason: collision with root package name */
    private final Provider<TrackCancellationResponseHandler> f20158p;
    private final Provider<d<TrackOrderDeliveryStatesViewModel>> q;

    /* renamed from: r  reason: collision with root package name */
    private final Provider<zs.a> f20159r;

    /* renamed from: s  reason: collision with root package name */
    private final Provider<c> f20160s;

    public i(Provider<us.e> provider, Provider<a> provider2, Provider<cl0.a> provider3, Provider<al0.a> provider4, Provider<TrackDEPollingUseCase> provider5, Provider<TrackV3PollingViewModel> provider6, Provider<p> provider7, Provider<DirectionsUseCase> provider8, Provider<SharedPrefFlushManager> provider9, Provider<DeliveryAddressUpdateEligibilityUseCase> provider10, Provider<hf0.a> provider11, Provider<ll0.a> provider12, Provider<CancelOnlyManager> provider13, Provider<TrackV3Manager> provider14, Provider<DeTipPostOrderManager> provider15, Provider<TrackCancellationResponseHandler> provider16, Provider<d<TrackOrderDeliveryStatesViewModel>> provider17, Provider<zs.a> provider18, Provider<c> provider19) {
        this.f20146a = provider;
        this.f20147b = provider2;
        this.f20148c = provider3;
        this.f20149d = provider4;
        this.f20150e = provider5;
        this.f20151f = provider6;
        this.f20152g = provider7;
        this.f20153h = provider8;
        this.f20154i = provider9;
        this.j = provider10;
        this.k = provider11;
        this.f20155l = provider12;
        this.f20156m = provider13;
        this.n = provider14;
        this.f20157o = provider15;
        this.f20158p = provider16;
        this.q = provider17;
        this.f20159r = provider18;
        this.f20160s = provider19;
    }

    public static i a(Provider<us.e> provider, Provider<a> provider2, Provider<cl0.a> provider3, Provider<al0.a> provider4, Provider<TrackDEPollingUseCase> provider5, Provider<TrackV3PollingViewModel> provider6, Provider<p> provider7, Provider<DirectionsUseCase> provider8, Provider<SharedPrefFlushManager> provider9, Provider<DeliveryAddressUpdateEligibilityUseCase> provider10, Provider<hf0.a> provider11, Provider<ll0.a> provider12, Provider<CancelOnlyManager> provider13, Provider<TrackV3Manager> provider14, Provider<DeTipPostOrderManager> provider15, Provider<TrackCancellationResponseHandler> provider16, Provider<d<TrackOrderDeliveryStatesViewModel>> provider17, Provider<zs.a> provider18, Provider<c> provider19) {
        return new i(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19);
    }

    public static TrackOrderFragmentV3ViewModel c(us.e eVar, a aVar, cl0.a aVar2, al0.a aVar3, TrackDEPollingUseCase trackDEPollingUseCase, TrackV3PollingViewModel trackV3PollingViewModel, p pVar, DirectionsUseCase directionsUseCase, SharedPrefFlushManager sharedPrefFlushManager, DeliveryAddressUpdateEligibilityUseCase deliveryAddressUpdateEligibilityUseCase) {
        return new TrackOrderFragmentV3ViewModel(eVar, aVar, aVar2, aVar3, trackDEPollingUseCase, trackV3PollingViewModel, pVar, directionsUseCase, sharedPrefFlushManager, deliveryAddressUpdateEligibilityUseCase);
    }

    /* renamed from: b */
    public TrackOrderFragmentV3ViewModel get() {
        TrackOrderFragmentV3ViewModel c11 = c(this.f20146a.get(), this.f20147b.get(), this.f20148c.get(), this.f20149d.get(), this.f20150e.get(), this.f20151f.get(), this.f20152g.get(), this.f20153h.get(), this.f20154i.get(), this.j.get());
        j.f(c11, this.k.get());
        j.i(c11, this.f20155l.get());
        j.a(c11, this.f20156m.get());
        j.h(c11, this.n.get());
        j.c(c11, this.f20157o.get());
        j.b(c11, this.f20158p.get());
        j.d(c11, this.q.get());
        j.g(c11, this.f20159r.get());
        j.e(c11, this.f20160s.get());
        return c11;
    }
}
