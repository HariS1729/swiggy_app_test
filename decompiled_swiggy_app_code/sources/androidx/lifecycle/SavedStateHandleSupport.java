package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.l0;
import g3.a;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import n3.b;
import n3.d;

/* compiled from: SavedStateHandleSupport.kt */
public final class SavedStateHandleSupport {

    /* renamed from: a  reason: collision with root package name */
    public static final a.b<d> f10689a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final a.b<p0> f10690b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final a.b<Bundle> f10691c = new a();

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class a implements a.b<Bundle> {
        a() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class b implements a.b<d> {
        b() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class c implements a.b<p0> {
        c() {
        }
    }

    public static final d0 a(g3.a aVar) {
        p.j(aVar, "<this>");
        d dVar = (d) aVar.a(f10689a);
        if (dVar != null) {
            p0 p0Var = (p0) aVar.a(f10690b);
            if (p0Var != null) {
                Bundle bundle = (Bundle) aVar.a(f10691c);
                String str = (String) aVar.a(l0.c.f10765d);
                if (str != null) {
                    return b(dVar, p0Var, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    private static final d0 b(d dVar, p0 p0Var, String str, Bundle bundle) {
        SavedStateHandlesProvider d11 = d(dVar);
        e0 e11 = e(p0Var);
        d0 d0Var = e11.k1().get(str);
        if (d0Var != null) {
            return d0Var;
        }
        d0 a11 = d0.f10719f.a(d11.a(str), bundle);
        e11.k1().put(str, a11);
        return a11;
    }

    public static final <T extends d & p0> void c(T t) {
        p.j(t, "<this>");
        Lifecycle.State b11 = t.getLifecycle().b();
        p.i(b11, "lifecycle.currentState");
        if (!(b11 == Lifecycle.State.INITIALIZED || b11 == Lifecycle.State.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (t.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(t.getSavedStateRegistry(), (p0) t);
            t.getSavedStateRegistry().h("androidx.lifecycle.internal.SavedStateHandlesProvider", savedStateHandlesProvider);
            t.getLifecycle().a(new SavedStateHandleAttacher(savedStateHandlesProvider));
        }
    }

    public static final SavedStateHandlesProvider d(d dVar) {
        p.j(dVar, "<this>");
        b.c c11 = dVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        SavedStateHandlesProvider savedStateHandlesProvider = c11 instanceof SavedStateHandlesProvider ? (SavedStateHandlesProvider) c11 : null;
        if (savedStateHandlesProvider != null) {
            return savedStateHandlesProvider;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final e0 e(p0 p0Var) {
        Class cls = e0.class;
        p.j(p0Var, "<this>");
        g3.c cVar = new g3.c();
        cVar.a(s.b(cls), SavedStateHandleSupport$savedStateHandlesVM$1$1.f10692a);
        return (e0) new l0(p0Var, cVar.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", cls);
    }
}
