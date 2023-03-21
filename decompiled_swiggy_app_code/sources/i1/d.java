package i1;

import t0.l;

/* compiled from: ContentScale.kt */
public final class d {
    /* access modifiers changed from: private */
    public static final float e(long j, long j11) {
        return l.g(j11) / l.g(j);
    }

    /* access modifiers changed from: private */
    public static final float f(long j, long j11) {
        return Math.max(h(j, j11), e(j, j11));
    }

    /* access modifiers changed from: private */
    public static final float g(long j, long j11) {
        return Math.min(h(j, j11), e(j, j11));
    }

    /* access modifiers changed from: private */
    public static final float h(long j, long j11) {
        return l.i(j11) / l.i(j);
    }
}
