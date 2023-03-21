package v1;

import kotlin.jvm.internal.p;

/* compiled from: EditCommand.kt */
public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f17057a;

    /* renamed from: b  reason: collision with root package name */
    private final int f17058b;

    public b(int i11, int i12) {
        this.f17057a = i11;
        this.f17058b = i12;
        if (!(i11 >= 0 && i12 >= 0)) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i11 + " and " + i12 + " respectively.").toString());
        }
    }

    public void a(g gVar) {
        p.j(gVar, "buffer");
        gVar.b(gVar.j(), Math.min(gVar.j() + this.f17058b, gVar.h()));
        gVar.b(Math.max(0, gVar.k() - this.f17057a), gVar.k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f17057a == bVar.f17057a && this.f17058b == bVar.f17058b;
    }

    public int hashCode() {
        return (this.f17057a * 31) + this.f17058b;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.f17057a + ", lengthAfterCursor=" + this.f17058b + ')';
    }
}
