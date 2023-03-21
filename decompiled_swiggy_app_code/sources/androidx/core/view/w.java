package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* compiled from: OneShotPreDrawListener */
public final class w implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f9602a;

    /* renamed from: b  reason: collision with root package name */
    private ViewTreeObserver f9603b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f9604c;

    private w(View view, Runnable runnable) {
        this.f9602a = view;
        this.f9603b = view.getViewTreeObserver();
        this.f9604c = runnable;
    }

    public static w a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        w wVar = new w(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(wVar);
        view.addOnAttachStateChangeListener(wVar);
        return wVar;
    }

    public void b() {
        if (this.f9603b.isAlive()) {
            this.f9603b.removeOnPreDrawListener(this);
        } else {
            this.f9602a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f9602a.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        b();
        this.f9604c.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f9603b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
