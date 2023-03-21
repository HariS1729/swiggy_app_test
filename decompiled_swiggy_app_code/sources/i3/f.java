package i3;

import bs.a;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.p;

/* compiled from: FrameDataApi24.kt */
public class f extends e {

    /* renamed from: e  reason: collision with root package name */
    private final long f15018e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(long j, long j11, long j12, boolean z11, List<s> list) {
        super(j, j11, z11, list);
        p.j(list, "states");
        this.f15018e = j12;
    }

    public final long e() {
        return this.f15018e;
    }

    public boolean equals(Object obj) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.metrics.performance.FrameDataApi24");
        return super.equals(obj) && this.f15018e != ((f) obj).f15018e;
    }

    public int hashCode() {
        return (super.hashCode() * 31) + a.a(this.f15018e);
    }

    public String toString() {
        return "FrameData(frameStartNanos=" + b() + ", frameDurationUiNanos=" + a() + ", frameDurationCpuNanos=" + this.f15018e + ", isJank=" + d() + ", states=" + c() + ')';
    }
}
