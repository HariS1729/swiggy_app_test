package androidx.compose.foundation;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.q;
import p0.d;
import s.h;
import u.j;

/* compiled from: Clickable.kt */
final class ClickableKt$clickable$2 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f2902a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f2903b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ n1.g f2904c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a<k> f2905d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClickableKt$clickable$2(boolean z11, String str, n1.g gVar, a<k> aVar) {
        super(3);
        this.f2902a = z11;
        this.f2903b = str;
        this.f2904c = gVar;
        this.f2905d = aVar;
    }

    public final d a(d dVar, g gVar, int i11) {
        p.j(dVar, "$this$composed");
        gVar.E(-756081143);
        d.a aVar = d.f16037h0;
        h hVar = (h) gVar.z(IndicationKt.a());
        gVar.E(-492369756);
        Object F = gVar.F();
        if (F == g.f14172a.a()) {
            F = j.a();
            gVar.y(F);
        }
        gVar.P();
        d b11 = ClickableKt.b(aVar, (u.k) F, hVar, this.f2902a, this.f2903b, this.f2904c, this.f2905d);
        gVar.P();
        return b11;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
