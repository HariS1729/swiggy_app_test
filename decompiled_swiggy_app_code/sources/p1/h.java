package p1;

import kotlin.jvm.internal.p;
import t0.f;
import t0.g;
import u0.w0;

/* compiled from: MultiParagraph.kt */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final g f16104a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16105b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16106c;

    /* renamed from: d  reason: collision with root package name */
    private int f16107d;

    /* renamed from: e  reason: collision with root package name */
    private int f16108e;

    /* renamed from: f  reason: collision with root package name */
    private float f16109f;

    /* renamed from: g  reason: collision with root package name */
    private float f16110g;

    public h(g gVar, int i11, int i12, int i13, int i14, float f11, float f12) {
        p.j(gVar, "paragraph");
        this.f16104a = gVar;
        this.f16105b = i11;
        this.f16106c = i12;
        this.f16107d = i13;
        this.f16108e = i14;
        this.f16109f = f11;
        this.f16110g = f12;
    }

    public final float a() {
        return this.f16110g;
    }

    public final int b() {
        return this.f16106c;
    }

    public final int c() {
        return this.f16108e;
    }

    public final int d() {
        return this.f16106c - this.f16105b;
    }

    public final g e() {
        return this.f16104a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p.e(this.f16104a, hVar.f16104a) && this.f16105b == hVar.f16105b && this.f16106c == hVar.f16106c && this.f16107d == hVar.f16107d && this.f16108e == hVar.f16108e && p.e(Float.valueOf(this.f16109f), Float.valueOf(hVar.f16109f)) && p.e(Float.valueOf(this.f16110g), Float.valueOf(hVar.f16110g));
    }

    public final int f() {
        return this.f16105b;
    }

    public final int g() {
        return this.f16107d;
    }

    public final float h() {
        return this.f16109f;
    }

    public int hashCode() {
        return (((((((((((this.f16104a.hashCode() * 31) + this.f16105b) * 31) + this.f16106c) * 31) + this.f16107d) * 31) + this.f16108e) * 31) + Float.floatToIntBits(this.f16109f)) * 31) + Float.floatToIntBits(this.f16110g);
    }

    public final t0.h i(t0.h hVar) {
        p.j(hVar, "<this>");
        return hVar.r(g.a(0.0f, this.f16109f));
    }

    public final w0 j(w0 w0Var) {
        p.j(w0Var, "<this>");
        w0Var.e(g.a(0.0f, this.f16109f));
        return w0Var;
    }

    public final long k(long j) {
        return b0.b(l(a0.n(j)), l(a0.i(j)));
    }

    public final int l(int i11) {
        return i11 + this.f16105b;
    }

    public final int m(int i11) {
        return i11 + this.f16107d;
    }

    public final float n(float f11) {
        return f11 + this.f16109f;
    }

    public final long o(long j) {
        return g.a(f.m(j), f.n(j) - this.f16109f);
    }

    public final int p(int i11) {
        return l.m(i11, this.f16105b, this.f16106c) - this.f16105b;
    }

    public final int q(int i11) {
        return i11 - this.f16107d;
    }

    public final float r(float f11) {
        return f11 - this.f16109f;
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.f16104a + ", startIndex=" + this.f16105b + ", endIndex=" + this.f16106c + ", startLineIndex=" + this.f16107d + ", endLineIndex=" + this.f16108e + ", top=" + this.f16109f + ", bottom=" + this.f16110g + ')';
    }
}
