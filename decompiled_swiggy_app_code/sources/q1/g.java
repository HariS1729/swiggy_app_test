package q1;

import android.graphics.Paint;
import android.graphics.Rect;
import kotlin.jvm.internal.p;

/* compiled from: PaintExtensions.kt */
final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f16326a = new g();

    private g() {
    }

    public static final void a(Paint paint, CharSequence charSequence, int i11, int i12, Rect rect) {
        p.j(paint, "paint");
        p.j(charSequence, "text");
        p.j(rect, "rect");
        paint.getTextBounds(charSequence, i11, i12, rect);
    }
}
