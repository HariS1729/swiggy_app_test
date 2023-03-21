package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.n0;
import bp0.k;
import d2.h;
import i1.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* renamed from: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* compiled from: InspectableValue.kt */
public final class AlignmentLineKt$paddingFrom4j6BHR0$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f3644a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f3645b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f3646c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlignmentLineKt$paddingFrom4j6BHR0$$inlined$debugInspectorInfo$1(a aVar, float f11, float f12) {
        super(1);
        this.f3644a = aVar;
        this.f3645b = f11;
        this.f3646c = f12;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("paddingFrom");
        n0Var.a().b("alignmentLine", this.f3644a);
        n0Var.a().b("before", h.k(this.f3645b));
        n0Var.a().b("after", h.k(this.f3646c));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
