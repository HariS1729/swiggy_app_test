package coil.request;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;

@d(c = "coil.request.ViewTargetRequestManager$dispose$1", f = "ViewTargetRequestManager.kt", l = {}, m = "invokeSuspend")
/* compiled from: ViewTargetRequestManager.kt */
final class ViewTargetRequestManager$dispose$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f13675a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ViewTargetRequestManager f13676b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ViewTargetRequestManager$dispose$1(ViewTargetRequestManager viewTargetRequestManager, c<? super ViewTargetRequestManager$dispose$1> cVar) {
        super(2, cVar);
        this.f13676b = viewTargetRequestManager;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new ViewTargetRequestManager$dispose$1(this.f13676b, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((ViewTargetRequestManager$dispose$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = b.d();
        if (this.f13675a == 0) {
            g.b(obj);
            this.f13676b.c((ViewTargetRequestDelegate) null);
            return k.f22762a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
