package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import q1.f;

/* compiled from: LayoutIntrinsics.kt */
final class LayoutIntrinsics$maxIntrinsicWidth$2 extends Lambda implements a<Float> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LayoutIntrinsics f7533a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CharSequence f7534b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TextPaint f7535c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LayoutIntrinsics$maxIntrinsicWidth$2(LayoutIntrinsics layoutIntrinsics, CharSequence charSequence, TextPaint textPaint) {
        super(0);
        this.f7533a = layoutIntrinsics;
        this.f7534b = charSequence;
        this.f7535c = textPaint;
    }

    /* renamed from: a */
    public final Float invoke() {
        float f11;
        BoringLayout.Metrics a11 = this.f7533a.a();
        if (a11 != null) {
            f11 = (float) a11.width;
        } else {
            CharSequence charSequence = this.f7534b;
            f11 = Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.f7535c);
        }
        if (f.e(f11, this.f7534b, this.f7535c)) {
            f11 += 0.5f;
        }
        return Float.valueOf(f11);
    }
}
