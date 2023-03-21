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
import p1.c0;

/* compiled from: Snackbar.kt */
final class SnackbarKt$Snackbar$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5375a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f5376b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f5377c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f5378d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarKt$Snackbar$1(p<? super g, ? super Integer, k> pVar, p<? super g, ? super Integer, k> pVar2, int i11, boolean z11) {
        super(2);
        this.f5375a = pVar;
        this.f5376b = pVar2;
        this.f5377c = i11;
        this.f5378d = z11;
    }

    public final void a(g gVar, int i11) {
        if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
            n0[] n0VarArr = {ContentAlphaKt.a().c(Float.valueOf(d.f12682a.c(gVar, 6)))};
            final p<g, Integer, k> pVar = this.f5375a;
            final p<g, Integer, k> pVar2 = this.f5376b;
            final int i12 = this.f5377c;
            final boolean z11 = this.f5378d;
            CompositionLocalKt.a(n0VarArr, b.b(gVar, -819890248, true, new p<g, Integer, k>() {
                public final void a(g gVar, int i11) {
                    if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
                        c0 b11 = q.f12737a.c(gVar, 6).b();
                        final p<g, Integer, k> pVar = pVar;
                        final p<g, Integer, k> pVar2 = pVar2;
                        final int i12 = i12;
                        final boolean z11 = z11;
                        TextKt.a(b11, b.b(gVar, -819890387, true, new p<g, Integer, k>() {
                            public final void a(g gVar, int i11) {
                                if (((i11 & 11) ^ 2) == 0 && gVar.b()) {
                                    gVar.h();
                                } else if (pVar == null) {
                                    gVar.E(59708346);
                                    SnackbarKt.e(pVar2, gVar, (i12 >> 21) & 14);
                                    gVar.P();
                                } else if (z11) {
                                    gVar.E(59708411);
                                    p<g, Integer, k> pVar = pVar2;
                                    p<g, Integer, k> pVar2 = pVar;
                                    int i12 = i12;
                                    SnackbarKt.a(pVar, pVar2, gVar, (i12 & 112) | ((i12 >> 21) & 14));
                                    gVar.P();
                                } else {
                                    gVar.E(59708478);
                                    p<g, Integer, k> pVar3 = pVar2;
                                    p<g, Integer, k> pVar4 = pVar;
                                    int i13 = i12;
                                    SnackbarKt.b(pVar3, pVar4, gVar, (i13 & 112) | ((i13 >> 21) & 14));
                                    gVar.P();
                                }
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                a((g) obj, ((Number) obj2).intValue());
                                return k.f22762a;
                            }
                        }), gVar, 48);
                        return;
                    }
                    gVar.h();
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
