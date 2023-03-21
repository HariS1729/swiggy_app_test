package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import bp0.k;
import i1.m;
import i1.n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import t0.f;

/* compiled from: CoreText.kt */
final class TextController$coreModifiers$1 extends Lambda implements l<m, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextController f4510a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextController$coreModifiers$1(TextController textController) {
        super(1);
        this.f4510a = textController;
    }

    public final void a(m mVar) {
        b0.k a11;
        p.j(mVar, "it");
        this.f4510a.k().j(mVar);
        if (SelectionRegistrarKt.b(this.f4510a.f4497b, this.f4510a.k().g())) {
            long f11 = n.f(mVar);
            if (!f.j(f11, this.f4510a.k().e()) && (a11 = this.f4510a.f4497b) != null) {
                a11.a(this.f4510a.k().g());
            }
            this.f4510a.k().m(f11);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((m) obj);
        return k.f22762a;
    }
}
