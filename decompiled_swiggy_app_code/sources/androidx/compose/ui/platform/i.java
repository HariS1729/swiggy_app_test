package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityNodeInfo;
import in.swiggy.android.tejas.feature.tracking.cards.typeadapter.CardTypeAdapterFactory;
import java.util.List;
import kotlin.jvm.internal.p;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f7308a = new i();

    private i() {
    }

    public final void a(AccessibilityNodeInfo accessibilityNodeInfo, List<String> list) {
        p.j(accessibilityNodeInfo, "node");
        p.j(list, CardTypeAdapterFactory.DATA);
        accessibilityNodeInfo.setAvailableExtraData(list);
    }
}
