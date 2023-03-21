package androidx.compose.foundation;

import androidx.compose.ui.platform.n0;
import bp0.k;
import d2.h;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import u0.d0;
import u0.j1;
import u0.k1;
import u0.u;

/* renamed from: androidx.compose.foundation.BorderKt$border-ziNgDLE$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* compiled from: InspectableValue.kt */
public final class BorderKt$borderziNgDLE$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ float f2851a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ u f2852b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j1 f2853c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BorderKt$borderziNgDLE$$inlined$debugInspectorInfo$1(float f11, u uVar, j1 j1Var) {
        super(1);
        this.f2851a = f11;
        this.f2852b = uVar;
        this.f2853c = j1Var;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("border");
        n0Var.a().b("width", h.k(this.f2851a));
        if (this.f2852b instanceof k1) {
            n0Var.a().b("color", d0.h(((k1) this.f2852b).b()));
            n0Var.c(d0.h(((k1) this.f2852b).b()));
        } else {
            n0Var.a().b("brush", this.f2852b);
        }
        n0Var.a().b("shape", this.f2853c);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
