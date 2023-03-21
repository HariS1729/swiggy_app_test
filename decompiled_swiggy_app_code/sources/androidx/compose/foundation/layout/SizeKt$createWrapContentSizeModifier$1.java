package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import d2.l;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.a;

/* compiled from: Size.kt */
final class SizeKt$createWrapContentSizeModifier$1 extends Lambda implements p<d2.p, LayoutDirection, l> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f3843a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SizeKt$createWrapContentSizeModifier$1(a aVar) {
        super(2);
        this.f3843a = aVar;
    }

    public final long a(long j, LayoutDirection layoutDirection) {
        kotlin.jvm.internal.p.j(layoutDirection, "layoutDirection");
        return this.f3843a.a(d2.p.f14019b.a(), j, layoutDirection);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return l.b(a(((d2.p) obj).j(), (LayoutDirection) obj2));
    }
}
