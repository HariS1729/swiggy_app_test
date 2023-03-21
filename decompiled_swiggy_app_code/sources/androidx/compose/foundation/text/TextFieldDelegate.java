package androidx.compose.foundation.text;

import a0.n;
import a2.a;
import a2.e;
import a2.h;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import p1.a0;
import p1.b;
import p1.b0;
import p1.u;
import p1.y;
import p1.z;
import u0.h1;
import u0.t0;
import u0.x;
import u1.s;
import u1.t;
import u1.v;
import v1.c0;
import v1.d;
import v1.d0;
import v1.f;
import v1.m;

/* compiled from: TextFieldDelegate.kt */
public final class TextFieldDelegate {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f4538a = new Companion((i) null);

    /* compiled from: TextFieldDelegate.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final void f(List<? extends d> list, f fVar, l<? super TextFieldValue, k> lVar) {
            lVar.invoke(fVar.a(list));
        }

        public final d0 b(long j, d0 d0Var) {
            p.j(d0Var, "transformed");
            b.a aVar = new b.a(d0Var.b());
            aVar.b(new u(0, 0, (v) null, (s) null, (t) null, (u1.i) null, (String) null, 0, (a) null, (h) null, (w1.f) null, 0, e.f915b.d(), (h1) null, 12287, (i) null), d0Var.a().b(a0.n(j)), d0Var.a().b(a0.i(j)));
            return new d0(aVar.h(), d0Var.a());
        }

        public final void c(x xVar, TextFieldValue textFieldValue, v1.s sVar, y yVar, t0 t0Var) {
            int b11;
            int b12;
            p.j(xVar, "canvas");
            p.j(textFieldValue, "value");
            p.j(sVar, "offsetMapping");
            p.j(yVar, "textLayoutResult");
            p.j(t0Var, "selectionPaint");
            if (!a0.h(textFieldValue.g()) && (b11 = sVar.b(a0.l(textFieldValue.g()))) != (b12 = sVar.b(a0.k(textFieldValue.g())))) {
                xVar.r(yVar.y(b11, b12), t0Var);
            }
            z.f16200a.a(xVar, yVar);
        }

        public final Triple<Integer, Integer, y> d(n nVar, long j, LayoutDirection layoutDirection, y yVar) {
            p.j(nVar, "textDelegate");
            p.j(layoutDirection, "layoutDirection");
            y l11 = nVar.l(j, layoutDirection, yVar);
            return new Triple<>(Integer.valueOf(d2.p.g(l11.A())), Integer.valueOf(d2.p.f(l11.A())), l11);
        }

        public final void e(c0 c0Var, f fVar, l<? super TextFieldValue, k> lVar) {
            p.j(c0Var, "textInputSession");
            p.j(fVar, "editProcessor");
            p.j(lVar, "onValueChange");
            lVar.invoke(TextFieldValue.d(fVar.c(), (b) null, 0, (a0) null, 3, (Object) null));
            c0Var.a();
        }

        public final c0 g(v1.a0 a0Var, TextFieldValue textFieldValue, f fVar, m mVar, l<? super TextFieldValue, k> lVar, l<? super v1.l, k> lVar2) {
            p.j(a0Var, "textInputService");
            p.j(textFieldValue, "value");
            p.j(fVar, "editProcessor");
            p.j(mVar, "imeOptions");
            p.j(lVar, "onValueChange");
            p.j(lVar2, "onImeActionPerformed");
            return h(a0Var, textFieldValue, fVar, mVar, lVar, lVar2);
        }

        public final c0 h(v1.a0 a0Var, TextFieldValue textFieldValue, f fVar, m mVar, l<? super TextFieldValue, k> lVar, l<? super v1.l, k> lVar2) {
            p.j(a0Var, "textInputService");
            p.j(textFieldValue, "value");
            p.j(fVar, "editProcessor");
            p.j(mVar, "imeOptions");
            p.j(lVar, "onValueChange");
            p.j(lVar2, "onImeActionPerformed");
            return a0Var.d(textFieldValue, mVar, new TextFieldDelegate$Companion$restartInput$1(fVar, lVar), lVar2);
        }

        public final void i(long j, a0.s sVar, f fVar, v1.s sVar2, l<? super TextFieldValue, k> lVar) {
            p.j(sVar, "textLayoutResult");
            p.j(fVar, "editProcessor");
            p.j(sVar2, "offsetMapping");
            p.j(lVar, "onValueChange");
            lVar.invoke(TextFieldValue.d(fVar.c(), (b) null, b0.a(sVar2.a(a0.s.h(sVar, j, false, 2, (Object) null))), (a0) null, 5, (Object) null));
        }
    }
}
