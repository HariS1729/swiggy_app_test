package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.MagnifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import d2.e;
import d2.k;
import d2.p;
import e0.a1;
import e0.g;
import e0.h0;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import lp0.l;
import lp0.q;
import p0.d;
import s.j;
import t0.f;

/* compiled from: TextFieldSelectionManager.android.kt */
final class TextFieldSelectionManager_androidKt$textFieldMagnifier$1 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextFieldSelectionManager f4770a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager_androidKt$textFieldMagnifier$1(TextFieldSelectionManager textFieldSelectionManager) {
        super(3);
        this.f4770a = textFieldSelectionManager;
    }

    /* access modifiers changed from: private */
    public static final long d(h0<p> h0Var) {
        return h0Var.getValue().j();
    }

    /* access modifiers changed from: private */
    public static final void e(h0<p> h0Var, long j) {
        h0Var.setValue(p.b(j));
    }

    public final d c(d dVar, g gVar, int i11) {
        kotlin.jvm.internal.p.j(dVar, "$this$composed");
        gVar.E(1980580247);
        final e eVar = (e) gVar.z(CompositionLocalsKt.e());
        gVar.E(-492369756);
        Object F = gVar.F();
        if (F == g.f14172a.a()) {
            F = j.e(p.b(p.f14019b.a()), (a1) null, 2, (Object) null);
            gVar.y(F);
        }
        gVar.P();
        final h0 h0Var = (h0) F;
        final TextFieldSelectionManager textFieldSelectionManager = this.f4770a;
        d e11 = SelectionMagnifierKt.e(dVar, new a<f>() {
            public final long a() {
                return TextFieldSelectionManagerKt.b(textFieldSelectionManager, TextFieldSelectionManager_androidKt$textFieldMagnifier$1.d(h0Var));
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                return f.d(a());
            }
        }, new l<a<? extends f>, d>() {
            /* renamed from: a */
            public final d invoke(final a<f> aVar) {
                kotlin.jvm.internal.p.j(aVar, "center");
                d.a aVar2 = d.f16037h0;
                j b11 = j.f16539g.b();
                AnonymousClass1 r22 = new l<e, f>() {
                    public final long a(e eVar) {
                        kotlin.jvm.internal.p.j(eVar, "$this$magnifier");
                        return aVar.invoke().u();
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return f.d(a((e) obj));
                    }
                };
                final e eVar = eVar;
                final h0<p> h0Var = h0Var;
                return MagnifierKt.f(aVar2, r22, (l) null, 0.0f, b11, new l<k, bp0.k>() {
                    public final void a(long j) {
                        h0<p> h0Var = h0Var;
                        e eVar = eVar;
                        TextFieldSelectionManager_androidKt$textFieldMagnifier$1.e(h0Var, d2.q.a(eVar.j0(k.h(j)), eVar.j0(k.g(j))));
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a(((k) obj).k());
                        return bp0.k.f22762a;
                    }
                }, 6, (Object) null);
            }
        });
        gVar.P();
        return e11;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return c((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
