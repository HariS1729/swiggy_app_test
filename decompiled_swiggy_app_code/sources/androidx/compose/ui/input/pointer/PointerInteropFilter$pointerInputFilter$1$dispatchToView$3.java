package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: PointerInteropFilter.android.kt */
final class PointerInteropFilter$pointerInputFilter$1$dispatchToView$3 extends Lambda implements l<MotionEvent, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PointerInteropFilter$pointerInputFilter$1 f6655a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PointerInteropFilter f6656b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PointerInteropFilter$pointerInputFilter$1$dispatchToView$3(PointerInteropFilter$pointerInputFilter$1 pointerInteropFilter$pointerInputFilter$1, PointerInteropFilter pointerInteropFilter) {
        super(1);
        this.f6655a = pointerInteropFilter$pointerInputFilter$1;
        this.f6656b = pointerInteropFilter;
    }

    public final void a(MotionEvent motionEvent) {
        PointerInteropFilter.DispatchToViewState dispatchToViewState;
        p.j(motionEvent, "motionEvent");
        if (motionEvent.getActionMasked() == 0) {
            PointerInteropFilter$pointerInputFilter$1 pointerInteropFilter$pointerInputFilter$1 = this.f6655a;
            if (this.f6656b.c().invoke(motionEvent).booleanValue()) {
                dispatchToViewState = PointerInteropFilter.DispatchToViewState.Dispatching;
            } else {
                dispatchToViewState = PointerInteropFilter.DispatchToViewState.NotDispatching;
            }
            pointerInteropFilter$pointerInputFilter$1.f6652c = dispatchToViewState;
            return;
        }
        this.f6656b.c().invoke(motionEvent);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((MotionEvent) obj);
        return k.f22762a;
    }
}
