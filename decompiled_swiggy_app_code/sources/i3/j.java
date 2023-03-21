package i3;

import android.view.Choreographer;
import android.view.View;
import androidx.metrics.performance.R;
import i3.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.p;

/* compiled from: JankStatsApi16Impl.kt */
public class j extends p {

    /* renamed from: d  reason: collision with root package name */
    private final WeakReference<View> f15027d;

    /* renamed from: e  reason: collision with root package name */
    private final Choreographer f15028e;

    /* renamed from: f  reason: collision with root package name */
    private final r.b f15029f;

    /* renamed from: g  reason: collision with root package name */
    private final a f15030g;

    /* compiled from: JankStatsApi16Impl.kt */
    public static final class a extends q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f15031a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f15032b;

        a(i iVar, j jVar) {
            this.f15031a = iVar;
            this.f15032b = jVar;
        }

        public void a(long j, long j11, long j12) {
            i iVar = this.f15031a;
            iVar.d(this.f15032b.g(j, j11, (long) (((float) j12) * iVar.b())));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(i iVar, View view) {
        super(iVar);
        p.j(iVar, "jankStats");
        p.j(view, "view");
        this.f15027d = new WeakReference<>(view);
        Choreographer instance = Choreographer.getInstance();
        p.i(instance, "getInstance()");
        this.f15028e = instance;
        this.f15029f = r.f15040c.b(view);
        this.f15030g = new a(iVar, this);
    }

    private final List<q> j(View view) {
        int i11 = R.id.metricsDelegator;
        c cVar = (c) view.getTag(i11);
        if (cVar == null) {
            cVar = d(view, this.f15028e, new ArrayList());
            view.getViewTreeObserver().addOnPreDrawListener(cVar);
            view.setTag(i11, cVar);
        }
        return cVar.c();
    }

    private final void k(View view, q qVar) {
        List<q> list;
        int i11 = R.id.metricsDelegator;
        view.setTag(i11, (Object) null);
        c cVar = (c) view.getTag(i11);
        if (cVar == null) {
            list = null;
        } else {
            list = cVar.c();
        }
        if (list != null) {
            list.remove(qVar);
        }
        boolean z11 = false;
        if (list != null && list.size() == 0) {
            z11 = true;
        }
        if (z11) {
            view.getViewTreeObserver().removeOnPreDrawListener(cVar);
            view.setTag(i11, (Object) null);
        }
    }

    public void c(boolean z11) {
        View view = (View) this.f15027d.get();
        if (view != null) {
            if (z11) {
                j(view).add(this.f15030g);
            } else {
                k(view, this.f15030g);
            }
        }
    }

    public c d(View view, Choreographer choreographer, List<q> list) {
        p.j(view, "view");
        p.j(choreographer, "choreographer");
        p.j(list, "delegates");
        return new c(view, choreographer, list);
    }

    public final WeakReference<View> e() {
        return this.f15027d;
    }

    public final long f(View view) {
        return c.f15008e.b(view);
    }

    public e g(long j, long j11, long j12) {
        r a11 = this.f15029f.a();
        List<s> c11 = a11 == null ? null : a11.c(j, j + j11);
        if (c11 == null) {
            c11 = k.j();
        }
        return new e(j, j11, j11 > j12, c11);
    }

    public final long h() {
        Object obj = c.f15008e.a().get(this.f15028e);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) obj).longValue();
    }

    public final r.b i() {
        return this.f15029f;
    }
}
