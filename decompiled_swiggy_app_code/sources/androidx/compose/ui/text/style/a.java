package androidx.compose.ui.text.style;

import kotlin.jvm.internal.i;
import u0.d0;
import u0.u;

/* compiled from: TextDrawStyle.kt */
final class a implements b {

    /* renamed from: b  reason: collision with root package name */
    private final long f7667b;

    private a(long j) {
        this.f7667b = j;
        if (!(j != d0.f16756b.f())) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextDrawStyle.Unspecified instead.".toString());
        }
    }

    public /* synthetic */ a(long j, i iVar) {
        this(j);
    }

    public long a() {
        return this.f7667b;
    }

    public /* synthetic */ b b(b bVar) {
        return TextDrawStyle$CC.a(this, bVar);
    }

    public /* synthetic */ b c(lp0.a aVar) {
        return TextDrawStyle$CC.b(this, aVar);
    }

    public u d() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && d0.n(this.f7667b, ((a) obj).f7667b);
    }

    public int hashCode() {
        return d0.t(this.f7667b);
    }

    public String toString() {
        return "ColorStyle(value=" + d0.u(this.f7667b) + ')';
    }
}
