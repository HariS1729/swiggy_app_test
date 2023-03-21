package x6;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import c7.a;
import c7.f;
import c7.h;
import c7.i;
import c7.q;
import c7.s;
import coil.ImageLoader;
import coil.request.BaseRequestDelegate;
import coil.request.CachePolicy;
import coil.request.NullRequestDataException;
import coil.request.RequestDelegate;
import coil.request.ViewTargetRequestDelegate;
import coil.size.Scale;
import kotlin.jvm.internal.p;
import wp0.k1;
import y6.c;
import y6.g;
import z6.b;

/* compiled from: RequestService.kt */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final ImageLoader f17834a;

    /* renamed from: b  reason: collision with root package name */
    private final s f17835b;

    /* renamed from: c  reason: collision with root package name */
    private final c7.m f17836c;

    public m(ImageLoader imageLoader, s sVar, q qVar) {
        this.f17834a = imageLoader;
        this.f17835b = sVar;
        this.f17836c = f.a(qVar);
    }

    private final boolean d(g gVar, g gVar2) {
        return c(gVar, gVar.j()) && this.f17836c.a(gVar2);
    }

    private final boolean e(g gVar) {
        return gVar.O().isEmpty() || ArraysKt___ArraysKt.G(i.o(), gVar.j());
    }

    public final boolean a(k kVar) {
        return !a.d(kVar.f()) || this.f17836c.b();
    }

    public final d b(g gVar, Throwable th2) {
        Drawable drawable;
        if (th2 instanceof NullRequestDataException) {
            drawable = gVar.u();
            if (drawable == null) {
                drawable = gVar.t();
            }
        } else {
            drawable = gVar.t();
        }
        return new d(drawable, gVar, th2);
    }

    public final boolean c(g gVar, Bitmap.Config config) {
        if (!a.d(config)) {
            return true;
        }
        if (!gVar.h()) {
            return false;
        }
        z6.a M = gVar.M();
        if (M instanceof b) {
            View c11 = ((b) M).c();
            if (c11.isAttachedToWindow() && !c11.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    public final k f(g gVar, g gVar2) {
        CachePolicy cachePolicy;
        Scale scale;
        Bitmap.Config j = e(gVar) && d(gVar, gVar2) ? gVar.j() : Bitmap.Config.ARGB_8888;
        if (this.f17835b.c()) {
            cachePolicy = gVar.D();
        } else {
            cachePolicy = CachePolicy.DISABLED;
        }
        CachePolicy cachePolicy2 = cachePolicy;
        boolean z11 = gVar.i() && gVar.O().isEmpty() && j != Bitmap.Config.ALPHA_8;
        c b11 = gVar2.b();
        c.b bVar = c.b.f18025a;
        if (p.e(b11, bVar) || p.e(gVar2.a(), bVar)) {
            scale = Scale.FIT;
        } else {
            scale = gVar.J();
        }
        return new k(gVar.l(), j, gVar.k(), gVar2, scale, h.a(gVar), z11, gVar.I(), gVar.r(), gVar.x(), gVar.L(), gVar.E(), gVar.C(), gVar.s(), cachePolicy2);
    }

    public final RequestDelegate g(g gVar, k1 k1Var) {
        Lifecycle z11 = gVar.z();
        z6.a M = gVar.M();
        if (!(M instanceof b)) {
            return new BaseRequestDelegate(z11, k1Var);
        }
        return new ViewTargetRequestDelegate(this.f17834a, gVar, (b) M, z11, k1Var);
    }
}
