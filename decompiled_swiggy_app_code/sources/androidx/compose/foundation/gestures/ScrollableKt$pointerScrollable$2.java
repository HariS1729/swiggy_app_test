package androidx.compose.foundation.gestures;

import f1.g0;
import f1.v;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Scrollable.kt */
final class ScrollableKt$pointerScrollable$2 extends Lambda implements l<v, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final ScrollableKt$pointerScrollable$2 f3493a = new ScrollableKt$pointerScrollable$2();

    ScrollableKt$pointerScrollable$2() {
        super(1);
    }

    /* renamed from: a */
    public final Boolean invoke(v vVar) {
        p.j(vVar, "down");
        return Boolean.valueOf(!g0.g(vVar.k(), g0.f14488a.b()));
    }
}
