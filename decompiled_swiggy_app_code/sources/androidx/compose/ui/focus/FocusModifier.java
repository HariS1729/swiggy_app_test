package androidx.compose.ui.focus;

import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.n0;
import androidx.compose.ui.platform.o0;
import bp0.k;
import f0.e;
import i1.a0;
import i1.m;
import j1.d;
import k1.r;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.c;
import s0.f;
import s0.n;
import s0.q;
import s0.s;

/* compiled from: FocusModifier.kt */
public final class FocusModifier extends o0 implements j1.b, d<FocusModifier>, r, a0 {
    public static final a q = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final l<FocusModifier, k> f6372r = FocusModifier$Companion$RefreshFocusProperties$1.f6385a;

    /* renamed from: b  reason: collision with root package name */
    private FocusModifier f6373b;

    /* renamed from: c  reason: collision with root package name */
    private final e<FocusModifier> f6374c;

    /* renamed from: d  reason: collision with root package name */
    private FocusStateImpl f6375d;

    /* renamed from: e  reason: collision with root package name */
    private FocusModifier f6376e;

    /* renamed from: f  reason: collision with root package name */
    private s0.d f6377f;

    /* renamed from: g  reason: collision with root package name */
    private c1.b<h1.a> f6378g;

    /* renamed from: h  reason: collision with root package name */
    public j1.e f6379h;

    /* renamed from: i  reason: collision with root package name */
    private i1.b f6380i;
    private n j;
    private final s0.l k;

    /* renamed from: l  reason: collision with root package name */
    private q f6381l;

    /* renamed from: m  reason: collision with root package name */
    private LayoutNodeWrapper f6382m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private d1.e f6383o;

    /* renamed from: p  reason: collision with root package name */
    private final e<d1.e> f6384p;

    /* compiled from: FocusModifier.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final l<FocusModifier, k> a() {
            return FocusModifier.f6372r;
        }
    }

    /* compiled from: FocusModifier.kt */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6386a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f6386a = iArr;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FocusModifier(FocusStateImpl focusStateImpl, l<n0, k> lVar, int i11, i iVar) {
        this(focusStateImpl, (i11 & 2) != 0 ? InspectableValueKt.a() : lVar);
    }

    public void D(j1.e eVar) {
        e<FocusModifier> eVar2;
        e<FocusModifier> eVar3;
        LayoutNodeWrapper layoutNodeWrapper;
        LayoutNode j12;
        k1.q t02;
        f focusManager;
        p.j(eVar, "scope");
        y(eVar);
        FocusModifier focusModifier = (FocusModifier) eVar.a(FocusModifierKt.c());
        if (!p.e(focusModifier, this.f6373b)) {
            if (focusModifier == null) {
                int i11 = b.f6386a[this.f6375d.ordinal()];
                if (!((i11 != 1 && i11 != 2) || (layoutNodeWrapper = this.f6382m) == null || (j12 = layoutNodeWrapper.j1()) == null || (t02 = j12.t0()) == null || (focusManager = t02.getFocusManager()) == null)) {
                    focusManager.b(true);
                }
            }
            FocusModifier focusModifier2 = this.f6373b;
            if (!(focusModifier2 == null || (eVar3 = focusModifier2.f6374c) == null)) {
                eVar3.r(this);
            }
            if (!(focusModifier == null || (eVar2 = focusModifier.f6374c) == null)) {
                eVar2.b(this);
            }
        }
        this.f6373b = focusModifier;
        s0.d dVar = (s0.d) eVar.a(FocusEventModifierKt.a());
        if (!p.e(dVar, this.f6377f)) {
            s0.d dVar2 = this.f6377f;
            if (dVar2 != null) {
                dVar2.g(this);
            }
            if (dVar != null) {
                dVar.a(this);
            }
        }
        this.f6377f = dVar;
        q qVar = (q) eVar.a(FocusRequesterModifierKt.b());
        if (!p.e(qVar, this.f6381l)) {
            q qVar2 = this.f6381l;
            if (qVar2 != null) {
                qVar2.f(this);
            }
            if (qVar != null) {
                qVar.a(this);
            }
        }
        this.f6381l = qVar;
        this.f6378g = (c1.b) eVar.a(RotaryInputModifierKt.b());
        this.f6380i = (i1.b) eVar.a(BeyondBoundsLayoutKt.a());
        this.f6383o = (d1.e) eVar.a(KeyInputModifierKt.a());
        this.j = (n) eVar.a(FocusPropertiesKt.c());
        FocusPropertiesKt.d(this);
    }

    public void J(m mVar) {
        p.j(mVar, "coordinates");
        boolean z11 = this.f6382m == null;
        this.f6382m = (LayoutNodeWrapper) mVar;
        if (z11) {
            FocusPropertiesKt.d(this);
        }
        if (this.n) {
            this.n = false;
            s.h(this);
        }
    }

    public /* synthetic */ p0.d N(p0.d dVar) {
        return c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return p0.e.c(this, obj, pVar);
    }

    public final i1.b d() {
        return this.f6380i;
    }

    public final e<FocusModifier> e() {
        return this.f6374c;
    }

    public final s0.d f() {
        return this.f6377f;
    }

    public final s0.l g() {
        return this.k;
    }

    public j1.f<FocusModifier> getKey() {
        return FocusModifierKt.c();
    }

    public final n h() {
        return this.j;
    }

    public final FocusStateImpl i() {
        return this.f6375d;
    }

    public final FocusModifier j() {
        return this.f6376e;
    }

    public final e<d1.e> k() {
        return this.f6384p;
    }

    public final d1.e l() {
        return this.f6383o;
    }

    public final LayoutNodeWrapper m() {
        return this.f6382m;
    }

    public final FocusModifier n() {
        return this.f6373b;
    }

    /* renamed from: o */
    public FocusModifier getValue() {
        return this;
    }

    public boolean o0() {
        return this.f6373b != null;
    }

    public final boolean q(h1.a aVar) {
        p.j(aVar, "event");
        c1.b<h1.a> bVar = this.f6378g;
        if (bVar != null) {
            return bVar.d(aVar);
        }
        return false;
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return p0.e.b(this, obj, pVar);
    }

    public final void u(boolean z11) {
        this.n = z11;
    }

    public final void v(FocusStateImpl focusStateImpl) {
        p.j(focusStateImpl, "value");
        this.f6375d = focusStateImpl;
        s.k(this);
    }

    public final void w(FocusModifier focusModifier) {
        this.f6376e = focusModifier;
    }

    public /* synthetic */ boolean x(l lVar) {
        return p0.e.a(this, lVar);
    }

    public final void y(j1.e eVar) {
        p.j(eVar, "<set-?>");
        this.f6379h = eVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FocusModifier(FocusStateImpl focusStateImpl, l<? super n0, k> lVar) {
        super(lVar);
        p.j(focusStateImpl, "initialFocus");
        p.j(lVar, "inspectorInfo");
        this.f6374c = new e<>(new FocusModifier[16], 0);
        this.f6375d = focusStateImpl;
        this.k = new s0.m();
        this.f6384p = new e<>(new d1.e[16], 0);
    }
}
