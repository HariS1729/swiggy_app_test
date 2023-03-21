package v1;

import kotlin.jvm.internal.p;

/* compiled from: EditCommand.kt */
public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f17063a;

    /* renamed from: b  reason: collision with root package name */
    private final int f17064b;

    public c(int i11, int i12) {
        this.f17063a = i11;
        this.f17064b = i12;
        if (!(i11 >= 0 && i12 >= 0)) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i11 + " and " + i12 + " respectively.").toString());
        }
    }

    public void a(g gVar) {
        p.j(gVar, "buffer");
        int i11 = this.f17063a;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12++;
            if (gVar.k() > i12 && e.b(gVar.c((gVar.k() - i12) - 1), gVar.c(gVar.k() - i12))) {
                i12++;
            }
            if (i12 == gVar.k()) {
                break;
            }
        }
        int i14 = this.f17064b;
        int i15 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            i15++;
            if (gVar.j() + i15 < gVar.h() && e.b(gVar.c((gVar.j() + i15) - 1), gVar.c(gVar.j() + i15))) {
                i15++;
            }
            if (gVar.j() + i15 == gVar.h()) {
                break;
            }
        }
        gVar.b(gVar.j(), gVar.j() + i15);
        gVar.b(gVar.k() - i12, gVar.k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f17063a == cVar.f17063a && this.f17064b == cVar.f17064b;
    }

    public int hashCode() {
        return (this.f17063a * 31) + this.f17064b;
    }

    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.f17063a + ", lengthAfterCursor=" + this.f17064b + ')';
    }
}
