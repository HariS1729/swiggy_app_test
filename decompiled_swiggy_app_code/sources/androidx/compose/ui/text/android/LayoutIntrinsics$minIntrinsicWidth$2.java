package androidx.compose.ui.text.android;

import android.text.TextPaint;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import q1.f;

/* compiled from: LayoutIntrinsics.kt */
final class LayoutIntrinsics$minIntrinsicWidth$2 extends Lambda implements a<Float> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CharSequence f7536a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TextPaint f7537b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LayoutIntrinsics$minIntrinsicWidth$2(CharSequence charSequence, TextPaint textPaint) {
        super(0);
        this.f7536a = charSequence;
        this.f7537b = textPaint;
    }

    /* renamed from: a */
    public final Float invoke() {
        return Float.valueOf(f.c(this.f7536a, this.f7537b));
    }
}
