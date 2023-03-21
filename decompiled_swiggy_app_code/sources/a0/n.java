package a0;

import a2.l;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.unit.LayoutDirection;
import d2.c;
import d2.e;
import d2.q;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import p1.b;
import p1.c0;
import p1.d;
import p1.d0;
import p1.o;
import p1.y;
import p1.z;
import u0.x;
import u1.i;

/* compiled from: TextDelegate.kt */
public final class n {
    public static final a k = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final b f855a;

    /* renamed from: b  reason: collision with root package name */
    private final c0 f856b;

    /* renamed from: c  reason: collision with root package name */
    private final int f857c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f858d;

    /* renamed from: e  reason: collision with root package name */
    private final int f859e;

    /* renamed from: f  reason: collision with root package name */
    private final e f860f;

    /* renamed from: g  reason: collision with root package name */
    private final i.b f861g;

    /* renamed from: h  reason: collision with root package name */
    private final List<b.C0163b<o>> f862h;

    /* renamed from: i  reason: collision with root package name */
    private MultiParagraphIntrinsics f863i;
    private LayoutDirection j;

    /* compiled from: TextDelegate.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final void a(x xVar, y yVar) {
            p.j(xVar, "canvas");
            p.j(yVar, "textLayoutResult");
            z.f16200a.a(xVar, yVar);
        }
    }

    private n(b bVar, c0 c0Var, int i11, boolean z11, int i12, e eVar, i.b bVar2, List<b.C0163b<o>> list) {
        this.f855a = bVar;
        this.f856b = c0Var;
        this.f857c = i11;
        this.f858d = z11;
        this.f859e = i12;
        this.f860f = eVar;
        this.f861g = bVar2;
        this.f862h = list;
        if (!(i11 > 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public /* synthetic */ n(b bVar, c0 c0Var, int i11, boolean z11, int i12, e eVar, i.b bVar2, List list, kotlin.jvm.internal.i iVar) {
        this(bVar, c0Var, i11, z11, i12, eVar, bVar2, list);
    }

    private final MultiParagraphIntrinsics f() {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.f863i;
        if (multiParagraphIntrinsics != null) {
            return multiParagraphIntrinsics;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    public static /* synthetic */ y m(n nVar, long j11, LayoutDirection layoutDirection, y yVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            yVar = null;
        }
        return nVar.l(j11, layoutDirection, yVar);
    }

    private final d o(long j11, LayoutDirection layoutDirection) {
        int i11;
        n(layoutDirection);
        int p11 = d2.b.p(j11);
        boolean z11 = false;
        int n = (!(this.f858d || l.d(this.f859e, l.f950a.b())) || !d2.b.j(j11)) ? Integer.MAX_VALUE : d2.b.n(j11);
        if (!this.f858d && l.d(this.f859e, l.f950a.b())) {
            z11 = true;
        }
        if (z11) {
            i11 = 1;
        } else {
            i11 = this.f857c;
        }
        if (p11 != n) {
            n = l.m(c(), p11, n);
        }
        return new d(f(), c.b(0, n, 0, d2.b.m(j11), 5, (Object) null), i11, l.d(this.f859e, l.f950a.b()), (kotlin.jvm.internal.i) null);
    }

    public final e a() {
        return this.f860f;
    }

    public final i.b b() {
        return this.f861g;
    }

    public final int c() {
        return (int) ((float) Math.ceil((double) f().c()));
    }

    public final int d() {
        return this.f857c;
    }

    public final int e() {
        return (int) ((float) Math.ceil((double) f().a()));
    }

    public final int g() {
        return this.f859e;
    }

    public final List<b.C0163b<o>> h() {
        return this.f862h;
    }

    public final boolean i() {
        return this.f858d;
    }

    public final c0 j() {
        return this.f856b;
    }

    public final b k() {
        return this.f855a;
    }

    public final y l(long j11, LayoutDirection layoutDirection, y yVar) {
        long j12 = j11;
        y yVar2 = yVar;
        p.j(layoutDirection, "layoutDirection");
        if (yVar2 != null) {
            if (r.a(yVar, this.f855a, this.f856b, this.f862h, this.f857c, this.f858d, this.f859e, this.f860f, layoutDirection, this.f861g, j11)) {
                p1.x xVar = r1;
                p1.x xVar2 = new p1.x(yVar.k().j(), this.f856b, (List) yVar.k().g(), yVar.k().e(), yVar.k().h(), yVar.k().f(), yVar.k().b(), yVar.k().d(), yVar.k().c(), j11, (kotlin.jvm.internal.i) null);
                return yVar.a(xVar, c.d(j12, q.a((int) ((float) Math.ceil((double) yVar.v().y())), (int) ((float) Math.ceil((double) yVar.v().g())))));
            }
        }
        d o11 = o(j11, layoutDirection);
        return new y(new p1.x(this.f855a, this.f856b, (List) this.f862h, this.f857c, this.f858d, this.f859e, this.f860f, layoutDirection, this.f861g, j11, (kotlin.jvm.internal.i) null), o11, c.d(j12, q.a((int) ((float) Math.ceil((double) o11.y())), (int) ((float) Math.ceil((double) o11.g())))), (kotlin.jvm.internal.i) null);
    }

    public final void n(LayoutDirection layoutDirection) {
        p.j(layoutDirection, "layoutDirection");
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.f863i;
        if (multiParagraphIntrinsics == null || layoutDirection != this.j || multiParagraphIntrinsics.b()) {
            this.j = layoutDirection;
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(this.f855a, d0.d(this.f856b, layoutDirection), this.f862h, this.f860f, this.f861g);
        }
        this.f863i = multiParagraphIntrinsics;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ n(p1.b r13, p1.c0 r14, int r15, boolean r16, int r17, d2.e r18, u1.i.b r19, java.util.List r20, int r21, kotlin.jvm.internal.i r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 4
            if (r1 == 0) goto L_0x000d
            r1 = 2147483647(0x7fffffff, float:NaN)
            r5 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x000e
        L_0x000d:
            r5 = r15
        L_0x000e:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0015
            r1 = 1
            r6 = 1
            goto L_0x0017
        L_0x0015:
            r6 = r16
        L_0x0017:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0023
            a2.l$a r1 = a2.l.f950a
            int r1 = r1.a()
            r7 = r1
            goto L_0x0025
        L_0x0023:
            r7 = r17
        L_0x0025:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x002f
            java.util.List r0 = kotlin.collections.k.j()
            r10 = r0
            goto L_0x0031
        L_0x002f:
            r10 = r20
        L_0x0031:
            r11 = 0
            r2 = r12
            r3 = r13
            r4 = r14
            r8 = r18
            r9 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.n.<init>(p1.b, p1.c0, int, boolean, int, d2.e, u1.i$b, java.util.List, int, kotlin.jvm.internal.i):void");
    }
}
