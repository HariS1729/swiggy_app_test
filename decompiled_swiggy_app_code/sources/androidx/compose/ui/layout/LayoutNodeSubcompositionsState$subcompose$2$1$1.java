package androidx.compose.ui.layout;

import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: SubcomposeLayout.kt */
final class LayoutNodeSubcompositionsState$subcompose$2$1$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LayoutNodeSubcompositionsState.a f6759a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f6760b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LayoutNodeSubcompositionsState$subcompose$2$1$1(LayoutNodeSubcompositionsState.a aVar, p<? super g, ? super Integer, k> pVar) {
        super(2);
        this.f6759a = aVar;
        this.f6760b = pVar;
    }

    public final void a(g gVar, int i11) {
        if ((i11 & 11) != 2 || !gVar.b()) {
            boolean a11 = this.f6759a.a();
            p<g, Integer, k> pVar = this.f6760b;
            gVar.g(207, Boolean.valueOf(a11));
            boolean m11 = gVar.m(a11);
            if (a11) {
                pVar.invoke(gVar, 0);
            } else {
                gVar.a(m11);
            }
            gVar.D();
            return;
        }
        gVar.h();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
