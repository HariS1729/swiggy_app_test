package p1;

import d2.r;

/* compiled from: Placeholder.kt */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final long f16154a;

    /* renamed from: b  reason: collision with root package name */
    private final long f16155b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16156c;

    public final long a() {
        return this.f16155b;
    }

    public final int b() {
        return this.f16156c;
    }

    public final long c() {
        return this.f16154a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return r.e(this.f16154a, oVar.f16154a) && r.e(this.f16155b, oVar.f16155b) && p.i(this.f16156c, oVar.f16156c);
    }

    public int hashCode() {
        return (((r.i(this.f16154a) * 31) + r.i(this.f16155b)) * 31) + p.j(this.f16156c);
    }

    public String toString() {
        return "Placeholder(width=" + r.j(this.f16154a) + ", height=" + r.j(this.f16155b) + ", placeholderVerticalAlign=" + p.k(this.f16156c) + ')';
    }
}
