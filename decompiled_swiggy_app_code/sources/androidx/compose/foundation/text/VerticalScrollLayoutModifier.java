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
final class VerticalScrollLayoutModifier implements q {

    /* renamed from: a  reason: collision with root package name */
    private final TextFieldScrollerPosition f4652a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4653b;

    /* renamed from: c  reason: collision with root package name */
    private final d0 f4654c;

    /* renamed from: d  reason: collision with root package name */
    private final a<s> f4655d;

    public VerticalScrollLayoutModifier(TextFieldScrollerPosition textFieldScrollerPosition, int i11, d0 d0Var, a<s> aVar) {
        p.j(textFieldScrollerPosition, "scrollerPosition");
        p.j(d0Var, "transformedText");
        p.j(aVar, "textLayoutResultProvider");
        this.f4652a = textFieldScrollerPosition;
        this.f4653b = i11;
        this.f4654c = d0Var;
        this.f4655d = aVar;
    }

    public u K(w wVar, r rVar, long j) {
        p.j(wVar, "$this$measure");
        p.j(rVar, "measurable");
        e0 N = rVar.N(b.e(j, 0, 0, 0, Integer.MAX_VALUE, 7, (Object) null));
        int min = Math.min(N.e0(), b.m(j));
        return v.b(wVar, N.A0(), min, (Map) null, new VerticalScrollLayoutModifier$measure$1(wVar, this, N, min), 4, (Object) null);
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
        return this.f4653b;
    }

    public final TextFieldScrollerPosition c() {
        return this.f4652a;
    }

    public final a<s> d() {
        return this.f4655d;
    }

    public final d0 e() {
        return this.f4654c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalScrollLayoutModifier)) {
            return false;
        }
        VerticalScrollLayoutModifier verticalScrollLayoutModifier = (VerticalScrollLayoutModifier) obj;
        return p.e(this.f4652a, verticalScrollLayoutModifier.f4652a) && this.f4653b == verticalScrollLayoutModifier.f4653b && p.e(this.f4654c, verticalScrollLayoutModifier.f4654c) && p.e(this.f4655d, verticalScrollLayoutModifier.f4655d);
    }

    public /* synthetic */ int f0(j jVar, i iVar, int i11) {
        return androidx.compose.ui.layout.b.a(this, jVar, iVar, i11);
    }

    public int hashCode() {
        return (((((this.f4652a.hashCode() * 31) + this.f4653b) * 31) + this.f4654c.hashCode()) * 31) + this.f4655d.hashCode();
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
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f4652a + ", cursorOffset=" + this.f4653b + ", transformedText=" + this.f4654c + ", textLayoutResultProvider=" + this.f4655d + ')';
    }

    public /* synthetic */ boolean x(l lVar) {
        return e.a(this, lVar);
    }
}
