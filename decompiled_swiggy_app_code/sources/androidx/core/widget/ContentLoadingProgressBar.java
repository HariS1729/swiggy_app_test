package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: a  reason: collision with root package name */
    long f9607a = -1;

    /* renamed from: b  reason: collision with root package name */
    boolean f9608b = false;

    /* renamed from: c  reason: collision with root package name */
    boolean f9609c = false;

    /* renamed from: d  reason: collision with root package name */
    boolean f9610d = false;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f9611e = new d(this);

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f9612f = new e(this);

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.f9608b = false;
        this.f9607a = -1;
        setVisibility(8);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f9609c = false;
        if (!this.f9610d) {
            this.f9607a = System.currentTimeMillis();
            setVisibility(0);
        }
    }

    private void e() {
        removeCallbacks(this.f9611e);
        removeCallbacks(this.f9612f);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }
}
