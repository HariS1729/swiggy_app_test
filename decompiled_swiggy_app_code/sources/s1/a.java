package s1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.p;

/* compiled from: BaselineShiftSpan.kt */
public class a extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    private final float f16597a;

    public a(float f11) {
        this.f16597a = f11;
    }

    public void updateDrawState(TextPaint textPaint) {
        p.j(textPaint, "textPaint");
        textPaint.baselineShift += (int) ((float) Math.ceil((double) (textPaint.ascent() * this.f16597a)));
    }

    public void updateMeasureState(TextPaint textPaint) {
        p.j(textPaint, "textPaint");
        textPaint.baselineShift += (int) ((float) Math.ceil((double) (textPaint.ascent() * this.f16597a)));
    }
}
