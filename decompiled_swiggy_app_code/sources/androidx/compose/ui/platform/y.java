package androidx.compose.ui.platform;

import android.view.ViewConfiguration;
import kotlin.jvm.internal.p;

/* compiled from: AndroidViewConfiguration.android.kt */
public final class y implements n1 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewConfiguration f7395a;

    public y(ViewConfiguration viewConfiguration) {
        p.j(viewConfiguration, "viewConfiguration");
        this.f7395a = viewConfiguration;
    }

    public long a() {
        return 40;
    }

    public float b() {
        return (float) this.f7395a.getScaledTouchSlop();
    }

    public long c() {
        return (long) ViewConfiguration.getDoubleTapTimeout();
    }

    public long d() {
        return (long) ViewConfiguration.getLongPressTimeout();
    }

    public /* synthetic */ long e() {
        return m1.a(this);
    }
}
