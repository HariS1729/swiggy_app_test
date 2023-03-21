package coil.compose;

import android.content.Context;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bp0.k;
import coil.compose.AsyncImagePainter;
import coil.size.Scale;
import d2.b;
import d2.q;
import i1.c;
import kotlin.jvm.internal.p;
import lp0.l;
import x6.g;

/* compiled from: Utils.kt */
public final class UtilsKt {

    /* renamed from: a  reason: collision with root package name */
    private static final long f13489a = b.f13990b.c(0, 0);

    public static final float a(long j, float f11) {
        return l.l(f11, (float) b.o(j), (float) b.m(j));
    }

    public static final float b(long j, float f11) {
        return l.l(f11, (float) b.p(j), (float) b.n(j));
    }

    public static final long c() {
        return f13489a;
    }

    public static final l<AsyncImagePainter.b, k> d(l<? super AsyncImagePainter.b.c, k> lVar, l<? super AsyncImagePainter.b.d, k> lVar2, l<? super AsyncImagePainter.b.C0111b, k> lVar3) {
        if (lVar == null && lVar2 == null && lVar3 == null) {
            return null;
        }
        return new UtilsKt$onStateOf$1(lVar, lVar2, lVar3);
    }

    public static final g e(Object obj, e0.g gVar, int i11) {
        if (obj instanceof g) {
            return (g) obj;
        }
        return new g.a((Context) gVar.z(AndroidCompositionLocals_androidKt.g())).d(obj).a();
    }

    public static final long f(long j) {
        return q.a(c.c(t0.l.i(j)), c.c(t0.l.g(j)));
    }

    public static final Scale g(c cVar) {
        c.a aVar = c.f14864a;
        if (p.e(cVar, aVar.e()) ? true : p.e(cVar, aVar.f())) {
            return Scale.FIT;
        }
        return Scale.FILL;
    }

    public static final l<AsyncImagePainter.b, AsyncImagePainter.b> h(Painter painter, Painter painter2, Painter painter3) {
        if (painter == null && painter2 == null && painter3 == null) {
            return AsyncImagePainter.v.a();
        }
        return new UtilsKt$transformOf$1(painter, painter3, painter2);
    }
}
