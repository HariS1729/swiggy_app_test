package di0;

import android.location.Location;
import androidx.databinding.ObservableField;
import androidx.databinding.k;
import ao0.d;
import in.swiggy.android.swiggylynx.R;
import io.reactivex.processors.BehaviorProcessor;
import kotlin.jvm.internal.p;
import mb0.r0;
import os.d0;
import os.u;

/* compiled from: LocationListenerUseCase.kt */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final eo0.a f18271a;

    /* renamed from: b  reason: collision with root package name */
    private final cg0.n f18272b;

    /* renamed from: c  reason: collision with root package name */
    private final th0.a f18273c;

    /* renamed from: d  reason: collision with root package name */
    private final kg0.a f18274d;

    /* renamed from: e  reason: collision with root package name */
    private final r0 f18275e;

    /* renamed from: f  reason: collision with root package name */
    private Location f18276f;

    /* renamed from: g  reason: collision with root package name */
    private final ObservableField<Location> f18277g = new ObservableField<>();

    /* renamed from: h  reason: collision with root package name */
    private final BehaviorProcessor<Location> f18278h;

    /* renamed from: i  reason: collision with root package name */
    private final BehaviorProcessor<in.swiggy.android.swiggylynx.model.a> f18279i;
    private in.swiggy.android.swiggylynx.model.a j;
    private in.swiggy.android.swiggylynx.model.a k;

    /* compiled from: LocationListenerUseCase.kt */
    public static final class a extends k.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f18280a;

        a(n nVar) {
            this.f18280a = nVar;
        }

        public void a(k kVar, int i11) {
            Location g11;
            p.j(kVar, "sender");
            if (this.f18280a.l() && (g11 = this.f18280a.m().g()) != null) {
                this.f18280a.D(g11);
            }
        }
    }

    public n(eo0.a aVar, cg0.n nVar, th0.a aVar2, kg0.a aVar3, r0 r0Var) {
        p.j(aVar, "subscriptions");
        p.j(nVar, "mLocationContext");
        p.j(aVar2, "schedulerProvider");
        p.j(aVar3, "locationRefreshUtils");
        p.j(r0Var, "resourcesService");
        this.f18271a = aVar;
        this.f18272b = nVar;
        this.f18273c = aVar2;
        this.f18274d = aVar3;
        this.f18275e = r0Var;
        BehaviorProcessor<Location> z02 = BehaviorProcessor.z0();
        p.i(z02, "create<Location>()");
        this.f18278h = z02;
        BehaviorProcessor<in.swiggy.android.swiggylynx.model.a> z03 = BehaviorProcessor.z0();
        p.i(z03, "create<HeaderModel>()");
        this.f18279i = z03;
    }

    /* access modifiers changed from: private */
    public static final boolean A(n nVar, Location location) {
        p.j(nVar, "this$0");
        p.j(location, "location");
        return !nVar.f18272b.X(location);
    }

    /* access modifiers changed from: private */
    public static final void B(n nVar, Location location) {
        p.j(nVar, "this$0");
        if (!nVar.f18274d.b()) {
            p.i(location, "currentLocation");
            nVar.E(location);
        }
    }

    /* access modifiers changed from: private */
    public final void D(Location location) {
        F();
        if (!C()) {
            this.f18278h.D0(location);
        }
        if (!r()) {
            this.f18279i.D0(this.k);
            this.j = this.k;
        }
    }

    private final void F() {
        String F0;
        String R = this.f18272b.R();
        if (d0.e(R)) {
            R = this.f18275e.getString(R.string.listing_toolbar_default_title);
        }
        String str = "";
        if (!(this.f18277g.g() == null || (F0 = this.f18272b.F0()) == null)) {
            str = F0;
        }
        this.k = new in.swiggy.android.swiggylynx.model.a(R, str);
    }

    /* access modifiers changed from: private */
    public final boolean l() {
        if (!this.f18272b.X(this.f18277g.g()) && !this.f18272b.Y1(this.f18277g.g())) {
            return true;
        }
        return false;
    }

    private final boolean r() {
        return p.e(this.k, this.j);
    }

    /* access modifiers changed from: private */
    public static final void t(n nVar, Throwable th2) {
        String str;
        Class<n> cls = n.class;
        p.j(nVar, "this$0");
        if (!nVar.getClass().isAnonymousClass()) {
            str = cls.getSimpleName();
            if (str.length() > 23) {
                p.i(str, "name");
                str = str.substring(0, 23);
                p.i(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            p.i(str, "{\n            val name =… first 23 chars\n        }");
        } else {
            String name = cls.getName();
            if (name.length() > 23) {
                p.i(name, "name");
                name = name.substring(name.length() - 23, name.length());
                p.i(name, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            p.i(str, "{\n            val name =…/ last 23 chars\n        }");
        }
        u.h(str, th2);
    }

    /* access modifiers changed from: private */
    public static final boolean u(n nVar, Location location) {
        p.j(nVar, "this$0");
        p.j(location, "location");
        return !nVar.f18272b.X(location);
    }

    /* access modifiers changed from: private */
    public static final void v(n nVar, Location location) {
        p.j(nVar, "this$0");
        p.j(location, "location");
        nVar.f18272b.m2(false);
        nVar.E(location);
    }

    /* access modifiers changed from: private */
    public static final void w(n nVar, Throwable th2) {
        String str;
        Class<n> cls = n.class;
        p.j(nVar, "this$0");
        if (!nVar.getClass().isAnonymousClass()) {
            str = cls.getSimpleName();
            if (str.length() > 23) {
                p.i(str, "name");
                str = str.substring(0, 23);
                p.i(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            p.i(str, "{\n            val name =… first 23 chars\n        }");
        } else {
            String name = cls.getName();
            if (name.length() > 23) {
                p.i(name, "name");
                name = name.substring(name.length() - 23, name.length());
                p.i(name, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            p.i(str, "{\n            val name =…/ last 23 chars\n        }");
        }
        u.h(str, th2);
    }

    /* access modifiers changed from: private */
    public static final boolean x(n nVar, Location location) {
        p.j(nVar, "this$0");
        p.j(location, "location");
        return !nVar.f18272b.X(location);
    }

    /* access modifiers changed from: private */
    public static final void y(n nVar, Location location) {
        p.j(nVar, "this$0");
        p.j(location, "currentLocation");
        if (!nVar.f18274d.b()) {
            nVar.f18274d.g(true);
            nVar.E(location);
        }
    }

    /* access modifiers changed from: private */
    public static final void z(n nVar, Throwable th2) {
        String str;
        Class<n> cls = n.class;
        p.j(nVar, "this$0");
        if (!nVar.getClass().isAnonymousClass()) {
            str = cls.getSimpleName();
            if (str.length() > 23) {
                p.i(str, "name");
                str = str.substring(0, 23);
                p.i(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            p.i(str, "{\n            val name =… first 23 chars\n        }");
        } else {
            String name = cls.getName();
            if (name.length() > 23) {
                p.i(name, "name");
                name = name.substring(name.length() - 23, name.length());
                p.i(name, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            p.i(str, "{\n            val name =…/ last 23 chars\n        }");
        }
        u.h(str, th2);
    }

    public final boolean C() {
        Location p11;
        Location g11 = this.f18277g.g();
        if (!(g11 == null || (p11 = p()) == null)) {
            if (g11.getLatitude() == p11.getLatitude()) {
                if (g11.getLongitude() == p11.getLongitude()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void E(Location location) {
        p.j(location, "currentLocation");
        this.f18276f = this.f18277g.g();
        this.f18277g.j(location);
    }

    public final ObservableField<Location> m() {
        return this.f18277g;
    }

    public final d<in.swiggy.android.swiggylynx.model.a> n() {
        return this.f18279i;
    }

    public final d<Location> o() {
        return this.f18278h;
    }

    public final Location p() {
        return this.f18276f;
    }

    public final void q() {
        this.f18277g.h(new a(this));
        s();
    }

    public final void s() {
        this.f18271a.c(this.f18272b.v().z(new l(this)).Q(this.f18273c.a()).h0(new e(this), new h(this)));
        this.f18271a.c(this.f18272b.p1().z(new m(this)).Q(this.f18273c.a()).h0(new g(this), new i(this)));
        this.f18271a.c(this.f18272b.C0().z(new k(this)).Q(this.f18273c.a()).h0(new f(this), new j(this)));
    }
}
