package androidx.compose.foundation.text.selection;

import bp0.g;
import bp0.k;
import f1.d0;
import fp0.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2", f = "TextSelectionMouseDetector.kt", l = {87}, m = "invokeSuspend")
/* compiled from: TextSelectionMouseDetector.kt */
final class TextSelectionMouseDetectorKt$mouseSelectionDetector$2 extends SuspendLambda implements p<d0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f4785a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f4786b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b0.c f4787c;

    @d(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1", f = "TextSelectionMouseDetector.kt", l = {90, 97, 112}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1  reason: invalid class name */
    /* compiled from: TextSelectionMouseDetector.kt */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<f1.d, c<? super k>, Object> {

        /* renamed from: b  reason: collision with root package name */
        Object f4788b;

        /* renamed from: c  reason: collision with root package name */
        int f4789c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f4790d;

        /* renamed from: a */
        public final Object invoke(f1.d dVar, c<? super k> cVar) {
            return ((AnonymousClass1) create(dVar, cVar)).invokeSuspend(k.f22762a);
        }

        public final c<k> create(Object obj, c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(cVar, cVar);
            r02.f4790d = obj;
            return r02;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0051 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0093  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
                int r1 = r12.f4789c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0034
                if (r1 == r4) goto L_0x0027
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                goto L_0x001a
            L_0x0012:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x001a:
                java.lang.Object r1 = r12.f4788b
                androidx.compose.foundation.text.selection.a r1 = (androidx.compose.foundation.text.selection.a) r1
                java.lang.Object r5 = r12.f4790d
                f1.d r5 = (f1.d) r5
                bp0.g.b(r13)
                r13 = r5
                goto L_0x0044
            L_0x0027:
                java.lang.Object r1 = r12.f4788b
                androidx.compose.foundation.text.selection.a r1 = (androidx.compose.foundation.text.selection.a) r1
                java.lang.Object r5 = r12.f4790d
                f1.d r5 = (f1.d) r5
                bp0.g.b(r13)
                r6 = r12
                goto L_0x0056
            L_0x0034:
                bp0.g.b(r13)
                java.lang.Object r13 = r12.f4790d
                f1.d r13 = (f1.d) r13
                androidx.compose.foundation.text.selection.a r1 = new androidx.compose.foundation.text.selection.a
                androidx.compose.ui.platform.n1 r5 = r13.getViewConfiguration()
                r1.<init>(r5)
            L_0x0044:
                r5 = r12
            L_0x0045:
                r5.f4790d = r13
                r5.f4788b = r1
                r5.f4789c = r4
                java.lang.Object r6 = androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.b(r13, r5)
                if (r6 != r0) goto L_0x0052
                return r0
            L_0x0052:
                r11 = r5
                r5 = r13
                r13 = r6
                r6 = r11
            L_0x0056:
                f1.n r13 = (f1.n) r13
                r1.d(r13)
                java.util.List r7 = r13.c()
                r8 = 0
                java.lang.Object r7 = r7.get(r8)
                f1.v r7 = (f1.v) r7
                boolean r13 = androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.a(r13)
                if (r13 == 0) goto L_0x0093
                b0.c r13 = r3
                long r8 = r7.f()
                boolean r13 = r13.d(r8)
                if (r13 == 0) goto L_0x00d6
                r7.a()
                long r7 = r7.e()
                androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1$1 r13 = new androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1$1
                b0.c r9 = r3
                r13.<init>(r9)
                r6.f4790d = r5
                r6.f4788b = r1
                r6.f4789c = r3
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.j(r5, r7, r13, r6)
                if (r13 != r0) goto L_0x00d6
                return r0
            L_0x0093:
                int r13 = r1.a()
                if (r13 == r4) goto L_0x00a9
                if (r13 == r3) goto L_0x00a2
                androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r13 = androidx.compose.foundation.text.selection.SelectionAdjustment.f4703a
                androidx.compose.foundation.text.selection.SelectionAdjustment r13 = r13.f()
                goto L_0x00af
            L_0x00a2:
                androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r13 = androidx.compose.foundation.text.selection.SelectionAdjustment.f4703a
                androidx.compose.foundation.text.selection.SelectionAdjustment r13 = r13.g()
                goto L_0x00af
            L_0x00a9:
                androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r13 = androidx.compose.foundation.text.selection.SelectionAdjustment.f4703a
                androidx.compose.foundation.text.selection.SelectionAdjustment r13 = r13.e()
            L_0x00af:
                b0.c r8 = r3
                long r9 = r7.f()
                boolean r8 = r8.c(r9, r13)
                if (r8 == 0) goto L_0x00d6
                r7.a()
                long r7 = r7.e()
                androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1$2 r9 = new androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1$2
                b0.c r10 = r3
                r9.<init>(r10, r13)
                r6.f4790d = r5
                r6.f4788b = r1
                r6.f4789c = r2
                java.lang.Object r13 = androidx.compose.foundation.gestures.DragGestureDetectorKt.j(r5, r7, r9, r6)
                if (r13 != r0) goto L_0x00d6
                return r0
            L_0x00d6:
                r13 = r5
                r5 = r6
                goto L_0x0045
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextSelectionMouseDetectorKt$mouseSelectionDetector$2(b0.c cVar, c<? super TextSelectionMouseDetectorKt$mouseSelectionDetector$2> cVar2) {
        super(2, cVar2);
        this.f4787c = cVar;
    }

    /* renamed from: a */
    public final Object invoke(d0 d0Var, c<? super k> cVar) {
        return ((TextSelectionMouseDetectorKt$mouseSelectionDetector$2) create(d0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        TextSelectionMouseDetectorKt$mouseSelectionDetector$2 textSelectionMouseDetectorKt$mouseSelectionDetector$2 = new TextSelectionMouseDetectorKt$mouseSelectionDetector$2(this.f4787c, cVar);
        textSelectionMouseDetectorKt$mouseSelectionDetector$2.f4786b = obj;
        return textSelectionMouseDetectorKt$mouseSelectionDetector$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f4785a;
        if (i11 == 0) {
            g.b(obj);
            final b0.c cVar = this.f4787c;
            AnonymousClass1 r12 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            this.f4785a = 1;
            if (((d0) this.f4786b).s0(r12, this) == d11) {
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
