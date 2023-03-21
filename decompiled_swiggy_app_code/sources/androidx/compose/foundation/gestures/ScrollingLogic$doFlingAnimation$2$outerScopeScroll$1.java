package androidx.compose.foundation.gestures;

import defpackage.y1;
import e1.c;
import kotlin.jvm.internal.Lambda;
import lp0.l;
import t0.f;

/* compiled from: Scrollable.kt */
final class ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1 extends Lambda implements l<f, f> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ScrollingLogic f3536a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ y1.p f3537b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1(ScrollingLogic scrollingLogic, y1.p pVar) {
        super(1);
        this.f3536a = scrollingLogic;
        this.f3537b = pVar;
    }

    public final long a(long j) {
        ScrollingLogic scrollingLogic = this.f3536a;
        return f.q(j, this.f3536a.h(scrollingLogic.a(this.f3537b, scrollingLogic.h(j), (f) null, c.f14279a.b())));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return f.d(a(((f) obj).u()));
    }
}
