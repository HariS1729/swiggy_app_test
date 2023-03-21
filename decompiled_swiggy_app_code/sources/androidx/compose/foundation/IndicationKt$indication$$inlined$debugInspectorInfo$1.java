package androidx.compose.foundation;

import androidx.compose.ui.platform.n0;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import s.h;
import u.i;

/* compiled from: InspectableValue.kt */
public final class IndicationKt$indication$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f3057a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ i f3058b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IndicationKt$indication$$inlined$debugInspectorInfo$1(h hVar, i iVar) {
        super(1);
        this.f3057a = hVar;
        this.f3058b = iVar;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("indication");
        n0Var.a().b("indication", this.f3057a);
        n0Var.a().b("interactionSource", this.f3058b);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
