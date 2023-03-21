package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.HoverInteractionKt;
import androidx.compose.foundation.interaction.PressInteractionKt;
import e0.d1;
import kotlin.jvm.internal.p;
import s.h;
import s.i;
import u0.d0;
import u0.e0;
import w0.e;
import w0.g;

/* compiled from: Indication.kt */
final class c implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final c f3182a = new c();

    /* compiled from: Indication.kt */
    private static final class a implements i {

        /* renamed from: a  reason: collision with root package name */
        private final d1<Boolean> f3183a;

        /* renamed from: b  reason: collision with root package name */
        private final d1<Boolean> f3184b;

        /* renamed from: c  reason: collision with root package name */
        private final d1<Boolean> f3185c;

        public a(d1<Boolean> d1Var, d1<Boolean> d1Var2, d1<Boolean> d1Var3) {
            p.j(d1Var, "isPressed");
            p.j(d1Var2, "isHovered");
            p.j(d1Var3, "isFocused");
            this.f3183a = d1Var;
            this.f3184b = d1Var2;
            this.f3185c = d1Var3;
        }

        public void a(w0.c cVar) {
            p.j(cVar, "<this>");
            cVar.V();
            if (this.f3183a.getValue().booleanValue()) {
                e.n(cVar, d0.l(d0.f16756b.a(), 0.3f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0, cVar.d(), 0.0f, (g) null, (e0) null, 0, 122, (Object) null);
            } else if (this.f3184b.getValue().booleanValue() || this.f3185c.getValue().booleanValue()) {
                e.n(cVar, d0.l(d0.f16756b.a(), 0.1f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0, cVar.d(), 0.0f, (g) null, (e0) null, 0, 122, (Object) null);
            }
        }
    }

    private c() {
    }

    public i a(u.i iVar, e0.g gVar, int i11) {
        p.j(iVar, "interactionSource");
        gVar.E(1683566979);
        int i12 = i11 & 14;
        d1<Boolean> a11 = PressInteractionKt.a(iVar, gVar, i12);
        d1<Boolean> a12 = HoverInteractionKt.a(iVar, gVar, i12);
        d1<Boolean> a13 = FocusInteractionKt.a(iVar, gVar, i12);
        gVar.E(1157296644);
        boolean k = gVar.k(iVar);
        Object F = gVar.F();
        if (k || F == e0.g.f14172a.a()) {
            F = new a(a11, a12, a13);
            gVar.y(F);
        }
        gVar.P();
        a aVar = (a) F;
        gVar.P();
        return aVar;
    }
}
