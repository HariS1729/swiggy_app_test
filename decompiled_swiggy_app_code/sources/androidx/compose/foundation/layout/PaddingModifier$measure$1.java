package androidx.compose.foundation.layout;

import bp0.k;
import i1.e0;
import i1.w;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Padding.kt */
final class PaddingModifier$measure$1 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PaddingModifier f3782a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e0 f3783b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ w f3784c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PaddingModifier$measure$1(PaddingModifier paddingModifier, e0 e0Var, w wVar) {
        super(1);
        this.f3782a = paddingModifier;
        this.f3783b = e0Var;
        this.f3784c = wVar;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        if (this.f3782a.c()) {
            e0.a.n(aVar, this.f3783b, this.f3784c.j0(this.f3782a.d()), this.f3784c.j0(this.f3782a.e()), 0.0f, 4, (Object) null);
            return;
        }
        e0.a.j(aVar, this.f3783b, this.f3784c.j0(this.f3782a.d()), this.f3784c.j0(this.f3782a.e()), 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
