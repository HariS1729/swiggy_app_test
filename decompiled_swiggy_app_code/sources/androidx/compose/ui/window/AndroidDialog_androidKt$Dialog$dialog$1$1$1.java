package androidx.compose.ui.window;

import androidx.compose.ui.semantics.SemanticsModifierKt;
import bp0.k;
import e0.d1;
import e0.g;
import kotlin.jvm.internal.Lambda;
import l0.b;
import lp0.p;
import p0.d;

/* compiled from: AndroidDialog.android.kt */
final class AndroidDialog_androidKt$Dialog$dialog$1$1$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d1<p<g, Integer, k>> f7776a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidDialog_androidKt$Dialog$dialog$1$1$1(d1<? extends p<? super g, ? super Integer, k>> d1Var) {
        super(2);
        this.f7776a = d1Var;
    }

    public final void a(g gVar, int i11) {
        if ((i11 & 11) != 2 || !gVar.b()) {
            d c11 = SemanticsModifierKt.c(d.f16037h0, false, AnonymousClass1.f7777a, 1, (Object) null);
            final d1<p<g, Integer, k>> d1Var = this.f7776a;
            AndroidDialog_androidKt.c(c11, b.b(gVar, -533674951, true, new p<g, Integer, k>() {
                public final void a(g gVar, int i11) {
                    if ((i11 & 11) != 2 || !gVar.b()) {
                        AndroidDialog_androidKt.b(d1Var).invoke(gVar, 0);
                    } else {
                        gVar.h();
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((g) obj, ((Number) obj2).intValue());
                    return k.f22762a;
                }
            }), gVar, 48, 0);
            return;
        }
        gVar.h();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
