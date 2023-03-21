package androidx.compose.ui.graphics.vector;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import lp0.r;

/* compiled from: VectorPainter.kt */
final class VectorPainter$composeVector$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r<Float, Float, g, Integer, k> f6589a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VectorPainter f6590b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VectorPainter$composeVector$1(r<? super Float, ? super Float, ? super g, ? super Integer, k> rVar, VectorPainter vectorPainter) {
        super(2);
        this.f6589a = rVar;
        this.f6590b = vectorPainter;
    }

    public final void a(g gVar, int i11) {
        if ((i11 & 11) != 2 || !gVar.b()) {
            this.f6589a.invoke(Float.valueOf(this.f6590b.f6578i.l()), Float.valueOf(this.f6590b.f6578i.k()), gVar, 0);
        } else {
            gVar.h();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
