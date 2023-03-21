package androidx.compose.foundation;

import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import b1.a;
import b1.b;
import e0.g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import lp0.q;
import p0.d;
import u.k;

/* compiled from: Focusable.kt */
final class FocusableKt$focusableInNonTouchMode$2 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f3001a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k f3002b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FocusableKt$focusableInNonTouchMode$2(boolean z11, k kVar) {
        super(3);
        this.f3001a = z11;
        this.f3002b = kVar;
    }

    public final d a(d dVar, g gVar, int i11) {
        p.j(dVar, "$this$composed");
        gVar.E(-618949501);
        final b bVar = (b) gVar.z(CompositionLocalsKt.i());
        d c11 = FocusableKt.c(FocusPropertiesKt.b(d.f16037h0, new l<s0.l, bp0.k>() {
            public final void a(s0.l lVar) {
                p.j(lVar, "$this$focusProperties");
                lVar.e(!a.f(bVar.a(), a.f12567b.b()));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((s0.l) obj);
                return bp0.k.f22762a;
            }
        }), this.f3001a, this.f3002b);
        gVar.P();
        return c11;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
