package androidx.compose.material;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import bp0.g;
import bp0.k;
import f1.d0;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import lp0.a;
import lp0.l;
import lp0.p;
import lp0.q;
import t0.f;

@d(c = "androidx.compose.material.DrawerKt$Scrim$dismissDrawer$1$1", f = "Drawer.kt", l = {664}, m = "invokeSuspend")
/* compiled from: Drawer.kt */
final class DrawerKt$Scrim$dismissDrawer$1$1 extends SuspendLambda implements p<d0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f5026a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f5027b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a<k> f5028c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawerKt$Scrim$dismissDrawer$1$1(a<k> aVar, c<? super DrawerKt$Scrim$dismissDrawer$1$1> cVar) {
        super(2, cVar);
        this.f5028c = aVar;
    }

    /* renamed from: a */
    public final Object invoke(d0 d0Var, c<? super k> cVar) {
        return ((DrawerKt$Scrim$dismissDrawer$1$1) create(d0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        DrawerKt$Scrim$dismissDrawer$1$1 drawerKt$Scrim$dismissDrawer$1$1 = new DrawerKt$Scrim$dismissDrawer$1$1(this.f5028c, cVar);
        drawerKt$Scrim$dismissDrawer$1$1.f5027b = obj;
        return drawerKt$Scrim$dismissDrawer$1$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f5026a;
        if (i11 == 0) {
            g.b(obj);
            final a<k> aVar = this.f5028c;
            AnonymousClass1 r72 = new l<f, k>() {
                public final void a(long j) {
                    aVar.invoke();
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((f) obj).u());
                    return k.f22762a;
                }
            };
            this.f5026a = 1;
            if (TapGestureDetectorKt.k((d0) this.f5027b, (l) null, (l) null, (q) null, r72, this, 7, (Object) null) == d11) {
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
