package androidx.compose.foundation;

import bp0.k;
import d2.b;
import d2.h;
import i1.e0;
import i1.r;
import i1.u;
import i1.v;
import i1.w;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import lp0.q;
import s.e;

/* compiled from: AndroidOverscroll.kt */
final class AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1 extends Lambda implements q<w, r, b, u> {

    /* renamed from: a  reason: collision with root package name */
    public static final AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1 f2839a = new AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1();

    AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1() {
        super(3);
    }

    public final u a(w wVar, r rVar, long j) {
        p.j(wVar, "$this$layout");
        p.j(rVar, "measurable");
        final e0 N = rVar.N(j);
        final int j02 = wVar.j0(h.n(e.b() * ((float) 2)));
        return v.b(wVar, N.q0() - j02, N.f0() - j02, (Map) null, new l<e0.a, k>() {
            public final void a(e0.a aVar) {
                p.j(aVar, "$this$layout");
                e0 e0Var = N;
                e0.a.v(aVar, e0Var, ((-j02) / 2) - ((e0Var.A0() - N.q0()) / 2), ((-j02) / 2) - ((N.e0() - N.f0()) / 2), 0.0f, (l) null, 12, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((e0.a) obj);
                return k.f22762a;
            }
        }, 4, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((w) obj, (r) obj2, ((b) obj3).t());
    }
}
