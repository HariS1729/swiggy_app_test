package androidx.compose.ui.graphics.vector;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import lp0.r;

/* compiled from: VectorPainter.kt */
final class VectorPainter$RenderVector$3 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VectorPainter f6583a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f6584b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f6585c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ float f6586d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ r<Float, Float, g, Integer, k> f6587e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f6588f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VectorPainter$RenderVector$3(VectorPainter vectorPainter, String str, float f11, float f12, r<? super Float, ? super Float, ? super g, ? super Integer, k> rVar, int i11) {
        super(2);
        this.f6583a = vectorPainter;
        this.f6584b = str;
        this.f6585c = f11;
        this.f6586d = f12;
        this.f6587e = rVar;
        this.f6588f = i11;
    }

    public final void a(g gVar, int i11) {
        this.f6583a.n(this.f6584b, this.f6585c, this.f6586d, this.f6587e, gVar, this.f6588f | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
