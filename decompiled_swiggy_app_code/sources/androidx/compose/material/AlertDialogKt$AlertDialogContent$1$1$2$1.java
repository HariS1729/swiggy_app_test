package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import bp0.k;
import c0.d;
import c0.q;
import e0.g;
import e0.n0;
import kotlin.jvm.internal.Lambda;
import l0.b;
import lp0.p;

/* compiled from: AlertDialog.kt */
final class AlertDialogKt$AlertDialogContent$1$1$2$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f4824a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f4825b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AlertDialogKt$AlertDialogContent$1$1$2$1(p<? super g, ? super Integer, k> pVar, int i11) {
        super(2);
        this.f4824a = pVar;
        this.f4825b = i11;
    }

    public final void a(g gVar, int i11) {
        if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
            n0[] n0VarArr = {ContentAlphaKt.a().c(Float.valueOf(d.f12682a.d(gVar, 6)))};
            final p<g, Integer, k> pVar = this.f4824a;
            final int i12 = this.f4825b;
            CompositionLocalKt.a(n0VarArr, b.b(gVar, -819892861, true, new p<g, Integer, k>() {
                public final void a(g gVar, int i11) {
                    if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
                        TextKt.a(q.f12737a.c(gVar, 6).b(), pVar, gVar, (i12 >> 6) & 112);
                    } else {
                        gVar.h();
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((g) obj, ((Number) obj2).intValue());
                    return k.f22762a;
                }
            }), gVar, 56);
            return;
        }
        gVar.h();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
