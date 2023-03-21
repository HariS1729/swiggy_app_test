package androidx.compose.ui.tooling;

import androidx.compose.material.FloatingActionButtonKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SnackbarHostState;
import bp0.k;
import c0.n;
import c0.t;
import defpackage.a2;
import e0.a1;
import e0.g;
import e0.h0;
import kotlin.jvm.internal.Lambda;
import l0.a;
import l0.b;
import lp0.p;
import lp0.q;
import p0.d;
import u0.j1;

/* compiled from: PreviewActivity.kt */
final class PreviewActivity$setParameterizedContent$1 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Object[] f7677a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f7678b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f7679c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PreviewActivity$setParameterizedContent$1(Object[] objArr, String str, String str2) {
        super(2);
        this.f7677a = objArr;
        this.f7678b = str;
        this.f7679c = str2;
    }

    public final void a(g gVar, int i11) {
        g gVar2 = gVar;
        if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
            gVar2.E(-3687241);
            Object F = gVar.F();
            if (F == g.f14172a.a()) {
                F = j.e(0, (a1) null, 2, (Object) null);
                gVar2.y(F);
            }
            gVar.P();
            final h0 h0Var = (h0) F;
            final Object[] objArr = this.f7677a;
            a b11 = b.b(gVar2, -819891175, true, new p<g, Integer, k>() {
                public final void a(g gVar, int i11) {
                    if (((i11 & 11) ^ 2) != 0 || !gVar.b()) {
                        p<g, Integer, k> a11 = ComposableSingletons$PreviewActivityKt.f7671a.a();
                        final h0<Integer> h0Var = h0Var;
                        final Object[] objArr = objArr;
                        FloatingActionButtonKt.a(a11, new lp0.a<k>() {
                            public final void invoke() {
                                h0<Integer> h0Var = h0Var;
                                h0Var.setValue(Integer.valueOf((h0Var.getValue().intValue() + 1) % objArr.length));
                            }
                        }, (d) null, (p<? super g, ? super Integer, k>) null, (u.k) null, (j1) null, 0, 0, (n) null, gVar, 6, 508);
                        return;
                    }
                    gVar.h();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((g) obj, ((Number) obj2).intValue());
                    return k.f22762a;
                }
            });
            final h0 h0Var2 = h0Var;
            final String str = this.f7678b;
            final String str2 = this.f7679c;
            final Object[] objArr2 = this.f7677a;
            ScaffoldKt.a((d) null, (t) null, (p<? super g, ? super Integer, k>) null, (p<? super g, ? super Integer, k>) null, (q<? super SnackbarHostState, ? super g, ? super Integer, k>) null, b11, 0, false, (q<? super a2.h, ? super g, ? super Integer, k>) null, false, (j1) null, 0.0f, 0, 0, 0, 0, 0, b.b(gVar2, -819890235, true, new q<a2.p, g, Integer, k>() {
                public final void a(a2.p pVar, g gVar, int i11) {
                    kotlin.jvm.internal.p.j(pVar, "it");
                    if (((i11 & 81) ^ 16) != 0 || !gVar.b()) {
                        b2.a.f12573a.h(str, str2, gVar, objArr2[h0Var2.getValue().intValue()]);
                        return;
                    }
                    gVar.h();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    a((a2.p) obj, (g) obj2, ((Number) obj3).intValue());
                    return k.f22762a;
                }
            }), gVar, 196608, 12582912, 131039);
            return;
        }
        gVar.h();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
