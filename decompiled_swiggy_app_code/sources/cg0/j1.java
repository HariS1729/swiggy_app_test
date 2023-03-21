package cg0;

import android.content.Context;
import android.location.Location;
import ao0.e;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.d;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RectangularBounds;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.rudderstack.android.sdk.core.ecomm.ECommerceParamNames;
import in.juspay.hyper.constants.LogCategory;
import in.swiggy.android.tejas.feature.google.googleplacesearch.model.GooglePlacePredictionList;
import in.swiggy.android.tejas.feature.google.googlereversegeocode.model.GooglePlace;
import io.reactivex.BackpressureStrategy;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: ReactiveLocationProvider.kt */
public final class j1 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f18158e = new a((i) null);

    /* renamed from: f  reason: collision with root package name */
    private static final String f18159f = "ReactiveLocationProvider";

    /* renamed from: a  reason: collision with root package name */
    private final Context f18160a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18161b;

    /* renamed from: c  reason: collision with root package name */
    private final d f18162c;

    /* renamed from: d  reason: collision with root package name */
    private AutocompleteSessionToken f18163d;

    /* compiled from: ReactiveLocationProvider.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public j1(Context context, String str, d dVar) {
        p.j(context, LogCategory.CONTEXT);
        p.j(str, "placesClientKey");
        p.j(dVar, "fusedLocationProviderClient");
        this.f18160a = context;
        this.f18161b = str;
        this.f18162c = dVar;
    }

    /* access modifiers changed from: private */
    public static final void k(String str, j1 j1Var, e eVar) {
        p.j(str, "$placeId");
        p.j(j1Var, "this$0");
        p.j(eVar, "emitter");
        FetchPlaceRequest build = FetchPlaceRequest.builder(str, k.m(Place.Field.ID, Place.Field.NAME, Place.Field.ADDRESS, Place.Field.LAT_LNG, Place.Field.ADDRESS_COMPONENTS)).setSessionToken(j1Var.f18163d).build();
        p.i(build, "builder(placeId, placeFi…\n                .build()");
        Task<FetchPlaceResponse> fetchPlace = eg0.a.f18287a.b(j1Var.f18160a, j1Var.f18161b).fetchPlace(build);
        p.i(fetchPlace, "placesClient.fetchPlace(fetchPlaceRequest)");
        fetchPlace.i(new i1(eVar, j1Var));
        fetchPlace.f(new g1(eVar));
        fetchPlace.b(new d1(eVar));
    }

    /* access modifiers changed from: private */
    public static final void l(e eVar, j1 j1Var, FetchPlaceResponse fetchPlaceResponse) {
        p.j(eVar, "$emitter");
        p.j(j1Var, "this$0");
        eVar.onNext(new GooglePlace(fetchPlaceResponse.getPlace()));
        j1Var.f18163d = null;
    }

    /* access modifiers changed from: private */
    public static final void m(e eVar, Exception exc) {
        p.j(eVar, "$emitter");
        p.j(exc, "it");
        eVar.onError(exc);
    }

    /* access modifiers changed from: private */
    public static final void n(e eVar, Task task) {
        p.j(eVar, "$emitter");
        p.j(task, "response");
        eVar.onComplete();
    }

    /* access modifiers changed from: private */
    public static final void q(j1 j1Var, LatLngBounds latLngBounds, String str, e eVar) {
        p.j(j1Var, "this$0");
        p.j(latLngBounds, "$bounds");
        p.j(str, "$query");
        p.j(eVar, "emitter");
        if (j1Var.f18163d == null) {
            j1Var.f18163d = AutocompleteSessionToken.newInstance();
        }
        RectangularBounds newInstance = RectangularBounds.newInstance(latLngBounds);
        p.i(newInstance, "newInstance(bounds)");
        FindAutocompletePredictionsRequest build = FindAutocompletePredictionsRequest.builder().setLocationBias(newInstance).setTypeFilter(TypeFilter.ADDRESS).setSessionToken(j1Var.f18163d).setQuery(str).build();
        p.i(build, "builder()\n              …\n                .build()");
        eg0.a.f18287a.b(j1Var.f18160a, j1Var.f18161b).findAutocompletePredictions(build).i(new h1(eVar)).f(new f1(eVar)).b(new e1(eVar));
    }

    /* access modifiers changed from: private */
    public static final void r(e eVar, FindAutocompletePredictionsResponse findAutocompletePredictionsResponse) {
        p.j(eVar, "$emitter");
        List<AutocompletePrediction> autocompletePredictions = findAutocompletePredictionsResponse.getAutocompletePredictions();
        p.i(autocompletePredictions, "response.autocompletePredictions");
        eVar.onNext(new GooglePlacePredictionList(autocompletePredictions));
    }

    /* access modifiers changed from: private */
    public static final void s(e eVar, Exception exc) {
        p.j(eVar, "$emitter");
        p.j(exc, "it");
        eVar.onError(exc);
    }

    /* access modifiers changed from: private */
    public static final void t(e eVar, Task task) {
        p.j(eVar, "$emitter");
        p.j(task, "response");
        eVar.onComplete();
    }

    public final ao0.d<Location> i() {
        return k.f18164b.a(this.f18162c);
    }

    public final ao0.d<GooglePlace> j(String str) {
        p.j(str, "placeId");
        ao0.d<GooglePlace> l11 = ao0.d.l(new c1(str, this), BackpressureStrategy.BUFFER);
        p.i(l11, "create({ emitter ->\n\n   …kpressureStrategy.BUFFER)");
        return l11;
    }

    public final ao0.d<Location> o() {
        return s.f18180b.a(this.f18162c);
    }

    public final ao0.d<GooglePlacePredictionList> p(String str, LatLngBounds latLngBounds) {
        p.j(str, ECommerceParamNames.QUERY);
        p.j(latLngBounds, "bounds");
        ao0.d<GooglePlacePredictionList> l11 = ao0.d.l(new b1(this, latLngBounds, str), BackpressureStrategy.BUFFER);
        p.i(l11, "create({ emitter ->\n\n   …kpressureStrategy.BUFFER)");
        return l11;
    }

    public final ao0.d<Location> u(LocationRequest locationRequest, l<? super Location, Boolean> lVar, boolean z11) {
        p.j(locationRequest, "locationRequest");
        p.j(lVar, "locationValidator");
        return x0.f18201g.a(this.f18162c, locationRequest, lVar, z11);
    }
}
