package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.n0;
import bp0.k;
import d2.h;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* renamed from: androidx.compose.foundation.layout.SizeKt$heightIn-VpY3zN4$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* compiled from: InspectableValue.kt */
public final class SizeKt$heightInVpY3zN4$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ float f3822a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f3823b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SizeKt$heightInVpY3zN4$$inlined$debugInspectorInfo$1(float f11, float f12) {
        super(1);
        this.f3822a = f11;
        this.f3823b = f12;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("heightIn");
        n0Var.a().b("min", h.k(this.f3822a));
        n0Var.a().b("max", h.k(this.f3823b));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
