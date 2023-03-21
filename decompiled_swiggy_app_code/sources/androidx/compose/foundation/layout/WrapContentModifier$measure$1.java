package androidx.compose.foundation.layout;

import bp0.k;
import d2.q;
import i1.e0;
import i1.w;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Size.kt */
final class WrapContentModifier$measure$1 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WrapContentModifier f3888a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f3889b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ e0 f3890c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f3891d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ w f3892e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WrapContentModifier$measure$1(WrapContentModifier wrapContentModifier, int i11, e0 e0Var, int i12, w wVar) {
        super(1);
        this.f3888a = wrapContentModifier;
        this.f3889b = i11;
        this.f3890c = e0Var;
        this.f3891d = i12;
        this.f3892e = wVar;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        e0.a aVar2 = aVar;
        e0.a.l(aVar2, this.f3890c, ((d2.l) this.f3888a.f3886d.invoke(d2.p.b(q.a(this.f3889b - this.f3890c.A0(), this.f3891d - this.f3890c.e0())), this.f3892e.getLayoutDirection())).n(), 0.0f, 2, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
