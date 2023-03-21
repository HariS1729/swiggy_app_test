package androidx.compose.material;

import kotlin.jvm.internal.Lambda;
import lp0.p;
import m0.d;

/* compiled from: Drawer.kt */
final class DrawerState$Companion$Saver$1 extends Lambda implements p<d, DrawerState, DrawerValue> {

    /* renamed from: a  reason: collision with root package name */
    public static final DrawerState$Companion$Saver$1 f5038a = new DrawerState$Companion$Saver$1();

    DrawerState$Companion$Saver$1() {
        super(2);
    }

    /* renamed from: a */
    public final DrawerValue invoke(d dVar, DrawerState drawerState) {
        kotlin.jvm.internal.p.j(dVar, "$this$Saver");
        kotlin.jvm.internal.p.j(drawerState, "it");
        return drawerState.c();
    }
}
