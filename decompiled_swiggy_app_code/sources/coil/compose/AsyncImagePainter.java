package coil.compose;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.graphics.painter.Painter;
import bp0.k;
import coil.ImageLoader;
import coil.size.Precision;
import com.google.accompanist.drawablepainter.DrawablePainter;
import e0.a1;
import e0.h0;
import e0.r0;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.s;
import lp0.l;
import u0.e0;
import u0.f0;
import w0.f;
import wp0.e2;
import wp0.j0;
import wp0.k0;
import wp0.k1;
import wp0.u0;
import x6.d;
import x6.g;
import x6.h;
import x6.n;

/* compiled from: AsyncImagePainter.kt */
public final class AsyncImagePainter extends Painter implements r0 {
    public static final a v = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public static final l<b, b> f13428w = AsyncImagePainter$Companion$DefaultTransform$1.f13444a;

    /* renamed from: g  reason: collision with root package name */
    private j0 f13429g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final kotlinx.coroutines.flow.i<t0.l> f13430h = s.a(t0.l.c(t0.l.f16682b.b()));

    /* renamed from: i  reason: collision with root package name */
    private final h0 f13431i = j.e((Object) null, (a1) null, 2, (Object) null);
    private final h0 j = j.e(Float.valueOf(1.0f), (a1) null, 2, (Object) null);
    private final h0 k = j.e((Object) null, (a1) null, 2, (Object) null);

    /* renamed from: l  reason: collision with root package name */
    private b f13432l;

    /* renamed from: m  reason: collision with root package name */
    private Painter f13433m;
    private l<? super b, ? extends b> n;

    /* renamed from: o  reason: collision with root package name */
    private l<? super b, k> f13434o;

    /* renamed from: p  reason: collision with root package name */
    private i1.c f13435p;
    private int q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f13436r;

    /* renamed from: s  reason: collision with root package name */
    private final h0 f13437s;
    private final h0 t;

    /* renamed from: u  reason: collision with root package name */
    private final h0 f13438u;

    /* compiled from: AsyncImagePainter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final l<b, b> a() {
            return AsyncImagePainter.f13428w;
        }
    }

    /* compiled from: AsyncImagePainter.kt */
    public static abstract class b {

        /* compiled from: AsyncImagePainter.kt */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f13445a = new a();

            private a() {
                super((i) null);
            }

            public Painter a() {
                return null;
            }
        }

        /* renamed from: coil.compose.AsyncImagePainter$b$b  reason: collision with other inner class name */
        /* compiled from: AsyncImagePainter.kt */
        public static final class C0111b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final Painter f13446a;

            /* renamed from: b  reason: collision with root package name */
            private final x6.d f13447b;

            public C0111b(Painter painter, x6.d dVar) {
                super((i) null);
                this.f13446a = painter;
                this.f13447b = dVar;
            }

            public static /* synthetic */ C0111b c(C0111b bVar, Painter painter, x6.d dVar, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    painter = bVar.a();
                }
                if ((i11 & 2) != 0) {
                    dVar = bVar.f13447b;
                }
                return bVar.b(painter, dVar);
            }

            public Painter a() {
                return this.f13446a;
            }

            public final C0111b b(Painter painter, x6.d dVar) {
                return new C0111b(painter, dVar);
            }

            public final x6.d d() {
                return this.f13447b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0111b)) {
                    return false;
                }
                C0111b bVar = (C0111b) obj;
                return p.e(a(), bVar.a()) && p.e(this.f13447b, bVar.f13447b);
            }

            public int hashCode() {
                return ((a() == null ? 0 : a().hashCode()) * 31) + this.f13447b.hashCode();
            }

            public String toString() {
                return "Error(painter=" + a() + ", result=" + this.f13447b + ')';
            }
        }

        /* compiled from: AsyncImagePainter.kt */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            private final Painter f13448a;

            public c(Painter painter) {
                super((i) null);
                this.f13448a = painter;
            }

            public Painter a() {
                return this.f13448a;
            }

            public final c b(Painter painter) {
                return new c(painter);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p.e(a(), ((c) obj).a());
            }

            public int hashCode() {
                if (a() == null) {
                    return 0;
                }
                return a().hashCode();
            }

            public String toString() {
                return "Loading(painter=" + a() + ')';
            }
        }

        /* compiled from: AsyncImagePainter.kt */
        public static final class d extends b {

            /* renamed from: a  reason: collision with root package name */
            private final Painter f13449a;

            /* renamed from: b  reason: collision with root package name */
            private final n f13450b;

            public d(Painter painter, n nVar) {
                super((i) null);
                this.f13449a = painter;
                this.f13450b = nVar;
            }

            public Painter a() {
                return this.f13449a;
            }

            public final n b() {
                return this.f13450b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return p.e(a(), dVar.a()) && p.e(this.f13450b, dVar.f13450b);
            }

            public int hashCode() {
                return (a().hashCode() * 31) + this.f13450b.hashCode();
            }

            public String toString() {
                return "Success(painter=" + a() + ", result=" + this.f13450b + ')';
            }
        }

        private b() {
        }

        public /* synthetic */ b(i iVar) {
            this();
        }

        public abstract Painter a();
    }

    /* compiled from: ImageRequest.kt */
    public static final class c implements z6.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AsyncImagePainter f13451a;

        public c(AsyncImagePainter asyncImagePainter) {
            this.f13451a = asyncImagePainter;
        }

        public void e(Drawable drawable) {
        }

        public void f(Drawable drawable) {
            this.f13451a.S(new b.c(drawable == null ? null : this.f13451a.P(drawable)));
        }

        public void g(Drawable drawable) {
        }
    }

    public AsyncImagePainter(g gVar, ImageLoader imageLoader) {
        b.a aVar = b.a.f13445a;
        this.f13432l = aVar;
        this.n = f13428w;
        this.f13435p = i1.c.f14864a.e();
        this.q = f.f17432j0.b();
        this.f13437s = j.e(aVar, (a1) null, 2, (Object) null);
        this.t = j.e(gVar, (a1) null, 2, (Object) null);
        this.f13438u = j.e(imageLoader, (a1) null, 2, (Object) null);
    }

    private final n6.b B(b bVar, b bVar2) {
        h hVar;
        if (bVar2 instanceof b.d) {
            hVar = ((b.d) bVar2).b();
        } else {
            if (bVar2 instanceof b.C0111b) {
                hVar = ((b.C0111b) bVar2).d();
            }
            return null;
        }
        b7.c a11 = hVar.b().P().a(n6.a.f15887a, hVar);
        if (a11 instanceof b7.a) {
            b7.a aVar = (b7.a) a11;
            return new n6.b(bVar instanceof b.c ? bVar.a() : null, bVar2.a(), this.f13435p, aVar.b(), !(hVar instanceof n) || !((n) hVar).d(), aVar.c());
        }
        return null;
    }

    private final void C(float f11) {
        this.j.setValue(Float.valueOf(f11));
    }

    private final void D(e0 e0Var) {
        this.k.setValue(e0Var);
    }

    private final void I(Painter painter) {
        this.f13431i.setValue(painter);
    }

    private final void L(b bVar) {
        this.f13437s.setValue(bVar);
    }

    private final void N(Painter painter) {
        this.f13433m = painter;
        I(painter);
    }

    private final void O(b bVar) {
        this.f13432l = bVar;
        L(bVar);
    }

    /* access modifiers changed from: private */
    public final Painter P(Drawable drawable) {
        Painter painter;
        if (drawable instanceof BitmapDrawable) {
            return x0.b.b(u0.f.c(((BitmapDrawable) drawable).getBitmap()), 0, 0, x(), 6, (Object) null);
        }
        if (drawable instanceof ColorDrawable) {
            painter = new x0.c(f0.b(((ColorDrawable) drawable).getColor()), (i) null);
        } else {
            painter = new DrawablePainter(drawable.mutate());
        }
        return painter;
    }

    /* access modifiers changed from: private */
    public final b Q(h hVar) {
        if (hVar instanceof n) {
            n nVar = (n) hVar;
            return new b.d(P(nVar.a()), nVar);
        } else if (hVar instanceof d) {
            Drawable a11 = hVar.a();
            return new b.C0111b(a11 == null ? null : P(a11), (d) hVar);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* access modifiers changed from: private */
    public final g R(g gVar) {
        g.a q11 = g.R(gVar, (Context) null, 1, (Object) null).q(new c(this));
        if (gVar.q().m() == null) {
            q11.p(new AsyncImagePainter$updateRequest$2$1(this));
        }
        if (gVar.q().l() == null) {
            q11.o(UtilsKt.g(w()));
        }
        if (gVar.q().k() != Precision.EXACT) {
            q11.i(Precision.INEXACT);
        }
        return q11.a();
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [androidx.compose.ui.graphics.painter.Painter] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S(coil.compose.AsyncImagePainter.b r4) {
        /*
            r3 = this;
            coil.compose.AsyncImagePainter$b r0 = r3.f13432l
            lp0.l<? super coil.compose.AsyncImagePainter$b, ? extends coil.compose.AsyncImagePainter$b> r1 = r3.n
            java.lang.Object r4 = r1.invoke(r4)
            coil.compose.AsyncImagePainter$b r4 = (coil.compose.AsyncImagePainter.b) r4
            r3.O(r4)
            n6.b r1 = r3.B(r0, r4)
            if (r1 != 0) goto L_0x0017
            androidx.compose.ui.graphics.painter.Painter r1 = r4.a()
        L_0x0017:
            r3.N(r1)
            wp0.j0 r1 = r3.f13429g
            if (r1 == 0) goto L_0x004c
            androidx.compose.ui.graphics.painter.Painter r1 = r0.a()
            androidx.compose.ui.graphics.painter.Painter r2 = r4.a()
            if (r1 == r2) goto L_0x004c
            androidx.compose.ui.graphics.painter.Painter r0 = r0.a()
            boolean r1 = r0 instanceof e0.r0
            r2 = 0
            if (r1 == 0) goto L_0x0034
            e0.r0 r0 = (e0.r0) r0
            goto L_0x0035
        L_0x0034:
            r0 = r2
        L_0x0035:
            if (r0 != 0) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            r0.g()
        L_0x003b:
            androidx.compose.ui.graphics.painter.Painter r0 = r4.a()
            boolean r1 = r0 instanceof e0.r0
            if (r1 == 0) goto L_0x0046
            r2 = r0
            e0.r0 r2 = (e0.r0) r2
        L_0x0046:
            if (r2 != 0) goto L_0x0049
            goto L_0x004c
        L_0x0049:
            r2.b()
        L_0x004c:
            lp0.l<? super coil.compose.AsyncImagePainter$b, bp0.k> r0 = r3.f13434o
            if (r0 != 0) goto L_0x0051
            goto L_0x0054
        L_0x0051:
            r0.invoke(r4)
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.compose.AsyncImagePainter.S(coil.compose.AsyncImagePainter$b):void");
    }

    private final void t() {
        j0 j0Var = this.f13429g;
        if (j0Var != null) {
            k0.d(j0Var, (CancellationException) null, 1, (Object) null);
        }
        this.f13429g = null;
    }

    private final float u() {
        return ((Number) this.j.getValue()).floatValue();
    }

    private final e0 v() {
        return (e0) this.k.getValue();
    }

    private final Painter z() {
        return (Painter) this.f13431i.getValue();
    }

    public final g A() {
        return (g) this.t.getValue();
    }

    public final void E(i1.c cVar) {
        this.f13435p = cVar;
    }

    public final void F(int i11) {
        this.q = i11;
    }

    public final void G(ImageLoader imageLoader) {
        this.f13438u.setValue(imageLoader);
    }

    public final void H(l<? super b, k> lVar) {
        this.f13434o = lVar;
    }

    public final void J(boolean z11) {
        this.f13436r = z11;
    }

    public final void K(g gVar) {
        this.t.setValue(gVar);
    }

    public final void M(l<? super b, ? extends b> lVar) {
        this.n = lVar;
    }

    /* access modifiers changed from: protected */
    public boolean a(float f11) {
        C(f11);
        return true;
    }

    public void b() {
        if (this.f13429g == null) {
            Painter painter = null;
            j0 a11 = k0.a(e2.b((k1) null, 1, (Object) null).plus(u0.c().N0()));
            this.f13429g = a11;
            Painter painter2 = this.f13433m;
            r0 r0Var = painter2 instanceof r0 ? (r0) painter2 : null;
            if (r0Var != null) {
                r0Var.b();
            }
            if (this.f13436r) {
                Drawable F = g.R(A(), (Context) null, 1, (Object) null).e(y().c()).a().F();
                if (F != null) {
                    painter = P(F);
                }
                S(new b.c(painter));
                return;
            }
            k1 unused = j.d(a11, (CoroutineContext) null, (CoroutineStart) null, new AsyncImagePainter$onRemembered$1(this, (fp0.c<? super AsyncImagePainter$onRemembered$1>) null), 3, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    public boolean c(e0 e0Var) {
        D(e0Var);
        return true;
    }

    public void f() {
        t();
        Painter painter = this.f13433m;
        r0 r0Var = painter instanceof r0 ? (r0) painter : null;
        if (r0Var != null) {
            r0Var.f();
        }
    }

    public void g() {
        t();
        Painter painter = this.f13433m;
        r0 r0Var = painter instanceof r0 ? (r0) painter : null;
        if (r0Var != null) {
            r0Var.g();
        }
    }

    public long k() {
        Painter z11 = z();
        t0.l c11 = z11 == null ? null : t0.l.c(z11.k());
        return c11 == null ? t0.l.f16682b.a() : c11.m();
    }

    /* access modifiers changed from: protected */
    public void m(f fVar) {
        this.f13430h.setValue(t0.l.c(fVar.d()));
        Painter z11 = z();
        if (z11 != null) {
            z11.j(fVar, fVar.d(), u(), v());
        }
    }

    public final i1.c w() {
        return this.f13435p;
    }

    public final int x() {
        return this.q;
    }

    public final ImageLoader y() {
        return (ImageLoader) this.f13438u.getValue();
    }
}
