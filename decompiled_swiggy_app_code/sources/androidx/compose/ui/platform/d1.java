package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import kotlin.jvm.internal.p;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
public final class d1 {

    /* renamed from: a  reason: collision with root package name */
    private final SemanticsNode f7297a;

    /* renamed from: b  reason: collision with root package name */
    private final Rect f7298b;

    public d1(SemanticsNode semanticsNode, Rect rect) {
        p.j(semanticsNode, "semanticsNode");
        p.j(rect, "adjustedBounds");
        this.f7297a = semanticsNode;
        this.f7298b = rect;
    }

    public final Rect a() {
        return this.f7298b;
    }

    public final SemanticsNode b() {
        return this.f7297a;
    }
}
