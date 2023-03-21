package androidx.compose.material;

import d2.e;
import d2.m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Drawer.kt */
final class DrawerKt$ModalDrawer$1$2$5$1 extends Lambda implements l<e, d2.l> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DrawerState f4999a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawerKt$ModalDrawer$1$2$5$1(DrawerState drawerState) {
        super(1);
        this.f4999a = drawerState;
    }

    public final long a(e eVar) {
        p.j(eVar, "$this$offset");
        return m.a(c.c(this.f4999a.d().getValue().floatValue()), 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return d2.l.b(a((e) obj));
    }
}
