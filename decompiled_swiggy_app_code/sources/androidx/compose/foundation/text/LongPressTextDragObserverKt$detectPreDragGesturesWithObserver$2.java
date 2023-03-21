package androidx.compose.foundation.text;

import a0.o;
import bp0.g;
import bp0.k;
import f1.d0;
import fp0.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {98}, m = "invokeSuspend")
/* compiled from: LongPressTextDragObserver.kt */
final class LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 extends SuspendLambda implements p<d0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f4485a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f4486b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ o f4487c;

    @d(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", l = {99, 103}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2$1  reason: invalid class name */
    /* compiled from: LongPressTextDragObserver.kt */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<f1.d, c<? super k>, Object> {

        /* renamed from: b  reason: collision with root package name */
        Object f4488b;

        /* renamed from: c  reason: collision with root package name */
        int f4489c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f4490d;

        /* renamed from: a */
        public final Object invoke(f1.d dVar, c<? super k> cVar) {
            return ((AnonymousClass1) create(dVar, cVar)).invokeSuspend(k.f22762a);
        }

        public final c<k> create(Object obj, c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(oVar, cVar);
            r02.f4490d = obj;
            return r02;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0060 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0094 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r16
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
                int r2 = r0.f4489c
                r3 = 2
                r4 = 0
                r5 = 0
                r6 = 1
                if (r2 == 0) goto L_0x0033
                if (r2 == r6) goto L_0x0029
                if (r2 != r3) goto L_0x0021
                java.lang.Object r2 = r0.f4488b
                f1.v r2 = (f1.v) r2
                java.lang.Object r7 = r0.f4490d
                f1.d r7 = (f1.d) r7
                bp0.g.b(r17)
                r9 = r17
                r8 = r0
                goto L_0x0061
            L_0x0021:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0029:
                java.lang.Object r2 = r0.f4490d
                f1.d r2 = (f1.d) r2
                bp0.g.b(r17)
                r7 = r17
                goto L_0x0045
            L_0x0033:
                bp0.g.b(r17)
                java.lang.Object r2 = r0.f4490d
                f1.d r2 = (f1.d) r2
                r0.f4490d = r2
                r0.f4489c = r6
                java.lang.Object r7 = androidx.compose.foundation.gestures.TapGestureDetectorKt.e(r2, r5, r0, r6, r4)
                if (r7 != r1) goto L_0x0045
                return r1
            L_0x0045:
                f1.v r7 = (f1.v) r7
                a0.o r8 = r3
                long r9 = r7.f()
                r8.f(r9)
                r8 = r0
                r15 = r7
                r7 = r2
                r2 = r15
            L_0x0054:
                r8.f4490d = r7
                r8.f4488b = r2
                r8.f4489c = r3
                java.lang.Object r9 = f1.c.a(r7, r4, r8, r6, r4)
                if (r9 != r1) goto L_0x0061
                return r1
            L_0x0061:
                f1.n r9 = (f1.n) r9
                java.util.List r9 = r9.c()
                int r10 = r9.size()
                r11 = 0
            L_0x006c:
                if (r11 >= r10) goto L_0x0094
                java.lang.Object r12 = r9.get(r11)
                f1.v r12 = (f1.v) r12
                long r13 = r12.e()
                long r3 = r2.e()
                boolean r3 = f1.u.d(r13, r3)
                if (r3 == 0) goto L_0x008a
                boolean r3 = r12.g()
                if (r3 == 0) goto L_0x008a
                r3 = 1
                goto L_0x008b
            L_0x008a:
                r3 = 0
            L_0x008b:
                if (r3 == 0) goto L_0x008f
                r3 = 1
                goto L_0x0095
            L_0x008f:
                int r11 = r11 + 1
                r3 = 2
                r4 = 0
                goto L_0x006c
            L_0x0094:
                r3 = 0
            L_0x0095:
                if (r3 != 0) goto L_0x009f
                a0.o r1 = r3
                r1.i()
                bp0.k r1 = bp0.k.f22762a
                return r1
            L_0x009f:
                r3 = 2
                r4 = 0
                goto L_0x0054
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(o oVar, c<? super LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2> cVar) {
        super(2, cVar);
        this.f4487c = oVar;
    }

    /* renamed from: a */
    public final Object invoke(d0 d0Var, c<? super k> cVar) {
        return ((LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2) create(d0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(this.f4487c, cVar);
        longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.f4486b = obj;
        return longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f4485a;
        if (i11 == 0) {
            g.b(obj);
            final o oVar = this.f4487c;
            AnonymousClass1 r12 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            this.f4485a = 1;
            if (((d0) this.f4486b).s0(r12, this) == d11) {
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
