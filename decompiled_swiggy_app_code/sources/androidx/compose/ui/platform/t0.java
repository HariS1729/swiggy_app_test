package androidx.compose.ui.platform;

import a2.a;
import a2.e;
import a2.h;
import p1.u;
import u0.h1;
import u1.i;
import u1.s;
import u1.t;
import u1.v;
import w1.f;

/* compiled from: AndroidClipboardManager.android.kt */
final class t0 {

    /* renamed from: a  reason: collision with root package name */
    private long f7346a;

    /* renamed from: b  reason: collision with root package name */
    private long f7347b;

    /* renamed from: c  reason: collision with root package name */
    private v f7348c;

    /* renamed from: d  reason: collision with root package name */
    private s f7349d;

    /* renamed from: e  reason: collision with root package name */
    private t f7350e;

    /* renamed from: f  reason: collision with root package name */
    private i f7351f;

    /* renamed from: g  reason: collision with root package name */
    private String f7352g;

    /* renamed from: h  reason: collision with root package name */
    private long f7353h;

    /* renamed from: i  reason: collision with root package name */
    private a f7354i;
    private h j;
    private f k;

    /* renamed from: l  reason: collision with root package name */
    private long f7355l;

    /* renamed from: m  reason: collision with root package name */
    private e f7356m;
    private h1 n;

    private t0(long j11, long j12, v vVar, s sVar, t tVar, i iVar, String str, long j13, a aVar, h hVar, f fVar, long j14, e eVar, h1 h1Var) {
        this.f7346a = j11;
        this.f7347b = j12;
        this.f7348c = vVar;
        this.f7349d = sVar;
        this.f7350e = tVar;
        this.f7351f = iVar;
        this.f7352g = str;
        this.f7353h = j13;
        this.f7354i = aVar;
        this.j = hVar;
        this.k = fVar;
        this.f7355l = j14;
        this.f7356m = eVar;
        this.n = h1Var;
    }

    public /* synthetic */ t0(long j11, long j12, v vVar, s sVar, t tVar, i iVar, String str, long j13, a aVar, h hVar, f fVar, long j14, e eVar, h1 h1Var, kotlin.jvm.internal.i iVar2) {
        this(j11, j12, vVar, sVar, tVar, iVar, str, j13, aVar, hVar, fVar, j14, eVar, h1Var);
    }

    public final void a(long j11) {
        this.f7355l = j11;
    }

    public final void b(a aVar) {
        this.f7354i = aVar;
    }

    public final void c(long j11) {
        this.f7346a = j11;
    }

    public final void d(String str) {
        this.f7352g = str;
    }

    public final void e(long j11) {
        this.f7347b = j11;
    }

    public final void f(s sVar) {
        this.f7349d = sVar;
    }

    public final void g(t tVar) {
        this.f7350e = tVar;
    }

    public final void h(v vVar) {
        this.f7348c = vVar;
    }

    public final void i(long j11) {
        this.f7353h = j11;
    }

    public final void j(h1 h1Var) {
        this.n = h1Var;
    }

    public final void k(e eVar) {
        this.f7356m = eVar;
    }

    public final void l(h hVar) {
        this.j = hVar;
    }

    public final u m() {
        return new u(this.f7346a, this.f7347b, this.f7348c, this.f7349d, this.f7350e, this.f7351f, this.f7352g, this.f7353h, this.f7354i, this.j, this.k, this.f7355l, this.f7356m, this.n, (kotlin.jvm.internal.i) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ t0(long r20, long r22, u1.v r24, u1.s r25, u1.t r26, u1.i r27, java.lang.String r28, long r29, a2.a r31, a2.h r32, w1.f r33, long r34, a2.e r36, u0.h1 r37, int r38, kotlin.jvm.internal.i r39) {
        /*
            r19 = this;
            r0 = r38
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            u0.d0$a r1 = u0.d0.f16756b
            long r1 = r1.f()
            goto L_0x000f
        L_0x000d:
            r1 = r20
        L_0x000f:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x001a
            d2.r$a r3 = d2.r.f14022b
            long r3 = r3.a()
            goto L_0x001c
        L_0x001a:
            r3 = r22
        L_0x001c:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0022
            r5 = 0
            goto L_0x0024
        L_0x0022:
            r5 = r24
        L_0x0024:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r25
        L_0x002c:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r26
        L_0x0034:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r27
        L_0x003c:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r28
        L_0x0044:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x004f
            d2.r$a r11 = d2.r.f14022b
            long r11 = r11.a()
            goto L_0x0051
        L_0x004f:
            r11 = r29
        L_0x0051:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0057
            r13 = 0
            goto L_0x0059
        L_0x0057:
            r13 = r31
        L_0x0059:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x005f
            r14 = 0
            goto L_0x0061
        L_0x005f:
            r14 = r32
        L_0x0061:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0067
            r15 = 0
            goto L_0x0069
        L_0x0067:
            r15 = r33
        L_0x0069:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0074
            u0.d0$a r6 = u0.d0.f16756b
            long r16 = r6.f()
            goto L_0x0076
        L_0x0074:
            r16 = r34
        L_0x0076:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x007c
            r6 = 0
            goto L_0x007e
        L_0x007c:
            r6 = r36
        L_0x007e:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0084
            r0 = 0
            goto L_0x0086
        L_0x0084:
            r0 = r37
        L_0x0086:
            r18 = 0
            r39 = r18
            r20 = r19
            r21 = r1
            r23 = r3
            r25 = r5
            r26 = r7
            r27 = r8
            r28 = r9
            r29 = r10
            r30 = r11
            r32 = r13
            r33 = r14
            r34 = r15
            r35 = r16
            r37 = r6
            r38 = r0
            r20.<init>(r21, r23, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r37, r38, r39)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.t0.<init>(long, long, u1.v, u1.s, u1.t, u1.i, java.lang.String, long, a2.a, a2.h, w1.f, long, a2.e, u0.h1, int, kotlin.jvm.internal.i):void");
    }
}
