package androidx.compose.material;

import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: Drawer.kt */
final class DrawerKt$ModalDrawer$1$2$3$1 extends Lambda implements a<Float> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ float f4996a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f4997b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DrawerState f4998c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawerKt$ModalDrawer$1$2$3$1(float f11, float f12, DrawerState drawerState) {
        super(0);
        this.f4996a = f11;
        this.f4997b = f12;
        this.f4998c = drawerState;
    }

    /* renamed from: a */
    public final Float invoke() {
        return Float.valueOf(DrawerKt.h(this.f4996a, this.f4997b, this.f4998c.d().getValue().floatValue()));
    }
}
