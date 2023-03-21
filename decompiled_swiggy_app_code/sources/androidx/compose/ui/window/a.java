package androidx.compose.ui.window;

import androidx.compose.ui.unit.LayoutDirection;
import d2.l;
import d2.m;
import d2.n;
import d2.p;
import d2.q;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Popup.kt */
public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    private final p0.a f7858a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7859b;

    private a(p0.a aVar, long j) {
        this.f7858a = aVar;
        this.f7859b = j;
    }

    public /* synthetic */ a(p0.a aVar, long j, i iVar) {
        this(aVar, j);
    }

    public long a(n nVar, long j, LayoutDirection layoutDirection, long j11) {
        LayoutDirection layoutDirection2 = layoutDirection;
        n nVar2 = nVar;
        p.j(nVar, "anchorBounds");
        p.j(layoutDirection2, "layoutDirection");
        long a11 = m.a(0, 0);
        p0.a aVar = this.f7858a;
        p.a aVar2 = d2.p.f14019b;
        LayoutDirection layoutDirection3 = layoutDirection;
        long a12 = aVar.a(aVar2.a(), q.a(nVar.d(), nVar.a()), layoutDirection3);
        long a13 = this.f7858a.a(aVar2.a(), q.a(d2.p.g(j11), d2.p.f(j11)), layoutDirection3);
        long a14 = m.a(nVar.b(), nVar.c());
        long a15 = m.a(l.j(a11) + l.j(a14), l.k(a11) + l.k(a14));
        long a16 = m.a(l.j(a15) + l.j(a12), l.k(a15) + l.k(a12));
        long a17 = m.a(l.j(a13), l.k(a13));
        long a18 = m.a(l.j(a16) - l.j(a17), l.k(a16) - l.k(a17));
        long a19 = m.a(l.j(this.f7859b) * (layoutDirection2 == LayoutDirection.Ltr ? 1 : -1), l.k(this.f7859b));
        return m.a(l.j(a18) + l.j(a19), l.k(a18) + l.k(a19));
    }
}
