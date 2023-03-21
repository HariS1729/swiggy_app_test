package cg0;

import android.annotation.SuppressLint;
import android.location.Location;
import ao0.e;
import ao0.f;
import com.google.android.gms.location.d;
import com.google.android.gms.tasks.Task;
import io.reactivex.BackpressureStrategy;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import os.u;

/* compiled from: FastCurrentLocationObservable.kt */
public final class k implements f<Location> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f18164b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final d f18165a;

    /* compiled from: FastCurrentLocationObservable.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final ao0.d<Location> a(d dVar) {
            p.j(dVar, "fusedLocationProviderClient");
            ao0.d<Location> l11 = ao0.d.l(new k(dVar, (i) null), BackpressureStrategy.BUFFER);
            p.i(l11, "create(\n                …tegy.BUFFER\n            )");
            return l11;
        }
    }

    private k(d dVar) {
        this.f18165a = dVar;
    }

    public /* synthetic */ k(d dVar, i iVar) {
        this(dVar);
    }

    /* access modifiers changed from: private */
    public static final void e(e eVar, Location location) {
        p.j(eVar, "$observer");
        u.b("FastCurrentLocationObservable", p.s("fast current location : ", location));
        if (location == null) {
            location = new Location("");
        }
        eVar.onNext(location);
    }

    /* access modifiers changed from: private */
    public static final void f(e eVar, Exception exc) {
        p.j(eVar, "$observer");
        p.j(exc, "it");
        eVar.onError(exc);
    }

    /* access modifiers changed from: private */
    public static final void g(e eVar, Task task) {
        p.j(eVar, "$observer");
        p.j(task, "it");
        eVar.onComplete();
    }

    @SuppressLint({"MissingPermission"})
    public void a(e<Location> eVar) {
        p.j(eVar, "observer");
        try {
            Task<Location> a11 = this.f18165a.a(100, (zj.a) null);
            a11.i(new j(eVar));
            a11.f(new i(eVar));
            a11.b(new h(eVar));
        } catch (Exception e11) {
            eVar.b(e11);
        }
    }
}
