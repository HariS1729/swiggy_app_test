package v1;

import kotlin.jvm.internal.p;

/* compiled from: EditCommand.kt */
public final class y implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f17243a;

    /* renamed from: b  reason: collision with root package name */
    private final int f17244b;

    public y(int i11, int i12) {
        this.f17243a = i11;
        this.f17244b = i12;
    }

    public void a(g gVar) {
        p.j(gVar, "buffer");
        int m11 = l.m(this.f17243a, 0, gVar.h());
        int m12 = l.m(this.f17244b, 0, gVar.h());
        if (m11 < m12) {
            gVar.p(m11, m12);
        } else {
            gVar.p(m12, m11);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f17243a == yVar.f17243a && this.f17244b == yVar.f17244b;
    }

    public int hashCode() {
        return (this.f17243a * 31) + this.f17244b;
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.f17243a + ", end=" + this.f17244b + ')';
    }
}
