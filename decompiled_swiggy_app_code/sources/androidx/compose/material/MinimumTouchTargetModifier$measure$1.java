package androidx.compose.material;

import bp0.k;
import i1.e0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: TouchTarget.kt */
final class MinimumTouchTargetModifier$measure$1 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f5098a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e0 f5099b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f5100c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MinimumTouchTargetModifier$measure$1(int i11, e0 e0Var, int i12) {
        super(1);
        this.f5098a = i11;
        this.f5099b = e0Var;
        this.f5100c = i12;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        e0.a aVar2 = aVar;
        e0.a.j(aVar2, this.f5099b, c.c(((float) (this.f5098a - this.f5099b.A0())) / 2.0f), c.c(((float) (this.f5100c - this.f5099b.e0())) / 2.0f), 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
