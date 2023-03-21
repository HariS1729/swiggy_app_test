package androidx.compose.animation;

import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: EnterExitTransition.kt */
final class EnterExitTransitionKt$slideOutVertically$1 extends Lambda implements l<Integer, Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final EnterExitTransitionKt$slideOutVertically$1 f2561a = new EnterExitTransitionKt$slideOutVertically$1();

    EnterExitTransitionKt$slideOutVertically$1() {
        super(1);
    }

    public final Integer a(int i11) {
        return Integer.valueOf((-i11) / 2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).intValue());
    }
}
