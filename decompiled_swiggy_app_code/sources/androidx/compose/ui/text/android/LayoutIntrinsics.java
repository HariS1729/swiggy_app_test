package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.TextPaint;
import bp0.f;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.p;

/* compiled from: LayoutIntrinsics.kt */
public final class LayoutIntrinsics {

    /* renamed from: a  reason: collision with root package name */
    private final f f7527a;

    /* renamed from: b  reason: collision with root package name */
    private final f f7528b;

    /* renamed from: c  reason: collision with root package name */
    private final f f7529c;

    public LayoutIntrinsics(CharSequence charSequence, TextPaint textPaint, int i11) {
        p.j(charSequence, "charSequence");
        p.j(textPaint, "textPaint");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f7527a = b.a(lazyThreadSafetyMode, new LayoutIntrinsics$boringMetrics$2(i11, charSequence, textPaint));
        this.f7528b = b.a(lazyThreadSafetyMode, new LayoutIntrinsics$minIntrinsicWidth$2(charSequence, textPaint));
        this.f7529c = b.a(lazyThreadSafetyMode, new LayoutIntrinsics$maxIntrinsicWidth$2(this, charSequence, textPaint));
    }

    public final BoringLayout.Metrics a() {
        return (BoringLayout.Metrics) this.f7527a.getValue();
    }

    public final float b() {
        return ((Number) this.f7529c.getValue()).floatValue();
    }

    public final float c() {
        return ((Number) this.f7528b.getValue()).floatValue();
    }
}
