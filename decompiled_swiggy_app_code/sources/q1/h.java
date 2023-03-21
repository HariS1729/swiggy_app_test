package q1;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.p;

/* compiled from: PaintExtensions.kt */
public final class h {
    private static final void a(Rect rect, Rect rect2) {
        rect.right += rect2.width();
        rect.top = Math.min(rect.top, rect2.top);
        rect.bottom = Math.max(rect.bottom, rect2.bottom);
    }

    private static final void b(Paint paint, CharSequence charSequence, int i11, int i12, Rect rect) {
        if (Build.VERSION.SDK_INT >= 29) {
            g.a(paint, charSequence, i11, i12, rect);
        } else {
            paint.getTextBounds(charSequence.toString(), i11, i12, rect);
        }
    }

    public static final Rect c(TextPaint textPaint, CharSequence charSequence, int i11, int i12) {
        p.j(textPaint, "<this>");
        p.j(charSequence, "text");
        Class<MetricAffectingSpan> cls = MetricAffectingSpan.class;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (i.b(spanned, cls, i11, i12)) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i11 < i12) {
                    int nextSpanTransition = spanned.nextSpanTransition(i11, i12, cls);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i11, nextSpanTransition, cls);
                    textPaint2.set(textPaint);
                    p.i(metricAffectingSpanArr, "spans");
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    b(textPaint2, charSequence, i11, nextSpanTransition, rect2);
                    a(rect, rect2);
                    i11 = nextSpanTransition;
                }
                return rect;
            }
        }
        return d(textPaint, charSequence, i11, i12);
    }

    public static final Rect d(Paint paint, CharSequence charSequence, int i11, int i12) {
        p.j(paint, "<this>");
        p.j(charSequence, "text");
        Rect rect = new Rect();
        b(paint, charSequence, i11, i12, rect);
        return rect;
    }
}
