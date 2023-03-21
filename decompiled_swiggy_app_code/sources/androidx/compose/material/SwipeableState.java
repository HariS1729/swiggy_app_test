package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.runtime.g;
import bp0.k;
import c0.s;
import defpackage.v1;
import defpackage.y1;
import e0.a1;
import e0.d1;
import e0.h0;
import fp0.c;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.f;
import lp0.l;

/* compiled from: Swipeable.kt */
public class SwipeableState<T> {
    public static final a q = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final v1.g<Float> f5494a;

    /* renamed from: b  reason: collision with root package name */
    private final l<T, Boolean> f5495b;

    /* renamed from: c  reason: collision with root package name */
    private final h0 f5496c;

    /* renamed from: d  reason: collision with root package name */
    private final h0 f5497d = j.e(Boolean.FALSE, (a1) null, 2, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final h0<Float> f5498e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final h0<Float> f5499f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final h0<Float> f5500g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final h0<Float> f5501h;

    /* renamed from: i  reason: collision with root package name */
    private final h0 f5502i;
    private final d<Map<Float, T>> j;
    private float k;

    /* renamed from: l  reason: collision with root package name */
    private float f5503l;

    /* renamed from: m  reason: collision with root package name */
    private final h0 f5504m;
    private final h0 n;

    /* renamed from: o  reason: collision with root package name */
    private final h0 f5505o;

    /* renamed from: p  reason: collision with root package name */
    private final y1.j f5506p;

    /* compiled from: Swipeable.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: Collect.kt */
    public static final class b implements e<Map<Float, ? extends T>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SwipeableState f5527a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f5528b;

        public b(SwipeableState swipeableState, float f11) {
            this.f5527a = swipeableState;
            this.f5528b = f11;
        }

        public Object emit(Map<Float, ? extends T> map, c<? super k> cVar) {
            Map map2 = map;
            Float b11 = SwipeableKt.e(map2, this.f5527a.o());
            p.g(b11);
            float floatValue = b11.floatValue();
            Object obj = map2.get(kotlin.coroutines.jvm.internal.a.c(SwipeableKt.c(this.f5527a.s().getValue().floatValue(), floatValue, map2.keySet(), this.f5527a.u(), this.f5528b, this.f5527a.v())));
            if (obj == null || !((Boolean) this.f5527a.n().invoke(obj)).booleanValue()) {
                SwipeableState swipeableState = this.f5527a;
                Object a11 = swipeableState.h(floatValue, swipeableState.m(), cVar);
                if (a11 == b.d()) {
                    return a11;
                }
            } else {
                Object j = SwipeableState.j(this.f5527a, obj, (v1.g) null, cVar, 2, (Object) null);
                if (j == b.d()) {
                    return j;
                }
            }
            return k.f22762a;
        }
    }

    public SwipeableState(T t, v1.g<Float> gVar, l<? super T, Boolean> lVar) {
        p.j(gVar, "animationSpec");
        p.j(lVar, "confirmStateChange");
        this.f5494a = gVar;
        this.f5495b = lVar;
        this.f5496c = j.e(t, (a1) null, 2, (Object) null);
        Float valueOf = Float.valueOf(0.0f);
        this.f5498e = j.e(valueOf, (a1) null, 2, (Object) null);
        this.f5499f = j.e(valueOf, (a1) null, 2, (Object) null);
        this.f5500g = j.e(valueOf, (a1) null, 2, (Object) null);
        this.f5501h = j.e((Object) null, (a1) null, 2, (Object) null);
        this.f5502i = j.e(x.f(), (a1) null, 2, (Object) null);
        this.j = f.K(new SwipeableState$special$$inlined$filter$1(g.n(new SwipeableState$latestNonEmptyAnchorsFlow$1(this))), 1);
        this.k = Float.NEGATIVE_INFINITY;
        this.f5503l = Float.POSITIVE_INFINITY;
        this.f5504m = j.e(SwipeableState$thresholds$2.f5541a, (a1) null, 2, (Object) null);
        this.n = j.e(valueOf, (a1) null, 2, (Object) null);
        this.f5505o = j.e((Object) null, (a1) null, 2, (Object) null);
        this.f5506p = DraggableKt.a(new SwipeableState$draggableState$1(this));
    }

    /* access modifiers changed from: private */
    public final void A(boolean z11) {
        this.f5497d.setValue(Boolean.valueOf(z11));
    }

    /* access modifiers changed from: private */
    public final void B(T t) {
        this.f5496c.setValue(t);
    }

    private final Object H(float f11, c<? super k> cVar) {
        Object a11 = y1.i.a(p(), (MutatePriority) null, new SwipeableState$snapInternalToOffset$2(f11, this, (c<? super SwipeableState$snapInternalToOffset$2>) null), cVar, 1, (Object) null);
        return a11 == b.d() ? a11 : k.f22762a;
    }

    /* access modifiers changed from: private */
    public final Object h(float f11, v1.g<Float> gVar, c<? super k> cVar) {
        Object a11 = y1.i.a(p(), (MutatePriority) null, new SwipeableState$animateInternalToOffset$2(this, f11, gVar, (c<? super SwipeableState$animateInternalToOffset$2>) null), cVar, 1, (Object) null);
        return a11 == b.d() ? a11 : k.f22762a;
    }

    public static /* synthetic */ Object j(SwipeableState swipeableState, Object obj, v1.g<Float> gVar, c cVar, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 2) != 0) {
                gVar = swipeableState.m();
            }
            return swipeableState.i(obj, gVar, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
    }

    public final void C(float f11) {
        this.f5503l = f11;
    }

    public final void D(float f11) {
        this.k = f11;
    }

    public final void E(s sVar) {
        this.f5505o.setValue(sVar);
    }

    public final void F(lp0.p<? super Float, ? super Float, Float> pVar) {
        p.j(pVar, "<set-?>");
        this.f5504m.setValue(pVar);
    }

    public final void G(float f11) {
        this.n.setValue(Float.valueOf(f11));
    }

    public final Object i(T t, v1.g<Float> gVar, c<? super k> cVar) {
        Object collect = this.j.collect(new SwipeableState$animateTo$$inlined$collect$1(t, this, gVar), cVar);
        if (collect == b.d()) {
            return collect;
        }
        return k.f22762a;
    }

    public final void k(Map<Float, ? extends T> map) {
        p.j(map, "newAnchors");
        if (l().isEmpty()) {
            Float b11 = SwipeableKt.e(map, o());
            if (b11 != null) {
                this.f5498e.setValue(b11);
                this.f5500g.setValue(b11);
                return;
            }
            throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
        }
    }

    public final Map<Float, T> l() {
        return (Map) this.f5502i.getValue();
    }

    public final v1.g<Float> m() {
        return this.f5494a;
    }

    public final l<T, Boolean> n() {
        return this.f5495b;
    }

    public final T o() {
        return this.f5496c.getValue();
    }

    public final y1.j p() {
        return this.f5506p;
    }

    public final float q() {
        return this.f5503l;
    }

    public final float r() {
        return this.k;
    }

    public final d1<Float> s() {
        return this.f5498e;
    }

    public final s t() {
        return (s) this.f5505o.getValue();
    }

    public final lp0.p<Float, Float, Float> u() {
        return (lp0.p) this.f5504m.getValue();
    }

    public final float v() {
        return ((Number) this.n.getValue()).floatValue();
    }

    public final boolean w() {
        return ((Boolean) this.f5497d.getValue()).booleanValue();
    }

    public final Object x(float f11, c<? super k> cVar) {
        Object collect = this.j.collect(new b(this, f11), cVar);
        if (collect == b.d()) {
            return collect;
        }
        return k.f22762a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:17|18|19|79|80|(1:82)(4:83|84|87|88)) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r12 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0208 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0216 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object y(java.util.Map<java.lang.Float, ? extends T> r10, java.util.Map<java.lang.Float, ? extends T> r11, fp0.c<? super bp0.k> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof androidx.compose.material.SwipeableState$processNewAnchors$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.material.SwipeableState$processNewAnchors$1 r0 = (androidx.compose.material.SwipeableState$processNewAnchors$1) r0
            int r1 = r0.f5536f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f5536f = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.SwipeableState$processNewAnchors$1 r0 = new androidx.compose.material.SwipeableState$processNewAnchors$1
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f5534d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.f5536f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x005c
            if (r2 == r5) goto L_0x0058
            if (r2 == r4) goto L_0x0045
            if (r2 != r3) goto L_0x003d
            float r10 = r0.f5533c
            java.lang.Object r11 = r0.f5532b
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r0 = r0.f5531a
            androidx.compose.material.SwipeableState r0 = (androidx.compose.material.SwipeableState) r0
            bp0.g.b(r12)     // Catch:{ all -> 0x003a }
            goto L_0x0218
        L_0x003a:
            r12 = move-exception
            goto L_0x0248
        L_0x003d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0045:
            float r10 = r0.f5533c
            java.lang.Object r11 = r0.f5532b
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r2 = r0.f5531a
            androidx.compose.material.SwipeableState r2 = (androidx.compose.material.SwipeableState) r2
            bp0.g.b(r12)     // Catch:{ CancellationException -> 0x0208 }
            goto L_0x01d3
        L_0x0054:
            r12 = move-exception
            r0 = r2
            goto L_0x0248
        L_0x0058:
            bp0.g.b(r12)
            goto L_0x00a0
        L_0x005c:
            bp0.g.b(r12)
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto L_0x00af
            java.util.Set r10 = r11.keySet()
            java.lang.Float r10 = kotlin.collections.s.l0(r10)
            kotlin.jvm.internal.p.g(r10)
            float r10 = r10.floatValue()
            r9.D(r10)
            java.util.Set r10 = r11.keySet()
            java.lang.Float r10 = kotlin.collections.s.j0(r10)
            kotlin.jvm.internal.p.g(r10)
            float r10 = r10.floatValue()
            r9.C(r10)
            java.lang.Object r10 = r9.o()
            java.lang.Float r10 = androidx.compose.material.SwipeableKt.e(r11, r10)
            if (r10 == 0) goto L_0x00a3
            float r10 = r10.floatValue()
            r0.f5536f = r5
            java.lang.Object r10 = r9.H(r10, r0)
            if (r10 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            bp0.k r10 = bp0.k.f22762a
            return r10
        L_0x00a3:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "The initial value must have an associated anchor."
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00af:
            boolean r12 = kotlin.jvm.internal.p.e(r11, r10)
            if (r12 != 0) goto L_0x0278
            r12 = -8388608(0xffffffffff800000, float:-Infinity)
            r9.D(r12)
            r12 = 2139095040(0x7f800000, float:Infinity)
            r9.C(r12)
            e0.h0<java.lang.Float> r12 = r9.f5501h
            java.lang.Object r12 = r12.getValue()
            java.lang.Float r12 = (java.lang.Float) r12
            r2 = 0
            if (r12 == 0) goto L_0x0131
            java.lang.Object r10 = r10.get(r12)
            java.lang.Float r10 = androidx.compose.material.SwipeableKt.e(r11, r10)
            if (r10 != 0) goto L_0x012b
            java.util.Set r10 = r11.keySet()
            java.util.Iterator r5 = r10.iterator()
            boolean r10 = r5.hasNext()
            if (r10 != 0) goto L_0x00e3
            goto L_0x0120
        L_0x00e3:
            java.lang.Object r2 = r5.next()
            boolean r10 = r5.hasNext()
            if (r10 != 0) goto L_0x00ee
            goto L_0x0120
        L_0x00ee:
            r10 = r2
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            float r6 = r12.floatValue()
            float r10 = r10 - r6
            float r10 = java.lang.Math.abs(r10)
        L_0x00fe:
            java.lang.Object r6 = r5.next()
            r7 = r6
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r8 = r12.floatValue()
            float r7 = r7 - r8
            float r7 = java.lang.Math.abs(r7)
            int r8 = java.lang.Float.compare(r10, r7)
            if (r8 <= 0) goto L_0x011a
            r2 = r6
            r10 = r7
        L_0x011a:
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L_0x00fe
        L_0x0120:
            kotlin.jvm.internal.p.g(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            float r10 = r2.floatValue()
            goto L_0x01bf
        L_0x012b:
            float r10 = r10.floatValue()
            goto L_0x01bf
        L_0x0131:
            e0.d1 r12 = r9.s()
            java.lang.Object r12 = r12.getValue()
            java.lang.Object r10 = r10.get(r12)
            java.lang.Object r12 = r9.o()
            boolean r12 = kotlin.jvm.internal.p.e(r10, r12)
            if (r12 == 0) goto L_0x014b
            java.lang.Object r10 = r9.o()
        L_0x014b:
            java.lang.Float r10 = androidx.compose.material.SwipeableKt.e(r11, r10)
            if (r10 != 0) goto L_0x01bb
            java.util.Set r10 = r11.keySet()
            java.util.Iterator r12 = r10.iterator()
            boolean r10 = r12.hasNext()
            if (r10 != 0) goto L_0x0160
            goto L_0x01b1
        L_0x0160:
            java.lang.Object r2 = r12.next()
            boolean r10 = r12.hasNext()
            if (r10 != 0) goto L_0x016b
            goto L_0x01b1
        L_0x016b:
            r10 = r2
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            e0.d1 r5 = r9.s()
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r10 = r10 - r5
            float r10 = java.lang.Math.abs(r10)
        L_0x0185:
            java.lang.Object r5 = r12.next()
            r6 = r5
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            e0.d1 r7 = r9.s()
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r6 = r6 - r7
            float r6 = java.lang.Math.abs(r6)
            int r7 = java.lang.Float.compare(r10, r6)
            if (r7 <= 0) goto L_0x01ab
            r2 = r5
            r10 = r6
        L_0x01ab:
            boolean r5 = r12.hasNext()
            if (r5 != 0) goto L_0x0185
        L_0x01b1:
            kotlin.jvm.internal.p.g(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            float r10 = r2.floatValue()
            goto L_0x01bf
        L_0x01bb:
            float r10 = r10.floatValue()
        L_0x01bf:
            v1$g r12 = r9.m()     // Catch:{ CancellationException -> 0x0207, all -> 0x0204 }
            r0.f5531a = r9     // Catch:{ CancellationException -> 0x0207, all -> 0x0204 }
            r0.f5532b = r11     // Catch:{ CancellationException -> 0x0207, all -> 0x0204 }
            r0.f5533c = r10     // Catch:{ CancellationException -> 0x0207, all -> 0x0204 }
            r0.f5536f = r4     // Catch:{ CancellationException -> 0x0207, all -> 0x0204 }
            java.lang.Object r12 = r9.h(r10, r12, r0)     // Catch:{ CancellationException -> 0x0207, all -> 0x0204 }
            if (r12 != r1) goto L_0x01d2
            return r1
        L_0x01d2:
            r2 = r9
        L_0x01d3:
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.a.c(r10)
            java.lang.Object r10 = kotlin.collections.x.g(r11, r10)
            r2.B(r10)
            java.util.Set r10 = r11.keySet()
            java.lang.Float r10 = kotlin.collections.s.l0(r10)
            kotlin.jvm.internal.p.g(r10)
            float r10 = r10.floatValue()
            r2.D(r10)
            java.util.Set r10 = r11.keySet()
            java.lang.Float r10 = kotlin.collections.s.j0(r10)
            kotlin.jvm.internal.p.g(r10)
            float r10 = r10.floatValue()
            r2.C(r10)
            goto L_0x0278
        L_0x0204:
            r12 = move-exception
            r0 = r9
            goto L_0x0248
        L_0x0207:
            r2 = r9
        L_0x0208:
            r0.f5531a = r2     // Catch:{ all -> 0x0054 }
            r0.f5532b = r11     // Catch:{ all -> 0x0054 }
            r0.f5533c = r10     // Catch:{ all -> 0x0054 }
            r0.f5536f = r3     // Catch:{ all -> 0x0054 }
            java.lang.Object r12 = r2.H(r10, r0)     // Catch:{ all -> 0x0054 }
            if (r12 != r1) goto L_0x0217
            return r1
        L_0x0217:
            r0 = r2
        L_0x0218:
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.a.c(r10)
            java.lang.Object r10 = kotlin.collections.x.g(r11, r10)
            r0.B(r10)
            java.util.Set r10 = r11.keySet()
            java.lang.Float r10 = kotlin.collections.s.l0(r10)
            kotlin.jvm.internal.p.g(r10)
            float r10 = r10.floatValue()
            r0.D(r10)
            java.util.Set r10 = r11.keySet()
            java.lang.Float r10 = kotlin.collections.s.j0(r10)
            kotlin.jvm.internal.p.g(r10)
            float r10 = r10.floatValue()
            r0.C(r10)
            goto L_0x0278
        L_0x0248:
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.a.c(r10)
            java.lang.Object r10 = kotlin.collections.x.g(r11, r10)
            r0.B(r10)
            java.util.Set r10 = r11.keySet()
            java.lang.Float r10 = kotlin.collections.s.l0(r10)
            kotlin.jvm.internal.p.g(r10)
            float r10 = r10.floatValue()
            r0.D(r10)
            java.util.Set r10 = r11.keySet()
            java.lang.Float r10 = kotlin.collections.s.j0(r10)
            kotlin.jvm.internal.p.g(r10)
            float r10 = r10.floatValue()
            r0.C(r10)
            throw r12
        L_0x0278:
            bp0.k r10 = bp0.k.f22762a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState.y(java.util.Map, java.util.Map, fp0.c):java.lang.Object");
    }

    public final void z(Map<Float, ? extends T> map) {
        p.j(map, "<set-?>");
        this.f5502i.setValue(map);
    }
}
