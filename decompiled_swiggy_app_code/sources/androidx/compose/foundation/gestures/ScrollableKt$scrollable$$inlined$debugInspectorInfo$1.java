package androidx.compose.foundation.gestures;

import androidx.compose.ui.platform.n0;
import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import defpackage.y1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: InspectableValue.kt */
public final class ScrollableKt$scrollable$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Orientation f3473a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ y1.r f3474b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ s.l f3475c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f3476d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f3477e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ y1.k f3478f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ u.k f3479g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollableKt$scrollable$$inlined$debugInspectorInfo$1(Orientation orientation, y1.r rVar, s.l lVar, boolean z11, boolean z12, y1.k kVar, u.k kVar2) {
        super(1);
        this.f3473a = orientation;
        this.f3474b = rVar;
        this.f3475c = lVar;
        this.f3476d = z11;
        this.f3477e = z12;
        this.f3478f = kVar;
        this.f3479g = kVar2;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("scrollable");
        n0Var.a().b("orientation", this.f3473a);
        n0Var.a().b(HexAttribute.HEX_ATTR_THREAD_STATE, this.f3474b);
        n0Var.a().b("overscrollEffect", this.f3475c);
        n0Var.a().b("enabled", Boolean.valueOf(this.f3476d));
        n0Var.a().b("reverseDirection", Boolean.valueOf(this.f3477e));
        n0Var.a().b("flingBehavior", this.f3478f);
        n0Var.a().b("interactionSource", this.f3479g);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
