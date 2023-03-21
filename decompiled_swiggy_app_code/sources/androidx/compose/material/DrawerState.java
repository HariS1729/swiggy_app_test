package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverKt;
import bp0.k;
import defpackage.v1;
import e0.d1;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import m0.c;

/* compiled from: Drawer.kt */
public final class DrawerState {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f5036b = new Companion((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final SwipeableState<DrawerValue> f5037a;

    /* compiled from: Drawer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final c<DrawerState, DrawerValue> a(l<? super DrawerValue, Boolean> lVar) {
            p.j(lVar, "confirmStateChange");
            return SaverKt.a(DrawerState$Companion$Saver$1.f5038a, new DrawerState$Companion$Saver$2(lVar));
        }
    }

    public DrawerState(DrawerValue drawerValue, l<? super DrawerValue, Boolean> lVar) {
        p.j(drawerValue, "initialValue");
        p.j(lVar, "confirmStateChange");
        this.f5037a = new SwipeableState<>(drawerValue, DrawerKt.f4980c, lVar);
    }

    public final Object a(DrawerValue drawerValue, v1.g<Float> gVar, fp0.c<? super k> cVar) {
        Object i11 = e().i(drawerValue, gVar, cVar);
        return i11 == b.d() ? i11 : k.f22762a;
    }

    public final Object b(fp0.c<? super k> cVar) {
        Object a11 = a(DrawerValue.Closed, DrawerKt.f4980c, cVar);
        return a11 == b.d() ? a11 : k.f22762a;
    }

    public final DrawerValue c() {
        return this.f5037a.o();
    }

    public final d1<Float> d() {
        return this.f5037a.s();
    }

    public final SwipeableState<DrawerValue> e() {
        return this.f5037a;
    }

    public final boolean f() {
        return c() == DrawerValue.Open;
    }
}
