package androidx.compose.foundation;

import kotlin.jvm.internal.Lambda;
import lp0.p;
import m0.d;

/* compiled from: Scroll.kt */
final class ScrollState$Companion$Saver$1 extends Lambda implements p<d, ScrollState, Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final ScrollState$Companion$Saver$1 f3161a = new ScrollState$Companion$Saver$1();

    ScrollState$Companion$Saver$1() {
        super(2);
    }

    /* renamed from: a */
    public final Integer invoke(d dVar, ScrollState scrollState) {
        kotlin.jvm.internal.p.j(dVar, "$this$Saver");
        kotlin.jvm.internal.p.j(scrollState, "it");
        return Integer.valueOf(scrollState.j());
    }
}
