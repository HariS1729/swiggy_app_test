package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.n0;
import bp0.k;
import d2.h;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* renamed from: androidx.compose.foundation.layout.SizeKt$defaultMinSize-VpY3zN4$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* compiled from: InspectableValue.kt */
public final class SizeKt$defaultMinSizeVpY3zN4$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ float f3819a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f3820b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SizeKt$defaultMinSizeVpY3zN4$$inlined$debugInspectorInfo$1(float f11, float f12) {
        super(1);
        this.f3819a = f11;
        this.f3820b = f12;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("defaultMinSize");
        n0Var.a().b("minWidth", h.k(this.f3819a));
        n0Var.a().b("minHeight", h.k(this.f3820b));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
