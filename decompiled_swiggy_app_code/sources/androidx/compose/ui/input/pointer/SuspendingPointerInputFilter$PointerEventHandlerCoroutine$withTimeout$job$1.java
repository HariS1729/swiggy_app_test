package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.SuspendingPointerInputFilter;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {617, 618}, m = "invokeSuspend")
/* compiled from: SuspendingPointerInputFilter.kt */
final class SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f6676a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f6677b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> f6678c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1(long j, SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine, c<? super SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1> cVar) {
        super(2, cVar);
        this.f6677b = j;
        this.f6678c = pointerEventHandlerCoroutine;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1(this.f6677b, this.f6678c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.d()
            int r1 = r8.f6676a
            r2 = 1
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r5) goto L_0x001c
            if (r1 != r4) goto L_0x0014
            bp0.g.b(r9)
            goto L_0x0038
        L_0x0014:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x001c:
            bp0.g.b(r9)
            goto L_0x002f
        L_0x0020:
            bp0.g.b(r9)
            long r6 = r8.f6677b
            long r6 = r6 - r2
            r8.f6676a = r5
            java.lang.Object r9 = wp0.q0.a(r6, r8)
            if (r9 != r0) goto L_0x002f
            return r0
        L_0x002f:
            r8.f6676a = r4
            java.lang.Object r9 = wp0.q0.a(r2, r8)
            if (r9 != r0) goto L_0x0038
            return r0
        L_0x0038:
            androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine<R> r9 = r8.f6678c
            wp0.n r9 = r9.f6668c
            if (r9 == 0) goto L_0x0054
            kotlin.Result$a r0 = kotlin.Result.f25582b
            androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r0 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
            long r1 = r8.f6677b
            r0.<init>(r1)
            java.lang.Object r0 = bp0.g.a(r0)
            java.lang.Object r0 = kotlin.Result.b(r0)
            r9.resumeWith(r0)
        L_0x0054:
            bp0.k r9 = bp0.k.f22762a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
