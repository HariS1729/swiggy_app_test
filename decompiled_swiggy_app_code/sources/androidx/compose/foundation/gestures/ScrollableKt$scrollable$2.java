package androidx.compose.foundation.gestures;

import androidx.compose.foundation.FocusableKt;
import defpackage.y1;
import e0.g;
import e0.m;
import e0.u;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;
import p0.d;
import s.l;
import u.k;
import wp0.j0;

/* compiled from: Scrollable.kt */
final class ScrollableKt$scrollable$2 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Orientation f3502a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ y1.r f3503b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f3504c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k f3505d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ y1.k f3506e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ l f3507f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ boolean f3508g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollableKt$scrollable$2(Orientation orientation, y1.r rVar, boolean z11, k kVar, y1.k kVar2, l lVar, boolean z12) {
        super(3);
        this.f3502a = orientation;
        this.f3503b = rVar;
        this.f3504c = z11;
        this.f3505d = kVar;
        this.f3506e = kVar2;
        this.f3507f = lVar;
        this.f3508g = z12;
    }

    public final d a(d dVar, g gVar, int i11) {
        p.j(dVar, "$this$composed");
        gVar.E(-629830927);
        gVar.E(773894976);
        gVar.E(-492369756);
        Object F = gVar.F();
        if (F == g.f14172a.a()) {
            m mVar = new m(u.i(EmptyCoroutineContext.f25631a, gVar));
            gVar.y(mVar);
            F = mVar;
        }
        gVar.P();
        j0 a11 = ((m) F).a();
        gVar.P();
        Object[] objArr = {a11, this.f3502a, this.f3503b, Boolean.valueOf(this.f3504c)};
        Orientation orientation = this.f3502a;
        y1.r rVar = this.f3503b;
        boolean z11 = this.f3504c;
        gVar.E(-568225417);
        boolean z12 = false;
        for (int i12 = 0; i12 < 4; i12++) {
            z12 |= gVar.k(objArr[i12]);
        }
        Object F2 = gVar.F();
        if (z12 || F2 == g.f14172a.a()) {
            F2 = new ContentInViewModifier(a11, orientation, rVar, z11);
            gVar.y(F2);
        }
        gVar.P();
        d dVar2 = d.f16037h0;
        d c11 = ScrollableKt.g(FocusableKt.b(dVar2).N(((ContentInViewModifier) F2).g()), this.f3505d, this.f3502a, this.f3504c, this.f3503b, this.f3506e, this.f3507f, this.f3508g, gVar, 0);
        if (this.f3508g) {
            dVar2 = a.f3624a;
        }
        d N = c11.N(dVar2);
        gVar.P();
        return N;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
