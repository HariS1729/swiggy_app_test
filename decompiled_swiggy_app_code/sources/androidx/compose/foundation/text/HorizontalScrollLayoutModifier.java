package androidx.compose.foundation.text;

import a0.s;
import d2.b;
import i1.e0;
import i1.i;
import i1.j;
import i1.q;
import i1.r;
import i1.u;
import i1.v;
import i1.w;
import java.util.Map;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.l;
import p0.c;
import p0.d;
import p0.e;
import v1.d0;

/* compiled from: TextFieldScroll.kt */
final class HorizontalScrollLayoutModifier implements q {

    /* renamed from: a  reason: collision with root package name */
    private final TextFieldScrollerPosition f4455a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4456b;

    /* renamed from: c  reason: collision with root package name */
    private final d0 f4457c;

    /* renamed from: d  reason: collision with root package name */
    private final a<s> f4458d;

    public HorizontalScrollLayoutModifier(TextFieldScrollerPosition textFieldScrollerPosition, int i11, d0 d0Var, a<s> aVar) {
        p.j(textFieldScrollerPosition, "scrollerPosition");
        p.j(d0Var, "transformedText");
        p.j(aVar, "textLayoutResultProvider");
        this.f4455a = textFieldScrollerPosition;
        this.f4456b = i11;
        this.f4457c = d0Var;
        this.f4458d = aVar;
    }

    public u K(w wVar, r rVar, long j) {
        long j11;
        p.j(wVar, "$this$measure");
        p.j(rVar, "measurable");
        if (rVar.L(b.m(j)) < b.n(j)) {
            j11 = j;
        } else {
            j11 = b.e(j, 0, Integer.MAX_VALUE, 0, 0, 13, (Object) null);
        }
        e0 N = rVar.N(j11);
        int min = Math.min(N.A0(), b.n(j));
        return v.b(wVar, min, N.e0(), (Map) null, new HorizontalScrollLayoutModifier$measure$1(wVar, this, N, min), 4, (Object) null);
    }

    public /* synthetic */ int L(j jVar, i iVar, int i11) {
        return androidx.compose.ui.layout.b.d(this, jVar, iVar, i11);
    }

    public /* synthetic */ d N(d dVar) {
        return c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return e.c(this, obj, pVar);
    }

    public final int a() {
        return this.f4456b;
    }

    public final TextFieldScrollerPosition c() {
        return this.f4455a;
    }

    public final a<s> d() {
        return this.f4458d;
    }

    public final d0 e() {
        return this.f4457c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorizontalScrollLayoutModifier)) {
            return false;
        }
        HorizontalScrollLayoutModifier horizontalScrollLayoutModifier = (HorizontalScrollLayoutModifier) obj;
        return p.e(this.f4455a, horizontalScrollLayoutModifier.f4455a) && this.f4456b == horizontalScrollLayoutModifier.f4456b && p.e(this.f4457c, horizontalScrollLayoutModifier.f4457c) && p.e(this.f4458d, horizontalScrollLayoutModifier.f4458d);
    }

    public /* synthetic */ int f0(j jVar, i iVar, int i11) {
        return androidx.compose.ui.layout.b.a(this, jVar, iVar, i11);
    }

    public int hashCode() {
        return (((((this.f4455a.hashCode() * 31) + this.f4456b) * 31) + this.f4457c.hashCode()) * 31) + this.f4458d.hashCode();
    }

    public /* synthetic */ int n0(j jVar, i iVar, int i11) {
        return androidx.compose.ui.layout.b.c(this, jVar, iVar, i11);
    }

    public /* synthetic */ int p(j jVar, i iVar, int i11) {
        return androidx.compose.ui.layout.b.b(this, jVar, iVar, i11);
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return e.b(this, obj, pVar);
    }

    public String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f4455a + ", cursorOffset=" + this.f4456b + ", transformedText=" + this.f4457c + ", textLayoutResultProvider=" + this.f4458d + ')';
    }

    public /* synthetic */ boolean x(l lVar) {
        return e.a(this, lVar);
    }
}
