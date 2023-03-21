package androidx.compose.animation;

import defpackage.v1;
import lp0.p;
import p.l;

/* compiled from: AnimatedContent.kt */
final class e implements l {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f2818a;

    /* renamed from: b  reason: collision with root package name */
    private final p<d2.p, d2.p, v1.a0<d2.p>> f2819b;

    public e(boolean z11, p<? super d2.p, ? super d2.p, ? extends v1.a0<d2.p>> pVar) {
        kotlin.jvm.internal.p.j(pVar, "sizeAnimationSpec");
        this.f2818a = z11;
        this.f2819b = pVar;
    }

    public boolean a() {
        return this.f2818a;
    }

    public v1.a0<d2.p> b(long j, long j11) {
        return this.f2819b.invoke(d2.p.b(j), d2.p.b(j11));
    }
}
