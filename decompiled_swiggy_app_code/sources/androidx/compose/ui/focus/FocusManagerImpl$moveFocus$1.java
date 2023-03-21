package androidx.compose.ui.focus;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import s0.s;

/* compiled from: FocusManager.kt */
final class FocusManagerImpl$moveFocus$1 extends Lambda implements l<FocusModifier, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FocusModifier f6371a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FocusManagerImpl$moveFocus$1(FocusModifier focusModifier) {
        super(1);
        this.f6371a = focusModifier;
    }

    /* renamed from: a */
    public final Boolean invoke(FocusModifier focusModifier) {
        p.j(focusModifier, "destination");
        if (p.e(focusModifier, this.f6371a)) {
            return Boolean.FALSE;
        }
        if (focusModifier.n() != null) {
            s.h(focusModifier);
            return Boolean.TRUE;
        }
        throw new IllegalStateException("Move focus landed at the root.".toString());
    }
}
