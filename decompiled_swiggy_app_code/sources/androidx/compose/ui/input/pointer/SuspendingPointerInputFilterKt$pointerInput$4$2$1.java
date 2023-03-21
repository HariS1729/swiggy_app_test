package androidx.compose.ui.input.pointer;

import bp0.g;
import bp0.k;
import f1.d0;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$4$2$1", f = "SuspendingPointerInputFilter.kt", l = {291}, m = "invokeSuspend")
/* compiled from: SuspendingPointerInputFilter.kt */
final class SuspendingPointerInputFilterKt$pointerInput$4$2$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f6701a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f6702b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SuspendingPointerInputFilter f6703c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p<d0, c<? super k>, Object> f6704d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SuspendingPointerInputFilterKt$pointerInput$4$2$1(SuspendingPointerInputFilter suspendingPointerInputFilter, p<? super d0, ? super c<? super k>, ? extends Object> pVar, c<? super SuspendingPointerInputFilterKt$pointerInput$4$2$1> cVar) {
        super(2, cVar);
        this.f6703c = suspendingPointerInputFilter;
        this.f6704d = pVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        SuspendingPointerInputFilterKt$pointerInput$4$2$1 suspendingPointerInputFilterKt$pointerInput$4$2$1 = new SuspendingPointerInputFilterKt$pointerInput$4$2$1(this.f6703c, this.f6704d, cVar);
        suspendingPointerInputFilterKt$pointerInput$4$2$1.f6702b = obj;
        return suspendingPointerInputFilterKt$pointerInput$4$2$1;
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((SuspendingPointerInputFilterKt$pointerInput$4$2$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f6701a;
        if (i11 == 0) {
            g.b(obj);
            this.f6703c.N0((j0) this.f6702b);
            p<d0, c<? super k>, Object> pVar = this.f6704d;
            SuspendingPointerInputFilter suspendingPointerInputFilter = this.f6703c;
            this.f6701a = 1;
            if (pVar.invoke(suspendingPointerInputFilter, this) == d11) {
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
