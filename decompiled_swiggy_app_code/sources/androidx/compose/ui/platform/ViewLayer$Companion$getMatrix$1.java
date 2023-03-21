package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: ViewLayer.android.kt */
final class ViewLayer$Companion$getMatrix$1 extends Lambda implements p<View, Matrix, k> {

    /* renamed from: a  reason: collision with root package name */
    public static final ViewLayer$Companion$getMatrix$1 f7206a = new ViewLayer$Companion$getMatrix$1();

    ViewLayer$Companion$getMatrix$1() {
        super(2);
    }

    public final void a(View view, Matrix matrix) {
        kotlin.jvm.internal.p.j(view, "view");
        kotlin.jvm.internal.p.j(matrix, "matrix");
        matrix.set(view.getMatrix());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((View) obj, (Matrix) obj2);
        return k.f22762a;
    }
}
