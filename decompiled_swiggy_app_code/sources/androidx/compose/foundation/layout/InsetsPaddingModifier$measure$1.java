package androidx.compose.foundation.layout;

import bp0.k;
import i1.e0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: WindowInsetsPadding.kt */
final class InsetsPaddingModifier$measure$1 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e0 f3726a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f3727b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f3728c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InsetsPaddingModifier$measure$1(e0 e0Var, int i11, int i12) {
        super(1);
        this.f3726a = e0Var;
        this.f3727b = i11;
        this.f3728c = i12;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        e0.a.j(aVar, this.f3726a, this.f3727b, this.f3728c, 0.0f, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
