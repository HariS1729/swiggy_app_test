package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.e;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.s;

/* compiled from: Row.kt */
final class RowKt$rowMeasurePolicy$1$1 extends Lambda implements s<Integer, int[], LayoutDirection, e, int[], k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Arrangement.d f3805a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RowKt$rowMeasurePolicy$1$1(Arrangement.d dVar) {
        super(5);
        this.f3805a = dVar;
    }

    public /* bridge */ /* synthetic */ Object P(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        a(((Number) obj).intValue(), (int[]) obj2, (LayoutDirection) obj3, (e) obj4, (int[]) obj5);
        return k.f22762a;
    }

    public final void a(int i11, int[] iArr, LayoutDirection layoutDirection, e eVar, int[] iArr2) {
        p.j(iArr, "size");
        p.j(layoutDirection, "layoutDirection");
        p.j(eVar, "density");
        p.j(iArr2, "outPosition");
        this.f3805a.c(eVar, i11, iArr, layoutDirection, iArr2);
    }
}
