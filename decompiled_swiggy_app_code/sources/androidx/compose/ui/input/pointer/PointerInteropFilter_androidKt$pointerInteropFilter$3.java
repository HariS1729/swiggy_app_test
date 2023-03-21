package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: PointerInteropFilter.android.kt */
final class PointerInteropFilter_androidKt$pointerInteropFilter$3 extends Lambda implements l<MotionEvent, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AndroidViewHolder f6658a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PointerInteropFilter_androidKt$pointerInteropFilter$3(AndroidViewHolder androidViewHolder) {
        super(1);
        this.f6658a = androidViewHolder;
    }

    /* renamed from: a */
    public final Boolean invoke(MotionEvent motionEvent) {
        boolean z11;
        p.j(motionEvent, "motionEvent");
        switch (motionEvent.getActionMasked()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                z11 = this.f6658a.dispatchTouchEvent(motionEvent);
                break;
            default:
                z11 = this.f6658a.dispatchGenericMotionEvent(motionEvent);
                break;
        }
        return Boolean.valueOf(z11);
    }
}
