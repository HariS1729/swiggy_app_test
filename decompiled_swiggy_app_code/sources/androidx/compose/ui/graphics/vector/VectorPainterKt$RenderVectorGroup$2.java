package androidx.compose.ui.graphics.vector;

import bp0.k;
import e0.g;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import y0.l;

/* compiled from: VectorPainter.kt */
final class VectorPainterKt$RenderVectorGroup$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l f6594a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Map<String, y0.k> f6595b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f6596c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f6597d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VectorPainterKt$RenderVectorGroup$2(l lVar, Map<String, ? extends y0.k> map, int i11, int i12) {
        super(2);
        this.f6594a = lVar;
        this.f6595b = map;
        this.f6596c = i11;
        this.f6597d = i12;
    }

    public final void a(g gVar, int i11) {
        VectorPainterKt.a(this.f6594a, this.f6595b, gVar, this.f6596c | 1, this.f6597d);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
