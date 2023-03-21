package c0;

import androidx.compose.material.DrawerState;
import androidx.compose.material.SnackbarHostState;
import kotlin.jvm.internal.p;

/* compiled from: Scaffold.kt */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final DrawerState f12744a;

    /* renamed from: b  reason: collision with root package name */
    private final SnackbarHostState f12745b;

    public t(DrawerState drawerState, SnackbarHostState snackbarHostState) {
        p.j(drawerState, "drawerState");
        p.j(snackbarHostState, "snackbarHostState");
        this.f12744a = drawerState;
        this.f12745b = snackbarHostState;
    }

    public final DrawerState a() {
        return this.f12744a;
    }

    public final SnackbarHostState b() {
        return this.f12745b;
    }
}
