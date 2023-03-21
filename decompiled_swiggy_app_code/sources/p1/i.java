package p1;

import kotlin.jvm.internal.p;

/* compiled from: MultiParagraphIntrinsics.kt */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final j f16140a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16141b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16142c;

    public i(j jVar, int i11, int i12) {
        p.j(jVar, "intrinsics");
        this.f16140a = jVar;
        this.f16141b = i11;
        this.f16142c = i12;
    }

    public final int a() {
        return this.f16142c;
    }

    public final j b() {
        return this.f16140a;
    }

    public final int c() {
        return this.f16141b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p.e(this.f16140a, iVar.f16140a) && this.f16141b == iVar.f16141b && this.f16142c == iVar.f16142c;
    }

    public int hashCode() {
        return (((this.f16140a.hashCode() * 31) + this.f16141b) * 31) + this.f16142c;
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f16140a + ", startIndex=" + this.f16141b + ", endIndex=" + this.f16142c + ')';
    }
}
