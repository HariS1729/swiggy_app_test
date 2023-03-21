package androidx.compose.material;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineStart;
import lp0.a;
import lp0.l;
import n1.o;
import n1.q;
import wp0.j0;
import wp0.k1;

/* compiled from: Drawer.kt */
final class DrawerKt$ModalDrawer$1$2$6 extends Lambda implements l<q, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f5000a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DrawerState f5001b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j0 f5002c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawerKt$ModalDrawer$1$2$6(String str, DrawerState drawerState, j0 j0Var) {
        super(1);
        this.f5000a = str;
        this.f5001b = drawerState;
        this.f5002c = j0Var;
    }

    public final void a(q qVar) {
        p.j(qVar, "$this$semantics");
        o.I(qVar, this.f5000a);
        if (this.f5001b.f()) {
            final DrawerState drawerState = this.f5001b;
            final j0 j0Var = this.f5002c;
            o.h(qVar, (String) null, new a<Boolean>() {

                @d(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1", f = "Drawer.kt", l = {450}, m = "invokeSuspend")
                /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1  reason: invalid class name */
                /* compiled from: Drawer.kt */
                static final class AnonymousClass1 extends SuspendLambda implements lp0.p<j0, c<? super k>, Object> {

                    /* renamed from: a  reason: collision with root package name */
                    int f5005a;

                    public final c<k> create(Object obj, c<?> cVar) {
                        return new AnonymousClass1(drawerState, cVar);
                    }

                    public final Object invoke(j0 j0Var, c<? super k> cVar) {
                        return ((AnonymousClass1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object d11 = b.d();
                        int i11 = this.f5005a;
                        if (i11 == 0) {
                            g.b(obj);
                            DrawerState drawerState = drawerState;
                            this.f5005a = 1;
                            if (drawerState.b(this) == d11) {
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

                /* renamed from: a */
                public final Boolean invoke() {
                    if (drawerState.e().n().invoke(DrawerValue.Closed).booleanValue()) {
                        j0 j0Var = j0Var;
                        final DrawerState drawerState = drawerState;
                        k1 unused = j.d(j0Var, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((c<? super AnonymousClass1>) null), 3, (Object) null);
                    }
                    return Boolean.TRUE;
                }
            }, 1, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((q) obj);
        return k.f22762a;
    }
}
