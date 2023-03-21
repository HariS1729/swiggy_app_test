package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.l0;
import g3.a;
import in.swiggy.android.tejas.network.HttpRequest;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.p;
import n3.b;
import n3.d;

/* compiled from: SavedStateViewModelFactory.kt */
public final class f0 extends l0.d implements l0.b {

    /* renamed from: b  reason: collision with root package name */
    private Application f10733b;

    /* renamed from: c  reason: collision with root package name */
    private final l0.b f10734c;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f10735d;

    /* renamed from: e  reason: collision with root package name */
    private Lifecycle f10736e;

    /* renamed from: f  reason: collision with root package name */
    private b f10737f;

    @SuppressLint({"LambdaLast"})
    public f0(Application application, d dVar, Bundle bundle) {
        l0.a aVar;
        p.j(dVar, "owner");
        this.f10737f = dVar.getSavedStateRegistry();
        this.f10736e = dVar.getLifecycle();
        this.f10735d = bundle;
        this.f10733b = application;
        if (application != null) {
            aVar = l0.a.f10756f.b(application);
        } else {
            aVar = new l0.a();
        }
        this.f10734c = aVar;
    }

    public <T extends j0> T a(Class<T> cls) {
        p.j(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends j0> T b(Class<T> cls, a aVar) {
        Constructor<T> constructor;
        p.j(cls, "modelClass");
        p.j(aVar, "extras");
        String str = (String) aVar.a(l0.c.f10765d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (aVar.a(SavedStateHandleSupport.f10689a) != null && aVar.a(SavedStateHandleSupport.f10690b) != null) {
            Application application = (Application) aVar.a(l0.a.f10758h);
            boolean isAssignableFrom = a.class.isAssignableFrom(cls);
            if (!isAssignableFrom || application == null) {
                constructor = g0.c(cls, g0.f10739b);
            } else {
                constructor = g0.c(cls, g0.f10738a);
            }
            if (constructor == null) {
                return this.f10734c.b(cls, aVar);
            }
            if (!isAssignableFrom || application == null) {
                return g0.d(cls, constructor, SavedStateHandleSupport.a(aVar));
            }
            return g0.d(cls, constructor, application, SavedStateHandleSupport.a(aVar));
        } else if (this.f10736e != null) {
            return d(str, cls);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    public void c(j0 j0Var) {
        p.j(j0Var, "viewModel");
        Lifecycle lifecycle = this.f10736e;
        if (lifecycle != null) {
            LegacySavedStateHandleController.a(j0Var, this.f10737f, lifecycle);
        }
    }

    public final <T extends j0> T d(String str, Class<T> cls) {
        Constructor<T> constructor;
        T t;
        Application application;
        p.j(str, HttpRequest.HEADER_KEY);
        p.j(cls, "modelClass");
        if (this.f10736e != null) {
            boolean isAssignableFrom = a.class.isAssignableFrom(cls);
            if (!isAssignableFrom || this.f10733b == null) {
                constructor = g0.c(cls, g0.f10739b);
            } else {
                constructor = g0.c(cls, g0.f10738a);
            }
            if (constructor != null) {
                SavedStateHandleController b11 = LegacySavedStateHandleController.b(this.f10737f, this.f10736e, str, this.f10735d);
                if (!isAssignableFrom || (application = this.f10733b) == null) {
                    d0 c11 = b11.c();
                    p.i(c11, "controller.handle");
                    t = g0.d(cls, constructor, c11);
                } else {
                    p.g(application);
                    d0 c12 = b11.c();
                    p.i(c12, "controller.handle");
                    t = g0.d(cls, constructor, application, c12);
                }
                t.j1("androidx.lifecycle.savedstate.vm.tag", b11);
                return t;
            } else if (this.f10733b != null) {
                return this.f10734c.a(cls);
            } else {
                return l0.c.f10763b.a().a(cls);
            }
        } else {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }
}
