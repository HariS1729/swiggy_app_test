package androidx.compose.material;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.a;
import lp0.l;
import n1.o;
import n1.q;

/* compiled from: Drawer.kt */
final class DrawerKt$Scrim$dismissDrawer$2$1 extends Lambda implements l<q, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f5030a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a<k> f5031b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawerKt$Scrim$dismissDrawer$2$1(String str, a<k> aVar) {
        super(1);
        this.f5030a = str;
        this.f5031b = aVar;
    }

    public final void a(q qVar) {
        p.j(qVar, "$this$semantics");
        o.C(qVar, this.f5030a);
        final a<k> aVar = this.f5031b;
        o.o(qVar, (String) null, new a<Boolean>() {
            /* renamed from: a */
            public final Boolean invoke() {
                aVar.invoke();
                return Boolean.TRUE;
            }
        }, 1, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((q) obj);
        return k.f22762a;
    }
}
