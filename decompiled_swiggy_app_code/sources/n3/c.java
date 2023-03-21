package n3;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.Recreator;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: SavedStateRegistryController.kt */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f15833d = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final d f15834a;

    /* renamed from: b  reason: collision with root package name */
    private final b f15835b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15836c;

    /* compiled from: SavedStateRegistryController.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final c a(d dVar) {
            p.j(dVar, "owner");
            return new c(dVar, (i) null);
        }
    }

    private c(d dVar) {
        this.f15834a = dVar;
        this.f15835b = new b();
    }

    public /* synthetic */ c(d dVar, i iVar) {
        this(dVar);
    }

    public static final c a(d dVar) {
        return f15833d.a(dVar);
    }

    public final b b() {
        return this.f15835b;
    }

    public final void c() {
        Lifecycle lifecycle = this.f15834a.getLifecycle();
        p.i(lifecycle, "owner.lifecycle");
        if (lifecycle.b() == Lifecycle.State.INITIALIZED) {
            lifecycle.a(new Recreator(this.f15834a));
            this.f15835b.e(lifecycle);
            this.f15836c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void d(Bundle bundle) {
        if (!this.f15836c) {
            c();
        }
        Lifecycle lifecycle = this.f15834a.getLifecycle();
        p.i(lifecycle, "owner.lifecycle");
        if (!lifecycle.b().isAtLeast(Lifecycle.State.STARTED)) {
            this.f15835b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    public final void e(Bundle bundle) {
        p.j(bundle, "outBundle");
        this.f15835b.g(bundle);
    }
}
