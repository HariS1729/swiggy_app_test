package f1;

import android.view.MotionEvent;
import bp0.k;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import kotlin.jvm.internal.p;
import lp0.l;
import t0.f;

/* compiled from: PointerInteropUtils.android.kt */
public final class e0 {
    public static final void a(long j, l<? super MotionEvent, k> lVar) {
        p.j(lVar, RenderingDetails.TYPE_BLOCK);
        MotionEvent obtain = MotionEvent.obtain(j, j, 3, 0.0f, 0.0f, 0);
        obtain.setSource(0);
        p.i(obtain, "motionEvent");
        lVar.invoke(obtain);
        obtain.recycle();
    }

    public static final void b(n nVar, long j, l<? super MotionEvent, k> lVar) {
        p.j(nVar, "$this$toCancelMotionEventScope");
        p.j(lVar, RenderingDetails.TYPE_BLOCK);
        d(nVar, j, lVar, true);
    }

    public static final void c(n nVar, long j, l<? super MotionEvent, k> lVar) {
        p.j(nVar, "$this$toMotionEventScope");
        p.j(lVar, RenderingDetails.TYPE_BLOCK);
        d(nVar, j, lVar, false);
    }

    private static final void d(n nVar, long j, l<? super MotionEvent, k> lVar, boolean z11) {
        MotionEvent e11 = nVar.e();
        if (e11 != null) {
            int action = e11.getAction();
            if (z11) {
                e11.setAction(3);
            }
            e11.offsetLocation(-f.m(j), -f.n(j));
            lVar.invoke(e11);
            e11.offsetLocation(f.m(j), f.n(j));
            e11.setAction(action);
            return;
        }
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
    }
}
