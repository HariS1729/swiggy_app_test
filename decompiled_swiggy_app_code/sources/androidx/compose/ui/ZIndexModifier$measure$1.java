package androidx.compose.ui;

import bp0.k;
import i1.e0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: ZIndexModifier.kt */
final class ZIndexModifier$measure$1 extends Lambda implements l<e0.a, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e0 f6323a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ZIndexModifier f6324b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ZIndexModifier$measure$1(e0 e0Var, ZIndexModifier zIndexModifier) {
        super(1);
        this.f6323a = e0Var;
        this.f6324b = zIndexModifier;
    }

    public final void a(e0.a aVar) {
        p.j(aVar, "$this$layout");
        aVar.i(this.f6323a, 0, 0, this.f6324b.f6322b);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((e0.a) obj);
        return k.f22762a;
    }
}
