package v1;

import kotlin.jvm.internal.p;

/* compiled from: EditCommand.kt */
public final class w implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f17229a;

    /* renamed from: b  reason: collision with root package name */
    private final int f17230b;

    public w(int i11, int i12) {
        this.f17229a = i11;
        this.f17230b = i12;
    }

    public void a(g gVar) {
        p.j(gVar, "buffer");
        if (gVar.l()) {
            gVar.a();
        }
        int m11 = l.m(this.f17229a, 0, gVar.h());
        int m12 = l.m(this.f17230b, 0, gVar.h());
        if (m11 == m12) {
            return;
        }
        if (m11 < m12) {
            gVar.n(m11, m12);
        } else {
            gVar.n(m12, m11);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f17229a == wVar.f17229a && this.f17230b == wVar.f17230b;
    }

    public int hashCode() {
        return (this.f17229a * 31) + this.f17230b;
    }

    public String toString() {
        return "SetComposingRegionCommand(start=" + this.f17229a + ", end=" + this.f17230b + ')';
    }
}
