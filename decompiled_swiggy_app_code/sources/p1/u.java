package p1;

import a2.a;
import a2.e;
import a2.h;
import androidx.compose.ui.text.style.b;
import com.truecaller.android.sdk.TruecallerSdkScope;
import d2.r;
import kotlin.jvm.internal.p;
import u0.d0;
import u0.h1;
import u1.i;
import u1.s;
import u1.t;
import u1.v;
import w1.f;

/* compiled from: SpanStyle.kt */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final b f16172a;

    /* renamed from: b  reason: collision with root package name */
    private final long f16173b;

    /* renamed from: c  reason: collision with root package name */
    private final v f16174c;

    /* renamed from: d  reason: collision with root package name */
    private final s f16175d;

    /* renamed from: e  reason: collision with root package name */
    private final t f16176e;

    /* renamed from: f  reason: collision with root package name */
    private final i f16177f;

    /* renamed from: g  reason: collision with root package name */
    private final String f16178g;

    /* renamed from: h  reason: collision with root package name */
    private final long f16179h;

    /* renamed from: i  reason: collision with root package name */
    private final a f16180i;
    private final h j;
    private final f k;

    /* renamed from: l  reason: collision with root package name */
    private final long f16181l;

    /* renamed from: m  reason: collision with root package name */
    private final e f16182m;
    private final h1 n;

    /* renamed from: o  reason: collision with root package name */
    private final r f16183o;

    public /* synthetic */ u(long j11, long j12, v vVar, s sVar, t tVar, i iVar, String str, long j13, a aVar, h hVar, f fVar, long j14, e eVar, h1 h1Var, kotlin.jvm.internal.i iVar2) {
        this(j11, j12, vVar, sVar, tVar, iVar, str, j13, aVar, hVar, fVar, j14, eVar, h1Var);
    }

    public /* synthetic */ u(long j11, long j12, v vVar, s sVar, t tVar, i iVar, String str, long j13, a aVar, h hVar, f fVar, long j14, e eVar, h1 h1Var, r rVar, kotlin.jvm.internal.i iVar2) {
        this(j11, j12, vVar, sVar, tVar, iVar, str, j13, aVar, hVar, fVar, j14, eVar, h1Var, rVar);
    }

    private u(b bVar, long j11, v vVar, s sVar, t tVar, i iVar, String str, long j12, a aVar, h hVar, f fVar, long j13, e eVar, h1 h1Var, r rVar) {
        this.f16172a = bVar;
        this.f16173b = j11;
        this.f16174c = vVar;
        this.f16175d = sVar;
        this.f16176e = tVar;
        this.f16177f = iVar;
        this.f16178g = str;
        this.f16179h = j12;
        this.f16180i = aVar;
        this.j = hVar;
        this.k = fVar;
        this.f16181l = j13;
        this.f16182m = eVar;
        this.n = h1Var;
        this.f16183o = rVar;
    }

    public /* synthetic */ u(b bVar, long j11, v vVar, s sVar, t tVar, i iVar, String str, long j12, a aVar, h hVar, f fVar, long j13, e eVar, h1 h1Var, r rVar, kotlin.jvm.internal.i iVar2) {
        this(bVar, j11, vVar, sVar, tVar, iVar, str, j12, aVar, hVar, fVar, j13, eVar, h1Var, rVar);
    }

    public static /* synthetic */ u b(u uVar, long j11, long j12, v vVar, s sVar, t tVar, i iVar, String str, long j13, a aVar, h hVar, f fVar, long j14, e eVar, h1 h1Var, int i11, Object obj) {
        u uVar2 = uVar;
        int i12 = i11;
        return uVar.a((i12 & 1) != 0 ? uVar.f() : j11, (i12 & 2) != 0 ? uVar2.f16173b : j12, (i12 & 4) != 0 ? uVar2.f16174c : vVar, (i12 & 8) != 0 ? uVar2.f16175d : sVar, (i12 & 16) != 0 ? uVar2.f16176e : tVar, (i12 & 32) != 0 ? uVar2.f16177f : iVar, (i12 & 64) != 0 ? uVar2.f16178g : str, (i12 & 128) != 0 ? uVar2.f16179h : j13, (i12 & 256) != 0 ? uVar2.f16180i : aVar, (i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? uVar2.j : hVar, (i12 & 1024) != 0 ? uVar2.k : fVar, (i12 & 2048) != 0 ? uVar2.f16181l : j14, (i12 & 4096) != 0 ? uVar2.f16182m : eVar, (i12 & 8192) != 0 ? uVar2.n : h1Var);
    }

    private final boolean u(u uVar) {
        if (p.e(this.f16172a, uVar.f16172a) && p.e(this.f16182m, uVar.f16182m) && p.e(this.n, uVar.n)) {
            return true;
        }
        return false;
    }

    private final r w(r rVar) {
        r rVar2 = this.f16183o;
        if (rVar2 == null) {
            return rVar;
        }
        if (rVar == null) {
            return rVar2;
        }
        return rVar2.b(rVar);
    }

    public final u a(long j11, long j12, v vVar, s sVar, t tVar, i iVar, String str, long j13, a aVar, h hVar, f fVar, long j14, e eVar, h1 h1Var) {
        long j15 = j11;
        return new u(d0.n(j15, f()) ? this.f16172a : b.f7668a.a(j15), j12, vVar, sVar, tVar, iVar, str, j13, aVar, hVar, fVar, j14, eVar, h1Var, this.f16183o, (kotlin.jvm.internal.i) null);
    }

    public final long c() {
        return this.f16181l;
    }

    public final a d() {
        return this.f16180i;
    }

    public final u0.u e() {
        return this.f16172a.d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (!t(uVar) || !u(uVar)) {
            return false;
        }
        return true;
    }

    public final long f() {
        return this.f16172a.a();
    }

    public final i g() {
        return this.f16177f;
    }

    public final String h() {
        return this.f16178g;
    }

    public int hashCode() {
        int t = d0.t(f()) * 31;
        u0.u e11 = e();
        int i11 = 0;
        int hashCode = (((t + (e11 != null ? e11.hashCode() : 0)) * 31) + r.i(this.f16173b)) * 31;
        v vVar = this.f16174c;
        int hashCode2 = (hashCode + (vVar != null ? vVar.hashCode() : 0)) * 31;
        s sVar = this.f16175d;
        int g11 = (hashCode2 + (sVar != null ? s.g(sVar.i()) : 0)) * 31;
        t tVar = this.f16176e;
        int i12 = (g11 + (tVar != null ? t.i(tVar.m()) : 0)) * 31;
        i iVar = this.f16177f;
        int hashCode3 = (i12 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        String str = this.f16178g;
        int hashCode4 = (((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + r.i(this.f16179h)) * 31;
        a aVar = this.f16180i;
        int f11 = (hashCode4 + (aVar != null ? a.f(aVar.h()) : 0)) * 31;
        h hVar = this.j;
        int hashCode5 = (f11 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        f fVar = this.k;
        int hashCode6 = (((hashCode5 + (fVar != null ? fVar.hashCode() : 0)) * 31) + d0.t(this.f16181l)) * 31;
        e eVar = this.f16182m;
        int hashCode7 = (hashCode6 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        h1 h1Var = this.n;
        int hashCode8 = (hashCode7 + (h1Var != null ? h1Var.hashCode() : 0)) * 31;
        r rVar = this.f16183o;
        if (rVar != null) {
            i11 = rVar.hashCode();
        }
        return hashCode8 + i11;
    }

    public final long i() {
        return this.f16173b;
    }

    public final s j() {
        return this.f16175d;
    }

    public final t k() {
        return this.f16176e;
    }

    public final v l() {
        return this.f16174c;
    }

    public final long m() {
        return this.f16179h;
    }

    public final f n() {
        return this.k;
    }

    public final r o() {
        return this.f16183o;
    }

    public final h1 p() {
        return this.n;
    }

    public final e q() {
        return this.f16182m;
    }

    public final b r() {
        return this.f16172a;
    }

    public final h s() {
        return this.j;
    }

    public final boolean t(u uVar) {
        p.j(uVar, "other");
        if (this == uVar) {
            return true;
        }
        return r.e(this.f16173b, uVar.f16173b) && p.e(this.f16174c, uVar.f16174c) && p.e(this.f16175d, uVar.f16175d) && p.e(this.f16176e, uVar.f16176e) && p.e(this.f16177f, uVar.f16177f) && p.e(this.f16178g, uVar.f16178g) && r.e(this.f16179h, uVar.f16179h) && p.e(this.f16180i, uVar.f16180i) && p.e(this.j, uVar.j) && p.e(this.k, uVar.k) && d0.n(this.f16181l, uVar.f16181l) && p.e(this.f16183o, uVar.f16183o);
    }

    public String toString() {
        return "SpanStyle(color=" + d0.u(f()) + ", brush=" + e() + ", fontSize=" + r.j(this.f16173b) + ", fontWeight=" + this.f16174c + ", fontStyle=" + this.f16175d + ", fontSynthesis=" + this.f16176e + ", fontFamily=" + this.f16177f + ", fontFeatureSettings=" + this.f16178g + ", letterSpacing=" + r.j(this.f16179h) + ", baselineShift=" + this.f16180i + ", textGeometricTransform=" + this.j + ", localeList=" + this.k + ", background=" + d0.u(this.f16181l) + ", textDecoration=" + this.f16182m + ", shadow=" + this.n + ", platformStyle=" + this.f16183o + ')';
    }

    public final u v(u uVar) {
        long j11;
        u uVar2 = uVar;
        if (uVar2 == null) {
            return this;
        }
        b b11 = this.f16172a.b(uVar2.f16172a);
        i iVar = uVar2.f16177f;
        if (iVar == null) {
            iVar = this.f16177f;
        }
        i iVar2 = iVar;
        long j12 = !d2.s.g(uVar2.f16173b) ? uVar2.f16173b : this.f16173b;
        v vVar = uVar2.f16174c;
        if (vVar == null) {
            vVar = this.f16174c;
        }
        v vVar2 = vVar;
        s sVar = uVar2.f16175d;
        if (sVar == null) {
            sVar = this.f16175d;
        }
        s sVar2 = sVar;
        t tVar = uVar2.f16176e;
        if (tVar == null) {
            tVar = this.f16176e;
        }
        t tVar2 = tVar;
        String str = uVar2.f16178g;
        if (str == null) {
            str = this.f16178g;
        }
        String str2 = str;
        if (!d2.s.g(uVar2.f16179h)) {
            j11 = uVar2.f16179h;
        } else {
            j11 = this.f16179h;
        }
        long j13 = j11;
        a aVar = uVar2.f16180i;
        if (aVar == null) {
            aVar = this.f16180i;
        }
        a aVar2 = aVar;
        h hVar = uVar2.j;
        if (hVar == null) {
            hVar = this.j;
        }
        h hVar2 = hVar;
        f fVar = uVar2.k;
        if (fVar == null) {
            fVar = this.k;
        }
        f fVar2 = fVar;
        long j14 = uVar2.f16181l;
        if (!(j14 != d0.f16756b.f())) {
            j14 = this.f16181l;
        }
        long j15 = j14;
        e eVar = uVar2.f16182m;
        if (eVar == null) {
            eVar = this.f16182m;
        }
        e eVar2 = eVar;
        h1 h1Var = uVar2.n;
        if (h1Var == null) {
            h1Var = this.n;
        }
        return new u(b11, j12, vVar2, sVar2, tVar2, iVar2, str2, j13, aVar2, hVar2, fVar2, j15, eVar2, h1Var, w(uVar2.f16183o), (kotlin.jvm.internal.i) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ u(long r20, long r22, u1.v r24, u1.s r25, u1.t r26, u1.i r27, java.lang.String r28, long r29, a2.a r31, a2.h r32, w1.f r33, long r34, a2.e r36, u0.h1 r37, int r38, kotlin.jvm.internal.i r39) {
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
            r20.<init>((long) r21, (long) r23, (u1.v) r25, (u1.s) r26, (u1.t) r27, (u1.i) r28, (java.lang.String) r29, (long) r30, (a2.a) r32, (a2.h) r33, (w1.f) r34, (long) r35, (a2.e) r37, (u0.h1) r38, (kotlin.jvm.internal.i) r39)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.u.<init>(long, long, u1.v, u1.s, u1.t, u1.i, java.lang.String, long, a2.a, a2.h, w1.f, long, a2.e, u0.h1, int, kotlin.jvm.internal.i):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private u(long j11, long j12, v vVar, s sVar, t tVar, i iVar, String str, long j13, a aVar, h hVar, f fVar, long j14, e eVar, h1 h1Var) {
        this(b.f7668a.a(j11), j12, vVar, sVar, tVar, iVar, str, j13, aVar, hVar, fVar, j14, eVar, h1Var, (r) null, (kotlin.jvm.internal.i) null);
        long j15 = j12;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private u(long j11, long j12, v vVar, s sVar, t tVar, i iVar, String str, long j13, a aVar, h hVar, f fVar, long j14, e eVar, h1 h1Var, r rVar) {
        this(b.f7668a.a(j11), j12, vVar, sVar, tVar, iVar, str, j13, aVar, hVar, fVar, j14, eVar, h1Var, rVar, (kotlin.jvm.internal.i) null);
        long j15 = j12;
    }
}
