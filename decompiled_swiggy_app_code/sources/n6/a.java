package n6;

import android.graphics.drawable.Drawable;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.InspectionModeKt;
import b7.d;
import bp0.k;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.compose.UtilsKt;
import com.truecaller.android.sdk.TruecallerSdkScope;
import e0.g;
import i1.c;
import kotlin.KotlinNothingValueException;
import t0.l;
import u0.l0;
import w0.f;
import x6.g;
import y6.c;

/* compiled from: AsyncImagePainter.kt */
public final class a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C0153a f15887a = new C0153a();

    /* renamed from: n6.a$a  reason: collision with other inner class name */
    /* compiled from: AsyncImagePainter.kt */
    public static final class C0153a implements d {
        C0153a() {
        }

        public Drawable a() {
            return null;
        }

        public void e(Drawable drawable) {
            d.a.c(this, drawable);
        }

        public void f(Drawable drawable) {
            d.a.b(this, drawable);
        }

        public void g(Drawable drawable) {
            d.a.a(this, drawable);
        }
    }

    private static final boolean c(long j) {
        return ((double) l.i(j)) >= 0.5d && ((double) l.g(j)) >= 0.5d;
    }

    public static final AsyncImagePainter d(Object obj, ImageLoader imageLoader, Painter painter, Painter painter2, Painter painter3, lp0.l<? super AsyncImagePainter.b.c, k> lVar, lp0.l<? super AsyncImagePainter.b.d, k> lVar2, lp0.l<? super AsyncImagePainter.b.C0111b, k> lVar3, c cVar, int i11, g gVar, int i12, int i13) {
        int i14 = i13;
        gVar.E(294033699);
        lp0.l<? super AsyncImagePainter.b.C0111b, k> lVar4 = null;
        Painter painter4 = (i14 & 4) != 0 ? null : painter;
        Painter painter5 = (i14 & 8) != 0 ? null : painter2;
        Painter painter6 = (i14 & 16) != 0 ? painter5 : painter3;
        lp0.l<? super AsyncImagePainter.b.c, k> lVar5 = (i14 & 32) != 0 ? null : lVar;
        lp0.l<? super AsyncImagePainter.b.d, k> lVar6 = (i14 & 64) != 0 ? null : lVar2;
        if ((i14 & 128) == 0) {
            lVar4 = lVar3;
        }
        c e11 = (i14 & 256) != 0 ? c.f14864a.e() : cVar;
        int b11 = (i14 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? f.f17432j0.b() : i11;
        lp0.l<AsyncImagePainter.b, AsyncImagePainter.b> h11 = UtilsKt.h(painter4, painter5, painter6);
        lp0.l<AsyncImagePainter.b, k> d11 = UtilsKt.d(lVar5, lVar6, lVar4);
        int i15 = i12 >> 12;
        AsyncImagePainter e12 = e(obj, imageLoader, h11, d11, e11, b11, gVar, (57344 & i15) | 72 | (i15 & 458752), 0);
        gVar.P();
        return e12;
    }

    public static final AsyncImagePainter e(Object obj, ImageLoader imageLoader, lp0.l<? super AsyncImagePainter.b, ? extends AsyncImagePainter.b> lVar, lp0.l<? super AsyncImagePainter.b, k> lVar2, c cVar, int i11, g gVar, int i12, int i13) {
        gVar.E(294036008);
        lp0.l<AsyncImagePainter.b, AsyncImagePainter.b> lVar3 = lVar;
        if ((i13 & 4) != 0) {
            lVar3 = AsyncImagePainter.v.a();
        }
        if ((i13 & 8) != 0) {
            lVar2 = null;
        }
        if ((i13 & 16) != 0) {
            cVar = c.f14864a.e();
        }
        if ((i13 & 32) != 0) {
            i11 = f.f17432j0.b();
        }
        x6.g e11 = UtilsKt.e(obj, gVar, 8);
        i(e11);
        gVar.E(-3687241);
        Object F = gVar.F();
        if (F == g.f14172a.a()) {
            F = new AsyncImagePainter(e11, imageLoader);
            gVar.y(F);
        }
        gVar.P();
        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) F;
        asyncImagePainter.M(lVar3);
        asyncImagePainter.H(lVar2);
        asyncImagePainter.E(cVar);
        asyncImagePainter.F(i11);
        asyncImagePainter.J(((Boolean) gVar.z(InspectionModeKt.a())).booleanValue());
        asyncImagePainter.G(imageLoader);
        asyncImagePainter.K(e11);
        asyncImagePainter.b();
        gVar.P();
        return asyncImagePainter;
    }

    /* access modifiers changed from: private */
    public static final y6.g f(long j) {
        boolean z11 = true;
        if (j == l.f16682b.a()) {
            return y6.g.f18031d;
        }
        if (!c(j)) {
            return null;
        }
        float i11 = l.i(j);
        y6.c a11 = !Float.isInfinite(i11) && !Float.isNaN(i11) ? y6.a.a(c.c(l.i(j))) : c.b.f18025a;
        float g11 = l.g(j);
        if (Float.isInfinite(g11) || Float.isNaN(g11)) {
            z11 = false;
        }
        return new y6.g(a11, z11 ? y6.a.a(c.c(l.g(j))) : c.b.f18025a);
    }

    private static final Void g(String str, String str2) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + str2);
    }

    static /* synthetic */ Void h(String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "If you wish to display this " + str + ", use androidx.compose.foundation.Image.";
        }
        return g(str, str2);
    }

    private static final void i(x6.g gVar) {
        Object m11 = gVar.m();
        if (m11 instanceof g.a) {
            g("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
            throw new KotlinNothingValueException();
        } else if (m11 instanceof l0) {
            h("ImageBitmap", (String) null, 2, (Object) null);
            throw new KotlinNothingValueException();
        } else if (m11 instanceof y0.c) {
            h("ImageVector", (String) null, 2, (Object) null);
            throw new KotlinNothingValueException();
        } else if (!(m11 instanceof Painter)) {
            if (!(gVar.M() == null)) {
                throw new IllegalArgumentException("request.target must be null.".toString());
            }
        } else {
            h("Painter", (String) null, 2, (Object) null);
            throw new KotlinNothingValueException();
        }
    }
}
