package androidx.compose.ui.input.pointer;

import androidx.compose.ui.viewinterop.AndroidViewHolder;
import f1.j0;
import kotlin.jvm.internal.p;
import p0.d;

/* compiled from: PointerInteropFilter.android.kt */
public final class PointerInteropFilter_androidKt {
    public static final d a(d dVar, AndroidViewHolder androidViewHolder) {
        p.j(dVar, "<this>");
        p.j(androidViewHolder, "view");
        PointerInteropFilter pointerInteropFilter = new PointerInteropFilter();
        pointerInteropFilter.e(new PointerInteropFilter_androidKt$pointerInteropFilter$3(androidViewHolder));
        j0 j0Var = new j0();
        pointerInteropFilter.f(j0Var);
        androidViewHolder.setOnRequestDisallowInterceptTouchEvent$ui_release(j0Var);
        return dVar.N(pointerInteropFilter);
    }
}
