package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.n0;
import bp0.k;
import i1.c;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.a;
import u0.e0;

/* compiled from: InspectableValue.kt */
public final class PainterModifierKt$paint$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Painter f6338a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f6339b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a f6340c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ c f6341d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ float f6342e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ e0 f6343f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PainterModifierKt$paint$$inlined$debugInspectorInfo$1(Painter painter, boolean z11, a aVar, c cVar, float f11, e0 e0Var) {
        super(1);
        this.f6338a = painter;
        this.f6339b = z11;
        this.f6340c = aVar;
        this.f6341d = cVar;
        this.f6342e = f11;
        this.f6343f = e0Var;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("paint");
        n0Var.a().b("painter", this.f6338a);
        n0Var.a().b("sizeToIntrinsics", Boolean.valueOf(this.f6339b));
        n0Var.a().b("alignment", this.f6340c);
        n0Var.a().b("contentScale", this.f6341d);
        n0Var.a().b("alpha", Float.valueOf(this.f6342e));
        n0Var.a().b("colorFilter", this.f6343f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
