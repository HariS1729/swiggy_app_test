package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.n0;
import bp0.k;
import d2.h;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* renamed from: androidx.compose.foundation.layout.PaddingKt$padding-qDBjuR0$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* compiled from: InspectableValue.kt */
public final class PaddingKt$paddingqDBjuR0$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ float f3773a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f3774b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f3775c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ float f3776d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaddingKt$paddingqDBjuR0$$inlined$debugInspectorInfo$1(float f11, float f12, float f13, float f14) {
        super(1);
        this.f3773a = f11;
        this.f3774b = f12;
        this.f3775c = f13;
        this.f3776d = f14;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("padding");
        n0Var.a().b("start", h.k(this.f3773a));
        n0Var.a().b("top", h.k(this.f3774b));
        n0Var.a().b("end", h.k(this.f3775c));
        n0Var.a().b("bottom", h.k(this.f3776d));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
