package androidx.compose.foundation.lazy;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import defpackage.y1;
import e0.a1;
import e0.h0;
import i1.f0;
import i1.g0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import m0.c;
import p0.d;
import p0.e;
import u.j;
import u.k;
import w.l;
import w.m;
import w.r;
import w.s;
import x.g;

/* compiled from: LazyListState.kt */
public final class LazyListState implements y1.r {
    public static final a t = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public static final c<LazyListState, ?> f4038u = ListSaverKt.a(LazyListState$Companion$Saver$1.f4054a, LazyListState$Companion$Saver$2.f4055a);

    /* renamed from: a  reason: collision with root package name */
    private final r f4039a;

    /* renamed from: b  reason: collision with root package name */
    private final h0<l> f4040b;

    /* renamed from: c  reason: collision with root package name */
    private final k f4041c;

    /* renamed from: d  reason: collision with root package name */
    private float f4042d;

    /* renamed from: e  reason: collision with root package name */
    private final h0 f4043e;

    /* renamed from: f  reason: collision with root package name */
    private final y1.r f4044f;

    /* renamed from: g  reason: collision with root package name */
    private int f4045g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4046h;

    /* renamed from: i  reason: collision with root package name */
    private int f4047i;
    private g.a j;
    private boolean k;

    /* renamed from: l  reason: collision with root package name */
    private final h0 f4048l;

    /* renamed from: m  reason: collision with root package name */
    private final g0 f4049m;
    private final AwaitFirstLayoutModifier n;

    /* renamed from: o  reason: collision with root package name */
    private final h0 f4050o;

    /* renamed from: p  reason: collision with root package name */
    private final h0 f4051p;
    private boolean q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f4052r;

    /* renamed from: s  reason: collision with root package name */
    private final g f4053s;

    /* compiled from: LazyListState.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final c<LazyListState, ?> a() {
            return LazyListState.f4038u;
        }
    }

    /* compiled from: LazyListState.kt */
    public static final class b implements g0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LazyListState f4056a;

        b(LazyListState lazyListState) {
            this.f4056a = lazyListState;
        }

        public void B(f0 f0Var) {
            p.j(f0Var, "remeasurement");
            this.f4056a.z(f0Var);
        }

        public /* synthetic */ d N(d dVar) {
            return p0.c.a(this, dVar);
        }

        public /* synthetic */ Object W(Object obj, lp0.p pVar) {
            return e.c(this, obj, pVar);
        }

        public /* synthetic */ Object s(Object obj, lp0.p pVar) {
            return e.b(this, obj, pVar);
        }

        public /* synthetic */ boolean x(lp0.l lVar) {
            return e.a(this, lVar);
        }
    }

    public LazyListState() {
        this(0, 0, 3, (i) null);
    }

    public LazyListState(int i11, int i12) {
        this.f4039a = new r(i11, i12);
        this.f4040b = j.e(a.f4091a, (a1) null, 2, (Object) null);
        this.f4041c = j.a();
        this.f4043e = j.e(d2.g.a(1.0f, 1.0f), (a1) null, 2, (Object) null);
        this.f4044f = ScrollableStateKt.a(new LazyListState$scrollableState$1(this));
        this.f4046h = true;
        this.f4047i = -1;
        this.f4048l = j.e((Object) null, (a1) null, 2, (Object) null);
        this.f4049m = new b(this);
        this.n = new AwaitFirstLayoutModifier();
        this.f4050o = j.e((Object) null, (a1) null, 2, (Object) null);
        this.f4051p = j.e(d2.b.b(d2.c.b(0, 0, 0, 0, 15, (Object) null)), (a1) null, 2, (Object) null);
        this.f4053s = new g();
    }

    private final void s(float f11) {
        int i11;
        g.a aVar;
        if (this.f4046h) {
            l l11 = l();
            boolean z11 = true;
            if (!l11.c().isEmpty()) {
                boolean z12 = f11 < 0.0f;
                if (z12) {
                    i11 = ((w.i) s.h0(l11.c())).getIndex() + 1;
                } else {
                    i11 = ((w.i) s.W(l11.c())).getIndex() - 1;
                }
                if (i11 != this.f4047i) {
                    if (i11 < 0 || i11 >= l11.b()) {
                        z11 = false;
                    }
                    if (z11) {
                        if (!(this.k == z12 || (aVar = this.j) == null)) {
                            aVar.cancel();
                        }
                        this.k = z12;
                        this.f4047i = i11;
                        this.j = this.f4053s.b(i11, o());
                    }
                }
            }
        }
    }

    public static /* synthetic */ Object v(LazyListState lazyListState, int i11, int i12, fp0.c cVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return lazyListState.u(i11, i12, cVar);
    }

    /* access modifiers changed from: private */
    public final void z(f0 f0Var) {
        this.f4048l.setValue(f0Var);
    }

    public final void A(int i11, int i12) {
        this.f4039a.c(w.a.b(i11), i12);
        LazyListItemPlacementAnimator m11 = m();
        if (m11 != null) {
            m11.f();
        }
        f0 p11 = p();
        if (p11 != null) {
            p11.b();
        }
    }

    public final void B(w.k kVar) {
        p.j(kVar, "itemProvider");
        this.f4039a.h(kVar);
    }

    public boolean a() {
        return this.f4044f.a();
    }

    public float b(float f11) {
        return this.f4044f.b(f11);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: lp0.p<? super y1$p, ? super fp0.c<? super bp0.k>, ? extends java.lang.Object>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(androidx.compose.foundation.MutatePriority r6, lp0.p<? super defpackage.y1.p, ? super fp0.c<? super bp0.k>, ? extends java.lang.Object> r7, fp0.c<? super bp0.k> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.LazyListState$scroll$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = (androidx.compose.foundation.lazy.LazyListState$scroll$1) r0
            int r1 = r0.f4062f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f4062f = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = new androidx.compose.foundation.lazy.LazyListState$scroll$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f4060d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f4062f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            bp0.g.b(r8)
            goto L_0x006c
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            java.lang.Object r6 = r0.f4059c
            r7 = r6
            lp0.p r7 = (lp0.p) r7
            java.lang.Object r6 = r0.f4058b
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            java.lang.Object r2 = r0.f4057a
            androidx.compose.foundation.lazy.LazyListState r2 = (androidx.compose.foundation.lazy.LazyListState) r2
            bp0.g.b(r8)
            goto L_0x005a
        L_0x0045:
            bp0.g.b(r8)
            androidx.compose.foundation.lazy.AwaitFirstLayoutModifier r8 = r5.n
            r0.f4057a = r5
            r0.f4058b = r6
            r0.f4059c = r7
            r0.f4062f = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r2 = r5
        L_0x005a:
            y1$r r8 = r2.f4044f
            r2 = 0
            r0.f4057a = r2
            r0.f4058b = r2
            r0.f4059c = r2
            r0.f4062f = r3
            java.lang.Object r6 = r8.c(r6, r7, r0)
            if (r6 != r1) goto L_0x006c
            return r1
        L_0x006c:
            bp0.k r6 = bp0.k.f22762a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.c(androidx.compose.foundation.MutatePriority, lp0.p, fp0.c):java.lang.Object");
    }

    public final void f(m mVar) {
        p.j(mVar, "result");
        this.f4039a.g(mVar);
        this.f4042d -= mVar.f();
        this.f4040b.setValue(mVar);
        this.f4052r = mVar.e();
        s g11 = mVar.g();
        boolean z11 = false;
        if (!((g11 != null ? g11.b() : 0) == 0 && mVar.h() == 0)) {
            z11 = true;
        }
        this.q = z11;
        this.f4045g++;
    }

    public final AwaitFirstLayoutModifier g() {
        return this.n;
    }

    public final boolean h() {
        return this.f4052r;
    }

    public final int i() {
        return this.f4039a.a();
    }

    public final int j() {
        return this.f4039a.b();
    }

    public final k k() {
        return this.f4041c;
    }

    public final l l() {
        return this.f4040b.getValue();
    }

    public final LazyListItemPlacementAnimator m() {
        return (LazyListItemPlacementAnimator) this.f4050o.getValue();
    }

    public final g n() {
        return this.f4053s;
    }

    public final long o() {
        return ((d2.b) this.f4051p.getValue()).t();
    }

    public final f0 p() {
        return (f0) this.f4048l.getValue();
    }

    public final g0 q() {
        return this.f4049m;
    }

    public final float r() {
        return this.f4042d;
    }

    public final float t(float f11) {
        if ((f11 < 0.0f && !this.f4052r) || (f11 > 0.0f && !this.q)) {
            return 0.0f;
        }
        if (Math.abs(this.f4042d) <= 0.5f) {
            float f12 = this.f4042d + f11;
            this.f4042d = f12;
            if (Math.abs(f12) > 0.5f) {
                float f13 = this.f4042d;
                f0 p11 = p();
                if (p11 != null) {
                    p11.b();
                }
                if (this.f4046h) {
                    s(f13 - this.f4042d);
                }
            }
            if (Math.abs(this.f4042d) <= 0.5f) {
                return f11;
            }
            float f14 = f11 - this.f4042d;
            this.f4042d = 0.0f;
            return f14;
        }
        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.f4042d).toString());
    }

    public final Object u(int i11, int i12, fp0.c<? super bp0.k> cVar) {
        Object a11 = y1.q.a(this, (MutatePriority) null, new LazyListState$scrollToItem$2(this, i11, i12, (fp0.c<? super LazyListState$scrollToItem$2>) null), cVar, 1, (Object) null);
        return a11 == b.d() ? a11 : bp0.k.f22762a;
    }

    public final void w(d2.e eVar) {
        p.j(eVar, "<set-?>");
        this.f4043e.setValue(eVar);
    }

    public final void x(LazyListItemPlacementAnimator lazyListItemPlacementAnimator) {
        this.f4050o.setValue(lazyListItemPlacementAnimator);
    }

    public final void y(long j11) {
        this.f4051p.setValue(d2.b.b(j11));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LazyListState(int i11, int i12, int i13, i iVar) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12);
    }
}
