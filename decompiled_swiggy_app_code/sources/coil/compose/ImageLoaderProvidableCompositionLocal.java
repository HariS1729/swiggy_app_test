package coil.compose;

import androidx.compose.runtime.CompositionLocalKt;
import coil.ImageLoader;
import e0.m0;
import kotlin.jvm.internal.i;

/* compiled from: LocalImageLoader.kt */
public final class ImageLoaderProvidableCompositionLocal {
    public static m0<ImageLoader> a(m0<ImageLoader> m0Var) {
        return m0Var;
    }

    public static /* synthetic */ m0 b(m0 m0Var, int i11, i iVar) {
        if ((i11 & 1) != 0) {
            m0Var = CompositionLocalKt.d(AnonymousClass1.f13478a);
        }
        return a(m0Var);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [e0.l, e0.m0<coil.ImageLoader>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final coil.ImageLoader c(e0.m0<coil.ImageLoader> r0, e0.g r1, int r2) {
        /*
            java.lang.Object r0 = r1.z(r0)
            coil.ImageLoader r0 = (coil.ImageLoader) r0
            if (r0 != 0) goto L_0x0016
            e0.m0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r1.z(r0)
            android.content.Context r0 = (android.content.Context) r0
            coil.ImageLoader r0 = m6.a.a(r0)
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.compose.ImageLoaderProvidableCompositionLocal.c(e0.m0, e0.g, int):coil.ImageLoader");
    }
}
