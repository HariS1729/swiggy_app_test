package androidx.compose.material;

import androidx.compose.ui.platform.h;
import bp0.g;
import bp0.k;
import c0.v;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.p;
import wp0.j0;
import wp0.q0;

@d(c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1", f = "SnackbarHost.kt", l = {164}, m = "invokeSuspend")
/* compiled from: SnackbarHost.kt */
final class SnackbarHostKt$SnackbarHost$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f5319a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ v f5320b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h f5321c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarHostKt$SnackbarHost$1(v vVar, h hVar, c<? super SnackbarHostKt$SnackbarHost$1> cVar) {
        super(2, cVar);
        this.f5320b = vVar;
        this.f5321c = hVar;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new SnackbarHostKt$SnackbarHost$1(this.f5320b, this.f5321c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((SnackbarHostKt$SnackbarHost$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f5319a;
        if (i11 == 0) {
            g.b(obj);
            v vVar = this.f5320b;
            if (vVar != null) {
                long h11 = SnackbarHostKt.h(vVar.getDuration(), this.f5320b.b() != null, this.f5321c);
                this.f5319a = 1;
                if (q0.a(h11, this) == d11) {
                    return d11;
                }
            }
            return k.f22762a;
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f5320b.dismiss();
        return k.f22762a;
    }
}
