package androidx.compose.material;

import kotlin.jvm.internal.Lambda;
import lp0.a;
import lp0.l;

/* compiled from: Drawer.kt */
final class DrawerKt$rememberDrawerState$2 extends Lambda implements a<DrawerState> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DrawerValue f5034a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l<DrawerValue, Boolean> f5035b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawerKt$rememberDrawerState$2(DrawerValue drawerValue, l<? super DrawerValue, Boolean> lVar) {
        super(0);
        this.f5034a = drawerValue;
        this.f5035b = lVar;
    }

    /* renamed from: a */
    public final DrawerState invoke() {
        return new DrawerState(this.f5034a, this.f5035b);
    }
}
