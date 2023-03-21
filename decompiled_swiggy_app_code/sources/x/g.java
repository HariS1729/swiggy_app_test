package x;

import e0.a1;
import e0.h0;

/* compiled from: LazyLayoutPrefetchState.kt */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final h0 f17635a = j.e((Object) null, (a1) null, 2, (Object) null);

    /* compiled from: LazyLayoutPrefetchState.kt */
    public interface a {
        void cancel();
    }

    /* compiled from: LazyLayoutPrefetchState.kt */
    public interface b {
        a a(int i11, long j);
    }

    public final b a() {
        return (b) this.f17635a.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r2 = r0.a(r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final x.g.a b(int r2, long r3) {
        /*
            r1 = this;
            x.g$b r0 = r1.a()
            if (r0 == 0) goto L_0x000c
            x.g$a r2 = r0.a(r2, r3)
            if (r2 != 0) goto L_0x000e
        L_0x000c:
            x.a r2 = x.a.f17628a
        L_0x000e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x.g.b(int, long):x.g$a");
    }

    public final void c(b bVar) {
        this.f17635a.setValue(bVar);
    }
}
