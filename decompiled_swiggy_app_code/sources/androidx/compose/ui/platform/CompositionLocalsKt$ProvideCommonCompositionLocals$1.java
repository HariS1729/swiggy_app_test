package androidx.compose.ui.platform;

import bp0.k;
import e0.g;
import k1.q;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: CompositionLocals.kt */
final class CompositionLocalsKt$ProvideCommonCompositionLocals$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f7134a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ i1 f7135b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f7136c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f7137d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CompositionLocalsKt$ProvideCommonCompositionLocals$1(q qVar, i1 i1Var, p<? super g, ? super Integer, k> pVar, int i11) {
        super(2);
        this.f7134a = qVar;
        this.f7135b = i1Var;
        this.f7136c = pVar;
        this.f7137d = i11;
    }

    public final void a(g gVar, int i11) {
        CompositionLocalsKt.a(this.f7134a, this.f7135b, this.f7136c, gVar, this.f7137d | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
