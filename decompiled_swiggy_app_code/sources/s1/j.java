package s1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.jvm.internal.p;

/* compiled from: ShadowSpan.kt */
public final class j extends CharacterStyle {

    /* renamed from: a  reason: collision with root package name */
    private final int f16621a;

    /* renamed from: b  reason: collision with root package name */
    private final float f16622b;

    /* renamed from: c  reason: collision with root package name */
    private final float f16623c;

    /* renamed from: d  reason: collision with root package name */
    private final float f16624d;

    public j(int i11, float f11, float f12, float f13) {
        this.f16621a = i11;
        this.f16622b = f11;
        this.f16623c = f12;
        this.f16624d = f13;
    }

    public void updateDrawState(TextPaint textPaint) {
        p.j(textPaint, "tp");
        textPaint.setShadowLayer(this.f16624d, this.f16622b, this.f16623c, this.f16621a);
    }
}
