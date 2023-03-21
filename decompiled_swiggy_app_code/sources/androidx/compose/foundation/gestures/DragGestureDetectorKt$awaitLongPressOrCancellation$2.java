package androidx.compose.foundation.gestures;

import bp0.g;
import bp0.k;
import f1.d0;
import f1.v;
import fp0.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Ref$ObjectRef;
import lp0.p;
import wp0.j0;

@d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {755}, m = "invokeSuspend")
/* compiled from: DragGestureDetector.kt */
final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f3255a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d0 f3256b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Ref$ObjectRef<v> f3257c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Ref$ObjectRef<v> f3258d;

    @d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2$1", f = "DragGestureDetector.kt", l = {758, 775}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2$1  reason: invalid class name */
    /* compiled from: DragGestureDetector.kt */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<f1.d, c<? super k>, Object> {

        /* renamed from: b  reason: collision with root package name */
        Object f3259b;

        /* renamed from: c  reason: collision with root package name */
        int f3260c;

        /* renamed from: d  reason: collision with root package name */
        int f3261d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f3262e;

        /* renamed from: a */
        public final Object invoke(f1.d dVar, c<? super k> cVar) {
            return ((AnonymousClass1) create(dVar, cVar)).invokeSuspend(k.f22762a);
        }

        public final c<k> create(Object obj, c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(ref$ObjectRef, ref$ObjectRef2, cVar);
            r02.f3262e = obj;
            return r02;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00b1  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00c3  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00d2  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00e6  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00f7  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x012c  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x0079 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x00ae A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x00e3 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
                int r2 = r0.f3261d
                r3 = 2
                r4 = 0
                r6 = 1
                if (r2 == 0) goto L_0x0039
                if (r2 == r6) goto L_0x002b
                if (r2 != r3) goto L_0x0023
                int r2 = r0.f3260c
                java.lang.Object r7 = r0.f3259b
                f1.n r7 = (f1.n) r7
                java.lang.Object r8 = r0.f3262e
                f1.d r8 = (f1.d) r8
                bp0.g.b(r18)
                r4 = r18
                r5 = r0
                goto L_0x00c5
            L_0x0023:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x002b:
                int r2 = r0.f3260c
                java.lang.Object r7 = r0.f3262e
                f1.d r7 = (f1.d) r7
                bp0.g.b(r18)
                r9 = r18
                r8 = r7
                r7 = r0
                goto L_0x005b
            L_0x0039:
                bp0.g.b(r18)
                java.lang.Object r2 = r0.f3262e
                f1.d r2 = (f1.d) r2
                r8 = r0
                r7 = r2
                r2 = 0
            L_0x0043:
                if (r2 != 0) goto L_0x015e
                androidx.compose.ui.input.pointer.PointerEventPass r9 = androidx.compose.ui.input.pointer.PointerEventPass.Main
                r8.f3262e = r7
                r8.f3259b = r4
                r8.f3260c = r2
                r8.f3261d = r6
                java.lang.Object r9 = r7.r0(r9, r8)
                if (r9 != r1) goto L_0x0056
                return r1
            L_0x0056:
                r16 = r8
                r8 = r7
                r7 = r16
            L_0x005b:
                f1.n r9 = (f1.n) r9
                java.util.List r10 = r9.c()
                int r11 = r10.size()
                r12 = 0
            L_0x0066:
                if (r12 >= r11) goto L_0x0079
                java.lang.Object r13 = r10.get(r12)
                f1.v r13 = (f1.v) r13
                boolean r13 = f1.o.d(r13)
                if (r13 != 0) goto L_0x0076
                r10 = 0
                goto L_0x007a
            L_0x0076:
                int r12 = r12 + 1
                goto L_0x0066
            L_0x0079:
                r10 = 1
            L_0x007a:
                if (r10 == 0) goto L_0x007d
                r2 = 1
            L_0x007d:
                java.util.List r10 = r9.c()
                int r11 = r10.size()
                r12 = 0
            L_0x0086:
                if (r12 >= r11) goto L_0x00ae
                java.lang.Object r13 = r10.get(r12)
                f1.v r13 = (f1.v) r13
                boolean r14 = r13.m()
                if (r14 != 0) goto L_0x00a5
                long r14 = r8.a()
                long r4 = r8.d0()
                boolean r4 = f1.o.f(r13, r14, r4)
                if (r4 == 0) goto L_0x00a3
                goto L_0x00a5
            L_0x00a3:
                r4 = 0
                goto L_0x00a6
            L_0x00a5:
                r4 = 1
            L_0x00a6:
                if (r4 == 0) goto L_0x00aa
                r4 = 1
                goto L_0x00af
            L_0x00aa:
                int r12 = r12 + 1
                r4 = 0
                goto L_0x0086
            L_0x00ae:
                r4 = 0
            L_0x00af:
                if (r4 == 0) goto L_0x00b2
                r2 = 1
            L_0x00b2:
                androidx.compose.ui.input.pointer.PointerEventPass r4 = androidx.compose.ui.input.pointer.PointerEventPass.Final
                r7.f3262e = r8
                r7.f3259b = r9
                r7.f3260c = r2
                r7.f3261d = r3
                java.lang.Object r4 = r8.r0(r4, r7)
                if (r4 != r1) goto L_0x00c3
                return r1
            L_0x00c3:
                r5 = r7
                r7 = r9
            L_0x00c5:
                f1.n r4 = (f1.n) r4
                java.util.List r4 = r4.c()
                int r9 = r4.size()
                r10 = 0
            L_0x00d0:
                if (r10 >= r9) goto L_0x00e3
                java.lang.Object r11 = r4.get(r10)
                f1.v r11 = (f1.v) r11
                boolean r11 = r11.m()
                if (r11 == 0) goto L_0x00e0
                r4 = 1
                goto L_0x00e4
            L_0x00e0:
                int r10 = r10 + 1
                goto L_0x00d0
            L_0x00e3:
                r4 = 0
            L_0x00e4:
                if (r4 == 0) goto L_0x00e7
                r2 = 1
            L_0x00e7:
                kotlin.jvm.internal.Ref$ObjectRef<f1.v> r4 = r3
                T r4 = r4.f25666a
                f1.v r4 = (f1.v) r4
                long r9 = r4.e()
                boolean r4 = androidx.compose.foundation.gestures.DragGestureDetectorKt.l(r7, r9)
                if (r4 != 0) goto L_0x012c
                kotlin.jvm.internal.Ref$ObjectRef<f1.v> r4 = r4
                java.util.List r7 = r7.c()
                kotlin.jvm.internal.Ref$ObjectRef<f1.v> r9 = r3
                int r10 = r7.size()
                r11 = 0
            L_0x0104:
                if (r11 >= r10) goto L_0x0128
                java.lang.Object r12 = r7.get(r11)
                r13 = r12
                f1.v r13 = (f1.v) r13
                long r13 = r13.e()
                T r15 = r9.f25666a
                f1.v r15 = (f1.v) r15
                r18 = r7
                long r6 = r15.e()
                boolean r6 = f1.u.d(r13, r6)
                if (r6 == 0) goto L_0x0122
                goto L_0x0129
            L_0x0122:
                int r11 = r11 + 1
                r7 = r18
                r6 = 1
                goto L_0x0104
            L_0x0128:
                r12 = 0
            L_0x0129:
                r4.f25666a = r12
                goto L_0x0155
            L_0x012c:
                java.util.List r4 = r7.c()
                int r6 = r4.size()
                r7 = 0
            L_0x0135:
                if (r7 >= r6) goto L_0x0148
                java.lang.Object r9 = r4.get(r7)
                r10 = r9
                f1.v r10 = (f1.v) r10
                boolean r10 = r10.g()
                if (r10 == 0) goto L_0x0145
                goto L_0x0149
            L_0x0145:
                int r7 = r7 + 1
                goto L_0x0135
            L_0x0148:
                r9 = 0
            L_0x0149:
                f1.v r9 = (f1.v) r9
                if (r9 == 0) goto L_0x015b
                kotlin.jvm.internal.Ref$ObjectRef<f1.v> r4 = r3
                r4.f25666a = r9
                kotlin.jvm.internal.Ref$ObjectRef<f1.v> r4 = r4
                r4.f25666a = r9
            L_0x0155:
                r7 = r8
            L_0x0156:
                r4 = 0
                r6 = 1
                r8 = r5
                goto L_0x0043
            L_0x015b:
                r7 = r8
                r2 = 1
                goto L_0x0156
            L_0x015e:
                bp0.k r1 = bp0.k.f22762a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DragGestureDetectorKt$awaitLongPressOrCancellation$2(d0 d0Var, Ref$ObjectRef<v> ref$ObjectRef, Ref$ObjectRef<v> ref$ObjectRef2, c<? super DragGestureDetectorKt$awaitLongPressOrCancellation$2> cVar) {
        super(2, cVar);
        this.f3256b = d0Var;
        this.f3257c = ref$ObjectRef;
        this.f3258d = ref$ObjectRef2;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.f3256b, this.f3257c, this.f3258d, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f3255a;
        if (i11 == 0) {
            g.b(obj);
            d0 d0Var = this.f3256b;
            final Ref$ObjectRef<v> ref$ObjectRef = this.f3257c;
            final Ref$ObjectRef<v> ref$ObjectRef2 = this.f3258d;
            AnonymousClass1 r12 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            this.f3255a = 1;
            if (d0Var.s0(r12, this) == d11) {
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
