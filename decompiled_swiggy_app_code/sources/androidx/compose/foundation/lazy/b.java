package androidx.compose.foundation.lazy;

import d2.l;
import java.util.ArrayList;
import java.util.List;

/* compiled from: LazyListItemPlacementAnimator.kt */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private int f4096a;

    /* renamed from: b  reason: collision with root package name */
    private long f4097b = l.f14010b.a();

    /* renamed from: c  reason: collision with root package name */
    private final List<d> f4098c = new ArrayList();

    public b(int i11) {
        this.f4096a = i11;
    }

    public final long a() {
        return this.f4097b;
    }

    public final List<d> b() {
        return this.f4098c;
    }

    public final void c(int i11) {
        this.f4096a = i11;
    }

    public final void d(long j) {
        this.f4097b = j;
    }
}
