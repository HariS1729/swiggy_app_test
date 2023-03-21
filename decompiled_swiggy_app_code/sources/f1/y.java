package f1;

import bs.a;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import t0.f;

/* compiled from: InternalPointerInput.kt */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final long f14549a;

    /* renamed from: b  reason: collision with root package name */
    private final long f14550b;

    /* renamed from: c  reason: collision with root package name */
    private final long f14551c;

    /* renamed from: d  reason: collision with root package name */
    private final long f14552d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f14553e;

    /* renamed from: f  reason: collision with root package name */
    private final int f14554f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f14555g;

    /* renamed from: h  reason: collision with root package name */
    private final List<f> f14556h;

    /* renamed from: i  reason: collision with root package name */
    private final long f14557i;

    private y(long j, long j11, long j12, long j13, boolean z11, int i11, boolean z12, List<f> list, long j14) {
        this.f14549a = j;
        this.f14550b = j11;
        this.f14551c = j12;
        this.f14552d = j13;
        this.f14553e = z11;
        this.f14554f = i11;
        this.f14555g = z12;
        this.f14556h = list;
        this.f14557i = j14;
    }

    public /* synthetic */ y(long j, long j11, long j12, long j13, boolean z11, int i11, boolean z12, List list, long j14, i iVar) {
        this(j, j11, j12, j13, z11, i11, z12, list, j14);
    }

    public final boolean a() {
        return this.f14553e;
    }

    public final List<f> b() {
        return this.f14556h;
    }

    public final long c() {
        return this.f14549a;
    }

    public final boolean d() {
        return this.f14555g;
    }

    public final long e() {
        return this.f14552d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return u.d(this.f14549a, yVar.f14549a) && this.f14550b == yVar.f14550b && f.j(this.f14551c, yVar.f14551c) && f.j(this.f14552d, yVar.f14552d) && this.f14553e == yVar.f14553e && g0.g(this.f14554f, yVar.f14554f) && this.f14555g == yVar.f14555g && p.e(this.f14556h, yVar.f14556h) && f.j(this.f14557i, yVar.f14557i);
    }

    public final long f() {
        return this.f14551c;
    }

    public final long g() {
        return this.f14557i;
    }

    public final int h() {
        return this.f14554f;
    }

    public int hashCode() {
        int e11 = ((((((u.e(this.f14549a) * 31) + a.a(this.f14550b)) * 31) + f.o(this.f14551c)) * 31) + f.o(this.f14552d)) * 31;
        boolean z11 = this.f14553e;
        boolean z12 = true;
        if (z11) {
            z11 = true;
        }
        int h11 = (((e11 + (z11 ? 1 : 0)) * 31) + g0.h(this.f14554f)) * 31;
        boolean z13 = this.f14555g;
        if (!z13) {
            z12 = z13;
        }
        return ((((h11 + (z12 ? 1 : 0)) * 31) + this.f14556h.hashCode()) * 31) + f.o(this.f14557i);
    }

    public final long i() {
        return this.f14550b;
    }

    public String toString() {
        return "PointerInputEventData(id=" + u.f(this.f14549a) + ", uptime=" + this.f14550b + ", positionOnScreen=" + f.t(this.f14551c) + ", position=" + f.t(this.f14552d) + ", down=" + this.f14553e + ", type=" + g0.i(this.f14554f) + ", issuesEnterExit=" + this.f14555g + ", historical=" + this.f14556h + ", scrollDelta=" + f.t(this.f14557i) + ')';
    }
}
