package androidx.compose.foundation.gestures;

import bp0.g;
import bp0.k;
import f1.d0;
import f1.v;
import fp0.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.a;
import lp0.l;
import lp0.p;
import t0.f;

@d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", f = "DragGestureDetector.kt", l = {224}, m = "invokeSuspend")
/* compiled from: DragGestureDetector.kt */
final class DragGestureDetectorKt$detectDragGestures$5 extends SuspendLambda implements p<d0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f3281a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f3282b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l<f, k> f3283c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p<v, f, k> f3284d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ a<k> f3285e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ a<k> f3286f;

    @d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$1", f = "DragGestureDetector.kt", l = {225, 229, 241}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$1  reason: invalid class name */
    /* compiled from: DragGestureDetector.kt */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<f1.d, c<? super k>, Object> {

        /* renamed from: b  reason: collision with root package name */
        Object f3287b;

        /* renamed from: c  reason: collision with root package name */
        Object f3288c;

        /* renamed from: d  reason: collision with root package name */
        int f3289d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f3290e;

        /* renamed from: a */
        public final Object invoke(f1.d dVar, c<? super k> cVar) {
            return ((AnonymousClass1) create(dVar, cVar)).invokeSuspend(k.f22762a);
        }

        public final c<k> create(Object obj, c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(lVar, pVar, aVar, aVar2, cVar);
            r02.f3290e = obj;
            return r02;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v17, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: f1.d} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x008c  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x008e  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00cb  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00d1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
                int r1 = r13.f3289d
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0038
                if (r1 == r4) goto L_0x0030
                if (r1 == r3) goto L_0x001f
                if (r1 != r2) goto L_0x0017
                bp0.g.b(r14)
                r11 = r13
                goto L_0x00c3
            L_0x0017:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x001f:
                java.lang.Object r1 = r13.f3288c
                kotlin.jvm.internal.Ref$LongRef r1 = (kotlin.jvm.internal.Ref$LongRef) r1
                java.lang.Object r4 = r13.f3287b
                f1.v r4 = (f1.v) r4
                java.lang.Object r5 = r13.f3290e
                f1.d r5 = (f1.d) r5
                bp0.g.b(r14)
                r11 = r13
                goto L_0x0081
            L_0x0030:
                java.lang.Object r1 = r13.f3290e
                f1.d r1 = (f1.d) r1
                bp0.g.b(r14)
                goto L_0x004c
            L_0x0038:
                bp0.g.b(r14)
                java.lang.Object r14 = r13.f3290e
                r1 = r14
                f1.d r1 = (f1.d) r1
                r14 = 0
                r13.f3290e = r1
                r13.f3289d = r4
                java.lang.Object r14 = androidx.compose.foundation.gestures.TapGestureDetectorKt.d(r1, r14, r13)
                if (r14 != r0) goto L_0x004c
                return r0
            L_0x004c:
                f1.v r14 = (f1.v) r14
                kotlin.jvm.internal.Ref$LongRef r4 = new kotlin.jvm.internal.Ref$LongRef
                r4.<init>()
                t0.f$a r5 = t0.f.f16662b
                long r5 = r5.c()
                r4.f25665a = r5
                r11 = r13
                r12 = r4
                r4 = r14
                r14 = r1
                r1 = r12
            L_0x0060:
                long r6 = r4.e()
                int r8 = r4.k()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$1$1 r9 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$1$1
                r9.<init>(r1)
                r11.f3290e = r14
                r11.f3287b = r4
                r11.f3288c = r1
                r11.f3289d = r3
                r5 = r14
                r10 = r11
                java.lang.Object r5 = androidx.compose.foundation.gestures.DragGestureDetectorKt.f(r5, r6, r8, r9, r10)
                if (r5 != r0) goto L_0x007e
                return r0
            L_0x007e:
                r12 = r5
                r5 = r14
                r14 = r12
            L_0x0081:
                f1.v r14 = (f1.v) r14
                if (r14 == 0) goto L_0x008e
                boolean r6 = r14.m()
                if (r6 == 0) goto L_0x008c
                goto L_0x008e
            L_0x008c:
                r14 = r5
                goto L_0x0060
            L_0x008e:
                if (r14 == 0) goto L_0x00d6
                lp0.l<t0.f, bp0.k> r3 = r4
                long r6 = r14.f()
                t0.f r4 = t0.f.d(r6)
                r3.invoke(r4)
                lp0.p<f1.v, t0.f, bp0.k> r3 = r5
                long r6 = r1.f25665a
                t0.f r1 = t0.f.d(r6)
                r3.invoke(r14, r1)
                long r3 = r14.e()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$1$2 r14 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$1$2
                lp0.p<f1.v, t0.f, bp0.k> r1 = r5
                r14.<init>(r1)
                r1 = 0
                r11.f3290e = r1
                r11.f3287b = r1
                r11.f3288c = r1
                r11.f3289d = r2
                java.lang.Object r14 = androidx.compose.foundation.gestures.DragGestureDetectorKt.j(r5, r3, r14, r11)
                if (r14 != r0) goto L_0x00c3
                return r0
            L_0x00c3:
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r14 = r14.booleanValue()
                if (r14 != 0) goto L_0x00d1
                lp0.a<bp0.k> r14 = r6
                r14.invoke()
                goto L_0x00d6
            L_0x00d1:
                lp0.a<bp0.k> r14 = r7
                r14.invoke()
            L_0x00d6:
                bp0.k r14 = bp0.k.f22762a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DragGestureDetectorKt$detectDragGestures$5(l<? super f, k> lVar, p<? super v, ? super f, k> pVar, a<k> aVar, a<k> aVar2, c<? super DragGestureDetectorKt$detectDragGestures$5> cVar) {
        super(2, cVar);
        this.f3283c = lVar;
        this.f3284d = pVar;
        this.f3285e = aVar;
        this.f3286f = aVar2;
    }

    /* renamed from: a */
    public final Object invoke(d0 d0Var, c<? super k> cVar) {
        return ((DragGestureDetectorKt$detectDragGestures$5) create(d0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        DragGestureDetectorKt$detectDragGestures$5 dragGestureDetectorKt$detectDragGestures$5 = new DragGestureDetectorKt$detectDragGestures$5(this.f3283c, this.f3284d, this.f3285e, this.f3286f, cVar);
        dragGestureDetectorKt$detectDragGestures$5.f3282b = obj;
        return dragGestureDetectorKt$detectDragGestures$5;
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f3281a;
        if (i11 == 0) {
            g.b(obj);
            final l<f, k> lVar = this.f3283c;
            final p<v, f, k> pVar = this.f3284d;
            final a<k> aVar = this.f3285e;
            final a<k> aVar2 = this.f3286f;
            AnonymousClass1 r32 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            this.f3281a = 1;
            if (((d0) this.f3282b).s0(r32, this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return k.f22762a;
    }
}
