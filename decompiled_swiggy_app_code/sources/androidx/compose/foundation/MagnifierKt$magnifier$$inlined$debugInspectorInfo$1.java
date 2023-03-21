package androidx.compose.foundation;

import androidx.compose.ui.platform.n0;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import s.j;

/* compiled from: InspectableValue.kt */
public final class MagnifierKt$magnifier$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l f3063a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l f3064b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f3065c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ j f3066d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagnifierKt$magnifier$$inlined$debugInspectorInfo$1(l lVar, l lVar2, float f11, j jVar) {
        super(1);
        this.f3063a = lVar;
        this.f3064b = lVar2;
        this.f3065c = f11;
        this.f3066d = jVar;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b(MagnifierKt.c(0, 1, (Object) null) ? "magnifier" : "magnifier (not supported)");
        n0Var.a().b("sourceCenter", this.f3063a);
        n0Var.a().b("magnifierCenter", this.f3064b);
        n0Var.a().b("zoom", Float.valueOf(this.f3065c));
        n0Var.a().b("style", this.f3066d);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
