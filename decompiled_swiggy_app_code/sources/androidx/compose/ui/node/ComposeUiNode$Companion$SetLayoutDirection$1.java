package androidx.compose.ui.node;

import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: ComposeUiNode.kt */
final class ComposeUiNode$Companion$SetLayoutDirection$1 extends Lambda implements p<ComposeUiNode, LayoutDirection, k> {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposeUiNode$Companion$SetLayoutDirection$1 f6810a = new ComposeUiNode$Companion$SetLayoutDirection$1();

    ComposeUiNode$Companion$SetLayoutDirection$1() {
        super(2);
    }

    public final void a(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
        kotlin.jvm.internal.p.j(composeUiNode, "$this$null");
        kotlin.jvm.internal.p.j(layoutDirection, "it");
        composeUiNode.c(layoutDirection);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((ComposeUiNode) obj, (LayoutDirection) obj2);
        return k.f22762a;
    }
}
