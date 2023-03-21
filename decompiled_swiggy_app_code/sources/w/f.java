package w;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.newrelic.agent.android.agentdata.HexAttribute;
import i1.b;
import i1.f0;
import in.swiggy.android.tejas.oldapi.models.order.RenderingDetails;
import j1.d;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.c;
import w.e;

/* compiled from: LazyBeyondBoundsModifier.kt */
final class f implements d<i1.b>, i1.b {

    /* renamed from: a  reason: collision with root package name */
    private final LazyListState f17354a;

    /* renamed from: b  reason: collision with root package name */
    private final e f17355b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f17356c;

    /* renamed from: d  reason: collision with root package name */
    private final LayoutDirection f17357d;

    /* compiled from: LazyBeyondBoundsModifier.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17358a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            f17358a = iArr;
        }
    }

    /* compiled from: LazyBeyondBoundsModifier.kt */
    public static final class b implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f17359a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef<e.a> f17360b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f17361c;

        b(f fVar, Ref$ObjectRef<e.a> ref$ObjectRef, int i11) {
            this.f17359a = fVar;
            this.f17360b = ref$ObjectRef;
            this.f17361c = i11;
        }

        public boolean a() {
            return this.f17359a.f((e.a) this.f17360b.f25666a, this.f17361c);
        }
    }

    public f(LazyListState lazyListState, e eVar, boolean z11, LayoutDirection layoutDirection) {
        p.j(lazyListState, HexAttribute.HEX_ATTR_THREAD_STATE);
        p.j(eVar, "beyondBoundsInfo");
        p.j(layoutDirection, "layoutDirection");
        this.f17354a = lazyListState;
        this.f17355b = eVar;
        this.f17356c = z11;
        this.f17357d = layoutDirection;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r5.f17356c != false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        if (r5.f17356c != false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (r5.f17356c != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        if (r5.f17356c != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        if (r5.f17356c != false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (r5.f17356c != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final w.e.a d(w.e.a r6, int r7) {
        /*
            r5 = this;
            int r0 = r6.b()
            int r6 = r6.a()
            i1.b$b$a r1 = i1.b.C0130b.f14857a
            int r2 = r1.c()
            boolean r2 = i1.b.C0130b.h(r7, r2)
            if (r2 == 0) goto L_0x0018
        L_0x0014:
            int r0 = r0 + -1
            goto L_0x008c
        L_0x0018:
            int r2 = r1.b()
            boolean r2 = i1.b.C0130b.h(r7, r2)
            if (r2 == 0) goto L_0x0026
        L_0x0022:
            int r6 = r6 + 1
            goto L_0x008c
        L_0x0026:
            int r2 = r1.a()
            boolean r2 = i1.b.C0130b.h(r7, r2)
            if (r2 == 0) goto L_0x0035
            boolean r7 = r5.f17356c
            if (r7 == 0) goto L_0x0014
            goto L_0x0022
        L_0x0035:
            int r2 = r1.d()
            boolean r2 = i1.b.C0130b.h(r7, r2)
            if (r2 == 0) goto L_0x0044
            boolean r7 = r5.f17356c
            if (r7 == 0) goto L_0x0022
            goto L_0x0014
        L_0x0044:
            int r2 = r1.e()
            boolean r2 = i1.b.C0130b.h(r7, r2)
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0069
            androidx.compose.ui.unit.LayoutDirection r7 = r5.f17357d
            int[] r1 = w.f.a.f17358a
            int r7 = r7.ordinal()
            r7 = r1[r7]
            if (r7 == r4) goto L_0x0064
            if (r7 == r3) goto L_0x005f
            goto L_0x008c
        L_0x005f:
            boolean r7 = r5.f17356c
            if (r7 == 0) goto L_0x0022
            goto L_0x0014
        L_0x0064:
            boolean r7 = r5.f17356c
            if (r7 == 0) goto L_0x0014
            goto L_0x0022
        L_0x0069:
            int r1 = r1.f()
            boolean r7 = i1.b.C0130b.h(r7, r1)
            if (r7 == 0) goto L_0x0093
            androidx.compose.ui.unit.LayoutDirection r7 = r5.f17357d
            int[] r1 = w.f.a.f17358a
            int r7 = r7.ordinal()
            r7 = r1[r7]
            if (r7 == r4) goto L_0x0087
            if (r7 == r3) goto L_0x0082
            goto L_0x008c
        L_0x0082:
            boolean r7 = r5.f17356c
            if (r7 == 0) goto L_0x0014
            goto L_0x0022
        L_0x0087:
            boolean r7 = r5.f17356c
            if (r7 == 0) goto L_0x0022
            goto L_0x0014
        L_0x008c:
            w.e r7 = r5.f17355b
            w.e$a r6 = r7.a(r0, r6)
            return r6
        L_0x0093:
            java.lang.Void unused = w.b.c()
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w.f.d(w.e$a, int):w.e$a");
    }

    /* access modifiers changed from: private */
    public final boolean f(e.a aVar, int i11) {
        b.C0130b.a aVar2 = b.C0130b.f14857a;
        if (b.C0130b.h(i11, aVar2.c())) {
            return h(aVar);
        }
        if (b.C0130b.h(i11, aVar2.b())) {
            return g(aVar, this);
        }
        if (b.C0130b.h(i11, aVar2.a())) {
            return this.f17356c ? g(aVar, this) : h(aVar);
        }
        if (b.C0130b.h(i11, aVar2.d())) {
            return this.f17356c ? h(aVar) : g(aVar, this);
        }
        if (b.C0130b.h(i11, aVar2.e())) {
            int i12 = a.f17358a[this.f17357d.ordinal()];
            if (i12 == 1) {
                return this.f17356c ? g(aVar, this) : h(aVar);
            }
            if (i12 == 2) {
                return this.f17356c ? h(aVar) : g(aVar, this);
            }
            throw new NoWhenBranchMatchedException();
        } else if (b.C0130b.h(i11, aVar2.f())) {
            int i13 = a.f17358a[this.f17357d.ordinal()];
            if (i13 == 1) {
                return this.f17356c ? h(aVar) : g(aVar, this);
            }
            if (i13 == 2) {
                return this.f17356c ? g(aVar, this) : h(aVar);
            }
            throw new NoWhenBranchMatchedException();
        } else {
            Void unused = b.c();
            throw new KotlinNothingValueException();
        }
    }

    private static final boolean g(e.a aVar, f fVar) {
        return aVar.a() < fVar.f17354a.l().b() - 1;
    }

    private static final boolean h(e.a aVar) {
        return aVar.b() > 0;
    }

    public /* synthetic */ p0.d N(p0.d dVar) {
        return c.a(this, dVar);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return p0.e.c(this, obj, pVar);
    }

    public <T> T a(int i11, l<? super b.a, ? extends T> lVar) {
        p.j(lVar, RenderingDetails.TYPE_BLOCK);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f25666a = this.f17355b.a(this.f17354a.i(), ((i) s.h0(this.f17354a.l().c())).getIndex());
        T t = null;
        while (t == null && f((e.a) ref$ObjectRef.f25666a, i11)) {
            T d11 = d((e.a) ref$ObjectRef.f25666a, i11);
            this.f17355b.e((e.a) ref$ObjectRef.f25666a);
            ref$ObjectRef.f25666a = d11;
            f0 p11 = this.f17354a.p();
            if (p11 != null) {
                p11.b();
            }
            t = lVar.invoke(new b(this, ref$ObjectRef, i11));
        }
        this.f17355b.e((e.a) ref$ObjectRef.f25666a);
        f0 p12 = this.f17354a.p();
        if (p12 != null) {
            p12.b();
        }
        return t;
    }

    /* renamed from: e */
    public i1.b getValue() {
        return this;
    }

    public j1.f<i1.b> getKey() {
        return BeyondBoundsLayoutKt.a();
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return p0.e.b(this, obj, pVar);
    }

    public /* synthetic */ boolean x(l lVar) {
        return p0.e.a(this, lVar);
    }
}
