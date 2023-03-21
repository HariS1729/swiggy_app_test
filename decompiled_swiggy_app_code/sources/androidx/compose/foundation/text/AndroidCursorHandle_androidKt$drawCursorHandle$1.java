package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.ui.draw.DrawModifierKt;
import b0.o;
import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import lp0.q;
import p0.d;
import r0.c;
import t0.f;
import u0.e0;
import u0.l0;
import w0.e;
import w0.h;
import w0.i;

/* compiled from: AndroidCursorHandle.android.kt */
final class AndroidCursorHandle_androidKt$drawCursorHandle$1 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidCursorHandle_androidKt$drawCursorHandle$1 f4227a = new AndroidCursorHandle_androidKt$drawCursorHandle$1();

    AndroidCursorHandle_androidKt$drawCursorHandle$1() {
        super(3);
    }

    public final d a(d dVar, g gVar, int i11) {
        p.j(dVar, "$this$composed");
        gVar.E(-2126899193);
        final long b11 = ((o) gVar.z(TextSelectionColorsKt.b())).b();
        d N = dVar.N(DrawModifierKt.b(d.f16037h0, new l<c, r0.g>() {
            /* renamed from: a */
            public final r0.g invoke(c cVar) {
                p.j(cVar, "$this$drawWithCache");
                final float i11 = t0.l.i(cVar.d()) / 2.0f;
                final l0 e11 = AndroidSelectionHandles_androidKt.e(cVar, i11);
                final e0 c11 = e0.a.c(e0.f16769b, b11, 0, 2, (Object) null);
                return cVar.p(new l<w0.c, k>() {
                    public final void a(w0.c cVar) {
                        p.j(cVar, "$this$onDrawWithContent");
                        cVar.V();
                        float f11 = i11;
                        l0 l0Var = e11;
                        e0 e0Var = c11;
                        w0.d O = cVar.O();
                        long d11 = O.d();
                        O.a().a();
                        i c11 = O.c();
                        h.b(c11, f11, 0.0f, 2, (Object) null);
                        c11.e(45.0f, f.f16662b.c());
                        e.h(cVar, l0Var, 0, 0.0f, (w0.g) null, e0Var, 0, 46, (Object) null);
                        O.a().o();
                        O.b(d11);
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
