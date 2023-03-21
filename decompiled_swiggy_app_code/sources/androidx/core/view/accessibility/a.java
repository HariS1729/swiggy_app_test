package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AccessibilityClickableSpanCompat */
public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    private final int f9449a;

    /* renamed from: b  reason: collision with root package name */
    private final c f9450b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9451c;

    public a(int i11, c cVar, int i12) {
        this.f9449a = i11;
        this.f9450b = cVar;
        this.f9451c = i12;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f9449a);
        this.f9450b.S(this.f9451c, bundle);
    }
}
