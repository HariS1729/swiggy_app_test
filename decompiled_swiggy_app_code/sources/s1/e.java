package s1;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import kotlin.jvm.internal.p;

/* compiled from: LineHeightSpan.kt */
public final class e implements LineHeightSpan {

    /* renamed from: a  reason: collision with root package name */
    private final float f16601a;

    public e(float f11) {
        this.f16601a = f11;
    }

    public void chooseHeight(CharSequence charSequence, int i11, int i12, int i13, int i14, Paint.FontMetricsInt fontMetricsInt) {
        p.j(charSequence, "text");
        p.j(fontMetricsInt, "fontMetricsInt");
        int a11 = g.a(fontMetricsInt);
        if (a11 > 0) {
            int ceil = (int) ((float) Math.ceil((double) this.f16601a));
            int ceil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((((float) ceil) * 1.0f) / ((float) a11))));
            fontMetricsInt.descent = ceil2;
            fontMetricsInt.ascent = ceil2 - ceil;
        }
    }
}
