package s1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.p;

/* compiled from: FontFeatureSpan.kt */
public final class b extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    private final String f16598a;

    public b(String str) {
        p.j(str, "fontFeatureSettings");
        this.f16598a = str;
    }

    public void updateDrawState(TextPaint textPaint) {
        p.j(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f16598a);
    }

    public void updateMeasureState(TextPaint textPaint) {
        p.j(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f16598a);
    }
}
