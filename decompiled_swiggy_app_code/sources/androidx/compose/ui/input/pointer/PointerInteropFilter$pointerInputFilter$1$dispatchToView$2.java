package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: PointerInteropFilter.android.kt */
final class PointerInteropFilter$pointerInputFilter$1$dispatchToView$2 extends Lambda implements l<MotionEvent, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PointerInteropFilter f6654a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PointerInteropFilter$pointerInputFilter$1$dispatchToView$2(PointerInteropFilter pointerInteropFilter) {
        super(1);
        this.f6654a = pointerInteropFilter;
    }

    public final void a(MotionEvent motionEvent) {
        p.j(motionEvent, "motionEvent");
        this.f6654a.c().invoke(motionEvent);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((MotionEvent) obj);
        return k.f22762a;
    }
}
