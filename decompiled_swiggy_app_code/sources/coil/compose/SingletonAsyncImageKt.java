package coil.compose;

import bp0.k;
import coil.compose.AsyncImagePainter;
import com.truecaller.android.sdk.TruecallerSdkScope;
import e0.g;
import e0.s0;
import i1.c;
import lp0.l;
import p0.a;
import p0.d;
import u0.e0;
import w0.f;

/* compiled from: SingletonAsyncImage.kt */
public final class SingletonAsyncImageKt {
    public static final void a(Object obj, String str, d dVar, l<? super AsyncImagePainter.b, ? extends AsyncImagePainter.b> lVar, l<? super AsyncImagePainter.b, k> lVar2, a aVar, c cVar, float f11, e0 e0Var, int i11, g gVar, int i12, int i13) {
        l<AsyncImagePainter.b, AsyncImagePainter.b> lVar3;
        int i14;
        int i15;
        int i16 = i13;
        g t = gVar.t(-1423044094);
        d.a aVar2 = (i16 & 4) != 0 ? d.f16037h0 : dVar;
        if ((i16 & 8) != 0) {
            i14 = i12 & -7169;
            lVar3 = AsyncImagePainter.v.a();
        } else {
            lVar3 = lVar;
            i14 = i12;
        }
        l<? super AsyncImagePainter.b, k> lVar4 = (i16 & 16) != 0 ? null : lVar2;
        a e11 = (i16 & 32) != 0 ? a.f16019a.e() : aVar;
        c e12 = (i16 & 64) != 0 ? c.f14864a.e() : cVar;
        float f12 = (i16 & 128) != 0 ? 1.0f : f11;
        e0 e0Var2 = (i16 & 256) != 0 ? null : e0Var;
        if ((i16 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0) {
            i14 &= -1879048193;
            i15 = f.f17432j0.b();
        } else {
            i15 = i11;
        }
        int i17 = i14 << 3;
        AsyncImageKt.a(obj, str, ImageLoaderProvidableCompositionLocal.c(n6.c.a(), t, 6), aVar2, lVar3, lVar4, e11, e12, f12, e0Var2, i15, t, (i14 & 112) | 520 | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (29360128 & i17) | (234881024 & i17) | (i17 & 1879048192), (i14 >> 27) & 14, 0);
        s0 v = t.v();
        if (v != null) {
            v.a(new SingletonAsyncImageKt$AsyncImage$2(obj, str, aVar2, lVar3, lVar4, e11, e12, f12, e0Var2, i15, i12, i13));
        }
    }
}
