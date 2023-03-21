package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.p;
import u0.g;

/* compiled from: AndroidComposeView.android.kt */
final class d0 implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f7295a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    private final int[] f7296b = new int[2];

    public void a(View view, float[] fArr) {
        p.j(view, "view");
        p.j(fArr, "matrix");
        this.f7295a.reset();
        view.transformMatrixToGlobal(this.f7295a);
        ViewParent viewParent = view.getParent();
        while (viewParent instanceof View) {
            view = (View) viewParent;
            viewParent = view.getParent();
        }
        view.getLocationOnScreen(this.f7296b);
        int[] iArr = this.f7296b;
        int i11 = iArr[0];
        int i12 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.f7296b;
        this.f7295a.postTranslate((float) (iArr2[0] - i11), (float) (iArr2[1] - i12));
        g.b(fArr, this.f7295a);
    }
}
