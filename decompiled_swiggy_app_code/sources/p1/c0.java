package p1;

import a2.c;
import a2.d;
import a2.e;
import a2.h;
import a2.j;
import androidx.compose.ui.text.style.b;
import com.truecaller.android.sdk.TruecallerSdkScope;
import d2.r;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.apache.pdfbox.pdmodel.interactive.form.PDButton;
import org.apache.pdfbox.pdmodel.interactive.form.PDChoice;
import u0.d0;
import u0.h1;
import u0.u;
import u1.s;
import u1.t;
import u1.v;
import w1.f;

/* compiled from: TextStyle.kt */
public final class c0 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f16065d = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final c0 f16066e = new c0(0, 0, (v) null, (s) null, (t) null, (u1.i) null, (String) null, 0, (a2.a) null, (h) null, (f) null, 0, (e) null, (h1) null, (d) null, (a2.f) null, 0, (j) null, 262143, (i) null);

    /* renamed from: a  reason: collision with root package name */
    private final u f16067a;

    /* renamed from: b  reason: collision with root package name */
    private final m f16068b;

    /* renamed from: c  reason: collision with root package name */
    private final t f16069c;

    /* compiled from: TextStyle.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final c0 a() {
            return c0.f16066e;
        }
    }

    public /* synthetic */ c0(long j, long j11, v vVar, s sVar, t tVar, u1.i iVar, String str, long j12, a2.a aVar, h hVar, f fVar, long j13, e eVar, h1 h1Var, d dVar, a2.f fVar2, long j14, j jVar, i iVar2) {
        this(j, j11, vVar, sVar, tVar, iVar, str, j12, aVar, hVar, fVar, j13, eVar, h1Var, dVar, fVar2, j14, jVar);
    }

    public c0(u uVar, m mVar, t tVar) {
        p.j(uVar, "spanStyle");
        p.j(mVar, "paragraphStyle");
        this.f16067a = uVar;
        this.f16068b = mVar;
        this.f16069c = tVar;
    }

    public static /* synthetic */ c0 c(c0 c0Var, long j, long j11, v vVar, s sVar, t tVar, u1.i iVar, String str, long j12, a2.a aVar, h hVar, f fVar, long j13, e eVar, h1 h1Var, d dVar, a2.f fVar2, long j14, j jVar, int i11, Object obj) {
        c0 c0Var2 = c0Var;
        int i12 = i11;
        return c0Var.b((i12 & 1) != 0 ? c0Var2.f16067a.f() : j, (i12 & 2) != 0 ? c0Var2.f16067a.i() : j11, (i12 & 4) != 0 ? c0Var2.f16067a.l() : vVar, (i12 & 8) != 0 ? c0Var2.f16067a.j() : sVar, (i12 & 16) != 0 ? c0Var2.f16067a.k() : tVar, (i12 & 32) != 0 ? c0Var2.f16067a.g() : iVar, (i12 & 64) != 0 ? c0Var2.f16067a.h() : str, (i12 & 128) != 0 ? c0Var2.f16067a.m() : j12, (i12 & 256) != 0 ? c0Var2.f16067a.d() : aVar, (i12 & TruecallerSdkScope.FOOTER_TYPE_MANUALLY) != 0 ? c0Var2.f16067a.s() : hVar, (i12 & 1024) != 0 ? c0Var2.f16067a.n() : fVar, (i12 & 2048) != 0 ? c0Var2.f16067a.c() : j13, (i12 & 4096) != 0 ? c0Var2.f16067a.q() : eVar, (i12 & 8192) != 0 ? c0Var2.f16067a.p() : h1Var, (i12 & 16384) != 0 ? c0Var2.f16068b.f() : dVar, (i12 & 32768) != 0 ? c0Var2.f16068b.g() : fVar2, (i12 & PDButton.FLAG_PUSHBUTTON) != 0 ? c0Var2.f16068b.c() : j14, (i12 & PDChoice.FLAG_COMBO) != 0 ? c0Var2.f16068b.h() : jVar);
    }

    public final boolean A(c0 c0Var) {
        p.j(c0Var, "other");
        return this == c0Var || (p.e(this.f16068b, c0Var.f16068b) && this.f16067a.t(c0Var.f16067a));
    }

    public final c0 B(m mVar) {
        p.j(mVar, "other");
        return new c0(E(), D().i(mVar));
    }

    public final c0 C(c0 c0Var) {
        return (c0Var == null || p.e(c0Var, f16066e)) ? this : new c0(E().v(c0Var.E()), D().i(c0Var.D()));
    }

    public final m D() {
        return this.f16068b;
    }

    public final u E() {
        return this.f16067a;
    }

    public final c0 b(long j, long j11, v vVar, s sVar, t tVar, u1.i iVar, String str, long j12, a2.a aVar, h hVar, f fVar, long j13, e eVar, h1 h1Var, d dVar, a2.f fVar2, long j14, j jVar) {
        b bVar;
        long j15 = j;
        if (d0.n(j15, this.f16067a.f())) {
            bVar = this.f16067a.r();
        } else {
            bVar = b.f7668a.a(j15);
        }
        u uVar = r4;
        u uVar2 = new u(bVar, j11, vVar, sVar, tVar, iVar, str, j12, aVar, hVar, fVar, j13, eVar, h1Var, this.f16067a.o(), (i) null);
        return new c0(uVar, new m(dVar, fVar2, j14, jVar, this.f16068b.e(), p(), (i) null), this.f16069c);
    }

    public final long d() {
        return this.f16067a.c();
    }

    public final a2.a e() {
        return this.f16067a.d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return p.e(this.f16067a, c0Var.f16067a) && p.e(this.f16068b, c0Var.f16068b) && p.e(this.f16069c, c0Var.f16069c);
    }

    public final u f() {
        return this.f16067a.e();
    }

    public final long g() {
        return this.f16067a.f();
    }

    public final u1.i h() {
        return this.f16067a.g();
    }

    public int hashCode() {
        int hashCode = ((this.f16067a.hashCode() * 31) + this.f16068b.hashCode()) * 31;
        t tVar = this.f16069c;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    public final String i() {
        return this.f16067a.h();
    }

    public final long j() {
        return this.f16067a.i();
    }

    public final s k() {
        return this.f16067a.j();
    }

    public final t l() {
        return this.f16067a.k();
    }

    public final v m() {
        return this.f16067a.l();
    }

    public final long n() {
        return this.f16067a.m();
    }

    public final long o() {
        return this.f16068b.c();
    }

    public final c p() {
        return this.f16068b.d();
    }

    public final f q() {
        return this.f16067a.n();
    }

    public final m r() {
        return this.f16068b;
    }

    public final t s() {
        return this.f16069c;
    }

    public final h1 t() {
        return this.f16067a.p();
    }

    public String toString() {
        return "TextStyle(color=" + d0.u(g()) + ", brush=" + f() + ", fontSize=" + r.j(j()) + ", fontWeight=" + m() + ", fontStyle=" + k() + ", fontSynthesis=" + l() + ", fontFamily=" + h() + ", fontFeatureSettings=" + i() + ", letterSpacing=" + r.j(n()) + ", baselineShift=" + e() + ", textGeometricTransform=" + y() + ", localeList=" + q() + ", background=" + d0.u(d()) + ", textDecoration=" + w() + ", shadow=" + t() + ", textAlign=" + v() + ", textDirection=" + x() + ", lineHeight=" + r.j(o()) + ", textIndent=" + z() + ", platformStyle=" + this.f16069c + "lineHeightStyle=" + p() + ')';
    }

    public final u u() {
        return this.f16067a;
    }

    public final d v() {
        return this.f16068b.f();
    }

    public final e w() {
        return this.f16067a.q();
    }

    public final a2.f x() {
        return this.f16068b.g();
    }

    public final h y() {
        return this.f16067a.s();
    }

    public final j z() {
        return this.f16068b.h();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c0(u uVar, m mVar) {
        this(uVar, mVar, d0.b(uVar.o(), mVar.e()));
        p.j(uVar, "spanStyle");
        p.j(mVar, "paragraphStyle");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ c0(long r25, long r27, u1.v r29, u1.s r30, u1.t r31, u1.i r32, java.lang.String r33, long r34, a2.a r36, a2.h r37, w1.f r38, long r39, a2.e r41, u0.h1 r42, a2.d r43, a2.f r44, long r45, a2.j r47, int r48, kotlin.jvm.internal.i r49) {
        /*
            r24 = this;
            r0 = r48
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            u0.d0$a r1 = u0.d0.f16756b
            long r1 = r1.f()
            goto L_0x000f
        L_0x000d:
            r1 = r25
        L_0x000f:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x001a
            d2.r$a r3 = d2.r.f14022b
            long r3 = r3.a()
            goto L_0x001c
        L_0x001a:
            r3 = r27
        L_0x001c:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0022
            r5 = 0
            goto L_0x0024
        L_0x0022:
            r5 = r29
        L_0x0024:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r30
        L_0x002c:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r31
        L_0x0034:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r32
        L_0x003c:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r33
        L_0x0044:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x004f
            d2.r$a r11 = d2.r.f14022b
            long r11 = r11.a()
            goto L_0x0051
        L_0x004f:
            r11 = r34
        L_0x0051:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0057
            r13 = 0
            goto L_0x0059
        L_0x0057:
            r13 = r36
        L_0x0059:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x005f
            r14 = 0
            goto L_0x0061
        L_0x005f:
            r14 = r37
        L_0x0061:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0067
            r15 = 0
            goto L_0x0069
        L_0x0067:
            r15 = r38
        L_0x0069:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0074
            u0.d0$a r6 = u0.d0.f16756b
            long r16 = r6.f()
            goto L_0x0076
        L_0x0074:
            r16 = r39
        L_0x0076:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x007c
            r6 = 0
            goto L_0x007e
        L_0x007c:
            r6 = r41
        L_0x007e:
            r18 = r6
            r6 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r6 == 0) goto L_0x0086
            r6 = 0
            goto L_0x0088
        L_0x0086:
            r6 = r42
        L_0x0088:
            r19 = r6
            r6 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x0090
            r6 = 0
            goto L_0x0092
        L_0x0090:
            r6 = r43
        L_0x0092:
            r20 = 32768(0x8000, float:4.5918E-41)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x009c
            r20 = 0
            goto L_0x009e
        L_0x009c:
            r20 = r44
        L_0x009e:
            r21 = 65536(0x10000, float:9.18355E-41)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00ab
            d2.r$a r21 = d2.r.f14022b
            long r21 = r21.a()
            goto L_0x00ad
        L_0x00ab:
            r21 = r45
        L_0x00ad:
            r23 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r23
            if (r0 == 0) goto L_0x00b5
            r0 = 0
            goto L_0x00b7
        L_0x00b5:
            r0 = r47
        L_0x00b7:
            r23 = 0
            r49 = r23
            r25 = r24
            r26 = r1
            r28 = r3
            r30 = r5
            r31 = r7
            r32 = r8
            r33 = r9
            r34 = r10
            r35 = r11
            r37 = r13
            r38 = r14
            r39 = r15
            r40 = r16
            r42 = r18
            r43 = r19
            r44 = r6
            r45 = r20
            r46 = r21
            r48 = r0
            r25.<init>(r26, r28, r30, r31, r32, r33, r34, r35, r37, r38, r39, r40, r42, r43, r44, r45, r46, r48, r49)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.c0.<init>(long, long, u1.v, u1.s, u1.t, u1.i, java.lang.String, long, a2.a, a2.h, w1.f, long, a2.e, u0.h1, a2.d, a2.f, long, a2.j, int, kotlin.jvm.internal.i):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private c0(long r22, long r24, u1.v r26, u1.s r27, u1.t r28, u1.i r29, java.lang.String r30, long r31, a2.a r33, a2.h r34, w1.f r35, long r36, a2.e r38, u0.h1 r39, a2.d r40, a2.f r41, long r42, a2.j r44) {
        /*
            r21 = this;
            r1 = r22
            r3 = r24
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r12 = r33
            r13 = r34
            r14 = r35
            r15 = r36
            r17 = r38
            r18 = r39
            p1.u r0 = new p1.u
            r22 = r0
            r19 = 0
            r20 = 0
            r0.<init>((long) r1, (long) r3, (u1.v) r5, (u1.s) r6, (u1.t) r7, (u1.i) r8, (java.lang.String) r9, (long) r10, (a2.a) r12, (a2.h) r13, (w1.f) r14, (long) r15, (a2.e) r17, (u0.h1) r18, (p1.r) r19, (kotlin.jvm.internal.i) r20)
            p1.m r0 = new p1.m
            r1 = 0
            r2 = 0
            r3 = 0
            r23 = r0
            r24 = r40
            r25 = r41
            r26 = r42
            r28 = r44
            r29 = r1
            r30 = r2
            r31 = r3
            r23.<init>(r24, r25, r26, r28, r29, r30, r31)
            r2 = r21
            r3 = r22
            r2.<init>(r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.c0.<init>(long, long, u1.v, u1.s, u1.t, u1.i, java.lang.String, long, a2.a, a2.h, w1.f, long, a2.e, u0.h1, a2.d, a2.f, long, a2.j):void");
    }
}
