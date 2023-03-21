package in.swiggy.android.feature.account.servicelines;

import ba0.c;
import bp0.k;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import fb0.f;
import in.swiggy.android.tejas.generated.ISwiggyNetworkWrapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import mb0.r0;
import r10.d0;
import r10.e0;
import r10.s;

/* compiled from: ServiceLineProvider.kt */
public abstract class ServiceLineProvider {

    /* renamed from: m  reason: collision with root package name */
    public static final a f15223m = new a((i) null);
    public static final int n = 8;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f15224a;

    /* renamed from: b  reason: collision with root package name */
    private final r0 f15225b;

    /* renamed from: c  reason: collision with root package name */
    private final ISwiggyNetworkWrapper f15226c;

    /* renamed from: d  reason: collision with root package name */
    private final c f15227d;

    /* renamed from: e  reason: collision with root package name */
    public f f15228e;

    /* renamed from: f  reason: collision with root package name */
    public ir.b f15229f;

    /* renamed from: g  reason: collision with root package name */
    private eo0.b f15230g;

    /* renamed from: h  reason: collision with root package name */
    private final ArrayList<s> f15231h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private final ArrayList<e0> f15232i = new ArrayList<>();
    private boolean j;
    private boolean k;

    /* renamed from: l  reason: collision with root package name */
    private final bp0.f f15233l;

    /* compiled from: ServiceLineProvider.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: ServiceLineProvider.kt */
    public interface b {
        void a(ServiceLineProvider serviceLineProvider);

        void b(ServiceLineProvider serviceLineProvider);
    }

    public ServiceLineProvider(boolean z11, l<? super ServiceLineProvider, k> lVar, r0 r0Var, ISwiggyNetworkWrapper iSwiggyNetworkWrapper, c cVar) {
        p.j(lVar, "selectedListener");
        p.j(r0Var, "resourceService");
        p.j(iSwiggyNetworkWrapper, "networkWrapper");
        p.j(cVar, "accountFragmentService");
        this.f15224a = z11;
        this.f15225b = r0Var;
        this.f15226c = iSwiggyNetworkWrapper;
        this.f15227d = cVar;
        this.f15233l = b.b(new ServiceLineProvider$pastOrdersServiceLineViewModel$2(this, lVar));
    }

    public static /* synthetic */ void v(ServiceLineProvider serviceLineProvider, b bVar, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            serviceLineProvider.u(bVar, z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadMore");
    }

    public final void A(boolean z11) {
        this.j = z11;
    }

    /* access modifiers changed from: protected */
    public final c a() {
        return this.f15227d;
    }

    public final List<s> b() {
        return this.f15231h;
    }

    /* access modifiers changed from: protected */
    public final ArrayList<s> c() {
        return this.f15231h;
    }

    /* access modifiers changed from: protected */
    public final ArrayList<e0> d() {
        return this.f15232i;
    }

    public abstract String e();

    public final ir.b f() {
        ir.b bVar = this.f15229f;
        if (bVar != null) {
            return bVar;
        }
        p.B("eventHandler");
        return null;
    }

    public final f g() {
        f fVar = this.f15228e;
        if (fVar != null) {
            return fVar;
        }
        p.B("injectService");
        return null;
    }

    public final int h() {
        return this.f15231h.size() + this.f15232i.size();
    }

    public final boolean i() {
        return this.k;
    }

    /* access modifiers changed from: protected */
    public final ISwiggyNetworkWrapper j() {
        return this.f15226c;
    }

    public final d0 k() {
        return (d0) this.f15233l.getValue();
    }

    public final List<e0> l() {
        return this.f15232i;
    }

    /* access modifiers changed from: protected */
    public final r0 m() {
        return this.f15225b;
    }

    public abstract String n();

    public final boolean o() {
        return this.j;
    }

    public abstract String p();

    public final int q() {
        return this.f15231h.size() + this.f15232i.size();
    }

    public abstract Boolean r();

    /* access modifiers changed from: protected */
    public final boolean s() {
        return this.f15224a;
    }

    public final void t(b bVar) {
        p.j(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        x();
        this.f15231h.clear();
        this.f15232i.clear();
        u(bVar, true);
    }

    public final void u(b bVar, boolean z11) {
        p.j(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f15230g = w(bVar);
        if (!z11) {
            f().j(f().l("account", "click-view-more-orders", String.valueOf(q()), String.valueOf(q() + 1), p.s("Category = ", p())));
        }
    }

    public abstract eo0.b w(b bVar);

    public abstract void x();

    public final void y(boolean z11) {
        this.k = z11;
    }

    public final void z(boolean z11) {
        k().o2(z11);
    }
}
