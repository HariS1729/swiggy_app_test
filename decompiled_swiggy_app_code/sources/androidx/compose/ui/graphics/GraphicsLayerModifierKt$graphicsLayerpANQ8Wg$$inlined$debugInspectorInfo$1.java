package androidx.compose.ui.graphics;

import androidx.compose.ui.platform.n0;
import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import u0.d0;
import u0.d1;
import u0.j1;
import u0.q1;

/* renamed from: androidx.compose.ui.graphics.GraphicsLayerModifierKt$graphicsLayer-pANQ8Wg$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* compiled from: InspectableValue.kt */
public final class GraphicsLayerModifierKt$graphicsLayerpANQ8Wg$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ float f6415a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f6416b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f6417c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ float f6418d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ float f6419e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ float f6420f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ float f6421g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ float f6422h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ float f6423i;
    final /* synthetic */ float j;
    final /* synthetic */ long k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ j1 f6424l;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ boolean f6425m;
    final /* synthetic */ long n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ long f6426o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GraphicsLayerModifierKt$graphicsLayerpANQ8Wg$$inlined$debugInspectorInfo$1(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, long j11, j1 j1Var, boolean z11, d1 d1Var, long j12, long j13) {
        super(1);
        this.f6415a = f11;
        this.f6416b = f12;
        this.f6417c = f13;
        this.f6418d = f14;
        this.f6419e = f15;
        this.f6420f = f16;
        this.f6421g = f17;
        this.f6422h = f18;
        this.f6423i = f19;
        this.j = f21;
        this.k = j11;
        this.f6424l = j1Var;
        this.f6425m = z11;
        this.n = j12;
        this.f6426o = j13;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("graphicsLayer");
        n0Var.a().b("scaleX", Float.valueOf(this.f6415a));
        n0Var.a().b("scaleY", Float.valueOf(this.f6416b));
        n0Var.a().b("alpha", Float.valueOf(this.f6417c));
        n0Var.a().b("translationX", Float.valueOf(this.f6418d));
        n0Var.a().b("translationY", Float.valueOf(this.f6419e));
        n0Var.a().b("shadowElevation", Float.valueOf(this.f6420f));
        n0Var.a().b("rotationX", Float.valueOf(this.f6421g));
        n0Var.a().b("rotationY", Float.valueOf(this.f6422h));
        n0Var.a().b("rotationZ", Float.valueOf(this.f6423i));
        n0Var.a().b("cameraDistance", Float.valueOf(this.j));
        n0Var.a().b("transformOrigin", q1.b(this.k));
        n0Var.a().b("shape", this.f6424l);
        n0Var.a().b("clip", Boolean.valueOf(this.f6425m));
        n0Var.a().b("renderEffect", (Object) null);
        n0Var.a().b("ambientShadowColor", d0.h(this.n));
        n0Var.a().b("spotShadowColor", d0.h(this.f6426o));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
