package androidx.compose.foundation.text.selection;

import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import b0.o;
import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import lp0.q;
import p0.d;
import r0.c;
import u0.e0;
import u0.l0;
import w0.e;

/* compiled from: AndroidSelectionHandles.android.kt */
final class AndroidSelectionHandles_androidKt$drawSelectionHandle$1 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f4691a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ResolvedTextDirection f4692b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f4693c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidSelectionHandles_androidKt$drawSelectionHandle$1(boolean z11, ResolvedTextDirection resolvedTextDirection, boolean z12) {
        super(3);
        this.f4691a = z11;
        this.f4692b = resolvedTextDirection;
        this.f4693c = z12;
    }

    public final d a(d dVar, g gVar, int i11) {
        p.j(dVar, "$this$composed");
        gVar.E(-1538687176);
        final long b11 = ((o) gVar.z(TextSelectionColorsKt.b())).b();
        d.a aVar = d.f16037h0;
        final boolean z11 = this.f4691a;
        final ResolvedTextDirection resolvedTextDirection = this.f4692b;
        final boolean z12 = this.f4693c;
        d N = dVar.N(DrawModifierKt.b(aVar, new l<c, r0.g>() {
            /* renamed from: a */
            public final r0.g invoke(c cVar) {
                p.j(cVar, "$this$drawWithCache");
                final l0 e11 = AndroidSelectionHandles_androidKt.e(cVar, t0.l.i(cVar.d()) / 2.0f);
                final e0 c11 = e0.a.c(e0.f16769b, b11, 0, 2, (Object) null);
                final boolean z11 = z11;
                final ResolvedTextDirection resolvedTextDirection = resolvedTextDirection;
                final boolean z12 = z12;
                return cVar.p(new l<w0.c, k>() {
                    public final void a(w0.c cVar) {
                        p.j(cVar, "$this$onDrawWithContent");
                        cVar.V();
                        if (AndroidSelectionHandles_androidKt.h(z11, resolvedTextDirection, z12)) {
                            l0 l0Var = e11;
                            e0 e0Var = c11;
                            long R = cVar.R();
                            w0.d O = cVar.O();
                            long d11 = O.d();
                            O.a().a();
                            O.c().a(-1.0f, 1.0f, R);
                            e.h(cVar, l0Var, 0, 0.0f, (w0.g) null, e0Var, 0, 46, (Object) null);
                            O.a().o();
                            O.b(d11);
                            return;
                        }
                        e.h(cVar, e11, 0, 0.0f, (w0.g) null, c11, 0, 46, (Object) null);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a((w0.c) obj);
                        return k.f22762a;
                    }
                });
            }
        }));
        gVar.P();
        return N;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
