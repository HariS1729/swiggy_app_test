package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.snapshots.b;
import d2.b;
import d2.c;
import defpackage.a2;
import i1.e0;
import in.swiggy.android.tejas.network.HttpRequest;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import lp0.p;
import lp0.q;
import p0.a;
import s.d;
import s.l;
import w.k;
import w.m;
import w.s;
import w.t;
import w.u;
import x.e;

/* compiled from: LazyList.kt */
final class LazyListKt$rememberLazyListMeasurePolicy$1$1 extends Lambda implements p<e, b, m> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f4005a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a2.p f4006b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f4007c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ LazyListState f4008d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k f4009e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Arrangement.l f4010f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ Arrangement.d f4011g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ LazyListItemPlacementAnimator f4012h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ w.e f4013i;
    final /* synthetic */ a.b j;
    final /* synthetic */ a.c k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ l f4014l;

    /* compiled from: LazyList.kt */
    static final class a implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f4019a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f4020b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f4021c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f4022d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a.b f4023e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a.c f4024f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f4025g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f4026h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f4027i;
        final /* synthetic */ LazyListItemPlacementAnimator j;
        final /* synthetic */ long k;

        a(int i11, int i12, e eVar, boolean z11, a.b bVar, a.c cVar, boolean z12, int i13, int i14, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j11) {
            this.f4019a = i11;
            this.f4020b = i12;
            this.f4021c = eVar;
            this.f4022d = z11;
            this.f4023e = bVar;
            this.f4024f = cVar;
            this.f4025g = z12;
            this.f4026h = i13;
            this.f4027i = i14;
            this.j = lazyListItemPlacementAnimator;
            this.k = j11;
        }

        public final s a(int i11, Object obj, e0[] e0VarArr) {
            kotlin.jvm.internal.p.j(obj, HttpRequest.HEADER_KEY);
            kotlin.jvm.internal.p.j(e0VarArr, "placeables");
            return new s(i11, e0VarArr, this.f4022d, this.f4023e, this.f4024f, this.f4021c.getLayoutDirection(), this.f4025g, this.f4026h, this.f4027i, this.j, i11 == this.f4019a + -1 ? 0 : this.f4020b, this.k, obj, (i) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyListKt$rememberLazyListMeasurePolicy$1$1(boolean z11, a2.p pVar, boolean z12, LazyListState lazyListState, k kVar, Arrangement.l lVar, Arrangement.d dVar, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, w.e eVar, a.b bVar, a.c cVar, l lVar2) {
        super(2);
        this.f4005a = z11;
        this.f4006b = pVar;
        this.f4007c = z12;
        this.f4008d = lazyListState;
        this.f4009e = kVar;
        this.f4010f = lVar;
        this.f4011g = dVar;
        this.f4012h = lazyListItemPlacementAnimator;
        this.f4013i = eVar;
        this.j = bVar;
        this.k = cVar;
        this.f4014l = lVar2;
    }

    public final m a(e eVar, long j11) {
        int i11;
        int i12;
        int i13;
        float f11;
        int i14;
        long j12;
        androidx.compose.runtime.snapshots.b k11;
        e eVar2 = eVar;
        long j13 = j11;
        kotlin.jvm.internal.p.j(eVar2, "$this$null");
        d.a(j13, this.f4005a ? Orientation.Vertical : Orientation.Horizontal);
        if (this.f4005a) {
            i11 = eVar2.j0(this.f4006b.b(eVar.getLayoutDirection()));
        } else {
            i11 = eVar2.j0(PaddingKt.g(this.f4006b, eVar.getLayoutDirection()));
        }
        if (this.f4005a) {
            i12 = eVar2.j0(this.f4006b.c(eVar.getLayoutDirection()));
        } else {
            i12 = eVar2.j0(PaddingKt.f(this.f4006b, eVar.getLayoutDirection()));
        }
        int j02 = eVar2.j0(this.f4006b.d());
        int j03 = eVar2.j0(this.f4006b.a());
        int i15 = j02 + j03;
        int i16 = i11 + i12;
        boolean z11 = this.f4005a;
        int i17 = z11 ? i15 : i16;
        if (z11 && !this.f4007c) {
            i13 = j02;
        } else if (!z11 || !this.f4007c) {
            i13 = (z11 || this.f4007c) ? i12 : i11;
        } else {
            i13 = j03;
        }
        int i18 = i17 - i13;
        long i19 = c.i(j13, -i16, -i15);
        this.f4008d.B(this.f4009e);
        this.f4008d.w(eVar2);
        this.f4009e.d().b(eVar2.k(b.n(i19)));
        this.f4009e.d().a(eVar2.k(b.m(i19)));
        if (this.f4005a) {
            Arrangement.l lVar = this.f4010f;
            if (lVar != null) {
                f11 = lVar.a();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            Arrangement.d dVar = this.f4011g;
            if (dVar != null) {
                f11 = dVar.a();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        int j04 = eVar2.j0(f11);
        int itemCount = this.f4009e.getItemCount();
        if (this.f4005a) {
            i14 = b.m(j11) - i15;
        } else {
            i14 = b.n(j11) - i16;
        }
        int i21 = i14;
        if (!this.f4007c || i21 > 0) {
            j12 = d2.m.a(i11, j02);
        } else {
            boolean z12 = this.f4005a;
            if (!z12) {
                i11 += i21;
            }
            if (z12) {
                j02 += i21;
            }
            j12 = d2.m.a(i11, j02);
        }
        boolean z13 = this.f4005a;
        int i22 = i16;
        t tVar = new t(i19, z13, this.f4009e, eVar, new a(itemCount, j04, eVar, z13, this.j, this.k, this.f4007c, i13, i18, this.f4012h, j12), (i) null);
        this.f4008d.y(tVar.b());
        b.a aVar = androidx.compose.runtime.snapshots.b.f6287e;
        LazyListState lazyListState = this.f4008d;
        androidx.compose.runtime.snapshots.b a11 = aVar.a();
        try {
            k11 = a11.k();
            int b11 = w.a.b(lazyListState.i());
            int j14 = lazyListState.j();
            bp0.k kVar = bp0.k.f22762a;
            a11.r(k11);
            a11.d();
            final int i23 = i15;
            float r11 = this.f4008d.r();
            boolean z14 = this.f4005a;
            List<Integer> f12 = this.f4009e.f();
            Arrangement.l lVar2 = this.f4010f;
            Arrangement.d dVar2 = this.f4011g;
            boolean z15 = this.f4007c;
            LazyListItemPlacementAnimator lazyListItemPlacementAnimator = this.f4012h;
            w.e eVar3 = this.f4013i;
            AnonymousClass2 r26 = r2;
            final e eVar4 = eVar;
            final long j15 = j11;
            final int i24 = i22;
            AnonymousClass2 r22 = new q<Integer, Integer, lp0.l<? super e0.a, ? extends bp0.k>, i1.u>() {
                public final i1.u a(int i11, int i12, lp0.l<? super e0.a, bp0.k> lVar) {
                    kotlin.jvm.internal.p.j(lVar, "placement");
                    return eVar4.x0(c.g(j15, i11 + i24), c.f(j15, i12 + i23), x.f(), lVar);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return a(((Number) obj).intValue(), ((Number) obj2).intValue(), (lp0.l) obj3);
                }
            };
            m c11 = LazyListMeasureKt.c(itemCount, tVar, i21, i13, i18, b11, j14, r11, i19, z14, f12, lVar2, dVar2, z15, eVar, lazyListItemPlacementAnimator, eVar3, r26);
            LazyListState lazyListState2 = this.f4008d;
            l lVar3 = this.f4014l;
            lazyListState2.f(c11);
            LazyListKt.e(lVar3, c11);
            return c11;
        } catch (Throwable th2) {
            a11.d();
            throw th2;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((e) obj, ((d2.b) obj2).t());
    }
}
