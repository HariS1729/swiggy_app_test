package i3;

import a0.h;
import bs.a;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.p;

/* compiled from: FrameData.kt */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final long f15014a;

    /* renamed from: b  reason: collision with root package name */
    private final long f15015b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f15016c;

    /* renamed from: d  reason: collision with root package name */
    private final List<s> f15017d;

    public e(long j, long j11, boolean z11, List<s> list) {
        p.j(list, "states");
        this.f15014a = j;
        this.f15015b = j11;
        this.f15016c = z11;
        this.f15017d = list;
    }

    public final long a() {
        return this.f15015b;
    }

    public final long b() {
        return this.f15014a;
    }

    public final List<s> c() {
        return this.f15017d;
    }

    public final boolean d() {
        return this.f15016c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.e(getClass(), obj == null ? null : obj.getClass())) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.metrics.performance.FrameData");
        e eVar = (e) obj;
        return this.f15014a == eVar.f15014a && this.f15015b == eVar.f15015b && this.f15016c == eVar.f15016c && p.e(this.f15017d, eVar.f15017d);
    }

    public int hashCode() {
        return (((((a.a(this.f15014a) * 31) + a.a(this.f15015b)) * 31) + h.a(this.f15016c)) * 31) + this.f15017d.hashCode();
    }

    public String toString() {
        return "FrameData(frameStartNanos=" + this.f15014a + ", frameDurationUiNanos=" + this.f15015b + ", isJank=" + this.f15016c + ", states=" + this.f15017d + ')';
    }
}
