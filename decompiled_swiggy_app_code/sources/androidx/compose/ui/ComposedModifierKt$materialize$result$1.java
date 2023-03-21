package androidx.compose.ui;

import e0.g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.x;
import lp0.p;
import lp0.q;
import p0.d;
import s0.c;

/* compiled from: ComposedModifier.kt */
final class ComposedModifierKt$materialize$result$1 extends Lambda implements p<d, d.b, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f6320a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposedModifierKt$materialize$result$1(g gVar) {
        super(2);
        this.f6320a = gVar;
    }

    /* renamed from: a */
    public final d invoke(d dVar, d.b bVar) {
        d dVar2;
        kotlin.jvm.internal.p.j(dVar, "acc");
        kotlin.jvm.internal.p.j(bVar, "element");
        if (bVar instanceof a) {
            dVar2 = ComposedModifierKt.e(this.f6320a, (d) ((q) x.e(((a) bVar).c(), 3)).invoke(d.f16037h0, this.f6320a, 0));
        } else {
            d N = bVar instanceof c ? bVar.N((d) ((q) x.e(ComposedModifierKt.f6314a, 3)).invoke(bVar, this.f6320a, 0)) : bVar;
            dVar2 = bVar instanceof s0.p ? N.N((d) ((q) x.e(ComposedModifierKt.f6315b, 3)).invoke(bVar, this.f6320a, 0)) : N;
        }
        return dVar.N(dVar2);
    }
}
