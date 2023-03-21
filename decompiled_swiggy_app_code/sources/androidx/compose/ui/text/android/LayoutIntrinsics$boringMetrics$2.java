package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.TextPaint;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import q1.r;

/* compiled from: LayoutIntrinsics.kt */
final class LayoutIntrinsics$boringMetrics$2 extends Lambda implements a<BoringLayout.Metrics> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f7530a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CharSequence f7531b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TextPaint f7532c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LayoutIntrinsics$boringMetrics$2(int i11, CharSequence charSequence, TextPaint textPaint) {
        super(0);
        this.f7530a = i11;
        this.f7531b = charSequence;
        this.f7532c = textPaint;
    }

    /* renamed from: a */
    public final BoringLayout.Metrics invoke() {
        return q1.a.f16282a.b(this.f7531b, this.f7532c, r.e(this.f7530a));
    }
}
