package androidx.compose.foundation.gestures;

import bp0.g;
import bp0.k;
import defpackage.y1;
import e0.d1;
import f1.d0;
import fp0.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1", f = "Scrollable.kt", l = {271}, m = "invokeSuspend")
/* compiled from: Scrollable.kt */
final class ScrollableKt$mouseWheelScroll$1 extends SuspendLambda implements p<d0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f3484a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f3485b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ y1.o f3486c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ d1<ScrollingLogic> f3487d;

    @d(c = "androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1", f = "Scrollable.kt", l = {273}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1$1  reason: invalid class name */
    /* compiled from: Scrollable.kt */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<f1.d, c<? super k>, Object> {

        /* renamed from: b  reason: collision with root package name */
        int f3488b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f3489c;

        /* renamed from: a */
        public final Object invoke(f1.d dVar, c<? super k> cVar) {
            return ((AnonymousClass1) create(dVar, cVar)).invokeSuspend(k.f22762a);
        }

        public final c<k> create(Object obj, c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(oVar, d1Var, cVar);
            r02.f3489c = obj;
            return r02;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0057 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
                int r1 = r10.f3488b
                r2 = 1
                if (r1 == 0) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                java.lang.Object r1 = r10.f3489c
                f1.d r1 = (f1.d) r1
                bp0.g.b(r11)
                r3 = r1
                r1 = r0
                r0 = r10
                goto L_0x0037
            L_0x0016:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x001e:
                bp0.g.b(r11)
                java.lang.Object r11 = r10.f3489c
                f1.d r11 = (f1.d) r11
                r1 = r11
                r11 = r10
            L_0x0027:
                r11.f3489c = r1
                r11.f3488b = r2
                java.lang.Object r3 = androidx.compose.foundation.gestures.ScrollableKt.d(r1, r11)
                if (r3 != r0) goto L_0x0032
                return r0
            L_0x0032:
                r9 = r0
                r0 = r11
                r11 = r3
                r3 = r1
                r1 = r9
            L_0x0037:
                f1.n r11 = (f1.n) r11
                java.util.List r4 = r11.c()
                int r5 = r4.size()
                r6 = 0
                r7 = 0
            L_0x0043:
                if (r7 >= r5) goto L_0x0057
                java.lang.Object r8 = r4.get(r7)
                f1.v r8 = (f1.v) r8
                boolean r8 = r8.m()
                r8 = r8 ^ r2
                if (r8 != 0) goto L_0x0054
                r4 = 0
                goto L_0x0058
            L_0x0054:
                int r7 = r7 + 1
                goto L_0x0043
            L_0x0057:
                r4 = 1
            L_0x0058:
                if (r4 == 0) goto L_0x009c
                y1$o r4 = r3
                e0.d1<androidx.compose.foundation.gestures.ScrollingLogic> r5 = r4
                long r7 = r3.a()
                long r7 = r4.a(r3, r11, r7)
                java.lang.Object r4 = r5.getValue()
                androidx.compose.foundation.gestures.ScrollingLogic r4 = (androidx.compose.foundation.gestures.ScrollingLogic) r4
                float r5 = r4.k(r7)
                float r5 = r4.g(r5)
                y1$r r4 = r4.d()
                float r4 = r4.b(r5)
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 != 0) goto L_0x0083
                r4 = 1
                goto L_0x0084
            L_0x0083:
                r4 = 0
            L_0x0084:
                if (r4 != 0) goto L_0x009c
                java.util.List r11 = r11.c()
                int r4 = r11.size()
            L_0x008e:
                if (r6 >= r4) goto L_0x009c
                java.lang.Object r5 = r11.get(r6)
                f1.v r5 = (f1.v) r5
                r5.a()
                int r6 = r6 + 1
                goto L_0x008e
            L_0x009c:
                r11 = r0
                r0 = r1
                r1 = r3
                goto L_0x0027
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt$mouseWheelScroll$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollableKt$mouseWheelScroll$1(y1.o oVar, d1<ScrollingLogic> d1Var, c<? super ScrollableKt$mouseWheelScroll$1> cVar) {
        super(2, cVar);
        this.f3486c = oVar;
        this.f3487d = d1Var;
    }

    /* renamed from: a */
    public final Object invoke(d0 d0Var, c<? super k> cVar) {
        return ((ScrollableKt$mouseWheelScroll$1) create(d0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        ScrollableKt$mouseWheelScroll$1 scrollableKt$mouseWheelScroll$1 = new ScrollableKt$mouseWheelScroll$1(this.f3486c, this.f3487d, cVar);
        scrollableKt$mouseWheelScroll$1.f3485b = obj;
        return scrollableKt$mouseWheelScroll$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f3484a;
        if (i11 == 0) {
            g.b(obj);
            final y1.o oVar = this.f3486c;
            final d1<ScrollingLogic> d1Var = this.f3487d;
            AnonymousClass1 r12 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            this.f3484a = 1;
            if (((d0) this.f3485b).s0(r12, this) == d11) {
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
