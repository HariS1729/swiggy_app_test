package androidx.compose.foundation;

import androidx.compose.ui.platform.n0;
import bp0.k;
import com.newrelic.agent.android.agentdata.HexAttribute;
import defpackage.y1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: InspectableValue.kt */
public final class ScrollKt$scroll$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ScrollState f3128a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f3129b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ y1.k f3130c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f3131d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f3132e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollKt$scroll$$inlined$debugInspectorInfo$1(ScrollState scrollState, boolean z11, y1.k kVar, boolean z12, boolean z13) {
        super(1);
        this.f3128a = scrollState;
        this.f3129b = z11;
        this.f3130c = kVar;
        this.f3131d = z12;
        this.f3132e = z13;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("scroll");
        n0Var.a().b(HexAttribute.HEX_ATTR_THREAD_STATE, this.f3128a);
        n0Var.a().b("reverseScrolling", Boolean.valueOf(this.f3129b));
        n0Var.a().b("flingBehavior", this.f3130c);
        n0Var.a().b("isScrollable", Boolean.valueOf(this.f3131d));
        n0Var.a().b("isVertical", Boolean.valueOf(this.f3132e));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
