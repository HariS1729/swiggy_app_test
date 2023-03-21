package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.a;

/* compiled from: Arrangement.kt */
final class Arrangement$spacedBy$1 extends Lambda implements p<Integer, LayoutDirection, Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final Arrangement$spacedBy$1 f3671a = new Arrangement$spacedBy$1();

    Arrangement$spacedBy$1() {
        super(2);
    }

    public final Integer a(int i11, LayoutDirection layoutDirection) {
        kotlin.jvm.internal.p.j(layoutDirection, "layoutDirection");
        return Integer.valueOf(a.f16019a.k().a(0, i11, layoutDirection));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a(((Number) obj).intValue(), (LayoutDirection) obj2);
    }
}
