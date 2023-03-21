package b0;

import kotlin.jvm.internal.i;
import u0.d0;

/* compiled from: TextSelectionColors.kt */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final long f12565a;

    /* renamed from: b  reason: collision with root package name */
    private final long f12566b;

    private o(long j, long j11) {
        this.f12565a = j;
        this.f12566b = j11;
    }

    public /* synthetic */ o(long j, long j11, i iVar) {
        this(j, j11);
    }

    public final long a() {
        return this.f12566b;
    }

    public final long b() {
        return this.f12565a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return d0.n(this.f12565a, oVar.f12565a) && d0.n(this.f12566b, oVar.f12566b);
    }

    public int hashCode() {
        return (d0.t(this.f12565a) * 31) + d0.t(this.f12566b);
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + d0.u(this.f12565a) + ", selectionBackgroundColor=" + d0.u(this.f12566b) + ')';
    }
}
