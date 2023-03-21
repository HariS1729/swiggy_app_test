package u0;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.jvm.internal.p;
import t0.h;

/* compiled from: RectHelper.android.kt */
public final class b1 {
    public static final Rect a(h hVar) {
        p.j(hVar, "<this>");
        return new Rect((int) hVar.i(), (int) hVar.l(), (int) hVar.j(), (int) hVar.e());
    }

    public static final RectF b(h hVar) {
        p.j(hVar, "<this>");
        return new RectF(hVar.i(), hVar.l(), hVar.j(), hVar.e());
    }

    public static final h c(Rect rect) {
        p.j(rect, "<this>");
        return new h((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
    }
}
