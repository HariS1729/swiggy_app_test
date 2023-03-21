package androidx.compose.animation;

import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: EnterExitTransition.kt */
final class EnterExitTransitionKt$slideInVertically$1 extends Lambda implements l<Integer, Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final EnterExitTransitionKt$slideInVertically$1 f2558a = new EnterExitTransitionKt$slideInVertically$1();

    EnterExitTransitionKt$slideInVertically$1() {
        super(1);
    }

    public final Integer a(int i11) {
        return Integer.valueOf((-i11) / 2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).intValue());
    }
}
