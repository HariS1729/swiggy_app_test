package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import n1.j;
import n1.k;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
final class AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1 extends Lambda implements l<LayoutNode, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1 f7037a = new AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1();

    AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1() {
        super(1);
    }

    /* renamed from: a */
    public final Boolean invoke(LayoutNode layoutNode) {
        j j;
        p.j(layoutNode, "it");
        k j11 = a.j(layoutNode);
        boolean z11 = true;
        if (j11 == null || (j = j11.j()) == null || !j.l()) {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
