package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Clickable_androidKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.state.ToggleableState;
import bp0.k;
import e0.a1;
import e0.d1;
import e0.g;
import e0.h0;
import j1.b;
import j1.e;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import lp0.q;
import p0.c;
import p0.d;
import s.h;

/* compiled from: Toggleable.kt */
final class ToggleableKt$toggleableImpl$1 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ lp0.a<k> f4186a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f4187b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ u.k f4188c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ h f4189d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ n1.g f4190e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ToggleableState f4191f;

    /* compiled from: Toggleable.kt */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h0<Boolean> f4192a;

        a(h0<Boolean> h0Var) {
            this.f4192a = h0Var;
        }

        public void D(e eVar) {
            p.j(eVar, "scope");
            this.f4192a.setValue(eVar.a(ScrollableKt.e()));
        }

        public /* synthetic */ d N(d dVar) {
            return c.a(this, dVar);
        }

        public /* synthetic */ Object W(Object obj, lp0.p pVar) {
            return p0.e.c(this, obj, pVar);
        }

        public /* synthetic */ Object s(Object obj, lp0.p pVar) {
            return p0.e.b(this, obj, pVar);
        }

        public /* synthetic */ boolean x(l lVar) {
            return p0.e.a(this, lVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ToggleableKt$toggleableImpl$1(lp0.a<k> aVar, boolean z11, u.k kVar, h hVar, n1.g gVar, ToggleableState toggleableState) {
        super(3);
        this.f4186a = aVar;
        this.f4187b = z11;
        this.f4188c = kVar;
        this.f4189d = hVar;
        this.f4190e = gVar;
        this.f4191f = toggleableState;
    }

    public final d a(d dVar, g gVar, int i11) {
        d dVar2 = dVar;
        g gVar2 = gVar;
        p.j(dVar2, "$this$composed");
        gVar2.E(2121285826);
        gVar2.E(-492369756);
        Object F = gVar.F();
        g.a aVar = g.f14172a;
        if (F == aVar.a()) {
            F = j.e((Object) null, (a1) null, 2, (Object) null);
            gVar2.y(F);
        }
        gVar.P();
        h0 h0Var = (h0) F;
        d.a aVar2 = d.f16037h0;
        d b11 = SemanticsModifierKt.b(aVar2, true, new ToggleableKt$toggleableImpl$1$semantics$1(this.f4190e, this.f4191f, this.f4187b, this.f4186a));
        d1<T> m11 = androidx.compose.runtime.g.m(this.f4186a, gVar2, 0);
        gVar2.E(-2134919160);
        if (this.f4187b) {
            ClickableKt.a(this.f4188c, h0Var, gVar2, 48);
        }
        gVar.P();
        lp0.a<Boolean> d11 = Clickable_androidKt.d(gVar2, 0);
        gVar2.E(-492369756);
        Object F2 = gVar.F();
        if (F2 == aVar.a()) {
            F2 = j.e(Boolean.TRUE, (a1) null, 2, (Object) null);
            gVar2.y(F2);
        }
        gVar.P();
        h0 h0Var2 = (h0) F2;
        d1 m12 = androidx.compose.runtime.g.m(new ToggleableKt$toggleableImpl$1$delayPressInteraction$1(h0Var2, d11), gVar2, 0);
        u.k kVar = this.f4188c;
        Boolean valueOf = Boolean.valueOf(this.f4187b);
        ToggleableKt$toggleableImpl$1$gestures$1 toggleableKt$toggleableImpl$1$gestures$1 = r9;
        ToggleableKt$toggleableImpl$1$gestures$1 toggleableKt$toggleableImpl$1$gestures$12 = new ToggleableKt$toggleableImpl$1$gestures$1(this.f4187b, this.f4188c, h0Var, m12, m11, (fp0.c<? super ToggleableKt$toggleableImpl$1$gestures$1>) null);
        d b12 = SuspendingPointerInputFilterKt.b(aVar2, kVar, valueOf, toggleableKt$toggleableImpl$1$gestures$1);
        gVar2.E(-492369756);
        Object F3 = gVar.F();
        if (F3 == aVar.a()) {
            F3 = new a(h0Var2);
            gVar2.y(F3);
        }
        gVar.P();
        d N = FocusableKt.e(HoverableKt.a(IndicationKt.b(dVar2.N((d) F3).N(b11), this.f4188c, this.f4189d), this.f4188c, this.f4187b), this.f4187b, this.f4188c).N(b12);
        gVar.P();
        return N;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
