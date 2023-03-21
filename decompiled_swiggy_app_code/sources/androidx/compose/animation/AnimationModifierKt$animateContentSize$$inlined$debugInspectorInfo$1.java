package androidx.compose.animation;

import androidx.compose.ui.platform.n0;
import bp0.k;
import defpackage.v1;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import lp0.p;

/* compiled from: InspectableValue.kt */
public final class AnimationModifierKt$animateContentSize$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ v1.a0 f2512a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p f2513b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimationModifierKt$animateContentSize$$inlined$debugInspectorInfo$1(v1.a0 a0Var, p pVar) {
        super(1);
        this.f2512a = a0Var;
        this.f2513b = pVar;
    }

    public final void a(n0 n0Var) {
        kotlin.jvm.internal.p.j(n0Var, "$this$null");
        n0Var.b("animateContentSize");
        n0Var.a().b("animationSpec", this.f2512a);
        n0Var.a().b("finishedListener", this.f2513b);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
