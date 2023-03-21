package s1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.jvm.internal.p;

/* compiled from: TextDecorationSpan.kt */
public final class l extends CharacterStyle {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f16626a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f16627b;

    public l(boolean z11, boolean z12) {
        this.f16626a = z11;
        this.f16627b = z12;
    }

    public void updateDrawState(TextPaint textPaint) {
        p.j(textPaint, "textPaint");
        textPaint.setUnderlineText(this.f16626a);
        textPaint.setStrikeThruText(this.f16627b);
    }
}
