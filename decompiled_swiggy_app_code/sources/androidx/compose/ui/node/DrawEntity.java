package androidx.compose.ui.node;

import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import d2.q;
import i1.w;
import k1.h;
import k1.i;
import k1.j;
import k1.r;
import kotlin.jvm.internal.p;
import lp0.l;
import r0.e;
import r0.f;
import u0.x;
import w0.a;

/* compiled from: DrawEntity.kt */
public final class DrawEntity extends i<DrawEntity, f> implements r {

    /* renamed from: i  reason: collision with root package name */
    public static final a f6819i = new a((kotlin.jvm.internal.i) null);
    private static final l<DrawEntity, k> j = DrawEntity$Companion$onCommitAffectingDrawEntity$1.f6824a;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public e f6820e = o();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final r0.b f6821f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f6822g;

    /* renamed from: h  reason: collision with root package name */
    private final lp0.a<k> f6823h;

    /* compiled from: DrawEntity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }
    }

    /* compiled from: DrawEntity.kt */
    public static final class b implements r0.b {

        /* renamed from: a  reason: collision with root package name */
        private final d2.e f6825a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DrawEntity f6826b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ LayoutNodeWrapper f6827c;

        b(DrawEntity drawEntity, LayoutNodeWrapper layoutNodeWrapper) {
            this.f6826b = drawEntity;
            this.f6827c = layoutNodeWrapper;
            this.f6825a = drawEntity.a().X();
        }

        public long d() {
            return q.b(this.f6827c.a());
        }

        public d2.e getDensity() {
            return this.f6825a;
        }

        public LayoutDirection getLayoutDirection() {
            return this.f6826b.a().getLayoutDirection();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawEntity(LayoutNodeWrapper layoutNodeWrapper, f fVar) {
        super(layoutNodeWrapper, fVar);
        p.j(layoutNodeWrapper, "layoutNodeWrapper");
        p.j(fVar, "modifier");
        this.f6821f = new b(this, layoutNodeWrapper);
        this.f6822g = true;
        this.f6823h = new DrawEntity$updateCache$1(this);
    }

    private final e o() {
        f fVar = (f) c();
        if (fVar instanceof e) {
            return (e) fVar;
        }
        return null;
    }

    public void g() {
        this.f6820e = o();
        this.f6822g = true;
        super.g();
    }

    public final void m(x xVar) {
        p.j(xVar, "canvas");
        long b11 = q.b(e());
        if (this.f6820e != null && this.f6822g) {
            j.a(a()).getSnapshotObserver().e(this, j, this.f6823h);
        }
        h h02 = a().h0();
        LayoutNodeWrapper b12 = b();
        DrawEntity p11 = h02.f15355b;
        h02.f15355b = this;
        w0.a b13 = h02.f15354a;
        w l12 = b12.l1();
        LayoutDirection layoutDirection = b12.l1().getLayoutDirection();
        a.C0202a D = b13.D();
        d2.e a11 = D.a();
        LayoutDirection b14 = D.b();
        x c11 = D.c();
        long d11 = D.d();
        a.C0202a D2 = b13.D();
        D2.j(l12);
        D2.k(layoutDirection);
        D2.i(xVar);
        D2.l(b11);
        xVar.a();
        ((f) c()).b(h02);
        xVar.o();
        a.C0202a D3 = b13.D();
        D3.j(a11);
        D3.k(b14);
        D3.i(c11);
        D3.l(d11);
        h02.f15355b = p11;
    }

    public final void n() {
        this.f6822g = true;
    }

    public boolean o0() {
        return b().D();
    }
}
