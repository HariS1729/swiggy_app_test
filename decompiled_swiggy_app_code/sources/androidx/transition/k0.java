package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* compiled from: ViewGroupOverlayApi18 */
class k0 implements l0 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroupOverlay f11956a;

    k0(ViewGroup viewGroup) {
        this.f11956a = viewGroup.getOverlay();
    }

    public void a(Drawable drawable) {
        this.f11956a.remove(drawable);
    }

    public void b(Drawable drawable) {
        this.f11956a.add(drawable);
    }

    public void c(View view) {
        this.f11956a.add(view);
    }

    public void d(View view) {
        this.f11956a.remove(view);
    }
}
