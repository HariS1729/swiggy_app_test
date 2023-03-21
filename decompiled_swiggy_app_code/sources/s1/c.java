package s1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.p;

/* compiled from: LetterSpacingSpanEm.kt */
public final class c extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    private final float f16599a;

    public c(float f11) {
        this.f16599a = f11;
    }

    public void updateDrawState(TextPaint textPaint) {
        p.j(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f16599a);
    }

    public void updateMeasureState(TextPaint textPaint) {
        p.j(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f16599a);
    }
}
