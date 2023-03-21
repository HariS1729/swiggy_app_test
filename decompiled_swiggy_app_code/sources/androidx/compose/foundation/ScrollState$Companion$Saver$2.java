package androidx.compose.foundation;

import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: Scroll.kt */
final class ScrollState$Companion$Saver$2 extends Lambda implements l<Integer, ScrollState> {

    /* renamed from: a  reason: collision with root package name */
    public static final ScrollState$Companion$Saver$2 f3162a = new ScrollState$Companion$Saver$2();

    ScrollState$Companion$Saver$2() {
        super(1);
    }

    public final ScrollState a(int i11) {
        return new ScrollState(i11);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).intValue());
    }
}
