package androidx.compose.material;

import bp0.g;
import bp0.k;
import fp0.c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import lp0.a;
import lp0.p;
import wp0.j0;
import wp0.k1;

/* compiled from: Drawer.kt */
final class DrawerKt$ModalDrawer$1$2$2 extends Lambda implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f4991a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DrawerState f4992b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j0 f4993c;

    @d(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1", f = "Drawer.kt", l = {421}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1  reason: invalid class name */
    /* compiled from: Drawer.kt */
    static final class AnonymousClass1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f4994a;

        public final c<k> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(drawerState, cVar);
        }

        public final Object invoke(j0 j0Var, c<? super k> cVar) {
            return ((AnonymousClass1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d11 = b.d();
            int i11 = this.f4994a;
            if (i11 == 0) {
                g.b(obj);
                DrawerState drawerState = drawerState;
                this.f4994a = 1;
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawerKt$ModalDrawer$1$2$2(boolean z11, DrawerState drawerState, j0 j0Var) {
        super(0);
        this.f4991a = z11;
        this.f4992b = drawerState;
        this.f4993c = j0Var;
    }

    public final void invoke() {
        if (this.f4991a && this.f4992b.e().n().invoke(DrawerValue.Closed).booleanValue()) {
            j0 j0Var = this.f4993c;
            final DrawerState drawerState = this.f4992b;
            k1 unused = j.d(j0Var, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((c<? super AnonymousClass1>) null), 3, (Object) null);
        }
    }
}
