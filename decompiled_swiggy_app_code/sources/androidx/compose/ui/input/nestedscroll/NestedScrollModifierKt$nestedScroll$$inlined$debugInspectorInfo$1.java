package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.platform.n0;
import bp0.k;
import e1.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: InspectableValue.kt */
public final class NestedScrollModifierKt$nestedScroll$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f6613a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NestedScrollDispatcher f6614b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedScrollModifierKt$nestedScroll$$inlined$debugInspectorInfo$1(b bVar, NestedScrollDispatcher nestedScrollDispatcher) {
        super(1);
        this.f6613a = bVar;
        this.f6614b = nestedScrollDispatcher;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("nestedScroll");
        n0Var.a().b("connection", this.f6613a);
        n0Var.a().b("dispatcher", this.f6614b);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
