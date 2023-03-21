package androidx.compose.foundation.gestures;

import androidx.compose.ui.platform.n0;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import lp0.l;
import lp0.p;
import lp0.q;

/* compiled from: InspectableValue.kt */
public final class DraggableKt$draggable$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l f3350a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Orientation f3351b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f3352c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f3353d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ u.k f3354e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ a f3355f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ q f3356g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ q f3357h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ p f3358i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableKt$draggable$$inlined$debugInspectorInfo$1(l lVar, Orientation orientation, boolean z11, boolean z12, u.k kVar, a aVar, q qVar, q qVar2, p pVar) {
        super(1);
        this.f3350a = lVar;
        this.f3351b = orientation;
        this.f3352c = z11;
        this.f3353d = z12;
        this.f3354e = kVar;
        this.f3355f = aVar;
        this.f3356g = qVar;
        this.f3357h = qVar2;
        this.f3358i = pVar;
    }

    public final void a(n0 n0Var) {
        kotlin.jvm.internal.p.j(n0Var, "$this$null");
        n0Var.b("draggable");
        n0Var.a().b("canDrag", this.f3350a);
        n0Var.a().b("orientation", this.f3351b);
        n0Var.a().b("enabled", Boolean.valueOf(this.f3352c));
        n0Var.a().b("reverseDirection", Boolean.valueOf(this.f3353d));
        n0Var.a().b("interactionSource", this.f3354e);
        n0Var.a().b("startDragImmediately", this.f3355f);
        n0Var.a().b("onDragStarted", this.f3356g);
        n0Var.a().b("onDragStopped", this.f3357h);
        n0Var.a().b("stateFactory", this.f3358i);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
