package e0;

import kotlin.jvm.internal.p;

/* compiled from: SlotTable.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private int f14165a;

    public c(int i11) {
        this.f14165a = i11;
    }

    public final int a() {
        return this.f14165a;
    }

    public final boolean b() {
        return this.f14165a != Integer.MIN_VALUE;
    }

    public final void c(int i11) {
        this.f14165a = i11;
    }

    public final int d(v0 v0Var) {
        p.j(v0Var, "slots");
        return v0Var.a(this);
    }

    public final int e(x0 x0Var) {
        p.j(x0Var, "writer");
        return x0Var.B(this);
    }
}
