package v1;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import p1.b;

/* compiled from: EditCommand.kt */
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final b f17050a;

    /* renamed from: b  reason: collision with root package name */
    private final int f17051b;

    public a(b bVar, int i11) {
        p.j(bVar, "annotatedString");
        this.f17050a = bVar;
        this.f17051b = i11;
    }

    public void a(g gVar) {
        int i11;
        p.j(gVar, "buffer");
        if (gVar.l()) {
            gVar.m(gVar.f(), gVar.e(), b());
        } else {
            gVar.m(gVar.k(), gVar.j(), b());
        }
        int g11 = gVar.g();
        int i12 = this.f17051b;
        if (i12 > 0) {
            i11 = (g11 + i12) - 1;
        } else {
            i11 = (g11 + i12) - b().length();
        }
        gVar.o(l.m(i11, 0, gVar.h()));
    }

    public final String b() {
        return this.f17050a.g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p.e(b(), aVar.b()) && this.f17051b == aVar.f17051b;
    }

    public int hashCode() {
        return (b().hashCode() * 31) + this.f17051b;
    }

    public String toString() {
        return "CommitTextCommand(text='" + b() + "', newCursorPosition=" + this.f17051b + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(String str, int i11) {
        this(new b(str, (List) null, (List) null, 6, (i) null), i11);
        p.j(str, "text");
    }
}
