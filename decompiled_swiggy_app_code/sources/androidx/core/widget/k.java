package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

@Deprecated
/* compiled from: ScrollerCompat */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    OverScroller f9667a;

    k(Context context, Interpolator interpolator) {
        this.f9667a = interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    @Deprecated
    public static k c(Context context, Interpolator interpolator) {
        return new k(context, interpolator);
    }

    @Deprecated
    public void a() {
        this.f9667a.abortAnimation();
    }

    @Deprecated
    public boolean b() {
        return this.f9667a.computeScrollOffset();
    }

    @Deprecated
    public int d() {
        return this.f9667a.getCurrX();
    }

    @Deprecated
    public int e() {
        return this.f9667a.getCurrY();
    }

    @Deprecated
    public void f(int i11, int i12, int i13, int i14, int i15) {
        this.f9667a.startScroll(i11, i12, i13, i14, i15);
    }
}
