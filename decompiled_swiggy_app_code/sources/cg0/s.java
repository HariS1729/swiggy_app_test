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

/* compiled from: LastKnownLocationObservable.kt */
public final class s implements f<Location> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f18180b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final d f18181a;

    /* compiled from: LastKnownLocationObservable.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final ao0.d<Location> a(d dVar) {
            p.j(dVar, "fusedLocationProviderClient");
            ao0.d<Location> l11 = ao0.d.l(new s(dVar, (i) null), BackpressureStrategy.BUFFER);
            p.i(l11, "create(LastKnownLocation…kpressureStrategy.BUFFER)");
            return l11;
        }
    }

    private s(d dVar) {
        this.f18181a = dVar;
    }

    public /* synthetic */ s(d dVar, i iVar) {
        this(dVar);
    }

    /* access modifiers changed from: private */
    public static final void e(e eVar, Location location) {
        p.j(eVar, "$observer");
        u.b("LastKnownLocationObservable", p.s("last known location : ", location));
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
            Task<Location> b11 = this.f18181a.b();
            b11.i(new r(eVar));
            b11.f(new q(eVar));
            b11.b(new p(eVar));
        } catch (Exception e11) {
            eVar.b(e11);
        }
    }
}
