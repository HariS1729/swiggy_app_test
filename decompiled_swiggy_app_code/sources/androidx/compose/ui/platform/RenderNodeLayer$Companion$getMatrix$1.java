package androidx.compose.ui.platform;

import android.graphics.Matrix;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: RenderNodeLayer.android.kt */
final class RenderNodeLayer$Companion$getMatrix$1 extends Lambda implements p<h0, Matrix, k> {

    /* renamed from: a  reason: collision with root package name */
    public static final RenderNodeLayer$Companion$getMatrix$1 f7173a = new RenderNodeLayer$Companion$getMatrix$1();

    RenderNodeLayer$Companion$getMatrix$1() {
        super(2);
    }

    public final void a(h0 h0Var, Matrix matrix) {
        kotlin.jvm.internal.p.j(h0Var, "rn");
        kotlin.jvm.internal.p.j(matrix, "matrix");
        h0Var.w(matrix);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((h0) obj, (Matrix) obj2);
        return k.f22762a;
    }
}
