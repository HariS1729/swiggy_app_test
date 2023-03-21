package i3;

import bs.a;
import java.util.Objects;

/* compiled from: FrameDataApi31.kt */
public final class g extends f {

    /* renamed from: f  reason: collision with root package name */
    private final long f15019f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(long r11, long r13, long r15, long r17, boolean r19, java.util.List<i3.s> r20) {
        /*
            r10 = this;
            java.lang.String r0 = "states"
            r9 = r20
            kotlin.jvm.internal.p.j(r9, r0)
            r1 = r10
            r2 = r11
            r4 = r13
            r6 = r15
            r8 = r19
            r1.<init>(r2, r4, r6, r8, r9)
            r0 = r10
            r1 = r17
            r0.f15019f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.g.<init>(long, long, long, long, boolean, java.util.List):void");
    }

    public boolean equals(Object obj) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.metrics.performance.FrameDataApi31");
        return super.equals(obj) && this.f15019f != ((g) obj).f15019f;
    }

    public int hashCode() {
        return (super.hashCode() * 31) + a.a(this.f15019f);
    }

    public String toString() {
        return "FrameData(frameStartNanos=" + b() + ", frameDurationUiNanos=" + a() + ", frameDurationCpuNanos=" + e() + ", frameOverrunNanos=" + this.f15019f + ", isJank=" + d() + ", states=" + c() + ')';
    }
}
