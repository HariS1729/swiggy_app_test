package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.n0;
import bp0.k;
import d2.h;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* renamed from: androidx.compose.foundation.layout.SizeKt$sizeIn-qDBjuR0$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* compiled from: InspectableValue.kt */
public final class SizeKt$sizeInqDBjuR0$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ float f3830a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f3831b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f3832c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ float f3833d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SizeKt$sizeInqDBjuR0$$inlined$debugInspectorInfo$1(float f11, float f12, float f13, float f14) {
        super(1);
        this.f3830a = f11;
        this.f3831b = f12;
        this.f3832c = f13;
        this.f3833d = f14;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("sizeIn");
        n0Var.a().b("minWidth", h.k(this.f3830a));
        n0Var.a().b("minHeight", h.k(this.f3831b));
        n0Var.a().b("maxWidth", h.k(this.f3832c));
        n0Var.a().b("maxHeight", h.k(this.f3833d));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
