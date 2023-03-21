package s1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.p;

/* compiled from: SkewXSpan.kt */
public class k extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    private final float f16625a;

    public k(float f11) {
        this.f16625a = f11;
    }

    public void updateDrawState(TextPaint textPaint) {
        p.j(textPaint, "textPaint");
        textPaint.setTextSkewX(this.f16625a + textPaint.getTextSkewX());
    }

    public void updateMeasureState(TextPaint textPaint) {
        p.j(textPaint, "textPaint");
        textPaint.setTextSkewX(this.f16625a + textPaint.getTextSkewX());
    }
}
