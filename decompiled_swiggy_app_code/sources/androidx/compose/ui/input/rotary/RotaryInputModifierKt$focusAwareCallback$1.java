package androidx.compose.ui.input.rotary;

import c1.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: RotaryInputModifier.kt */
final class RotaryInputModifierKt$focusAwareCallback$1 extends Lambda implements l<a, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<h1.a, Boolean> f6714a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RotaryInputModifierKt$focusAwareCallback$1(l<? super h1.a, Boolean> lVar) {
        super(1);
        this.f6714a = lVar;
    }

    /* renamed from: a */
    public final Boolean invoke(a aVar) {
        p.j(aVar, "e");
        if (aVar instanceof h1.a) {
            return this.f6714a.invoke(aVar);
        }
        throw new IllegalStateException("FocusAwareEvent is dispatched to the wrong FocusAwareParent.".toString());
    }
}
