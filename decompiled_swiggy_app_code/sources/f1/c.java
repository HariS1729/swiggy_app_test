package f1;

import androidx.compose.ui.input.pointer.PointerEventPass;

/* compiled from: SuspendingPointerInputFilter.kt */
public final /* synthetic */ class c {
    public static /* synthetic */ Object a(d dVar, PointerEventPass pointerEventPass, fp0.c cVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                pointerEventPass = PointerEventPass.Main;
            }
            return dVar.r0(pointerEventPass, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
    }
}
