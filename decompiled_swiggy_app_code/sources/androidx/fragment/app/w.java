package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.f0;
import androidx.lifecycle.j;
import androidx.lifecycle.k;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.lifecycle.t;
import g3.a;
import n3.b;
import n3.c;
import n3.d;

/* compiled from: FragmentViewLifecycleOwner */
class w implements k, d, p0 {

    /* renamed from: a  reason: collision with root package name */
    private final Fragment f10606a;

    /* renamed from: b  reason: collision with root package name */
    private final o0 f10607b;

    /* renamed from: c  reason: collision with root package name */
    private l0.b f10608c;

    /* renamed from: d  reason: collision with root package name */
    private t f10609d = null;

    /* renamed from: e  reason: collision with root package name */
    private c f10610e = null;

    w(Fragment fragment, o0 o0Var) {
        this.f10606a = fragment;
        this.f10607b = o0Var;
    }

    /* access modifiers changed from: package-private */
    public void a(Lifecycle.Event event) {
        this.f10609d.h(event);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f10609d == null) {
            this.f10609d = new t(this);
            this.f10610e = c.a(this);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.f10609d != null;
    }

    /* access modifiers changed from: package-private */
    public void d(Bundle bundle) {
        this.f10610e.d(bundle);
    }

    /* access modifiers changed from: package-private */
    public void e(Bundle bundle) {
        this.f10610e.e(bundle);
    }

    /* access modifiers changed from: package-private */
    public void f(Lifecycle.State state) {
        this.f10609d.o(state);
    }

    public /* synthetic */ a getDefaultViewModelCreationExtras() {
        return j.a(this);
    }

    public l0.b getDefaultViewModelProviderFactory() {
        l0.b defaultViewModelProviderFactory = this.f10606a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f10606a.mDefaultFactory)) {
            this.f10608c = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f10608c == null) {
            Application application = null;
            Context context = this.f10606a.requireContext().getApplicationContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof Application) {
                    application = (Application) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            this.f10608c = new f0(application, this, this.f10606a.getArguments());
        }
        return this.f10608c;
    }

    public Lifecycle getLifecycle() {
        b();
        return this.f10609d;
    }

    public b getSavedStateRegistry() {
        b();
        return this.f10610e.b();
    }

    public o0 getViewModelStore() {
        b();
        return this.f10607b;
    }
}
