package androidx.compose.material;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: Drawer.kt */
final class DrawerState$Companion$Saver$2 extends Lambda implements l<DrawerValue, DrawerState> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l<DrawerValue, Boolean> f5039a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawerState$Companion$Saver$2(l<? super DrawerValue, Boolean> lVar) {
        super(1);
        this.f5039a = lVar;
    }

    /* renamed from: a */
    public final DrawerState invoke(DrawerValue drawerValue) {
        p.j(drawerValue, "it");
        return new DrawerState(drawerValue, this.f5039a);
    }
}
