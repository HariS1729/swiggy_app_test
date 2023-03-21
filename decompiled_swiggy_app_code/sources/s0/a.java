package s0;

import androidx.compose.ui.focus.FocusModifier;
import i1.b;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import kotlin.jvm.internal.p;
import lp0.l;
import s0.b;

/* compiled from: BeyondBoundsLayout.kt */
public final class a {
    public static final <T> T a(FocusModifier focusModifier, int i11, l<? super b.a, ? extends T> lVar) {
        int i12;
        p.j(focusModifier, "$this$searchBeyondBounds");
        p.j(lVar, RenderingDetails.TYPE_BLOCK);
        b d11 = focusModifier.d();
        if (d11 == null) {
            return null;
        }
        b.a aVar = b.f16557b;
        if (b.l(i11, aVar.h())) {
            i12 = b.C0130b.f14857a.a();
        } else if (b.l(i11, aVar.a())) {
            i12 = b.C0130b.f14857a.d();
        } else if (b.l(i11, aVar.c())) {
            i12 = b.C0130b.f14857a.e();
        } else if (b.l(i11, aVar.g())) {
            i12 = b.C0130b.f14857a.f();
        } else if (b.l(i11, aVar.d())) {
            i12 = b.C0130b.f14857a.b();
        } else if (b.l(i11, aVar.f())) {
            i12 = b.C0130b.f14857a.c();
        } else {
            throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
        }
        return d11.a(i12, lVar);
    }
}
