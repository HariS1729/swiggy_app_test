package androidx.compose.ui.graphics.vector;

import bp0.k;
import e0.g;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import y0.l;
import y0.n;

/* compiled from: VectorPainter.kt */
final class VectorPainterKt$RenderVectorGroup$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n f6592a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Map<String, y0.k> f6593b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VectorPainterKt$RenderVectorGroup$1(n nVar, Map<String, ? extends y0.k> map) {
        super(2);
        this.f6592a = nVar;
        this.f6593b = map;
    }

    public final void a(g gVar, int i11) {
        if ((i11 & 11) != 2 || !gVar.b()) {
            VectorPainterKt.a((l) this.f6592a, this.f6593b, gVar, 64, 0);
        } else {
            gVar.h();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
