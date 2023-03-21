package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
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

/* compiled from: Clickable.kt */
final class ClickableKt$clickable$4 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ lp0.a<k> f2906a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f2907b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ u.k f2908c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ h f2909d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f2910e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ n1.g f2911f;

    /* compiled from: Clickable.kt */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h0<Boolean> f2912a;

        a(h0<Boolean> h0Var) {
            this.f2912a = h0Var;
        }

        public void D(e eVar) {
            p.j(eVar, "scope");
            this.f2912a.setValue(eVar.a(ScrollableKt.e()));
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
    ClickableKt$clickable$4(lp0.a<k> aVar, boolean z11, u.k kVar, h hVar, String str, n1.g gVar) {
        super(3);
        this.f2906a = aVar;
        this.f2907b = z11;
        this.f2908c = kVar;
        this.f2909d = hVar;
        this.f2910e = str;
        this.f2911f = gVar;
    }

    public final d a(d dVar, g gVar, int i11) {
        g gVar2 = gVar;
        p.j(dVar, "$this$composed");
        gVar2.E(92076020);
        d1<T> m11 = androidx.compose.runtime.g.m(this.f2906a, gVar2, 0);
        gVar2.E(-492369756);
        Object F = gVar.F();
        g.a aVar = g.f14172a;
        if (F == aVar.a()) {
            F = j.e((Object) null, (a1) null, 2, (Object) null);
            gVar2.y(F);
        }
        gVar.P();
        h0 h0Var = (h0) F;
        gVar2.E(1841981204);
        if (this.f2907b) {
            ClickableKt.a(this.f2908c, h0Var, gVar2, 48);
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
        d1 m12 = androidx.compose.runtime.g.m(new ClickableKt$clickable$4$delayPressInteraction$1(h0Var2, d11), gVar2, 0);
        d.a aVar2 = d.f16037h0;
        u.k kVar = this.f2908c;
        Boolean valueOf = Boolean.valueOf(this.f2907b);
        h0 h0Var3 = h0Var;
        d1 d1Var = m12;
        ClickableKt$clickable$4$gesture$1 clickableKt$clickable$4$gesture$1 = r4;
        ClickableKt$clickable$4$gesture$1 clickableKt$clickable$4$gesture$12 = new ClickableKt$clickable$4$gesture$1(this.f2907b, this.f2908c, h0Var3, d1Var, m11, (fp0.c<? super ClickableKt$clickable$4$gesture$1>) null);
        d b11 = SuspendingPointerInputFilterKt.b(aVar2, kVar, valueOf, clickableKt$clickable$4$gesture$1);
        gVar2.E(-492369756);
        Object F3 = gVar.F();
        if (F3 == aVar.a()) {
            F3 = new a(h0Var2);
            gVar2.y(F3);
        }
        gVar.P();
        d f11 = ClickableKt.f(aVar2.N((d) F3), b11, this.f2908c, this.f2909d, this.f2907b, this.f2910e, this.f2911f, (String) null, (lp0.a<k>) null, this.f2906a);
        gVar.P();
        return f11;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
