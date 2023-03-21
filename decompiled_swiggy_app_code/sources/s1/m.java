package s1;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.p;

/* compiled from: TypefaceSpan.kt */
public final class m extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    private final Typeface f16628a;

    public m(Typeface typeface) {
        p.j(typeface, "typeface");
        this.f16628a = typeface;
    }

    private final void a(Paint paint) {
        paint.setTypeface(this.f16628a);
    }

    public void updateDrawState(TextPaint textPaint) {
        p.j(textPaint, "ds");
        a(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        p.j(textPaint, "paint");
        a(textPaint);
    }
}
