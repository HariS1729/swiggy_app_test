package androidx.compose.foundation.gestures;

import androidx.compose.foundation.AndroidOverscrollKt;
import defpackage.v1;
import defpackage.y1;
import e0.g;
import p.p;
import s.l;

/* compiled from: Scrollable.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f3627a = new b();

    private b() {
    }

    public final y1.k a(g gVar, int i11) {
        gVar.E(1107739818);
        v1.u b11 = p.b(gVar, 0);
        gVar.E(1157296644);
        boolean k = gVar.k(b11);
        Object F = gVar.F();
        if (k || F == g.f14172a.a()) {
            F = new DefaultFlingBehavior(b11);
            gVar.y(F);
        }
        gVar.P();
        DefaultFlingBehavior defaultFlingBehavior = (DefaultFlingBehavior) F;
        gVar.P();
        return defaultFlingBehavior;
    }

    public final l b(g gVar, int i11) {
        gVar.E(1809802212);
        l b11 = AndroidOverscrollKt.b(gVar, 0);
        gVar.P();
        return b11;
    }
}
