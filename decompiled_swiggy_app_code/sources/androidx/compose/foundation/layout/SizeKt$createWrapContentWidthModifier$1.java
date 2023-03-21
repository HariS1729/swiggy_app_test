package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.LayoutDirection;
import d2.l;
import d2.m;
import kotlin.jvm.internal.Lambda;
import lp0.p;
import p0.a;

/* compiled from: Size.kt */
final class SizeKt$createWrapContentWidthModifier$1 extends Lambda implements p<d2.p, LayoutDirection, l> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a.b f3846a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SizeKt$createWrapContentWidthModifier$1(a.b bVar) {
        super(2);
        this.f3846a = bVar;
    }

    public final long a(long j, LayoutDirection layoutDirection) {
        kotlin.jvm.internal.p.j(layoutDirection, "layoutDirection");
        return m.a(this.f3846a.a(0, d2.p.g(j), layoutDirection), 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return l.b(a(((d2.p) obj).j(), (LayoutDirection) obj2));
    }
}
