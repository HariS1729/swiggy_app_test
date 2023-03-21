package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: FragmentLifecycleCallbacksDispatcher */
class k {

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f10488a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final FragmentManager f10489b;

    /* compiled from: FragmentLifecycleCallbacksDispatcher */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        final FragmentManager.FragmentLifecycleCallbacks f10490a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f10491b;

        a(FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z11) {
            this.f10490a = fragmentLifecycleCallbacks;
            this.f10491b = z11;
        }
    }

    k(FragmentManager fragmentManager) {
        this.f10489b = fragmentManager;
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment, Bundle bundle, boolean z11) {
        Fragment A0 = this.f10489b.A0();
        if (A0 != null) {
            A0.getParentFragmentManager().z0().a(fragment, bundle, true);
        }
        Iterator<a> it2 = this.f10488a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f10491b) {
                next.f10490a.a(this.f10489b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Fragment fragment, boolean z11) {
        Context f11 = this.f10489b.x0().f();
        Fragment A0 = this.f10489b.A0();
        if (A0 != null) {
            A0.getParentFragmentManager().z0().b(fragment, true);
        }
        Iterator<a> it2 = this.f10488a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f10491b) {
                next.f10490a.b(this.f10489b, fragment, f11);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(Fragment fragment, Bundle bundle, boolean z11) {
        Fragment A0 = this.f10489b.A0();
        if (A0 != null) {
            A0.getParentFragmentManager().z0().c(fragment, bundle, true);
        }
        Iterator<a> it2 = this.f10488a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f10491b) {
                next.f10490a.c(this.f10489b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(Fragment fragment, boolean z11) {
        Fragment A0 = this.f10489b.A0();
        if (A0 != null) {
            A0.getParentFragmentManager().z0().d(fragment, true);
        }
        Iterator<a> it2 = this.f10488a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f10491b) {
                next.f10490a.d(this.f10489b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(Fragment fragment, boolean z11) {
        Fragment A0 = this.f10489b.A0();
        if (A0 != null) {
            A0.getParentFragmentManager().z0().e(fragment, true);
        }
        Iterator<a> it2 = this.f10488a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f10491b) {
                next.f10490a.e(this.f10489b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f(Fragment fragment, boolean z11) {
        Fragment A0 = this.f10489b.A0();
        if (A0 != null) {
            A0.getParentFragmentManager().z0().f(fragment, true);
        }
        Iterator<a> it2 = this.f10488a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f10491b) {
                next.f10490a.f(this.f10489b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(Fragment fragment, boolean z11) {
        Context f11 = this.f10489b.x0().f();
        Fragment A0 = this.f10489b.A0();
        if (A0 != null) {
            A0.getParentFragmentManager().z0().g(fragment, true);
        }
        Iterator<a> it2 = this.f10488a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f10491b) {
                next.f10490a.g(this.f10489b, fragment, f11);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h(Fragment fragment, Bundle bundle, boolean z11) {
        Fragment A0 = this.f10489b.A0();
        if (A0 != null) {
            A0.getParentFragmentManager().z0().h(fragment, bundle, true);
        }
        Iterator<a> it2 = this.f10488a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f10491b) {
                next.f10490a.h(this.f10489b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i(Fragment fragment, boolean z11) {
        Fragment A0 = this.f10489b.A0();
        if (A0 != null) {
            A0.getParentFragmentManager().z0().i(fragment, true);
        }
        Iterator<a> it2 = this.f10488a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f10491b) {
                next.f10490a.i(this.f10489b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j(Fragment fragment, Bundle bundle, boolean z11) {
        Fragment A0 = this.f10489b.A0();
        if (A0 != null) {
            A0.getParentFragmentManager().z0().j(fragment, bundle, true);
        }
        Iterator<a> it2 = this.f10488a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f10491b) {
                next.f10490a.j(this.f10489b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k(Fragment fragment, boolean z11) {
        Fragment A0 = this.f10489b.A0();
        if (A0 != null) {
            A0.getParentFragmentManager().z0().k(fragment, true);
        }
        Iterator<a> it2 = this.f10488a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f10491b) {
                next.f10490a.k(this.f10489b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l(Fragment fragment, boolean z11) {
        Fragment A0 = this.f10489b.A0();
        if (A0 != null) {
            A0.getParentFragmentManager().z0().l(fragment, true);
        }
        Iterator<a> it2 = this.f10488a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f10491b) {
                next.f10490a.l(this.f10489b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void m(Fragment fragment, View view, Bundle bundle, boolean z11) {
        Fragment A0 = this.f10489b.A0();
        if (A0 != null) {
            A0.getParentFragmentManager().z0().m(fragment, view, bundle, true);
        }
        Iterator<a> it2 = this.f10488a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f10491b) {
                next.f10490a.m(this.f10489b, fragment, view, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void n(Fragment fragment, boolean z11) {
        Fragment A0 = this.f10489b.A0();
        if (A0 != null) {
            A0.getParentFragmentManager().z0().n(fragment, true);
        }
        Iterator<a> it2 = this.f10488a.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (!z11 || next.f10491b) {
                next.f10490a.n(this.f10489b, fragment);
            }
        }
    }

    public void o(FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z11) {
        this.f10488a.add(new a(fragmentLifecycleCallbacks, z11));
    }

    public void p(FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        synchronized (this.f10488a) {
            int i11 = 0;
            int size = this.f10488a.size();
            while (true) {
                if (i11 >= size) {
                    break;
                } else if (this.f10488a.get(i11).f10490a == fragmentLifecycleCallbacks) {
                    this.f10488a.remove(i11);
                    break;
                } else {
                    i11++;
                }
            }
        }
    }
}
