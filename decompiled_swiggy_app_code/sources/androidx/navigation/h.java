package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.f0;
import androidx.lifecycle.j;
import androidx.lifecycle.k;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import java.util.UUID;
import n3.b;
import n3.c;
import n3.d;

/* compiled from: NavBackStackEntry */
public final class h implements r, p0, k, d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f10907a;

    /* renamed from: b  reason: collision with root package name */
    private final m f10908b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f10909c;

    /* renamed from: d  reason: collision with root package name */
    private final t f10910d;

    /* renamed from: e  reason: collision with root package name */
    private final c f10911e;

    /* renamed from: f  reason: collision with root package name */
    final UUID f10912f;

    /* renamed from: g  reason: collision with root package name */
    private Lifecycle.State f10913g;

    /* renamed from: h  reason: collision with root package name */
    private Lifecycle.State f10914h;

    /* renamed from: i  reason: collision with root package name */
    private i f10915i;
    private l0.b j;

    /* compiled from: NavBackStackEntry */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10916a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.lifecycle.Lifecycle$Event[] r0 = androidx.lifecycle.Lifecycle.Event.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10916a = r0
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10916a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10916a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10916a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f10916a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f10916a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f10916a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.h.a.<clinit>():void");
        }
    }

    h(Context context, m mVar, Bundle bundle, r rVar, i iVar) {
        this(context, mVar, bundle, rVar, iVar, UUID.randomUUID(), (Bundle) null);
    }

    private static Lifecycle.State d(Lifecycle.Event event) {
        switch (a.f10916a[event.ordinal()]) {
            case 1:
            case 2:
                return Lifecycle.State.CREATED;
            case 3:
            case 4:
                return Lifecycle.State.STARTED;
            case 5:
                return Lifecycle.State.RESUMED;
            case 6:
                return Lifecycle.State.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + event);
        }
    }

    public Bundle a() {
        return this.f10909c;
    }

    public m b() {
        return this.f10908b;
    }

    /* access modifiers changed from: package-private */
    public Lifecycle.State c() {
        return this.f10914h;
    }

    /* access modifiers changed from: package-private */
    public void e(Lifecycle.Event event) {
        this.f10913g = d(event);
        i();
    }

    /* access modifiers changed from: package-private */
    public void f(Bundle bundle) {
        this.f10909c = bundle;
    }

    /* access modifiers changed from: package-private */
    public void g(Bundle bundle) {
        this.f10911e.e(bundle);
    }

    public /* synthetic */ g3.a getDefaultViewModelCreationExtras() {
        return j.a(this);
    }

    public l0.b getDefaultViewModelProviderFactory() {
        if (this.j == null) {
            this.j = new f0((Application) this.f10907a.getApplicationContext(), this, this.f10909c);
        }
        return this.j;
    }

    public Lifecycle getLifecycle() {
        return this.f10910d;
    }

    public b getSavedStateRegistry() {
        return this.f10911e.b();
    }

    public o0 getViewModelStore() {
        i iVar = this.f10915i;
        if (iVar != null) {
            return iVar.m1(this.f10912f);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    /* access modifiers changed from: package-private */
    public void h(Lifecycle.State state) {
        this.f10914h = state;
        i();
    }

    /* access modifiers changed from: package-private */
    public void i() {
        if (this.f10913g.ordinal() < this.f10914h.ordinal()) {
            this.f10910d.o(this.f10913g);
        } else {
            this.f10910d.o(this.f10914h);
        }
    }

    h(Context context, m mVar, Bundle bundle, r rVar, i iVar, UUID uuid, Bundle bundle2) {
        this.f10910d = new t(this);
        c a11 = c.a(this);
        this.f10911e = a11;
        this.f10913g = Lifecycle.State.CREATED;
        this.f10914h = Lifecycle.State.RESUMED;
        this.f10907a = context;
        this.f10912f = uuid;
        this.f10908b = mVar;
        this.f10909c = bundle;
        this.f10915i = iVar;
        a11.d(bundle2);
        if (rVar != null) {
            this.f10913g = rVar.getLifecycle().b();
        }
    }
}
