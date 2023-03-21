package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import n1.i;
import n1.j;
import n1.k;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
final class AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1 extends Lambda implements l<LayoutNode, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1 f7039a = new AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1();

    AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1() {
        super(1);
    }

    /* renamed from: a */
    public final Boolean invoke(LayoutNode layoutNode) {
        p.j(layoutNode, "it");
        k j = a.j(layoutNode);
        j j11 = j != null ? j.j() : null;
        boolean z11 = true;
        if (!(j11 != null && j11.l()) || !j11.c(i.f15789a.p())) {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
