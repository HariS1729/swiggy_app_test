package b0;

import androidx.compose.foundation.text.Handle;
import kotlin.jvm.internal.i;
import t0.f;

/* compiled from: SelectionHandles.kt */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final Handle f12558a;

    /* renamed from: b  reason: collision with root package name */
    private final long f12559b;

    private h(Handle handle, long j) {
        this.f12558a = handle;
        this.f12559b = j;
    }

    public /* synthetic */ h(Handle handle, long j, i iVar) {
        this(handle, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f12558a == hVar.f12558a && f.j(this.f12559b, hVar.f12559b);
    }

    public int hashCode() {
        return (this.f12558a.hashCode() * 31) + f.o(this.f12559b);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.f12558a + ", position=" + f.t(this.f12559b) + ')';
    }
}
