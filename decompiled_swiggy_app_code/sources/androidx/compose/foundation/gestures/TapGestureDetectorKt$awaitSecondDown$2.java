package androidx.compose.foundation.gestures;

import bp0.k;
import f1.v;
import fp0.c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;

@d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {191}, m = "invokeSuspend")
/* compiled from: TapGestureDetector.kt */
final class TapGestureDetectorKt$awaitSecondDown$2 extends RestrictedSuspendLambda implements p<f1.d, c<? super v>, Object> {

    /* renamed from: b  reason: collision with root package name */
    long f3552b;

    /* renamed from: c  reason: collision with root package name */
    int f3553c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ Object f3554d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ v f3555e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TapGestureDetectorKt$awaitSecondDown$2(v vVar, c<? super TapGestureDetectorKt$awaitSecondDown$2> cVar) {
        super(2, cVar);
        this.f3555e = vVar;
    }

    /* renamed from: a */
    public final Object invoke(f1.d dVar, c<? super v> cVar) {
        return ((TapGestureDetectorKt$awaitSecondDown$2) create(dVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$2 = new TapGestureDetectorKt$awaitSecondDown$2(this.f3555e, cVar);
        tapGestureDetectorKt$awaitSecondDown$2.f3554d = obj;
        return tapGestureDetectorKt$awaitSecondDown$2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r10.f3553c
            r2 = 1
            if (r1 == 0) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            long r3 = r10.f3552b
            java.lang.Object r1 = r10.f3554d
            f1.d r1 = (f1.d) r1
            bp0.g.b(r11)
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            goto L_0x004e
        L_0x0019:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0021:
            bp0.g.b(r11)
            java.lang.Object r11 = r10.f3554d
            f1.d r11 = (f1.d) r11
            f1.v r1 = r10.f3555e
            long r3 = r1.l()
            androidx.compose.ui.platform.n1 r1 = r11.getViewConfiguration()
            long r5 = r1.a()
            long r3 = r3 + r5
            r1 = r11
            r11 = r10
        L_0x0039:
            r5 = 0
            r6 = 0
            r11.f3554d = r1
            r11.f3552b = r3
            r11.f3553c = r2
            java.lang.Object r5 = androidx.compose.foundation.gestures.TapGestureDetectorKt.e(r1, r5, r11, r2, r6)
            if (r5 != r0) goto L_0x0048
            return r0
        L_0x0048:
            r9 = r0
            r0 = r11
            r11 = r5
            r4 = r3
            r3 = r1
            r1 = r9
        L_0x004e:
            f1.v r11 = (f1.v) r11
            long r6 = r11.l()
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 < 0) goto L_0x0059
            return r11
        L_0x0059:
            r11 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
