package v1;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import p1.b;

/* compiled from: EditCommand.kt */
public final class x implements d {

    /* renamed from: a  reason: collision with root package name */
    private final b f17236a;

    /* renamed from: b  reason: collision with root package name */
    private final int f17237b;

    public x(b bVar, int i11) {
        p.j(bVar, "annotatedString");
        this.f17236a = bVar;
        this.f17237b = i11;
    }

    public void a(g gVar) {
        int i11;
        p.j(gVar, "buffer");
        if (gVar.l()) {
            int f11 = gVar.f();
            gVar.m(gVar.f(), gVar.e(), b());
            if (b().length() > 0) {
                gVar.n(f11, b().length() + f11);
            }
        } else {
            int k = gVar.k();
            gVar.m(gVar.k(), gVar.j(), b());
            if (b().length() > 0) {
                gVar.n(k, b().length() + k);
            }
        }
        int g11 = gVar.g();
        int i12 = this.f17237b;
        if (i12 > 0) {
            i11 = (g11 + i12) - 1;
        } else {
            i11 = (g11 + i12) - b().length();
        }
        gVar.o(l.m(i11, 0, gVar.h()));
    }

    public final String b() {
        return this.f17236a.g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return p.e(b(), xVar.b()) && this.f17237b == xVar.f17237b;
    }

    public int hashCode() {
        return (b().hashCode() * 31) + this.f17237b;
    }

    public String toString() {
        return "SetComposingTextCommand(text='" + b() + "', newCursorPosition=" + this.f17237b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public x(String str, int i11) {
        this(new b(str, (List) null, (List) null, 6, (i) null), i11);
        p.j(str, "text");
    }
}
