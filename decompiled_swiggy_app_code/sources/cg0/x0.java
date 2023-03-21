package cg0;

import android.annotation.SuppressLint;
import android.location.Location;
import android.os.Looper;
import ao0.e;
import ao0.f;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.d;
import com.google.android.gms.location.g;
import com.google.android.gms.tasks.Task;
import io.reactivex.BackpressureStrategy;
import java.util.List;
import js.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import os.u;

/* compiled from: LocationUpdatesObservable.kt */
public final class x0 implements f<Location> {

    /* renamed from: g  reason: collision with root package name */
    public static final a f18201g = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final d f18202a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationRequest f18203b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public l<? super Location, Boolean> f18204c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f18205d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public e<Location> f18206e;

    /* renamed from: f  reason: collision with root package name */
    private final b f18207f;

    /* compiled from: LocationUpdatesObservable.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final ao0.d<Location> a(d dVar, LocationRequest locationRequest, l<? super Location, Boolean> lVar, boolean z11) {
            p.j(dVar, "fusedLocationProviderClient");
            p.j(locationRequest, "locationRequest");
            p.j(lVar, "locationValidator");
            ao0.d<Location> l11 = ao0.d.l(new x0(dVar, locationRequest, lVar, z11, (i) null), BackpressureStrategy.BUFFER);
            p.i(l11, "create(\n                …kpressureStrategy.BUFFER)");
            return l11;
        }
    }

    /* compiled from: LocationUpdatesObservable.kt */
    public static final class b extends g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x0 f18208a;

        b(x0 x0Var) {
            this.f18208a = x0Var;
        }

        public void onLocationResult(LocationResult locationResult) {
            if (locationResult != null) {
                List<Location> P = locationResult.P();
                p.i(P, "locationResult.locations");
                Location location = (Location) c.j(P, 0);
                if (location != null && ((Boolean) this.f18208a.f18204c.invoke(location)).booleanValue()) {
                    u.b("LocationUpdatesObservable", p.s("gps fetched location : ", location));
                    e d11 = this.f18208a.f18206e;
                    if (d11 != null) {
                        d11.onNext(location);
                    }
                }
            }
        }
    }

    private x0(d dVar, LocationRequest locationRequest, l<? super Location, Boolean> lVar, boolean z11) {
        this.f18202a = dVar;
        this.f18203b = locationRequest;
        this.f18204c = lVar;
        this.f18205d = z11;
        this.f18207f = new b(this);
    }

    public /* synthetic */ x0(d dVar, LocationRequest locationRequest, l lVar, boolean z11, i iVar) {
        this(dVar, locationRequest, lVar, z11);
    }

    /* access modifiers changed from: private */
    public static final void f(x0 x0Var) {
        p.j(x0Var, "this$0");
        x0Var.f18202a.c(x0Var.f18207f);
    }

    /* access modifiers changed from: private */
    public static final void g(e eVar, Exception exc) {
        p.j(eVar, "$emitter");
        p.j(exc, "it");
        eVar.onError(exc);
    }

    @SuppressLint({"MissingPermission"})
    public void a(e<Location> eVar) {
        p.j(eVar, "emitter");
        this.f18206e = eVar;
        if (this.f18205d) {
            this.f18202a.c(this.f18207f);
        }
        Task<Void> d11 = this.f18202a.d(this.f18203b, this.f18207f, Looper.getMainLooper());
        eVar.a(new v0(this));
        d11.f(new w0(eVar));
    }
}
