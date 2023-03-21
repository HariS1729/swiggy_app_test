package p1;

import a2.l;
import androidx.compose.ui.unit.LayoutDirection;
import d2.e;
import java.util.List;
import kotlin.jvm.internal.p;
import p1.b;
import u1.h;
import u1.i;

/* compiled from: TextLayoutResult.kt */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private final b f16185a;

    /* renamed from: b  reason: collision with root package name */
    private final c0 f16186b;

    /* renamed from: c  reason: collision with root package name */
    private final List<b.C0163b<o>> f16187c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16188d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f16189e;

    /* renamed from: f  reason: collision with root package name */
    private final int f16190f;

    /* renamed from: g  reason: collision with root package name */
    private final e f16191g;

    /* renamed from: h  reason: collision with root package name */
    private final LayoutDirection f16192h;

    /* renamed from: i  reason: collision with root package name */
    private final i.b f16193i;
    private final long j;
    private h.a k;

    private x(b bVar, c0 c0Var, List<b.C0163b<o>> list, int i11, boolean z11, int i12, e eVar, LayoutDirection layoutDirection, h.a aVar, i.b bVar2, long j11) {
        this.f16185a = bVar;
        this.f16186b = c0Var;
        this.f16187c = list;
        this.f16188d = i11;
        this.f16189e = z11;
        this.f16190f = i12;
        this.f16191g = eVar;
        this.f16192h = layoutDirection;
        this.f16193i = bVar2;
        this.j = j11;
        this.k = aVar;
    }

    public /* synthetic */ x(b bVar, c0 c0Var, List list, int i11, boolean z11, int i12, e eVar, LayoutDirection layoutDirection, i.b bVar2, long j11, kotlin.jvm.internal.i iVar) {
        this(bVar, c0Var, list, i11, z11, i12, eVar, layoutDirection, bVar2, j11);
    }

    public final long a() {
        return this.j;
    }

    public final e b() {
        return this.f16191g;
    }

    public final i.b c() {
        return this.f16193i;
    }

    public final LayoutDirection d() {
        return this.f16192h;
    }

    public final int e() {
        return this.f16188d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return p.e(this.f16185a, xVar.f16185a) && p.e(this.f16186b, xVar.f16186b) && p.e(this.f16187c, xVar.f16187c) && this.f16188d == xVar.f16188d && this.f16189e == xVar.f16189e && l.d(this.f16190f, xVar.f16190f) && p.e(this.f16191g, xVar.f16191g) && this.f16192h == xVar.f16192h && p.e(this.f16193i, xVar.f16193i) && d2.b.g(this.j, xVar.j);
    }

    public final int f() {
        return this.f16190f;
    }

    public final List<b.C0163b<o>> g() {
        return this.f16187c;
    }

    public final boolean h() {
        return this.f16189e;
    }

    public int hashCode() {
        return (((((((((((((((((this.f16185a.hashCode() * 31) + this.f16186b.hashCode()) * 31) + this.f16187c.hashCode()) * 31) + this.f16188d) * 31) + a0.h.a(this.f16189e)) * 31) + l.e(this.f16190f)) * 31) + this.f16191g.hashCode()) * 31) + this.f16192h.hashCode()) * 31) + this.f16193i.hashCode()) * 31) + d2.b.q(this.j);
    }

    public final c0 i() {
        return this.f16186b;
    }

    public final b j() {
        return this.f16185a;
    }

    public String toString() {
        return "TextLayoutInput(text=" + this.f16185a + ", style=" + this.f16186b + ", placeholders=" + this.f16187c + ", maxLines=" + this.f16188d + ", softWrap=" + this.f16189e + ", overflow=" + l.f(this.f16190f) + ", density=" + this.f16191g + ", layoutDirection=" + this.f16192h + ", fontFamilyResolver=" + this.f16193i + ", constraints=" + d2.b.s(this.j) + ')';
    }

    private x(b bVar, c0 c0Var, List<b.C0163b<o>> list, int i11, boolean z11, int i12, e eVar, LayoutDirection layoutDirection, i.b bVar2, long j11) {
        this(bVar, c0Var, list, i11, z11, i12, eVar, layoutDirection, (h.a) null, bVar2, j11);
    }
}
