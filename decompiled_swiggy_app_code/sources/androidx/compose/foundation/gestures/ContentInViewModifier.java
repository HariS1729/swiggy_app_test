package androidx.compose.foundation.gestures;

import androidx.compose.foundation.FocusedBoundsKt;
import androidx.compose.foundation.relocation.BringIntoViewResponderKt;
import bp0.k;
import d2.p;
import d2.q;
import defpackage.v1;
import defpackage.y1;
import fp0.c;
import i1.a0;
import i1.b0;
import i1.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import p0.d;
import t0.f;
import t0.h;
import t0.i;
import t0.l;
import wp0.j0;
import wp0.k1;
import y.e;

/* compiled from: Scrollable.kt */
final class ContentInViewModifier implements e, b0, a0 {

    /* renamed from: a  reason: collision with root package name */
    private final j0 f3193a;

    /* renamed from: b  reason: collision with root package name */
    private final Orientation f3194b;

    /* renamed from: c  reason: collision with root package name */
    private final y1.r f3195c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f3196d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public m f3197e;

    /* renamed from: f  reason: collision with root package name */
    private m f3198f;

    /* renamed from: g  reason: collision with root package name */
    private p f3199g;

    /* renamed from: h  reason: collision with root package name */
    private final d f3200h = BringIntoViewResponderKt.c(FocusedBoundsKt.b(this, new ContentInViewModifier$modifier$1(this)), this);

    /* compiled from: Scrollable.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3201a;

        static {
            int[] iArr = new int[Orientation.values().length];
            iArr[Orientation.Vertical.ordinal()] = 1;
            iArr[Orientation.Horizontal.ordinal()] = 2;
            f3201a = iArr;
        }
    }

    public ContentInViewModifier(j0 j0Var, Orientation orientation, y1.r rVar, boolean z11) {
        kotlin.jvm.internal.p.j(j0Var, "scope");
        kotlin.jvm.internal.p.j(orientation, "orientation");
        kotlin.jvm.internal.p.j(rVar, "scrollableState");
        this.f3193a = j0Var;
        this.f3194b = orientation;
        this.f3195c = rVar;
        this.f3196d = z11;
    }

    private final h f(h hVar, long j) {
        long b11 = q.b(j);
        int i11 = a.f3201a[this.f3194b.ordinal()];
        if (i11 == 1) {
            return hVar.q(0.0f, j(hVar.l(), hVar.e(), l.g(b11)));
        }
        if (i11 == 2) {
            return hVar.q(j(hVar.i(), hVar.j(), l.i(b11)), 0.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void h(m mVar, long j) {
        m mVar2;
        h B;
        if ((this.f3194b != Orientation.Horizontal ? p.f(mVar.a()) < p.f(j) : p.g(mVar.a()) < p.g(j)) && (mVar2 = this.f3197e) != null && (B = mVar.B(mVar2, false)) != null) {
            h b11 = i.b(f.f16662b.c(), q.b(j));
            h f11 = f(B, mVar.a());
            boolean p11 = b11.p(B);
            boolean z11 = !kotlin.jvm.internal.p.e(f11, B);
            if (p11 && z11) {
                k1 unused = j.d(this.f3193a, (CoroutineContext) null, (CoroutineStart) null, new ContentInViewModifier$onSizeChanged$1(this, B, f11, (c<? super ContentInViewModifier$onSizeChanged$1>) null), 3, (Object) null);
            }
        }
    }

    /* access modifiers changed from: private */
    public final Object i(h hVar, h hVar2, c<? super k> cVar) {
        float f11;
        float f12;
        int i11 = a.f3201a[this.f3194b.ordinal()];
        if (i11 == 1) {
            f12 = hVar.l();
            f11 = hVar2.l();
        } else if (i11 == 2) {
            f12 = hVar.i();
            f11 = hVar2.i();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        float f13 = f12 - f11;
        if (this.f3196d) {
            f13 = -f13;
        }
        Object b11 = ScrollExtensionsKt.b(this.f3195c, f13, (v1.g) null, cVar, 2, (Object) null);
        return b11 == b.d() ? b11 : k.f22762a;
    }

    private final float j(float f11, float f12, float f13) {
        if ((f11 >= 0.0f && f12 <= f13) || (f11 < 0.0f && f12 > f13)) {
            return 0.0f;
        }
        float f14 = f12 - f13;
        return Math.abs(f11) < Math.abs(f14) ? f11 : f14;
    }

    public void J(m mVar) {
        kotlin.jvm.internal.p.j(mVar, "coordinates");
        this.f3198f = mVar;
    }

    public /* synthetic */ d N(d dVar) {
        return p0.c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return p0.e.c(this, obj, pVar);
    }

    public void Y(long j) {
        m mVar = this.f3198f;
        p pVar = this.f3199g;
        if (pVar != null && !p.e(pVar.j(), j)) {
            boolean z11 = true;
            if (mVar == null || !mVar.D()) {
                z11 = false;
            }
            if (z11) {
                h(mVar, pVar.j());
            }
        }
        this.f3199g = p.b(j);
    }

    public h a(h hVar) {
        kotlin.jvm.internal.p.j(hVar, "localRect");
        p pVar = this.f3199g;
        if (pVar != null) {
            return f(hVar, pVar.j());
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }

    public Object c(h hVar, c<? super k> cVar) {
        Object i11 = i(hVar, a(hVar), cVar);
        return i11 == b.d() ? i11 : k.f22762a;
    }

    public final d g() {
        return this.f3200h;
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return p0.e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(lp0.l lVar) {
        return p0.e.a(this, lVar);
    }
}
