package androidx.compose.foundation.layout;

import bp0.k;
import i1.e0;
import i1.w;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Padding.kt */
final class PaddingValuesModifier$measure$2 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e0 f3786a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ w f3787b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PaddingValuesModifier f3788c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PaddingValuesModifier$measure$2(e0 e0Var, w wVar, PaddingValuesModifier paddingValuesModifier) {
        super(1);
        this.f3786a = e0Var;
        this.f3787b = wVar;
        this.f3788c = paddingValuesModifier;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        e0.a.j(aVar, this.f3786a, this.f3787b.j0(this.f3788c.c().b(this.f3787b.getLayoutDirection())), this.f3787b.j0(this.f3788c.c().d()), 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
