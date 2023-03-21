package androidx.transition;

import android.view.View;
import android.view.WindowId;

/* compiled from: WindowIdApi18 */
class x0 implements y0 {

    /* renamed from: a  reason: collision with root package name */
    private final WindowId f12029a;

    x0(View view) {
        this.f12029a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof x0) && ((x0) obj).f12029a.equals(this.f12029a);
    }

    public int hashCode() {
        return this.f12029a.hashCode();
    }
}
