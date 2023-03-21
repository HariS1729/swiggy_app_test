package n6;

import androidx.compose.ui.graphics.painter.Painter;
import bp0.k;
import coil.compose.AsyncImagePainter;
import coil.compose.ImageLoaderProvidableCompositionLocal;
import e0.g;
import i1.c;
import lp0.l;
import w0.f;

/* compiled from: SingletonAsyncImagePainter.kt */
public final class d {
    public static final AsyncImagePainter a(Object obj, l<? super AsyncImagePainter.b, ? extends AsyncImagePainter.b> lVar, l<? super AsyncImagePainter.b, k> lVar2, c cVar, int i11, g gVar, int i12, int i13) {
        g gVar2 = gVar;
        gVar.E(294034054);
        int i14 = i12 << 3;
        AsyncImagePainter e11 = a.e(obj, ImageLoaderProvidableCompositionLocal.c(c.a(), gVar, 6), (i13 & 2) != 0 ? AsyncImagePainter.v.a() : lVar, (i13 & 4) != 0 ? null : lVar2, (i13 & 8) != 0 ? c.f14864a.e() : cVar, (i13 & 16) != 0 ? f.f17432j0.b() : i11, gVar, (i14 & 896) | 72 | (i14 & 7168) | (57344 & i14) | (i14 & 458752), 0);
        gVar.P();
        return e11;
    }

    public static final AsyncImagePainter b(Object obj, Painter painter, Painter painter2, Painter painter3, l<? super AsyncImagePainter.b.c, k> lVar, l<? super AsyncImagePainter.b.d, k> lVar2, l<? super AsyncImagePainter.b.C0111b, k> lVar3, c cVar, int i11, g gVar, int i12, int i13) {
        g gVar2 = gVar;
        int i14 = i13;
        gVar2.E(294031808);
        Painter painter4 = (i14 & 2) != 0 ? null : painter;
        Painter painter5 = (i14 & 4) != 0 ? null : painter2;
        int i15 = i12 << 3;
        AsyncImagePainter d11 = a.d(obj, ImageLoaderProvidableCompositionLocal.c(c.a(), gVar2, 6), painter4, painter5, (i14 & 8) != 0 ? painter5 : painter3, (i14 & 16) != 0 ? null : lVar, (i14 & 32) != 0 ? null : lVar2, (i14 & 64) != 0 ? null : lVar3, (i14 & 128) != 0 ? c.f14864a.e() : cVar, (i14 & 256) != 0 ? f.f17432j0.b() : i11, gVar, 37448 | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | (234881024 & i15) | (1879048192 & i15), 0);
        gVar.P();
        return d11;
    }
}
