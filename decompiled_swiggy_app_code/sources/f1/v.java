package f1;

import com.truecaller.android.sdk.TruecallerSdkScope;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import t0.f;

/* compiled from: PointerEvent.kt */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private final long f14532a;

    /* renamed from: b  reason: collision with root package name */
    private final long f14533b;

    /* renamed from: c  reason: collision with root package name */
    private final long f14534c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f14535d;

    /* renamed from: e  reason: collision with root package name */
    private final long f14536e;

    /* renamed from: f  reason: collision with root package name */
    private final long f14537f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f14538g;

    /* renamed from: h  reason: collision with root package name */
    private final int f14539h;

    /* renamed from: i  reason: collision with root package name */
    private final long f14540i;
    private List<f> j;
    private e k;

    private v(long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, boolean z13, int i11, long j16) {
        this.f14532a = j11;
        this.f14533b = j12;
        this.f14534c = j13;
        this.f14535d = z11;
        this.f14536e = j14;
        this.f14537f = j15;
        this.f14538g = z12;
        this.f14539h = i11;
        this.f14540i = j16;
        boolean z14 = z13;
        this.k = new e(z14, z14);
    }

    public /* synthetic */ v(long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, boolean z13, int i11, long j16, i iVar) {
        this(j11, j12, j13, z11, j14, j15, z12, z13, i11, j16);
    }

    public /* synthetic */ v(long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, boolean z13, int i11, List list, long j16, i iVar) {
        this(j11, j12, j13, z11, j14, j15, z12, z13, i11, (List<f>) list, j16);
    }

    public static /* synthetic */ v c(v vVar, long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, int i11, List list, long j16, int i12, Object obj) {
        v vVar2 = vVar;
        int i13 = i12;
        return vVar.b((i13 & 1) != 0 ? vVar2.f14532a : j11, (i13 & 2) != 0 ? vVar2.f14533b : j12, (i13 & 4) != 0 ? vVar2.f14534c : j13, (i13 & 8) != 0 ? vVar2.f14535d : z11, (i13 & 16) != 0 ? vVar2.f14536e : j14, (i13 & 32) != 0 ? vVar2.f14537f : j15, (i13 & 64) != 0 ? vVar2.f14538g : z12, (i13 & 128) != 0 ? vVar2.f14539h : i11, list, (i13 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? vVar2.f14540i : j16);
    }

    public final void a() {
        this.k.c(true);
        this.k.d(true);
    }

    public final v b(long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, int i11, List<f> list, long j16) {
        p.j(list, "historical");
        v vVar = r0;
        v vVar2 = new v(j11, j12, j13, z11, j14, j15, z12, false, i11, (List) list, j16, (i) null);
        v vVar3 = vVar;
        vVar3.k = this.k;
        return vVar3;
    }

    public final List<f> d() {
        List<f> list = this.j;
        return list == null ? k.j() : list;
    }

    public final long e() {
        return this.f14532a;
    }

    public final long f() {
        return this.f14534c;
    }

    public final boolean g() {
        return this.f14535d;
    }

    public final long h() {
        return this.f14537f;
    }

    public final boolean i() {
        return this.f14538g;
    }

    public final long j() {
        return this.f14540i;
    }

    public final int k() {
        return this.f14539h;
    }

    public final long l() {
        return this.f14533b;
    }

    public final boolean m() {
        return this.k.a() || this.k.b();
    }

    public String toString() {
        return "PointerInputChange(id=" + u.f(this.f14532a) + ", uptimeMillis=" + this.f14533b + ", position=" + f.t(this.f14534c) + ", pressed=" + this.f14535d + ", previousUptimeMillis=" + this.f14536e + ", previousPosition=" + f.t(this.f14537f) + ", previousPressed=" + this.f14538g + ", isConsumed=" + m() + ", type=" + g0.i(this.f14539h) + ", historical=" + d() + ",scrollDelta=" + f.t(this.f14540i) + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ v(long r21, long r23, long r25, boolean r27, long r28, long r30, boolean r32, boolean r33, int r34, long r35, int r37, kotlin.jvm.internal.i r38) {
        /*
            r20 = this;
            r0 = r37
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x000f
            f1.g0$a r1 = f1.g0.f14488a
            int r1 = r1.d()
            r16 = r1
            goto L_0x0011
        L_0x000f:
            r16 = r34
        L_0x0011:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x001e
            t0.f$a r0 = t0.f.f16662b
            long r0 = r0.c()
            r17 = r0
            goto L_0x0020
        L_0x001e:
            r17 = r35
        L_0x0020:
            r19 = 0
            r2 = r20
            r3 = r21
            r5 = r23
            r7 = r25
            r9 = r27
            r10 = r28
            r12 = r30
            r14 = r32
            r15 = r33
            r2.<init>((long) r3, (long) r5, (long) r7, (boolean) r9, (long) r10, (long) r12, (boolean) r14, (boolean) r15, (int) r16, (long) r17, (kotlin.jvm.internal.i) r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.v.<init>(long, long, long, boolean, long, long, boolean, boolean, int, long, int, kotlin.jvm.internal.i):void");
    }

    private v(long j11, long j12, long j13, boolean z11, long j14, long j15, boolean z12, boolean z13, int i11, List<f> list, long j16) {
        this(j11, j12, j13, z11, j14, j15, z12, z13, i11, j16, (i) null);
        this.j = list;
    }
}
