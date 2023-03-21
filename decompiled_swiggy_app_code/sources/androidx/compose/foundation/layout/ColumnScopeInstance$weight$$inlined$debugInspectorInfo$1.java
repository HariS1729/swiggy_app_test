package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.n0;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: InspectableValue.kt */
public final class ColumnScopeInstance$weight$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ float f3717a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f3718b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ColumnScopeInstance$weight$$inlined$debugInspectorInfo$1(float f11, boolean z11) {
        super(1);
        this.f3717a = f11;
        this.f3718b = z11;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("weight");
        n0Var.c(Float.valueOf(this.f3717a));
        n0Var.a().b("weight", Float.valueOf(this.f3717a));
        n0Var.a().b("fill", Boolean.valueOf(this.f3718b));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
