package coil.compose;

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
public final class ContentPainterModifier$special$$inlined$debugInspectorInfo$1 extends Lambda implements l<n0, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Painter f13472a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f13473b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c f13474c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ float f13475d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ e0 f13476e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentPainterModifier$special$$inlined$debugInspectorInfo$1(Painter painter, a aVar, c cVar, float f11, e0 e0Var) {
        super(1);
        this.f13472a = painter;
        this.f13473b = aVar;
        this.f13474c = cVar;
        this.f13475d = f11;
        this.f13476e = e0Var;
    }

    public final void a(n0 n0Var) {
        p.j(n0Var, "$this$null");
        n0Var.b("content");
        n0Var.a().b("painter", this.f13472a);
        n0Var.a().b("alignment", this.f13473b);
        n0Var.a().b("contentScale", this.f13474c);
        n0Var.a().b("alpha", Float.valueOf(this.f13475d));
        n0Var.a().b("colorFilter", this.f13476e);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((n0) obj);
        return k.f22762a;
    }
}
