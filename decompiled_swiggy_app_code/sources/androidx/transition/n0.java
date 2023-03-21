package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* compiled from: ViewOverlayApi18 */
class n0 implements o0 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewOverlay f11980a;

    n0(View view) {
        this.f11980a = view.getOverlay();
    }

    public void a(Drawable drawable) {
        this.f11980a.remove(drawable);
    }

    public void b(Drawable drawable) {
        this.f11980a.add(drawable);
    }
}
