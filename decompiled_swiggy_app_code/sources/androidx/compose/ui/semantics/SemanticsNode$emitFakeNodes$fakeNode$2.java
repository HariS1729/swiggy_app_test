package androidx.compose.ui.semantics;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import n1.o;
import n1.q;

/* compiled from: SemanticsNode.kt */
final class SemanticsNode$emitFakeNodes$fakeNode$2 extends Lambda implements l<q, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f7425a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SemanticsNode$emitFakeNodes$fakeNode$2(String str) {
        super(1);
        this.f7425a = str;
    }

    public final void a(q qVar) {
        p.j(qVar, "$this$fakeSemanticsNode");
        o.C(qVar, this.f7425a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((q) obj);
        return k.f22762a;
    }
}
