package androidx.compose.material;

import a2.e;
import bp0.k;
import c0.v;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import lp0.p;
import p0.d;
import p1.c0;
import p1.y;
import u1.i;
import u1.s;

/* compiled from: Snackbar.kt */
final class SnackbarKt$Snackbar$3 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ v f5396a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarKt$Snackbar$3(v vVar) {
        super(2);
        this.f5396a = vVar;
    }

    public final void a(g gVar, int i11) {
        if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
            TextKt.c(this.f5396a.getMessage(), (d) null, 0, 0, (s) null, (u1.v) null, (i) null, 0, (e) null, (a2.d) null, 0, 0, false, 0, (l<? super y, k>) null, (c0) null, gVar, 0, 0, 65534);
            return;
        }
        gVar.h();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
