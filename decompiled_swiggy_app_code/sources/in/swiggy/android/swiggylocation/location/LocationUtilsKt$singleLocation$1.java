package in.swiggy.android.swiggylocation.location;

import android.location.Location;
import android.location.LocationManager;
import bp0.g;
import bp0.k;
import cg0.n;
import cg0.s0;
import cg0.t0;
import fp0.c;
import in.swiggy.android.tejas.feature.address.v2.LocationGps;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.channels.ProduceKt;
import lp0.p;
import os.u;
import yp0.j;
import yp0.q;
import yp0.w;
import zj.b;

@d(c = "in.swiggy.android.swiggylocation.location.LocationUtilsKt$singleLocation$1", f = "LocationUtils.kt", l = {206}, m = "invokeSuspend")
/* compiled from: LocationUtils.kt */
final class LocationUtilsKt$singleLocation$1 extends SuspendLambda implements p<q<? super LocationEvent>, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f18846a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f18847b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.location.d f18848c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ n f18849d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ LocationGps f18850e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ LocationManager f18851f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LocationUtilsKt$singleLocation$1(com.google.android.gms.location.d dVar, n nVar, LocationGps locationGps, LocationManager locationManager, c<? super LocationUtilsKt$singleLocation$1> cVar) {
        super(2, cVar);
        this.f18848c = dVar;
        this.f18849d = nVar;
        this.f18850e = locationGps;
        this.f18851f = locationManager;
    }

    /* access modifiers changed from: private */
    public static final void i(q qVar, n nVar, LocationGps locationGps, LocationManager locationManager, Location location) {
        Object obj;
        boolean z11;
        q qVar2 = qVar;
        n nVar2 = nVar;
        Location location2 = location;
        try {
            Result.a aVar = Result.f25582b;
            float V = nVar.V();
            if (V > 0.0f) {
                location2.setAccuracy(V);
            }
            u.b("LOCRES", "onLocationResult mockedAccuracy " + V + "  " + locationGps + " accuracy " + location.getAccuracy() + " location " + location2);
            s0 s0Var = new s0(String.valueOf(location.getAccuracy()), 1, "yes", (String) null, (String) null, 24, (i) null);
            kotlin.jvm.internal.p.i(location2, "it");
            t0 t0Var = new t0(s0Var, LocationUtilsKt.g(location, locationGps, nVar2.f2(locationManager), (String) null, 4, (Object) null));
            Boolean invoke = nVar.Q1(locationGps).invoke(location2);
            kotlin.jvm.internal.p.i(invoke, "locationContext.getCusto…r(locationGps).invoke(it)");
            if (invoke.booleanValue()) {
                nVar2.v0(location2);
                t0Var.b().e(String.valueOf(location.getAccuracy()));
                LocationData locationData = new LocationData(location2, t0Var);
                u.b("LOCRES", kotlin.jvm.internal.p.s("addOnSuccessListener locationData ", locationData));
                j.j(qVar2.e(locationData));
                z11 = w.a.a(qVar2, (Throwable) null, 1, (Object) null);
            } else {
                t0Var.a().b("no");
                t0Var.b().e(String.valueOf(location.getAccuracy()));
                InvalidLocation invalidLocation = new InvalidLocation(new LocationData(location2, t0Var), (Throwable) null, 2, (i) null);
                u.b("LOCRES", kotlin.jvm.internal.p.s("addOnSuccessListener invalidData ", invalidLocation));
                z11 = qVar2.n(invalidLocation);
            }
            obj = Result.b(Boolean.valueOf(z11));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f25582b;
            obj = Result.b(g.a(th2));
        }
        Throwable d11 = Result.d(obj);
        if (d11 != null) {
            u.b("LOCRES", kotlin.jvm.internal.p.s("addOnSuccessListener exception ", d11));
            qVar2.n(new InvalidLocation((LocationData) null, d11, 1, (i) null));
        }
    }

    /* access modifiers changed from: private */
    public static final void j(q qVar, Exception exc) {
        u.b("LOCRES", kotlin.jvm.internal.p.s("addOnFailureListener ", exc));
        qVar.n(new InvalidLocation((LocationData) null, exc, 1, (i) null));
    }

    public final c<k> create(Object obj, c<?> cVar) {
        LocationUtilsKt$singleLocation$1 locationUtilsKt$singleLocation$1 = new LocationUtilsKt$singleLocation$1(this.f18848c, this.f18849d, this.f18850e, this.f18851f, cVar);
        locationUtilsKt$singleLocation$1.f18847b = obj;
        return locationUtilsKt$singleLocation$1;
    }

    public final Object invoke(q<? super LocationEvent> qVar, c<? super k> cVar) {
        return ((LocationUtilsKt$singleLocation$1) create(qVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f18846a;
        if (i11 == 0) {
            g.b(obj);
            q qVar = (q) this.f18847b;
            this.f18848c.a(100, new b().b()).i(new e(qVar, this.f18849d, this.f18850e, this.f18851f)).f(new d(qVar));
            AnonymousClass3 r12 = AnonymousClass3.f18852a;
            this.f18846a = 1;
            if (ProduceKt.a(qVar, r12, this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return k.f22762a;
    }
}
