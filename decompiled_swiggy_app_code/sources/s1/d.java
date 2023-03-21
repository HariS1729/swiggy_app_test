package s1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.p;

/* compiled from: LetterSpacingSpanPx.kt */
public final class d extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    private final float f16600a;

    public d(float f11) {
        this.f16600a = f11;
    }

    private final void a(TextPaint textPaint) {
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (!(textSize == 0.0f)) {
            textPaint.setLetterSpacing(this.f16600a / textSize);
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        p.j(textPaint, "textPaint");
        a(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        p.j(textPaint, "textPaint");
        a(textPaint);
    }
}
