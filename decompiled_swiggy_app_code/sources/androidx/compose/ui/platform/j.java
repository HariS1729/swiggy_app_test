package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import in.juspay.hyper.constants.LogCategory;
import java.util.Objects;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: AndroidAccessibilityManager.android.kt */
public final class j implements h {

    /* renamed from: b  reason: collision with root package name */
    private static final a f7311b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final AccessibilityManager f7312a;

    /* compiled from: AndroidAccessibilityManager.android.kt */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public j(Context context) {
        p.j(context, LogCategory.CONTEXT);
        Object systemService = context.getSystemService("accessibility");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f7312a = (AccessibilityManager) systemService;
    }

    public long a(long j, boolean z11, boolean z12, boolean z13) {
        if (j >= 2147483647L) {
            return j;
        }
        if (z12) {
            z11 |= true;
        }
        if (z13) {
            z11 |= true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int a11 = a0.f7261a.a(this.f7312a, (int) j, z11 ? 1 : 0);
            if (a11 != Integer.MAX_VALUE) {
                return (long) a11;
            }
        } else if (!z13 || !this.f7312a.isTouchExplorationEnabled()) {
            return j;
        }
        return Long.MAX_VALUE;
    }
}
