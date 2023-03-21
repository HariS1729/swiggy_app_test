package coil.request;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import coil.ImageLoader;
import coil.util.Lifecycles;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.i;
import wp0.k1;
import x6.g;
import z6.b;

/* compiled from: RequestDelegate.kt */
public final class ViewTargetRequestDelegate extends RequestDelegate {

    /* renamed from: a  reason: collision with root package name */
    private final ImageLoader f13665a;

    /* renamed from: b  reason: collision with root package name */
    private final g f13666b;

    /* renamed from: c  reason: collision with root package name */
    private final b<?> f13667c;

    /* renamed from: d  reason: collision with root package name */
    private final Lifecycle f13668d;

    /* renamed from: e  reason: collision with root package name */
    private final k1 f13669e;

    public ViewTargetRequestDelegate(ImageLoader imageLoader, g gVar, b<?> bVar, Lifecycle lifecycle, k1 k1Var) {
        super((i) null);
        this.f13665a = imageLoader;
        this.f13666b = gVar;
        this.f13667c = bVar;
        this.f13668d = lifecycle;
        this.f13669e = k1Var;
    }

    public void a() {
        if (!this.f13667c.c().isAttachedToWindow()) {
            c7.i.l(this.f13667c.c()).c(this);
            throw new CancellationException("'ViewTarget.view' must be attached to a window.");
        }
    }

    public void e() {
        this.f13668d.a(this);
        b<?> bVar = this.f13667c;
        if (bVar instanceof q) {
            Lifecycles.b(this.f13668d, (q) bVar);
        }
        c7.i.l(this.f13667c.c()).c(this);
    }

    public void f() {
        k1.a.a(this.f13669e, (CancellationException) null, 1, (Object) null);
        b<?> bVar = this.f13667c;
        if (bVar instanceof q) {
            this.f13668d.c((q) bVar);
        }
        this.f13668d.c(this);
    }

    public final void g() {
        this.f13665a.a(this.f13666b);
    }

    public void onDestroy(r rVar) {
        c7.i.l(this.f13667c.c()).a();
    }
}
