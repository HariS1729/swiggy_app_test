package androidx.compose.ui.input.pointer;

import androidx.compose.ui.platform.n1;
import bp0.k;
import d2.e;
import d2.p;
import f1.b0;
import f1.c0;
import f1.d;
import f1.d0;
import f1.n;
import f1.v;
import fp0.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.i;
import t0.l;
import t0.m;
import wp0.g1;
import wp0.j0;
import wp0.o;

/* compiled from: SuspendingPointerInputFilter.kt */
public final class SuspendingPointerInputFilter extends b0 implements c0, d0, e {

    /* renamed from: c  reason: collision with root package name */
    private final n1 f6659c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ e f6660d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public n f6661e = SuspendingPointerInputFilterKt.f6684a;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final f0.e<PointerEventHandlerCoroutine<?>> f6662f = new f0.e<>(new PointerEventHandlerCoroutine[16], 0);

    /* renamed from: g  reason: collision with root package name */
    private final f0.e<PointerEventHandlerCoroutine<?>> f6663g = new f0.e<>(new PointerEventHandlerCoroutine[16], 0);

    /* renamed from: h  reason: collision with root package name */
    private n f6664h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public long f6665i = p.f14019b.a();
    private j0 j = g1.f29466a;
    private boolean k;

    /* compiled from: SuspendingPointerInputFilter.kt */
    private final class PointerEventHandlerCoroutine<R> implements d, e, c<R> {

        /* renamed from: a  reason: collision with root package name */
        private final c<R> f6666a;

        /* renamed from: b  reason: collision with root package name */
        private final /* synthetic */ SuspendingPointerInputFilter f6667b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public wp0.n<? super n> f6668c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public PointerEventPass f6669d = PointerEventPass.Main;

        /* renamed from: e  reason: collision with root package name */
        private final CoroutineContext f6670e = EmptyCoroutineContext.f25631a;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ SuspendingPointerInputFilter f6671f;

        public PointerEventHandlerCoroutine(SuspendingPointerInputFilter suspendingPointerInputFilter, c<? super R> cVar) {
            kotlin.jvm.internal.p.j(cVar, "completion");
            this.f6671f = suspendingPointerInputFilter;
            this.f6666a = cVar;
            this.f6667b = suspendingPointerInputFilter;
        }

        public final void B(Throwable th2) {
            wp0.n<? super n> nVar = this.f6668c;
            if (nVar != null) {
                nVar.r(th2);
            }
            this.f6668c = null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> java.lang.Object C(long r12, lp0.p<? super f1.d, ? super fp0.c<? super T>, ? extends java.lang.Object> r14, fp0.c<? super T> r15) {
            /*
                r11 = this;
                boolean r0 = r15 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1
                if (r0 == 0) goto L_0x0013
                r0 = r15
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1) r0
                int r1 = r0.f6675d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f6675d = r1
                goto L_0x0018
            L_0x0013:
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1
                r0.<init>(r11, r15)
            L_0x0018:
                java.lang.Object r15 = r0.f6673b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
                int r2 = r0.f6675d
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0038
                if (r2 != r3) goto L_0x0030
                java.lang.Object r12 = r0.f6672a
                wp0.k1 r12 = (wp0.k1) r12
                bp0.g.b(r15)     // Catch:{ all -> 0x002e }
                goto L_0x0075
            L_0x002e:
                r13 = move-exception
                goto L_0x0079
            L_0x0030:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L_0x0038:
                bp0.g.b(r15)
                r5 = 0
                int r15 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r15 > 0) goto L_0x0057
                wp0.n<? super f1.n> r15 = r11.f6668c
                if (r15 == 0) goto L_0x0057
                kotlin.Result$a r2 = kotlin.Result.f25582b
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r12)
                java.lang.Object r2 = bp0.g.a(r2)
                java.lang.Object r2 = kotlin.Result.b(r2)
                r15.resumeWith(r2)
            L_0x0057:
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter r15 = r11.f6671f
                wp0.j0 r5 = r15.M0()
                r6 = 0
                r7 = 0
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1 r8 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1
                r8.<init>(r12, r11, r4)
                r9 = 3
                r10 = 0
                wp0.k1 r12 = wp0.j.d(r5, r6, r7, r8, r9, r10)
                r0.f6672a = r12     // Catch:{ all -> 0x002e }
                r0.f6675d = r3     // Catch:{ all -> 0x002e }
                java.lang.Object r15 = r14.invoke(r11, r0)     // Catch:{ all -> 0x002e }
                if (r15 != r1) goto L_0x0075
                return r1
            L_0x0075:
                wp0.k1.a.a(r12, r4, r3, r4)
                return r15
            L_0x0079:
                wp0.k1.a.a(r12, r4, r3, r4)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter.PointerEventHandlerCoroutine.C(long, lp0.p, fp0.c):java.lang.Object");
        }

        public final void L(n nVar, PointerEventPass pointerEventPass) {
            wp0.n<? super n> nVar2;
            kotlin.jvm.internal.p.j(nVar, "event");
            kotlin.jvm.internal.p.j(pointerEventPass, "pass");
            if (pointerEventPass == this.f6669d && (nVar2 = this.f6668c) != null) {
                this.f6668c = null;
                Result.a aVar = Result.f25582b;
                nVar2.resumeWith(Result.b(nVar));
            }
        }

        public float M(float f11) {
            return this.f6667b.M(f11);
        }

        public long S(long j) {
            return this.f6667b.S(j);
        }

        public long a() {
            return this.f6671f.f6665i;
        }

        public long d0() {
            return this.f6671f.d0();
        }

        public CoroutineContext getContext() {
            return this.f6670e;
        }

        public float getDensity() {
            return this.f6667b.getDensity();
        }

        public n1 getViewConfiguration() {
            return this.f6671f.getViewConfiguration();
        }

        public int j0(float f11) {
            return this.f6667b.j0(f11);
        }

        public float k(int i11) {
            return this.f6667b.k(i11);
        }

        public float m0(long j) {
            return this.f6667b.m0(j);
        }

        public long o(long j) {
            return this.f6667b.o(j);
        }

        public n p0() {
            return this.f6671f.f6661e;
        }

        public long q(int i11) {
            return this.f6667b.q(i11);
        }

        public Object r0(PointerEventPass pointerEventPass, c<? super n> cVar) {
            o oVar = new o(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            oVar.w();
            this.f6669d = pointerEventPass;
            this.f6668c = oVar;
            Object t = oVar.t();
            if (t == b.d()) {
                f.c(cVar);
            }
            return t;
        }

        public void resumeWith(Object obj) {
            f0.e K0 = this.f6671f.f6662f;
            SuspendingPointerInputFilter suspendingPointerInputFilter = this.f6671f;
            synchronized (K0) {
                suspendingPointerInputFilter.f6662f.r(this);
                k kVar = k.f22762a;
            }
            this.f6666a.resumeWith(obj);
        }

        public float u0() {
            return this.f6667b.u0();
        }

        public float v0(float f11) {
            return this.f6667b.v0(f11);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> java.lang.Object w0(long r5, lp0.p<? super f1.d, ? super fp0.c<? super T>, ? extends java.lang.Object> r7, fp0.c<? super T> r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                if (r0 == 0) goto L_0x0013
                r0 = r8
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1) r0
                int r1 = r0.f6681c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f6681c = r1
                goto L_0x0018
            L_0x0013:
                androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                r0.<init>(r4, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f6679a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
                int r2 = r0.f6681c
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                bp0.g.b(r8)     // Catch:{ PointerEventTimeoutCancellationException -> 0x003d }
                goto L_0x003e
            L_0x0029:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0031:
                bp0.g.b(r8)
                r0.f6681c = r3     // Catch:{ PointerEventTimeoutCancellationException -> 0x003d }
                java.lang.Object r8 = r4.C(r5, r7, r0)     // Catch:{ PointerEventTimeoutCancellationException -> 0x003d }
                if (r8 != r1) goto L_0x003e
                return r1
            L_0x003d:
                r8 = 0
            L_0x003e:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter.PointerEventHandlerCoroutine.w0(long, lp0.p, fp0.c):java.lang.Object");
        }

        public int y0(long j) {
            return this.f6667b.y0(j);
        }
    }

    /* compiled from: SuspendingPointerInputFilter.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6682a;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            iArr[PointerEventPass.Initial.ordinal()] = 1;
            iArr[PointerEventPass.Final.ordinal()] = 2;
            iArr[PointerEventPass.Main.ordinal()] = 3;
            f6682a = iArr;
        }
    }

    public SuspendingPointerInputFilter(n1 n1Var, e eVar) {
        kotlin.jvm.internal.p.j(n1Var, "viewConfiguration");
        kotlin.jvm.internal.p.j(eVar, "density");
        this.f6659c = n1Var;
        this.f6660d = eVar;
    }

    private final void L0(n nVar, PointerEventPass pointerEventPass) {
        synchronized (this.f6662f) {
            f0.e<PointerEventHandlerCoroutine<?>> eVar = this.f6663g;
            eVar.c(eVar.m(), this.f6662f);
        }
        try {
            int i11 = a.f6682a[pointerEventPass.ordinal()];
            if (i11 == 1 || i11 == 2) {
                f0.e<PointerEventHandlerCoroutine<?>> eVar2 = this.f6663g;
                int m11 = eVar2.m();
                if (m11 > 0) {
                    int i12 = 0;
                    Object[] l11 = eVar2.l();
                    do {
                        ((PointerEventHandlerCoroutine) l11[i12]).L(nVar, pointerEventPass);
                        i12++;
                    } while (i12 < m11);
                }
            } else if (i11 == 3) {
                f0.e<PointerEventHandlerCoroutine<?>> eVar3 = this.f6663g;
                int m12 = eVar3.m();
                if (m12 > 0) {
                    int i13 = m12 - 1;
                    Object[] l12 = eVar3.l();
                    do {
                        ((PointerEventHandlerCoroutine) l12[i13]).L(nVar, pointerEventPass);
                        i13--;
                    } while (i13 >= 0);
                }
            }
        } finally {
            this.f6663g.g();
        }
    }

    public void E0() {
        boolean z11;
        n nVar = this.f6664h;
        if (nVar != null) {
            List<v> c11 = nVar.c();
            int size = c11.size();
            int i11 = 0;
            while (true) {
                z11 = true;
                if (i11 >= size) {
                    break;
                } else if (!(true ^ c11.get(i11).g())) {
                    z11 = false;
                    break;
                } else {
                    i11++;
                }
            }
            if (!z11) {
                List<v> c12 = nVar.c();
                ArrayList arrayList = new ArrayList(c12.size());
                int size2 = c12.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    v vVar = c12.get(i12);
                    long e11 = vVar.e();
                    long f11 = vVar.f();
                    arrayList.add(new v(e11, vVar.l(), f11, false, vVar.l(), vVar.f(), vVar.g(), vVar.g(), 0, 0, 768, (i) null));
                }
                n nVar2 = new n(arrayList);
                this.f6661e = nVar2;
                L0(nVar2, PointerEventPass.Initial);
                L0(nVar2, PointerEventPass.Main);
                L0(nVar2, PointerEventPass.Final);
                this.f6664h = null;
            }
        }
    }

    public void F0(n nVar, PointerEventPass pointerEventPass, long j11) {
        kotlin.jvm.internal.p.j(nVar, "pointerEvent");
        kotlin.jvm.internal.p.j(pointerEventPass, "pass");
        this.f6665i = j11;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.f6661e = nVar;
        }
        L0(nVar, pointerEventPass);
        List<v> c11 = nVar.c();
        int size = c11.size();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                z11 = true;
                break;
            } else if (!f1.o.d(c11.get(i11))) {
                break;
            } else {
                i11++;
            }
        }
        if (!(!z11)) {
            nVar = null;
        }
        this.f6664h = nVar;
    }

    public float M(float f11) {
        return this.f6660d.M(f11);
    }

    public final j0 M0() {
        return this.j;
    }

    public /* synthetic */ p0.d N(p0.d dVar) {
        return p0.c.a(this, dVar);
    }

    public final void N0(j0 j0Var) {
        kotlin.jvm.internal.p.j(j0Var, "<set-?>");
        this.j = j0Var;
    }

    public boolean P() {
        return this.k;
    }

    public long S(long j11) {
        return this.f6660d.S(j11);
    }

    public /* synthetic */ Object W(Object obj, lp0.p pVar) {
        return p0.e.c(this, obj, pVar);
    }

    public long d0() {
        long S = S(getViewConfiguration().e());
        long a11 = a();
        return m.a(Math.max(0.0f, l.i(S) - ((float) p.g(a11))) / 2.0f, Math.max(0.0f, l.g(S) - ((float) p.f(a11))) / 2.0f);
    }

    public float getDensity() {
        return this.f6660d.getDensity();
    }

    public n1 getViewConfiguration() {
        return this.f6659c;
    }

    public int j0(float f11) {
        return this.f6660d.j0(f11);
    }

    public float k(int i11) {
        return this.f6660d.k(i11);
    }

    public float m0(long j11) {
        return this.f6660d.m0(j11);
    }

    public long o(long j11) {
        return this.f6660d.o(j11);
    }

    public long q(int i11) {
        return this.f6660d.q(i11);
    }

    public b0 q0() {
        return this;
    }

    public /* synthetic */ Object s(Object obj, lp0.p pVar) {
        return p0.e.b(this, obj, pVar);
    }

    public <R> Object s0(lp0.p<? super d, ? super c<? super R>, ? extends Object> pVar, c<? super R> cVar) {
        o oVar = new o(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        oVar.w();
        PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(this, oVar);
        synchronized (this.f6662f) {
            this.f6662f.b(pointerEventHandlerCoroutine);
            c<k> a11 = fp0.e.a(pVar, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine);
            Result.a aVar = Result.f25582b;
            a11.resumeWith(Result.b(k.f22762a));
        }
        oVar.N(new SuspendingPointerInputFilter$awaitPointerEventScope$2$2(pointerEventHandlerCoroutine));
        Object t = oVar.t();
        if (t == b.d()) {
            f.c(cVar);
        }
        return t;
    }

    public float u0() {
        return this.f6660d.u0();
    }

    public float v0(float f11) {
        return this.f6660d.v0(f11);
    }

    public /* synthetic */ boolean x(lp0.l lVar) {
        return p0.e.a(this, lVar);
    }

    public int y0(long j11) {
        return this.f6660d.y0(j11);
    }
}
