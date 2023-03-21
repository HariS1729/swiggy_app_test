package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.platform.n0;
import bp0.k;
import c0.s;
import com.newrelic.agent.android.agentdata.HexAttribute;
import d2.h;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import lp0.p;

/* renamed from: androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* compiled from: InspectableValue.kt */
public final class SwipeableKt$swipeablepPrIpRY$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SwipeableState f5458a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Map f5459b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Orientation f5460c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f5461d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f5462e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ u.k f5463f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ p f5464g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ s f5465h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ float f5466i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableKt$swipeablepPrIpRY$$inlined$debugInspectorInfo$1(SwipeableState swipeableState, Map map, Orientation orientation, boolean z11, boolean z12, u.k kVar, p pVar, s sVar, float f11) {
        super(1);
        this.f5458a = swipeableState;
        this.f5459b = map;
        this.f5460c = orientation;
        this.f5461d = z11;
        this.f5462e = z12;
        this.f5463f = kVar;
        this.f5464g = pVar;
        this.f5465h = sVar;
        this.f5466i = f11;
    }

    public final void a(n0 n0Var) {
        kotlin.jvm.internal.p.j(n0Var, "$this$null");
        n0Var.b("swipeable");
        n0Var.a().b(HexAttribute.HEX_ATTR_THREAD_STATE, this.f5458a);
        n0Var.a().b("anchors", this.f5459b);
        n0Var.a().b("orientation", this.f5460c);
        n0Var.a().b("enabled", Boolean.valueOf(this.f5461d));
        n0Var.a().b("reverseDirection", Boolean.valueOf(this.f5462e));
        n0Var.a().b("interactionSource", this.f5463f);
        n0Var.a().b("thresholds", this.f5464g);
        n0Var.a().b("resistance", this.f5465h);
        n0Var.a().b("velocityThreshold", h.k(this.f5466i));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
