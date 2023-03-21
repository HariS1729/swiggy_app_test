package androidx.compose.ui.draw;

import androidx.compose.ui.platform.n0;
import bp0.k;
import d2.h;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import u0.d0;
import u0.j1;

/* renamed from: androidx.compose.ui.draw.ShadowKt$shadow-s4CzXII$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* compiled from: InspectableValue.kt */
public final class ShadowKt$shadows4CzXII$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ float f6344a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j1 f6345b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f6346c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f6347d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ long f6348e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShadowKt$shadows4CzXII$$inlined$debugInspectorInfo$1(float f11, j1 j1Var, boolean z11, long j, long j11) {
        super(1);
        this.f6344a = f11;
        this.f6345b = j1Var;
        this.f6346c = z11;
        this.f6347d = j;
        this.f6348e = j11;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("shadow");
        n0Var.a().b("elevation", h.k(this.f6344a));
        n0Var.a().b("shape", this.f6345b);
        n0Var.a().b("clip", Boolean.valueOf(this.f6346c));
        n0Var.a().b("ambientColor", d0.h(this.f6347d));
        n0Var.a().b("spotColor", d0.h(this.f6348e));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
