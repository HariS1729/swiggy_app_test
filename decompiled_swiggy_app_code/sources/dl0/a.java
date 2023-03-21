package dl0;

import androidx.databinding.ObservableField;
import bp0.k;
import fp0.c;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.p;
import lp0.l;
import us.e;
import vs.b;
import wp0.j0;
import wp0.k1;

/* compiled from: ActionDelegate.kt */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ b f20104a;

    /* renamed from: b  reason: collision with root package name */
    public l<? super Integer, k> f20105b;

    /* renamed from: c  reason: collision with root package name */
    public lp0.a<k> f20106c;

    /* renamed from: d  reason: collision with root package name */
    public l<? super Boolean, k> f20107d;

    public a(b bVar) {
        p.j(bVar, "sharedState");
        this.f20104a = bVar;
    }

    public e F0() {
        return this.f20104a.F0();
    }

    public k1 G(lp0.p<? super j0, ? super c<? super k>, ? extends Object> pVar) {
        p.j(pVar, RenderingDetails.TYPE_BLOCK);
        return this.f20104a.G(pVar);
    }

    public j0 J0() {
        return this.f20104a.J0();
    }

    public ObservableField<ct.b> U() {
        return this.f20104a.U();
    }

    public k1 V(lp0.p<? super j0, ? super c<? super k>, ? extends Object> pVar, long j, TimeUnit timeUnit) {
        p.j(pVar, RenderingDetails.TYPE_BLOCK);
        p.j(timeUnit, "timeUnit");
        return this.f20104a.V(pVar, j, timeUnit);
    }

    public qt.a X() {
        return this.f20104a.X();
    }

    public final l<Boolean, k> a() {
        l<? super Boolean, k> lVar = this.f20107d;
        if (lVar != null) {
            return lVar;
        }
        p.B("forceRefresh");
        return null;
    }

    public k1 a1(lp0.p<? super j0, ? super c<? super k>, ? extends Object> pVar) {
        p.j(pVar, RenderingDetails.TYPE_BLOCK);
        return this.f20104a.a1(pVar);
    }

    public final lp0.a<k> b() {
        lp0.a<k> aVar = this.f20106c;
        if (aVar != null) {
            return aVar;
        }
        p.B("retryAction");
        return null;
    }

    public final l<Integer, k> c() {
        l<? super Integer, k> lVar = this.f20105b;
        if (lVar != null) {
            return lVar;
        }
        p.B("shareLocationProgressBarVisibilityAction");
        return null;
    }

    public final void d(l<? super Boolean, k> lVar) {
        p.j(lVar, "<set-?>");
        this.f20107d = lVar;
    }

    public final void e(lp0.a<k> aVar) {
        p.j(aVar, "<set-?>");
        this.f20106c = aVar;
    }

    public final void f(l<? super Integer, k> lVar) {
        p.j(lVar, "<set-?>");
        this.f20105b = lVar;
    }

    public void j(long j, lp0.p<? super j0, ? super c<? super k>, ? extends Object> pVar) {
        p.j(pVar, RenderingDetails.TYPE_BLOCK);
        this.f20104a.j(j, pVar);
    }

    public eo0.a q() {
        return this.f20104a.q();
    }

    public k1 z0(lp0.p<? super j0, ? super c<? super k>, ? extends Object> pVar) {
        p.j(pVar, RenderingDetails.TYPE_BLOCK);
        return this.f20104a.z0(pVar);
    }
}
