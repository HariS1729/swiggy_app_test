package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;
import kotlin.jvm.internal.p;

/* compiled from: AndroidAccessibilityManager.android.kt */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f7261a = new a0();

    private a0() {
    }

    public final int a(AccessibilityManager accessibilityManager, int i11, int i12) {
        p.j(accessibilityManager, "accessibilityManager");
        return accessibilityManager.getRecommendedTimeoutMillis(i11, i12);
    }
}
